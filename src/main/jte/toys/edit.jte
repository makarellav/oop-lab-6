@import model.Toy

@param Toy toy

@template.index(main = @`
    <div class="row">
        <form class="col-4" action="/toys/${toy.getId()}/edit" method="POST" novalidate>
            <div class="mb-3">
                <label for="name" class="form-label fw-bold">Name:</label>
                <input type="text" class="form-control" id="name" placeholder="Name..." name="name" value="${toy.getName()}">
            </div>
            <div class="mb-3">
                <label for="price" class="form-label fw-bold">Price:</label>
                <input type="text" class="form-control" id="price" placeholder="Price..." name="price" value="${toy.getPrice()}">
            </div>
            <div class="mb-3">
                <label for="size" class="form-label fw-bold">Size:</label>
                <select name="size" id="size" class="form-select">
                    <option value="Small" selected="${toy.getSize().equals("Small")}">
                        Small
                    </option>
                    <option value="Medium" selected="${toy.getSize().equals("Medium")}">
                        Medium
                    </option>
                    <option value="Large" selected="${toy.getSize().equals("Large")}">
                        Large
                    </option>
                </select>
            </div>
            <div class="mb-3">
                <label for="ageGroup" class="form-label fw-bold">Age group:</label>
                <select name="ageGroup" id="size" class="form-select">
                    <option value="0+" selected="${toy.getAgeGroup().equals("0+")}">
                        0+
                    </option>
                    <option value="3+" selected="${toy.getAgeGroup().equals("3+")}">
                        3+
                    </option>
                    <option value="6+" selected="${toy.getSize().equals("6+")}">
                        6+
                    </option>
                    <option value="12+" selected="${toy.getSize().equals("12+")}">
                        12+
                    </option>
                    <option value="18+" selected="${toy.getSize().equals("18+")}">
                        18+
                    </option>
                </select>
            </div>
            <div class="mb-3">
                <label for="description" class="form-label fw-bold">Description:</label>
                <textarea name="description" id="description" class="form-control">${toy.getDescription()}</textarea>
            </div>
            <button class="btn btn-primary" type="submit">Update</button>
            <a class="btn btn-danger" href="/toys/${toy.getId()}">Cancel</a>
        </form>
    </div>`,
title = @`Edit ${toy.getName()}`, heading = @`Edit ${toy.getName()}`)