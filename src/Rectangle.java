public class Rectangle {

    private int length;
    private int width;
    private int area;
    private int perimeter;

    public Rectangle(int initLength, int initWidth){
        length = initLength;
        width = initWidth;

        area = length * width;
        perimeter = (length*2) + (width*2);
    }

    public int RectangleArea(){
        return area;
    }

    public int RectanglePeri(){
        return perimeter;
    }

    public Boolean RectangleCompare(int area2){
        return area < area2;
    }

    public Boolean isSquare(){
        return length == width;
    }

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(5,3);
        Rectangle rectangle2 = new Rectangle(3,3);
        
        int area1 = rectangle1.RectangleArea();
        int area2 = rectangle2.RectangleArea();
    
        System.out.println(area1);
        System.out.println(rectangle1.RectanglePeri());
        System.out.println(rectangle1.RectangleCompare(area2));
        System.out.println(rectangle1.isSquare());
        System.out.println(rectangle2.isSquare());
    }
}

