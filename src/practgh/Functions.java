package practgh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Functions  {

	int[][][] inputgrid; // [X][Y][0 = should be drawn, 1 = drawn, ]
	int X,Y;
	
	 public int[][][] getInput(){
		 
		int[][][] output;
		
		
		try{ 
			Scanner in = new Scanner(new FileReader(""));
		
			X = in.nextInt();
			Y = in.nextInt();
			output = new int[X][Y][5];
			in.nextLine();
			
			String temp = new String();
			
			for(int i = 0;  i < Y; i++){
				temp = in.nextLine();
				for(int j = 0; j < X; j++){
				
					if(temp.charAt(j) == '#') {
						output[i][j][0] = 1;
					} else {
						output[i][j][0] = 0;
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
		 for(int i = x; i < xeen; i++){
			 inputgrid[x][xeen][1] = 1;
		 }
		 for(int j = y; j < yeen; j++){
			 inputgrid[y][yeen][1] = 1;
		 }
	 }
}