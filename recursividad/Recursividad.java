class Recursividad {

private long a;
  public int funcionSuma(int numero){
    if(numero==0){
      return numero;
    }else{
      numero=numero+funcionSuma(numero-1);
    }
    return numero;
  }

// 5! = 1  X 2  X  3  X  4 X  5= 120.
  public long factorial(long n){
		if(n == 0)
			return 1;
		else{
		//	System.out.println("n "+n);
			a = n*factorial(n-1);
			return a;
		}
	}

public int fibonacci(int numero){
    if (numero == 0 || numero == 1){
      return 1;
  }
  return fibonacci(numero -1)+fibonacci(numero-2);
}

  public static void main(String[] args) {
    Recursividad obj=new Recursividad();
    System.out.println(obj.factorial(5));
  }

}
