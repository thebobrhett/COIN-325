/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

/**
 *
 * @author Bob
 */
public class EmptyCollectionException extends Exception {
    public EmptyCollectionException(String message) {
        super(message);
        message = "There are no elements on the stack.";
        System.out.println(message);
    }
}
