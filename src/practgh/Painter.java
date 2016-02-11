package practgh;

import java.util.ArrayList;

public class Painter extends Functions {

	ArrayList<String> commands;

	public void runsolve() {

		initialize();

		inputgrid = getInput();

		solve();

	}

	public void initialize() {
		commands = new ArrayList<String>();
	}

	public void solve() {
		for (int yy = 0; yy < Y; yy++) {
			for (int xx = 0; xx < X; xx++) {
				if (inputgrid[xx][yy][0] == 1 && inputgrid[xx][yy][1] == 0) {
					solvePoint(xx, yy);
				}
			}
		}
		return;
	}

	public void solvePoint(int x, int y) {
		int xr = 0, yd = 0;

		int rightLength = 0, downLength = 0;

		String command;

		while (x + xr < X && notdone(inputgrid[x + xr][y]) ) {
			rightLength++;
			xr++;
		}

		while ( y + yd < Y && notdone(inputgrid[x][y + yd]) ) {
			downLength++;
			yd++;
		}

		if (rightLength >= downLength) {
			command = "PAINT_LINE " + y + " " + x + " " + y + " " + x + rightLength;
			paintLine(x, y, x + rightLength, y);
		} else {
			command = "PAINT_LINE " + y + " " + x + " " + y + " " + x + rightLength;
			paintLine(x, y, x + rightLength, y); /* TODO */
		}
		
		commands.add(command);
	}

	public boolean notdone(int[] cell) {
		return cell[0] == 1 && cell[1] == 0; // Should be drawn and is not yet
												// drawn...
	}

	public static void main(String[] args) {
		(new Painter()).runsolve();
	}
}