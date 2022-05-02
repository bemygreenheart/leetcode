package medium;

public class MaximizeDistanceToClosestPerson {

  public static void main(String[] args) {
    int[] a = {0,0, 1, 0, 0, 0,0,0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    int[] b = {1,0,0,0,1,0,1};
    int[] c = {0,1};
    int[] d = {1, 0};

    System.out.println("Result");
    System.out.println(getDistance(a));
    System.out.println(getDistance(b));
    System.out.println(getDistance(c));
    System.out.println(getDistance(d));
  }

  private static int getDistance(int[] seats){
    int max = 1;
    int count = 0;
    int start = -1;
    int distance;

    for(int i = 0; i<seats.length; i++){
      if(seats[i] == 1 && count > 0){
        if(start < 0 || start + count == seats.length){
          distance = count;
        }else{
          distance = (count+1)/2;
        }
        if(distance > max){
          max = distance;
        }
        start = i;
        count =0;
      }else{
        count++;
      }
    }
    if(max < count){
      max = count;
    }

    return max;
  }

}
