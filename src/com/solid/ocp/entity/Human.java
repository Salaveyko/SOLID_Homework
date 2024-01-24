package com.solid.ocp.entity;

public class Human {
    private String firstname;
    private String lastname;
    private String preparationSteps;

    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(String preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public String getReadyForWork() {
        return firstname + " " +
                lastname + " preparing for work:\n" +
                preparationSteps;
    }

    public static class PrepareBuilder {
        private StringBuilder preparationSteps = new StringBuilder();

        public PrepareBuilder addPreparationStep(String step) {
            preparationSteps.append(step).append("\n");
            return this;
        }

        public String build() {
            return preparationSteps.toString();
        }
    }
}
