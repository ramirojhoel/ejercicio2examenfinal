public static void main(String[] args) {

 

		int multiplos[];

		int tamanhoArreglo = 0;

		int numero = 0;

 

		Scanner in = new Scanner(System.in);

 

		System.out.println("Tamanho del arreglo: ");

		tamanhoArreglo = in.nextInt();

 

		System.out.println("Entre un numero para hallar sus multiplos: ");

		numero = in.nextInt();

 

		multiplos = new int[tamanhoArreglo];

		for(int i =0; i < tamanhoArreglo; i++){

			multiplos[i] = (i+1)*numero;

		}

 

		for(int i =0; i < multiplos.length; i++){

			System.out.print(multiplos[i]+" ");

		}

	}

}