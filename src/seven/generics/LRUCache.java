package seven.generics;

import java.util.ArrayList;

public class LRUCache<T> {

    private ArrayList<T> elements = new ArrayList<>();
    private int size;

    public LRUCache(int size) {
        this.size = size;
    }

    public void addElement(T element){
        if (this.elements.size() >= size){
            elements.remove(0);
        }

        elements.add(element);
    }

    public void removeElement(int index){
        if (!this.elements.isEmpty()){
            elements.remove(index);
        }
    }

    public T getElement(int index){
        if (this.elements.isEmpty()){
            return null;
        }

        else {
            return this.elements.get(index);
        }
    }

    public ArrayList<T> getAllElement(){
       return this.elements;
    }
}
