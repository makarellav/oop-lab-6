package controller;

import dto.ToysPage;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;
import io.javalin.validation.ValidationException;
import model.Toy;
import repository.ToyRepository;
import utils.Utils;

import java.sql.SQLException;

import static io.javalin.rendering.template.TemplateUtil.model;
import static java.lang.StringTemplate.STR;

public class ToyController {
    public static void index(Context ctx) throws SQLException {
        try {
            var toys = ToyRepository.findAll();

            var page = new ToysPage(toys);
            ctx.render("toys/index.jte", model("page", page));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ctx.result("ERROR");
        }
    }

    public static void toyPage(Context ctx) throws SQLException {
        try {
            var id = ctx.pathParamAsClass("id", Long.class).get();

            var toy = ToyRepository.find(id).orElseThrow(() -> new NotFoundResponse("Not found"));
            ctx.render("toys/show.jte", model("toy", toy));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ctx.result("ERROR");
        }
    }

    public static void editPage(Context ctx) throws SQLException {
        try {
            var id = ctx.pathParamAsClass("id", Long.class).get();

            var toy = ToyRepository.find(id).orElseThrow(() -> new NotFoundResponse("Not found"));
            ctx.render("toys/edit.jte", model("toy", toy));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ctx.result("ERROR");
        }
    }

    public static void edit(Context ctx) throws SQLException {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var name = ctx.formParam("name").trim();
        var price = ctx.formParamAsClass("price", Double.class).get();
        var size = ctx.formParam("size");
        var ageGroup = ctx.formParam("ageGroup");
        var description = ctx.formParam("description").trim();

        var toy = new Toy(id, name, price, description, size, ageGroup);

        ToyRepository.update(toy);

        ctx.redirect("/toys/" + id);
    }

    public static void createPage(Context ctx) {
        ctx.render("toys/create.jte");
    }

    public static void create(Context ctx) throws SQLException {
        try {
            var name = ctx.formParamAsClass("name", String.class)
                    .check(value -> !value.isBlank(), "Name is required")
                    .check(value -> value.length() > 2, "Name must be at least 2 characters long")
                    .check(value -> value.length() < 100, "Name must be at most 100 characters long")
                    .get();

            var price = ctx.formParamAsClass("price", Double.class)
                    .check(value -> !value.isNaN(), "Price is required")
                    .check(value -> value >= 0, "Price must be greater than 0")
                    .get();

            var size = ctx.formParamAsClass("size", String.class)
                    .check(value -> Utils.allowedSizes.contains(value), STR."Allowed sizes are: \{String.join(", ", Utils.allowedSizes)}")
                    .get();

            var ageGroup = ctx.formParamAsClass("ageGroup", String.class)
                    .check(value -> Utils.allowedAgeGroups.contains(value), STR."Allowed age groups are: \{String.join(", ", Utils.allowedAgeGroups)}")
                    .get();

            var description = ctx.formParamAsClass("description", String.class)
                    .check(value -> !value.isBlank(), "Description is required")
                    .get();

            var toy = new Toy(name, price, description, size, ageGroup);

            var toyId = ToyRepository.create(toy);

            ctx.redirect(STR."/toys/\{toyId}");
        } catch (ValidationException e) {
            ctx.render("toys/create.jte", model("errors", e.getErrors()));
        }
    }

    public static void delete(Context ctx) throws SQLException {
        var id = ctx.pathParamAsClass("id", Long.class).get();

        ToyRepository.delete(id);

        ctx.redirect("/");
    }
}
