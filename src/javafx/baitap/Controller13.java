package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller13 {
    public TextField txtName;
    public TextField txtPhone;

    public Text namephone;
    public Text namephone2;


    public Text noticeName;
    public Text noticePhone;


    public void handleSubmit(){
        String n = txtName.getText();
        if(n.isEmpty()){
            noticeName.setText("Vui lòng nhập tên người dùng");
            noticeName.setVisible(true);
        }else {
            namephone.setText(n);
            noticeName.setVisible(false);
        }
        String p = txtPhone.getText();
        if(p.isEmpty()){
            noticePhone.setText("Vui lòng nhập SĐT người dùng");
            noticePhone.setVisible(true);
        }else {
            namephone.setText(p);
            noticePhone.setVisible(false);
        }
        namephone.setText("1. " +n+ " - " +p);

    }


    /*
    public int handleSubmit() {
        String a = txtName.getText();
        if (a.isEmpty()) {
            noticeName.setText("Vui lòng nhập tên người dùng");
            noticeName.setVisible(true);
        } else {
            namephone2.setText(a);
            noticeName.setVisible(false);
        }
        String b = txtPhone.getText();
        if (b.isEmpty()) {
            noticePhone.setText("Vui lòng nhập SĐT người dùng");
            noticePhone.setVisible(true);
        } else {
            namephone2.setText(b);
            noticePhone.setVisible(false);
        }
        namephone2.setText("2. " + a + " - " + b);
    }
    */

}
