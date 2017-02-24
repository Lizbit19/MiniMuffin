package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by CompositeTech on 12/7/16.
 */

public class MiniMuffinDrivebase {
    private DcMotor mLB;
    private DcMotor mRB;
    private DcMotor mLF;
    private DcMotor mRF;

    public MiniMuffinDrivebase(HardwareMap hardwareMap){
        mLB = hardwareMap.dcMotor.get("mLB");
        mRB = hardwareMap.dcMotor.get("mRB");
        mRF = hardwareMap.dcMotor.get("mRF");
        mLF = hardwareMap.dcMotor.get("mLF");
        mRB.setDirection(DcMotorSimple.Direction.REVERSE);
        mRF.setDirection(DcMotorSimple.Direction.REVERSE);
        mLB.setDirection(DcMotorSimple.Direction.REVERSE);
    }


    public void setRightDrive(double p) {
        mRB.setPower(p);
        mRF.setPower(p);
    }

    public void setLeftDrive(double p){
        mLB.setPower(-p);
        mLF.setPower(p);
    }

    public void driveTank(double l, double r){
        setLeftDrive(l);
        setRightDrive(r);
    }

    public void driveHolonomic(float x, float y, float r){
        float pLB = y - x + r;
        float pLF = y + x + r;
        float pRB = y + x - r;
        float pRF = y - x - r;

        float max = Math.max(Math.max(Math.abs(pLB), Math.abs(pLF)), Math.max(Math.abs(pRB), Math.abs(pRF)));

        float f = max > 1 ? 1/max : 1;

        mLB.setPower(pLB*f);
        mLF.setPower(pLF*f);
        mRB.setPower(pRB*f);
        mRF.setPower(pRF*f);
    }
}
