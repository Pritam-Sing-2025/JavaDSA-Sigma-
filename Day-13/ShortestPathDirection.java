public class ShortestPathDirection {
    static float shortestPathDirection(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //North
            if (direction == 'N') {
                y++;
            }
            //South
            else if (direction == 'S') {
                y--;
            }
            //East
            else if (direction == 'E') {
                x++;
            }
            //West
            else {
                x--;
            }
        }
        int xSq = x * x;
        int ySq = y * y;
        return (float) Math.sqrt(xSq + ySq);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPathDirection(path));
    }
}
