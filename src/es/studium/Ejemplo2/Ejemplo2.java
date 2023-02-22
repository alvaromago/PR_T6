package es.studium.Ejemplo2;

public class Ejemplo2
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[] = new int[TAM];
		for(int i = 0; i <= TAM; i++)
		{
			try
			{
				tabla[i] = i*2;
			}
			catch(IndexOutOfBoundsException ioobe)
			{
				// Instrucciones de la excepción
				throw(ioobe);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Error" + ae.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("Error" + e.getMessage());
				throw(e);
			}
			finally
			{
				// Instrucciones que siempre se ejecutan tras el try 
				// sin error o tras el try con error y el catch correspondiente
			}
		}
		for(int elemento:tabla)
		{
			System.out.println(elemento);
		}
	}

}
