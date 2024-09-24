class Human{
    public void job(){
        System.out.println("working professional");}}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");}}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");}}
    
public class k91 {
    public static void main (String[] args){
        Human amar=new Human();
        Teacher babu=new Teacher();
        Doctor chandra=new Doctor();
        Human denish=new Doctor();
        amar.job();
        babu.job();
        chandra.job();
        denish.job();
    }
    
}
