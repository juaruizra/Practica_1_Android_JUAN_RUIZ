
package inventario;
import java.util.Scanner;


public class Inventario  {
Scanner leer=new Scanner(System.in);
String nombre;
int cantidad=0, costo=0, cant_ventas=0,cant_gan=0;
void inicio(){
    System.out.println("======================");
   System.out.println("Por favor seleccion una opcion:");
      System.out.println("|1| Agregar producto");
      System.out.println("|2| Buscar Producto");
      System.out.println("|3| Eliminar producto");
      System.out.println("|4| Mostrar Inventario");
      System.out.println("|5| Realizar venta");
      System.out.println("|6| Ganacias Totales");
      System.out.println("|7| Salir");
}
    
void agregar(){
System.out.println("======================");
System.out.println("Por favor Ingrese:");
System.out.println("Nombre Producto:");
this.nombre=leer.nextLine();
System.out.println("Cantidad:");
this.cantidad=leer.nextInt();
System.out.println("Costo:");
this.costo=leer.nextInt();

}
    void mostrar(){
System.out.println("Nombre Producto: "+this.nombre+" Cantidad: "+this.cantidad+" Costo: "+this.costo);
 }
    void mostrar_2(){
System.out.println("Nombre Producto: "+this.nombre+" Cantidad Vendidas: "+this. cant_ventas+" Ganacia: "+this.cant_gan);
 }
    
  
    
   
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Inventario producto[]=new Inventario[100];
    int suma=0;
        for (int i=0;i<producto.length;i++){
            producto[i]=new Inventario();
        }
    
   int opc=0, cont=0,aux=0, Tcant=0, Tgan=0, cant=0;
    String Buscar;   
   do{       
    producto[cont].inicio();
    opc=leer.nextInt();
    leer.nextLine(); 
  switch(opc){
      case 1:{// agregar
      producto[cont].agregar();
      cont++;
      break;
      }
      case 2:{// buscar
      System.out.println("======================");
       System.out.println("Producto a buscar: ");
       Buscar=leer.nextLine();
       for(aux=0;aux<cont;aux++){
         if(Buscar.equals(producto[aux].nombre)){
        // System.out.println("Producto Si exite");
         producto[aux].mostrar();
         aux=1000;
         }
     }
      if(aux!=1001){System.out.println("Producto NO exite");}
       System.out.println("======================");
          
      break;
      }
      case 3:{// eliminar
      System.out.println("======================");
       System.out.println("Producto a eliminar: ");
       Buscar=leer.nextLine();
       for(aux=0;aux<cont;aux++){
         if(Buscar.equals(producto[aux].nombre)){
         System.out.println("Producto Si exite, Eliminacion OK");
         //producto[aux].mostrar();
         producto[aux].nombre= " ";
         producto[aux].costo=0;
         producto[aux].cantidad=0;
         aux=1000;
         }
     }
      if(aux!=1001){System.out.println("Producto NO exite");}
       System.out.println("======================");
      break;
      }
      case 4:{//mostrar
          System.out.println("======================");
      for(aux=0;aux<cont;aux++){
         
         System.out.println("El producto ["+(aux+1) +"] es:");
          producto[aux].mostrar();
      }
        System.out.println("======================");
        break;
      }
      case 5:{//venta
       System.out.println("======================");
       System.out.println("Producto a Vender: ");
       Buscar=leer.nextLine();
       
       for(aux=0;aux<cont;aux++){
         if(Buscar.equals(producto[aux].nombre)){
             System.out.println("Cantidad: ");
             cant=leer.nextInt();
          if(producto[aux].cantidad>= cant){
              System.out.println("mayor ");
              producto[aux].cantidad-=cant;
              Tcant+=cant;
              Tgan=Tgan+(cant*producto[aux].costo);
              System.out.println("Producto Si exite, Venta OK");
              producto[aux].cant_ventas+=cant;
              producto[aux].cant_gan+=(cant*producto[aux].costo);
         }
           else    System.out.println("No hay esa Cantidad disponible"); 
         aux=1000;
         }
     }
      if(aux!=1001){System.out.println("Producto NO exite");}
       System.out.println("======================");
      break;
      }
      case 6:{// ganacias
      System.out.println("======================");
      for(aux=0;aux<cont;aux++){
       if( producto[aux].cant_ventas!=0)    producto[aux].mostrar_2();
      }
      System.out.println("T Vendidos:"+Tcant+" T Ganancia: "+Tgan);
       System.out.println("======================");
      break;
      }
      case 7:{
               opc=-1;
      break;
      }
  }      
        
    } while(opc!=-1);
}

    
}