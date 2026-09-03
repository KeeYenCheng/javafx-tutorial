public class Duke {

    private String commandType;


    public static void main(String[] args) {
        System.out.println("hello"); 
    }

    public String getResponse(String input) {
        String[] args = input.split(" ");
        this.commandType = args[0];
        
        return "Duke heard: " + input;

    }

    public String getCommandType() {
        return commandType;
    }
}
