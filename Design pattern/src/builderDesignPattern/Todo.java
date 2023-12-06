package builderDesignPattern;

/**
 *
 * @author hp pavailion
 */
public class Todo {

    private int Id;
    private String title;
    private String description;
    private String status;
    private boolean complate;

    public Todo(int id) {
        this.Id = id;
    }

    public Todo(int id, String title, String description, String status, boolean complate) {

        this.Id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.complate = complate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isComplate() {
        return complate;
    }

    public void setComplate(boolean complate) {
        this.complate = complate;
    }

    @Override
    public String toString() {

        return String.format("{ Todo:%d,\n \t{ title: %s},\n \t{ description: %s},\n \t{ status: %s},\n \t{completed: %b}\n}", Id, title, description, status, complate);

    }

}
