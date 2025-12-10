package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.*;

public class Auton2 extends SequentialCommandGroup {
    public Auton2(Drivetrain drivetrain) {
        double turnOffset = 20.6;
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */
            // blue bottom (beaker)
            new DriveDistance(0.5, 16, drivetrain),
            new TurnDegrees(0.5, -90+turnOffset, drivetrain),
            new DriveDistance(0.5, 11, drivetrain),
            new TurnDegrees(0.5, 80-turnOffset, drivetrain),
            new DriveDistance(0.5, 15, drivetrain),
            new TurnDegrees(0.5, 90-turnOffset, drivetrain),
            new DriveDistance(0.5, 10, drivetrain)
        );
    }
}
