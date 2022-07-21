package intralot;

import java.util.Arrays;
import java.util.Scanner;

public class Tinka {
	
	// almacenamos los posibles resultados
	public static int apuesta1[] = new int[6];
	public static int apuesta2[] = new int[6];
	public static int apuesta3[] = new int[6];
	public static int apuesta4[] = new int[6];
	public static int apuesta5[] = new int[6];
	public static int apuesta6[] = new int[6];
	public static int apuesta7[] = new int[6];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numerosGanadores[] = { 1, 2, 3, 4, 5, 6 };		
		int numerosComprados[];
		numerosComprados = new int[7];
		
		//seteamos los valores ingresados al arreglo "numerosComprados"
		for (int i = 0; i < numerosComprados.length; i++) {
			System.out.println("Ingrese el número " + (i + 1) + ":");
			int comprado = scanner.nextInt();
			numerosComprados[i] = comprado;
		}
		
		System.out.print("Sus numeros son: "+Arrays.toString(numerosComprados));
		System.out.println();
		
		
        int r = 6; //numero de columnas
        int n = numerosComprados.length; //numero de filas
        
        // metodo para hallar la posibles combinaciones
        Print_Combination(numerosComprados, n, r);
        System.out.println("Sus combinaciones son: ");
        System.out.println(Arrays.toString(apuesta1));
        System.out.println(Arrays.toString(apuesta2));
        System.out.println(Arrays.toString(apuesta3));
        System.out.println(Arrays.toString(apuesta4));
        System.out.println(Arrays.toString(apuesta5));
        System.out.println(Arrays.toString(apuesta6));
        System.out.println(Arrays.toString(apuesta7));
        System.err.println("");
        System.out.print("Los números ganadores son: "+Arrays.toString(numerosGanadores)+"\n");
    	int aciertos1=0, aciertos2=0, aciertos3=0, aciertos4=0, aciertos5=0, aciertos6=0, aciertos7=0;
		int jugada2=0, jugada3=0, jugada4=0, jugada5=0, jugada6=0; 
		
		
		/*buscar coincidencias*/
		for (int i = 0; i < apuesta1.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta1[i]==numerosGanadores[j]) {
					aciertos1++;
				}
			}
		}
		
		
		for (int i = 0; i < apuesta2.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta2[i]==numerosGanadores[j]) {
					aciertos2++;
				}
			}
		}
		
		for (int i = 0; i < apuesta3.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta3[i]==numerosGanadores[j]) {
					aciertos3++;
				}
			}
		}
		
		for (int i = 0; i < apuesta4.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta4[i]==numerosGanadores[j]) {
					aciertos4++;
				}
			}
		}
		
		for (int i = 0; i < apuesta5.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta5[i]==numerosGanadores[j]) {
					aciertos5++;
				}
			}
		}
		
		for (int i = 0; i < apuesta6.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta6[i]==numerosGanadores[j]) {
					aciertos6++;
				}
			}
		}
		
		for (int i = 0; i < apuesta7.length; i++) {
			for (int j = 0; j < numerosGanadores.length; j++) {
				if(apuesta7[i]==numerosGanadores[j]) {
					aciertos7++;
				}
			}
		}
		
		
		if (aciertos1 == 2) {
			jugada2++;
		} 
		if (aciertos1 == 3) {
			jugada3++;
		} 
		if (aciertos1 == 4) {
			jugada4++;
		} 
		if (aciertos1 == 5) {
			jugada5++;
		} 
		if (aciertos1 == 6) {
			jugada6++;
		}

		if (aciertos2 == 2) {
			jugada2++;
		} 
		if (aciertos2 == 3) {
			jugada3++;
		} 
		if (aciertos2 == 4) {
			jugada4++;
		} 
		if (aciertos2 == 5) {
			jugada5++;
		} 
		if (aciertos2 == 6) {
			jugada6++;
		} 
		
		
		if (aciertos3 == 2) {
			jugada2++;
		} 
		if (aciertos3 == 3) {
			jugada3++;
		} 
		if (aciertos3 == 4) {
			jugada4++;
		} 
		if (aciertos3 == 5) {
			jugada5++;
		} 
		if (aciertos3 == 6) {
			jugada6++;
		} 
		
		
		if (aciertos4 == 2) {
			jugada2++;
		} 
		if (aciertos4 == 3) {
			jugada3++;
		} 
		if (aciertos4 == 4) {
			jugada4++;
		} 
		if (aciertos4 == 5) {
			jugada5++;
		} 
		if (aciertos4 == 6) {
			jugada6++;
		} 

		
		if (aciertos5 == 2) {
			jugada2++;
		} 
		if (aciertos5 == 3) {
			jugada3++;
		} 
		if (aciertos5 == 4) {
			jugada4++;
		} 
		if (aciertos5 == 5) {
			jugada5++;
		} 
		if (aciertos5 == 6) {
			jugada6++;
		} 
		
		
		if (aciertos6 == 2) {
			jugada2++;
		} 
		if (aciertos6 == 3) {
			jugada3++;
		} 
		if (aciertos6 == 4) {
			jugada4++;
		} 
		if (aciertos6 == 5) {
			jugada5++;
		} 
		if (aciertos6 == 6) {
			jugada6++;
		} 
		
		
		if (aciertos7 == 2) {
			jugada2++;
		} 
		if (aciertos7 == 3) {
			jugada3++;
		} 
		if (aciertos7 == 4) {
			jugada4++;
		} 
		if (aciertos7 == 5) {
			jugada5++;
		} 
		if (aciertos7 == 6) {
			jugada6++;
		} 
        
        
        
        
        System.out.println("hay "+jugada2+ " jugadas con 2 acietos");
        System.out.println("hay "+jugada3+ " jugadas con 3 acietos");
        System.out.println("hay "+jugada4+ " jugadas con 4 acietos");
        System.out.println("hay "+jugada5+ " jugadas con 5 acietos");
        System.out.println("hay "+jugada6+ " jugadas con 6 acietos");
			
		scanner.close();
		
	}
	
	// metodos para combinar los numeros comprados y ordenarlos
	
	static void CombinationPossible(int Input_Array[], int Empty_Array[], int Start_Element, int End_Element,
			int Array_Index, int r) {

		if (Array_Index == r) {
			for (int x = 0; x < r; x++) {
				if (apuesta1[x] == 0) {
					apuesta1[x] = Empty_Array[x];
				} else if (apuesta2[x] == 0) {
					apuesta2[x] = Empty_Array[x];
				} else if (apuesta3[x] == 0) {
					apuesta3[x] = Empty_Array[x];
				} else if (apuesta4[x] == 0) {
					apuesta4[x] = Empty_Array[x];
				} else if (apuesta5[x] == 0) {
					apuesta5[x] = Empty_Array[x];
				} else if (apuesta6[x] == 0) {
					apuesta6[x] = Empty_Array[x];
				} else {
					apuesta7[x] = Empty_Array[x];
				}

				//System.out.print(Empty_Array[x] + " ");

			}
			//System.out.println("");
			return;

		}

		for (int y = Start_Element; y <= End_Element && End_Element - y + 1 >= r - Array_Index; y++) {
			Empty_Array[Array_Index] = Input_Array[y];
			CombinationPossible(Input_Array, Empty_Array, y + 1, End_Element, Array_Index + 1, r);

		}
	}

	static void Print_Combination(int Input_Arrary[], int n, int r) {
		int Empty_Array[] = new int[r];
		CombinationPossible(Input_Arrary, Empty_Array, 0, n - 1, 0, r);
	}
	


}
