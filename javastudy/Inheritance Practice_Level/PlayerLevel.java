package ch16;

public abstract class PlayerLevel {
    
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    
    
    public void go(int number) {
        run();
        for (int i=0; i<number; i++) {
            jump();
        }
        turn();
    }

}
