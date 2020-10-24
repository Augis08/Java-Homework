package ND_2020_10_17;

public class Main {

    //1. Create a class Furniture. It has a name, dimensions.
    //2. Create a class Room. Room has a size, many furniture.
    //3. Create a class House. A house has a kitchen, bedroom, bathroom and extra rooms.
    //4. Create a class Street. A street has many houses, town name it belongs to.
    //5. Create a function that prints names of all the furniture of all the houses in the street (where, in what class, static or not is up to you)

public static void main (String [] args){

    Furniture furniture1 = new Furniture("Wardrobe",500,2000,400);
    Furniture furniture2 = new Furniture("Table",900,800,600);
    Furniture furniture3 = new Furniture("Sofa",1200,600,700);
    Furniture furniture4 = new Furniture("Chair",400,800,400);
    System.out.println(furniture1);
    System.out.println(furniture2);
    System.out.println(furniture3);
}

}
