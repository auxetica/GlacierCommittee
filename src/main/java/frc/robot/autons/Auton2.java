package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.*;

public class Auton2 extends SequentialCommandGroup {
    public Auton2(Drivetrain drivetrain) {
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */
            // blue bottom
            new DriveDistance(0.5, 16, drivetrain),
            new TurnDegrees(0.5, 250, drivetrain),
            new DriveDistance(0.5, 11, drivetrain),
            new TurnDegrees(0.5, 60, drivetrain),
            new DriveDistance(0.5, 15, drivetrain),
            new TurnDegrees(0.5, 70, drivetrain),
            new DriveDistance(0.5, 10, drivetrain)
        );
    }
}
