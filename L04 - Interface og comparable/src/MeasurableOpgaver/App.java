package MeasurableOpgaver;

public class App {

    public static void main(String[] args) {
        Measurable[] objects = new Measurable[4];
        objects[0] = new Chili("Carolina Reaper", 2000000);
        objects[1] = new Chili("Ghost Pepper", 478437);
        objects[2] = new Chili("Habanero", 57483);
        objects[3] = new Chili("Jalapeno", 59399);

        System.out.println("Gennemsnit: " + average(objects));
        System.out.println("Max: " + max(objects).getMeasure());
    }

    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable object : objects) {
            if (object.getMeasure() > max.getMeasure()) {
                max = object;
            }
        }
        return max;
    }

    public static double average(Measurable[] objects) {
        double average = 0;
        for (Measurable object : objects) {
            average += object.getMeasure();
        }
        return average / objects.length;

    }
}
