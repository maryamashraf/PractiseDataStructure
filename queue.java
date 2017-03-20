/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author US
 */
import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add(45);
        q.add(23);
        q.add(5);
        int size = q.size();

        for (int i = 0; i < size; i++) {
            Object element = q.remove();
            /*if(element>=30)*/
            {

                System.out.println(element);
                q.add(element);
            }
            System.out.println();

            while (!q.isEmpty()) {
                System.out.println(q.remove());
            }

        }
    }
}
