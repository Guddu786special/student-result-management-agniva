package ResultManagement;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;
import java.nio.Buffer;
import java.util.*;

@FunctionalInterface
interface Display {
  void display(Student s);
}

class Student implements Comparable<Student> {
  private String Name;
  private int Mathametics, Physics, Chemistry, Biology;
 

  @Override
  public int compareTo(Student s) {
    int total1 = this.getresult();
    int total2 = s.getresult();
    return Integer.compare(total2,total1);
  }
  public int getresult(){
    return this.Mathametics + this.Biology + this.Chemistry + this.Physics;
  }
  public double getpercentage(){
    return ((this.getresult()) / 400.0) * 100;
  }
  public Student(String N , int M , int P , int C , int B){
    this.Name = N;
    this.Mathametics = M;
    this.Physics = P;
    this.Chemistry = C;
    this.Biology = B;
  }
  public String getName() {
    return Name;
}
  public void setName(String name) {
    this.Name = name;
}
  public int getMathametics() {
    return Mathametics;
  }
  public int getPhysics() {
    return Physics;
  }
  public int getChemistry() {
    return Chemistry;
  }
  public int getBiology() {
    return Biology;
  }
  
  public void setMathametics(int mathametics) {
    this.Mathametics = mathametics;
  }
  public void setPhysics(int physics) {
    this.Physics = physics;
  }
  public void setChemistry(int chemistry) {
    this.Chemistry = chemistry;
  }
  public void setBiology(int biology) {
    this.Biology = biology;
  }
  // public void setpercentage() {
  //   this.Percentage = ((this.Mathametics + this.Biology + this.Chemistry + this.Physics) / 400.0) * 100;
  // }
  public String getGrade(int marks){
    if (marks >= 90) return "A+";
    else if (marks >= 80 && marks < 90) return "A";
    else if (marks >= 70 && marks < 80) return "B+";
    else if (marks >= 60 && marks < 70) return "B";
    else if (marks >= 50 && marks < 60) return "C+";
    else if (marks >= 40 && marks < 50) return "C";
    else if (marks >= 30 && marks < 40) return "D+";
    else if (marks >= 20 && marks < 30) return "D";
    else return "F";
  }
  public String getFinalRecommendetion (){
    double Percentage = this.getpercentage();
    if (Percentage >= 90) return "You have demonstrated exceptional academic excellence across subjects. Your performance reflects strong conceptual clarity, disciplined preparation, and consistent effort. At this stage, you should not settle for routine practice but aim to challenge yourself with advanced-level problems, competitive scenarios, and real-world applications. Maintaining this level requires continuous focus, curiosity, and a growth mindset.";
    else if (Percentage >= 80) return "You have performed very well and possess a strong understanding of most subjects. Your fundamentals are clear, and your consistency is commendable. However, there is still scope to refine certain areas and push your performance towards excellence. Focus on minimizing small mistakes, improving accuracy, and strengthening weaker topics to reach the highest level.";
    else if (Percentage >= 70 ) return "Your performance is good, and you have a decent grasp of key concepts. However, there are noticeable gaps in depth and consistency. You should focus on strengthening your understanding of complex topics and improving problem-solving skills. With better practice and revision, you can significantly elevate your performance.";
    else if (Percentage >= 60 ) return "Your performance indicates an average to above-average understanding of subjects. While you are able to handle basic and moderate-level problems, you may struggle with advanced or application-based questions. You need to work on consistency, time management, and deeper conceptual clarity to improve further.";
    else if (Percentage >= 50 ) return "Your performance is average, suggesting partial understanding of concepts. You may have clarity in some areas but lack consistency across subjects. It is important to revise fundamental topics regularly and increase practice to build confidence and accuracy. A more disciplined study approach will help you improve.";
    else if (Percentage >= 40) return "Your performance is below average, indicating gaps in fundamental understanding. You may find it difficult to apply concepts correctly or solve problems independently. You should focus on revisiting basics, understanding concepts step by step, and practicing regularly to build a stronger foundation.";
    else if (Percentage >= 30 ) return "Your performance is weak and shows a lack of clarity in core concepts. You need immediate improvement in your study approach. Focus on learning basic principles, avoiding rote memorization, and developing a structured routine. Consistent effort and guidance can help you recover from this level.";
    else if (Percentage >= 20 ) return "Your performance is very poor and indicates serious gaps in understanding and preparation. You need to start from the fundamentals and rebuild your knowledge step by step. It is important to stay disciplined, avoid distractions, and dedicate focused time to studies daily.";
    else return "Your performance is critically low and reflects a lack of preparation and understanding. Immediate action is required to improve. Begin with the basics, seek guidance if needed, and follow a strict and consistent study plan. With determination and effort, improvement is still achievable.";
  }
  public String getMathRecommendation(int marks) {

    if (marks >= 90)
        return "Mathematics:\n You have demonstrated outstanding mathematical ability with excellent problem-solving skills and conceptual clarity. Your accuracy and speed indicate strong practice and deep understanding. At this level, you should challenge yourself with higher-level problems such as Olympiad or competitive coding questions. Focus on learning multiple approaches to a single problem and mastering advanced topics.";

    else if (marks >= 80)
        return "Mathematics:\n You have a strong foundation in mathematics and are capable of solving most standard problems. However, there is still scope to improve accuracy and efficiency. Focus on minimizing calculation errors and practice more complex and application-based questions to strengthen your analytical skills.";

    else if (marks >= 70)
        return "Mathematics:\n Your performance is good, but there are noticeable gaps in deeper understanding. You may struggle with multi-step or tricky problems. Focus on strengthening your fundamentals and practice a variety of problems to improve your confidence and speed.";

    else if (marks >= 60)
        return "Mathematics:\n Your understanding is moderate, and you can solve basic problems. However, advanced questions may pose difficulty. You need consistent practice and revision of core concepts to improve your performance.";

    else if (marks >= 50)
        return "Mathematics:\n Your performance is average, indicating partial understanding. You should revisit basic concepts and practice regularly to improve accuracy and confidence.";

    else if (marks >= 33)
        return "Mathematics:\n Your performance is weak, and there is a lack of clarity in fundamental concepts. Immediate attention is required to strengthen your basics and improve problem-solving ability.";

    else
        return "Mathematics:\n Your performance is very poor and indicates serious gaps in understanding. Start from the basics and practice consistently with guidance to improve.";
}
public String getPhysicsRecommendation(int marks) {

    if (marks >= 90)
        return "Physics:\n You have an exceptional understanding of physical concepts and their real-world applications. Your ability to analyze and solve numerical problems is excellent. You should now focus on advanced problem-solving and conceptual depth, including competitive-level questions.";

    else if (marks >= 80)
        return "Physics:\n You have a strong grasp of concepts and can solve most problems effectively. To improve further, focus on numerical accuracy and conceptual application in complex scenarios.";

    else if (marks >= 70)
        return "Physics:\n Your understanding is decent, but you may struggle with application-based questions. Focus on strengthening conceptual clarity and practicing numericals regularly.";

    else if (marks >= 60)
        return "Physics:\n Your performance is moderate. You need to improve your understanding of concepts and work on solving problems step by step.";

    else if (marks >= 50)
        return "Physics:\n Your understanding is partial. Focus on learning core concepts and practicing simple problems before moving to complex ones.";

    else if (marks >= 33)
        return "Physics:\n Your performance is weak and indicates gaps in understanding. You should revise fundamentals and practice regularly.";

    else
        return "Physics:\n Your performance is very poor. Immediate attention is required to rebuild your conceptual understanding from basics.";
}
public String getChemistryRecommendation(int marks) {

    if (marks >= 90)
        return "Chemistry:\n You have excellent command over concepts, reactions, and problem-solving techniques. Your performance reflects strong memory and understanding. You should now focus on advanced concepts and real-world chemical applications.";

    else if (marks >= 80)
        return "Chemistry:\n You have a good understanding of most topics. To improve further, focus on revision and clarity in complex reactions and numerical problems.";

    else if (marks >= 70)
        return "Chemistry:\n Your performance is good but lacks depth in certain areas. Focus on strengthening conceptual clarity and regular revision.";

    else if (marks >= 60)
        return "Chemistry:\n Your understanding is moderate. You need to revise important topics and practice regularly.";

    else if (marks >= 50)
        return "Chemistry:\n Your performance is average. Focus on improving your basics and memorization of key concepts.";

    else if (marks >= 33)
        return "Chemistry:\n Your performance is weak. You need to revisit fundamentals and practice consistently.";

    else
        return "Chemistry:\n Your performance is very poor. Start from basics and build your understanding step by step.";
}
public String getBiologyRecommendation(int marks) {

    if (marks >= 90)
        return "Biology:\n You have exceptional understanding and retention of concepts. Your performance reflects strong memory and conceptual clarity. You should now focus on deeper understanding and advanced topics.";

    else if (marks >= 80)
        return "Biology:\n You have a strong grasp of concepts and good memory retention. Focus on revision and accuracy to improve further.";

    else if (marks >= 70)
        return "Biology:\n Your understanding is good, but you need to improve consistency and depth of knowledge.";

    else if (marks >= 60)
        return "Biology:\n Your performance is moderate. Focus on understanding concepts rather than rote memorization.";

    else if (marks >= 50)
        return "Biology:\n Your understanding is partial. Regular revision and diagram-based learning will help improve.";

    else if (marks >= 33)
        return "Biology:\n Your performance is weak. You need to focus on basics and improve your study approach.";

    else
        return "Biology:\n Your performance is very poor. Start from fundamental concepts and build your knowledge gradually.";
}
}

