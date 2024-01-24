package com.solid.ocp;

/**
 * Open-Closed Principle
 * Software entities should be open for extension, but closed for modification.
 * ----
 * Create a Human class with the fields firstName, lastName. In this class, create a method
 * getReadyForWork() in which, using the output on the screen, describe the sequence of how
 * a person is going to work. You will be able to list many items, but each time something will
 * be remembered and completed in this method. Write a solution to this kind of violation of
 * the principle.
 * ----
 * I decided to create a simple Builder that would add steps to getting ready for work.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alex", "Solovey");
        human.setPreparationSteps(
                new Human.PrepareBuilder()
                        .addPreparationStep("Wake up.")
                        .addPreparationStep("Drink a glass of water.")
                        .addPreparationStep("Take a shower.")
                        .addPreparationStep("Eat breakfast.")
                        .addPreparationStep("Check for a documents.")
                        .addPreparationStep("Sing songs on your way to work")
                        .build()
        );

        System.out.println(human.getReadyForWork());
    }
}

