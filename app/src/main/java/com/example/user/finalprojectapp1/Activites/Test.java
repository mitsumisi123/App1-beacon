//package com.example.user.finalprojectapp1.Activites;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.CardView;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.example.user.finalprojectapp1.API.AppPreferences;
//import com.example.user.finalprojectapp1.MainActivity;
//import com.example.user.finalprojectapp1.R;
//import com.example.user.finalprojectapp1.Setting.SettingString;
//
//public class Test extends AppCompatActivity {
////    Button button2;
////    Button button1;
////    EditText editText;
////    Button button3;
//    CardView button_test,button_setting;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_beacon);
////        editText = findViewById(R.id.abc1);
////        button2 = findViewById(R.id.abc2);
////        button1 = (Button)findViewById(R.id.abc);
////        button3 = findViewById(R.id.abc3);
//
//
//        button_setting = (CardView)findViewById(R.id.setting_dasboard);
//        button_test = (CardView) findViewById(R.id.test_dasboard) ;
//        button_test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Test.this,MainActivity.class);
//                startActivity(intent);
////                if(editText.getText() == null){
////                    Toast.makeText(getApplicationContext(),"Please enter room name",Toast.LENGTH_SHORT).show();
////                }else{
////                    AppPreferences.getInstance(getApplicationContext()).setDeviceName(editText.getText().toString());
////                }
//            }
//        });
//
//        button_setting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Test.this,Setting.class);
//                startActivity(intent);
//            }
//        });
//
////        button3.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Toast.makeText(getApplicationContext(),AppPreferences.getInstance(getApplicationContext()).getDeviceName(),Toast.LENGTH_SHORT).show();
////            }
////        });
////        button1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Intent intent = new Intent(Test.this,MainActivity.class);
////                startActivity(intent);
////            }
////        });
//
//    }
//}
