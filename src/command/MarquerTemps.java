package command;

import controller.Controller;

public class MarquerTemps implements Command{
    private Controller controller;

    public MarquerTemps(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        this.controller.marquerTemps();
    }
}
