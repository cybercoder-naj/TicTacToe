import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class GameBoard extends Application {

    private Label b[][] = new Label[3][3];

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        Label label = new Label("Welcome to TicTacToe!!");
        Label label2 = new Label("Player 1[X] to move.");

        label.setTextAlignment(TextAlignment.CENTER);
        label2.setTextAlignment(TextAlignment.CENTER);

        label.setAlignment(Pos.CENTER);
        label2.setAlignment(Pos.CENTER);

        label.setStyle("-fx-font-size: 30");
        label2.setStyle("-fx-font-size: 30");

        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane grid = makeGrid();

        BorderPane layout = new BorderPane();

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label, label2);

        layout.setTop(vBox);
        layout.setCenter(grid);

        BorderPane.setAlignment(layout, Pos.CENTER);

        Logic logic = new Logic(b, label2, primaryStage);
        logic.onClicks();

        Scene scene = new Scene(layout, 900, 900);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane makeGrid() {
        GridPane gridPane = new GridPane();

        gridPane.setGridLinesVisible(true);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(0);
        gridPane.setVgap(0);

        b[0][0] = new Label(" ");
        b[0][1] = new Label(" ");
        b[0][2] = new Label(" ");
        b[1][0] = new Label(" ");
        b[1][1] = new Label(" ");
        b[1][2] = new Label(" ");
        b[2][0] = new Label(" ");
        b[2][1] = new Label(" ");
        b[2][2] = new Label(" ");

        b[0][0].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[0][1].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[0][2].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[1][0].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[1][1].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[1][2].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[2][0].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[2][1].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");
        b[2][2].setStyle("-fx-font-weight: bold; -fx-font-size: 100;");

        b[0][0].setAlignment(Pos.CENTER);
        b[0][0].setTextAlignment(TextAlignment.CENTER);
        b[0][1].setAlignment(Pos.CENTER);
        b[0][1].setTextAlignment(TextAlignment.CENTER);
        b[0][2].setAlignment(Pos.CENTER);
        b[0][2].setTextAlignment(TextAlignment.CENTER);
        b[1][0].setAlignment(Pos.CENTER);
        b[1][0].setTextAlignment(TextAlignment.CENTER);
        b[1][1].setAlignment(Pos.CENTER);
        b[1][1].setTextAlignment(TextAlignment.CENTER);
        b[1][2].setAlignment(Pos.CENTER);
        b[1][2].setTextAlignment(TextAlignment.CENTER);
        b[2][0].setAlignment(Pos.CENTER);
        b[2][0].setTextAlignment(TextAlignment.CENTER);
        b[2][1].setAlignment(Pos.CENTER);
        b[2][1].setTextAlignment(TextAlignment.CENTER);
        b[2][2].setAlignment(Pos.CENTER);
        b[2][2].setTextAlignment(TextAlignment.CENTER);

        b[0][0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[0][1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[0][2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[1][0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[1][1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[1][2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[2][0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[2][1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b[2][2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        gridPane.getColumnConstraints().add(new ColumnConstraints(100));
        gridPane.getColumnConstraints().add(new ColumnConstraints(100));
        gridPane.getColumnConstraints().add(new ColumnConstraints(100));
        gridPane.getRowConstraints().add(new RowConstraints(100));
        gridPane.getRowConstraints().add(new RowConstraints(100));
        gridPane.getRowConstraints().add(new RowConstraints(100));

        GridPane.setConstraints(b[0][0],0,0);
        GridPane.setConstraints(b[0][1],1,0);
        GridPane.setConstraints(b[0][2],2,0);
        GridPane.setConstraints(b[1][0],0,1);
        GridPane.setConstraints(b[1][1],1,1);
        GridPane.setConstraints(b[1][2],2,1);
        GridPane.setConstraints(b[2][0],0,2);
        GridPane.setConstraints(b[2][1],1,2);
        GridPane.setConstraints(b[2][2],2,2);

        gridPane.getChildren().addAll(b[0][0],b[0][1],b[0][2],b[1][0],b[1][1],b[1][2],b[2][0],b[2][1],b[2][2]);
        GridPane.setHalignment(gridPane, HPos.CENTER);
        GridPane.setValignment(gridPane, VPos.CENTER);
        gridPane.setAlignment(Pos.CENTER);

        return gridPane;

    }
}