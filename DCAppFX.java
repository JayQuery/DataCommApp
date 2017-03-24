/**
@author Jarrett Early
Program: Data Communications Calculations App 
Developed: 3/23/17
Updated: 3/23/17
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
	

public class DCAppFX extends Application {
	
	@Override
	public void start(Stage stage){
		AttenCalc calc = new AttenCalc();
		
		Group root = new Group();
        Scene scene = new Scene(root, 500, 600);
        stage.setScene(scene);
        stage.setTitle("Data Communications Calculator v1.0 GUI");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 20, 10, 20));
        grid.setVgap(5);
        grid.setHgap(5);

        scene.setRoot(grid);

        final TextField length = new TextField();
        length.setPromptText("In Bytes");
        length.setPrefColumnCount(7);
        GridPane.setConstraints(length, 0, 0);
        grid.getChildren().add(length);
        
        final Label llabel = new Label();
        llabel.setText("Enter packet size");
        GridPane.setConstraints(llabel, 1, 0);
        GridPane.setColumnSpan(llabel, 2);
        grid.getChildren().add(llabel);
       

        final TextField rate = new TextField();
        rate.setPromptText("b/s");
        rate.setPrefColumnCount(5);
        GridPane.setConstraints(rate, 0, 1);
        grid.getChildren().add(rate);
        
        final Label rlabel = new Label();
        rlabel.setText("Enter Rate");
        GridPane.setConstraints(rlabel, 1, 1);
        GridPane.setColumnSpan(rlabel, 2);
        grid.getChildren().add(rlabel);

        final TextField distance = new TextField();
        distance.setPrefColumnCount(5);
        distance.setPromptText("Exact units");
        GridPane.setConstraints(distance, 0, 2);
        grid.getChildren().add(distance);
        
        final Label dlabel = new Label();
        dlabel.setText("Enter Distance");
        GridPane.setConstraints(dlabel, 1, 2);
        GridPane.setColumnSpan(dlabel, 2);
        grid.getChildren().add(dlabel);

        Button submit = new Button("CALCULATE");
        GridPane.setConstraints(submit, 0, 4);
        grid.getChildren().add(submit);

        Button clear = new Button("CLEAR");
        GridPane.setConstraints(clear, 1, 4);
        grid.getChildren().add(clear);
        
        Button exit = new Button("Exit");
        GridPane.setConstraints(exit, 2, 4);
        grid.getChildren().add(exit);
        
        final Label label1 = new Label();
        label1.setText("Results");
        GridPane.setConstraints(label1, 0, 5);
        GridPane.setColumnSpan(label1, 2);
        grid.getChildren().add(label1);
        

        final TextArea results = new TextArea();
        results.setEditable(false);
        GridPane.setConstraints(results, 0, 6);
        GridPane.setColumnSpan(results, 2);
        grid.getChildren().add(results);
        
        final Label company = new Label();
        company.setText("Dexterasoft Research, LLC Copyright 2013");
        GridPane.setConstraints(company, 1, 8);
        GridPane.setColumnSpan(company, 2);
        grid.getChildren().add(company);
       
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	String input = "";
        		
        	
        		
            	input = length.getText();
            	calc.setL(Double.parseDouble(input));
            	
            	input = rate.getText();
            	calc.setR(Double.parseDouble(input));
            	
            	input = distance.getText();
            	calc.setD(Double.parseDouble(input));
            	
                
            	results.setText(calc.toString());
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                length.clear();
                rate.clear();
                distance.clear();
                results.setText(null);
  
            }
        });
        
        exit.setOnAction(new EventHandler<ActionEvent> (){ 
        	@Override
        	public void  handle(ActionEvent e){
        		System.exit(0);
        	}
        });
        
        stage.show();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
