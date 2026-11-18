import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class registration extends Applet implements ActionListener {

    Label nameLabel, rollLabel, contactLabel;
    TextField nameField, rollField, contactField;
    Button submitButton;

    public void init() {

        setLayout(new GridLayout(4, 2, 10, 10));

        // Labels
        nameLabel = new Label("Enter Name:");
        rollLabel = new Label("Enter Roll No.:");
        contactLabel = new Label("Enter Contact No.:");

        // Text Fields
        nameField = new TextField();
        rollField = new TextField();
        contactField = new TextField();

        // Button
        submitButton = new Button("Submit");

        // Add components
        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(contactLabel);
        add(contactField);

        add(new Label(""));
        add(submitButton);

        // Button event
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String roll = rollField.getText();
        String contact = contactField.getText();

        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Contact No.: " + contact);
    }
}
