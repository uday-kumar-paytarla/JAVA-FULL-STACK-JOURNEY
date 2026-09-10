public enum Enumsampleoverride{
    MONDAY{
        @Override 
        public void print(){
            System.out.println("this  is an override method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void print(){
        System.out.println("This method applies for all the objects.");
    }
}