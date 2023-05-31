package laboratorio1;

import javax.swing.JOptionPane;

public class Procesos {
    double ladoA;
    double ladoB;
    double resultado;
    int codigo;

    public Procesos(double ladoA, double ladoB, double resultado ) {
        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.resultado = resultado;
    }

    public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public int getCodigo() {
		return codigo;
	}
	public Procesos() {
        ladoA = 0;
        ladoB = 0;
        codigo=0;
        resultado = 0;
    }

    public void menu(int opt) {
        switch (opt) {
            case 1:
                ingresarValores();
                break;
            case 2:
                calcularArea();
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    public void ingresarValores() {
    	codigo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el codigo del area"));
        ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lado A"));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lado B"));
    }

    public double calcularArea() {
        resultado = ladoA * ladoB;
        JOptionPane.showMessageDialog(null, "**RESULTADO**\n" + resultado);
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
