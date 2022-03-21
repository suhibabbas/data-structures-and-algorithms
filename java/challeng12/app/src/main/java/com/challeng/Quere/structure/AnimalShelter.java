package com.challeng.Quere.structure;

import com.challeng.Quere.data.Animal;

import java.util.NoSuchElementException;

public class AnimalShelter {
    
    private Animal back;
    private Animal front;
    
    public boolean enQueue(Animal animal){
        if(!animal.getAnimalType().equals("cat")&& !animal.getAnimalType().equals("dog")){
            return false;
        }

        if(isEmpty()){
            front = animal;
        }else {
            animal.setNext(back);
        }
        back = animal;
        return true;
    }



    public Animal deQueue(String pref){
        Animal frontTemp;
        Animal backTemp;

        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        }else{
            if(front.getAnimalType().equals(pref) || !pref.equals("cat") && !pref.equals("dog")){
                frontTemp =front;
                backTemp = back;
                front = front.getNext();

                while (backTemp != frontTemp && backTemp !=null){
                        front=backTemp;
                    backTemp =backTemp.getNext();
                }

                return frontTemp;
            }else {

                frontTemp = front;
                backTemp = back;

                while (back != null){
                    if(back.getAnimalType().equals(pref)){
                        frontTemp = back;
                    }
                    back = back.getNext();
                }

                while (backTemp != null){
                    if(backTemp!= frontTemp){
                        back = backTemp;

                    }
                    backTemp = backTemp.getNext();
                }
            return frontTemp;
            }
        }
    }



    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "back=" + back +
                ", front=" + front +
                '}';
    }
}
