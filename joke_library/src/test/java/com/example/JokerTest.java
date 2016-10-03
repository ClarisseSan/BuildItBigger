package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A java library for supplying jokes
 */
public class JokerTest {
    @Test
    public void getJoke() throws Exception {
        Joker joker = new Joker();
        assertNotNull(joker.getJoke());
    }

}