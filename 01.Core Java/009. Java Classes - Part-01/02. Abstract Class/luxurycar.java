public abstract class luxurycar extends Car
{
public abstract void antibreak();//more abstraction in child class.
@Override
public void applybreak(){
    System.out.println("Replaced by antibreaksystem");
}
}