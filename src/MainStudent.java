public class MainStudent {
    public static void main(String[] args) {
        double [] score1 = {8,9.5,10} ;
        double [] score2 = {9,9.5,10} ;
        Student student1 = new Student("Ky", 24, score1) ;
        Student student2 = new Student("Kiet", 18, score2) ;
        System.out.println("student1");
        student1.displayInfo();
        System.out.println("student2");
        student2.displayInfo();


        if (student1.mediumScores() > student2.mediumScores()) {
            System.out.println(student1.getName() + " Có điểm trug bình cao hơn ");
        }else if (student2.mediumScores() > student1.mediumScores()) {
            System.out.println(student2.getName() + " Có điểm trung bình cao hơn");
        }else  {
            System.out.println("Cả hai có điểm trung bình bằng nhau");
        }





    }
}
