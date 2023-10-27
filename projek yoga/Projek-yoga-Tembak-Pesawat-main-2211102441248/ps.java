import greenfoot.*;

public class ps extends Actor {
    private bg pl;

    public void addedToWorld(World bg) {
        pl = (bg) bg;
    }

    public void act() {
        // Add your action code here.
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 1); // Bergerak ke atas
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 1); // Bergerak ke bawah
        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 1, getY()); // Bergerak ke kiri
        }
        if (Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 1, getY()); // Bergerak ke kanan
        }

        if (Greenfoot.mouseClicked(null)) {
            pl.addObject(new peluru1(), getX() + getImage().getHeight(), getY());
            Greenfoot.playSound("p1.wav");
        }

        Actor a = getOneObjectAtOffset(0, 0, ufo.class);
        if (a != null) {
            getWorld().addObject(new api(), getX(), getY());
            ((bg) getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}
