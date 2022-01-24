package ru.qeekbrains.courses.java_2022_3.HW_1;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> boxList;

    public Box (T fruit){
        boxList = new ArrayList<>();
        boxList.add(fruit);
    }

    public ArrayList<T> getBoxList() {
        return boxList;
    }

    public void setFruit(T fruit) {
        if (fruit.getClass() == boxList.get(0).getClass()) {
            boxList.add(fruit);
        } else System.out.println("Нельзя поместить в коробку разные фрукты");
    }

    public void setFruit(T[] fruit) {
        for(int i =0; i<fruit.length;i++) {
            if (fruit[i].getClass() == boxList.get(0).getClass()) {
                boxList.add(fruit[i]);
            } else System.out.println("Нельзя поместить в коробку разные фрукты");
        }
    }

    public void setBoxList(Box<T> box){
        if (boxList.get(0).getClass() == box.getBoxList().get(0).getClass()){
            for (int i =0;i<box.getBoxList().size();i++){
                this.boxList.add(box.getBoxList().get(i));
            }
            box.remuve();
        } else System.out.println("Нельзя объединить коробки с разными фруктами");
    }

    public float getWeight(){
        float weight = 0;
        weight = this.boxList.size() * this.boxList.get(0).getWeight();
        return weight;
    }

    public boolean compare(Box<T> box){
        if (this.getWeight()==box.getWeight()){
            return true;
        } else return false;
    }

    public void remuve(){
        this.boxList.removeAll(boxList);
    }

}
class Test {
    public static void main(String[] args) {
        Fruit fr1 = new Apple();
        Fruit fr2 = new Apple();
        Fruit fr6 = new Apple();
        Fruit fr7 = new Apple();
        Fruit fr3 = new Orange();
        Fruit fr4 = new Orange();
        Fruit fr5 = new Orange();
        Fruit [] ap1 = {fr1, fr2};
        Fruit [] or = {fr3, fr4, fr5};
        Fruit [] ap2 = {fr1, fr2,fr6, fr7};
        Box<Fruit> box1 = new Box<>(fr1);
        Box<Fruit> box2 = new Box<>(fr5);
        Box<Fruit> box3 = new Box<>(fr2);
        box1.setFruit(ap1);
        box2.setFruit(or);
//        box1.setFruit(fr5);
//        System.out.println("box1 " + box1.getWeight());
//        System.out.println("box2 " + box2.getWeight());
//        System.out.println(box1.compare(box2));

        box1.setBoxList(box2);
        box1.setBoxList(box3);
    }
}