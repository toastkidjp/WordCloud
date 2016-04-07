package jp.toastkid.gui.jfx.wordcloud;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * コントローラ.
 * @author Toast kid
 */
public final class Controller implements Initializable {
    /** 表示領域. */
    @FXML
    public Pane canvas;

    /** テキスト入力. */
    @FXML
    public TextArea text;

    /**
     * close this dialog.
     */
    @FXML
    private void close() {
        canvas.getScene().getWindow().hide();
    }

    @Override
    public void initialize(final URL arg0, final ResourceBundle arg1) {
        canvas.setOnMouseClicked(eve -> {Controller.this.close();});
    }

    /**
     * draw word cloud.
     */
    @FXML
    private void draw() {
        try {
            FxWordCloud.draw(canvas, text.getText());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}