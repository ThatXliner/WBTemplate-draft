// Copyright (c) 2024 FRC 3256
// https://github.com/Team3256
//
// Use of this source code is governed by a 
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.robot.subsystems.pivotintake;

import edu.wpi.first.math.trajectory.TrapezoidProfile;

public final class PivotIntakeConstants {
  /* CAN */
  public static final int kPivotMotorID = 34;

  /* PID */
  public static final double kS = 0;
  public static final double kV = 0.05;
  public static final double kP = 1;
  public static final double kI = 0;
  public static final double kD = 0;
  public static final TrapezoidProfile.Constraints kPivotProfileContraints =
      new TrapezoidProfile.Constraints(16, 16);

  /* Tolerance/threshold */
  public static final double kCurrentThreshold = 10;
  public static final double kPivotPositionToleranceDeg = 1; // 5deg for the pivot.
  public static final double kStallVelocityThreshold = 0.1;

  /* Physics/geometry */
  public static final double kPivotMotorGearing = 36; // 22 by 1
  public static final double kPivotGroundAngleDeg = -5.6 / 16;
  public static final double kPivotLength = 0.2;
  public static final double kPivotMinAngleDeg = -90;
  public static final double kPivotMaxAngleDeg = 50;
  public static final double jKgMetersSquared = 0.1; // for sim

  /* Preset */
  public static final double kPivotSlamIntakeVoltage = -5;
  public static final double kPivotSlamShooterVoltage = 4;

  /* Misc */
  public static final int kNumPivotMotors = 1;
  public static final boolean kUseFOC = false;
  public static boolean kUseMotionMagic = false;
  public static double motionMagicVelocity = 10;
  public static double motionMagicAcceleration = 20;
  public static double motionMagicJerk = 100;
  public static boolean enableStatorLimit = true;
  public static double statorLimit = 60;

  /* Current Limits */
  public static final class CurrentLimits {
    public static final boolean kSetCurrentLimits = false;
    public static final double kCurrentLimit = 10;
    public static final double kCurrentThreshold = 40;
    public static final double kCurrentThresholdTime = 0.1;
    public static final boolean kEnableCurrentLimit = true;

    public static final boolean kEnableStatorLimits = false;
    public static final double kStatorLimit = 10;
  }
}
