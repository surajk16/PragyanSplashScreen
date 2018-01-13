package com.delta.suraj.splash;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation innerDashedCircleAnim = AnimationUtils.loadAnimation(this, R.anim.inner_dashed_circle_anim);
        Animation innerStripedCircleAnim = AnimationUtils.loadAnimation(this, R.anim.inner_striped_circle_anim);
        Animation dashedCircleAnim = AnimationUtils.loadAnimation(this, R.anim.dashed_circle_anim);
        Animation dashedMiddleAnim = AnimationUtils.loadAnimation(this, R.anim.dashed_middle_anim);
        Animation outerDashedAnim = AnimationUtils.loadAnimation(this, R.anim.outer_dashed_anim);
        Animation intermediatesAnim = AnimationUtils.loadAnimation(this, R.anim.intermediates_anim);
        Animation outermostCircleAnim  = AnimationUtils.loadAnimation(this, R.anim.outermost_circle);
        Animation outerCutsAnim = AnimationUtils.loadAnimation(this, R.anim.outer_cuts_anim);
        Animation purpleArcAnim = AnimationUtils.loadAnimation(this, R.anim.purple_arc_anim);
        Animation innerCutsAnim = AnimationUtils.loadAnimation(this,R.anim.inner_cuts_anim);
        Animation innerBigArcAnim = AnimationUtils.loadAnimation(this, R.anim.inner_big_arc_anim);
        Animation linesAnim = AnimationUtils.loadAnimation(this, R.anim.lines_anim);
        Animation gradientAnim = AnimationUtils.loadAnimation(this, R.anim.gradient_anim);
        Animation praggyanLogoAnim = AnimationUtils.loadAnimation(this, R.anim.pragyan_anim);

        ImageView lines = findViewById(R.id.lines);
        ImageView innerBigArc = findViewById(R.id.inner_big_arc);
        ImageView innerCuts = findViewById(R.id.inner_cuts);
        ImageView innerDashedCircle = findViewById(R.id.inner_dashed_circle);
        ImageView outerCuts = findViewById(R.id.outer_cuts);
        ImageView outerDashed = findViewById(R.id.outer_dashed);
        ImageView outerMostCircle = findViewById(R.id.outermost_circle);
        ImageView pragyanLogo = findViewById(R.id.pragyan_logo);
        ImageView purpleArc = findViewById(R.id.purple_arc);
        ImageView innerStripedCircle = findViewById(R.id.inner_striped_circle);
        ImageView dashedCircle = findViewById(R.id.dashed_circle);
        ImageView dashedMiddle = findViewById(R.id.dashed_middle);
        ImageView intermediates = findViewById(R.id.intermediates);
        ImageView gradient = findViewById(R.id.gradient);

        innerDashedCircle.startAnimation(innerDashedCircleAnim);
        innerStripedCircle.startAnimation(innerStripedCircleAnim);
        dashedCircle.startAnimation(dashedCircleAnim);
        dashedMiddle.startAnimation(dashedMiddleAnim);
        outerDashed.startAnimation(outerDashedAnim);
        intermediates.startAnimation(intermediatesAnim);
        outerMostCircle.startAnimation(outermostCircleAnim);
        outerCuts.startAnimation(outerCutsAnim);
        purpleArc.startAnimation(purpleArcAnim);
        innerCuts.startAnimation(innerCutsAnim);
        innerBigArc.startAnimation(innerBigArcAnim);
        lines.startAnimation(linesAnim);
        gradient.startAnimation(gradientAnim);
        pragyanLogo.startAnimation(praggyanLogoAnim);



    }
}
