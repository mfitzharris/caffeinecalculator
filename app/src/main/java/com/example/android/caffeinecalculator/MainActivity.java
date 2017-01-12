package com.example.android.caffeinecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays a form to calculate the caffeine in multiple cups of coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int coffee = 0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void incrementCoffee(View view) {
        coffee = coffee + 1;
        displayCoffee(coffee);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrementCoffee(View view) {
        coffee = coffee - 1;
        displayCoffee(coffee);
    }

    int espresso = 0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void incrementEspresso(View view) {
        espresso = espresso + 1;
        displayEspresso(espresso);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrementEspresso(View view) {
        espresso = espresso - 1;
        displayEspresso(espresso);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void calculateCaffeine(View view) {
        int caffeine = (coffee * 150) + (espresso * 60);
        displayMessage("You have consumed approximately " + caffeine + " mg of caffeine.");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayCoffee(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.coffee_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayEspresso(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.espresso_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.caffeine_text_view);
        priceTextView.setText(message);
    }

}
