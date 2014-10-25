
import java.util.*;
import java.util.Scanner;
		
		public class ListaEnlazada {	
				public static int pasa;
				public static int pos;
			
		public static Vagones Vagon;
		
			public ListaEnlazada(){
				Vagon = null;
			}
		
			public void Agregarv(int cantp){
				System.out.println("Ingrese número de pasajeros");
				Scanner pas= new Scanner(System.in);
				pasa=pas.nextInt();
				Vagones nuevoVagon = new Vagones(pasa);
				System.out.println("Ingrese posición de Vagon");
				Scanner posi= new Scanner(System.in);
				pos=posi.nextInt();
				nuevoVagon.sig = Vagon;
				Vagon = nuevoVagon;
		}
		
		public void Eliminarv(int pos){
			Vagones tempo = Vagon, anterior=null;
			int tempoa=1;
			if(tempo!=null){
				while(pos>=tempoa){
					if(pos==tempoa){
						if(anterior== null)
							Vagon=Vagon.sig;
						else
							anterior.sig= tempo.sig;
						
						break;
					}
					else{
						anterior= tempo; 
						pos+=pos; 
						tempo=tempo.sig;
					}
				}
			}else{
				System.out.println("No existe en la lista");
			}
			
		}
		
		public void EliminaralI(){
			if(Vagon != null)
				Vagon = Vagon.sig;
			else
				System.out.println("La lista no tiene ningún elemento");
			}		
		
			
		public void EliminaralF(){
			Vagones vago = Vagon;
			while(vago != null){
				vago = vago.sig;
				if(vago.sig==null)
					vago = null;
			}
		}

		public void Imprimir(){
			Vagones vag = Vagon;
			if(vag!= null){
				int pos=1;
				while(vag!=null){
					System.out.println("Vagon "+pos+"Pasajeros"+pasa);
					pos+=pos;
				}
			}else
				System.out.println("Lista No tiene pasajeros ni vagones");
		}
		public static void main(String[] args){
			int menu=0;
			ListaEnlazada l=new ListaEnlazada();
			while(menu!=6){
				System.out.println("------Opciones------");
				System.out.println("1. Agregar Vagones");
				System.out.println("2. Eliminar");
				System.out.println("3. Eliminar al Inicio");
				System.out.println("4. Eliminar al Final");
				System.out.println("5. Imprimir");
					Scanner men=new Scanner(System.in);	
					menu=men.nextInt();
				switch (menu){
					case 1:
						l.Agregarv(0);
					case 2:	
						l.Eliminarv(0);
					case 3:
						l.EliminaralI();
					case 4:
						l.EliminaralF();
					case 5:
						l.Imprimir();
					break;
				default:
					break;
				}
		}
		}
}
	