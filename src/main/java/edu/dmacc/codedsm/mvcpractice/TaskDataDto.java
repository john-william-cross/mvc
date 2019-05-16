package edu.dmacc.codedsm.mvcpractice;

import java.util.Objects;

public class TaskDataDto {
    Integer id;
    String firstName;
    String lastName;
    String task;
    String due;

    public TaskDataDto() {
    }

    @Override
    public String toString() {
        return "TaskDataDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", task='" + task + '\'' +
                ", due='" + due + '\'' +
                '}';
    }

    public TaskDataDto(Integer id, String firstName, String lastName, String task, String due) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.task = task;
        this.due = due;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDataDto that = (TaskDataDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(task, that.task) &&
                Objects.equals(due, that.due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, task, due);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }
}
