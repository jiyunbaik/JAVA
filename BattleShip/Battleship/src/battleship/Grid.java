package battleship;

import java.util.Random;
import java.util.Scanner;

public class Grid {

    Scanner scanner = new Scanner(System.in);
    final static int MAX_ROW = 5;
    final static int MAX_COLUMN = 5;
    final static int MAX_SHOOTING_TIMES = 15;
    final static int TARGET_NUMBER = 5;
    private Cell[][] grid;
    int currentShootingTimes = 0;
    int hitCount = 0;

    public Grid() {
        grid = new Cell[MAX_ROW][MAX_COLUMN];
        initialize();
        generateShip();
    }

    public void initialize() {
        for (int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COLUMN; col++) {
                grid[row][col] = Cell.NORMAL;
            }
        }  
    }
    
    public void generateShip(){
        Coordinate[] array = new Coordinate[TARGET_NUMBER];
        int count = 0;
        while (count < TARGET_NUMBER) {
            Coordinate newCoordinate = new Coordinate(new Random().nextInt(MAX_ROW), new Random().nextInt(MAX_COLUMN));
            
            boolean isAdjacent = false;
            for (int i = 0; i < count; i++) {
                Coordinate c = array[i];
                isAdjacent = c.isAdjacent(newCoordinate);
                if (isAdjacent) {
                    break;
                }
            }
            
            if (!isAdjacent) {
                grid[newCoordinate.getX()][newCoordinate.getY()] = Cell.SHIP;
                array[count++] = newCoordinate;
            }
        }
    }

    public void display() {
        System.out.print(" ");
        for (int col = 0; col < MAX_COLUMN; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int row = 0; row < MAX_ROW; row++) {
            System.out.print(row);
            for (int col = 0; col < MAX_COLUMN; col++) {
                System.out.print(grid[row][col].getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void shoot() {       
        while (!isExceeded() && !isAllHit()) {
            display();
            System.out.println("Enter the coordinate to shoot row/col");
            System.out.println("Shot: "+currentShootingTimes+"/"+MAX_SHOOTING_TIMES);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if ( x < 0 || x  >= MAX_ROW ||  y< 0 || y >= MAX_COLUMN ){
                System.out.println("Please choose correct coordinate");
                continue;
            }
            Coordinate coor = new Coordinate(x,y);
            Cell cell = grid[coor.getX()][coor.getY()];
            switch (cell) {
                case SHIP:
                    System.out.println("You got the SHIP!!");
                    cell = Cell.HIT;
                    hitCount++;
                    currentShootingTimes++;
                    break;
                case NORMAL:
                    System.out.println("You MISSED!");
                    cell = Cell.MISSED;
                    currentShootingTimes++;
                    break;
                default:
                    System.out.println("You have entered this coordinate before");
                    break;
            }
            grid[coor.getX()][coor.getY()] = cell;
        }     
    }

    public boolean isAllHit() {
        return (hitCount == TARGET_NUMBER);
    }

    public boolean isExceeded() {
        return (currentShootingTimes == MAX_SHOOTING_TIMES);
    }
    
}
