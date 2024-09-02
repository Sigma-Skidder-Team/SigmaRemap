package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SEntityTeleportPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24824;
   private int field24825;
   private double field24826;
   private double field24827;
   private double field24828;
   private byte field24829;
   private byte field24830;
   private boolean field24831;

   public SEntityTeleportPacket() {
   }

   public SEntityTeleportPacket(Entity var1) {
      this.field24825 = var1.getEntityId();
      this.field24826 = var1.getPosX();
      this.field24827 = var1.getPosY();
      this.field24828 = var1.getPosZ();
      this.field24829 = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.field24830 = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
      this.field24831 = var1.method3226();
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24825 = var1.readVarInt();
      this.field24826 = var1.readDouble();
      this.field24827 = var1.readDouble();
      this.field24828 = var1.readDouble();
      this.field24829 = var1.readByte();
      this.field24830 = var1.readByte();
      this.field24831 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24825);
      var1.writeDouble(this.field24826);
      var1.writeDouble(this.field24827);
      var1.writeDouble(this.field24828);
      var1.writeByte(this.field24829);
      var1.writeByte(this.field24830);
      var1.writeBoolean(this.field24831);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityTeleport(this);
   }

   public int method17585() {
      return this.field24825;
   }

   public double method17586() {
      return this.field24826;
   }

   public double method17587() {
      return this.field24827;
   }

   public double method17588() {
      return this.field24828;
   }

   public byte method17589() {
      return this.field24829;
   }

   public byte method17590() {
      return this.field24830;
   }

   public boolean method17591() {
      return this.field24831;
   }
}
