package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public enum FIGURE {
        CIR,
        SQ,
        TR,
        Q
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter figure name in (TR)iangle, (CIR)cle or (SQ)uare.");
        FIGURE cur = FIGURE.valueOf(sc.next());
        selectFigure(cur);

    }

    public static void selectFigure(FIGURE figure) {
        switch (figure) {
            case CIR:
                System.out.println("Enter radius: ");
                double Ct1 = 0;
                try {
                    Ct1 = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.err.println("InputMismatchException " + e.getMessage());
                }
                Circle circle = new Circle(Ct1);
                System.out.println(circle.getName());
                System.out.println(circle.getSq());
                break;
            case TR:
                System.out.println("Enter height and base length: ");
                double Tt1 = 0;
                double Tt2 = 0;
                try {
                    Tt1 = sc.nextDouble();
                    Tt2 = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.err.println("InputMismatchException " + e.getMessage());
                }
                Triangle triangle = new Triangle(Tt1, Tt2);
                System.out.println(triangle.getName());
                System.out.println(triangle.getSq());
                break;
            case SQ:
                System.out.println("Enter height and width: ");
                double St1 = 0;
                double St2 = 0;
                try {
                    St1 = sc.nextDouble();
                    St2 = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.err.println("InputMismatchException " + e.getMessage());
                }
                Square square = new Square(St1, St2);
                System.out.println(square.getName());
                System.out.println(square.getSq());
                break;
            default:
                System.err.println("Error data ^-(");
                break;
        }
    }
}