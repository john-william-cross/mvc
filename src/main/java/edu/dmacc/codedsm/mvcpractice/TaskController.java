package edu.dmacc.codedsm.mvcpractice;

public interface TaskController {

    View showInitialView();

    View handleInput(String firstName, String lastName, String task, String due);

}
