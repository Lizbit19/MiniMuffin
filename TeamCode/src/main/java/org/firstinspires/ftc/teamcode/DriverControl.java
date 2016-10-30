package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by elizabeth on 10/30/16.
 */

@TeleOp(name="Driver Control")
public class DriverControl extends OpMode {
    DcMotor mLB;
    DcMotor mRB;
    DcMotor mLF;
    DcMotor mRF;

    @Override
    public void init() {
        mLB = hardwareMap.dcMotor.get("mLB");
        mRB = hardwareMap.dcMotor.get("mRB");
        mRF = hardwareMap.dcMotor.get("mRF");
        mLF = hardwareMap.dcMotor.get("mLF");
        mRB.setDirection(DcMotorSimple.Direction.REVERSE);
        mRF.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        setLeftDrive(-gamepad1.left_stick_y);
        setRightDrive(-gamepad1.right_stick_y);
    }

    private void setRightDrive(double p) {
        mRB.setPower(p);
        mRF.setPower(p);
    }

    public void setLeftDrive(double p){
        mLB.setPower(p);
        mLF.setPower(p);
    }
}
