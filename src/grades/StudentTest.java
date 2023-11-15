package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student bob = null;
        try {
            String name = "";
            if(name.length() == 0) {
                System.out.println("no student for you");
                return;
            }
            if(true) {
                throw new Exception("help");
            }

            bob = new Student("");
            // proceed on our merry way assuming bob is ok
            System.out.println(bob);

            bob.addGrade(50);
            bob.addGrade(75);
            bob.addGrade(68);

            System.out.println(bob.getGradeAverage());
            System.out.println(bob);
        } catch(Exception e) {
            System.out.println("oops no bob: " + e.getMessage());
            throw new RuntimeException("");
        } finally {
            System.out.println("Finally executes");
        }

        System.out.println("out of try catch");

    }
}
