package edu.dmacc.codedsm.mvcpractice;

import java.util.List;

public interface TaskService {
    void createTask(TaskInputDto task);
    List<TaskInputDto> listTasks();
}
