package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.hitechnic.HiTechnicNxtColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by CompositeTech on 2/24/17.
 */

public class Launcher extends LinearOpMode {
    public DcMotor launcher;
    public DcMotor intake;

    public Launcher(HardwareMap hardwareMap) {
        launcher = hardwareMap.dcMotor.get("launcher");
        intake = hardwareMap.dcMotor.get("intake");
    }

    @Override
    public void runOpMode() throws InterruptedException {

    }
}
