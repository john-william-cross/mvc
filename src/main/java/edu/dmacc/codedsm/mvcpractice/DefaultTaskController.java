package edu.dmacc.codedsm.mvcpractice;

import java.util.List;

public class DefaultTaskController implements TaskController {

    private  TaskService service;

    public DefaultTaskController(TaskService service) {
        this.service = service;
    }

    @Override
    public View showInitialView() {
        return new InputView();
    }

    @Override
    public View handleInput(String firstName, String lastName, String task, String due) {
        TaskInputDto inputDto = new TaskInputDto();
        inputDto.setFirstname(firstName);
        inputDto.setLastname(lastName);
        inputDto.setTask(task);
        inputDto.setDue(due);

        service.createTask(inputDto);

        List<TaskInputDto> taskInputDtos = service.listTasks();
        System.out.println(taskInputDtos);

        return new OutputView(taskInputDtos);
    }
}
