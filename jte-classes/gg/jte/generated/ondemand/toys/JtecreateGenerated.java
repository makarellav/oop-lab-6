package gg.jte.generated.ondemand.toys;
import io.javalin.validation.ValidationError;
import java.util.List;
import java.util.Map;
public final class JtecreateGenerated {
	public static final String JTE_NAME = "toys/create.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,6,6,7,7,12,12,12,12,14,14,16,16,16,18,18,22,22,22,22,23,23,25,25,26,26,26,27,27,29,29,31,31,35,35,35,35,46,46,48,48,48,50,50,54,54,54,54,71,71,73,73,73,75,75,79,79,79,79,80,80,82,82,82,84,84,89,89,89,89,89,89,89,89,89,89,89,89,89,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Map<String, List<ValidationError<Object>>> errors) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.JteindexGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"row\">\n        <form class=\"col-4\" action=\"/toys/create\" method=\"POST\" novalidate>\n            <div class=\"mb-3\">\n                <label for=\"name\" class=\"form-label fw-bold\">Name:</label>\n                <input type=\"text\" class=\"form-control");
				if (errors != null && errors.containsKey("name")) {
					jteOutput.writeContent(" is-invalid");
				}
				jteOutput.writeContent("\" id=\"name\" placeholder=\"Name...\" name=\"name\"\n                >\n                ");
				if (errors != null && errors.containsKey("name")) {
					jteOutput.writeContent("\n                    <div class=\"invalid-feedback\">\n                        ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(errors.get("name").getFirst().getMessage());
					jteOutput.writeContent("\n                    </div>\n                ");
				}
				jteOutput.writeContent("\n            </div>\n            <div class=\"mb-3\">\n                <label for=\"price\" class=\"form-label fw-bold\">Price:</label>\n                <input type=\"number\" class=\"form-control");
				if (errors != null && errors.containsKey("price")) {
					jteOutput.writeContent(" is-invalid");
				}
				jteOutput.writeContent("\" id=\"price\" placeholder=\"Price...\" name=\"price\">\n                ");
				if (errors != null && errors.containsKey("price")) {
					jteOutput.writeContent("\n                    <div class=\"invalid-feedback\">\n                    ");
					if (!errors.get("price").getFirst().getMessage().equals("TYPE_CONVERSION_FAILED")) {
						jteOutput.writeContent("\n                        ");
						jteOutput.setContext("div", null);
						jteOutput.writeUserContent(errors.get("price").getFirst().getMessage());
						jteOutput.writeContent("\n                    ");
					} else {
						jteOutput.writeContent("\n                        Price is required\n                    ");
					}
					jteOutput.writeContent("\n                    </div>\n                ");
				}
				jteOutput.writeContent("\n            </div>\n            <div class=\"mb-3\">\n                <label for=\"size\" class=\"form-label fw-bold\">Size:</label>\n                <select name=\"size\" id=\"size\" class=\"form-select");
				if (errors != null && errors.containsKey("size")) {
					jteOutput.writeContent(" is-invalid");
				}
				jteOutput.writeContent("\">\n                    <option value=\"Small\" selected>\n                        Small\n                    </option>\n                    <option value=\"Medium\">\n                        Medium\n                    </option>\n                    <option value=\"Large\">\n                        Large\n                    </option>\n                </select>\n                ");
				if (errors != null && errors.containsKey("size")) {
					jteOutput.writeContent("\n                    <div class=\"invalid-feedback\">\n                        ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(errors.get("size").getFirst().getMessage());
					jteOutput.writeContent("\n                    </div>\n                ");
				}
				jteOutput.writeContent("\n            </div>\n            <div class=\"mb-3\">\n                <label for=\"ageGroup\" class=\"form-label fw-bold\">Age group:</label>\n                <select name=\"ageGroup\" id=\"size\" class=\"form-select");
				if (errors != null && errors.containsKey("ageGroup")) {
					jteOutput.writeContent(" is-invalid");
				}
				jteOutput.writeContent("\">\n                    <option value=\"0+\" selected>\n                        0+\n                    </option>\n                    <option value=\"3+\">\n                        3+\n                    </option>\n                    <option value=\"6+\">\n                        6+\n                    </option>\n                    <option value=\"12+\">\n                        12+\n                    </option>\n                    <option value=\"18+\">\n                        18+\n                    </option>\n                </select>\n                ");
				if (errors != null && errors.containsKey("ageGroup")) {
					jteOutput.writeContent("\n                    <div class=\"invalid-feedback\">\n                        ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(errors.get("ageGroup").getFirst().getMessage());
					jteOutput.writeContent("\n                    </div>\n                ");
				}
				jteOutput.writeContent("\n            </div>\n            <div class=\"mb-3\">\n                <label for=\"description\" class=\"form-label fw-bold\">Description:</label>\n                <textarea name=\"description\" id=\"description\" class=\"form-control");
				if (errors != null && errors.containsKey("description")) {
					jteOutput.writeContent(" is-invalid");
				}
				jteOutput.writeContent("\"></textarea>\n                ");
				if (errors != null && errors.containsKey("description")) {
					jteOutput.writeContent("\n                    <div class=\"invalid-feedback\">\n                        ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(errors.get("description").getFirst().getMessage());
					jteOutput.writeContent("\n                    </div>\n                ");
				}
				jteOutput.writeContent("\n            </div>\n            <button class=\"btn btn-primary\" type=\"submit\">Create</button>\n            <a class=\"btn btn-danger\" href=\"/\">Cancel</a>\n        </form>\n    </div>");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("New Toy");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("New Toy");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Map<String, List<ValidationError<Object>>> errors = (Map<String, List<ValidationError<Object>>>)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, errors);
	}
}
