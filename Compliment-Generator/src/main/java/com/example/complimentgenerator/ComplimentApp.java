package com.example.complimentgenerator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComplimentApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Compliment Generator");

        // Create input fields
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        TextField hobbyField = new TextField();
        hobbyField.setPromptText("Enter your favorite hobby");

        // Button to generate compliment
        Button generateButton = new Button("Generate Compliment");

        // Label to display the compliment
        Label complimentLabel = new Label();

        // Handle button click
        generateButton.setOnAction(e -> {
            String name = nameField.getText().trim(); // Trim whitespace
            String hobby = hobbyField.getText().trim(); // Trim whitespace

            // Check if the fields are empty
            if (name.isEmpty() || hobby.isEmpty()) {
                complimentLabel.setText("Please enter both your name and hobby!"); // Show a warning message
            } else {
                String compliment = ComplimentGenerator.generateCompliment(name, hobby);
                complimentLabel.setText(compliment); // Show the generated compliment
            }
        });

        // Layout
        VBox layout = new VBox(20, nameField, hobbyField, generateButton, complimentLabel);

        layout.setPadding(new Insets(20));
        nameField.setPrefWidth(300);
        hobbyField.setPrefWidth(300);
        complimentLabel.setWrapText(true);
        complimentLabel.setMaxWidth(800);

        VBox.setMargin(nameField, new Insets(10, 20, 10, 20));  // Margins for the NameField
        VBox.setMargin(hobbyField, new Insets(10, 20, 10, 20));  // Margins for the HobbyField
        VBox.setMargin(generateButton, new Insets(10, 20, 10, 20));  // Margins for the generateButton
        VBox.setMargin(complimentLabel, new Insets(10, 20, 10, 20));  // Margins for the complimentLabel

        Scene scene = new Scene(layout, 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        nameField.getStyleClass().add("text-field");
        hobbyField.getStyleClass().add("text-field");
        complimentLabel.getStyleClass().add("compliment-label");
        layout.getStyleClass().add("vbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}