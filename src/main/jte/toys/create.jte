@import io.javalin.validation.ValidationError
@import java.util.List
@import java.util.Map

@param Map<String, List<ValidationError<Object>>> errors

@template.index(main = @`
    <div class="row">
        <form class="col-4" action="/toys/create" method="POST" novalidate>
            <div class="mb-3">
                <label for="name" class="form-label fw-bold">Name:</label>
                <input type="text" class="form-control@if(errors != null && errors.containsKey("name")) is-invalid@endif" id="name" placeholder="Name..." name="name"
                >
                @if(errors != null && errors.containsKey("name"))
                    <div class="invalid-feedback">
                        ${errors.get("name").getFirst().getMessage()}
                    </div>
                @endif
            </div>
            <div class="mb-3">
                <label for="price" class="form-label fw-bold">Price:</label>
                <input type="number" class="form-control@if(errors != null && errors.containsKey("price")) is-invalid@endif" id="price" placeholder="Price..." name="price">
                @if(errors != null && errors.containsKey("price"))
                    <div class="invalid-feedback">
                    @if(!errors.get("price").getFirst().getMessage().equals("TYPE_CONVERSION_FAILED"))
                        ${errors.get("price").getFirst().getMessage()}
                    @else
                        Price is required
                    @endif
                    </div>
                @endif
            </div>
            <div class="mb-3">
                <label for="size" class="form-label fw-bold">Size:</label>
                <select name="size" id="size" class="form-select@if(errors != null && errors.containsKey("size")) is-invalid@endif">
                    <option value="Small" selected>
                        Small
                    </option>
                    <option value="Medium">
                        Medium
                    </option>
                    <option value="Large">
                        Large
                    </option>
                </select>
                @if(errors != null && errors.containsKey("size"))
                    <div class="invalid-feedback">
                        ${errors.get("size").getFirst().getMessage()}
                    </div>
                @endif
            </div>
            <div class="mb-3">
                <label for="ageGroup" class="form-label fw-bold">Age group:</label>
                <select name="ageGroup" id="size" class="form-select@if(errors != null && errors.containsKey("ageGroup")) is-invalid@endif">
                    <option value="0+" selected>
                        0+
                    </option>
                    <option value="3+">
                        3+
                    </option>
                    <option value="6+">
                        6+
                    </option>
                    <option value="12+">
                        12+
                    </option>
                    <option value="18+">
                        18+
                    </option>
                </select>
                @if(errors != null && errors.containsKey("ageGroup"))
                    <div class="invalid-feedback">
                        ${errors.get("ageGroup").getFirst().getMessage()}
                    </div>
                @endif
            </div>
            <div class="mb-3">
                <label for="description" class="form-label fw-bold">Description:</label>
                <textarea name="description" id="description" class="form-control@if(errors != null && errors.containsKey("description")) is-invalid@endif"></textarea>
                @if(errors != null && errors.containsKey("description"))
                    <div class="invalid-feedback">
                        ${errors.get("description").getFirst().getMessage()}
                    </div>
                @endif
            </div>
            <button class="btn btn-primary" type="submit">Create</button>
            <a class="btn btn-danger" href="/">Cancel</a>
        </form>
    </div>`,
title = @`New Toy`, heading = @`New Toy`)