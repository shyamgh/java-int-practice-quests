package tests;

import java.util.ArrayList;
import java.util.List;

public class AddBigNumberUsingList {

    /*class Node {
    
        int data;
        Node next;
        Node prev;
    
        public Node(int d, Node n, Node p) {
            data = d;
            next = n;
            prev = p;
        }
    }*/

    public static void main(String[] args) {

        // input1
        List<Integer> input1 = new ArrayList<Integer>();
        input1.add(9);
        input1.add(9);
        input1.add(5);
        List<Integer> output1 = addNumber(input1, 3);
        System.out.println("After adding " + 3 + " to " + input1 + " output is " + output1);

        // input2
        List<Integer> input2 = new ArrayList<Integer>();
        input2.add(9);
        input2.add(9);
        input2.add(9);

        List<Integer> output2 = addNumber(input2, 5);
        System.out.println("After adding " + 5 + " to " + input2 + " output is " + output2);
    }

    private static List<Integer> addNumber(List<Integer> input1, int data) {
        List<Integer> input = new ArrayList<Integer>(input1);
        boolean carryFlag = false;

        if ((input.get(input.size() - 1) + data) >= 10) {
            int temp = input.get(input.size() - 1) + data;
            temp = temp % 10;
            input.set(input.size() - 1, temp);
            carryFlag = true;
        }
        else {
            int temp = input.get(input.size() - 1) + data;
            input.set(input.size() - 1, temp);
        }

        for (int i = input.size() - 2; i >= 0; i--) {
            if (carryFlag) {
                if ((input.get(i) + 1) == 10) {
                    carryFlag = true;
                    input.set(i, 0);
                }
                else {
                    int temp = input.get(i) + 1;
                    input.set(i, temp);
                    carryFlag = false;
                    break;
                }
            }
            else {
                break;
            }
        }

        if (carryFlag) {
            input.add(0, 1);
        }

        return input;
    }

}
