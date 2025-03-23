package org.example.interviewPractice;

public class Composition {
    // Engine class can't exist without Car, Totally depend on the Car Object
}

class Engine {

}

class Car {
    Engine engine = new Engine();
}

