public class Jogo extends Midia {
    private String console;
    
    public void setConsole(String console) {
        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    @Override
    public String toString() {
        return String.format("Console: %s\n", getConsole());
    }

}
