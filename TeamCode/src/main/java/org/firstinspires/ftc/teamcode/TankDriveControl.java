package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by elizabeth on 10/30/16.
 */

@TeleOp(name="Tank Drive")
public class TankDriveControl extends OpMode {

    MiniMuffinDrivebase drivebase;

    @Override
    public void init() {
        drivebase = new MiniMuffinDrivebase(hardwareMap);
    }

    @Override
    public void loop() {
        drivebase.driveTank(-gamepad1.left_stick_y, -gamepad1.right_stick_y);
    }

}

