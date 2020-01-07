import javax.swing.JOptionPane;
public class NumPalDriver {

  public static void main(String[] args){
    String start = JOptionPane.showInputDialog("Enter a number: ");
    System.out.println("start value ["+ start + "]");
    NumPal p = new NumPal(start);
    int ctr = 0;
    while (!p.pal() && (ctr < 10)){
      System.out.println(p.toString());
      System.out.print("new sum: ");
      System.out.println(p.getCur()+" + "+p.getRev()+ " = " +
                         (p.getCur()+p.getRev() ));
      p = p.next();
      ctr++;
    }
    System.out.println("final value: " + p.getCur());
    System.out.println("number of steps: " + ctr);
  }
}