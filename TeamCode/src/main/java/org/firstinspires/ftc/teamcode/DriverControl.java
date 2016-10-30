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
    DcMotor mL;
    DcMotor mR;

    @Override
    public void init() {
        mL = hardwareMap.dcMotor.get("mL");
        mR = hardwareMap.dcMotor.get("mR");
        mR.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        mL.setPower(-gamepad1.left_stick_y);
        mR.setPower(-gamepad1.right_stick_y);
    }
}