class Resultgeneration {
      ArrayList<Student> students = new ArrayList<>();
  public void addresult (BufferedReader br) throws Exception{//'br' is the refference of BufferedReader class which is used to read the input from the user , which is originally created in the main method and passed to this method as an argument
        System.out.print("Enter the Student Name :- ");
        String Name = br.readLine();
        System.out.println();
        System.out.print(  Name+"'s Mathametics marks :- ");
        int M = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print(Name+"'s Chemistry marks :- ");
        int C = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print(Name+"'s Physics marks :- ");
        int P = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print(Name+"'s Biology marks :- ");
        int B = Integer.parseInt(br.readLine());
        System.out.println();
        Student s = new Student(Name, M, P, C, B);
        System.out.print("Percentage is :- " + s.getpercentage());
        System.out.println();
        students.add(s);
  } 
  public void ShowResult(){
Collections.sort(students);
    System.out.println(
        "------------------------------------------------------------------------------------------------------------");
    System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "Name", "Mathametics", "Physics",
        "Biology", "Chemistry","Percentage(%)");
    System.out.println(
        "------------------------------------------------------------------------------------------------------------");
    Display d = (s) -> {//this is a lambda expression which is used to implement the display method of the Display interface , which is used to display the result of the student in a formatted way , anonymous class can also be used instead of lambda expression but lambda expression is more concise and easy to read
      System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-14.2f%% |\n", s.getName(), s.getMathametics() + " ("+s.getGrade(s.getMathametics()) + ")", s.getPhysics()+ " ("+s.getGrade(s.getPhysics()) + ")",
          s.getBiology()+ " ("+s.getGrade(s.getBiology()) + ")", s.getChemistry()+ " ("+s.getGrade(s.getChemistry()) + ")", s.getpercentage());
    };
    for (Student count : students) {
      d.display(count);
      System.out.println(
          "------------------------------------------------------------------------------------------------------------");
    }
  }
  public void search(BufferedReader br) throws Exception{
    System.out.print("Enter the Student Name :- ");
    String studentName = br.readLine();
    boolean notfound = true;
    for (Student s : students) {
      if (s.getName().equalsIgnoreCase(studentName)) {
        notfound = false;
        System.out.println(
        "------------------------------------------------------------------------------------------------------------");
    System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "Name", "Mathametics", "Physics",
        "Biology", "Chemistry","Percentage(%)");
        System.out.println(
        "------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-14.2f%% |\n", s.getName(), s.getMathametics() + " ("+s.getGrade(s.getMathametics()) + ")", s.getPhysics()+ " ("+s.getGrade(s.getPhysics()) + ")",
          s.getBiology()+ " ("+s.getGrade(s.getBiology()) + ")", s.getChemistry()+ " ("+s.getGrade(s.getChemistry()) + ")", s.getpercentage());
        System.out.println(
        "------------------------------------------------------------------------------------------------------------");
        System.out.println("Subject wise suggestion :- ");
        System.out.println(s.getMathRecommendation(s.getMathametics()));
        System.out.println(s.getPhysicsRecommendation(s.getPhysics()));
        System.out.println(s.getChemistryRecommendation(s.getChemistry()));
        System.out.println(s.getBiologyRecommendation(s.getBiology()));
        System.out.println("Overall suggestion :- \n" + s.getFinalRecommendetion());
        break;
      }}

      if(notfound){
        System.out.println("Student not found.");
      }
    
  }
  public void saveToFile() throws Exception {
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt" , false))){
      for (Student s : students){
        String line = s.getName() + "," + s.getMathametics() + "," + s.getPhysics() + "," + s.getChemistry() + "," + s.getBiology();//comma is used as a delimiter to separate the values of the student object and store them in a single line in the file , which can be easily read and parsed later
        bw.write(line);
        bw.newLine();
      }
    // bw.close(); no need to close the BufferedWriter explicitly as it is used in try-with-resources which automatically closes the resource after use
    System.out.println("Data saved to file successfully.");
    }
    catch (Exception e){
      System.out.println("Error saving data to file");
      e.printStackTrace();
    } 
  }
  public void loadFromFile() throws IOException{
    students.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
      String Line;
      while ((Line = br.readLine()) != null){
        String[] data = Line.split(",");
        if(data.length<5){
          System.out.println("Invalid data format in file: " + Line);
          continue;
        }
        try{
          String name = data[0];
          int math = Integer.parseInt(data[1]);
          int physics = Integer.parseInt(data[2]);
          int chemistry = Integer.parseInt(data[3]);
          int biology = Integer.parseInt(data[4]);

          if (math<0 || math>100 || physics<0 || physics>100 || chemistry<0 || chemistry>100 || biology<0 || biology>100) {
            System.out.println("Invalid marks in file: " + Line);
            continue;
          }
          Student s = new Student(name , math , physics , chemistry , biology);
          students.add(s);
        }
        catch (NumberFormatException e){
          System.out.println("Invalid number format in file: " + Line);
          continue;
      }
    }
    System.out.println("Data loaded from file successfully.");
    }
    catch (FileNotFoundException e){
      System.out.println("File not found. Starting with an empty student list.");
    }
    catch(Exception e){
      System.out.println("Error loading data from file.");
      e.printStackTrace();
    }
  }
  public void EditFile(BufferedReader br) throws Exception{
    System.out.println("Enter the Student Name :- ");
    String studentName = br.readLine();
    if(studentName == null || studentName.trim().isEmpty()){
        System.out.println("Invalid input. Student name cannot be empty.");
        return;
      }
    Student studentToEdit = null;
    for (Student s : students) {
      if (s.getName().equalsIgnoreCase(studentName)) {
        studentToEdit = s;
        break;
      }
    }
      boolean editcontinue = true;
      while (editcontinue) {
        System.out.println("1. Edit Name\n2. Edit Mathametics Marks\n3. Edit Physics Marks\n4. Edit Chemistry Marks\n5. Edit Biology Marks\n6. Exit Editing");
        String choice = br.readLine();
        switch (choice) {
          case "1":
            System.out.println("Enter the new name :- ");
            String newName = br.readLine();
            if (newName == null || newName.trim().isEmpty()) {
              System.out.println("Invalid input. Name cannot be empty.");
            } else {
              studentToEdit.setName(newName);
              System.out.println("Name updated successfully.");
            }
            break;
            case "2":
            System.out.println("Enter the new Mathametics marks :- ");
            int newMathMarks = Integer.parseInt(br.readLine());
            if (newMathMarks < 0 || newMathMarks > 100) {
              System.out.println("Invalid input. Marks should be between 0 and 100.");
            } else {
              studentToEdit.setMathametics(newMathMarks);
              System.out.println("Mathametics marks updated successfully.");
            }
            break;
            case "3":
            System.out.println("Enter the new Physics marks :- ");
            int newPhysicsMarks = Integer.parseInt(br.readLine());
            if (newPhysicsMarks < 0 || newPhysicsMarks > 100) {
              System.out.println("Invalid input. Marks should be between 0 and 100.");
            } else {
              studentToEdit.setPhysics(newPhysicsMarks);
              System.out.println("Physics marks updated successfully.");
            }
            break;
            case "4":
            System.out.println("Enter the new Chemistry marks :- ");
            int newChemistryMarks = Integer.parseInt(br.readLine());
            if (newChemistryMarks < 0 || newChemistryMarks > 100) {
              System.out.println("Invalid input. Marks should be between 0 and 100.");
            } else {
              studentToEdit.setChemistry(newChemistryMarks);
              System.out.println("Chemistry marks updated successfully.");
            }
            break;
            case "5":   
            System.out.println("Enter the new Biology marks :- ");
            int newBiologyMarks = Integer.parseInt(br.readLine());
            if (newBiologyMarks < 0 || newBiologyMarks > 100)
              {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
              } else {
                studentToEdit.setBiology(newBiologyMarks);
                System.out.println("Biology marks updated successfully.");
              }
              break;
        }
        saveToFile();
        System.out.println("Do you want to continue editing? (yes/no)");
        String continueChoice = br.readLine();
        if (continueChoice.equalsIgnoreCase("No")) {
          editcontinue = false;
        }
}
}
public void deletestudent(BufferedReader br) throws Exception{
  System.out.print("Enter the student name :- ");
  String name = br.readLine();
  if (name == null || name.trim().isEmpty()){
System.out.println("Invalid input. Student name cannot be empty.");
return;
  }
  boolean found = false ;  
  Iterator<Student> it = students.iterator();
  while(it.hasNext()){
    Student s = it.next();
    if(s.getName().equalsIgnoreCase(name)){
      it.remove();
      found = true;
      System.out.println("Student deleted successfully.");
      saveToFile();
      break;
    }
  }
  if (!found){
    System.out.println("Student not found.");
  }
}
}

public class resultmanagement {
  public static void main(String[] args) throws Exception {
    Resultgeneration R = new Resultgeneration();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      while (true) {  
        System.out.print("1.Add Student Result\n2.Show Student Result\n3.Search Student\n4.Save to File\n5.Load from File\n6.Edit Student Result\n7.Delete Student Result\nEnter your choice :- ");
        String choice = br.readLine();
        System.out.println();
        if (choice.equals("1")) R.addresult(br);
        else if (choice.equals("2")) R.ShowResult();
        else if (choice.equals("3")) R.search(br);
        else if (choice.equals("4")) R.saveToFile();
        else if (choice.equals("5")) R.loadFromFile();
        else if (choice.equals("6")) R.EditFile(br);
        else if (choice.equals("7")) R.deletestudent(br);
        else System.out.println("Invalid Choice");
      }
    } 
    catch (NumberFormatException e) {
      e.printStackTrace();
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  }