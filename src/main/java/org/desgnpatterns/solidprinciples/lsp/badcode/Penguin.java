package org.desgnpatterns.solidprinciples.lsp.badcode;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
