package model;

import java.util.Objects;

public class Emploee {
    private String name;
    private String surname;
    public  (String name,String surname,String patronymicName, int salary, int department)
    {
        this.name = name;
        this.surname = surname;
    }
    public java.lang.String getName() {
        return name;
    }
    public java.lang.String getSurname() {
        return surname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Emploee emploee = (Emploee) o;
        return salary == emploee.salary && department == emploee.department && Objects.equals(name, emploee.name) && Objects.equals(surname, emploee.surname) && Objects.equals(name, emploee.name) && Objects.equals(String, emploee.String) && Objects.equals(patronymicName, emploee.patronymicName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, name, String, patronymicName, salary, department);
    }
    @Override
    public String toString(){
        return String.format("ФО: %s %s", surname, name);
    }
}