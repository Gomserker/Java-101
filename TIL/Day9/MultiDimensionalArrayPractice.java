public class MultiDimensionalArrayPractice {
	public static void main(String[] args) {
    
//----------------------------
//1	2	3	4	
//5	6	7	8	
//9	10	11	12	
//----------------------------
//위와 같은 3*4 배열로 데이터가 저장되도록 하시오.
    
    int[][] arr = new int[3][4];
    
    int num = 1;
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.printf("%d\t", num); //배열의 각 인덱스에 자료가 제대로 저장됐는지 확인용
        arr[i][j] = num++;
      }
      System.out.println();
    }
    System.out.println(arr[2][3]); // 확인용. 위 예시대로 데이터가 저장됐다면 해당 행의 출력 결과는 12가 나와야함.
  }
}
