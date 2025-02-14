package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SMoveVehiclePacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24577;
   private double field24578;
   private double field24579;
   private double field24580;
   private float field24581;
   private float field24582;

   public SMoveVehiclePacket() {
   }

   public SMoveVehiclePacket(Entity var1) {
      this.field24578 = var1.getPosX();
      this.field24579 = var1.getPosY();
      this.field24580 = var1.getPosZ();
      this.field24581 = var1.rotationYaw;
      this.field24582 = var1.rotationPitch;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24578 = var1.readDouble();
      this.field24579 = var1.readDouble();
      this.field24580 = var1.readDouble();
      this.field24581 = var1.readFloat();
      this.field24582 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.field24578);
      var1.writeDouble(this.field24579);
      var1.writeDouble(this.field24580);
      var1.writeFloat(this.field24581);
      var1.writeFloat(this.field24582);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleMoveVehicle(this);
   }

   public double method17401() {
      return this.field24578;
   }

   public double method17402() {
      return this.field24579;
   }

   public double method17403() {
      return this.field24580;
   }

   public float method17404() {
      return this.field24581;
   }

   public float method17405() {
      return this.field24582;
   }
}
