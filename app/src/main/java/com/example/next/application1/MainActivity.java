package com.example.next.application1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText email,password;
    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LoginModel model = new LoginModel();
        final ArrayList<LoginModel> loginmodelList= new ArrayList<>();

         email= (EditText) findViewById(R.id.edit_email);
        password= (EditText) findViewById(R.id.edit_password);

        signIn= (Button) findViewById(R.id.btn_signup);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = email.getText().toString();
                String passwrd = password.getText().toString();

                model.setUserName(username);
                model.setPassword(passwrd);
                final LoginModel model = new LoginModel(username, passwrd);
                Log.i("username", "onCreate: " + model.getUserName());


                Log.i("password", "onCreate: " + model.getPassword());


                LoginModel modelLaxman= new LoginModel();
                modelLaxman.setPassword("laxman");
                modelLaxman.setUserName("laxman");

                LoginModel modelpriya= new LoginModel();

                modelpriya.setUserName("priya");
                modelpriya.setPassword("priya");

                LoginModel modelnaddim= new LoginModel();
                modelnaddim.setUserName("naddim");
                modelnaddim.setPassword("naddim");
                loginmodelList.add(modelnaddim);
                loginmodelList.add(modelLaxman);
                loginmodelList.add(modelpriya);

                Intent ii= new Intent(MainActivity.this,Main2Activity.class);
                 startActivity(ii);

                for (int i = 0; i <loginmodelList.size() ; i++) {
                 LoginModel model2=   loginmodelList.get(i);

                    Log.i("usernamelist", "onCreate: " +model2.getUserName() );


                    Log.i("passwordlist", "onCreate: " + model2.getPassword());


                }


            Constants.constantmodel = loginmodelList;



            }
        });


}}
