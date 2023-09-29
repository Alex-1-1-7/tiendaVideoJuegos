/*
Crear un programa en Java que simule una tienda de videojuegos. 
El programa debe llevar un registro de los juegos disponibles, 
el control de clientes, el total de ventas por juego y en total, 
y aplicar descuentos si se cumplen ciertas condiciones.
*/
package tiendavideojuegos;

import javax.swing.JOptionPane;


public class TiendaVideojuegos {


    public static void main(String[] args) {
        //declaracion cantidad de video juegos 
     int cantidadFifa =10, cantidadCyberpunk2077=10,cantidadTheLastofUs=10,
         cantidadRedDeadRedemption2=10, cantidadTheLegendofZelda=10,
         cantidadAssassisCreedValhalla=10;   
        //declaracion de variables 
        int opcion, cantidadClientes=0,juegosVendidos=0;
        float subtotalCompra, totalCompra=0, ingresos=0;
        
     JOptionPane.showMessageDialog(null, "Bienvenido a la tienda \n"
             + "GameTop");
     
    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú principal \n"
             + "Tenemos los siguientes video juegos: \n"
             + "1. FIFA 22, precio: $22.99, disponibles: "+cantidadFifa+"\n"
             + "2. Cyberpunk2077, precio: $27.99, disponibles: " +cantidadCyberpunk2077+"\n"
             + "3. TheLastofUs, precio: $29.99, disponibles: " +cantidadTheLastofUs+"\n"
             + "4. RedDeadRedemption2, precio: $35.99, disponibles: "+cantidadRedDeadRedemption2+"\n"
             + "5. TheLegendofZelda, precio: $27.99, disponibles: "+cantidadTheLegendofZelda+"\n"
             + "6. AssassisCreedValhalla, precio: $21.99, disponibles: "+cantidadAssassisCreedValhalla+"\n"
             + "Ingrese el numero del juego que desea comprar o cero para finalizar " ));
     
    switch (opcion){
         case 1: 
            float precioFifa =22.99f,cantidadJuegos;
            
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( FIFA 22 )"));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadFifa){
                // el error que estaba cometiendo era: cantidadJuegos>1 
                // por ende cuando pedia el tota de la compra siempre me sumaba uno de mas 
            cantidadFifa -= cantidadJuegos;  
            // cantidadFifa = cantidadFifa - cantidadJuegos
            subtotalCompra = cantidadJuegos * precioFifa; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            //totalCompra = totalCompra + subtotalCompra
            juegosVendidos += cantidadJuegos;
            
            
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
     
    break;
         case 2: 
            float precioCyberpunk2077 =27.99f;
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( Cyberpunk2077 ) "));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadCyberpunk2077){
            cantidadCyberpunk2077 -= cantidadJuegos;  
            subtotalCompra = cantidadJuegos * precioCyberpunk2077 ; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            juegosVendidos += cantidadJuegos;
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
            break;
            case 3: 
            float precioTheLastofUs =29.99f;
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( TheLastofUs ) "));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadTheLastofUs){
             cantidadTheLastofUs -= cantidadJuegos;  
            subtotalCompra = cantidadJuegos * precioTheLastofUs; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            juegosVendidos += cantidadJuegos;
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
            break;
                case 4: 
            float precioRedDeadRedemption2 =35.99f;
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( RedDeadRedemption2 )"));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadRedDeadRedemption2){
            cantidadRedDeadRedemption2 -= cantidadJuegos;  
            subtotalCompra = cantidadJuegos * precioRedDeadRedemption2; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            juegosVendidos += cantidadJuegos;
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
            break;
                case 5: 
            float precioTheLegendofZelda =27.99f;
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( TheLegendofZelda )"));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadTheLegendofZelda){
            cantidadTheLegendofZelda -= cantidadJuegos;  
            subtotalCompra = cantidadJuegos * precioTheLegendofZelda; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            juegosVendidos += cantidadJuegos;
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
            break;
                case 6: 
            float precioAssassisCreedValhalla =21.99f;
            cantidadJuegos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea de este juego ( AssassisCreedValhalla )"));
            if (cantidadJuegos>0 && cantidadJuegos<= cantidadAssassisCreedValhalla){
            cantidadAssassisCreedValhalla -= cantidadJuegos;  
            subtotalCompra = cantidadJuegos * precioAssassisCreedValhalla; 
            JOptionPane.showMessageDialog(null, "El subtotal de su compra es: $"+subtotalCompra);
            totalCompra+= subtotalCompra;
            juegosVendidos += cantidadJuegos;
            }
            else {
            JOptionPane.showMessageDialog(null, "Ya no hay juegos disponibles");       
                    }
            break;
            case 0:
            cantidadClientes++;    
            
       double ventaTotal=0, ventaConDescuento;
    
    
       if (totalCompra>=100){
        ventaConDescuento = totalCompra * 0.10;
        ventaTotal = totalCompra - ventaConDescuento;
        /*JOptionPane.showMessageDialog(null, "El total de la compra es:" +totalCompra+ "\n"
                + "tiene un 10% de descuento, el total a pagar final es: "+ventaTotal); */ 

        /* Para mostrar el total a pagar final con solo dos decimales, utilice el 
        método String.format()en la línea donde se imprime el  mensaje */
        JOptionPane.showMessageDialog(null, "El total de la compra es: " + String.format("%.2f", totalCompra) + "\n"
                + "Tiene un 10% de descuento, el total a pagar final es: " + String.format("%.2f", ventaTotal));
        
        
        /*} else if (totalCompra<100) {
        ventaTotal= totalCompra;
        JOptionPane.showMessageDialog(null, "El total de la compra es:"+ventaTotal);      
       }*/
        
        } else if (totalCompra < 100) {
        ventaTotal = totalCompra;
        JOptionPane.showMessageDialog(null, "El total de la compra es: " + String.format("%.2f", ventaTotal));      
        }
        
       ingresos += ventaTotal;
       
       //reiniciar
       totalCompra =0;
       ventaTotal =0;
       break;
        
            
       case 1234:
            JOptionPane.showMessageDialog(null, "La cantidad de clientes fue: "+cantidadClientes+"\n"
            +"La cantidad de juegos vendidos fue: "+juegosVendidos+"\n"
            +"los ingresos totales fueron: "+ String.format("%.2f", ingresos));
            
            
            break;
    
    }
    
    }while (opcion>=0);
   
   
}

    
}
