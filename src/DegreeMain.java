/*
  Create a class 'Degree' having a method 'getDegree' that prints"I got a degree".
  It has two subclasses namely 'Undergraduate' and
'Postgraduate'each having a method with the same name that prints"I am an
 Undergraduate" and "I am a Postgraduate" respectively.
Call the method by creating an object of each of the three classes
 */
public class DegreeMain {

    public static void main(String args[]) {
        Degree degree = new Degree();
        UnderGraduate under = new UnderGraduate();
        PostGraduate post = new PostGraduate();


        degree.getDegree();
        under.getDegree();
        post.getDegree();
    }
}
/*
I got a degree
I am an Undergraduate
I am a Postgraduate

 */