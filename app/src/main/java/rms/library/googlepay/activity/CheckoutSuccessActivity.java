/*
 * Copyright 2023 Razer Merchant Services.
 */

package rms.library.googlepay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import rms.library.googlepay.databinding.ActivityCheckoutSuccessBinding;

public class CheckoutSuccessActivity extends AppCompatActivity {

  public static final String EXTRA_MESSAGE = "extra_message";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityCheckoutSuccessBinding layoutBinding = ActivityCheckoutSuccessBinding.inflate(getLayoutInflater());
    setContentView(layoutBinding.getRoot());

    // Retrieve the string from intent
    Intent intent = getIntent();
    String message = intent.getStringExtra(EXTRA_MESSAGE);

    layoutBinding.paymentSuccessDescription.setText(message);
  }
}
