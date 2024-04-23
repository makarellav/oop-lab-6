@import model.Toy

@param Toy toy

@template.index(main = @`
    <div class="card">
        <div class="card-body">
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><span class="fw-bold">ID:</span> ${toy.getId()}</li>
                <li class="list-group-item"><span class="fw-bold">Name:</span> ${toy.getName()}</li>
                <li class="list-group-item"><span class="fw-bold">Price:</span> $${toy.getPrice()}</li>
                <li class="list-group-item"><span class="fw-bold">Size:</span> ${toy.getSize()}</li>
                <li class="list-group-item"><span class="fw-bold">Age group:</span> ${toy.getAgeGroup()}</li>
                <li class="list-group-item"><span class="fw-bold">Description:</span> ${toy.getDescription()}</li>
            </ul>
        </div>
        <div class="card-footer">
            <a class="btn btn-primary" href="/toys/${toy.getId()}/edit">Edit</a>
            <form class="d-inline" action="/toys/${toy.getId()}/delete" method="POST">
                <button class="btn btn-danger" type="submit">Delete</button>
            </form>
        </div>
    </div>
`, title = @`${toy.getName()}`, heading = @`${toy.getName()}`)
