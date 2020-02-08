package org.firstinspires.ftc.teamcode.structure;

import com.qualcomm.robotcore.hardware.configuration.DistributorInfo;
import com.qualcomm.robotcore.hardware.configuration.annotations.DeviceProperties;
import com.qualcomm.robotcore.hardware.configuration.annotations.ExpansionHubPIDFPositionParams;
import com.qualcomm.robotcore.hardware.configuration.annotations.ExpansionHubPIDFVelocityParams;
import com.qualcomm.robotcore.hardware.configuration.annotations.MotorType;

import org.firstinspires.ftc.robotcore.external.navigation.Rotation;

@MotorType(ticksPerRev=753.2, gearing=26.9, maxRPM=223, orientation=Rotation.CCW)
@DeviceProperties(xmlTag="goBILDA5202SeriesMotor_223RPM", name="GoBILDA 5202 series 223RPM", builtIn = true)
@DistributorInfo(distributor="goBILDA_distributor", model="goBILDA-5202-223RPM", url="https://www.gobilda.com/5202-series-yellow-jacket-planetary-gear-motor-26-9-1-ratio-223-rpm-3-3-5v-encoder/")
@ExpansionHubPIDFVelocityParams(P=2.0, I=0.5, F=11.1)
@ExpansionHubPIDFPositionParams(P=5.0)
public interface GoBILDA5205Series_223RPM {}