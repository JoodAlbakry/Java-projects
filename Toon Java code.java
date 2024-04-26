package application;

import java.io.File;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Page1 extends Application {
	private Button bu17_4;
	private Button bu17_5;
	private Button bu17_6;
	 ///////// Scenes
    Scene CourseScene;
    Scene JavaCourseInfo;
    Scene JavaVedio;
    Scene PythonCourseInfo;
    Scene PythonVedio;
    Scene HtmlCourseInfo;
    Scene HtmlVedio;
    Scene CreateCourseScene;
    Scene NewCourse1;
    Scene NewCourse2;
    Scene NewCourse3;
    Scene NewCourseVid1;
    Scene NewCourseVid2;
    Scene NewCourseVid3;
    Scene Questions1Scene ;
    
    MediaPlayer mediaPlayerNewCrs1;
    MediaPlayer mediaPlayerNewCrs2;
    MediaPlayer mediaPlayerNewCrs3;

    File filePic;
    File fileVid;
    
    int numCourse = 0;// Number of new courses
    int Score; // to collacte point 
	@Override
	public void start(Stage primaryStage) {
		try {
			
			int g1=0,g2=0,g3=0,sum=0;
			String n;		
		//Scene0
			
			 //colors
	        Color color1 = Color.rgb(219, 246, 148, 1);

	        //-------------------------------------------------------
	        // root - Scene Animation
	        Pane IntroPage = new Pane();
	        Scene scene0 = new Scene(IntroPage, 945, 640);
	        scene0.setFill(Color.WHITE);
	      
	       
	        //-------------------------------------------------------

	        //the letters
	        Image imgT = new Image("file:///D:\\A\\T.png");
	        ImageView imgViewT = new ImageView(imgT);
	        Image imgOO = new Image("file:///D:\\A\\OO.png");
	        ImageView imgViewOO = new ImageView(imgOO);
	        Image imgN = new Image("file:///D:\\A\\N.png");
	        ImageView imgViewN = new ImageView(imgN);

	        //bird
	        Image imgBird = new Image("file:///D:\\A\\bird.png");
	        ImageView imgViewBird = new ImageView(imgBird);
	        imgViewBird.setFitWidth(728);
	        imgViewBird.setFitHeight(719);
	        imgViewBird.setRotate(11);

	        //stars
	        Image imgStar1 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar1 = new ImageView(imgStar1);
	        imgViewStar1.setX(300);
	        imgViewStar1.setY(80);

	        Image imgStar2 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar2 = new ImageView(imgStar2);
	        imgViewStar2.setX(500);
	        imgViewStar2.setY(60);

	        Image imgStar3 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar3 = new ImageView(imgStar3);
	        imgViewStar3.setX(750);
	        imgViewStar3.setY(130);

	        Image imgStar4 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar4 = new ImageView(imgStar4);
	        imgViewStar4.setX(840);
	        imgViewStar4.setY(240);

	        Image imgStar5 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar5 = new ImageView(imgStar5);
	        imgViewStar5.setX(790);
	        imgViewStar5.setY(450);

	        Image imgStar6 = new Image("file:///D:\\A\\WhiteStar1.png");
	        ImageView imgViewStar6 = new ImageView(imgStar6);
	        imgViewStar6.setX(650);
	        imgViewStar6.setY(490);

	        Text text1 = new Text("HAVE");
	        text1.setFill(Color.WHITE);
	        text1.setOpacity(0.9);
	        text1.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 70));

	        Text text2 = new Text("FUN & LEARN");
	        text2.setFill(Color.WHITE);
	        text2.setOpacity(0.9);
	        text2.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 70));

	        Text text3 = new Text("AT THE SAME TIME");
	        text3.setFill(Color.GREY);
	        text3.setOpacity(0.8);
	        text3.setFont(Font.font("Lovelo Black", FontWeight.BOLD, FontPosture.REGULAR, 57));

	        Timeline time1 = new Timeline();

	        //Animation "Toon"
	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(0.95),
	            e -> {
	                IntroPage.getChildren().addAll(imgViewT);
	                imgViewT.setX(60);
	                imgViewT.setY(35);
	                imgViewT.setFitWidth(750);
	                imgViewT.setFitHeight(650);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewT);
	                scale1.setDuration(Duration.millis(150));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(1.5),
	            e -> {
	                IntroPage.getChildren().addAll(imgViewOO);
	                imgViewOO.setX(25.5);
	                imgViewOO.setY(-20);
	                imgViewOO.setFitWidth(860);
	                imgViewOO.setFitHeight(740);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewOO);
	                scale1.setDuration(Duration.millis(160));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(1.8),
	            e -> {
	                IntroPage.getChildren().addAll(imgViewN);
	                imgViewN.setX(30);
	                imgViewN.setY(60);
	                imgViewN.setFitWidth(850);
	                imgViewN.setFitHeight(600);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewN);
	                scale1.setDuration(Duration.millis(150));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewT);
	                scale1.setDuration(Duration.millis(100));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.1),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewOO);
	                scale1.setDuration(Duration.millis(100));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.2),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewN);
	                scale1.setDuration(Duration.millis(100));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(2);
	                scale1.setByX(0.4);
	                scale1.setByY(0.4);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.2),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewT);
	                scale1.setDuration(Duration.millis(70));
	                scale1.setByX(-0.9999999999);
	                scale1.setByY(-0.9999999999);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.3),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewOO);
	                scale1.setDuration(Duration.millis(70));
	                scale1.setByX(-0.9999999999);
	                scale1.setByY(-0.9999999999);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.4),
	            e -> {
	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewN);
	                scale1.setDuration(Duration.millis(70));
	                scale1.setByX(-0.9999999999);
	                scale1.setByY(-0.9999999999);
	                scale1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.42),
	            e -> {
	                IntroPage.getChildren().removeAll(imgViewT, imgViewOO, imgViewN);
	            }
	        ));

	        //Animation "HAVE FUN & LEARN AT THE SAME TIME" + Bird + Stars
	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(3.63),
	            e -> {
	                IntroPage.setBackground(Background.fill(color1));
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(4),
	            e -> {
	                IntroPage.getChildren().addAll(imgViewBird);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(imgViewBird);
	                translate1.setDuration(Duration.millis(980));
	                imgViewBird.setX(-445);
	                imgViewBird.setY(292);
	                translate1.setToX(260);//-170
	                translate1.setToY(-260);//32
	                translate1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(4.2),
	            e -> {
	                IntroPage.getChildren().addAll(imgViewStar1, imgViewStar2, imgViewStar3);
	                imgViewStar1.setFitWidth(10);
	                imgViewStar1.setFitHeight(10);
	                imgViewStar2.setFitWidth(5);
	                imgViewStar2.setFitHeight(5);
	                imgViewStar3.setFitWidth(5);
	                imgViewStar3.setFitHeight(5);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewStar1);
	                scale1.setDuration(Duration.millis(700));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(100);
	                scale1.setByX(1.6);
	                scale1.setByY(1.6);
	                scale1.play();

	                ScaleTransition scale2 = new ScaleTransition();
	                scale2.setNode(imgViewStar2);
	                scale2.setDuration(Duration.millis(700));
	                scale2.setAutoReverse(true);
	                scale2.setCycleCount(100);
	                scale2.setByX(1.6);
	                scale2.setByY(1.6);
	                scale2.play();

	                ScaleTransition scale3 = new ScaleTransition();
	                scale3.setNode(imgViewStar3);
	                scale3.setDuration(Duration.millis(700));
	                scale3.setAutoReverse(true);
	                scale3.setCycleCount(100);
	                scale3.setByX(1.5);
	                scale3.setByY(1.5);
	                scale3.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(4.3),
	            e -> {
	                IntroPage.getChildren().addAll(text1);
	                text1.setX(415);
	                text1.setY(197);

	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text1);
	                fade1.setDuration(Duration.millis(2000));
	                fade1.setFromValue(0);
	                fade1.setToValue(1);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text1);
	                translate1.setDuration(Duration.millis(1200));
	                translate1.setToX(-30);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(4.38),
	            e -> {
	                IntroPage.getChildren().addAll(text2, imgViewStar4);
	                imgViewStar4.setFitWidth(12);
	                imgViewStar4.setFitHeight(12);
	                text2.setX(355);
	                text2.setY(270);

	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text2);
	                fade1.setDuration(Duration.millis(2000));
	                fade1.setFromValue(0);
	                fade1.setToValue(1);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text2);
	                translate1.setDuration(Duration.millis(1250));
	                translate1.setToX(30);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewStar4);
	                scale1.setDuration(Duration.millis(700));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(100);
	                scale1.setByX(1.5);
	                scale1.setByY(1.5);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1, scale1);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(4.4),
	            e -> {
	                IntroPage.getChildren().addAll(text3, imgViewStar5, imgViewStar6);
	                imgViewStar5.setFitWidth(6);
	                imgViewStar5.setFitHeight(6);
	                imgViewStar6.setFitWidth(6);
	                imgViewStar6.setFitHeight(6);
	                text3.setX(425);
	                text3.setY(340);

	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text3);
	                fade1.setDuration(Duration.millis(2000));
	                fade1.setFromValue(0);
	                fade1.setToValue(1);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text3);
	                translate1.setDuration(Duration.millis(1200));
	                translate1.setToX(-40);

	                ScaleTransition scale1 = new ScaleTransition();
	                scale1.setNode(imgViewStar5);
	                scale1.setDuration(Duration.millis(700));
	                scale1.setAutoReverse(true);
	                scale1.setCycleCount(100);
	                scale1.setByX(1.5);
	                scale1.setByY(1.5);

	                ScaleTransition scale2 = new ScaleTransition();
	                scale2.setNode(imgViewStar6);
	                scale2.setDuration(Duration.millis(700));
	                scale2.setAutoReverse(true);
	                scale2.setCycleCount(100);
	                scale2.setByX(1.9);
	                scale2.setByY(1.9);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1, scale1, scale2);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(8),
	            e -> {
	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text1);
	                fade1.setDuration(Duration.millis(1000));
	                fade1.setFromValue(1);
	                fade1.setToValue(0);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text1);
	                translate1.setDuration(Duration.millis(1200));
	                translate1.setToX(30);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(8.09),
	            e -> {
	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text2);
	                fade1.setDuration(Duration.millis(1000));
	                fade1.setFromValue(1);
	                fade1.setToValue(0);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text2);
	                translate1.setDuration(Duration.millis(1250));
	                translate1.setToX(-30);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(8.14),
	            e -> {
	                FadeTransition fade1 = new FadeTransition();
	                fade1.setNode(text3);
	                fade1.setDuration(Duration.millis(1000));
	                fade1.setFromValue(1);
	                fade1.setToValue(0);

	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(text3);
	                translate1.setDuration(Duration.millis(1200));
	                translate1.setToX(40);

	                ParallelTransition parallel = new ParallelTransition(fade1, translate1);
	                parallel.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(8.2),
	            e -> {
	                TranslateTransition translate1 = new TranslateTransition();
	                translate1.setNode(imgViewBird);
	                translate1.setDuration(Duration.millis(1500));
	                translate1.setToX(-445);
	                translate1.setToY(292);
	                translate1.play();
	            }
	        ));

	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(8.35),
	            e -> {
	                IntroPage.getChildren().removeAll(imgViewStar1, imgViewStar2, imgViewStar3, imgViewStar4, imgViewStar5, imgViewStar6);
	            }
	        ));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	     
			//scene 1*
			BorderPane root = new BorderPane();
			Button bu1=new Button("LOGIN");
			bu1.setPrefSize(80, 40);
			bu1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			HBox hb1 = new HBox(bu1);
		    hb1.setPadding(new Insets(200));
		    hb1.setAlignment(Pos.CENTER);
		    
			Image image1 = new Image("file:///D:\\TOON (1)\\2_3.png");
			ImageView imageView1 = new ImageView(image1);//Setting the image view 
			imageView1.setFitHeight(640); //setting the fit height and width of the image view
			imageView1.setFitWidth(945);
			imageView1.setPreserveRatio(true);
			
			Circle circle = new Circle();//Drawing a Circle
	         circle.setRadius(70);
	         circle.setCenterX(466);
			 circle.setCenterY(197);
	         circle.setFill(Color.WHITE);//Setting color to the circle
	         circle.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         Image imagep = new Image("file:///D:\\A\\22.png");
	         ImagePattern pattern = new ImagePattern(imagep,0,0,1,1,true);
	         //Setting the image pattern to the circle and text
	         circle.setFill(pattern);
	         
	         
	         TextField t1 =new TextField();
	         PasswordField t2 = new PasswordField();
			 t1.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 t2.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 VBox vb1 = new VBox(20,t1,t2);
			 vb1.setAlignment(Pos.CENTER);
			 vb1.setPadding(new Insets(300,0,0,0));
			 t1.setMaxSize(200,150);
			 t2.setMaxSize(200,150);
			
			 Text tx1 = new Text("User name :");
			 tx1.setX(277);
			 tx1.setY(315);
			 tx1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx1.setFill(Color.web("#C64159"));
			 
			 Text tx2 = new Text("  Password :");
			 tx2.setX(277);
			 tx2.setY(362);
			 tx2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx2.setFill(Color.web("#C64159"));
			 
			 Text tx3 = new Text("Don't have an account ?");
			 tx3.setX(370);
			 tx3.setY(400);
			 tx3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,10));
			 tx3.setFill(Color.web("#C64159"));
			 
			 Text tx4 = new Text(" sign up ");
			 tx4.setX(490);
			 tx4.setY(400);
			 tx4.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,10));
			 tx4.setFill(Color.web("#004AAD"));
			 
			root.getChildren().add(imageView1);
			root.setBottom(hb1);
			root.setCenter(vb1);
			root.getChildren().addAll(circle,tx1,tx2,tx3,tx4);
			Scene scene = new Scene(root,945,640);
			
			
			
			//scene 2*
			BorderPane root2 = new BorderPane();
			Button ch1= new Button("Choose Picture");
            ch1.setPrefSize(100,90);
            ch1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
            HBox hb55 = new HBox( ch1);
            hb55.setAlignment(Pos.CENTER);
            hb55.setTranslateX(400);
            
			Button bu1_1=new Button("SAVE");
			bu1_1.setPrefSize(80, 40);
			bu1_1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			VBox hb1_1 = new VBox(bu1_1);
			hb1_1.setPadding(new Insets(200));
			hb1_1.setAlignment(Pos.CENTER);
		    
			 Circle circle2 = new Circle();//Drawing a Circle
	         circle2.setRadius(70);
	         circle2.setCenterX(466);
			 circle2.setCenterY(197);
	         circle2.setFill(Color.WHITE);//Setting color to the circle
	         circle2.setFill(pattern);
	         circle2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
	        Image image = new Image("file:///D:\\TOON (1)\\2_3.png");
			ImageView imageView = new ImageView(image);//Setting the image view 
			imageView.setFitHeight(640); //setting the fit height and width of the image view
			imageView.setFitWidth(945);
			imageView.setPreserveRatio(true);
			
			TextField t3 =new TextField();
	         PasswordField t4 = new PasswordField();
	         TextField t5 =new TextField();
			 t3.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 t4.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 t5.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");

			 RadioButton rb1 = new RadioButton("male");
			 RadioButton rb2 = new RadioButton("female");
			 rb1.setStyle("-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 rb2.setStyle("-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 ToggleGroup Group = new ToggleGroup();
			 rb1.setToggleGroup(Group);
			 rb2.setToggleGroup(Group);
			 HBox hrb =new HBox(40,rb1,rb2);
			 hrb.setAlignment(Pos.CENTER);
			 
			 VBox vb2 = new VBox(20,ch1,t3,t5,t4,hrb,bu1_1);
			 vb2.setAlignment(Pos.CENTER);
			 vb2.setPadding(new Insets(300,0,300,0));
			 t3.setMaxSize(200,150);
			 t4.setMaxSize(200,150);
			 t5.setMaxSize(200,150);

			 Text tx5 = new Text("User name :");
			 tx5.setX(277);
			 tx5.setY(362);
			 tx5.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx5.setFill(Color.web("#C64159"));
			 
			 Text tx6 = new Text("     Email :");
			 tx6.setX(285);
			 tx6.setY(407);
			 tx6.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx6.setFill(Color.web("#C64159"));
			
			 Text tx7 = new Text("  Password :");
			 tx7.setX(277);
			 tx7.setY(453);
			 tx7.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx7.setFill(Color.web("#C64159"));
			 
			root2.getChildren().add(imageView);
			root2.setCenter(vb2);
			root2.getChildren().addAll(circle2,tx5,tx6,tx7);
			Scene scene2 = new Scene(root2,945,640);
			
			
			
			
			//scene 3*
            BorderPane root3 = new BorderPane();
			
			Image image3 = new Image("file:///D:\\TOON (1)\\4.png");
			ImageView imageView3 = new ImageView(image3);//Setting the image view 
			imageView3.setFitHeight(640); //setting the fit height and width of the image view
			imageView3.setFitWidth(945);
			imageView3.setPreserveRatio(true);
			Image image3_3 = new Image("file:///D:\\A\\23.png");
			ImagePattern i1= new ImagePattern (image3_3,0,0,1,1,true);
			
			Button bu2=new Button("?");
			bu2.setPrefSize(60,60);
			bu2.setStyle("-fx-background-radius: 50%; -fx-min-width: 50px; -fx-min-height: 50px;-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:20px;-fx-text-fill:#FEFEDA;");
			HBox hb2 = new HBox(20, bu2);
		    hb2.setPadding(new Insets(65,25,60,60));
		    hb2.setAlignment(Pos.BOTTOM_RIGHT);
		   
		    Circle circle3 = new Circle();//Drawing a Circle
	         circle3.setRadius(10);
	         circle3.setCenterX(30);
			 circle3.setCenterY(89);
	         circle3.setFill(Color.WHITE);//Setting color to the circle
	         circle3.setFill(i1);
		    
	         Circle circle3_3 = new Circle();//Drawing a Circle
	         circle3_3.setRadius(30);
	         circle3_3.setCenterX(90);
			 circle3_3.setCenterY(89);
	         circle3_3.setFill(Color.WHITE);//Setting color to the circle
	         circle3_3.setFill(pattern);
	         circle3_3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
	         Image imager3 = new Image("file:///D:\\A\\e1 (4).jpg");
             ImagePattern patternr3 = new ImagePattern(imager3);
             Image imager4 = new Image("file:///D:\\A\\e1 (1).jpg");
             ImagePattern patternr4 = new ImagePattern(imager4);
             
		    Rectangle re3=new Rectangle(300,250);
			re3.setX(500);
			re3.setY(200);
			re3.setFill(Color.RED);
			re3.setArcHeight(40);
			re3.setArcWidth(40);
			re3.setFill(patternr3);
			re3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
			Rectangle re4=new Rectangle(300,250);
			re4.setX(150);
			re4.setY(200);
			re4.setFill(Color.RED);
			re4.setArcHeight(40);
			re4.setArcWidth(40);
			re4.setFill(patternr4);
			re4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
			
		    Text textc=new Text("----------");
		    textc.setX(350);
		    textc.setY(105);
		   
		    
		    textc.setStyle("-fx-font-family: Impact; -fx-font-size:30px;-fx-text-fill:#FEFEDA;");
			root3.getChildren().add(imageView3);
			root3.getChildren().addAll(re3,re4);
			root3.setTop(hb2);
			root3.getChildren().addAll(circle3,circle3_3,textc);
			Scene scene3 = new Scene(root3,945,640);
			
			//scene 4*
			
            BorderPane root4 = new BorderPane();
			
			Image image4 = new Image("file:///D:\\TOON (1)\\15.png");
			ImageView imageView4 = new ImageView(image4);//Setting the image view 
			imageView4.setFitHeight(640); //setting the fit height and width of the image view
			imageView4.setFitWidth(945);
			imageView4.setPreserveRatio(true);
			
			Button bu4=new Button("HOME");
			bu4.setPrefSize(80, 40);
			bu4.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			HBox hb4 = new HBox(20, bu4);
		    hb4.setPadding(new Insets(20));
		    hb4.setAlignment(Pos.BOTTOM_RIGHT);
			
			root4.getChildren().add(imageView4);
            root4.setBottom(hb4);
			Scene scene4 = new Scene(root4,945,640);
			
//			//scene 5*
               BorderPane root5 = new BorderPane();
            Button ch2= new Button("Choose Picture");
            ch2.setPrefSize(100,90);
            ch2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
            HBox hb5 = new HBox( ch2);
            hb5.setAlignment(Pos.CENTER);
            hb5.setTranslateX(400);
            
			Image image5 = new Image("file:///D:\\TOON (1)\\13_14.png");
			ImageView imageView5 = new ImageView(image5);//Setting the image view 
			imageView5.setFitHeight(640); //setting the fit height and width of the image view
			imageView5.setFitWidth(945);
			imageView5.setPreserveRatio(true);
			
			Button bu5=new Button("BACK");
			bu5.setPrefSize(80, 40);
			bu5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Impact; -fx-font-size:12px;-fx-text-fill:#FEFEDA;");
		   
		    
		    Button bu6=new Button("EDIT");
			bu6.setPrefSize(80, 40);
			bu6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			HBox hb6 = new HBox(20, bu6,bu5,hb5);
			hb6.setPadding(new Insets(65,25,60,60));
			hb6.setAlignment(Pos.BOTTOM_LEFT);
		    
		    
			Circle circle4 = new Circle();//Drawing a Circle
	         circle4.setRadius(120);
	         circle4.setCenterX(720);
			 circle4.setCenterY(320);
	         circle4.setFill(Color.WHITE);//Setting color to the circle
	         circle4.setFill(pattern);
	         circle4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
	         
	         TextField t33 =new TextField();
	         PasswordField t44 = new PasswordField();
	         TextField t55 =new TextField();
			 t33.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 t44.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 t55.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");

			 RadioButton rb11 = new RadioButton("male");
			 RadioButton rb22 = new RadioButton("female");
			 rb11.setStyle("-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 rb22.setStyle("-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			 ToggleGroup Group1 = new ToggleGroup();
			 rb11.setToggleGroup(Group1);
			 rb22.setToggleGroup(Group1);
			 HBox hrb1 =new HBox(40,rb11,rb22);
			 hrb1.setAlignment(Pos.CENTER);
			
			 VBox vb22 = new VBox(20,t33,t55,t44,hrb1,hb6);
			 vb22.setAlignment(Pos.CENTER);
			 vb22.setPadding(new Insets(270,0,300,0));
			 t33.setMaxSize(200,150);
			 t44.setMaxSize(200,150);
			 t55.setMaxSize(200,150);

			 Text tx55 = new Text("User name :");
			 tx55.setX(277);
			 tx55.setY(290);
			 tx55.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx55.setFill(Color.web("#C64159"));
			 
			 Text tx66 = new Text("     Email :");
			 tx66.setX(285);
			 tx66.setY(337);
			 tx66.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx66.setFill(Color.web("#C64159"));
			
			 Text tx77 = new Text("  Password :");
			 tx77.setX(277);
			 tx77.setY(389);
			 tx77.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx77.setFill(Color.web("#C64159"));
			 
			 t1.textProperty().addListener((observable, oldValue, newValue) -> {
				    t33.setText(newValue);
				});

				t2.textProperty().addListener((observable, oldValue, newValue) -> {
				    t44.setText(newValue);
				});
				t5.textProperty().addListener((observable, oldValue, newValue) -> {
				    t55.setText(newValue);
				});
				
			root5.getChildren().addAll(imageView5,circle4);
			root5.setCenter(vb22);
			
			root5.getChildren().addAll(tx55,tx66,tx77);
			Scene scene5 = new Scene(root5,945,640);
			
			// Scene 6
			
			
			// Scene 7
            BorderPane root7 = new BorderPane();
			
			Image image7 = new Image("file:///D:\\TOON (1)\\10.png");
			ImageView imageView7 = new ImageView(image7);//Setting the image view 
			imageView7.setFitHeight(640); //setting the fit height and width of the image view
			imageView7.setFitWidth(945);
			imageView7.setPreserveRatio(true);
			
			  Image imager33 = new Image("file:///D:\\A\\e1 (2).jpg");
	          ImagePattern patternr33 = new ImagePattern(imager33);
	          Image imager44= new Image("file:///D:\\A\\e1 (3).jpg");
	          ImagePattern patternr44 = new ImagePattern(imager44);
	             
			Button bu1_7=new Button("HOME");
			bu1_7.setPrefSize(80, 40);
			bu1_7.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill: #FEFEDA;");
			HBox hb1_7 = new HBox(20, bu1_7);
			hb1_7.setPadding(new Insets(20));
			hb1_7.setAlignment(Pos.BOTTOM_RIGHT);
			
			Rectangle re33=new Rectangle(250,250);
			re33.setX(500);
			re33.setY(200);
			re33.setFill(Color.RED);
			re33.setArcHeight(40);
			re33.setArcWidth(40);
			re33.setFill(patternr33);
			re33.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
			
			Rectangle re44=new Rectangle(250,250);
			re44.setX(200);
			re44.setY(200);
			re44.setFill(Color.RED);
			re44.setArcHeight(40);
			re44.setArcWidth(40);
			re44.setFill(patternr44);
			re44.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);");
			root7.getChildren().add(imageView7);
			root7.getChildren().addAll(re33,re44);
			root7.setBottom(hb1_7);
			Scene scene7 = new Scene(root7,945,640);
			
			//Scene 7_1
			
BorderPane root7_1 = new BorderPane();
			
			Image image7_1 = new Image("file:///D:\\TOON (1)\\11.png");
			ImageView imageView7_1 = new ImageView(image7_1);//Setting the image view 
			imageView7_1.setFitHeight(640); //setting the fit height and width of the image view
			imageView7_1.setFitWidth(945);
			imageView7_1.setPreserveRatio(true);
			
			Image image7_11 = new Image("file:///D:\\A\\71 (2).png");
			ImageView imageView7_11 = new ImageView(image7_11);//Setting the image view 
			imageView7_11.setFitHeight(270); //setting the fit height and width of the image view
			imageView7_11.setFitWidth(270);
			imageView7_11.setX(500);
			imageView7_11.setY(130);
			imageView7_11.setPreserveRatio(true);
			
			Rectangle backb=new Rectangle(80,40);
			backb.setX(30);
			backb.setY(580);
			backb.setFill(Color.web("#73B5C7"));
			backb.setArcHeight(10);
			backb.setArcWidth(10);
			Text back271 =new Text("BACK");
			back271.setX(46);
			back271.setY(608);
			back271.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;");
			back271.setFill(Color.web("#FEFEDA"));
 
			
			
			Button bu17_1=new Button("NEXT");
			bu17_1.setPrefSize(80, 40);
			bu17_1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			HBox hb17_1 = new HBox(20, bu17_1);
		    hb17_1.setPadding(new Insets(20));
		    hb17_1.setAlignment(Pos.BOTTOM_RIGHT);
		    
		    TextField t17_1 =new TextField();
		    t17_1.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
		    VBox vb17_1 = new VBox(t17_1);
			 vb17_1.setAlignment(Pos.CENTER);
			 vb17_1.setPadding(new Insets(350,0,0,330));
			 t17_1.setMaxSize(200,150);
			 
			 Text tx17_1 = new Text("Enter the answer :");
			 tx17_1.setX(377);
			 tx17_1.setY(460);
			 tx17_1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx17_1.setFill(Color.web("#C64159"));
			 
			 Text tx27_1 = new Text("Hint: The word has 9 letters");
			 tx27_1.setX(520);
			 tx27_1.setY(100);
			 tx27_1.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
			 tx27_1.setFill(Color.web("#C64159"));
			
			 
			 
			//game 1
			Image m17_1 =new  Image("file:///D:\\A\\8.png");
	        Image m27_1 =new  Image("file:///D:\\A\\3.png");
	        Image m37_1 =new  Image("file:///D:\\A\\10.png");
	        Image m47_1 =new  Image("file:///D:\\A\\4.png");
	        Image m57_1 =new  Image("file:///D:\\A\\9.png");
	      
	        Image m67_1 =new  Image("file:///D:\\A\\21.png");
	        Image m77_1 =new  Image("file:///D:\\A\\11.png");
	        Image m87_1 =new  Image("file:///D:\\A\\3.png");
	        Image m97_1 =new  Image("file:///D:\\A\\2.png");
	        Image m107_1 =new Image("file:///D:\\A\\5.png");
	        
	        ImagePattern i17_1= new ImagePattern (m17_1,0,0,1,1,true);
	        ImagePattern i27_1= new ImagePattern (m27_1,0,0,1,1,true);
	        ImagePattern i37_1= new ImagePattern (m37_1,0,0,1,1,true);
	        ImagePattern i47_1= new ImagePattern (m47_1,0,0,1,1,true);
	        ImagePattern i57_1= new ImagePattern (m57_1,0,0,1,1,true);
	        
	        ImagePattern i67_1= new ImagePattern (m67_1,0,0,1,1,true);
	        ImagePattern i77_1= new ImagePattern (m77_1,0,0,1,1,true);
	        ImagePattern i87_1= new ImagePattern (m87_1,0,0,1,1,true);
	        ImagePattern i97_1= new ImagePattern (m97_1,0,0,1,1,true);
	        ImagePattern i107_1= new ImagePattern(m107_1,0,0,1,1,true);
	        
	        

 //----------------------------------------------------- row 1		
			Rectangle ree17_1=new Rectangle(40,40);
			ree17_1.setX(720);
			ree17_1.setY(500);
			ree17_1.setFill(i17_1);
	
			Rectangle ree27_1=new Rectangle(40,40);
			ree27_1.setX(670);
			ree27_1.setY(500);
			ree27_1.setFill(i27_1);
			
			Rectangle ree37_1=new Rectangle(40,40);
			ree37_1.setX(620);
			ree37_1.setY(500);
			ree37_1.setFill(i37_1);
			
			Rectangle ree47_1=new Rectangle(40,40);
			ree47_1.setX(570);
			ree47_1.setY(500);
			ree47_1.setFill(i47_1);
			
			Rectangle ree57_1=new Rectangle(40,40);
			ree57_1.setX(520);
			ree57_1.setY(500);
			ree57_1.setFill(i57_1);
	
  //----------------------------------------------------- row 2			
			Rectangle ree67_1=new Rectangle(40,40);
			ree67_1.setX(720);
			ree67_1.setY(550);
			ree67_1.setFill(i67_1);
			
			Rectangle ree77_1=new Rectangle(40,40);
			ree77_1.setX(670);
			ree77_1.setY(550);
			ree77_1.setFill(i77_1);
			
			Rectangle ree87_1=new Rectangle(40,40);
			ree87_1.setX(620);
			ree87_1.setY(550);
			ree87_1.setFill(i87_1);
			
			Rectangle ree97_1=new Rectangle(40,40);
			ree97_1.setX(570);
			ree97_1.setY(550);
			ree97_1.setFill(i97_1);
			
			Rectangle ree107_1=new Rectangle(40,40);
			ree107_1.setX(520);
			ree107_1.setY(550);
			ree107_1.setFill(i107_1);
			
			
			root7_1.getChildren().add(imageView7_1);
			root7_1.getChildren().add(imageView7_11);
			root7_1.getChildren().addAll(tx17_1,tx27_1,backb,back271);
			root7_1.getChildren().addAll(ree17_1,ree27_1,ree37_1,ree47_1,ree57_1,ree67_1,ree77_1,ree87_1,ree97_1,ree107_1);
			
			root7_1.setBottom(hb17_1);
			root7_1.setCenter(vb17_1);
			Scene scene7_1 = new Scene(root7_1,945,640);
			
			
			//Scene 7_2
			
			 BorderPane root7_2 = new BorderPane();
				
				Image image7_2 = new Image("file:///D:\\TOON (1)\\11.png");
				ImageView imageView7_2 = new ImageView(image7_2);//Setting the image view 
				imageView7_2.setFitHeight(640); //setting the fit height and width of the image view
				imageView7_2.setFitWidth(945);
				imageView7_2.setPreserveRatio(true);
				
				Image image7_22 = new Image("file:///D:\\A\\71 (1).png");
				ImageView imageView7_22 = new ImageView(image7_22);//Setting the image view 
				imageView7_22.setFitHeight(270); //setting the fit height and width of the image view
				imageView7_22.setFitWidth(270);
				imageView7_22.setX(500);
				imageView7_22.setY(130);
				imageView7_22.setPreserveRatio(true);
				
				Button bu17_2=new Button("NEXT");
				bu17_2.setPrefSize(80, 40);
				bu17_2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
				HBox hb17_2 = new HBox(20, bu17_2);
			    hb17_2.setPadding(new Insets(20));
			    hb17_2.setAlignment(Pos.BOTTOM_RIGHT);
			    
			    TextField t17_2 =new TextField();
			    t17_2.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
			    VBox vb17_2 = new VBox(20,t17_2);
				 vb17_2.setAlignment(Pos.CENTER);
				 vb17_2.setPadding(new Insets(350,0,0,330));
				 t17_2.setMaxSize(200,150);
				 
				 Text tx17_2 = new Text("Enter the answer :");
				 tx17_2.setX(377);
				 tx17_2.setY(460);
				 tx17_2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
				 tx17_2.setFill(Color.web("#C64159"));
				 
				 Text tx27_2 = new Text("Hint: The word has 6 letters");
				 tx27_2.setX(520);
				 tx27_2.setY(100);
				 tx27_2.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
				 tx27_2.setFill(Color.web("#C64159"));
				
				 
				 
				//game 2
				Image m17_2 =new  Image("file:///D:\\A\\7.png");
		        Image m27_2 =new  Image("file:///D:\\A\\3.png");
		        Image m37_2 =new  Image("file:///D:\\A\\10.png");
		        Image m47_2 =new  Image("file:///D:\\A\\1.png");
		        Image m57_2 =new  Image("file:///D:\\A\\6.png");
		      
		        Image m67_2 =new  Image("file:///D:\\A\\21.png");
		        Image m77_2 =new  Image("file:///D:\\A\\11.png");
		        Image m87_2 =new  Image("file:///D:\\A\\3.png");
		        Image m97_2 =new  Image("file:///D:\\A\\2.png");
		        Image m107_2 =new Image("file:///D:\\A\\5.png");
		        
		        ImagePattern i17_2= new ImagePattern (m17_2,0,0,1,1,true);
		        ImagePattern i27_2= new ImagePattern (m27_2,0,0,1,1,true);
		        ImagePattern i37_2= new ImagePattern (m37_2,0,0,1,1,true);
		        ImagePattern i47_2= new ImagePattern (m47_2,0,0,1,1,true);
		        ImagePattern i57_2= new ImagePattern (m57_2,0,0,1,1,true);
		        
		        ImagePattern i67_2= new ImagePattern (m67_2,0,0,1,1,true);
		        ImagePattern i77_2= new ImagePattern (m77_2,0,0,1,1,true);
		        ImagePattern i87_2= new ImagePattern (m87_2,0,0,1,1,true);
		        ImagePattern i97_2= new ImagePattern (m97_2,0,0,1,1,true);
		        ImagePattern i107_2= new ImagePattern(m107_2,0,0,1,1,true);
		        
		        

	 //----------------------------------------------------- row 1		
				Rectangle ree17_2=new Rectangle(40,40);
				ree17_2.setX(720);
				ree17_2.setY(500);
				ree17_2.setFill(i17_2);
		
				Rectangle ree27_2=new Rectangle(40,40);
				ree27_2.setX(670);
				ree27_2.setY(500);
				ree27_2.setFill(i27_2);
				
				Rectangle ree37_2=new Rectangle(40,40);
				ree37_2.setX(620);
				ree37_2.setY(500);
				ree37_2.setFill(i37_2);
				
				Rectangle ree47_2=new Rectangle(40,40);
				ree47_2.setX(570);
				ree47_2.setY(500);
				ree47_2.setFill(i47_2);
				
				Rectangle ree57_2=new Rectangle(40,40);
				ree57_2.setX(520);
				ree57_2.setY(500);
				ree57_2.setFill(i57_2);
		
	  //----------------------------------------------------- row 2			
				Rectangle ree67_2=new Rectangle(40,40);
				ree67_2.setX(720);
				ree67_2.setY(550);
				ree67_2.setFill(i67_2);
				
				Rectangle ree77_2=new Rectangle(40,40);
				ree77_2.setX(670);
				ree77_2.setY(550);
				ree77_2.setFill(i77_2);
				
				Rectangle ree87_2=new Rectangle(40,40);
				ree87_2.setX(620);
				ree87_2.setY(550);
				ree87_2.setFill(i87_2);
				
				Rectangle ree97_2=new Rectangle(40,40);
				ree97_2.setX(570);
				ree97_2.setY(550);
				ree97_2.setFill(i97_2);
				
				Rectangle ree107_2=new Rectangle(40,40);
				ree107_2.setX(520);
				ree107_2.setY(550);
				ree107_2.setFill(i107_2);
			
				root7_2.getChildren().add(imageView7_2);
				root7_2.getChildren().add(imageView7_22);
				root7_2.getChildren().addAll(tx17_2,tx27_2);
				root7_2.getChildren().addAll(ree17_2,ree27_2,ree37_2,ree47_2,ree57_2,ree67_2,ree77_2,ree87_2,ree97_2,ree107_2);
				root7_2.setBottom(hb17_2);
				root7_2.setCenter(vb17_2);
				Scene scene7_2 = new Scene(root7_2,945,640);
				
			
			//Scene 7_3
				
				 BorderPane root7_3 = new BorderPane();
					
					Image image7_3 = new Image("file:///D:\\TOON (1)\\11.png");
					ImageView imageView7_3 = new ImageView(image7_3);//Setting the image view 
					imageView7_3.setFitHeight(640); //setting the fit height and width of the image view
					imageView7_3.setFitWidth(945);
					imageView7_3.setPreserveRatio(true);
					
					Image image7_33 = new Image("file:///D:\\A\\71 (3).png");
					ImageView imageView7_33 = new ImageView(image7_33);//Setting the image view 
					imageView7_33.setFitHeight(270); //setting the fit height and width of the image view
					imageView7_33.setFitWidth(270);
					imageView7_33.setX(500);
					imageView7_33.setY(130);
					imageView7_33.setPreserveRatio(true);
					
					Button bu17_3=new Button("HOME");
					bu17_3.setPrefSize(80, 40);
					bu17_3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					HBox hb17_3 = new HBox(20, bu17_3);
				    hb17_3.setPadding(new Insets(20));
				    hb17_3.setAlignment(Pos.BOTTOM_RIGHT);
				    
				    TextField t17_3 =new TextField();
				    t17_3.setStyle("-fx-background-color: #FFFFFF;-fx-font-family: Comic Sans MS;-fx-font-weight: bold; -fx-font-size: 12px;-fx-text-fill:#DF7373;");
				    VBox vb17_3 = new VBox(20,t17_3);
					 vb17_3.setAlignment(Pos.CENTER);
					 vb17_3.setPadding(new Insets(350,0,0,330));
					 t17_3.setMaxSize(200,150);
					 
					 Text tx17_3 = new Text("Enter the answer :");
					 tx17_3.setX(377);
					 tx17_3.setY(460);
					 tx17_3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
					 tx17_3.setFill(Color.web("#C64159"));
					 
					 Text tx27_3 = new Text("Hint: The word has 3 letters");
					 tx27_3.setX(520);
					 tx27_3.setY(100);
					 tx27_3.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
					 tx27_3.setFill(Color.web("#C64159"));
					
					 
					 
					//game 3
					Image m17_3 =new  Image("file:///D:\\A\\6.png");
			        Image m27_3 =new  Image("file:///D:\\A\\12.png");
			        Image m37_3 =new  Image("file:///D:\\A\\7.png");
			        Image m47_3 =new  Image("file:///D:\\A\\1.png");
			        Image m57_3 =new  Image("file:///D:\\A\\9.png");
			      
			        Image m67_3 =new  Image("file:///D:\\A\\21.png");
			        Image m77_3 =new  Image("file:///D:\\A\\13.png");
			        Image m87_3 =new  Image("file:///D:\\A\\8.png");
			        Image m97_3 =new  Image("file:///D:\\A\\20.png");
			        Image m107_3 =new Image("file:///D:\\A\\11.png");
			        
			        ImagePattern i17_3= new ImagePattern (m17_3,0,0,1,1,true);
			        ImagePattern i27_3= new ImagePattern (m27_3,0,0,1,1,true);
			        ImagePattern i37_3= new ImagePattern (m37_3,0,0,1,1,true);
			        ImagePattern i47_3= new ImagePattern (m47_3,0,0,1,1,true);
			        ImagePattern i57_3= new ImagePattern (m57_3,0,0,1,1,true);
			        
			        ImagePattern i67_3= new ImagePattern (m67_3,0,0,1,1,true);
			        ImagePattern i77_3= new ImagePattern (m77_3,0,0,1,1,true);
			        ImagePattern i87_3= new ImagePattern (m87_3,0,0,1,1,true);
			        ImagePattern i97_3= new ImagePattern (m97_3,0,0,1,1,true);
			        ImagePattern i107_3= new ImagePattern(m107_3,0,0,1,1,true);
			        
			        

		 //----------------------------------------------------- row 1		
					Rectangle ree17_3=new Rectangle(40,40);
					ree17_3.setX(720);
					ree17_3.setY(500);
					ree17_3.setFill(i17_3);
			
					Rectangle ree27_3=new Rectangle(40,40);
					ree27_3.setX(670);
					ree27_3.setY(500);
					ree27_3.setFill(i27_3);
					
					Rectangle ree37_3=new Rectangle(40,40);
					ree37_3.setX(620);
					ree37_3.setY(500);
					ree37_3.setFill(i37_3);
					
					Rectangle ree47_3=new Rectangle(40,40);
					ree47_3.setX(570);
					ree47_3.setY(500);
					ree47_3.setFill(i47_3);
					
					Rectangle ree57_3=new Rectangle(40,40);
					ree57_3.setX(520);
					ree57_3.setY(500);
					ree57_3.setFill(i57_3);
			
		  //----------------------------------------------------- row 2			
					Rectangle ree67_3=new Rectangle(40,40);
					ree67_3.setX(720);
					ree67_3.setY(550);
					ree67_3.setFill(i67_3);
					
					Rectangle ree77_3=new Rectangle(40,40);
					ree77_3.setX(670);
					ree77_3.setY(550);
					ree77_3.setFill(i77_3);
					
					Rectangle ree87_3=new Rectangle(40,40);
					ree87_3.setX(620);
					ree87_3.setY(550);
					ree87_3.setFill(i87_3);
					
					Rectangle ree97_3=new Rectangle(40,40);
					ree97_3.setX(570);
					ree97_3.setY(550);
					ree97_3.setFill(i97_3);
					
					Rectangle ree107_3=new Rectangle(40,40);
					ree107_3.setX(520);
					ree107_3.setY(550);
					ree107_3.setFill(i107_3);
					
		
					root7_3.getChildren().add(imageView7_3);
					root7_3.getChildren().add(imageView7_33);
					root7_3.getChildren().addAll(tx17_3,tx27_3);
					root7_3.getChildren().addAll(ree17_3,ree27_3,ree37_3,ree47_3,ree57_3,ree67_3,ree77_3,ree87_3,ree97_3,ree107_3);
					
					root7_3.setBottom(hb17_3);
					root7_3.setCenter(vb17_3);
					Scene scene7_3 = new Scene(root7_3,945,640);
			
			//Scene 7_4
			
            BorderPane root7_4 = new BorderPane();
			
			Image image7_4 = new Image("file:///D:\\TOON (1)\\12.png");
			ImageView imageView7_4 = new ImageView(image7_4);//Setting the image view 
			imageView7_4.setFitHeight(640); //setting the fit height and width of the image view
			imageView7_4.setFitWidth(945);
			imageView7_4.setPreserveRatio(true);
			
			bu17_4=new Button("NEXT");
			bu17_4.setPrefSize(80, 40);
			bu17_4.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			HBox hb17_4 = new HBox(20, bu17_4);
			hb17_4.setPadding(new Insets(20));
			hb17_4.setAlignment(Pos.BOTTOM_LEFT);
			
			
			Button bu27_4=new Button("PHANTASY");
			bu27_4.setPrefSize(120, 60);
			bu27_4.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			Button bu37_4=new Button("FANTASY");
			bu37_4.setPrefSize(120, 60);
			bu37_4.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			Button bu74=new Button("CREATIVITY");
			bu74.setPrefSize(120, 60);
			bu74.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			
			HBox hb27_4 = new HBox(20, bu27_4,bu37_4,bu74);
			hb27_4.setPadding(new Insets(100,100,10,100));
			hb27_4.setAlignment(Pos.CENTER_LEFT);
			Text t17_4 =new Text();
			t17_4.setText("Synonym of the word imagination"); //Setting the text to be added. 
			t17_4.setX(125); //setting the position of the text 
			t17_4.setY(250); 
			t17_4.setFont(Font.font("Impact",25));
			t17_4.setFill(Color.web("#7B7C90"));//Setting the color
			root7_4.getChildren().add(imageView7_4);
			root7_4.getChildren().add(t17_4);
			root7_4.setCenter(hb27_4);
            root7_4.setBottom(hb17_4);
            
            
			Scene scene7_4 = new Scene(root7_4,945,640);
			
			//Scene 7_5
			
			 BorderPane root7_5 = new BorderPane();
				
				Image image7_5 = new Image("file:///D:\\TOON (1)\\12.png");
				ImageView imageView7_5 = new ImageView(image7_5);//Setting the image view 
				imageView7_5.setFitHeight(640); //setting the fit height and width of the image view
				imageView7_5.setFitWidth(945);
				imageView7_5.setPreserveRatio(true);
				
				bu17_5=new Button("NEXT");
				bu17_5.setPrefSize(80, 40);
				bu17_5.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
				HBox hb17_5 = new HBox(20, bu17_5);
				hb17_5.setPadding(new Insets(20));
				hb17_5.setAlignment(Pos.BOTTOM_LEFT);
				
				
				Button bu27_5=new Button("A");
				bu27_5.setPrefSize(120, 60);
				bu27_5.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
				Button bu37_5=new Button("C");
				bu37_5.setPrefSize(120, 60);
				bu37_5.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
				Button bu75=new Button("R");
				bu75.setPrefSize(120, 60);
				bu75.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
				
				HBox hb27_5 = new HBox(20, bu27_5,bu37_5,bu75);
				hb27_5.setPadding(new Insets(100,100,10,100));
				hb27_5.setAlignment(Pos.CENTER_LEFT);
				Text t17_5 =new Text();
				t17_5.setText("If you want to disable the interface (run)\n press the Windows sign and the letter:"); //Setting the text to be added. 
				t17_5.setX(100); //setting the position of the text 
				t17_5.setY(250); 
				t17_5.setFont(Font.font("Impact",25));
				t17_5.setFill(Color.web("#7B7C90"));//Setting the color
				root7_5.getChildren().add(imageView7_5);
				root7_5.getChildren().add(t17_5);
				root7_5.setCenter(hb27_5);
	            root7_5.setBottom(hb17_5);
	            
			
				Scene scene7_5 = new Scene(root7_5,945,640);
				
				
			//Scene 7_6
			
				
				BorderPane root7_6 = new BorderPane();
				   
				   Circle cc=new Circle();
					cc.setRadius(20);
			        cc.setCenterX(842);
					cc.setCenterY(150);
					cc.setFill(Color.TRANSPARENT);
					Image image7_6 = new Image("file:///D:\\TOON (1)\\12.png");
					ImageView imageView7_6 = new ImageView(image7_6);//Setting the image view 
					imageView7_6.setFitHeight(640); //setting the fit height and width of the image view
					imageView7_6.setFitWidth(945);
					imageView7_6.setPreserveRatio(true);
					
					bu17_6=new Button("NEXT");
					bu17_6.setPrefSize(80, 40);
					bu17_6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					HBox hb17_6 = new HBox(20, bu17_6);
					hb17_6.setPadding(new Insets(20));
					hb17_6.setAlignment(Pos.BOTTOM_LEFT);
					
					
					Button bu27_6=new Button("HER");
					bu27_6.setPrefSize(120, 60);
					bu27_6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					Button bu37_6=new Button("SHE");
					bu37_6.setPrefSize(120, 60);
					bu37_6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					Button bu76=new Button("THEY");
					bu76.setPrefSize(120, 60);
					bu76.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					
					HBox hb27_6 = new HBox(20, bu27_6,bu37_6,bu76);
					hb27_6.setPadding(new Insets(100,100,10,100));
					hb27_6.setAlignment(Pos.CENTER_LEFT);
					Text t17_6 =new Text();
					t17_6.setText("In English: What is the wording of favor \n when referring to someone who is a man?"); //Setting the text to be added. 
					t17_6.setX(100); //setting the position of the text 
					t17_6.setY(250); 
					t17_6.setFont(Font.font("Impact",25));
					t17_6.setFill(Color.web("#7B7C90"));//Setting the color
					root7_6.getChildren().add(imageView7_6);
					root7_6.getChildren().add(t17_6);
					root7_6.setCenter(hb27_6);
		            root7_6.setBottom(hb17_6);
		            root7_6.getChildren().add(cc);
				
					Scene scene7_6 = new Scene(root7_6,945,640);
					
			//Scene 8
			

			        //Background image
			        Image image88= new Image("file:///D:\\TOON (1)\\5_9.png"); 
			        ImageView imageView88 = new ImageView(image88);
			        imageView88.setFitHeight(640);
			        imageView88.setFitWidth(945);
			        imageView88.setPreserveRatio(true);
			        
			        BorderPane pane = new BorderPane();
			        
			        //Courses pictures
			        HBox center = new HBox(45);
			        center.setPadding(new Insets(100,15,15,30));  
			        
			        Image javaImg = new Image("file:///D:\\A\\Java.png");                
			        ImagePattern javaPat = new ImagePattern(javaImg);
			        
			        Rectangle javaRec = new Rectangle();
			        javaRec.setHeight(200);
			        javaRec.setWidth(266);
			        javaRec.setFill(javaPat);
			        javaRec.setStroke(Color.web("#92A7C2"));
			        javaRec.setStrokeWidth(2);
			        
			        //Image pythonImg = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\Python.jpeg");
			        Image pythonImg = new Image("file:///D:\\A\\Python.jpeg");                 
			        ImagePattern pythonPat = new ImagePattern(pythonImg);
			        
			        Rectangle pythonRec = new Rectangle();
			        pythonRec.setHeight(200);
			        pythonRec.setWidth(266);
			        pythonRec.setFill(pythonPat);
			        pythonRec.setStroke(Color.web("#92A7C2"));
			        pythonRec.setStrokeWidth(2);
			        
			        //Image htmlImg = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\html.jpg");
			        Image htmlImg = new Image("file:///D:\\A\\html.jpg");                
			        ImagePattern htmlPat = new ImagePattern(htmlImg);
			        
			        Rectangle htmlRec = new Rectangle();
			        htmlRec.setHeight(200);
			        htmlRec.setWidth(266);
			        htmlRec.setFill(htmlPat);
			        htmlRec.setStroke(Color.web("#92A7C2"));
			        htmlRec.setStrokeWidth(2);
			        
			        center.getChildren().addAll(javaRec,pythonRec,htmlRec);
			        pane.setTop(center); 
			        
			        // to Add New Coursee  Pic
			        HBox coursesRow2 = new HBox(45);
			        coursesRow2.setPadding(new Insets(15,15,15,30));
			        
			        Rectangle newCoursePic1 = new Rectangle();
			        newCoursePic1.setHeight(200);
			        newCoursePic1.setWidth(266);
			        newCoursePic1.setFill(Color.ALICEBLUE);
			        newCoursePic1.setStroke(Color.web("#92A7C2"));
			        newCoursePic1.setStrokeWidth(2);
			        
			        Rectangle newCoursePic2 = new Rectangle();
			        newCoursePic2.setHeight(200);
			        newCoursePic2.setWidth(266);
			        newCoursePic2.setFill(Color.ALICEBLUE);
			        newCoursePic2.setStroke(Color.web("#92A7C2"));
			        newCoursePic2.setStrokeWidth(2);
			        
			        Rectangle newCoursePic3 = new Rectangle();
			        newCoursePic3.setHeight(200);
			        newCoursePic3.setWidth(266);
			        newCoursePic3.setFill(Color.ALICEBLUE);
			        newCoursePic3.setStroke(Color.web("#92A7C2"));
			        newCoursePic3.setStrokeWidth(2);
			            
			        // Add button
			        HBox bottom = new HBox();
			        bottom.setPadding(new Insets(15,15,28,26));
			        
			        GridPane grid = new GridPane();
			        grid.setHgap(745);

			        Button back = new Button("Back");
			        back.setPrefHeight(40);
			        back.setPrefWidth(80);
			        back.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        
			        Button add = new Button("+");
			        add.setPrefHeight(50);
			        add.setPrefWidth(50);
			        add.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 19px;-fx-text-fill:#FEFEDA;");
			        
			        grid.add(back, 0, 0);
			        grid.add(add, 1, 0);
			        
			        bottom.getChildren().addAll(grid);
			        pane.setBottom(bottom);
			        
			        ////// Java course action
			        javaRec.setOnMouseClicked(e ->{
			            
			            if(e.getButton() == MouseButton.PRIMARY){
			            	primaryStage.setScene(JavaCourseInfo);
			            	primaryStage.show();  
			            }      
			        });
			        
			        ////// Python course action
			        pythonRec.setOnMouseClicked(e ->{
			            if(e.getButton() == MouseButton.PRIMARY){
			            	primaryStage.setScene(PythonCourseInfo);
			            	primaryStage.show();  
			            }      
			        });
			        
			        ////// HTML course action
			        htmlRec.setOnMouseClicked(e ->{
			            if(e.getButton() == MouseButton.PRIMARY){
			            	primaryStage.setScene(HtmlCourseInfo);
			            primaryStage.show();  
			            }      
			        });
			        
			        /////// Add action
			        add.setOnAction(e ->{
			        	primaryStage.setScene(CreateCourseScene);
			            primaryStage.show();
			        });
			        
			        CourseScene = new Scene(new StackPane(imageView88,pane),945,640);
			        
			        //   Jawaher page 9 For Create Course *******************************************************************************************************************************************************************************
			        
			        // the backround image for main content
			        //Image image1 = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\Courses.png"); 
			        ImageView imageViewPg9 = new ImageView(image88);
			        imageViewPg9.setFitHeight(640);
			        imageViewPg9.setFitWidth(945); 
			        imageViewPg9.setPreserveRatio(true);
			        
			        // Rectangle to hold the image user choose to the course
			        Rectangle CoursePicture = new Rectangle(250,250);
			        CoursePicture.setArcHeight(35);  
			        CoursePicture.setArcWidth(35);
			        CoursePicture.setFill(Color.TRANSPARENT);
			        CoursePicture.setStroke(Color.web("#92A7C2"));
			        CoursePicture.setStrokeWidth(5);
			        
			        Button AddCoursePicture =  new Button("Add Course Picture");
			        AddCoursePicture.setPrefSize(150, 40);
			        AddCoursePicture.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;"); //  12px
			        
			        // Course Name:
			        Label label7  = new Label("Enter Course Name :");
			        label7.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        
			        Label label9  = new Label();// to chack if the course name exsits
			        label9.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#E88482;");

			        TextField CourseName = new TextField();
			        CourseName.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");

			        // a Description for the course
			        Label label8  = new Label("Enter Description for the Course :");
			        label8.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        TextArea TextDescription = new TextArea();
			        TextDescription.setWrapText(true);
			        TextDescription.setPrefWidth(300);
			        TextDescription.setPrefHeight(150);
			        TextDescription.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");

			        VBox box  = new VBox(15);
			        box.setPadding(new Insets(13,0,0,0));
			        box.getChildren().add(label7);
			        box.getChildren().add(CourseName);
			        box.getChildren().add(label9);        
			        box.getChildren().add(label8);
			        box.getChildren().add(TextDescription);
			        
			        Button CreateCourse =  new Button("Create");
			        CreateCourse.setPrefSize(70, 30);
				CreateCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");  // 12px

			        Button MakeQuestions =  new Button("Add Questions");
			        MakeQuestions.setPrefSize(130, 40);
				MakeQuestions.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        Button AddVideo =  new Button("Add Video");
			        AddVideo.setPrefSize(100, 40);
				AddVideo.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;"); 
			        
			        Button backCourse = new Button("Back");
			        backCourse.setPrefHeight(30);
			        backCourse.setPrefWidth(70);
			        backCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        HBox bottomBtns = new HBox(750);
			        bottomBtns.setPadding(new Insets(15,15,15,20));
			        bottomBtns.getChildren().addAll(backCourse,CreateCourse);

			        // content of the  add Questions
			        Label label6  = new Label("* Note: you Can Only Add 3 Questions *");
			        label6.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#E88482;");
			        
			        Label label1  = new Label("Question:");
			        label1.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        TextField text18 = new TextField();
			        text18.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");
			        
			        Label label2  = new Label("1- The Correct Answer:");
			        label2.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        TextField text28 = new TextField();
			        text28.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");
			        
			        Label label3  = new Label("2- The Wrong Answer:");
			        label3.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        TextField text38 = new TextField();
			        text38.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");
			        
			        Label label4  = new Label("3- The Wrong Answer:");
			        label4.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        TextField text4 = new TextField();
			        text4.setStyle("-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#74B5C7;");

			        Label label5  = new Label(); // to error masege 
			        label5.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill: #E88482;");
			        
			        Button AddQuestion =  new Button("Add");
			        AddQuestion.setPrefSize(80, 40);
				AddQuestion.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;");
			        
			        ButtonType OK = new ButtonType("Cancel / OK");

			        // the content of the Questions
			        GridPane QuestionsGrid = new  GridPane(); 
			        QuestionsGrid.setHgap(30);
			        QuestionsGrid.setVgap(20);
			        QuestionsGrid.setPadding(new Insets(50,10,10,10));
			        //GridDialog.setGridLinesVisible(true);

			        QuestionsGrid.add(label6, 1, 0,2,1);
			        QuestionsGrid.add(label1, 0, 1);
			        QuestionsGrid.add(text18, 1, 1);
			        
			        QuestionsGrid.add(label2, 0, 2);
			        QuestionsGrid.add(text28, 1, 2);
			        
			        QuestionsGrid.add(label3, 0, 3);
			        QuestionsGrid.add(text38, 1, 3);
			        
			        QuestionsGrid.add(label4, 0, 4);
			        QuestionsGrid.add(text4, 1, 4);

			        QuestionsGrid.add(label5, 1, 5,3,1);
			        QuestionsGrid.add(AddQuestion, 1, 6,2,1);
			        
			        VBox QuestionBox = new VBox(20);
			        QuestionBox.setPadding(new Insets(10,10,10,10));
			        
			        Label LQ1 = new Label();// 1 Question
			        Label LA1 = new Label(); 
			        Label LA2 = new Label();
			        Label LA3 = new Label();

			        Label LQ2 = new Label();// 2 Question
			        Label LA4 = new Label(); 
			        Label LA5 = new Label();
			        Label LA6 = new Label();

			        Label LQ3 = new Label();// 3 Question
			        Label LA7 = new Label(); 
			        Label LA8 = new Label();
			        Label LA9 = new Label();

			        LQ1.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA1.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA2.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA3.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");

			        LQ2.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA4.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA5.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA6.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");

			        LQ3.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA7.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA8.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");
			        LA9.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");

			        HBox A1 = new HBox(10);
			        A1.getChildren().add(LA1);
			        A1.getChildren().add(LA2);
			        A1.getChildren().add(LA3);
			        A1.setAlignment(Pos.CENTER);

			        HBox A2 = new HBox(10);
			        A2.getChildren().add(LA4);
			        A2.getChildren().add(LA5);
			        A2.getChildren().add(LA6);
			        A2.setAlignment(Pos.CENTER);

			        HBox A3 = new HBox(10);
			        A3.getChildren().add(LA7);
			        A3.getChildren().add(LA8);
			        A3.getChildren().add(LA9);
			        A3.setAlignment(Pos.CENTER);

			        QuestionBox.getChildren().add(LQ1);
			        QuestionBox.getChildren().add(A1);
			        QuestionBox.getChildren().add(LQ2);
			        QuestionBox.getChildren().add(A2);
			        QuestionBox.getChildren().add(LQ3);
			        QuestionBox.getChildren().add(A3);
			        QuestionBox.setAlignment(Pos.CENTER);

			        BorderPane QuestionsBorder = new BorderPane();
			        QuestionsBorder.setPadding(new Insets(10,10,0,10));

			        QuestionsBorder.setLeft(QuestionsGrid);               
			        QuestionsBorder.setCenter(QuestionBox);

			        DialogPane QuestionDialogPane = new DialogPane();
			        QuestionDialogPane.setGraphic(QuestionsBorder);
			        QuestionDialogPane.getButtonTypes().add(OK);
			        QuestionDialogPane.setBackground(new Background(new BackgroundImage(image88,BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, null, null)));
			        
			        Dialog QuestionDialog = new Dialog();
			        QuestionDialog.setDialogPane(QuestionDialogPane);
			        
			        // Array For All Question and Answer For Course 1
			        ObservableList<String> QuestionCourse1 = FXCollections.observableArrayList();
			        ObservableList<String> Answer1Course1 = FXCollections.observableArrayList();
			        ObservableList<String> Answer2Course1 = FXCollections.observableArrayList();
			        ObservableList<String> Answer3Course1 = FXCollections.observableArrayList(); 
			        
			        // Array For All Question and Answer For Course 2 
			        ObservableList<String> QuestionCourse2 = FXCollections.observableArrayList();
			        ObservableList<String> Answer1Course2 = FXCollections.observableArrayList();
			        ObservableList<String> Answer2Course2 = FXCollections.observableArrayList();
			        ObservableList<String> Answer3Course2 = FXCollections.observableArrayList();
			        
			        // Array For All Question and Answer For Course 3
			        ObservableList<String> QuestionCourse3 = FXCollections.observableArrayList();
			        ObservableList<String> Answer1Course3 = FXCollections.observableArrayList();
			        ObservableList<String> Answer2Course3 = FXCollections.observableArrayList();
			        ObservableList<String> Answer3Course3 = FXCollections.observableArrayList();
			        
			        ObservableList<String> NameCourse = FXCollections.observableArrayList(); 
			        ObservableList<String> DescriptionCourse = FXCollections.observableArrayList(); 
			        
			        ObservableList<String> video = FXCollections.observableArrayList(); 

			        
			        BorderPane createPage = new BorderPane();
			        
			        // the main content in the page
			        GridPane Grid = new  GridPane();
			        Grid.setHgap(30);
			        Grid.setVgap(30);
			        Grid.setPadding(new Insets(80,10,10,35));
			        //Grid.setGridLinesVisible(true);
			        
			        ColumnConstraints column1 = new ColumnConstraints();
			        column1.setHalignment(HPos.CENTER);
			        Grid.getColumnConstraints().add(column1);
			       
			        Grid.add(CoursePicture,0,0);
			        Grid.add(AddCoursePicture,0,1);
			        Grid.add(MakeQuestions,0,2);
			        Grid.add(AddVideo,0,3);
			        Grid.add(box,1,0);
			        
			        createPage.setBottom(bottomBtns);
			        createPage.setCenter(Grid); 
			        
			        StackPane Pane = new StackPane (imageViewPg9,createPage); // ImageView baclrond  +  BorderPane
			        CreateCourseScene = new Scene(Pane, 945,640); 
			        
			        // All Action in page 9 (Creat Course Page) ////////////////////////////////////////
			        
			        AddCoursePicture.setOnAction(e -> {
			        
			            FileChooser fileChooser = new FileChooser();
			            
			            fileChooser.getExtensionFilters().addAll(
			                new FileChooser.ExtensionFilter("All Images", "."),
			                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
			                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
			                new FileChooser.ExtensionFilter("PNG", "*.png"));
			            
			            filePic = fileChooser.showOpenDialog(null);
			             
			            String link = "file:"+ filePic.getPath();
			            Image imageSave = new Image(link);
			            ImagePattern  pattern81 = new ImagePattern(imageSave);
			            CoursePicture.setFill(pattern81); 
			                      
			        }); 
			        
			        MakeQuestions.setOnAction(e -> {
			        
			            QuestionDialog.showAndWait();
			        });
			        
			        AddQuestion.setOnAction(e->{
			            
			            if  (QuestionCourse1.isEmpty()  | (numCourse == 0) ){ 
			                
			                // to check If any of the TextFields are empty
			                if ( text18.getText().isEmpty() | text28.getText().isEmpty() | text38.getText().isEmpty() | text4.getText().isEmpty()  ){
			                    label5.setText("* Enter the Question and answers *");
			                }
			                // to check If the Question is already exist in the list
			                else if (QuestionCourse1.contains(text1.getText()) ) {
			                    label5.setText("* The Question already inserted *");
			                }
			                else if (QuestionCourse1.size() == 3 ) {
			                    label5.setText("* Sorry, you can only add 3 questions *");
			                }
			                else{
			                    label5.setText("* Added successfully in course 1 *");
			                    QuestionCourse1.add( text18.getText()); 
			                    Answer1Course1.add( text28.getText()); 
			                    Answer2Course1.add( text38.getText()); 
			                    Answer3Course1.add( text4.getText()); 
			                    
			                    if ((QuestionCourse1.size() == 3)){

			                        LQ1.setText(QuestionCourse1.get(0)); // 1 Question
			                        LA1.setText(Answer1Course1.get(0)); 
			                        LA2.setText(Answer2Course1.get(0)); 
			                        LA3.setText(Answer3Course1.get(0)); 

			                        LQ2.setText(QuestionCourse1.get(1)); // 2 Question
			                        LA4.setText(Answer1Course1.get(1)); 
			                        LA5.setText(Answer2Course1.get(1)); 
			                        LA6.setText(Answer3Course1.get(1)); 
			                        
			                        LQ3.setText(QuestionCourse1.get(2)); // 3 Question 
			                        LA7.setText(Answer1Course1.get(2)); 
			                        LA8.setText(Answer2Course1.get(2)); 
			                        LA9.setText(Answer3Course1.get(2)); 
			                    }
			                }
			                text18.clear();
			                text28.clear();
			                text38.clear();
			                text4.clear();
			                
			            } 
			            else if (QuestionCourse2.isEmpty() |  (numCourse == 1)){ 
			                
			                // to check If any of the TextFields are empty
			                if ( text18.getText().isEmpty() | text28.getText().isEmpty() | text38.getText().isEmpty() | text4.getText().isEmpty()  ){
			                    label5.setText("* Enter the Question and answers *");
			                }
			                // to check If the Question is already exist in the list
			                else if (QuestionCourse2.contains(text18.getText()) ) {
			                    label5.setText("* The Question already inserted *");
			                }
			                else if (QuestionCourse2.size() == 3 ) {
			                    label5.setText("* Sorry, you can only add 3 questions *");
			                }
			                else{
			                    label5.setText("* Add successfully in course 2 *");
			                    QuestionCourse2.add( text18.getText()); 
			                    Answer1Course2.add( text28.getText()); 
			                    Answer2Course2.add( text38.getText()); 
			                    Answer3Course2.add( text4.getText()); 
			                    
			                    if ((QuestionCourse2.size() == 3)){

			                        LQ1.setText(QuestionCourse2.get(0)); // 1 Question
			                        LA1.setText(Answer1Course2.get(0)); 
			                        LA2.setText(Answer2Course2.get(0)); 
			                        LA3.setText(Answer3Course2.get(0)); 

			                        LQ2.setText(QuestionCourse2.get(1)); // 2 Question
			                        LA4.setText(Answer1Course2.get(1)); 
			                        LA5.setText(Answer2Course2.get(1)); 
			                        LA6.setText(Answer3Course2.get(1)); 
			                        
			                        LQ3.setText(QuestionCourse2.get(2)); // 3 Question 
			                        LA7.setText(Answer1Course2.get(2)); 
			                        LA8.setText(Answer2Course2.get(2)); 
			                        LA9.setText(Answer3Course2.get(2)); 
			                    } 
			                }
			                text18.clear();
			                text28.clear();
			                text38.clear();
			                text4.clear();
			               
			            }
			            else if (QuestionCourse3.isEmpty() | (numCourse == 2) ){ 
			                
			                // to check If any of the TextFields are empty
			                if ( text18.getText().isEmpty() | text28.getText().isEmpty() | text38.getText().isEmpty() | text4.getText().isEmpty()  ){
			                    label5.setText("* Enter the Question and answers *");
			                }
			                // to check If the Question is already exist in the list
			                else if (QuestionCourse3.contains(text1.getText()) ) {
			                    label5.setText("* The Question already inserted *");
			                }
			                else if (QuestionCourse3.size() == 3 ) {
			                    label5.setText("* Sorry, you can only add 3 questions *");
			                }
			                else{
			                    label5.setText("* Add successfully in course 3 *");
			                    QuestionCourse3.add( text18.getText()); 
			                    Answer1Course3.add( text28.getText()); 
			                    Answer2Course3.add( text38.getText()); 
			                    Answer3Course3.add( text4.getText()); 
			                    
			                    if ((QuestionCourse3.size() == 3)){

			                        LQ1.setText(QuestionCourse3.get(0)); // 1 Question
			                        LA1.setText(Answer1Course3.get(0)); 
			                        LA2.setText(Answer2Course3.get(0)); 
			                        LA3.setText(Answer3Course3.get(0)); 

			                        LQ2.setText(QuestionCourse3.get(1)); // 2 Question
			                        LA4.setText(Answer1Course3.get(1)); 
			                        LA5.setText(Answer2Course3.get(1)); 
			                        LA6.setText(Answer3Course3.get(1)); 
			                        
			                        LQ3.setText(QuestionCourse3.get(2)); // 3 Question 
			                        LA7.setText(Answer1Course3.get(2)); 
			                        LA8.setText(Answer2Course3.get(2)); 
			                        LA9.setText(Answer3Course3.get(2)); 
			                    }
			                }
			                text18.clear();
			                text28.clear();
			                text38.clear();
			                text4.clear();  
			            }
			            
			            else{
			                label5.setText("Soory, Something went Wrong");
			            }
			        });
			        
			        CreateCourse.setOnAction(e -> {
			            
			            if (NameCourse.contains(CourseName.getText())) {
			                label9.setText("* This Course Already Exists *");
			            }
			            
			            else {
			                
			                numCourse++;
			                NameCourse.add(CourseName.getText());
			                DescriptionCourse.add(TextDescription.getText());
			                
			                label9.setText("");
			                
			                ButtonType APPLY = new ButtonType("APPLY");
			                Label messege = new Label("Course Created successfully");
			                messege.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill:#635A8F;");

			                DialogPane SuccessfullDialogPane = new DialogPane();

			                if (numCourse > 3){
			                    messege.setText("Sorry, the system currently only allows 3 courses to be added.");
			                    numCourse--;   
			                }
			                else if (numCourse == 1){

			                    String link = "file:"+ filePic.getPath();
			                    Image imageSave = new Image(link);
			                    ImagePattern  pattern82 = new ImagePattern(imageSave);         
			                    newCoursePic1.setFill(pattern82);
			                    coursesRow2.getChildren().add(newCoursePic1);
			                }
			                else if (numCourse == 2){

			                    String link = "file:"+ filePic.getPath();
			                    Image imageSave = new Image(link);
			                    ImagePattern  pattern88 = new ImagePattern(imageSave);         
			                    newCoursePic2.setFill(pattern88);
			                    coursesRow2.getChildren().add(newCoursePic2);
			                }
			                else if (numCourse == 3){

			                    String link = "file:"+ filePic.getPath();
			                    Image imageSave = new Image(link);
			                    ImagePattern  pattern8 = new ImagePattern(imageSave);         
			                    newCoursePic3.setFill(pattern8);
			                    coursesRow2.getChildren().add(newCoursePic3);
			                }
			                
			                
			                Image imageDialog = new Image("file:/Users/user/Downloads/DailogImage.jpeg"); 

			                SuccessfullDialogPane.setContent(messege);
			                SuccessfullDialogPane.getButtonTypes().add(APPLY);
			                SuccessfullDialogPane.setBackground(new Background(new BackgroundImage(imageDialog,BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, null, null)));

			                Dialog SuccessfullDialog = new Dialog();
			                SuccessfullDialog.setDialogPane(SuccessfullDialogPane);
			                SuccessfullDialog.showAndWait();

			                CourseName.clear();
			                TextDescription.clear();
			                CoursePicture.setFill(Color.TRANSPARENT);
			                text18.clear(); 
			                text28.clear(); 
			                text38.clear(); 
			                text4.clear();  
			                LQ1.setText("");
			                LA1.setText("");
			                LA2.setText("");
			                LA3.setText("");
			                
			                LQ2.setText("");
			                LA4.setText("");
			                LA5.setText("");
			                LA6.setText("");
			                
			                LQ3.setText("");
			                LA7.setText("");
			                LA8.setText("");
			                LA9.setText("");
			                
			                label5.setText("");

			                pane.setCenter(coursesRow2);

			                primaryStage.setScene(CourseScene);
			                primaryStage.show(); 
			            } 
			        });
			        
			        backCourse.setOnAction(e  -> {
			        
			        	primaryStage.setScene(CourseScene);
			            primaryStage.show(); 
			        });
			        
			        
			        // Jood page 6 For Courses Information *******************************************************************************************************************************************************************************

			        ////// Java Course information Scene
			        //////Background image
			        //Image image2 = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\CourseInfo.png");
			        Image image28 = new Image("file:///D:\\TOON (1)\\6.png");                  
			        ImageView imageView28 = new ImageView(image28);
			        imageView28.setFitHeight(640);
			        imageView28.setFitWidth(945);
			        imageView28.setPreserveRatio(true);
			        
			        //// The Scene root
			        BorderPane pane2 = new BorderPane();

			        ///// Label contain Java course information
			        HBox lblJava = new HBox(5);
			        lblJava.setPadding(new Insets(55,15,15,45));
			        
			        Label javainfo = new Label();
			        javainfo.setFont(Font.font("Cambria",FontWeight.BOLD ,19));
			        javainfo.setWrapText(true);
			        javainfo.setStyle("-fx-line-spacing: 1.1em;");
			        javainfo.setMaxHeight(450);
			        javainfo.setMaxWidth(475);
			        javainfo.setText("Java is a widely-used programming language for coding web applications."
			                + " It is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself, and it is commonly used for developing Android applications,"
			                + " many Android apps are written in Java or use Java-based frameworks. " 
			                + "\nOther usage of Java: \nGame Development - Cloud computing - Big Data \nArtificial Intelligence - Internet of Things");
			        javainfo.setTextFill(Color.web("#DF7373"));
			        
			        lblJava.getChildren().add(javainfo);
			        
			        ///For The Course Label
			        HBox javaLblRight = new HBox(5);
			        javaLblRight.setPadding(new Insets(92,140,15,15));
			        
			        Label javaLbl = new Label("Java Course");
			        javaLbl.setTextFill(Color.web("#DF7373"));
			        javaLbl.setFont(Font.font("Impact", 40));
			        javaLblRight.getChildren().add(javaLbl);
			        
			        ///For the NEXT & BACK button
			        HBox bottom2 = new HBox(5);
			        bottom2.setPadding(new Insets(15,15,25,20));
			        
			        GridPane grid1 = new GridPane();
			        grid1.setHgap(745);
			        
			        Button next = new Button("Next");
			        next.setPrefHeight(40);
			        next.setPrefWidth(70);
			        next.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button back1 = new Button("Back");
			        back1.setPrefHeight(40);
			        back1.setPrefWidth(80);
			        back1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        grid1.add(back1, 0, 0);
			        grid1.add(next, 1, 0);
			        
			        bottom2.getChildren().addAll(grid1);
			        pane2.setLeft(lblJava);
			        pane2.setRight(javaLblRight);
			        pane2.setBottom(bottom2); 
			        
			        ////// NEXT button action
			        next.setOnAction(e ->{
			        	primaryStage.setScene(JavaVedio);
			        	primaryStage.show();
			        });
			        
			        ////// BACK button action 
			        back1.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			            primaryStage.show();
			        });
			        
			        JavaCourseInfo = new Scene(new StackPane(imageView28,pane2),945,640);
			        
			        ////// Python Course information Scene
			        //////Background image
			        ImageView imageView48 = new ImageView(image28);
			        imageView48.setFitHeight(640);
			        imageView48.setFitWidth(945);
			        imageView48.setPreserveRatio(true);
			        
			        //// The Scene root
			        BorderPane pane3 = new BorderPane();

			        ///// Label contain Python course information
			        HBox lblPython = new HBox(5);
			        lblPython.setPadding(new Insets(58,15,15,45));
			        
			        Label pythoninfo = new Label();
			        pythoninfo.setFont(Font.font("Cambria",FontWeight.BOLD ,18));
			        pythoninfo.setWrapText(true);
			        pythoninfo.setStyle("-fx-line-spacing: 1.1em;");
			        pythoninfo.setMaxHeight(450);
			        pythoninfo.setMaxWidth(475);
			        pythoninfo.setText("Python is one of the most popular programming languages in the world, has created everything from Netflix’s recommendation algorithm to the software that controls self-driving cars. "
			                + "\n\nIt is a general-purpose language, which means it’s designed to be used in a range of applications, including data science, software and web development, automation, and generally getting stuff done.");
			        pythoninfo.setTextFill(Color.web("#DF7373"));
			        
			        lblPython.getChildren().add(pythoninfo);
			        
			        ///For The Course Label
			        HBox pythonLblRight = new HBox(5);
			        pythonLblRight.setPadding(new Insets(92,130,15,15));
			        
			        Label pythonLbl = new Label("Python Course");
			        pythonLbl.setTextFill(Color.web("#DF7373"));
			        pythonLbl.setFont(Font.font("Impact", 40));
			        pythonLblRight.getChildren().add(pythonLbl);
			        
			        ///For the NEXT button
			        HBox bottom3 = new HBox(5);
			        bottom3.setPadding(new Insets(15,15,25,20));
			        
			        GridPane grid2 = new GridPane();
			        grid2.setHgap(745);
			        
			        Button next2 = new Button("Next");
			        next2.setPrefHeight(40);
			        next2.setPrefWidth(70);
			        next2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button back2 = new Button("Back");
			        back2.setPrefHeight(40);
			        back2.setPrefWidth(80);
			        back2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        grid2.add(back2, 0, 0);
			        grid2.add(next2, 1, 0);
			        
			        bottom3.getChildren().add(grid2);
			        pane3.setLeft(lblPython);
			        pane3.setRight(pythonLblRight);
			        pane3.setBottom(bottom3); 
			        
			        ////// NEXT button action
			        next2.setOnAction(e ->{
			        	primaryStage.setScene(PythonVedio);
			        	primaryStage.show();
			        });
			        
			        ////// BACK button action 
			        back2.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			        	primaryStage.show();
			        });
			        
			        PythonCourseInfo = new Scene(new StackPane(imageView48,pane3),945,640);
			        
			        ////// HTML Course information Scene
			        //////Background image
			        ImageView imageView68 = new ImageView(image28);
			        imageView68.setFitHeight(640);
			        imageView68.setFitWidth(945);
			        imageView68.setPreserveRatio(true);
			        
			        //// The Scene root
			        BorderPane pane5 = new BorderPane();

			        ///// Label contain HTML course information
			        HBox lblHtml = new HBox(5);
			        lblHtml.setPadding(new Insets(65,15,15,45));
			        
			        Label htmlinfo = new Label();
			        htmlinfo.setFont(Font.font("Lucida Fax", FontWeight.BOLD ,17));
			        htmlinfo.setWrapText(true);
			        htmlinfo.setStyle("-fx-line-spacing: 1.1em;");
			        htmlinfo.setMaxHeight(450);
			        htmlinfo.setMaxWidth(475);
			        htmlinfo.setText("HTML stands for \'HyperText Markup Language\'. "
			                + "\nIt is a standard markup language for web page creation. It allows the creation and structure of sections, paragraphs, and links using HTML elements (the building blocks of a web page) such as tags and attributes. ");
			        htmlinfo.setTextFill(Color.web("#DF7373"));
			        lblHtml.getChildren().add(htmlinfo);
			        
			        ///For The Course Label
			        HBox htmlLblRight = new HBox(5);
			        htmlLblRight.setPadding(new Insets(92,135,15,15));
			        
			        Label htmlLbl = new Label("HTML Course");
			        htmlLbl.setTextFill(Color.web("#DF7373"));
			        htmlLbl.setFont(Font.font("Impact", 40));
			        htmlLblRight.getChildren().add(htmlLbl);
			        
			        ///For the NEXT button
			        HBox bottom4 = new HBox(5);
			        bottom4.setPadding(new Insets(15,15,25,45));
			        
			        GridPane grid3 = new GridPane();
			        grid3.setHgap(745);
			        
			        Button next3 = new Button("Next");
			        next3.setPrefHeight(40);
			        next3.setPrefWidth(70);
			        next3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button back3 = new Button("Back");
			        back3.setPrefHeight(40);
			        back3.setPrefWidth(80);
			        back3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        grid3.add(back3, 0, 0);
			        grid3.add(next3, 1, 0);
			        
			        bottom4.getChildren().add(grid3);
			        pane5.setLeft(lblHtml);
			        pane5.setRight(htmlLblRight);
			        pane5.setBottom(bottom4); 
			              
			        ////// NEXT button action
			        next3.setOnAction(e ->{
			        	primaryStage.setScene(HtmlVedio);
			        	primaryStage.show();
			        });
			        
			        ////// BACK button action 
			        back3.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			        	primaryStage.show();
			        });
			        
			        HtmlCourseInfo = new Scene(new StackPane(imageView68,pane5),945,640);
			           
			        /// NEXT & BACK button (The new Course 1)
			        HBox bottomNewCourse1 = new HBox(5);
			        bottomNewCourse1.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCourse1 = new GridPane();
			        gridNewCourse1.setHgap(745);
			        
			        Button nextNewCourse1 = new Button("Next");
			        nextNewCourse1.setPrefHeight(40);
			        nextNewCourse1.setPrefWidth(70);
			        nextNewCourse1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCourse1 = new Button("Back");
			        backNewCourse1.setPrefHeight(40);
			        backNewCourse1.setPrefWidth(80);
			        backNewCourse1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCourse1.add(backNewCourse1, 0, 0);
			        gridNewCourse1.add(nextNewCourse1, 1, 0);
			        
			        bottomNewCourse1.getChildren().addAll(gridNewCourse1);
			        
			        // NEXT button action
			        nextNewCourse1.setOnAction(e ->{
			            
			        	primaryStage.setScene(NewCourseVid1);
			        	primaryStage.show();
			        });
			        
			        //BACK button action 
			        backNewCourse1.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			        	primaryStage.show();
			        });
			        
			        // New Course 1 information Scene
			        newCoursePic1.setOnMouseClicked(e ->{
			            
			            ////// New Course information Scene
			            //////Background image
			            ImageView imgViewNewCourse1 = new ImageView(image28);
			            imgViewNewCourse1.setFitHeight(640);
			            imgViewNewCourse1.setFitWidth(945);
			            imgViewNewCourse1.setPreserveRatio(true);

			            //// The Scene root
			            BorderPane paneNewCourse1 = new BorderPane();

			            ///// Label contain The new course information
			            HBox lblNewCourse1 = new HBox(5);
			            lblNewCourse1.setPadding(new Insets(52,15,15,45));

			            Label newCourseinfo1 = new Label();
			            newCourseinfo1.setFont(Font.font("Cambria",FontWeight.BOLD ,18));
			            newCourseinfo1.setWrapText(true);
			            newCourseinfo1.setStyle("-fx-line-spacing: 1.1em;");
			            newCourseinfo1.setMaxHeight(450);
			            newCourseinfo1.setMaxWidth(475);
			            newCourseinfo1.setText(DescriptionCourse.get(0));  //Get the user Course Description from the array
			            newCourseinfo1.setTextFill(Color.web("#DF7373"));
			            newCourseinfo1.setWrapText(true);
			            
			            lblNewCourse1.getChildren().add(newCourseinfo1);

			            ///For The Course Label
			            HBox newCourseLblRight1 = new HBox(5);
			            newCourseLblRight1.setPadding(new Insets(92,140,15,15));

			            Label newCourseLbl1 = new Label(NameCourse.get(0)); //Get the user Course Name from the array
			            newCourseLbl1.setTextFill(Color.web("#DF7373"));
			            newCourseLbl1.setFont(Font.font("Impact", 40));
			            paneNewCourse1.setBottom(bottomNewCourse1); 

			            paneNewCourse1.setLeft(lblNewCourse1);
			            paneNewCourse1.setRight(newCourseLblRight1);
			            newCourseLblRight1.getChildren().add(newCourseLbl1);
			            
			            NewCourse1 = new Scene(new StackPane(imgViewNewCourse1,paneNewCourse1),945,640);

			            if(e.getButton() == MouseButton.PRIMARY){
			              
			            	primaryStage.setScene(NewCourse1);
			            	primaryStage.show();  
			            }      
			        });
			        
			        ///For the NEXT & BACK button (The new Course2)
			        HBox bottomNewCourse2 = new HBox(5);
			        bottomNewCourse2.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCourse2 = new GridPane();
			        gridNewCourse2.setHgap(745);
			        
			        Button nextNewCourse2 = new Button("Next");
			        nextNewCourse2.setPrefHeight(40);
			        nextNewCourse2.setPrefWidth(70);
			        nextNewCourse2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCourse2 = new Button("Back");
			        backNewCourse2.setPrefHeight(40);
			        backNewCourse2.setPrefWidth(80);
			        backNewCourse2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCourse2.add(backNewCourse2, 0, 0);
			        gridNewCourse2.add(nextNewCourse2, 1, 0);
			        
			        bottomNewCourse2.getChildren().addAll(gridNewCourse2);
			        
			        // NEXT button action
			        nextNewCourse2.setOnAction(e ->{
			        	primaryStage.setScene(NewCourseVid2);
			        	primaryStage.show();
			        });
			        
			        //BACK button action 
			        backNewCourse2.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			        	primaryStage.show();
			        });
			        
			        // New Course 2 information Scene
			        newCoursePic2.setOnMouseClicked(e ->{
			            
			            ////// New Course information Scene
			            //////Background image
			            ImageView imgViewNewCourse2 = new ImageView(image28);
			            imgViewNewCourse2.setFitHeight(640);
			            imgViewNewCourse2.setFitWidth(945);
			            imgViewNewCourse2.setPreserveRatio(true);

			            //// The Scene root
			            BorderPane paneNewCourse2 = new BorderPane();

			            ///// Label contain The new course information
			            HBox lblNewCourse2 = new HBox(5);
			            lblNewCourse2.setPadding(new Insets(52,15,15,45));

			            Label newCourseinfo2 = new Label();
			            newCourseinfo2.setFont(Font.font("Cambria",FontWeight.BOLD ,18));
			            newCourseinfo2.setWrapText(true);
			            newCourseinfo2.setStyle("-fx-line-spacing: 1.1em;");
			            newCourseinfo2.setMaxHeight(450);
			            newCourseinfo2.setMaxWidth(475);
			            newCourseinfo2.setText(DescriptionCourse.get(0));
			            newCourseinfo2.setTextFill(Color.web("#DF7373"));

			            lblNewCourse2.getChildren().add(newCourseinfo2);

			            ///For The Course Label
			            HBox newCourseLblRight2 = new HBox(5);
			            newCourseLblRight2.setPadding(new Insets(92,140,15,15));

			            Label newCourseLbl2 = new Label(NameCourse.get(0));
			            newCourseLbl2.setTextFill(Color.web("#DF7373"));
			            newCourseLbl2.setFont(Font.font("Impact", 40));

			            paneNewCourse2.setBottom(bottomNewCourse2); 

			            paneNewCourse2.setLeft(lblNewCourse2);
			            paneNewCourse2.setRight(newCourseLblRight2);
			            newCourseLblRight2.getChildren().add(newCourseLbl2);
			            
			            NewCourse2 = new Scene(new StackPane(imgViewNewCourse2,paneNewCourse2),945,640);

			            if(e.getButton() == MouseButton.PRIMARY){
			            	primaryStage.setScene(NewCourse2);
			            	primaryStage.show();  
			            }      
			        });
			        
			        ///For the NEXT & BACK button (The new Course3)
			        HBox bottomNewCourse3 = new HBox(5);
			        bottomNewCourse3.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCourse3 = new GridPane();
			        gridNewCourse3.setHgap(745);
			        
			        Button nextNewCourse3 = new Button("Next");
			        nextNewCourse3.setPrefHeight(40);
			        nextNewCourse3.setPrefWidth(70);
			        nextNewCourse3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCourse3 = new Button("Back");
			        backNewCourse3.setPrefHeight(40);
			        backNewCourse3.setPrefWidth(80);
			        backNewCourse3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCourse3.add(backNewCourse3, 0, 0);
			        gridNewCourse3.add(nextNewCourse3, 1, 0);
			        
			        bottomNewCourse3.getChildren().addAll(gridNewCourse3);
			        
			        // NEXT button action
			        nextNewCourse3.setOnAction(e ->{
			        	primaryStage.setScene(NewCourseVid3);
			        	primaryStage.show();
			        });
			        
			         //BACK button action 
			        backNewCourse3.setOnAction(e ->{
			        	primaryStage.setScene(CourseScene);
			        	primaryStage.show();
			        });
			        
			        // New Course 3 information Scene
			        newCoursePic3.setOnMouseClicked(e ->{
			            
			            ////// New Course information Scene
			            //////Background image
			            ImageView imgViewNewCourse3 = new ImageView(image28);
			            imgViewNewCourse3.setFitHeight(640);
			            imgViewNewCourse3.setFitWidth(945);
			            imgViewNewCourse3.setPreserveRatio(true);

			            //// The Scene root
			            BorderPane paneNewCourse3 = new BorderPane();

			            ///// Label contain The new course information
			            HBox lblNewCourse3 = new HBox(5);
			            lblNewCourse3.setPadding(new Insets(52,15,15,45));

			            Label newCourseinfo3 = new Label();
			            newCourseinfo3.setFont(Font.font("Cambria",FontWeight.BOLD ,18));
			            newCourseinfo3.setWrapText(true);
			            newCourseinfo3.setStyle("-fx-line-spacing: 1.1em;");
			            newCourseinfo3.setMaxHeight(450);
			            newCourseinfo3.setMaxWidth(475);
			            newCourseinfo3.setText(DescriptionCourse.get(0));
			            newCourseinfo3.setTextFill(Color.web("#DF7373"));

			            lblNewCourse3.getChildren().add(newCourseinfo3);

			            ///For The Course Label
			            HBox newCourseLblRight3 = new HBox(5);
			            newCourseLblRight3.setPadding(new Insets(92,140,15,15));

			            Label newCourseLbl3 = new Label(NameCourse.get(0));
			            newCourseLbl3.setTextFill(Color.web("#DF7373"));
			            newCourseLbl3.setFont(Font.font("Impact", 40));

			            paneNewCourse3.setBottom(bottomNewCourse3); 

			            paneNewCourse3.setLeft(lblNewCourse3);
			            paneNewCourse3.setRight(newCourseLblRight3);
			            newCourseLblRight3.getChildren().add(newCourseLbl3);
			            
			            NewCourse3 = new Scene(new StackPane(imgViewNewCourse3,paneNewCourse3),945,640);

			            if(e.getButton() == MouseButton.PRIMARY){
			            	primaryStage.setScene(NewCourse3);
			            	primaryStage.show();  
			            }      
			        });
			        
			        // Jood page 7 For Courses Video *******************************************************************************************************************************************************************************

			        ////// Java Course vedio Scene
			        //Image image3 = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\Vedio.png");
			        Image image38 = new Image("file:///D:\\TOON (1)\\7.png"); 
			        ImageView imageView38 = new ImageView(image38);
			        imageView38.setFitHeight(640);
			        imageView38.setFitWidth(945);
			        imageView38.setPreserveRatio(true);
			        
			        BorderPane vedioJava = new BorderPane();
			        
			        VBox javaVidBox = new VBox(20);
			        javaVidBox.setPadding(new Insets(140,180,25,15));
			               
			        String mediaPathJava = "file:/D:/videos&audio/JavaVideo.mp4";  //  "file:/C:/Users/hp/Downloads/JavaVideo.mp4"
			        Media media = new Media(mediaPathJava); 
			        
			        MediaPlayer mediaPlayerJava = new MediaPlayer(media);    
			        mediaPlayerJava.pause();

			        MediaView mediaViewJava = new MediaView(mediaPlayerJava);
			        mediaViewJava.setFitWidth(450);
			        mediaViewJava.setFitHeight(500);
			        
			        HBox javaVidBtn = new HBox(20);
			        javaVidBtn.setAlignment(Pos.CENTER);
			        
			        Button playJavaVid = new Button(">");
			        playJavaVid.setPrefHeight(25);
			        playJavaVid.setPrefWidth(50);
			        playJavaVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pauseJavaVid = new Button("||");
			        pauseJavaVid.setPrefHeight(25);
			        pauseJavaVid.setPrefWidth(50);
			        pauseJavaVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetJava = new Button("Reset");
			        resetJava.setPrefHeight(25);
			        resetJava.setPrefWidth(50);
			        resetJava.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        javaVidBtn.getChildren().addAll(resetJava,playJavaVid,pauseJavaVid);
			        javaVidBox.getChildren().addAll(mediaViewJava,javaVidBtn);
			        
			        //For the pause, play, reset the video buttons
			        resetJava.setOnAction(e -> {
			            mediaPlayerJava.seek(mediaPlayerJava.getStartTime()); // Reset to the beginning
			            mediaPlayerJava.pause();  
			        });
			        
			        playJavaVid.setOnAction(e ->{
			            mediaPlayerJava.play();
			        });
			        
			        pauseJavaVid.setOnAction(e ->{
			            mediaPlayerJava.pause();
			        });
			        
			        ///For the NEXT & BACK button
			        HBox vedioPaneJavaButtom = new HBox();
			        vedioPaneJavaButtom.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridJavaVdio = new GridPane();
			        gridJavaVdio.setHgap(745);
			        
			        Button nextJavaVid = new Button("Next");
			        nextJavaVid.setPrefHeight(40);
			        nextJavaVid.setPrefWidth(70);
			        nextJavaVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backJavaVid = new Button("Back");
			        backJavaVid.setPrefHeight(40);
			        backJavaVid.setPrefWidth(80);
			        backJavaVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridJavaVdio.add(backJavaVid, 0, 0);
			        gridJavaVdio.add(nextJavaVid, 1, 0);
			        
			        vedioPaneJavaButtom.getChildren().addAll(gridJavaVdio);
			        
			        vedioJava.setBottom(vedioPaneJavaButtom);
			        vedioJava.setRight(javaVidBox);
			        
			        ////// BACK button action 
			        backJavaVid.setOnAction(e ->{
			            
			            mediaPlayerJava.pause();
			            primaryStage.setScene(JavaCourseInfo);
			            primaryStage.show();
			        });
			      
			        JavaVedio = new Scene(new StackPane(imageView38,vedioJava),945,640);
			        
			        ////////////////////////////////////////////////////////////////////////////
			        ////// Python Course vedio Scene
			        //////Background image
			        ImageView imageView58 = new ImageView(image38);
			        imageView58.setFitHeight(640);
			        imageView58.setFitWidth(945);
			        imageView58.setPreserveRatio(true);
			        
			        BorderPane vedioPython = new BorderPane();
			        
			        VBox pythonVidBox = new VBox(20);
			        pythonVidBox.setPadding(new Insets(140,180,25,15));
			               
			        String mediaPathPython = "file:/D:/videos&audio/PythonVideo.mp4";//"file:/C:/Users/hp/Downloads/PythonVideo.mp4";
			        Media mediaPython = new Media(mediaPathPython); 
			        
			        MediaPlayer mediaPlayerPython = new MediaPlayer(mediaPython);    
			        mediaPlayerPython.pause();

			        MediaView mediaViewPython = new MediaView(mediaPlayerPython);
			        mediaViewPython.setFitWidth(450);
			        mediaViewPython.setFitHeight(500);
			        
			        HBox PyhtonVidBtn = new HBox(20);
			        PyhtonVidBtn.setAlignment(Pos.CENTER);
			        
			        Button playPythonVid = new Button(">");
			        playPythonVid.setPrefHeight(25);
			        playPythonVid.setPrefWidth(50);
			        playPythonVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pausePythonVid = new Button("||");
			        pausePythonVid.setPrefHeight(25);
			        pausePythonVid.setPrefWidth(50);
			        pausePythonVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetPython = new Button("Reset");
			        resetPython.setPrefHeight(25);
			        resetPython.setPrefWidth(50);
			        resetPython.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        PyhtonVidBtn.getChildren().addAll(resetPython,playPythonVid,pausePythonVid);
			        
			        pythonVidBox.getChildren().addAll(mediaViewPython,PyhtonVidBtn);
			        
			        //For the pause, play, reset the video buttons
			        resetPython.setOnAction(e -> {
			            mediaPlayerPython.seek(mediaPlayerPython.getStartTime()); // Reset to the beginning
			            mediaPlayerPython.pause();  
			        });
			        
			        playPythonVid.setOnAction(e ->{
			            mediaPlayerPython.play();
			        });
			        
			        pausePythonVid.setOnAction(e ->{
			            mediaPlayerPython.pause();
			        });
			        
			        ///For the NEXT & BACK button
			        HBox vedioPanePythonButtom = new HBox();
			        vedioPanePythonButtom.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridPythonVdio = new GridPane();
			        gridPythonVdio.setHgap(745);
			        
			        Button nextPythonVid = new Button("Next");
			        nextPythonVid.setPrefHeight(40);
			        nextPythonVid.setPrefWidth(70);
			        nextPythonVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backPythonVid = new Button("Back");
			        backPythonVid.setPrefHeight(40);
			        backPythonVid.setPrefWidth(80);
			        backPythonVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridPythonVdio.add(backPythonVid, 0, 0);
			        gridPythonVdio.add(nextPythonVid, 1, 0);
			        
			        vedioPanePythonButtom.getChildren().add(gridPythonVdio);
			        
			        vedioPython.setBottom(vedioPanePythonButtom);
			        vedioPython.setRight(pythonVidBox);

			        ////// BACK button action 
			        backPythonVid.setOnAction(e ->{
			            mediaPlayerPython.pause();
			            primaryStage.setScene(PythonCourseInfo);
			            primaryStage.show();
			        });
			        
			        PythonVedio = new Scene(new StackPane(imageView58,vedioPython),945,640);
			        
			        ////// HTML Course vedio Scene
			        //////Background image
			        ImageView imageView78 = new ImageView(image38);
			        imageView78.setFitHeight(640);
			        imageView78.setFitWidth(945);
			        imageView78.setPreserveRatio(true);
			        
			        BorderPane vedioHtml = new BorderPane();
			        
			        VBox htmlVidBox = new VBox(20);
			        htmlVidBox.setPadding(new Insets(140,180,25,15));
			               
			        String mediaPathHtml = "file:/D:/videos&audio/HTMLvideo.mp4";//"file:/C:/Users/hp/Downloads/HTMLvideo.mp4";
			        Media mediaPHtml= new Media(mediaPathHtml); 
			        
			        MediaPlayer mediaPlayerHtml = new MediaPlayer(mediaPHtml);    
			        mediaPlayerHtml.pause();

			        MediaView mediaViewHtml = new MediaView(mediaPlayerHtml);
			        mediaViewHtml.setFitWidth(450);
			        mediaViewHtml.setFitHeight(500);
			        
			        HBox HtmlVidBtn = new HBox(20);
			        HtmlVidBtn.setAlignment(Pos.CENTER);
			        
			        Button playHtmlVid = new Button(">");
			        playHtmlVid.setPrefHeight(25);
			        playHtmlVid.setPrefWidth(50);
			        playHtmlVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pauseHtmlVid = new Button("||");
			        pauseHtmlVid.setPrefHeight(25);
			        pauseHtmlVid.setPrefWidth(50);
			        pauseHtmlVid.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetHtml = new Button("Reset");
			        resetHtml.setPrefHeight(25);
			        resetHtml.setPrefWidth(50);
			        resetHtml.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        HtmlVidBtn.getChildren().addAll(resetHtml,playHtmlVid,pauseHtmlVid);
			        
			        htmlVidBox.getChildren().addAll(mediaViewHtml,HtmlVidBtn);
			        
			        //For the pause, play, reset the video buttons
			        resetHtml.setOnAction(e -> {
			            mediaPlayerHtml.seek(mediaPlayerHtml.getStartTime()); // Reset to the beginning
			            mediaPlayerHtml.pause();  
			        });
			        
			        playHtmlVid.setOnAction(e ->{
			            mediaPlayerHtml.play();
			        });
			        
			        pauseHtmlVid.setOnAction(e ->{
			            mediaPlayerHtml.pause();
			        });
			        
			        ///For the NEXT & BACK button
			        HBox vedioPaneHtmlButtom = new HBox();
			        vedioPaneHtmlButtom.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridHtmlVdio = new GridPane();
			        gridHtmlVdio.setHgap(745);
			        
			        Button nextHtmlVid = new Button("Next");
			        nextHtmlVid.setPrefHeight(40);
			        nextHtmlVid.setPrefWidth(70);
			        nextHtmlVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backHtmlVid = new Button("Back");
			        backHtmlVid.setPrefHeight(40);
			        backHtmlVid.setPrefWidth(80);
			        backHtmlVid.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridHtmlVdio.add(backHtmlVid, 0, 0);
			        gridHtmlVdio.add(nextHtmlVid, 1, 0);
			        
			        vedioPaneHtmlButtom.getChildren().add(gridHtmlVdio);
			        vedioHtml.setRight(htmlVidBox);
			        vedioHtml.setBottom(vedioPaneHtmlButtom);
			        
			        ////// BACK button action 
			        backHtmlVid.setOnAction(e ->{
			            mediaPlayerHtml.pause();
			            primaryStage.setScene(HtmlCourseInfo);
			            primaryStage.show();
			        });
			       
			        HtmlVedio = new Scene(new StackPane(imageView78,vedioHtml),945,640);  
			        
			        //////New Course1 vedio Scene 
			        //////Background image
			        ImageView imgViewNewCrs1 = new ImageView(image38);
			        imgViewNewCrs1.setFitHeight(640);
			        imgViewNewCrs1.setFitWidth(945);
			        imgViewNewCrs1.setPreserveRatio(true);
			        
			        BorderPane vedioNewCrs1 = new BorderPane();
			           
			        VBox newCrsVidBox1 = new VBox(20);
			        newCrsVidBox1.setPadding(new Insets(140,180,25,15));

			        HBox newCrsVidBtn1 = new HBox(20);
			        newCrsVidBtn1.setAlignment(Pos.CENTER);
			        
			        Button playNewCrsVid1 = new Button(">");
			        playNewCrsVid1.setPrefHeight(25);
			        playNewCrsVid1.setPrefWidth(50);
			        playNewCrsVid1.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pauseNewCrsVid1 = new Button("||");
			        pauseNewCrsVid1.setPrefHeight(25);
			        pauseNewCrsVid1.setPrefWidth(50);
			        pauseNewCrsVid1.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetNewCrs1 = new Button("Reset");
			        resetNewCrs1.setPrefHeight(25);
			        resetNewCrs1.setPrefWidth(50);
			        resetNewCrs1.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        newCrsVidBtn1.getChildren().addAll(resetNewCrs1,playNewCrsVid1,pauseNewCrsVid1);
			        vedioNewCrs1.setRight(newCrsVidBox1);

			        ///For the NEXT & BACK button
			        HBox vedioNewCrsBtm1 = new HBox();
			        vedioNewCrsBtm1.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCrs1 = new GridPane();
			        gridNewCrs1.setHgap(745);
			        
			        Button nextNewCrs1 = new Button("Next");
			        nextNewCrs1.setPrefHeight(40);
			        nextNewCrs1.setPrefWidth(70);
			        nextNewCrs1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCrs1 = new Button("Back");
			        backNewCrs1.setPrefHeight(40);
			        backNewCrs1.setPrefWidth(80);
			        backNewCrs1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCrs1.add(backNewCrs1, 0, 0);
			        gridNewCrs1.add(nextNewCrs1, 1, 0);
			        
			        vedioNewCrsBtm1.getChildren().add(gridNewCrs1);
			        
			        vedioNewCrs1.setBottom(vedioNewCrsBtm1);
			       

			        ////// BACK button action 
			        backNewCrs1.setOnAction(e ->{
			            //mediaPlayerNewCrs1.pause();
			        	primaryStage.setScene(NewCourse1);
			        	primaryStage.show();
			        });
			        
			        NewCourseVid1 = new Scene(new StackPane(imgViewNewCrs1,vedioNewCrs1),945,640);
			        
			        
			        //////New Course2 vedio Scene
			        //////Background image
			        ImageView imgViewNewCrs2 = new ImageView(image38);
			        imgViewNewCrs2.setFitHeight(640);
			        imgViewNewCrs2.setFitWidth(945);
			        imgViewNewCrs2.setPreserveRatio(true);
			        
			        BorderPane vedioNewCrs2 = new BorderPane();
			        
			        VBox newCrsVidBox2 = new VBox(20);
			        newCrsVidBox2.setPadding(new Insets(140,180,25,15));
			        
			        HBox newCrsVidBtn2 = new HBox(20);
			        newCrsVidBtn2.setAlignment(Pos.CENTER);
			        
			        Button playNewCrsVid2 = new Button(">");
			        playNewCrsVid2.setPrefHeight(25);
			        playNewCrsVid2.setPrefWidth(50);
			        playNewCrsVid2.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pauseNewCrsVid2 = new Button("||");
			        pauseNewCrsVid2.setPrefHeight(25);
			        pauseNewCrsVid2.setPrefWidth(50);
			        pauseNewCrsVid2.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetNewCrs2 = new Button("Reset");
			        resetNewCrs2.setPrefHeight(25);
			        resetNewCrs2.setPrefWidth(50);
			        resetNewCrs2.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        newCrsVidBtn2.getChildren().addAll(resetNewCrs2,playNewCrsVid2,pauseNewCrsVid2);
			        
			        ///For the NEXT & BACK button
			        HBox vedioNewCrsBtm2 = new HBox();
			        vedioNewCrsBtm2.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCrs2 = new GridPane();
			        gridNewCrs2.setHgap(745);
			        
			        Button nextNewCrs2 = new Button("Next");
			        nextNewCrs2.setPrefHeight(40);
			        nextNewCrs2.setPrefWidth(70);
			        nextNewCrs2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCrs2 = new Button("Back");
			        backNewCrs2.setPrefHeight(40);
			        backNewCrs2.setPrefWidth(80);
			        backNewCrs2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCrs2.add(backNewCrs2, 0, 0);
			        gridNewCrs2.add(nextNewCrs2, 1, 0);
			        
			        vedioNewCrsBtm2.getChildren().add(gridNewCrs2);
			        
			        vedioNewCrs2.setBottom(vedioNewCrsBtm2);
			        vedioNewCrs2.setRight(newCrsVidBox2);

			        ////// BACK button action 
			        backNewCrs2.setOnAction(e ->{
			            mediaPlayerNewCrs2.pause(); 
			            primaryStage.setScene(NewCourse2);
			            primaryStage.show();
			        });
			        
			        NewCourseVid2 = new Scene(new StackPane(imgViewNewCrs2,vedioNewCrs2),945,640);
			        
			        //////New Course vedio Scene
			        //////Background image
			        ImageView imgViewNewCrs3 = new ImageView(image38);
			        imgViewNewCrs3.setFitHeight(640);
			        imgViewNewCrs3.setFitWidth(945);
			        imgViewNewCrs3.setPreserveRatio(true);
			        
			        BorderPane vedioNewCrs3 = new BorderPane();
			        
			        VBox newCrsVidBox3 = new VBox(20);
			        newCrsVidBox3.setPadding(new Insets(140,180,25,15));
			               
			        HBox newCrsVidBtn3 = new HBox(20);
			        newCrsVidBtn3.setAlignment(Pos.CENTER);
			        
			        Button playNewCrsVid3 = new Button(">");
			        playNewCrsVid3.setPrefHeight(25);
			        playNewCrsVid3.setPrefWidth(50);
			        playNewCrsVid3.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button pauseNewCrsVid3 = new Button("||");
			        pauseNewCrsVid3.setPrefHeight(25);
			        pauseNewCrsVid3.setPrefWidth(50);
			        pauseNewCrsVid3.setStyle("-fx-background-color: #DF7373;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
			        
			        Button resetNewCrs3 = new Button("Reset");
			        resetNewCrs3.setPrefHeight(25);
			        resetNewCrs3.setPrefWidth(50);
			        resetNewCrs3.setStyle("-fx-background-color: #DF7373;-fx-font-family: Cambria; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");

			        newCrsVidBtn3.getChildren().addAll(resetNewCrs3,playNewCrsVid3,pauseNewCrsVid3);
			        
			        ///For the NEXT & BACK button
			        HBox vedioNewCrsBtm3 = new HBox();
			        vedioNewCrsBtm3.setPadding(new Insets(15,15,25,20));
			        
			        GridPane gridNewCrs3 = new GridPane();
			        gridNewCrs3.setHgap(745);
			        
			        Button nextNewCrs3 = new Button("Next");
			        nextNewCrs3.setPrefHeight(40);
			        nextNewCrs3.setPrefWidth(70);
			        nextNewCrs3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button backNewCrs3 = new Button("Back");
			        backNewCrs3.setPrefHeight(40);
			        backNewCrs3.setPrefWidth(80);
			        backNewCrs3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        gridNewCrs3.add(backNewCrs3, 0, 0);
			        gridNewCrs3.add(nextNewCrs3, 1, 0);
			        
			        vedioNewCrsBtm3.getChildren().add(gridNewCrs3);
			        
			        vedioNewCrs3.setBottom(vedioNewCrsBtm3);
			        vedioNewCrs3.setRight(newCrsVidBox3);

			        ////// BACK button action 
			        backNewCrs3.setOnAction(e ->{
			            mediaPlayerNewCrs3.pause();
			            primaryStage.setScene(NewCourse3);
			            primaryStage.show();
			        });
			         
			        NewCourseVid3 = new Scene(new StackPane(imgViewNewCrs3,vedioNewCrs3),945,640);
			        
			        
			        //   Jawaher  page 8  for  Questions  *******************************************************************************************************************************************************************************
			        
			        //the backround image for Question content page 8
			        //Image imagePg8 = new Image("file:C:///Users\\hp\\OneDrive\\سطح المكتب\\UQU\\Advanced programming\\Question.png"); 
			        Image imagePg8 = new Image("file:///D:\\TOON (1)\\8.png");  
			        ImageView imageViewPg8 = new ImageView(imagePg8);
			        imageViewPg8.setFitHeight(640);
			        imageViewPg8.setFitWidth(945); 
			        imageViewPg8.setPreserveRatio(true);
			        
			        Label Questions1 =   new Label("Questions 1:  ");
			        Label Questions1Show =   new Label("Questions 1 Here",Questions1);  // QuestionCourse1.get(0)
			        Questions1.setStyle("-fx-font-family: Impact; -fx-font-size: 30px;-fx-text-fill:#635A8F;");
			        Questions1Show.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill: #E88482;");

			        Button CorrectAnswer1 =  new Button("Answer"); // Answer1Course1.get(0)
			        Button WrongAnswer1 =  new Button("Answer"); // Answer2Course1.get(0)
			        Button WrongAnswer2 =  new Button("Answer");// Answer3Course1.get(0)
			        CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			        WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        
			        Label Questions2 =   new Label("Questions 2:  ");
			        Label Questions2Show =   new Label("Questions 2 Here",Questions2);  // QuestionCourse1.get(1)
			        Questions2.setStyle("-fx-font-family: Impact; -fx-font-size: 30px;-fx-text-fill:#635A8F;");
			        Questions2Show.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill: #E88482;");

			        Button CorrectAnswer2 =  new Button("Answer");//Answer1Course1.get(1)
			        Button WrongAnswer3 =  new Button("Answer");//Answe2Course1.get(1)
			        Button WrongAnswer4 =  new Button("Answer");//Answer3Course1.get(1)
			        CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        
			        Label Questions3 =   new Label("Questions 3:  ");
			        Label Questions3Show =   new Label("Questions 3 Here",Questions3);  // QuestionCourse1.get(2)
			        Questions3.setStyle("-fx-font-family: Impact; -fx-font-size: 30px;-fx-text-fill:#635A8F;");
			        Questions3Show.setStyle("-fx-font-family: Impact; -fx-font-size: 20px;-fx-text-fill: #E88482;");

			        Button CorrectAnswer3 =  new Button("Answer");// Answer1Course1.get(2)
			        Button WrongAnswer5 =  new Button("Answer");// Answer2Course1.get(2)
			        Button WrongAnswer6 =  new Button("Answer");// Answer3Course1.get(2)
			        CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			        WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			      
			        
			        // CorrectAnswer
			        CorrectAnswer1.setOnAction( e -> {
			            Score++;
			            CorrectAnswer1.setStyle("-fx-background-color:#CBE784;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        CorrectAnswer2.setOnAction( e -> {
			            Score++;
			            CorrectAnswer2.setStyle("-fx-background-color:#CBE784;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        CorrectAnswer3.setOnAction( e -> {
			            Score++;
			            CorrectAnswer3.setStyle("-fx-background-color:#CBE784;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        // WrongAnswer
			        WrongAnswer1.setOnAction(e -> {
			            WrongAnswer1.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        WrongAnswer2.setOnAction(e -> {
			            WrongAnswer2.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        WrongAnswer3.setOnAction(e -> {
			            WrongAnswer3.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        WrongAnswer4.setOnAction(e -> {
			            WrongAnswer4.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        WrongAnswer5.setOnAction(e -> {
			            WrongAnswer5.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        WrongAnswer6.setOnAction(e -> {
			            WrongAnswer6.setStyle("-fx-background-color:#C64159;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA; -fx-font-weight: bold;");
			        });
			        
			        HBox Q1 = new  HBox(20);
			        Q1.getChildren().add(WrongAnswer1);
			        Q1.getChildren().add(CorrectAnswer1);
			        Q1.getChildren().add(WrongAnswer2);
			        Q1.setAlignment(Pos.CENTER);
			        
			        HBox Q2 = new  HBox(20);
			        Q2.getChildren().add(WrongAnswer3);
			        Q2.getChildren().add(WrongAnswer4);
			        Q2.getChildren().add(CorrectAnswer2);
			        Q2.setAlignment(Pos.CENTER);
			        
			        HBox Q3 = new  HBox(20);
			        Q3.getChildren().add(CorrectAnswer3);
			        Q3.getChildren().add(WrongAnswer5);
			        Q3.getChildren().add(WrongAnswer6);
			        Q3.setAlignment(Pos.CENTER);
			        
			        VBox ShowQuestionsBox1 = new VBox(25);
			        ShowQuestionsBox1.setPadding(new Insets(60,10,10,10));
			        ShowQuestionsBox1.getChildren().add(Questions1Show);
			        ShowQuestionsBox1.getChildren().add(Q1);
			        ShowQuestionsBox1.getChildren().add(Questions2Show);
			        ShowQuestionsBox1.getChildren().add(Q2);
			        ShowQuestionsBox1.getChildren().add(Questions3Show);
			        ShowQuestionsBox1.getChildren().add(Q3);
			        ShowQuestionsBox1.setAlignment(Pos.CENTER);
			        
			        
			        // All next button to  CourseScene 
			        Button QuestionsNextJavaCourse = new Button("Next");
			        QuestionsNextJavaCourse.setPrefHeight(40);
			        QuestionsNextJavaCourse.setPrefWidth(70);
			        QuestionsNextJavaCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button QuestionsNextPythonCourse = new Button("Next");
			        QuestionsNextPythonCourse.setPrefHeight(40);
			        QuestionsNextPythonCourse.setPrefWidth(70);
			        QuestionsNextPythonCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button QuestionsNextHtmlCourse = new Button("Next");
			        QuestionsNextHtmlCourse.setPrefHeight(40);
			        QuestionsNextHtmlCourse.setPrefWidth(70);
			        QuestionsNextHtmlCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button QuestionsNextNewCourse1 = new Button("Next");
			        QuestionsNextNewCourse1.setPrefHeight(40);
			        QuestionsNextNewCourse1.setPrefWidth(70);
			        QuestionsNextNewCourse1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button QuestionsNextNewCourse2 = new Button("Next");
			        QuestionsNextNewCourse2.setPrefHeight(40);
			        QuestionsNextNewCourse2.setPrefWidth(70);
			        QuestionsNextNewCourse2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        Button QuestionsNextNewCourse3 = new Button("Next");
			        QuestionsNextNewCourse3.setPrefHeight(40);
			        QuestionsNextNewCourse3.setPrefWidth(70);
			        QuestionsNextNewCourse3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 17px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to java course  vid
			        Button QuestionsBackJavaCourse = new Button("Back");
			        QuestionsBackJavaCourse.setPrefHeight(40);
			        QuestionsBackJavaCourse.setPrefWidth(80);
			        QuestionsBackJavaCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to Python course  vid
			        Button QuestionsBackPythonCourse = new Button("Back");
			        QuestionsBackPythonCourse.setPrefHeight(40);
			        QuestionsBackPythonCourse.setPrefWidth(80);
			        QuestionsBackPythonCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to html course  vid
			        Button QuestionsBackHtmlCourse = new Button("Back");
			        QuestionsBackHtmlCourse.setPrefHeight(40);
			        QuestionsBackHtmlCourse.setPrefWidth(80);
			        QuestionsBackHtmlCourse.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to new course 1 vid
			        Button QuestionsBackNewCourse1 = new Button("Back");
			        QuestionsBackNewCourse1.setPrefHeight(40);
			        QuestionsBackNewCourse1.setPrefWidth(80);
			        QuestionsBackNewCourse1.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to new course 2 vid
			        Button QuestionsBackNewCourse2 = new Button("Back");
			        QuestionsBackNewCourse2.setPrefHeight(40);
			        QuestionsBackNewCourse2.setPrefWidth(80);
			        QuestionsBackNewCourse2.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			        
			        //BACK button action to new course 3 vid
			        Button QuestionsBackNewCourse3 = new Button("Back");
			        QuestionsBackNewCourse3.setPrefHeight(40);
			        QuestionsBackNewCourse3.setPrefWidth(80);
			        QuestionsBackNewCourse3.setStyle("-fx-background-color: #73B5C7;-fx-font-family: Impact; -fx-font-size: 15px;-fx-text-fill:#FEFEDA;");
			          
			        
			        //For the NEXT & BACK button (The Questions Course)
			        HBox QuestionsBottomJavaCourse = new HBox(750);
			        QuestionsBottomJavaCourse.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomJavaCourse.getChildren().addAll(QuestionsBackJavaCourse,QuestionsNextJavaCourse);
			        
			        HBox QuestionsBottomPythonCourse = new HBox(750);
			        QuestionsBottomPythonCourse.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomPythonCourse.getChildren().addAll(QuestionsBackPythonCourse,QuestionsNextPythonCourse);
			        
			        HBox QuestionsBottomHtmlCourse = new HBox(750);
			        QuestionsBottomHtmlCourse.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomHtmlCourse.getChildren().addAll(QuestionsBackHtmlCourse,QuestionsNextHtmlCourse);
			        
			        HBox QuestionsBottomNewCourse1 = new HBox(750);
			        QuestionsBottomNewCourse1.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomNewCourse1.getChildren().addAll(QuestionsBackNewCourse1,QuestionsNextNewCourse1);

			        HBox QuestionsBottomNewCourse2 = new HBox(750);
			        QuestionsBottomNewCourse2.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomNewCourse2.getChildren().addAll(QuestionsBackNewCourse2,QuestionsNextNewCourse2);
			        
			        HBox QuestionsBottomNewCourse3 = new HBox(750);
			        QuestionsBottomNewCourse3.setPadding(new Insets(15,15,25,20));
			        QuestionsBottomNewCourse3.getChildren().addAll(QuestionsBackNewCourse3,QuestionsNextNewCourse3);
			        
			        BorderPane Questions1ScenePane = new BorderPane();
			        Questions1ScenePane.setCenter(ShowQuestionsBox1);

			        Questions1Scene = new Scene(new StackPane(imageViewPg8,Questions1ScenePane),945,640);
			        
			        
			        // NEXT button action
			        EventHandler<ActionEvent> handler = e -> {
			            
			            System.out.print(Score);
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(CourseScene);
			            primaryStage.show();
			        };
			        
			        QuestionsNextJavaCourse.setOnAction(handler);
			        QuestionsNextPythonCourse.setOnAction(handler);
			        QuestionsNextHtmlCourse.setOnAction(handler);
			        QuestionsNextNewCourse1.setOnAction(handler);
			        QuestionsNextNewCourse2.setOnAction(handler);
			        QuestionsNextNewCourse3.setOnAction(handler);
			        
			        
			        //BACK button action  to java course  vid
			        QuestionsBackJavaCourse.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(JavaVedio); 
			            primaryStage.show();
			        });
			        
			        //BACK button action to Python course vid
			        QuestionsBackPythonCourse.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(PythonVedio);
			            primaryStage.show();
			        });
			        
			        //BACK button action to html course vid
			        QuestionsBackHtmlCourse.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(HtmlVedio);
			            primaryStage.show();
			        });
			        
			        //BACK button action to new course 1 vid
			        QuestionsBackNewCourse1.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(NewCourseVid1); 
			            primaryStage.show();
			        });
			        
			        //BACK button action to new course 2 vid
			        QuestionsBackNewCourse2.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(NewCourseVid2);
			            primaryStage.show();
			        });
			        
			        //BACK button action to new course 3 vid
			        QuestionsBackNewCourse3.setOnAction(e ->{
			            
			            Score--;
			            
			            CorrectAnswer1.setStyle("-fx-background-color:#85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            WrongAnswer1.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;");
			            
			            CorrectAnswer2.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer4.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            CorrectAnswer3.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer5.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 
			            WrongAnswer6.setStyle("-fx-background-color: #85BAA6;-fx-font-family: Serif Regular; -fx-font-size: 20px;-fx-text-fill:#FEFEDA;-fx-font-weight: bold;"); 

			            primaryStage.setScene(NewCourseVid3);
			            primaryStage.show();
			        });
			        
			        
			        
			        // java Questions
			        nextJavaVid.setOnAction(e  -> {
			            
			            mediaPlayerJava.pause();
			            
			            Questions1Show.setText("What is a key characteristic of Java programming language?");
			            CorrectAnswer1.setText("Object-oriented");
			            WrongAnswer1.setText("Single-platform");
			            WrongAnswer2.setText("Procedural");

			            Questions2Show.setText("What makes Java a versatile programming language?");
			            CorrectAnswer2.setText("It is multi-platform and can \nrun on various operating systems ");
			            WrongAnswer3.setText("It is a single \nplatform language");
			            WrongAnswer4.setText("It can only run\n on Windows operating systems");

			            Questions3Show.setText("What is one of the primary domains where Java is commonly used?");
			            CorrectAnswer3.setText("Mobile Application Development");
			            WrongAnswer5.setText("Video Editing");
			            WrongAnswer6.setText("Graphic Design");
			            
			            Questions1ScenePane.setBottom(QuestionsBottomJavaCourse);

			            primaryStage.setScene(Questions1Scene);
			            primaryStage.show();
			        });
			        
			        //  Python  Questions
			        nextPythonVid.setOnAction(e -> {
			            
			            mediaPlayerPython.pause();
			        
			            Questions1Show.setText("What is the primary characteristic of Python?");
			            CorrectAnswer1.setText("General-purpose\n language");
			            WrongAnswer1.setText("Specialized for\n game development");
			            WrongAnswer2.setText("Exclusive focus on\n web development");

			            Questions2Show.setText("what is Python designed for?");
			            CorrectAnswer2.setText("A specific range of applications");
			            WrongAnswer3.setText("Only for automation");
			            WrongAnswer4.setText("Exclusively for web development");

			            Questions3Show.setText("Python has been utilized for creating various applications, including:");
			            CorrectAnswer3.setText("Web development\n and automation");
			            WrongAnswer5.setText("Only software\n development");
			            WrongAnswer6.setText("Exclusive focus\n on game development");
			            
			            Questions1ScenePane.setBottom(QuestionsBottomPythonCourse);

			            primaryStage.setScene(Questions1Scene);
			            primaryStage.show();
			        });
			        
			        //  html  Questions
			        nextHtmlVid.setOnAction(e -> {
			            
			            mediaPlayerHtml.pause();
			        
			            Questions1Show.setText("What does HTML stand for?");
			            CorrectAnswer1.setText("HyperText Markup\n Language");
			            WrongAnswer1.setText("High-level Text \nManipulation Language");
			            WrongAnswer2.setText("Hypersonic Textual \nModeling Language");

			            Questions2Show.setText("What is HTML primarily used for?");
			            CorrectAnswer2.setText("Web page creation");
			            WrongAnswer3.setText("Game development");
			            WrongAnswer4.setText("Artificial intelligence programming");

			            Questions3Show.setText("In the context of HTML, what is used for the creation and\nstructure of sections, paragraphs, and links?");
			            CorrectAnswer3.setText("Elements");
			            WrongAnswer5.setText("Fragments");
			            WrongAnswer6.setText("Components");
			                
			            Questions1ScenePane.setBottom(QuestionsBottomHtmlCourse);
			             
			            primaryStage.setScene(Questions1Scene);
			            primaryStage.show();
			        });
			        
			        // next Button new course 1 (in video page)
			        nextNewCrs1.setOnAction(e  ->  {
			            
			            mediaPlayerNewCrs1.pause();
			            
			            if (!(QuestionCourse1.isEmpty())){
			                
			                Questions1Show.setText(QuestionCourse1.get(0));
			                CorrectAnswer1.setText(Answer1Course1.get(0));
			                WrongAnswer1.setText(Answer2Course1.get(0));
			                WrongAnswer2.setText(Answer3Course1.get(0));
			                
			                Questions2Show.setText(QuestionCourse1.get(1));
			                CorrectAnswer2.setText(Answer1Course1.get(1));
			                WrongAnswer3.setText(Answer2Course1.get(1));
			                WrongAnswer4.setText(Answer3Course1.get(1));
			                
			                Questions3Show.setText(QuestionCourse1.get(2));
			                CorrectAnswer3.setText(Answer1Course1.get(2));
			                WrongAnswer5.setText(Answer2Course1.get(2));
			                WrongAnswer6.setText(Answer3Course1.get(2));
			            
			            }
			            
			            Questions1ScenePane.setBottom(QuestionsBottomNewCourse1);

			            primaryStage.setScene(Questions1Scene);
			            primaryStage.show(); 
			        });
			        
			        // next Button new course 2 (in video page)
			        nextNewCrs2.setOnAction(e  -> {
			        
			            mediaPlayerNewCrs2.pause();
			            
			            if (!(QuestionCourse2.isEmpty())){
			                 
			                Questions1Show.setText(QuestionCourse2.get(0));
			                CorrectAnswer1.setText(Answer1Course2.get(0));
			                WrongAnswer1.setText(Answer2Course2.get(0));
			                WrongAnswer2.setText(Answer3Course2.get(0));

			                Questions2Show.setText(QuestionCourse2.get(1));
			                CorrectAnswer2.setText(Answer1Course2.get(1));
			                WrongAnswer3.setText(Answer2Course2.get(1));
			                WrongAnswer4.setText(Answer3Course2.get(1));

			                Questions3Show.setText(QuestionCourse2.get(2));
			                CorrectAnswer3.setText(Answer1Course2.get(2));
			                WrongAnswer5.setText(Answer2Course2.get(2));
			                WrongAnswer6.setText(Answer3Course2.get(2));
			            
			            }
			            
			            Questions1ScenePane.setBottom(QuestionsBottomNewCourse2);
			            
			            primaryStage.setScene(Questions1Scene); 
			            primaryStage.show();       
			        });
			         
			        // next Button new course 3 (in video page)
			        nextNewCrs3.setOnAction(e  -> {
			            
			            mediaPlayerNewCrs3.pause();
			        
			            if ( !(QuestionCourse3.isEmpty()) ){
			                
			                Questions1Show.setText(QuestionCourse3.get(0));
			                CorrectAnswer1.setText(Answer1Course3.get(0));
			                WrongAnswer1.setText(Answer2Course3.get(0));
			                WrongAnswer2.setText(Answer3Course3.get(0));
			                
			                Questions2Show.setText(QuestionCourse3.get(1));
			                CorrectAnswer2.setText(Answer1Course3.get(1));
			                WrongAnswer3.setText(Answer2Course3.get(1));
			                WrongAnswer4.setText(Answer3Course3.get(1));
			                
			                Questions3Show.setText(QuestionCourse3.get(2));
			                CorrectAnswer3.setText(Answer1Course3.get(2));
			                WrongAnswer5.setText(Answer2Course3.get(2));
			                WrongAnswer6.setText(Answer3Course3.get(2));
			            
			            }
			            
			            Questions1ScenePane.setBottom(QuestionsBottomNewCourse3);

			            primaryStage.setScene(Questions1Scene); 
			            primaryStage.show();
			        });
			        
			        AddVideo.setOnAction(e -> {
			            
			            FileChooser fileChooser = new FileChooser();
			            
			            fileChooser.getExtensionFilters().addAll(
			                new FileChooser.ExtensionFilter("MP4", ".mp4"),
			                new FileChooser.ExtensionFilter("(.mp4)", "*.mp4"));
			                
			                
			            fileVid = fileChooser.showOpenDialog(null);
			             
			            String link2 = "file:" + fileVid.getPath();
			            
			            video.add(link2);
			                       
			            switch(numCourse){
			                
			                case 0:
			                 
			                    Media mediaNewCrs1 = new Media(video.get(0)); 
			                    mediaPlayerNewCrs1 = new MediaPlayer(mediaNewCrs1);  
			                    
			                    mediaPlayerNewCrs1.pause();

			                    MediaView mediaViewNewCrs1 = new MediaView(mediaPlayerNewCrs1);
			                    mediaViewNewCrs1.setFitWidth(450);
			                    mediaViewNewCrs1.setFitHeight(500);
			                   
			                    newCrsVidBox1.getChildren().addAll(mediaViewNewCrs1,newCrsVidBtn1);
			                    break;
			                    
			                case 1 :
			                    
			                    Media mediaNewCrs2 = new Media(video.get(1)); 
			                    mediaPlayerNewCrs2 = new MediaPlayer(mediaNewCrs2);  
			                    
			                    mediaPlayerNewCrs2.pause();

			                    MediaView mediaViewNewCrs2 = new MediaView(mediaPlayerNewCrs2);
			                    mediaViewNewCrs2.setFitWidth(450);
			                    mediaViewNewCrs2.setFitHeight(500);
			                   
			                    newCrsVidBox2.getChildren().addAll(mediaViewNewCrs2,newCrsVidBtn2);
			                    break;
			                    
			                case 2 :
			                    
			                    Media mediaNewCrs3 = new Media(video.get(2)); 
			                    mediaPlayerNewCrs3 = new MediaPlayer(mediaNewCrs3);  
			                    
			                    mediaPlayerNewCrs3.pause();

			                    MediaView mediaViewNewCrs3 = new MediaView(mediaPlayerNewCrs3);
			                    mediaViewNewCrs3.setFitWidth(450);
			                    mediaViewNewCrs3.setFitHeight(500);
			                   
			                    newCrsVidBox3.getChildren().addAll(mediaViewNewCrs3,newCrsVidBtn3);
			                    break;
			                    
			                default:
			                    
			                    Label newCrsMsg1 = new Label("Sorry, there is somthing wrong in the video.");
			                    newCrsMsg1.setTextFill(Color.web("#DF7373"));
			                    newCrsMsg1.setFont(Font.font("Impact", 29));
			                    newCrsVidBox1.getChildren().addAll(newCrsMsg1);
			                    newCrsVidBox2.getChildren().addAll(newCrsMsg1);
			                    newCrsVidBox3.getChildren().addAll(newCrsMsg1);
			            }
			           
			        });
			        
			        
			        
			        //For the pause, play, reset the video buttons new course 1
			        resetNewCrs1.setOnAction(e -> {
			            mediaPlayerNewCrs1.seek(mediaPlayerNewCrs1.getStartTime()); // Reset to the beginning
			            mediaPlayerNewCrs1.pause();  
			        });
			        
			        playNewCrsVid1.setOnAction(e ->{
			            mediaPlayerNewCrs1.play();
			        });
			        
			        pauseNewCrsVid1.setOnAction(e ->{
			            mediaPlayerNewCrs1.pause();
			        });
			        
			        //For the pause, play, reset the video buttons new course 2
			        resetNewCrs2.setOnAction(e -> {
			            mediaPlayerNewCrs2.seek(mediaPlayerNewCrs2.getStartTime()); // Reset to the beginning
			            mediaPlayerNewCrs2.pause();  
			        });
			        
			        playNewCrsVid2.setOnAction(e ->{
			            mediaPlayerNewCrs2.play();
			        });
			        
			        pauseNewCrsVid2.setOnAction(e ->{
			            mediaPlayerNewCrs2.pause();
			        });
			      
			        //For the pause, play, reset the video buttons new course 3
			        resetNewCrs3.setOnAction(e -> {
			            mediaPlayerNewCrs3.seek(mediaPlayerNewCrs3.getStartTime()); // Reset to the beginning
			            mediaPlayerNewCrs3.pause();  
			        });
			        
			        playNewCrsVid3.setOnAction(e ->{
			            mediaPlayerNewCrs3.play();
			        });
			        
			        pauseNewCrsVid3.setOnAction(e ->{
			            mediaPlayerNewCrs3.pause();
			        });	
					
			//events
			tx4.setOnMouseClicked(e->{
				primaryStage.setScene(scene2);//sign up
			});
			bu1.setOnAction( e -> {
				 String firstValue = t1.getText();
		         String secondValue = t3.getText();
		         String thValue = t2.getText();
		         String forValue = t4.getText();
		         if(firstValue.isEmpty() || secondValue.isEmpty()) {
		            	Alert a=new Alert(AlertType.ERROR);
		            	a.setTitle("ERORR!!");
		                a.setHeaderText("You are not logged in \n or there is an error in your data");
		               // a.setContentText("You are going to delete you history.\nAre you sure?");
		                a.showAndWait();
		            }
		        else if (firstValue.equals(secondValue)&thValue.equals(forValue)) {
						primaryStage.setScene(scene3);
		       } else {
		    	   Alert a=new Alert(AlertType.ERROR);
	            	a.setTitle("ERORR!!");
	                a.setHeaderText("You are not logged in \n or there is an error in your data");
	               // a.setContentText("You are going to delete you history.\nAre you sure?");
	                a.showAndWait();
		            }
				
				    });
			
			   //show the next scene + stop animation time
	        time1.getKeyFrames().add(new KeyFrame(
	            Duration.seconds(10),
	            e -> {
	                primaryStage.setScene(scene);
	                time1.stop();
	            }
	        ));

	        time1.play();
	        
			bu1_1.setOnAction( e -> {
				 String firstValue = t3.getText();
		         String secondValue = t4.getText();
		         String thValue = t5.getText();
		         
		         if(firstValue.isEmpty() || secondValue.isEmpty()||thValue.isEmpty()) {
		            	Alert a=new Alert(AlertType.ERROR);
		            	a.setTitle("ERORR!!");
		                a.setHeaderText("All fields must be filled out !!");
		               // a.setContentText("You are going to delete you history.\nAre you sure?");
		                a.showAndWait();
		            }
		        else {
		        	primaryStage.setScene(scene);
		    	   t3.getText();
					t4.getText();
		            }
				
				    });
			//scene go to member scene 
			bu2.setOnAction( e -> {
				primaryStage.setScene(scene4);
			    });
			//scene go to home scene 
			bu4.setOnAction( e -> {
				primaryStage.setScene(scene3);
			    });
//			back
			
			bu5.setOnAction( e -> {
				primaryStage.setScene(scene3);
				
				//edit
			    });
			bu6.setOnAction( e -> {
				primaryStage.setScene(scene3);
			    });
			//Settings  scene
			circle3.setOnMouseClicked( e -> {
				primaryStage.setScene(scene5);
				    });
			//entertainment scene
			re3.setOnMouseClicked( e -> {
				primaryStage.setScene(scene7);
				    });
			//education scene
			re4.setOnMouseClicked( e -> {
			primaryStage.setScene(CourseScene);
				    });
            bu1_7.setOnAction( e -> {
               primaryStage.setScene(scene3);
				
				    });
            re33.setOnMouseClicked( e -> {
				primaryStage.setScene(scene7_1);
				    });
			re44.setOnMouseClicked( e -> {
			primaryStage.setScene(scene7_4);
				    });
            
			 ch1.setOnAction(e -> {
			        
		            FileChooser fileChooser = new FileChooser();
		            
		            fileChooser.getExtensionFilters().addAll(
		                new FileChooser.ExtensionFilter("All Images", "."),
		                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
		                new FileChooser.ExtensionFilter("PNG", "*.png"));
		            
		            File file = fileChooser.showOpenDialog(null);

		            if (file != null) {  // 
		                String link = file.toURI().toString();  // 
		                Image image2 = new Image(link);
		                ImagePattern pattern1 = new ImagePattern(image2);
		               circle4.setFill(pattern1);
		               circle.setFill(pattern1);
		               circle2.setFill(pattern1);
		               circle3_3.setFill(pattern1);
		            }
		            
		        });
			 ch2.setOnAction(e -> {
			        
		            FileChooser fileChooser = new FileChooser();
		            
		            fileChooser.getExtensionFilters().addAll(
		                new FileChooser.ExtensionFilter("All Images", "."),
		                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
		                new FileChooser.ExtensionFilter("PNG", "*.png"));
		            
		            File file = fileChooser.showOpenDialog(null);

		            if (file != null) {  // 
		                String link = file.toURI().toString();  // 
		                Image image2 = new Image(link);
		                ImagePattern pattern1 = new ImagePattern(image2);
		               circle4.setFill(pattern1);
		               circle.setFill(pattern1);
		               circle2.setFill(pattern1);
		               circle3_3.setFill(pattern1);
		            }
		            
		        });
			 
			//E.S.7.1
			 bu17_1.setVisible(false);
				t17_1.textProperty().addListener((observable, oldValue, newValue) -> {
				    if (newValue.equalsIgnoreCase("helicopter")||newValue.equalsIgnoreCase("Helicopter")||newValue.equalsIgnoreCase("HELICOPTER")) {
				       bu17_1.setVisible(true); 
				    } else {
				        bu17_1.setVisible(false); 
				    }
				});
				bu17_1.setOnAction(e->{
					bu17_1.setVisible(false); 
					primaryStage.setScene(scene7_2);
				});
				
				bu17_2.setVisible(false);
				t17_2.textProperty().addListener((observable, oldValue, newValue) -> {
				    if (newValue.equalsIgnoreCase("Cinema")||newValue.equalsIgnoreCase("cinema")||newValue.equalsIgnoreCase("CINEMA")) {
				       bu17_2.setVisible(true); 
				    } else {
				        bu17_2.setVisible(false); 
				    }
				});
				bu17_2.setOnAction(e->{
					bu17_2.setVisible(false); 
					primaryStage.setScene(scene7_3);
				});
				
				bu17_3.setVisible(false);
				t17_3.textProperty().addListener((observable, oldValue, newValue) -> {
				    if (newValue.equalsIgnoreCase("gpu")||newValue.equalsIgnoreCase("GPU")||newValue.equalsIgnoreCase("Gpu")) {
				       bu17_3.setVisible(true); 
				    } else {
				        bu17_3.setVisible(false); 
				    }
				});
				bu17_3.setOnAction(e->{
				bu17_3.setVisible(false);
				primaryStage.setScene(scene7_2);
			     });
			 //E.S.7.4
			 
				bu17_4.setVisible(false); 
				
				bu27_4.setOnAction(e->{
			    bu27_4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#4ddb60;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					 
					 showButton();
				} );
				bu37_4.setOnAction(e->{
					 bu37_4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#4ddb60;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					 showButton();
				} );
				bu74.setOnAction(e->{
					 bu74.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#4ddb60;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					 showButton();
				} );
				bu17_4.setOnAction(e->{
					bu17_4.setVisible(false);
					
					bu27_4.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					bu37_4.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					bu74.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
					 primaryStage.setScene(scene7_5);
				} );
				
				//E.S.7.5
				  bu17_5.setVisible(false); 
					
					bu27_5.setOnAction(e->{
						 bu27_5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#ea0b3b;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						 bu37_5.setVisible(false);
						 bu75.setVisible(false);
						 showButton2();
					} );
					bu37_5.setOnAction(e->{
						 bu37_5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#ea0b3b;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						 bu27_5.setVisible(false);
						 bu75.setVisible(false);
						 showButton2();
					} );
					bu75.setOnAction(e->{
						 bu75.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#4ddb60;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						 bu37_5.setVisible(false);
						 bu27_5.setVisible(false);
					} );
					scene7_5.setOnKeyPressed(event -> {
					    if (event.getCode() == KeyCode.R) {
					    	showButton2();
					    }
					});

					bu17_5.setOnAction(e->{
						bu17_5.setVisible(false);
						 bu37_5.setVisible(true);
						 bu27_5.setVisible(true);
						 bu75.setVisible(true);
						bu27_5.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						bu37_5.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						bu75.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
						 primaryStage.setScene(scene7_6);
					} );
				
				//E.S.7.6
					 bu17_6.setVisible(false); 
						
						bu27_6.setOnAction(e->{
							 bu27_6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#ea0b3b;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							 bu37_6.setVisible(false);
							 bu76.setVisible(false);
							 showButton3();
						} );
						bu37_6.setOnAction(e->{
							 bu37_6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#ea0b3b;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							 bu27_6.setVisible(false);
							 bu76.setVisible(false);
							 showButton3();
						} );
						bu76.setOnAction(e->{
							 bu76.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.4), 5, 0.0, 0, 4);-fx-background-color:#ea0b3b;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							 bu37_6.setVisible(false);
							 bu27_6.setVisible(false);
							 showButton3();
						} );
						cc.setOnMouseClicked(e->{
							 showButton3();
						});
						bu17_6.setOnAction(e->{
							bu17_6.setVisible(false);
							 bu37_6.setVisible(true);
							 bu27_6.setVisible(true);
							 bu76 .setVisible(true);
							bu27_6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							bu37_6.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							bu76.setStyle("-fx-background-color: #D4739C;-fx-font-family: Impact; -fx-font-size: 12px;-fx-text-fill:#FEFEDA;");
							 primaryStage.setScene(scene7);
						} );
						back.setOnAction(e->{
							 String soundPath = "button.mp3"; // Replace with the actual path
					            Media sound = new Media(new File(soundPath).toURI().toString());
					            MediaPlayer mediaPlayer = new MediaPlayer(sound);
					            mediaPlayer.play();
							primaryStage.setScene(scene3);
						});
			
			scene0.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("TOON");
			primaryStage.setScene(scene0);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private void showButton() {
		   bu17_4.setVisible(true); // Make the fourth button visible
		}
		private void showButton2() {
			   bu17_5.setVisible(true); // Make the fourth button visible
			}
		private void showButton3() {
			   bu17_6.setVisible(true); // Make the fourth button visible
			}
}

