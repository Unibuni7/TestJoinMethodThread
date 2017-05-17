/*
 *  Developed by Abdulmuaz Alshaikhli
 * Slmnshukur1993@gmail.com
 * Student Easj.dk 2017. 
 MIT Licensed.
 */
package testjoinmethodthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slmns
 */
public class TestJoinMethodThread extends Thread{
//public void run(){
//    for(int i=0; i<=5; i++){
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException ex) {
//            System.out.println(ex);
//        }
//        System.out.println(i);
//    }
//}
//    public void run(){
//        for(int i=0; i<5; i++){
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                System.out.println(ex);
//            }
//            System.out.println(i);
//        }
//    }
    
//    public void run(){
//        System.out.println("Running.....");
//    }
//    
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TestJoinMethodThread t1 = new TestJoinMethodThread();
//        TestJoinMethodThread t2 = new TestJoinMethodThread();
//        TestJoinMethodThread t3 = new TestJoinMethodThread();
//        
//        t1.start();
//    try {
//        t1.join();
//    } catch (InterruptedException ex) {
//        System.out.println(ex);
//    }
//    t2.start();
//    t3.start();
//TestJoinMethodThread t4 = new TestJoinMethodThread();
//TestJoinMethodThread t5 = new TestJoinMethodThread();
//TestJoinMethodThread t6 = new TestJoinMethodThread();
//
//t4.start();
//        try {
//            t4.join(1500);
//        } catch (InterruptedException ex) {
//            System.out.println(ex);
//        }
//        t5.start();
//        t6.start();
//TestJoinMethodThread t7 = new TestJoinMethodThread();
//TestJoinMethodThread t8 = new TestJoinMethodThread();
//
//        System.out.println("Name of t7: " + t7.getName());
//        System.out.println("Name of t8: " + t8.getName());
//        System.out.println("Id of t7: " + t7.getId());
//        
//        t7.start();
//        t8.start();
//        
//        t7.setName("Sum ting");
//        System.out.println("After Changning name of t7: " + t7.getName());

TestJoinMethodThread t9 = new TestJoinMethodThread();
TestJoinMethodThread t10 = new TestJoinMethodThread();

t9.start();
t10.start();
    }
    
}
