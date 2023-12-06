package builderDesignPattern;

/**
 *
 * @author hp pavailion
 */
public class TodoBuilder {

    private int Id;
    private String title = "Title";
    private String description = "Description";
    private String status = "Pending";
    private boolean complate = false;

    public TodoBuilder withId(int id) {

        this.Id = id;
        return this;
    }

    public TodoBuilder title(String title) {
        this.title = title;
        return this;

    }

    public TodoBuilder description(String description) {
        this.description = description;
        return this;

    }

    public TodoBuilder status(String status) {
        this.status = status;
        return this;

    }

    public TodoBuilder complete(boolean complate) {
        this.complate = complate;
        return this;

    }

    public Todo build() {
        return new Todo(Id, title, description, status, complate);

    }

}
