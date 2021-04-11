package com.hammadshahzad.alphabetslearningchildplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainActivity2 extends AppCompatActivity {
    TextView textView ,itemName;
    ImageView imageView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView =(TextView) findViewById(R.id.TVChoosedLetter);
        itemName=(TextView) findViewById(R.id.TVItemName);
        imageView=(ImageView) findViewById(R.id.ImgVChoosedImgaed);

    }

    @Override
    protected void onStart() {

        super.onStart();
        setImageView();
        imageView.animate().rotation(360).alpha(0).translationX(1200).scaleX(10).scaleY(10).setDuration(8000);
        textView.setText(getIntent().getStringExtra("Letter"));
    }
    void setImageView()
    {
        String letter =getIntent().getStringExtra("Letter");
        if(letter.equals("Letter A"))
        {
            imageView.setImageResource(R.drawable.apple);
            itemName.setText("Apple");
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_a);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter B"))
        {
            imageView.setImageResource(R.drawable.bat);
            itemName.setText("Bat");
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_b_sound_effect);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter C"))
        {
            itemName.setText("Chair");
            imageView.setImageResource(R.drawable.chair);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_c);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter D"))
        {
            itemName.setText("DOG");
            imageView.setImageResource(R.drawable.dog);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_d);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter E"))
        {
            itemName.setText("Elephant");
            imageView.setImageResource(R.drawable.icons8_elephant_circus_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_e);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter F"))
        {
            itemName.setText("Frog");
            imageView.setImageResource(R.drawable.icons8_frog_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_f);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter G"))
        {
            itemName.setText("Grass");
            imageView.setImageResource(R.drawable.icons8_grass_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_g);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter H"))
        {
            itemName.setText("Horse");
            imageView.setImageResource(R.drawable.icons8_horse_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_h);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter I"))
        {
            itemName.setText("Ink");
            imageView.setImageResource(R.drawable.icons8_quill_with_ink_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_i);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter J"))
        {
            itemName.setText("Jungle");
            imageView.setImageResource(R.drawable.icons8_jungle_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_j);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter K"))
        {
            itemName.setText("Kite");
            imageView.setImageResource(R.drawable.icons8_kite_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_k);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter L"))
        {
            itemName.setText("Lemon");
            imageView.setImageResource(R.drawable.icons8_lemon_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_l);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter M"))
        {
            itemName.setText("Mango");
            imageView.setImageResource(R.drawable.icons8_mango_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_m);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter N"))
        {
            itemName.setText("NOSE");
            imageView.setImageResource(R.drawable.icons8_nose_medium_light_skin_tone_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_n);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter O"))
        {
            itemName.setText("Orange");
            imageView.setImageResource(R.drawable.icons8_orange_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_o);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter P"))
        {
            itemName.setText("Piano");
            imageView.setImageResource(R.drawable.icons8_piano_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_p);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter Q"))
        {
            itemName.setText("QR CODE");
            imageView.setImageResource(R.drawable.icons8_qr_code_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_q);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter R"))
        {
            itemName.setText("Rocket");
            imageView.setImageResource(R.drawable.icons8_rocket_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_r);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter S"))
        {
            itemName.setText("Spider");
            imageView.setImageResource(R.drawable.icons8_spider_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_s);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter T"))
        {
            itemName.setText("TV");
            imageView.setImageResource(R.drawable.icons8_hdtv_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_t);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter U"))
        {
            itemName.setText("Umbrella");
            imageView.setImageResource(R.drawable.icons8_umbrella_on_ground_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_u);
            mediaPlayer.start();
        }

        else if(letter.equals("Letter V"))
        {
            itemName.setText("Volcano");
            imageView.setImageResource(R.drawable.icons8_volcano_127px_1);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_v);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter W"))
        {
            itemName.setText("Work");
            imageView.setImageResource(R.drawable.icons8_work_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_w);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter X"))
        {
            itemName.setText("Xing");
            imageView.setImageResource(R.drawable.icons8_xing_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_x);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter Y"))
        {
            itemName.setText("YOYO");
            imageView.setImageResource(R.drawable.icons8_yo_yo_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_y);
            mediaPlayer.start();
        }
        else if(letter.equals("Letter Z"))
        {
            itemName.setText("Zebra");
            imageView.setImageResource(R.drawable.icons8_zebra_127px);
            mediaPlayer= MediaPlayer.create(this,R.raw.letter_z);
            mediaPlayer.start();
        }

    }
}