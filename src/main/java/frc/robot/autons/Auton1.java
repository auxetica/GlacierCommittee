package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.*;

public class Auton1 extends SequentialCommandGroup {
    public Auton1(Drivetrain drivetrain) {
        double turnCorrection = 23;
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter
            */
            // blue top
            // new DriveDistance(0.5, 5, drivetrain),
            // new TurnDegrees(0.5, 270-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 12, drivetrain),
            // new TurnDegrees(0.5, 270-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 10.5, drivetrain),
            // new TurnDegrees(0.5, 90-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 11.5, drivetrain),
            // new TurnDegrees(0.5, 90-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 9, drivetrain),
            // new TurnDegrees(0.5, 270-turnCorrection, drivetrain)
            new DriveTurn(0.5, -90-turnCorrection, 10, drivetrain)
        );
    }
}
