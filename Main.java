package project4;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        View view = new View();
        Model model = new Model();
        Control control = new Control(model,view);
        view.setVisible(true);
        view.setTitle("Zoologistics");
    }
}
