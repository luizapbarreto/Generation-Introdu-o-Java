package Lista3Arrays;

import java.util.Scanner;

public class Questao4 {
/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido 
e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

	public static void main(String[] args) {
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int i,j,op;
		float numero;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nEntre com o valor da Matriz1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da Matriz2: ");
				matriz2[i][j] = leia.nextFloat();
			}
		}
		
		do
		{
			System.out.println("\n\t\tMenu de op��es");
			System.out.println("\n1-Somar as duas matrizes.");
			System.out.println("\n2-Subtrair a primeira matriz da segunda.");
			System.out.println("\n3-Adicionar uma constante as duas matrizes.");
			System.out.println("\n4-Imprimir as matrizes.");
			System.out.println("\n0-Sair do programa!!!.");
			System.out.println("\nDigite sua op��o: ");
			op = leia.nextInt(); //8 0
			switch(op)
			{
			case 1:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma das matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nSubtra��o das matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o valor da constante: ");
				numero = leia.nextFloat();
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz1[i][j] += numero;
						matriz2[i][j] += numero;
						System.out.println("\nMatriz1: "+matriz1[i][j]);
						System.out.println("\nMatriz2: "+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						
						System.out.println("\nMatriz1: "+matriz1[i][j]);
						System.out.println("\nMatriz2: "+matriz2[i][j]);
					}
				}
				break;
				default:
					if(op<0 || op>4)
					{
						System.out.println("\nOp��o inv�lida!!!");
					}
					else if(op==0)
					{
					System.out.println("\nMuito obrigado por usar o nosso software...");
					}
					else
					{
						System.out.println("\nVamos utilizar novamente o nosso sistema...");
					}
			}
			
			
		}
		while(op!=0);


	}

}
