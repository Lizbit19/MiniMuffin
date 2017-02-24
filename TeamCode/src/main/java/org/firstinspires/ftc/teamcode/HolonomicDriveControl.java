package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by CompositeTech on 12/7/16.
 */

@TeleOp(name="Holonomic Drive")
public class HolonomicDriveControl extends OpMode {

    MiniMuffinDrivebase drivebase;
    Servo dubilydoo;
    DcMotor launcher;
    Servo intake;

    @Override
    public void init() {
        drivebase = new MiniMuffinDrivebase(hardwareMap);
        dubilydoo = hardwareMap.servo.get("dubilydoo");
        launcher = hardwareMap.dcMotor.get("launcher");
        intake = hardwareMap.servo.get("intake");
    }

    @Override
    public void loop() {
        float x = gamepad1.left_stick_x;
        float y = -gamepad1.left_stick_y;
        float r = gamepad1.right_stick_x;

        drivebase.driveHolonomic(x,y,r);
        //this is the base drive
        int middle = 90;
        int mag = 20;
        if (gamepad1.dpad_left){
            dubilydoo.setPosition(middle-mag);
        } else if (gamepad1.dpad_right) {
            dubilydoo.setPosition(middle+mag);
        } else {
            dubilydoo.setPosition(middle);
        } //this is the beacon presser
//        dubilydoo.setPosition(180*gamepad1.left_trigger);
        if (gamepad1.left_trigger>.3){
            intake.setPosition(90);
        }
        else {
            intake.setPosition(0);
        }
        //intake
        if (gamepad1.right_trigger>.3){
//            launcher.setPosition(90);
            launcher.setPower(1);
        }
        else {
//            launcher.setPosition(-90);
            launcher.setPower(-1);
        }

    }
}
