import java.util.Scanner;
	
public class WindChill {


	

		public static void main(String[] args) {

						

						final String Name = "Bao Nguyen";
						Scanner input = new Scanner (System.in);
						double temperature, windspeed, windchill;
						
							System.out.println ("------Wind Chill Caculator------");
							
							// Ask users for temperature in Fahrenheit
							System.out.println ("Enter the temperature in Fahrenheit");
							System.out.println ("(must be >= -45 and <= 40):");
							
							//Users input their variables for temperature here.
							temperature = input.nextDouble();
							
							//Ask users for wind speed 
							System.out.println ("Enter the wind speed");
							System.out.println ("(must be >= 5 and <= 60):");
							
							//Users input their variables for wind speed here.
							windspeed = input.nextDouble();
							
							
							//formula to calculate wind chill
							windchill = 35.74 + (0.6215*temperature) - 35.75*(Math.pow(windspeed,0.16)) + ((0.4275*temperature)*(Math.pow(windspeed, 0.16)));
							
							System.out.println ("Wind Chill Temperature:"+windchill+" degrees Fahrenheit");
						System.out.println 	("Programmer Name:" +Name);
						}
					}






