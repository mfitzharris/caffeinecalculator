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

    public void incrementCoffee(View view) {
        coffee = coffee + 1;
        displayCoffee(coffee);
    }

    public void decrementCoffee(View view) {
        coffee = coffee - 1;
        displayCoffee(coffee);
    }

    int espresso = 0;

    public void incrementEspresso(View view) {
        espresso = espresso + 1;
        displayEspresso(espresso);
    }

    public void decrementEspresso(View view) {
        espresso = espresso - 1;
        displayEspresso(espresso);
    }

    int decaf = 0;

    public void incrementDecaf(View view) {
        decaf = decaf + 1;
        displayDecaf(decaf);
    }

    public void decrementDecaf(View view) {
        decaf = decaf - 1;
        displayDecaf(decaf);
    }

    int blackTea = 0;

    public void incrementBlackTea(View view) {
        blackTea = blackTea + 1;
        displayBlackTea(blackTea);
    }

    public void decrementBlackTea(View view) {
        blackTea = blackTea - 1;
        displayBlackTea(blackTea);
    }

    int greenTea = 0;

    public void incrementGreenTea(View view) {
       greenTea = greenTea + 1;
        displayGreenTea(greenTea);
    }

    public void decrementGreenTea(View view) {
        greenTea = greenTea - 1;
        displayGreenTea(greenTea);
    }

    int cola = 0;

    public void incrementCola(View view) {
        cola = cola + 1;
        displayCola(cola);
    }

    public void decrementCola(View view) {
        cola = cola - 1;
        displayCola(cola);
    }

    int energyDrink = 0;

    public void incrementEnergyDrink(View view) {
        energyDrink = energyDrink + 1;
        displayEnergyDrink(energyDrink);
    }

    public void decrementEnergyDrink(View view) {
        energyDrink = energyDrink - 1;
        displayEnergyDrink(energyDrink);
    }
    /**
     * This method is called when the calculate button is clicked.
     */
    public void calculateCaffeine(View view) {
        int caffeine = (coffee * 150) + (espresso * 60) + (decaf * 6) + (blackTea * 50) + (greenTea * 35) + (cola * 35) + (energyDrink * 85);
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

    private void displayDecaf(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.decaf_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayBlackTea(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.black_tea_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayGreenTea(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.green_tea_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayCola(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.cola_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayEnergyDrink(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.energy_drink_text_view);
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
