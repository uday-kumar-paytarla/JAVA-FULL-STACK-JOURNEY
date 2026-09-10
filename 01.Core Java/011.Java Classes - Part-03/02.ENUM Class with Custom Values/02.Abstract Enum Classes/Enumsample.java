public enum Enumsample{
    MONDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    TUESDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    WEDNESDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    THURSDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    FRIDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    SATURDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    };
    public abstract void printmethod();

}