package builderDesignPattern;

/**
 *
 * @author hp pavailion
 */
public class TodoDirect {

    Todo[] todos = new Todo[100];

    public TodoDirect() {
        todos[0] = new TodoBuilder().withId(1)
                .title("Login sprint")
                .description("Login, Logout, Forgot Password, and Reset Password ...")
                .status("started")
                .complete(false)
                .build();

        todos[1] = new TodoBuilder().withId(2).build();

    }

    public void printTodos() {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] != null) {
                System.out.println(todos[i]);
            }
        }
    }
}
