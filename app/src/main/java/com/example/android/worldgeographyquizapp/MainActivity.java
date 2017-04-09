package com.example.android.worldgeographyquizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // SubmitAnswer method will be excuted when result button is clicked


    public void submitAnswer(View view) {
        int score = 0;


        /* Question 1
         * Check if the correct answer is chosen for Question Number 1.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */

        RadioButton checkAnswerOne_One = (RadioButton) findViewById(R.id.question_1_choice_1);
        RadioButton checkAnswerOne_Two = (RadioButton) findViewById(R.id.question_1_choice_2);
        RadioButton checkAnswerOne_Three = (RadioButton) findViewById(R.id.question_1_choice_3);
        RadioButton checkAnswerOne_Four = (RadioButton) findViewById(R.id.question_1_choice_4);


        boolean clickAnswer_One_Three = checkAnswerOne_Three.isChecked();

        if (clickAnswer_One_Three) {
            score += 1;
            checkAnswerOne_Three.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerOne_One.setTextColor(Color.RED);
            checkAnswerOne_Two.setTextColor(Color.RED);
            checkAnswerOne_Three.setTextColor(Color.GREEN);
            checkAnswerOne_Four.setTextColor(Color.RED);

        }


        /* Question 2
         * Check if the correct answer is chosen for Question Number 2.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */


        RadioButton checkAnswerTwo_One = (RadioButton) findViewById(R.id.question_2_choice_1);
        RadioButton checkAnswerTwo_Two = (RadioButton) findViewById(R.id.question_2_choice_2);
        RadioButton checkAnswerTwo_Three = (RadioButton) findViewById(R.id.question_2_choice_3);
        RadioButton checkAnswerTwo_Four = (RadioButton) findViewById(R.id.question_2_choice_4);


        boolean clickAnswer_Two_Two = checkAnswerTwo_Two.isChecked();

        if (clickAnswer_Two_Two) {
            score += 1;
            checkAnswerTwo_Two.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerTwo_One.setTextColor(Color.RED);
            checkAnswerTwo_Two.setTextColor(Color.GREEN);
            checkAnswerTwo_Three.setTextColor(Color.RED);
            checkAnswerTwo_Four.setTextColor(Color.RED);

        }

        /* Question 3
         * Check if the correct answer is chosen for Question Number 3.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */

        RadioButton checkAnswerThree_One = (RadioButton) findViewById(R.id.question_3_choice_1);
        RadioButton checkAnswerThree_Two = (RadioButton) findViewById(R.id.question_3_choice_2);
        RadioButton checkAnswerThree_Three = (RadioButton) findViewById(R.id.question_3_choice_3);
        RadioButton checkAnswerThree_Four = (RadioButton) findViewById(R.id.question_3_choice_4);


        boolean clickAnswer_Three_Three = checkAnswerThree_Three.isChecked();

        if (clickAnswer_Three_Three) {
            score += 1;
            checkAnswerThree_Three.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerThree_One.setTextColor(Color.RED);
            checkAnswerThree_Two.setTextColor(Color.RED);
            checkAnswerThree_Three.setTextColor(Color.GREEN);
            checkAnswerThree_Four.setTextColor(Color.RED);

        }


        /* Question 4
         * Check if the correct answer is chosen for Question Number 4.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */

        RadioButton checkAnswerFour_One = (RadioButton) findViewById(R.id.question_4_choice_1);
        RadioButton checkAnswerFour_Two = (RadioButton) findViewById(R.id.question_4_choice_2);
        RadioButton checkAnswerFour_Three = (RadioButton) findViewById(R.id.question_4_choice_3);
        RadioButton checkAnswerFour_Four = (RadioButton) findViewById(R.id.question_4_choice_4);


        boolean clickAnswer_Four_One = checkAnswerFour_One.isChecked();

        if (clickAnswer_Four_One) {
            score += 1;
            checkAnswerFour_One.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerFour_One.setTextColor(Color.GREEN);
            checkAnswerFour_Two.setTextColor(Color.RED);
            checkAnswerFour_Three.setTextColor(Color.RED);
            checkAnswerFour_Four.setTextColor(Color.RED);

        }


        /* Question 5
         * Check if the correct answers/checkboxes are selected for Question Number 5.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */


        CheckBox checkAnswerFiveOne = (CheckBox) findViewById(R.id.question_5_choice_1);
        CheckBox checkAnswerFiveTwo = (CheckBox) findViewById(R.id.question_5_choice_2);
        CheckBox checkAnswerFiveThree = (CheckBox) findViewById(R.id.question_5_choice_3);
        CheckBox checkAnswerFiveFour = (CheckBox) findViewById(R.id.question_5_choice_4);


        boolean selectedAnswerFiveTwo = checkAnswerFiveTwo.isChecked();
        boolean selectedAnswerFiveFour = checkAnswerFiveFour.isChecked();


        if (selectedAnswerFiveTwo && selectedAnswerFiveFour) {
            score += 1;
            checkAnswerFiveTwo.setTextColor(Color.GREEN);
            checkAnswerFiveFour.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerFiveOne.setTextColor(Color.RED);
            checkAnswerFiveTwo.setTextColor(Color.GREEN);
            checkAnswerFiveThree.setTextColor(Color.RED);
            checkAnswerFiveFour.setTextColor(Color.GREEN);
        }


        /* Question 6
         * Check if the correct answer is chosen for Question Number 6.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */

        RadioButton checkAnswerSix_One = (RadioButton) findViewById(R.id.question_6_choice_1);
        RadioButton checkAnswerSix_Two = (RadioButton) findViewById(R.id.question_6_choice_2);
        RadioButton checkAnswerSix_Three = (RadioButton) findViewById(R.id.question_6_choice_3);
        RadioButton checkAnswerSix_Four = (RadioButton) findViewById(R.id.question_6_choice_4);


        boolean clickAnswer_Six_One = checkAnswerSix_One.isChecked();

        if (clickAnswer_Six_One) {
            score += 1;
            checkAnswerSix_One.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerSix_One.setTextColor(Color.GREEN);
            checkAnswerSix_Two.setTextColor(Color.RED);
            checkAnswerSix_Three.setTextColor(Color.RED);
            checkAnswerSix_Four.setTextColor(Color.RED);

        }


        /* Question 7*
         * Check if the correct answer is chosen for Question Number 7.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
       */



            EditText checkAnswerSeven = (EditText) findViewById(R.id.question_7_answer);
            String correctAnswerSeven = checkAnswerSeven.getEditableText().toString();

            if (correctAnswerSeven.equals("Amsterdam")) {
                score += 1;

            }

            if (correctAnswerSeven.equals("amsterdam")) {
                score += 1;

            }


        /* Question 8
         * Check if the correct answer is chosen for Question Number 8.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
        */



        EditText checkAnswerEight = (EditText) findViewById(R.id.question_8_answer);
        String correctAnswerEight = checkAnswerEight.getEditableText().toString();

        if (correctAnswerEight.equals("Brasilia")) {
            score += 1;

        }

        if (correctAnswerEight.equals("Brazilia")) {
            score += 1;

        }
        if (correctAnswerEight.equals("Brazelia")) {
            score += 1;

        }

        if (correctAnswerEight.equals("brazilia")) {
            score += 1;

        }


        /* Question 9
         * Check if the correct answers/checkboxes are selected for Question Number 9.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */


        CheckBox checkAnswerNineOne = (CheckBox) findViewById(R.id.question_9_choice_1);
        CheckBox checkAnswerNineTwo = (CheckBox) findViewById(R.id.question_9_choice_2);
        CheckBox checkAnswerNineThree = (CheckBox) findViewById(R.id.question_9_choice_3);
        CheckBox checkAnswerNineFour = (CheckBox) findViewById(R.id.question_9_choice_4);

        boolean selectedAnswerNineOne = checkAnswerNineOne.isChecked();
        boolean selectedAnswerNineThree = checkAnswerNineThree.isChecked();
        boolean selectedAnswerNineFour = checkAnswerNineFour.isChecked();


        if (selectedAnswerNineOne && selectedAnswerNineThree && selectedAnswerNineFour) {
            score += 1;
            checkAnswerNineOne.setTextColor(Color.GREEN);
            checkAnswerNineThree.setTextColor(Color.GREEN);
            checkAnswerNineFour.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerNineOne.setTextColor(Color.GREEN);
            checkAnswerNineTwo.setTextColor(Color.RED);
            checkAnswerNineThree.setTextColor(Color.GREEN);
            checkAnswerNineFour.setTextColor(Color.GREEN);
        }


        /* Question 10
         * Check if the correct answers/checkboxes are selected for Question Number 10.
         * After submit result is clicked, it will turn the correct answer with green and the wrong red color.
         */


        CheckBox checkAnswerTenOne = (CheckBox) findViewById(R.id.question_10_choice_1);
        CheckBox checkAnswerTenTwo = (CheckBox) findViewById(R.id.question_10_choice_2);
        CheckBox checkAnswerTenThree = (CheckBox) findViewById(R.id.question_10_choice_3);
        CheckBox checkAnswerTenFour = (CheckBox) findViewById(R.id.question_10_choice_4);

        boolean selectedAnswerTenTwo = checkAnswerTenTwo.isChecked();
        boolean selectedAnswerTenThree = checkAnswerTenThree.isChecked();


        if (selectedAnswerTenTwo && selectedAnswerTenThree) {
            score += 1;

            checkAnswerTenTwo.setTextColor(Color.GREEN);
            checkAnswerTenThree.setTextColor(Color.GREEN);
        }

        else {
            checkAnswerTenOne.setTextColor(Color.RED);
            checkAnswerTenTwo.setTextColor(Color.GREEN);
            checkAnswerTenThree.setTextColor(Color.GREEN);
            checkAnswerTenFour.setTextColor(Color.RED);
        }



        // Show the score and the answers by pressing the button

        Button results = (Button) findViewById(R.id.submit_answer);
        results.setClickable(true);


        // Display toast message for the overall result

        if (score <= 7) {
            Toast.makeText(this, getString(R.string.results) + score + " " + getString(R.string.less_that_seven), Toast.LENGTH_LONG).show();
        } else if (score == 10) {
            Toast.makeText(this, getString(R.string.results) + score + " " + getString(R.string.full_score), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, getString(R.string.results) + score + " " + getString(R.string.more_than_seven), Toast.LENGTH_LONG).show();
        }

    }


    }
