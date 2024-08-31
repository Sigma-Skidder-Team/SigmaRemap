package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CMoveVehiclePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24345;
   private double field24346;
   private double field24347;
   private double field24348;
   private float field24349;
   private float field24350;

   public CMoveVehiclePacket() {
   }

   public CMoveVehiclePacket(Entity var1) {
      this.field24346 = var1.getPosX();
      this.field24347 = var1.getPosY();
      this.field24348 = var1.getPosZ();
      this.field24349 = var1.rotationYaw;
      this.field24350 = var1.rotationPitch;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24346 = var1.readDouble();
      this.field24347 = var1.readDouble();
      this.field24348 = var1.readDouble();
      this.field24349 = var1.readFloat();
      this.field24350 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.field24346);
      var1.writeDouble(this.field24347);
      var1.writeDouble(this.field24348);
      var1.writeFloat(this.field24349);
      var1.writeFloat(this.field24350);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processVehicleMove(this);
   }

   public double method17246() {
      return this.field24346;
   }

   public double method17247() {
      return this.field24347;
   }

   public double method17248() {
      return this.field24348;
   }

   public float method17249() {
      return this.field24349;
   }

   public float method17250() {
      return this.field24350;
   }
}