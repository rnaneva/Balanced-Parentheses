package StacksAndQueues.Exc;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] brackets = scanner.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        if(brackets.length % 2 !=0){
            System.out.println("NO");
            stack.push('+');
        } else {

            for (char currentBracket : brackets) {
                if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                    stack.push(currentBracket);
                } else {
                    if (currentBracket == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (currentBracket == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (currentBracket == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }


        if (stack.isEmpty()) {
            System.out.println("YES");
        }
    }
}
