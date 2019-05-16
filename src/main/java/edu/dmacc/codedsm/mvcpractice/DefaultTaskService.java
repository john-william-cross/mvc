package edu.dmacc.codedsm.mvcpractice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DefaultTaskService implements TaskService {

    private TaskFileRepository repository;

    public DefaultTaskService(TaskFileRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createTask(TaskInputDto task) {
        Integer id = new Random().nextInt();
        TaskDataDto data = new TaskDataDto();
        data.setId(id);
        data.setFirstName(task.getFirstname());
        data.setLastName(task.getLastname());
        data.setTask(task.getTask());
        data.setDue(task.getDue());

        repository.create(data);
    }

    @Override
    public List<TaskInputDto> listTasks() {
        List<TaskDataDto> taskDataDtos = repository.findAll();
        return taskDataDtos.stream().map(data -> {
            TaskInputDto input = new TaskInputDto();
            input.setDue(data.getDue());
            input.setTask(data.getTask());
            input.setFirstname(data.getFirstName());
            input.setLastname(data.getLastName());
            return input;
        }).collect(Collectors.toList());
    }
}



//view shows stuff
//controllers handle inputs
//services do logic
//repositories manage data