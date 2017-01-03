/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class MyException1 extends Exception {
    public MyException1() { super(); }
    public MyException1(String s) { super(s); }
    public MyException1(String s, Throwable t) { super(s, t); }
    public MyException1(String s, Throwable t, boolean b1, boolean b2) { super(s, t, b1, b2); }
}
