package gg.jte.generated.ondemand;
import gg.jte.Content;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,16,16,16,17,17,17,18,18,20,20,30,30,30,31,31,31,35,35,35,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content main, Content title, Content heading) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\"\n          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n          integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n    <title>\n        ");
		if (title != null) {
			jteOutput.writeContent("\n            ");
			jteOutput.setContext("title", null);
			jteOutput.writeUserContent(title);
			jteOutput.writeContent("\n        ");
		} else {
			jteOutput.writeContent("\n            Test\n        ");
		}
		jteOutput.writeContent("\n    </title>\n</head>\n<body>\n<nav class=\"navbar bg-primary\">\n    <div class=\"container-fluid\">\n        <a class=\"navbar-brand h1 mb-0 text-white\" href=\"/\">Toyroom</a>\n    </div>\n</nav>\n<main class=\"container py-4\">\n    <h1 class=\"mb-4\">");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(heading);
		jteOutput.writeContent("</h1>\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(main);
		jteOutput.writeContent("\n</main>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content main = (Content)params.get("main");
		Content title = (Content)params.get("title");
		Content heading = (Content)params.get("heading");
		render(jteOutput, jteHtmlInterceptor, main, title, heading);
	}
}
