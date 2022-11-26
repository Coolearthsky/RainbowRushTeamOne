// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Claw;

public class unPinchCommand extends CommandBase {
  Claw claw1;
  XboxController controller1;
  /** Creates a new sussyAmongUsBalls. */
  public unPinchCommand(Claw c, XboxController controller) {
    // Use addRequirements() here to declare subsystem dependencies.
    claw1 = c;
    controller1 = controller;

    addRequirements(claw1);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    claw1.drivePinchyBoi(controller1.getLeftX());
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
