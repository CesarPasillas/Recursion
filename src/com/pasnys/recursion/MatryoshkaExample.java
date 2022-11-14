package com.pasnys.recursion;

public class MatryoshkaExample {

    static class Matryoshka {
        private int noDolls;
        private int currDoll = 0;

        public Matryoshka (int noDolls){
            //This is the number of the doll that the Matryoshka can store
            this.noDolls = noDolls;

        }

        public int getNumberOfDolls(Matryoshka doll){
            //We add the current doll to the count of the number of dolls
            doll.currDoll++;

            //We verify if reach the last doll (talking of the Matryoshka doll, if the doll cannot be open.
            //To know if we can open the doll is verifying is we are in the last doll, or if the current doll is equals
            // to the number of the dolls, and we return the current number of dolls.
            if (doll.noDolls == doll.currDoll ){
                System.out.println("but how many dolls are inside? (" + doll.currDoll + " + 0)");
                return doll.currDoll;
            } else {
                System.out.println("but how many dolls are inside? (" + doll.currDoll + " + ?)");
                //if we can open the doll then we do a recursive call  of the getNumberOfDolls method.
                //Here is where we split the problem in smaller problems.
                getNumberOfDolls(this);
            }

            return currDoll;
        }

        public int getNumberOfDolls(){

            return getNumberOfDolls(this);
        }

    }

    public static void main(String[] args) {
	    //create a Matryoshka doll
        Matryoshka myDoll = new Matryoshka(10);
        System.out.println("Number of doll inside of the Matryoshka: " + myDoll.getNumberOfDolls());
    }
}
