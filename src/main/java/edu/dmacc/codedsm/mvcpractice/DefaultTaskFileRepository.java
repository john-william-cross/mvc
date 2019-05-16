package edu.dmacc.codedsm.mvcpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTaskFileRepository implements TaskFileRepository {


    private Map<Integer, TaskDataDto> storage = new HashMap<>();

    @Override
    public List<TaskDataDto> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void create(TaskDataDto data) {
        System.out.println("data = [" + data + "]");
        storage.put(data.getId(), data);
    }
}
