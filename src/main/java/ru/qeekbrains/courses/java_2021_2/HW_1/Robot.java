package ru.qeekbrains.courses.java_2021_2.HW_1;

public class Robot implements Action{
    private String name;
    private int runningDistance;
    private int jumpHeight;

    public Robot(String name, int runningDistance, int jumpHeight){
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public boolean doAction(Object object, int dist) {
        Wall wall = new Wall();
        TreadMill treadMill = new TreadMill();
        if (wall.equals(object)==true){
//            System.out.println("This is Wall!");
            return this.jump(dist);
        }
        if (treadMill.equals(object)==true){
//            System.out.println("This is TreadMill!");
            return this.run(dist);
        }
        return false;
    }

    @Override
    public boolean jump(int wallHeight) {
        if (jumpHeight >= wallHeight){
//            System.out.println(name + " успешно перепрыгнул(а)! 101");
            return true;
        } else {
//            System.out.println(name + " не смог(ла) перепрыгнуть <00>");
            return false;
        }
    }

    @Override
    public boolean run(int treadMillLeght) {
        if ( runningDistance >= treadMillLeght){
//            System.out.println(name + "  успешно пробежал(а)!!! 101");
            return true;
        } else {
//            System.out.println(name + " пробежать не удалось <00>");
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
