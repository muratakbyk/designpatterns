package org.desgnpatterns.solidprinciples.lsp.goodcode;


public class BirdService {

    public void makeItFly(FlyBird bird) {
        bird.fly(); // it will not be able to throw an error now
    }
}
