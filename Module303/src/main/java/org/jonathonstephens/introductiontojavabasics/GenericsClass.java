package org.jonathonstephens.introductiontojavabasics;

public class GenericsClass<T> {
    private T data; // class variable of T type

    public GenericsClass(T data) { // constructor
        this.data = data;
    }
    //method that returns the type
    public T getData() {
        return this.data;
    }

}
