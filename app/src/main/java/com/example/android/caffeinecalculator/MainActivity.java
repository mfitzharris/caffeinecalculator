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

    int cupsOfCoffee = 0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        cupsOfCoffee = cupsOfCoffee + 1;
        display(cupsOfCoffee);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        cupsOfCoffee = cupsOfCoffee - 1;
        display(cupsOfCoffee);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void calculateCaffeine(View view) {
        displayMessage("There are approximately " + (cupsOfCoffee * 95) + " mg of caffeine in " + cupsOfCoffee + " cups of coffee.");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.caffeine_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.caffeine_text_view);
        priceTextView.setText(message);
    }

}
