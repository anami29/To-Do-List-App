import javax.swing.*;

public class ToDoListGui extends JFrame {
    public ToDoListGui(){
        super("To Do List Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        addGuiComponent();
    }
    private void addGuiComponent(){
        //banner text
        JLabel bannerLabel = new JLabel("To Do List");
        bannerLabel.setBounds(
                (CommonConstants.GUI_SIZE.width - bannerLabel.getPreferredSize().width)/2,
                15,
                CommonConstants.Banner_Size.width,
                CommonConstants.Banner_Size.height
        );

        //add to frame
        this.getContentPane().add(bannerLabel);

    }
}
