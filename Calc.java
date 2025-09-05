package com.II;

public class Calc {
    public static int run(String args) {
        String[] str = args.split(" ");

        int result = Integer.parseInt(str[0]);     // 계산 결과값

        for (int i = 1; i < str.length; i+=2) {
                String operator = str[i];
                int num2 = Integer.parseInt(str[i+1]);

                result = switch (operator) {
                    case "*" -> result * num2;
                    case "+" -> result + num2;
                    case "-" -> result - num2;
                    default -> result;
                };
        }

        return result;
    }
}
