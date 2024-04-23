package repository;

import model.Toy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToyRepository extends BaseRepository {
    public static List<Toy> findAll() throws SQLException {
        var query = "SELECT * FROM toys";

        try (var conn = dataSource.getConnection()) {
            var stmt = conn.prepareStatement(query);

            var result = stmt.executeQuery();

            var toys = new ArrayList<Toy>();

            while (result.next()) {
                var id = result.getLong("id");
                var name = result.getString("name");
                var price = result.getDouble("price");
                var description = result.getString("description");
                var size = result.getString("size");
                var ageGroup = result.getString("age_group");

                var toy = new Toy(id, name, price, description, size, ageGroup);

                toys.add(toy);
            }

            return toys;
        }
    }

    public static Optional<Toy> find(long id) throws SQLException {
        var query = "SELECT * FROM toys WHERE id = ?";

        try (var conn = dataSource.getConnection()) {
            var stmt = conn.prepareStatement(query);
            stmt.setLong(1, id);

            var result = stmt.executeQuery();

            if (result.next()) {
                var toyId = result.getLong("id");
                var name = result.getString("name");
                var price = result.getDouble("price");
                var description = result.getString("description");
                var size = result.getString("size");
                var ageGroup = result.getString("age_group");

                var toy = new Toy(toyId, name, price, description, size, ageGroup);

                return Optional.of(toy);
            }

            return Optional.empty();
        }
    }

    public static void update(Toy toy) throws SQLException {
        var query = "UPDATE toys SET id = ?, name = ?, price = ?, size = ?, age_group = ?, description = ? WHERE id = ?";

        try (var conn = dataSource.getConnection()) {
            var stmt = conn.prepareStatement(query);

            stmt.setLong(1, toy.getId());
            stmt.setString(2, toy.getName());
            stmt.setDouble(3, toy.getPrice());
            stmt.setString(4, toy.getSize());
            stmt.setString(5, toy.getAgeGroup());
            stmt.setString(6, toy.getDescription());
            stmt.setLong(7, toy.getId());

            stmt.executeUpdate();
        }
    }

    public static long create(Toy toy) throws SQLException {
        var query = "SELECT id FROM FINAL TABLE (INSERT INTO toys(name, price, description, size, age_group) VALUES (?, ?, ?, ?, ?))";

        try (var conn = dataSource.getConnection()) {
            var stmt = conn.prepareStatement(query);

            stmt.setString(1, toy.getName());
            stmt.setDouble(2, toy.getPrice());
            stmt.setString(3, toy.getDescription());
            stmt.setString(4, toy.getSize());
            stmt.setString(5, toy.getAgeGroup());

            var result = stmt.executeQuery();

            if (result.next()) {
                return result.getLong("id");
            }
        }

        return -1;
    }

    public static void delete(long id) throws SQLException {
        var query = "DELETE FROM toys WHERE id = ?";

        try (var conn = dataSource.getConnection()) {
            var stmt = conn.prepareStatement(query);
            stmt.setLong(1, id);

            stmt.executeUpdate();
        }
    }
}
