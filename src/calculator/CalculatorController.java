/*
Normal calculator app, also if you press "Equal" button, the value will keep on adding on!
Be sure to actually click on the buttons instead of typing it. 
Only two values can be operated at one time.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author dancu
 */
public class CalculatorController implements Initializable {

    //the private data members for all of the nodes,txtfield, 
    @FXML
    private TextField txtResult;
    @FXML
    private Button bttnNine;
    @FXML
    private Button bttnEight;
    @FXML
    private Button bttnSeven;
    @FXML
    private Button bttnSix;
    @FXML
    private Button bttnFive;
    @FXML
    private Button bttnFour;
    @FXML
    private Button bttnThree;
    @FXML
    private Button bttnTwo;
    @FXML
    private Button bttnOne;
    @FXML
    private Button bttnZero;
    @FXML
    private Button bttnDivide;
    @FXML
    private Button bttnMultiply;
    @FXML
    private Button bttnAdd;
    @FXML
    private Button bttnMinus;
    @FXML
    private Button bttnEquals;
    @FXML
    private Button bttnReset;

    //Boolean called function to act as the Clear button
    boolean function = false;

    //Float called value is a var in which i can store numbers for operators
    float value = 0f;

    //int to represent the various operators, add, subtract, etc.
    int operations = 0;

    //these are the button click events for all of the buttons
    @FXML
    private void bttnNine(ActionEvent event) {
        if (event.getSource() == bttnNine) {
            txtResult.appendText("9");
        }
    }

    @FXML
    private void bttnEight(ActionEvent event) {
        if (event.getSource() == bttnEight) {
            txtResult.appendText("8");
        }
    }

    @FXML
    private void bttnSeven(ActionEvent event) {
        if (event.getSource() == bttnSeven) {
            txtResult.appendText("7");
        }
    }

    @FXML
    private void bttnSix(ActionEvent event) {
        if (event.getSource() == bttnSix) {
            txtResult.appendText("6");
        }
    }

    @FXML
    private void bttnFive(ActionEvent event) {
        if (event.getSource() == bttnFive) {
            txtResult.appendText("5");
        }
    }

    @FXML
    private void bttnFour(ActionEvent event) {
        if (event.getSource() == bttnFour) {
            txtResult.appendText("4");
        }
    }

    @FXML
    private void bttnThree(ActionEvent event) {
        if (event.getSource() == bttnThree) {
            txtResult.appendText("3");
        }
    }

    @FXML
    private void bttnTwo(ActionEvent event) {
        if (event.getSource() == bttnTwo) {
            txtResult.appendText("2");
        }
    }

    @FXML
    private void bttnOne(ActionEvent event) {
        if (event.getSource() == bttnOne) {
            txtResult.appendText("1");
        }
    }

    @FXML
    private void bttnZero(ActionEvent event) {
        if (event.getSource() == bttnZero) {
            txtResult.appendText("0");
        }
    }

    //operations of operators
    @FXML
    private void bttnDivide(ActionEvent event) {
        //divide, no signs otherwise program crashes
        if (event.getSource() == bttnDivide) {
            value = Float.parseFloat(txtResult.getText());
            operations = 1;
            txtResult.setText("");
        }
    }

    @FXML
    private void bttnMultiply(ActionEvent event) {
        //multiply, no signs otherwise program crashes (minus even gets inverted to addition)
        if (event.getSource() == bttnMultiply) {
            value = Float.parseFloat(txtResult.getText());
            operations = 2;
            txtResult.setText("");
        }
    }

    @FXML
    private void bttnMinus(ActionEvent event) {
        //minus, no signs otherwise program crashes
        if (event.getSource() == bttnMinus) {
            value = Float.parseFloat(txtResult.getText());
            operations = 3;
            txtResult.setText("");
        }
    }

    @FXML
    private void bttnAdd(ActionEvent event) {
        //add, no signs otherwise program crashes
        if (event.getSource() == bttnAdd) {
            value = Float.parseFloat(txtResult.getText());
            operations = 4;
            txtResult.setText("");
        }
    }

//Equals action event with a switch so then it goes through all of the operators
    @FXML
    private void bttnEquals(ActionEvent event) {
        if (event.getSource() == bttnEquals) {
            float secondValue = Float.parseFloat(txtResult.getText());
            float nums;
            switch (operations) {
//                nums represent the final answer
//                divide
                case 1:
                    nums = value / secondValue;
                    txtResult.setText(String.valueOf(nums));
                    break;
                //multiply
                case 2:
                    nums = value * secondValue;
                    txtResult.setText(String.valueOf(nums));
                    break;
                //minus
                case 3:
                    nums = value - secondValue;
                    txtResult.setText(String.valueOf(nums));
                    break;
                //add
                case 4:
                    nums = value + secondValue;
                    txtResult.setText(String.valueOf(nums));
                    break;

            }
        }
    }

//bttnReset clears by enabling boolean and setting the txtfield to null.
    @FXML
    private void bttnReset(ActionEvent event
    ) {
        if (event.getSource() == bttnReset) {
            function = true;
            txtResult.setText("");
        }
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
