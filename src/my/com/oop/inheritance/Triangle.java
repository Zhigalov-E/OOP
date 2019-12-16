package my.com.oop.inheritance;


public class Triangle extends my.com.oop.inheritance.Figure {

    @Override
    public void draw() {
        super.draw();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void erase() {
        super.erase();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void move(int pixel) {
        super.move(pixel);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String getColor() {
        return super.getColor();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean setColor(String colour) {
        return super.setColor(colour);    //To change body of overridden methods use File | Settings | File Templates.
    }

    /**
     * New Method
     */
    public void flipVertical () {

    };

    /**
     * New Method
     */
    public void flipHorizontal () {

    };
}
