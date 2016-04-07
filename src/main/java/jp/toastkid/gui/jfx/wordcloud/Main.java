package jp.toastkid.gui.jfx.wordcloud;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Word cloud.
 *
 * @author Toast kid
 */
public final class Main extends Application {

    /** Application title. */
    private static final String TITLE = "Word cloud";
    /** FXML ファイルのパス. */
    private static final String FXML = "public/scenes/WordCloud.fxml";
    /** Stage. */
    private Stage stage;
    /** Scene. */
    private Scene scene = null;

    /**
     * Constructor.
     * @param parent
     */
    public Main() {
        loadScene();
    }

    /**
     * FXML からロードする.
     * @return Parent オブジェクト
     */
    private final void loadScene() {

        try {
            final FXMLLoader loader = new FXMLLoader(new File(FXML).toURI().toURL());
            if (scene == null) {
                scene = new Scene(loader.load());
            }
            stage = new Stage(StageStyle.DECORATED);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle(TITLE);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(final Stage arg0) throws Exception {
        stage.show();
    }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        Application.launch(Main.class);
    }
}