package com.cs.ajinmathew.project.firebasestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Add extends AppCompatActivity {
EditText edname,edroll,edadmno,edcollege;
String name,college;
int admno,rollno;
Button btnSubmit;
Student student;

DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add );

        edname=(EditText)findViewById( R.id.sname );
        edroll=(EditText)findViewById( R.id.rollno );
        edadmno=(EditText)findViewById( R.id.admno );
        edcollege=(EditText)findViewById( R.id.college );

        databaseReference= FirebaseDatabase.getInstance().getReference().child( "Students" );

        btnSubmit=(Button)findViewById( R.id.submit );

        btnSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               student=new Student(  );
               name=edname.getText().toString();
               rollno=Integer.parseInt( edroll.getText().toString() );
               admno=Integer.parseInt( edadmno.getText().toString() );
               college=edcollege.getText().toString();
               student.setName( name );
               student.setRoll_no( rollno );
               student.setAdmission_no( admno );
               student.setCollege( college );

               databaseReference.push().setValue( student );

               Toast.makeText( getApplicationContext(),"Sucess",Toast.LENGTH_LONG ).show();
               edcollege.setText( "" );
               edadmno.setText( "" );
               edname.setText( "" );
               edroll.setText( "" );


            }
        } );
    }
}
