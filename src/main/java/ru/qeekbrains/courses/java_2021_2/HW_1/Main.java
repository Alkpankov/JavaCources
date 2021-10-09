package ru.qeekbrains.courses.java_2021_2.HW_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("BArs", ((int) (75*Math.random())+1),((int) (5*Math.random())+1));
        Men men = new Men("Vasya", ((int) (100*Math.random())+1),((int) (3*Math.random())+1));
        Robot robot = new Robot("Wally", ((int) (150*Math.random())+1),((int) (10*Math.random())+1));

        Action [] object = new Action[] {cat, men, robot};

        Obstacle [] obstacleCourse = new Obstacle[10];
        for (int i = 0; i<(obstacleCourse.length-5);i++) {
            obstacleCourse[i] = new TreadMill(((int) (110*Math.random())));
        }
        for (int i = 4; i<(obstacleCourse.length);i++) {
            obstacleCourse[i] = new Wall(((int) (10 * Math.random())));
        }


        run(object, obstacleCourse);

//        Wall wall = new Wall(5);
//        TreadMill treadMill = new TreadMill(6);
//        object[1].detect(obstacleCourse[1], obstacleCourse[1].get());
//        object[2].detect(obstacleCourse[1], obstacleCourse[1].get());

    }

    private static void run(Action [] object, Obstacle[] track){
        for (int i = 0; i<object.length;i++){
            System.out.println("На полосу препятствий выходит " + object[i].getName());
            for (int j = 0; j<track.length;j++){
                if (object[i].doAction(track[j],track[j].get())==true) {
                    System.out.println((j+1) + " препятстиве пройдено");
                }
             else {
                System.out.println(object[i].getName() + " прешел "+ (j+1) + " препятствий из "+ track.length);
                    System.out.println("---------------------------------------------");
                j=track.length;
            }
            }
        }
    }
}
