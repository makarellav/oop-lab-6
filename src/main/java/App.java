import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import controller.ToyController;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import repository.BaseRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws SQLException {
        var hikaruConfig = new HikariConfig();
        hikaruConfig.setJdbcUrl("jdbc:h2:mem:lab_7;DB_CLOSE_DELAY=-1");

        var ds = new HikariDataSource(hikaruConfig);

        var url = App.class.getClassLoader().getResourceAsStream("schema.sql");
        var sql = new BufferedReader(new InputStreamReader(url)).lines().collect(Collectors.joining("\n"));

        try (var conn = ds.getConnection(); var stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
        BaseRepository.dataSource = ds;

        var app = Javalin.create(config -> config.fileRenderer(new JavalinJte()));

        app.get("/", ToyController::index);
        app.get("/toys/create", ToyController::createPage);
        app.post("/toys/create", ToyController::create);
        app.get("/toys/{id}", ToyController::toyPage);
        app.get("/toys/{id}/edit", ToyController::editPage);
        app.post("/toys/{id}/edit", ToyController::edit);
        app.post("/toys/{id}/delete", ToyController::delete);

        app.start(7070);
    }
}
