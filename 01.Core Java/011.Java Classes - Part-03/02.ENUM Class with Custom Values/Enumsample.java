public enum Enumsample {
    MONDAY(101, "It is the 1st day of the week."),
    TUESDAY(102, "It is the 2nd day of the week"),
    WEDNESDAY(103, "It is the 3rd day of the week"),
    THURSDAY(104, "It is the 4th day of the week"),
    FRIDAY(105, "It is the 5th day of the week"),
    SATURDAY(106, "It is the 6th day of the week"),
    SUNDAY(107, "It is the 7th day of the week");

    private int value;
    private String name;

    Enumsample(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getval() {
        return value;
    }

    public String getname() {
        return name;
    }
    public static Enumsample getenumvalue (int val){
        for(Enumsample sample : Enumsample.values()){
            if(sample.getval() == val){
                return sample;
            }
        }
        return null;
    }
}
