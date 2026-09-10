public enum Enumsample implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    @Override 
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}