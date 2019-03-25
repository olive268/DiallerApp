package com.example.olive.dialler;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String num;
    String num2;
    boolean reddail;
    List<Log> list=new ArrayList<>();
    MyAdapter adapter;
    String speed[]={"","","","","","","","","",""};
    boolean speeddail=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b7 = findViewById(R.id.seven);
        Button b6 = findViewById(R.id.six);
        Button b5 = findViewById(R.id.five);
        Button b4 = findViewById(R.id.four);
        Button b3 = findViewById(R.id.three);
        Button b2 = findViewById(R.id.two);
        Button b1 = findViewById(R.id.one);
        Button b0 = findViewById(R.id.zero);
        Button b9 = findViewById(R.id.nine);
        Button b8 = findViewById(R.id.eight);
        ImageButton back = findViewById(R.id.back);
        ImageButton call=findViewById(R.id.call);
        final TextView t=findViewById(R.id.dis);
        Button star=findViewById(R.id.star);
        Button hash=findViewById(R.id.hash);
        Button sd=findViewById(R.id.sd);
        ListView lv=findViewById(R.id.lv);


        adapter=new MyAdapter(list,this);
        lv.setAdapter(adapter);

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText() + "*");
            }
        });
        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText() + "#");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "7");
                else
                {
                    speed[7]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "6");
                else
                {
                    speed[6]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "5");
                else
                {
                    speed[5]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "4");
                else
                {
                    speed[4]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "3");
                else
                {
                    speed[3]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "2");
                else
                {
                    speed[2]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "1");
                else
                {
                    speed[1]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "0");
                else
                {
                    speed[0]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "8");
                else
                {
                    speed[8]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speeddail==false)
                    t.setText(t.getText() + "9");
                else
                {
                    speed[9]=t.getText().toString();
                    Toast.makeText(MainActivity.this, "Speed Dail Set", Toast.LENGTH_SHORT).show();
                    speeddail=false;
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t.getText().toString().isEmpty())
                    t.setText(t.getText().toString().substring(0, t.getText().toString().length() - 1));
            }
        });
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!t.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Speed Dail Number", Toast.LENGTH_SHORT).show();
                    speeddail=true;
                }
                else
                    Toast.makeText(MainActivity.this, "Enter the Phone number first", Toast.LENGTH_SHORT).show();
            }
        });

        b7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[7].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[7]);
                    call(view);
                }
                return true;
            }
        });

        b0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                t.append("+");
                return true;
            }
        });

        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[1].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[1]);
                    call(view);
                }
                return true;
            }
        });

        b2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[2].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[2]);
                    call(view);
                }
                return true;
            }
        });

        b3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[3].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[3]);
                    call(view);
                }
                return true;
            }
        });

        b4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[4].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[4]);
                    call(view);
                }
                return true;
            }
        });

        b5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[5].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[5]);
                    call(view);
                }
                return true;
            }
        });

        b6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[6].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[6]);
                    call(view);
                }
                return true;
            }
        });

        b8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[8].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[8]);
                    call(view);
                }
                return true;
            }
        });

        b9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(speed[9].isEmpty())
                    Toast.makeText(MainActivity.this, "No Speed Dail Assigned", Toast.LENGTH_SHORT).show();
                else
                {
                    t.setText(speed[9]);
                    call(view);
                }
                return true;
            }
        });


    }


    public void call(View view) {
        String currtime= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        Intent i=new Intent();
        TextView t=findViewById(R.id.dis);
        num=t.getText().toString();


        i.setAction(Intent.ACTION_CALL);
        if(num.isEmpty()&&reddail) {
            i.setData(Uri.parse("tel:" + num2));
            list.add(new Log(num2,currtime));
        }

        else {
            i.setData(Uri.parse("tel:" + num));
            list.add(new Log(num,currtime));
        }

        num2=num;
        reddail=true;
        startActivity(i);
        adapter.notifyDataSetChanged();
        t.setText("");
    }


    public void contacts(View view) {
        Intent i=new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://contacts/people"));
        startActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_APP_CONTACTS));
    }
}
