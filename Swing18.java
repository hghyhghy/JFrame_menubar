
import javax.swing.*;


public class Swing18 
{
       JMenu menu,submenu;

       JMenuItem i1,i2,i3,i4,i5;

       Swing18()
       {
              JFrame f= new JFrame("Menu And Menubar");

              JMenuBar mb= new JMenuBar();

              menu= new JMenu("menu");

              submenu = new JMenu("submenu");

              i1= new JMenuItem("item i1");
                            i2= new JMenuItem("item i2");
              i3= new JMenuItem("item i3");
                            i4= new JMenuItem("item i4");
              i5= new JMenuItem("item i5");

              menu.add(i1);
                            menu.add(i2);
              menu.add(i3);

              submenu.add(i4);
                            submenu.add(i5);

                            menu.add(submenu);


                            mb.add(menu);

                            f.setJMenuBar(mb);

                            f.setSize(400,400);
                            f.setLayout(null);

                            f.setVisible(true);
 }

 public static void main(String[] args) 
 {
         new Swing18();
 }


}
