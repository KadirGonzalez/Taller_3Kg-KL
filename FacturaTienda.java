// Integrantes: Kadir Gonzalez 8-1044-1802, Kenneth Lau 8-1047-1451
/*Fecha: 21 de septiembre de 2026
Grupo: 5
 */
public class FacturaTienda {
    public static void main(String[] args) { 
    
    // Ejercicio 1: Variables y constante
    String nombreProducto = "Teclado";
    int cantidad = 3;
    double precioUnitario = 25.50;
    boolean aplicaDescuento = true;

    final double TASA_ITBMS = 0.07;
    
    // Ejercicio 2: Calculos de la factura

    double subtotal = cantidad * precioUnitario;
    double ITBMS = subtotal * TASA_ITBMS;
    double total = subtotal + ITBMS;

    System.out.println("Producto " + nombreProducto);
    System.out.println("subtotal: " + subtotal);
    System.out.println("ITBMS: " + ITBMS);
    System.out.println("Total: " + total);
    
    // Ejercicio 3: Descuento del 10%

    double descuento = 0;
    if (aplicaDescuento) {
        descuento = subtotal * 0.10;
    }
    
    // Resultado esperado: 74.205
    double totalFinal = subtotal + (subtotal * TASA_ITBMS)
    - (subtotal * 0.10);

    System.out.println("Descuento: " + descuento);
    System.out.println("Total final: " + totalFinal);

    // Ejercicio 4: Expresion booleana

    int a = 7, b = 4, c = 2, d = 5;
    boolean resultado = (a % b ==3)
    && (c * d > 8 || a - b <= c);
    System.out.println("Resultado booleano: " + resultado);
    
    // Ejercicio 5: Reto aritmetico

    /* 
    * Expresion: a + b % c - d
    * paso 1: a * b = 7 * 4 = 28
    * paso 2: 28 % c = 28 % 2 = 0
    * paso 3: 0 - d = 0 - 5 = -5
    * Resultado esperado: -5
    */
    int retoFinal = a * b % c - d;

    System.out.println("Reto final: " + retoFinal );
    }

}