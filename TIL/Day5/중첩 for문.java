public class ForVersePractice
  public static void main(String[] args) {
  
  //1번 문제
  //*
  //*
  //**
  //**
  //***
  
  	String z = "z";
				for (int i = 1; i <= 5; i++) {

					// 라인
					for (int j = 1; j < 2; j++) {

						System.out.print(z);
						if (i % 2 == 0) {
							z += "z";
						}
					}
					System.out.println("");
				}
  
  //2번 문제
  //*
  // *
  //  *
  //   *
  //    *
  
  for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("z");
		}
  
  //3번 문제
  //*
  //
  // *
  //
  //  *
  //
  //   *
  //
  //    *
  
  System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("z");
			System.out.println("");
		}
	}
}
