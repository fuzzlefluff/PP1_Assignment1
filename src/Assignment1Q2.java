//Mattthew Prindle Section C
import javax.swing.JOptionPane;
public class Assignment1Q2 {

	public static void main(String[] args) {
	
		//variables we will need in the program	
	int temperature;
	int windspeed;
	double windchill;
	double wind;
	
	//setup our scanner, prompt for input and store that input
	temperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the temperature"));
	windspeed = Integer.parseInt(JOptionPane.showInputDialog("Please enter the windspeed"));
	
	
	//check to see if input is valid
	if (temperature < 41 && temperature > -58 && windspeed > 2)
	{
		//calculate the wind chill
		wind = Math.pow(windspeed,0.16);
		windchill = 35.74 + 0.6215*temperature-35.75*wind+0.4275*temperature*wind;
		//print our result and format to only show 1 decimal point
		JOptionPane.showMessageDialog(null,"The Windchill is" + String.format("%.1f", windchill));
	}
	//tell the user the input is invalid
	else
	{
		JOptionPane.showMessageDialog(null,"Invalid Windspeed or temperature");
	}
	}
	}