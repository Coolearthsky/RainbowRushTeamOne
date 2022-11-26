// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//nightmare

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Claw extends SubsystemBase {
  public Servo pinchyBoi;
public int getPinchyBoi;

  /** Creates a new claw. */
  public Claw() {
    pinchyBoi = new Servo(0);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drivePinchyBoi(double x){
      pinchyBoi.set(x);
  }


  public void getPinchyBoi(){
    pinchyBoi.get();
}

  
}

//how often do you consider the moral neccicities of a concious mind?z