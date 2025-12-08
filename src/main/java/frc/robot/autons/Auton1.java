package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.*;

public class Auton1 extends SequentialCommandGroup {
    public Auton1(Drivetrain drivetrain) {
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */
            new DriveTime(1, 2, drivetrain)
        );
    }
}
