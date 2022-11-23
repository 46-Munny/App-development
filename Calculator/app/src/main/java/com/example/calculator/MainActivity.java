package com.example.calculator;




import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonadd,buttonsub,buttondiv,buttonmul,buttonclr,buttondot,buttonequal;
    Button buttonsin,buttoncos,buttontan,buttonlog,buttonsinh,buttoncosh,buttontanh,buttonln,buttonsqr,buttonroot,buttoninv,buttondel;
    EditText editText;
    float mValueOne,mValueTwo;

    boolean Addition,Subtraction,Multiplication,Division,sin,cos,tan,log,sinh,cosh,tanh,ln,sqr,root,inv,del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edt1Id);
        button0=findViewById(R.id.btn0Id);
        button1=findViewById(R.id.btn1Id);
        button2=findViewById(R.id.btn2Id);
        button3=findViewById(R.id.btn3Id);
        button4=findViewById(R.id.btn4Id);
        button5=findViewById(R.id.btn5Id);
        button6=findViewById(R.id.btn6Id);
        button7=findViewById(R.id.btn7Id);
        button8=findViewById(R.id.btn8Id);
        button9=findViewById(R.id.btn9Id);
        buttonadd=findViewById(R.id.btnPlusId);
        buttonsub=findViewById(R.id.btnSubId);
        buttonmul=findViewById(R.id.btnMulId);
        buttondiv=findViewById(R.id.btnDivId);
        buttondot=findViewById(R.id.btnDotId);
        buttonequal=findViewById(R.id.btnEqualId);
        buttonclr=findViewById(R.id.btnClearId);
        buttonsin=findViewById(R.id.btnsinId);
        buttoncos=findViewById(R.id.bcosId);
        buttontan=findViewById(R.id.btanId);
        buttonlog=findViewById(R.id.blogId);
        buttonsinh=findViewById(R.id.btnsinhId);
        buttoncosh=findViewById(R.id.bcoshId);
        buttontanh=findViewById(R.id.btanhId);
        buttonln=findViewById(R.id.blnId);
        buttonsqr=findViewById(R.id.bsquareId);
        buttonroot=findViewById(R.id.brootId);
        buttoninv=findViewById(R.id.binvId);
        buttondel=findViewById(R.id.btndelId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });

        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(null);
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(editText.getText()+"");
                    Addition=true;
                    editText.setText(null);
                }
            }
        });


        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(editText.getText()+"");
                    Subtraction=true;
                    editText.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(editText.getText()+"");
                    Multiplication=true;
                    editText.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(editText.getText().toString()+"");
                    Division=true;
                    editText.setText(null);
                }
            }
        });

        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("sin");
                sin=true;
            }
        });

        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("cos");
                cos=true;
            }
        });

        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("tan");
                tan=true;
            }
        });

        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("log");
                log=true;
            }
        });


        buttonsinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("sinh");
                sinh=true;
            }
        });

        buttoncosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("cosh");
                cosh=true;
            }
        });

        buttontanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("tanh");
                tanh=true;
            }
        });

        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("ln");
                ln=true;
            }
        });

        buttonroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("√");
                root=true;
            }
        });

        buttoninv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("1/");
                inv=true;
            }
        });

        buttonsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(editText.getText()+"");
                    sqr=true;
                    editText.setText(null);
                }
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                del=true;
            }
        });



        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Addition==true)
                {
                    mValueTwo=Float.parseFloat(editText.getText()+"");
                    editText.setText(mValueOne+mValueTwo+"");
                    Addition=false;
                }

                if(Subtraction==true)
                {
                    mValueTwo=Float.parseFloat(editText.getText()+"");
                    editText.setText(mValueOne-mValueTwo+"");
                    Subtraction=false;
                }

                if(Multiplication==true)
                {
                    mValueTwo=Float.parseFloat(editText.getText()+"");
                    editText.setText(mValueOne*mValueTwo+"");
                    Multiplication=false;
                }

                if(Division==true)
                {
                    mValueTwo=Float.parseFloat(editText.getText()+"");
                    editText.setText(mValueOne/mValueTwo+"");
                    Division=false;
                }

                if(sin==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(3);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.sin(x);
                    editText.setText(a + "");

                    sin = false;
                }

                if(cos==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(3);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.cos(x);
                    editText.setText(a + "");

                    cos = false;
                }

                if(tan==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(3);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.tan(x);
                    editText.setText(a + "");

                    tan = false;
                }

                if(log==true)
                {
                    String str;
                    double a,b;
                    str =editText.getText().toString();
                    str = str.substring(3);
                    b=Double.parseDouble(str);
                    a = Math.log10(b);
                    editText.setText(a + "");

                    log = false;
                }

                if(sinh==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(4);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.sinh(x);
                    editText.setText(a + "");

                    sinh = false;
                }

                if(cosh==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(4);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.cosh(x);
                    editText.setText(a + "");

                    cosh = false;
                }

                if(tanh==true)
                {
                    String str;
                    double a,b,x;
                    str =editText.getText().toString();
                    str = str.substring(4);
                    b=Double.parseDouble(str);
                    x = Math.toRadians(b);
                    a = Math.tanh(x);
                    editText.setText(a + "");

                    tanh = false;
                }

                if(ln==true) {
                    String str;
                    double a, b;
                    str = editText.getText().toString();
                    str = str.substring(2);
                    b = Double.parseDouble(str);
                    a = Math.log(b);
                    editText.setText(a + "");

                    ln = false;
                }

                if(root==true) {
                    String str;
                    double a, b;
                    str = editText.getText().toString();
                    str = str.substring(1);
                    b = Double.parseDouble(str);
                    a = Math.sqrt(b);
                    editText.setText(a + "");

                    root = false;
                }

                if(inv==true) {
                    String str;
                    double a, b;
                    str = editText.getText().toString();
                    str = str.substring(2);
                    b = Double.parseDouble(str);
                    a = 1/b;
                    editText.setText(a + "");

                    inv = false;
                }


                if(sqr==true)
                {
                    float a;
                    mValueTwo=Float.parseFloat(editText.getText()+"");
                    a = (float) Math.pow(mValueOne,mValueTwo);
                    editText.setText(a+"");
                    sqr=false;
                }

                if(del==true)
                {
                    String str;
                    str = editText.getText().toString();
                    str = str.substring(0, str.length()-1);
                    editText.setText(str);
                    del = false;
                    
                }

                }
        });

    }
}