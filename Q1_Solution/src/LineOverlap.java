public class LineOverlap {

    // Define the Line class
    class Line {
        double left;
        double right;

        public Line(double x1, double x2) {
            this.left = x1;
            this.right = x2;
        }

    }

    // public API call
    public boolean isOverlap(double x1, double x2, double x3, double x4) {
        Line l1 = new Line(x1, x2);
        Line l2 = new Line(x3, x4);
        return compare(l1, l2);
    }

    // Generate line
    private Line getLine(double x1, double x2) {
        Line l;
        if (x1 < x2) l = new Line(x1, x2);
        else l = new Line(x2, x1);
        return l;
    }


    // Compare two lines
    private boolean compare(Line l1, Line l2) {
        return l2.left < l1.right && l2.right > l1.left;
    }

    /* Test
    public static void main(String[] args) {
        LineOverlap lo = new LineOverlap();
        System.out.println(lo.isOverlap(0, 6, 3, 4));
        System.out.println(lo.isOverlap(3, 4, 1, -1));
        System.out.println(lo.isOverlap(3, 4, 1, 3.2));
        System.out.println(lo.isOverlap(3, 4, 3.5, 1));
    }
    */
}
