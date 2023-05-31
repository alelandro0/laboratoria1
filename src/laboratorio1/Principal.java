package laboratorio1;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Procesos area = new Procesos();
        String mensaje = "**Menu Calcular Area**\n\n";
        mensaje += "1) ingresar valores\n";
        mensaje += "2) calcular area\n";
        mensaje += "3) Salir\n\n";
        int opt = 0;
        int codigoOperacion = 0;
        Map<Integer, Procesos> map = new HashMap<>();
        
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            area.menu(opt);
            
            if (opt != 3 && area.getResultado() != 0) {
                codigoOperacion = area.getCodigo();
                map.put(codigoOperacion, new Procesos(area.getLadoA(), area.getLadoB(), area.getResultado()));
            }
        } while (opt != 3);

        for (Map.Entry<Integer, Procesos> entry : map.entrySet()) {
            int key = entry.getKey();
            Procesos val = entry.getValue();
            
            System.out.println("Codigo de operaciOn: " + key);
            System.out.println("Area calculada: " + val.getResultado());
        }
    }
}