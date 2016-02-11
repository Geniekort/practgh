package practgh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Functions  {

	int[][][] inputgrid; // [X][Y][0 = should be drawn, 1 = drawn, ]
	int X,Y;
	
	 public int[][][] getInput(){
		 
		int[][][] output;
		
		
		try{ 
			Scanner in = new Scanner(new FileReader("./src/inputfail.txt"));
		
			Y = in.nextInt();
			X = in.nextInt();
			output = new int[X][Y][5];
			in.nextLine();
			
			String temp = new String();
			
			for(int i = 0;  i < Y; i++){
				temp = in.nextLine();
				for(int j = 0; j < X; j++){
				
					if(temp.charAt(j) == '#') {
						output[j][i][0] = 1;
					} else {
						output[j][i][0] = 0;
					}
				}
			}
			
			
			in.close();
				
		}catch(FileNotFoundException e) { 
            System.out.println("Could not open file due to"); System.out.println(e); 
            return null;
		}
		return output;
	}

	 public void paintLine(int x, int y, int xeen, int yeen){
		 for(int i = x; i <= xeen; i++){
			  
			 for(int j = y; j <= yeen; j++){
				 inputgrid[i][j][1] = 1;
			 }
		 }
	 }
	 
	 public void commandPoeh(ArrayList<String> poeh){
		 System.out.println(poeh.size());
		 for(int i = 0; i < poeh.size(); i++){
			 System.out.println(poeh.get(i));
		 }
	 }
}