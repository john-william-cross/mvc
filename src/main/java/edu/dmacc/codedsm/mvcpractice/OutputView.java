package edu.dmacc.codedsm.mvcpractice;

import java.util.List;

public class OutputView implements View {
    private List<TaskInputDto> taskInputDtos;

    public OutputView(List<TaskInputDto> taskInputDtos) {
        this.taskInputDtos = taskInputDtos;
    }

    @Override
    public String render() {
        return taskInputDtos.stream()
                .map(input -> input.toString())
                .reduce("", (acc, ele) -> acc + ele + "\n");

    }
}
