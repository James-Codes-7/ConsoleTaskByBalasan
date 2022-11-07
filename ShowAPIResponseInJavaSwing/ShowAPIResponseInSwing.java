package hitapi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowAPIResponseInSwing {
    public void swingView(ArrayList<Customer> customersList)
    {
        JFrame jFrame = new JFrame();
        JList jList=null;
        JPanel jPanel=new JPanel();
       int size = customersList.size(),i=0;
        for (i = 0; i < size; i++) {
            String[] customer={"\nId:"+customersList.get(i).getId()+"\n","Email:"+customersList.get(i).getEmail()+"\n",
                    "First Name:"+customersList.get(i).getFirst_name()+"\n","Last Name:"+
            customersList.get(i).getLast_name()+"\n","Avatar:"+customersList.get(i).getAvatar()};
            jList=new JList(customer);
            jPanel.add(jList);
            jFrame.add(jPanel);
        }
        jFrame.setMinimumSize(new Dimension(1000, 1000));
        jFrame.setVisible(true);
    }
}
