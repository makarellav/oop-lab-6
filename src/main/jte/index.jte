@import gg.jte.Content

@param Content main
@param Content title
@param Content heading

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>
        @if(title != null)
            ${title}
        @else
            Test
        @endif
    </title>
</head>
<body>
<nav class="navbar bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand h1 mb-0 text-white" href="/">Toyroom</a>
    </div>
</nav>
<main class="container py-4">
    <h1 class="mb-4">${heading}</h1>
    ${main}
</main>
</body>
</html>
