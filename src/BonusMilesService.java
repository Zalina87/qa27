public class BonusMilesService {
    public int calculate(int weight, int height) {
        int index;
// weight - вес, height - рост
        index =; int weight/Math.pow(height, 2);

        return index;
    }
}
