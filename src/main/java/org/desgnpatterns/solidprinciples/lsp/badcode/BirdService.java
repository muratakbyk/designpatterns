package org.desgnpatterns.solidprinciples.lsp.badcode;

public class BirdService {
    public void makeItFly(Bird bird) {
        bird.fly(); // 💣 will throw an error in case of bird is penguin
    }
}
