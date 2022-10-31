package Pack04;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello77 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(1);
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		root.setSpacing(10);
		// 디자인 작성.----------------------------------------------------------------------------
		// 컨트롤 : 속성제어 + 액션제어(클릭등 이벤트)
		
		// 부모에게 컨트롤을 연결시키는 방법1
//		Button btn1 = new Button("버튼1");
//		root.getChildren().add(btn1);
//		Button btn2 = new Button("버튼2");
//		root.getChildren().add(btn2);
		
		// 부모에게 컨트롤을 연결시키는 방법2
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println(1000);
			}
		});
		
		Button btn2 = new Button("버튼2");
		root.getChildren().addAll(btn1, btn2);
		
		//--------------------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		launch(); // blocking 함수
		System.out.println("end");
	}

}



/*package Pack04;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello77 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(1);
		VBox root = new VBox();
		root.setPrefSize(400, 300);
		// 디자인 작성.----------------------------------------------------------------------------

		
		
			
		//--------------------------------------------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		launch(); // blocking 함수
		System.out.println("end");
	}

}

// ex1)
/*
package Pack04;


import javafx.application.Application;
import javafx.stage.Stage;

public class Hello77 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(1);
		arg0.show();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		launch(); // blocking 함수
		System.out.println("end");
	}

}
*/