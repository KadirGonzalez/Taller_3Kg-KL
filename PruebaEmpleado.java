/*
 * Taller N.3 - Programacion 1
 * Grupo: 5 Fecha: 09/21/2026
 * Integrante 1: Kenneth Lau - 8-1047-1451
 * Integrante 2: Kadir Gonzalez - 8-1044-1802
 */

public class PruebaEmpleado {

    public static void main(String[] args) {
Empleado empleado1 = new Empleado();
Empleado empleado2 = new Empleado();

 empleado1.nombre = "Kenneth Lau";
        empleado1.cedula = "8-1047-1451";
        empleado1.cargo = "Programador";
        empleado1.salarioBase = 900.00;
        empleado1.añosServicio = 3;
        empleado1.esSupervisor = true;

 empleado2.nombre = "Kadir Gonzalez";
        empleado2.cedula = "8-1044-1802";
        empleado2.cargo = "Tecnico";
        empleado2.salarioBase = 800.00;
        empleado2.añosServicio = 2;
        empleado2.esSupervisor = false;

        double bono1 = empleado1.salarioBase * 0.05 * empleado1.añosServicio;
double bono2 = empleado2.salarioBase * 0.05 * empleado2.añosServicio;

double totalEmpleado1 = empleado1.salarioBase + bono1;
double totalEmpleado2 = empleado2.salarioBase + bono2;

if (empleado1.esSupervisor) {
    totalEmpleado1 += 150.0;
}

if (empleado2.esSupervisor) {
    totalEmpleado2 += 150.0;
}
System.out.println("===== EMPLEADO 1 =====");
System.out.println("Nombre: " + empleado1.nombre);
System.out.println("Cedula: " + empleado1.cedula);
System.out.println("Cargo: " + empleado1.cargo);
System.out.println("Salario base: $" + empleado1.salarioBase);
System.out.println("Años de servicio: " + empleado1.añosServicio);
System.out.println("Bono de antiguedad: $" + bono1);
System.out.println("Salario total: $" + totalEmpleado1);

System.out.println();

System.out.println("===== EMPLEADO 2 =====");
System.out.println("Nombre: " + empleado2.nombre);
System.out.println("Cedula: " + empleado2.cedula);
System.out.println("Cargo: " + empleado2.cargo);
System.out.println("Salario base: $" + empleado2.salarioBase);
System.out.println("Años de servicio: " + empleado2.añosServicio);
System.out.println("Bono de antiguedad: $" + bono2);
System.out.println("Salario total: $" + totalEmpleado2);

if (totalEmpleado1 > totalEmpleado2) {
    System.out.println("El empleado 1 tiene el salario total más alto.");
} else if (totalEmpleado2 > totalEmpleado1) {
    System.out.println("El empleado 2 tiene el salario total más alto.");
} else {
    System.out.println("Ambos empleados tienen el mismo salario total.");
}
    }

}
