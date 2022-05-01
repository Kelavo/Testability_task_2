public class BmiService {
    public float calculate(float height, int weight) {
        float bMi = weight / (height * height);
        return (float) bMi;
    }
}
