package org.desgnpatterns.solid.lsp.badcode;

public class BirdService {
    public void makeItFly(Bird bird) {
        bird.fly(); // 💣 will throw an error in case of bird is penguin
    }
}
