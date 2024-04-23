@import dto.ToysPage

@param ToysPage page

@template.index(
main = @`
    <a class="btn btn-primary mb-4" href="/toys/create">Create a toy</a>
    @if (page.toys().isEmpty())
        <p class="fs-4">Oops, nothing to see here... yet!</p>
    @else
        <table class="table">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Price</th>
                <th scope="col">Size</th>
                <th scope="col">Age group</th>
                <th scope="col">Description</th>
            </tr>
            </thead>
            <tbody class="table-group-divider">
            @for (var toy : page.toys())
                <tr>
                    <td>${toy.getId()}</td>
                    <td><a href="/toys/${toy.getId()}">${toy.getName()}</a></td>
                    <td>${toy.getPrice()}</td>
                    <td>${toy.getSize()}</td>
                    <td>${toy.getAgeGroup()}</td>
                    <td>${toy.getDescription()}</td>
                </tr>
            @endfor
            </tbody>
        </table>
    @endif
`,
title = @`Toys`,
heading = @`All Toys`)
