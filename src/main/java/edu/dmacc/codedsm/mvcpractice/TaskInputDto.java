package edu.dmacc.codedsm.mvcpractice;

import java.util.Objects;

public class TaskInputDto {

    String Firstname;
    String Lastname;
    String Task;
    String Due;

    public TaskInputDto(String firstname, String lastname, String task, String due) {
        Firstname = firstname;
        Lastname = lastname;
        Task = task;
        Due = due;
    }

    public TaskInputDto() {

    }

    @Override
    public String toString() {
        return "TaskInputDto{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Task='" + Task + '\'' +
                ", Due='" + Due + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskInputDto that = (TaskInputDto) o;
        return Objects.equals(Firstname, that.Firstname) &&
                Objects.equals(Lastname, that.Lastname) &&
                Objects.equals(Task, that.Task) &&
                Objects.equals(Due, that.Due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Firstname, Lastname, Task, Due);
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public String getDue() {
        return Due;
    }

    public void setDue(String due) {
        Due = due;
    }
}
