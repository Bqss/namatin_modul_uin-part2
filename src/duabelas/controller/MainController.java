package duabelas.controller;

import duabelas.entity.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class MainController {

    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextArea ta;

    Bentuk s = new Bentuk("");
    public void calculate() throws SQLException {
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        Bentuk [] shape = {new Jajargenjang(a,b),new Belahketupat(a,b),new LayangLayang(a,b),new Segitiga(a,b), new PersegiPanjang(a,b)};
        StringBuilder sb = new StringBuilder();
        StringBuilder sa = new StringBuilder();
        for(Bentuk bn : shape){
            sb.append(bn.cetak()).append("\n");
            sa.append(bn.cetak()).append("   ");
        }
        ta.setText(sb.toString());
        s.logAktifitas(sa.toString());
    }
    public void reset(){
        tf1.setText("");
        tf2.setText("");
        ta.setText("");
    }
    public void out(){
        System.exit(0);
    }
}
