import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.VBox;
import javafx.scene.control.ButtonBar.ButtonData;


import javax.swing.*;

public class HelloWorld extends Application {
    public static void HelloWorld(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Calculator");
        ListView<String> list = new ListView<String>();
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        VBox boxOfButtons = new VBox(5);
        Button[][] myButtons = new Button[3][4];
        int numOfButton = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                if(y==3)
                {
                    if(x==0)
                    {
                        myButtons[x][y] = new Button("+");
                        numOfButton = numOfButton + 1;
                        myButtons[x][y].setPrefSize(50, 50);
                        root.add(myButtons[x][y], x, y);
                        myButtons[x][y].setOnAction((ActionEvent ae) -> doSomething());

                    }
                    else if(x==1)
                    {
                        myButtons[x][y] = new Button("-");
                        numOfButton = numOfButton + 1;
                        myButtons[x][y].setPrefSize(50, 50);
                        root.add(myButtons[x][y], x, y);
                        myButtons[x][y].setOnAction((ActionEvent ae) -> doSomething());

                    }
                    else
                    {
                        myButtons[x][y] = new Button("=");
                        numOfButton = numOfButton + 1;
                        myButtons[x][y].setPrefSize(50, 50);
                        root.add(myButtons[x][y], x, y);
                        myButtons[x][y].setOnAction((ActionEvent ae) -> doSomething());

                    }
                }
                else {
                    myButtons[x][y] = new Button(Integer.toString(numOfButton));
                    numOfButton = numOfButton + 1;
                    myButtons[x][y].setPrefSize(50, 50);
                    root.add(myButtons[x][y], x, y);
                    myButtons[x][y].setOnAction((ActionEvent ae) -> doSomething());

                }
            }
        }

        primaryStage.setScene(new Scene(root, 170, 230));
        primaryStage.show();

    }

    private void doSomething()
    {
        System.out.println("I WORK");
    }
}
