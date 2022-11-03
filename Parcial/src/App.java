public class App 
{
	private int tamaño;
	private int op;
	private int matriz1[][];
	private int matriz2[][];
	private int suma[][];
	private int transponere [][];
	
	private void menú()
	{
		do
		{	System.out.println("     ================================================================");
			System.out.println("     |                               M E N Ú                        |");
			System.out.println("     ================================================================");
			System.out.println("");
			System.out.print("[1] Digite Los Valores A Las Matrices");
			System.out.println("");
			System.out.print("[2] Suma De Matrices");
			System.out.println("");
			System.out.print("[3] Transpuesta");
			System.out.println("");
			System.out.print("[4] Triangulares Superior E Inferior");
			System.out.println("");
			System.out.print("[5] Cuadro Mágico");
			System.out.println("");
			System.out.print("[6] Salir");
			System.out.println("");
			System.out.println("");
			System.out.print("Digite la opción que desea: ");
			op = SavitchIn.readInt();
			switch(op)
			{
				case 1: datos();
					break;
				case 2: suma(this.matriz1,this.matriz2);
					break;
				case 3: transponer(this.suma);
					break;
				case 4: triangular(this.transponere); 
					break;				
				case 5: cudradomagic();
					break;
			}
		}while (op!=6);
		salir();
	}
	private void datos()
	{	
		System.out.println("     ----------------------Warning--------------------------");
		System.out.println("     | PRIMERO DEBE MENCIONAR LA DIMENSIÓN DE LAS MATRICES  |");
		System.out.println("     -------------------------------------------------------");
		System.out.println("");
		System.out.print("Digite la medida para filas y columnas de la matriz 1 y 2 :");
		tamaño = SavitchIn.readInt();
		System.out.println(" ");
		this.matriz1 = new int[tamaño][tamaño];
		this.matriz2 = new int[tamaño][tamaño];
		System.out.println("Digite los datos para la Matriz No. 1 [" + tamaño + "x" + tamaño +"] :" );
		rellenar (this.matriz1);
		System.out.println("" );
		System.out.println("Digite los datos para la Matriz No. 2 [" + tamaño + "x" + tamaño +"] :" );
		rellenar (this.matriz2);
		System.out.println("" );
		System.out.println("     ====================================");
		System.out.println("     |             RESULTADO             |");
		System.out.println("     ====================================");
		System.out.println("La matriz No.1 obtenida es :" );
		imprimir(this.matriz1);
		System.out.println("" );
		System.out.println("La matriz No.2 obtenida es :" );
		imprimir(this.matriz2);
		System.out.println("" );
	}
	private void rellenar(int Matriz[][])
	{
		int alto = Matriz.length;
		int ancho = Matriz[0].length;

		for(int i = 0; i < alto; i++)
		{
			for(int j = 0; j < ancho; j++)
			{
				System.out.print("Digite el elemento ["+(i + 1)+","+(j + 1)+"] de la matriz :");
			     int n = SavitchIn.readLineInt();
			     Matriz [i][j] = n;
			}
		}
	}	
	private void imprimir(int Matriz[][])
	{
		int alto = Matriz.length;
		int ancho = Matriz[0].length;

		for(int i = 0; i < alto; i++)
		{
			for(int j = 0; j < ancho; j++)
			{
				System.out.print(" "+Matriz[i][j]);
			}
			System.out.println();
		}
	}	
	private void suma(int matrizA[][], int matrizB[][])
	{
		if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length)
		{
			System.out.println(" ----------------------Warning--------------------------");
			System.out.println(" | NO PUEDE SUMAR MATRICES QUE NO SEAN DEL MISMO TAMAÑO | ");
			System.out.println(" -------------------------------------------------------");
		}
		else
		{
			this.suma = new int [matrizA.length][matrizA.length];
			System.out.println("La suma de la matriz No.1 y No.2 obtenida es :");
			for(int i = 0; i < matrizA.length ; i++) 
			{
				for(int j = 0; j < matrizA.length ; j++)
				{
					suma[i][j]= matrizA[i][j] + matrizB[i][j];
			    }
		    }
			System.out.println("" );
			System.out.println("     ====================================");
			System.out.println("     |             RESULTADO             |");
			System.out.println("     ====================================");
			System.out.println("La suma de las matrices es :");
			imprimir(suma);
		}
	}
    private void transponer(int resp[][])
{
	int alto = resp.length;
	int ancho = resp[0].length;
	System.out.println("     ====================================");
	System.out.println("     |             RESULTADO            |");
	System.out.println("     ====================================");
	System.out.println("La transpuesta de la matriz es :");
	
	for(int i = 0; i < alto; i++)
	{
		for(int j = 0; j < ancho; j++)
		{
			System.out.print(" "+resp[j][i]);
		}
		System.out.println();
	}
	transponere=resp;
}
	private void triangular(int x [][])
{
		System.out.println("     =============================TRIANGULARES=============================");
		System.out.println("     |         Si la matriz es PAR se muestra la triangular superior.     |");
		System.out.println("     |        Si la matriz es IMPAR se muestra la triangular inferior.    |");
		System.out.println("     ======================================================================");
		
		if(tamaño%2==0)
	{
			System.out.println("     ====================================");
			System.out.println("     |             RESULTADO             |");
			System.out.println("     ====================================");
			System.out.println(" ");
			System.out.println("La Matriz Superior Es:");
			System.out.println(" ");
			
		for (int i=0; i<x.length;i++)
		{
			for (int j=0; j<i; j++)
			{	
				System.out.print(" "+x[i][j]);
			}
			System.out.println("");
		}
		
	}
		else
		{ 
			System.out.println("     ====================================");
			System.out.println("     |             RESULTADO             |");
			System.out.println("     ====================================");
			System.out.println(" ");
			System.out.println("La Matriz Inferior Es:");
			System.out.println(" ");
			
			for (int i=0; i<x.length;i++)
			{
				for (int j=0; j<i; j++)
				{				
					System.out.print(" "+x[j][i]);
				}
				System.out.println(""); 			
			}
		}
}
	private void cudradomagic()
	{
		System.out.println("-> Digite la dimensión del cuadrado mágico :");
        int n = SavitchIn.readInt();
		int [][] Matriz = new int [n][n];
        if (n%2 == 0)
        {
        	System.out.println("-------------------------Warning-----------------------");
        	System.out.println("|             EL NÚMERO DEBE SER IMPAR                |");
        	System.out.println("-------------------------------------------------------");
        	System.out.print("");
        }
		else  
		{   
			int fila_inicial = 0;
			int columna_inicial = n/2;
			int fila_destino = 0;
			int columna_destino = 0;
			int valor = 1;
			int veces = n * n - 1;
			Matriz[fila_inicial][columna_inicial] = valor;
			for(int i = 0; i < veces; i++)
			{
				valor++;
				fila_destino = fila_inicial-1;
				columna_destino = columna_inicial+1;
				if(fila_destino<0) //si es negativo
				{
					fila_destino = Matriz.length-1; //envielo al final de la matriz
				}
				if (columna_destino > Matriz[0].length-1)// es mayor a la columna, si se salio por la derecha 
				{
					columna_destino = 0;// lo envia  a la columna cero
				}
				if(Matriz[fila_destino][columna_destino] == 0) //si las filas y columnas son cero ponga el dato hay
				{
					Matriz[fila_destino][columna_destino] = valor;// la signacion
				}
				else
				{
					fila_destino = fila_inicial+1;
					columna_destino = columna_inicial;
					if (fila_destino > Matriz.length-1)// valida que no se haiga salido por la matriz
					{
						fila_destino = 0;// aqui lo envia hasta arriba en el caso que s esalga por debajo
					}
					Matriz[fila_destino][columna_destino] = valor;
				}
				fila_inicial=fila_destino;//se para donde puso el valor
				columna_inicial=columna_destino;
	 	  	 }
	 	  	System.out.println("     ====================================");
			System.out.println("     |             RESULTADO             |");
			System.out.println("     ====================================");
			imprimir(Matriz);
			System.out.print("");
         }
        System.out.println();
	}
	private void salir()
	{
		System.out.println (" ");
		System.out.println ("Programa Finalizado");
		System.out.println (" ");
		System.out.println ("Powered by Jorge Rodríguez G.");
	}
	public static void main (String[]args)
	{
		App Parcial = new App();
		Parcial.menú();
	}
}