import java.util.ArrayList;

public class SurvivorDriver {
    public static int getSurvivingIndex (int n, int k) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            integerArrayList.add(i);
        }


        int index = 0;

        while (true) {
            if (integerArrayList.size() == 1) {
                return integerArrayList.get(0);
            }

            for (int j = 0; j < k - 1; j++){
                index++;
            }

            if (index > (integerArrayList.size() - 1)){
                index = index % integerArrayList.size();
            }

            System.out.printf("%d번 군사가 죽습니다.\n", integerArrayList.remove(index));
        }
    }


    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
