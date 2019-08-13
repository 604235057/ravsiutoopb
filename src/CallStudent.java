public class CallStudent {
        // psvm + tab
    public static void main(String[] args) {
        Student Boss = new Student();
        System.out.println(">>" + Boss);
        Boss.enrollment();
        Boss.payment();
        Boss.addCourse();
        Boss.dropCourse();
        System.out.println("============");
        GraduateStudent ravisut = new GraduateStudent();
        ravisut.enrollment();
        ravisut.addCourse();
        ravisut.dropCourse();
        ravisut.payment();
        ravisut.oralExamination();
        ravisut.thesisExamination();
    }
}// end class
