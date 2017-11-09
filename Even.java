import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.application.Application;
import java.util.Arrays;

public class Even extends Application{
	@Override
	public void start(Stage primaryStage){
	 	int d=1;
		int[] evens = new int[101];
		int i = 0;

		while(i<=100){
			evens[i] = 2*i;
				i++;
		}
				System.out.println("the first 100 even numbers are "+Arrays.toString(evens));
		int[] odds = new int[101];
		int e = 0;

		while(e<=100){
			odds[e]=(2*e)+1;
				e++;
		}
				System.out.println("\n"+"The first 100 odd numbers are " +Arrays.toString(odds));
		while(d<26){
			System.out.print(" ");
		switch(d){
			case 3:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 17:
			case 18:
			case 19:
			case 23:
				System.out.print("*");
			break;
			default:
				System.out.print(" ");
				}if (d%5==0){
					System.out.println();

			
		              
			} d++;	
		}

	}
}
