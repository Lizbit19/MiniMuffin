package org.firstinspires.ftc.teamcode;

/**
 * Created by CompositeTech on 2/24/17.
 */

public class RedAuton extends AutonOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        drivebase = new MiniMuffinDrivebase( hardwareMap );
        colorSensor = hardwareMap.colorSensor.get( "colour" );
//        colorSensor = hardwareMap.legacyModule.get("asdf");
        dubilydoo = hardwareMap.servo.get("dubilydoo");

        drivebase.driveHolonomic( 0, 1, 1 );
        Thread.sleep(1000);
        drivebase.driveHolonomic(0,1,0);
        Thread.sleep(5000);
        drivebase.driveHolonomic(0,0,1);
        Thread.sleep(1000);
        drivebase.driveHolonomic(0,1,0);
        Thread.sleep(500);

        if(colorSensor.red()>150){
            drivebase.driveHolonomic(-1,0,0);
            Thread.sleep(500);
        }
        dubilydoo.setPosition(90);
    }
}
