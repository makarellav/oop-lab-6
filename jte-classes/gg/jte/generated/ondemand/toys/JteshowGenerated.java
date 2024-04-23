package gg.jte.generated.ondemand.toys;
import model.Toy;
public final class JteshowGenerated {
	public static final String JTE_NAME = "toys/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,4,4,8,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,13,13,17,17,17,17,18,18,18,18,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Toy toy) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JteindexGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"card\">\n        <div class=\"card-body\">\n            <ul class=\"list-group list-group-flush\">\n                <li class=\"list-group-item\"><span class=\"fw-bold\">ID:</span> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getId());
				jteOutput.writeContent("</li>\n                <li class=\"list-group-item\"><span class=\"fw-bold\">Name:</span> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getName());
				jteOutput.writeContent("</li>\n                <li class=\"list-group-item\"><span class=\"fw-bold\">Price:</span> $");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getPrice());
				jteOutput.writeContent("</li>\n                <li class=\"list-group-item\"><span class=\"fw-bold\">Size:</span> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getSize());
				jteOutput.writeContent("</li>\n                <li class=\"list-group-item\"><span class=\"fw-bold\">Age group:</span> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getAgeGroup());
				jteOutput.writeContent("</li>\n                <li class=\"list-group-item\"><span class=\"fw-bold\">Description:</span> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(toy.getDescription());
				jteOutput.writeContent("</li>\n            </ul>\n        </div>\n        <div class=\"card-footer\">\n            <a class=\"btn btn-primary\" href=\"/toys/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(toy.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("/edit\">Edit</a>\n            <form class=\"d-inline\" action=\"/toys/");
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(toy.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeContent("/delete\" method=\"POST\">\n                <button class=\"btn btn-danger\" type=\"submit\">Delete</button>\n            </form>\n        </div>\n    </div>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.setContext("html", null);
				jteOutput.writeUserContent(toy.getName());
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.setContext("html", null);
				jteOutput.writeUserContent(toy.getName());
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Toy toy = (Toy)params.get("toy");
		render(jteOutput, jteHtmlInterceptor, toy);
	}
}
