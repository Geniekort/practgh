package practgh;

import java.util.ArrayList;

public class Painter extends Functions{

	int[][][] inputgrid; // [X][Y][0 = should be drawn, 1 = drawn, ]
	ArrayList<String> commands;
	
	public void run(){
		
		initialize();
		
		inputgrid = getInput();
		
		solve();
		
		
	}
	
	public void initialize(){
		commands = new ArrayList<String>();
	}
	
	public void solve(){				
		for(int yy = 0; yy < Y; yy++){
			for(int xx = 0; xx < X; xx++){
				if(inputgrid[xx][yy][0] == 1 && inputgrid[xx][yy][1] == 0){
					solvePoint(xx,yy);
				}												
			}
		}
		
	}
	
	public void solvePoint(int x, int y){
		int xr = 0, yd = 0;
		
		int rightLength = 0, downLength;
		
		while(notdone(inputgrid[x + xr][y]) && x + xr < X){
			rightLength++;			
			xr++;
		}
	}
	
	
	public boolean notdone(int[] cell){
		return cell[0] == 1 && cell[1] == 0; //Should be drawn and is not yet drawn...
	}
	public static void main(String[] args) {
		(new Painter()).run();
	}
}
