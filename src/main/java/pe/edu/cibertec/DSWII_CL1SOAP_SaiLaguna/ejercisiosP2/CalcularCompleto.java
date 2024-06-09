package pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.ejercisiosP2;

import java.util.Scanner;

public class CalcularCompleto {

    // Método para calcular las cuotas y el interés de un préstamo
    public static void calculateLoan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto del préstamo: ");
        double loanAmount = scanner.nextDouble();
        int numberOfInstallments;
        double interestRate;

        // Determinar el número de cuotas
        if (loanAmount > 5000) {
            numberOfInstallments = 3;
        } else if (loanAmount < 1000) {
            numberOfInstallments = 1;
        } else if (loanAmount >= 2000 && loanAmount <= 3000) {
            numberOfInstallments = 2;
        } else {
            numberOfInstallments = 5;
        }

        // Determinar la tasa de interés
        if (loanAmount < 4000) {
            interestRate = 0.12;
        } else {
            interestRate = 0.10;
        }

        double totalDebt = loanAmount * (1 + interestRate);
        double installmentAmount = totalDebt / numberOfInstallments;

        System.out.println("Número de cuotas: " + numberOfInstallments);
        System.out.println("Monto de cada cuota: " + installmentAmount);
    }

    // Método para mostrar la vocal correspondiente a un número
    public static void showVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero (1-5): ");
        int number = scanner.nextInt();
        String vowel;

        switch (number) {
            case 1: vowel = "A"; break;
            case 2: vowel = "E"; break;
            case 3: vowel = "I"; break;
            case 4: vowel = "O"; break;
            case 5: vowel = "U"; break;
            default: vowel = "Número no válido"; break;
        }

        System.out.println("La vocal correspondiente es: " + vowel);
    }

    // Método para obtener el cubo y la cuarta de una secuencia de números
    public static void calculatePowers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite de número: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            int cube = i * i * i;
            int fourth = cube * i;
            System.out.println("Número: " + i + ", Cubo: " + cube + ", Cuarta: " + fourth);
        }
    }

    // Método para calcular el total a pagar en un almacén con descuento
    public static void calculateTotalPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio unitario del artículo: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Ingrese la cantidad adquirida: ");
        int quantity = scanner.nextInt();

        double discount;
        if (quantity > 20) {
            discount = 0.10;
        } else if (quantity > 10) {
            discount = 0.05;
        } else {
            discount = 0.0;
        }

        double totalPrice = unitPrice * quantity * (1 - discount);
        System.out.println("El total a pagar es: " + totalPrice);
    }

    // Método para validar si un año es bisiesto
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    public static void main(String[] args) {
        calculateLoan();
        showVowel();
        calculatePowers();
        calculateTotalPrice();
        checkLeapYear();
    }
}
