public class hw4{
    public static void main (String []args){
        Point p= new Point(3,4);
        Rectangle box = new Rectangle (0,0,100,200);

        rectmovleft(p,box);
        System.out.println("New position x = "+box.getX()+", y= "+box.getY());

    }

    public static void rectmovleft(Point p, Rectangle box){
        if (p.getX()<0){
            System.out.println("Usage: input x is not legal");
            return;
        }
        box.setX(box.getX()+p.getX());
        box.setY(box.getY()+p.getY());
    }
}

class Point{
    private int x,y;

    public Point (int x, int y){
        this.x=x; this.y=y;
    }
    public int getX(){
        return x;

    }
    public int getY(){
        return y;
    }
}

class Rectangle{
    private int x,y,width,height;
        public Rectangle(int x, int y, int width,int height){
            this.x=x;  this.y=y;   this.width=width;    this.height=height;}
        
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}