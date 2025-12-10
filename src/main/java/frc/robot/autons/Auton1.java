package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.*;

public class Auton1 extends SequentialCommandGroup {
    public Auton1(Drivetrain drivetrain) {
        double turnCorrection = 20.6;
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter
            */
            // blue top (curve)
            new DriveDistance(0.5, 5, drivetrain)
            // new TurnDegrees(0.5, -90+turnCorrection, drivetrain),
            // new DriveDistance(0.5, 12, drivetrain),
            // new TurnDegrees(0.5, -90+turnCorrection, drivetrain),
            // new DriveDistance(0.5, 10.5, drivetrain),
            // new TurnDegrees(0.5, 90-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 11.5, drivetrain),
            // new TurnDegrees(0.5, 90-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 9, drivetrain),
            // new TurnDegrees(0.5, -90+turnCorrection, drivetrain),
            //final turn
            // new DriveDistance(0.5, 3, drivetrain),
            // new TurnDegrees(0.5, 10-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 3, drivetrain),
            // new TurnDegrees(0.5, 7-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 3, drivetrain),
            // new TurnDegrees(0.5, 5-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 3, drivetrain),
            // new TurnDegrees(0.5, 5-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 2, drivetrain),
            // new TurnDegrees(0.5, 5-turnCorrection, drivetrain),
            // new DriveDistance(0.5, 2, drivetrain),
            // new TurnDegrees(0.5, 5-turnCorrection, drivetrain)

        );
    }
}
