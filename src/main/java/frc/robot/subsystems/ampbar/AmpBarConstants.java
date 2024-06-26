// Copyright (c) 2024 FRC 3256
// https://github.com/Team3256
//
// Use of this source code is governed by a 
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.robot.subsystems.ampbar;

public final class AmpBarConstants {
  public static final double kAmpBarVelocityThreshold = 1.5;

  public static final double kAmpBarCurrentThreshold = 5;
  public static final double kAmpBarAmpVoltage = 16; // 8
  public static final double kAmpBarStowVoltage = -16; // -4

  public static final int kAmpBarMotorID = 10;
  public static int kNumAmpBarMotors = 1;
  public static double kAmpBarMotorGearing = 7; // i dont think we need this
  public static double jKgMetersSquared = 0.1;
  public static double kAmpBarLength = 5;
  public static double kAmpBarMinAngleDeg = 0;
  public static double kAmpBarMaxAngleDeg = 90;
  public static Double kStallVelocityThreshold = 0.1;
}
