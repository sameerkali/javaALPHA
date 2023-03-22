

public class shortestPath {

    public static float getShortestPath (String path) {
     int x = 0,y = 0;
     for (int i=0; i < path.length(); i++) {
        char dir = path.charAt(i);
        if (dir == 'S'){
            y--;
        }
        else if (dir == 'N'){
            y++;
        }
        else if (dir == 'W'){
            x--;
        }
        else {
            x++;
        }
     }
    int X = x*x;
    int Y = y*y;
    return (float)Math.sqrt(X+Y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}