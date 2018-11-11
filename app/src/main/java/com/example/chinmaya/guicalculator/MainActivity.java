package com.example.chinmaya.guicalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,ba,bs,bm,bd,bcal,bdel;
    TextView t;
    String s = "";

    public static String newString(String s, int bi, int ai, double val)
    {
        String ns = "";
        if(bi==0)
            ns+=""+val;
        else
            ns+=s.substring(0,bi+1)+val+s.substring(ai);
        return ns;

    }

    public static int floorCheck(double x)
    {
        return (x == java.lang.Math.floor(x)) ? 1:0;
    }


    public static int isSymbol(char x)
    {

        if(x=='+' || x=='-' || x=='*' || x=='/')
            return 1;

        return 0;
    }

    public static String reverseIt(String source)
    {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--)
        {
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }


    public static String getBefore(String s, int si)
    {
        String s1 = "";
        si--;
        while(si>=0 && isSymbol(s.charAt(si))==0)
        {

            char tc = s.charAt(si);
            s1+= ""+tc;
            si--;

        }
        return reverseIt(s1);
    }

    public static String getAfter(String s, int si)
    {
        String s1 = "";
        int l = s.length();
        si++;
        while(si<l && isSymbol(s.charAt(si))==0)
        {
            char tc = s.charAt(si);
            s1+= ""+tc;
            si++;
        }
        return s1;
    }

    //2nd lot

    public static int noOfSymbols(String s)
    {
        int i,n=s.length(),f=0;
        for(i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x=='+' || x=='-' || x=='*' || x=='/')
                f++;
        }
        return f;
    }

    public static int hasDiv(String s)
    {
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x=='/')
                return i;
        }
        return 0;
    }

    public static int hasMul(String s)
    {
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x=='*')
                return i;
        }
        return 0;
    }

    public static int hasAdd(String s)
    {
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x=='+')
                return i;
        }
        return 0;
    }

    public static int hasSub(String s)
    {
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x=='-')
                return i;
        }
        return 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.bone);
        b2 = (Button) findViewById(R.id.btwo);
        b3 = (Button) findViewById(R.id.bthree);
        b4 = (Button) findViewById(R.id.bfour);
        b5 = (Button) findViewById(R.id.bfive);
        b6 = (Button) findViewById(R.id.bsix);
        b7 = (Button) findViewById(R.id.bseven);
        b8 = (Button) findViewById(R.id.beight);
        b9 = (Button) findViewById(R.id.bnine);
        b0 = (Button) findViewById(R.id.bzero);
        bp = (Button) findViewById(R.id.bdot);
        ba = (Button) findViewById(R.id.badd);
        bs = (Button) findViewById(R.id.bsub);
        bm = (Button) findViewById(R.id.bmul);
        bd = (Button) findViewById(R.id.bdiv);
        bdel = (Button) findViewById(R.id.bdelete);
        bcal = (Button) findViewById(R.id.bequal);
        t = (TextView) findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="1";
                t.setText(s);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="0";
                t.setText(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="2";
                t.setText(s);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="3";
                t.setText(s);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="4";
                t.setText(s);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="5";
                t.setText(s);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="6";
                t.setText(s);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="7";
                t.setText(s);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="8";
                t.setText(s);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="9";
                t.setText(s);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="+";
                t.setText(s);
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="-";
                t.setText(s);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="1";
                t.setText(s);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="*";
                t.setText(s);
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+="/";
                t.setText(s);
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s+=".";
                t.setText(s);
            }
        });

        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!t.getText().toString().isEmpty())
                {
                    s = s.substring(0, s.length() - 1);
                    t.setText(s);
                }

            }
        });

        bcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            try {
                int l = s.length(), z = noOfSymbols(s);
                String ns = "";
                //          01234567890
                // int l = s.length();
                // for(i=1;i<l;i++)
                //System.out.println(s.charAt(0));
                //System.out.println(getAfter(s,3));
                //+-*abc/de


                while (z > 0) {
                    if (hasDiv(s) != 0) {
                        int i = hasDiv(s);
                        String s1 = getBefore(s, i);
                        String s2 = getAfter(s, i);
                        double val, a, b;
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        val = a / b;
                        //System.out.println(val);
                        int l1 = s1.length();
                        int l2 = s2.length();
                        int bi = i - l1 - 1, ai = i + l2 + 1; // charAt(ai) gives the index of next operatorwhi
                        s = newString(s, bi, ai, val);

                    } else if (hasMul(s) != 0) {
                        int i = hasMul(s);
                        String s1 = getBefore(s, i);
                        String s2 = getAfter(s, i);
                        double val, a, b;
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        val = a * b;
                        //System.out.println(val);
                        int l1 = s1.length();
                        int l2 = s2.length();
                        int bi = i - l1 - 1, ai = i + l2 + 1; // charAt(ai) gives the index of next operatorwhi
                        s = newString(s, bi, ai, val);

                    } else if (hasAdd(s) != 0) {
                        int i = hasAdd(s);
                        String s1 = getBefore(s, i);
                        String s2 = getAfter(s, i);
                        double val, a, b;
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        val = a + b;
                        //System.out.println(val);
                        int l1 = s1.length();
                        int l2 = s2.length();
                        int bi = i - l1 - 1, ai = i + l2 + 1; // charAt(ai) gives the index of next operatorwhi
                        s = newString(s, bi, ai, val);

                    } else {
                        int i = hasSub(s);
                        String s1 = getBefore(s, i);
                        String s2 = getAfter(s, i);
                        double val, a, b;
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        val = a - b;
                        //System.out.println(val);
                        int l1 = s1.length();
                        int l2 = s2.length();
                        int bi = i - l1 - 1, ai = i + l2 + 1; // charAt(ai) gives the index of next operatorwhi
                        s = newString(s, bi, ai, val);

                    }
                    z--;
                }

//                double zzz = Double.parseDouble(s);
//                if(floorCheck(z)==1)
//                {
//                    int zz = (int) zzz;
//                    t.setText(""+zz);
//                }
//                else
                t.setText(s);
                bcal.setBackgroundColor(Color.rgb(204, 12, 7));

            }
            catch(Exception e)
            {
                t.setText("don't be overambitious");
            }




                }//22212629
        });




    }
}
