public class Squares {
    public static int countGoodRectangles(int[][] rectangles){
        int max = 0;
        int counter = 0;

        for (int i=0; i<rectangles.length; i++){
            int side = Math.min(rectangles[i][0],rectangles[i][1]);
            if (side > max){
                max = side;
                counter = 1;
            } else if (side == max) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int[][] rect = {{2,3},{3,7},{4,3},{3,7}};
        System.out.println(countGoodRectangles(rect));
    }
}
