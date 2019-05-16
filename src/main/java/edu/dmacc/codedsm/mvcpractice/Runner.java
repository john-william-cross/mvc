package edu.dmacc.codedsm.mvcpractice;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        TaskFileRepository repository = new DefaultTaskFileRepository();
        TaskService service = new DefaultTaskService(repository);
        TaskController controller = new DefaultTaskController(service);
        View firstView = controller.showInitialView();
        System.out.println(firstView.render());

        Scanner in = new Scanner(System.in);
        String fullInput = in.nextLine();
        System.out.println("full input = " + fullInput);
        fullInput.split(" ");
        String[] splitString = fullInput.split(" ");
        String firstName = splitString[0];
        String lastName = splitString[1];
        String task = splitString[2];
        String due = splitString[3];
        View outputView = controller.handleInput(firstName, lastName, task, due);
        System.out.println(outputView.render());
    }
}
//view shows stuff
//controllers handle inputs
//services do logic
//repositories manage data