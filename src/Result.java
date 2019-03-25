import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Result {
    private Button yes, no;
    private Label label1, label2, label3, label4, label5;
    private boolean answer;
    private String s1, s2, st;

    public boolean display(String title, int one, int two, int tie) {
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);

        yes = new Button("Yes");
        no = new Button("No");

        s1 = "Player 1 wins: " + Integer.toString(one);
        s2 = "Player 2 wins: " + Integer.toString(two);
        st = "Ties: " + Integer.toString(tie);

        label1 = new Label(title);
        label2 = new Label("Do you want to play again?");
        label3 = new Label(s1);
        label4 = new Label(s2);
        label5 = new Label(st);

        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label1, label2, yes, no);

        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(label3,label4,label5);

        BorderPane root = new BorderPane();
        root.setCenter(vBox);
        root.setBottom(hBox);

        BorderPane.setAlignment(root, Pos.CENTER);

        Scene scene = new Scene(root, 250, 250);

        yes.setOnAction(event -> {
            answer = true;
            window.close();
        });

        no.setOnAction(event -> {
            answer = false;
            window.close();
        });
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }
}