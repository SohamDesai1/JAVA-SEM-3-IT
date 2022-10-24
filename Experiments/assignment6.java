//package com.company;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class assignment6 extends Application {
//
//
//    @Override
//    public void start(Stage stage) {
//        Canvas canvas = new Canvas(400, 200);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.setLineWidth(2.0);
//        gc.setFill(Color.RED);
//        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);
//        gc.fillRoundRect(100, 10, 50, 50, 10, 10);
//        gc.setFill(Color.BLUE);
//        gc.strokeOval(10, 70, 50, 30);
//        gc.fillOval(100, 70, 50, 30);
//        Pane root = new Pane();
//        root.setStyle("-fx-padding: 10;" +
//                "-fx-border-style: solid inside;" +
//                "-fx-border-width: 2;" +
//                "-fx-border-insets: 5;" +
//                "-fx-border-radius: 5;" +
//                "-fx-border-color: blue;");
//        root.getChildren().add(canvas);
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("Drawing Basic Shapes on a Canvas");
//        stage.show();
//    }
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
