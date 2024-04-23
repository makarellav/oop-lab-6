package gg.jte.generated.ondemand.toys;
import dto.ToysPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "toys/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,4,4,7,7,9,9,11,11,24,24,26,26,26,27,27,27,27,27,27,27,28,28,28,29,29,29,30,30,30,31,31,31,33,33,36,36,37,37,37,37,37,37,37,37,37,37,37,38,38,38,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToysPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JteindexGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <a class=\"btn btn-primary mb-4\" href=\"/toys/create\">Create a toy</a>\n    ");
				if (page.toys().isEmpty()) {
					jteOutput.writeContent("\n        <p class=\"fs-4\">Oops, nothing to see here... yet!</p>\n    ");
				} else {
					jteOutput.writeContent("\n        <table class=\"table\">\n            <thead>\n            <tr>\n                <th scope=\"col\">#</th>\n                <th scope=\"col\">Name</th>\n                <th scope=\"col\">Price</th>\n                <th scope=\"col\">Size</th>\n                <th scope=\"col\">Age group</th>\n                <th scope=\"col\">Description</th>\n            </tr>\n            </thead>\n            <tbody class=\"table-group-divider\">\n            ");
					for (var toy : page.toys()) {
						jteOutput.writeContent("\n                <tr>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(toy.getId());
						jteOutput.writeContent("</td>\n                    <td><a href=\"/toys/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(toy.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(toy.getName());
						jteOutput.writeContent("</a></td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(toy.getPrice());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(toy.getSize());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(toy.getAgeGroup());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(toy.getDescription());
						jteOutput.writeContent("</td>\n                </tr>\n            ");
					}
					jteOutput.writeContent("\n            </tbody>\n        </table>\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("Toys");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("All Toys");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToysPage page = (ToysPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
