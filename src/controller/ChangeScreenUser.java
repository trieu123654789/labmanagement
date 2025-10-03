package controller;

import bean.Bean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import frame.user.BatchUser;
import frame.user.LearningReportUser;
import frame.user.ScheduleUser;
import frame.user.StudentsUser;


public class ChangeScreenUser {
    private JPanel root;
    private String kindSelected = "";
    private List <Bean> listItem = null;
    public ChangeScreenUser(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jlbItem){
          
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new BatchUser());
        root.validate();
        root.repaint();
    }
    public void setEvent(List<Bean> listItem) {
        this.listItem=listItem;
     for (Bean item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
     }
}

class LabelEvent implements MouseListener {

      private JPanel node;
      private String kind;

      private JPanel jpnItem;
      private JLabel jlbItem;

      public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kind = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            switch (kind) {
                
                case "Batch":
                    node = new BatchUser();
                    break;
                case "Students":
                    node = new StudentsUser();
                    break;
                    case "LearningReport":
                    node = new LearningReportUser();
                    break;
                    case "Schedule":
                    node = new ScheduleUser();
                    break;
                     case "Feedback":
                    node = new frame.user.Feedback();
                    break;
                default:
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
      }

      @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(255,255,204));
           jlbItem.setBackground(new Color(255,255,204));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(255,255,153));
          jlbItem.setBackground(new Color(255,255,153));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(255,255,204));
                jlbItem.setBackground(new Color(255,255,204));
          }
      }

}
    private void setChangeBackground(String kind){
         for (Bean item : listItem) {
             if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(255,255,153));
                item.getJlb().setBackground(new Color(255,255,153));
          }else{
             item.getJpn().setBackground(new Color(255,255,204));
                item.getJlb().setBackground(new Color(255,255,204));
             }
     }
    }
}
