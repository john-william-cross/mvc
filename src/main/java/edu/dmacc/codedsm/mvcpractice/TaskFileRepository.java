package edu.dmacc.codedsm.mvcpractice;

import java.util.List;

public interface TaskFileRepository {
    List<TaskDataDto> findAll();
    void create(TaskDataDto data);
}
