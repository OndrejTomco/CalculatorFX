package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    Float data = 0f;
    int operation = -1;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button clear;

    @FXML
    private TextField text;

    @FXML
    private Button equals;


    public void handleButton(ActionEvent event){
        if(event.getSource() == one){
            text.setText(text.getText() + "1");
        }

        else if(event.getSource() == two){
            text.setText(text.getText() + "2");
        }

        else if(event.getSource() == three){
            text.setText(text.getText() + "3");
        }

        else if(event.getSource() == four){
            text.setText(text.getText() + "4");
        }

        else if(event.getSource() == five){
            text.setText(text.getText() + "5");
        }

        else if(event.getSource() == six){
            text.setText(text.getText() + "6");
        }

        else if(event.getSource() == seven){
            text.setText(text.getText() + "7");
        }

        else if(event.getSource() == eight){
            text.setText(text.getText() + "8");
        }

        else if(event.getSource() == nine){
            text.setText(text.getText() + "9");
        }

        else if(event.getSource() == zero){
            text.setText(text.getText() + "0");
        }

        else if(event.getSource() == clear){
            text.setText("");
        }

        else if(event.getSource() == divide){
            data = Float.parseFloat(text.getText());
            operation = 4;
            text.setText("");
        }

        else if(event.getSource() == multiply){
            data = Float.parseFloat(text.getText());
            operation = 3;
            text.setText("");
        }

        else if(event.getSource() == minus){
            data = Float.parseFloat(text.getText());
            operation = 2;
            text.setText("");
        }

        else if(event.getSource() == plus){
            data = Float.parseFloat(text.getText());
            operation = 1;
            text.setText("");
        }

        else if(event.getSource() == equals){

            Float secondOperand = Float.parseFloat(text.getText());

            switch(operation){
                case 1:Float ans = data+secondOperand;
                text.setText(String.valueOf(ans));break;

                case 2: ans = data-secondOperand;
                    text.setText(String.valueOf(ans));break;

                case 3: ans = data*secondOperand;
                    text.setText(String.valueOf(ans));break;

                case 4:
                    ans = 0f;
                    try {
                        ans = data/secondOperand;
                    }catch (Exception e){
                        text.setText("Err");
                    }
                    text.setText(String.valueOf(ans));break;


            }

        }

    }
}
