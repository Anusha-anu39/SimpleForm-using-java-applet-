import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mainFrame extends JFrame{
    final private Font mainFont = new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    public void initialization(){
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel();
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btnOk = new JButton("OK");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello" + " "+firstName+" "+lastName);
            }
            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                tfFirstName.setText(" ");
                tfLastName.setText(" ");
                lbWelcome.setText(" ");

            }
            
        });

        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout(new GridLayout(1,2,5,5));
        buttoPanel.add(btnOk);
        buttoPanel.add(btnClear);

        JPanel mainpanal = new JPanel();
        mainpanal.setLayout(new BorderLayout());
        mainpanal.setBackground(new Color(128, 128, 255));
        mainpanal.setBorder(BorderFactory.createEmptyBorder(10 ,10,10,10));
        mainpanal.add(formPanel,BorderLayout.NORTH);
        mainpanal.add(lbWelcome,BorderLayout.CENTER);
        mainpanal.add(buttoPanel,BorderLayout.SOUTH);

        add(mainpanal);

        setTitle("wellcome");
        setSize(500,500);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
        public static void main( String[] args){
            mainFrame myFrame = new mainFrame();
            myFrame.initialization();
        }

    
    

}