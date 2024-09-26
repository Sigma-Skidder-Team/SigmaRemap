package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.IPacket;

import java.io.IOException;
import java.util.UUID;

public class SSpawnPlayerPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24832;
   private int field24833;
   private UUID field24834;
   private double field24835;
   private double field24836;
   private double field24837;
   private byte field24838;
   private byte field24839;

   public SSpawnPlayerPacket() {
   }

   public SSpawnPlayerPacket(PlayerEntity var1) {
      this.field24833 = var1.getEntityId();
      this.field24834 = var1.getGameProfile().getId();
      this.field24835 = var1.getPosX();
      this.field24836 = var1.getPosY();
      this.field24837 = var1.getPosZ();
      this.field24838 = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.field24839 = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24833 = var1.readVarInt();
      this.field24834 = var1.readUniqueId();
      this.field24835 = var1.readDouble();
      this.field24836 = var1.readDouble();
      this.field24837 = var1.readDouble();
      this.field24838 = var1.readByte();
      this.field24839 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24833);
      var1.writeUniqueId(this.field24834);
      var1.writeDouble(this.field24835);
      var1.writeDouble(this.field24836);
      var1.writeDouble(this.field24837);
      var1.writeByte(this.field24838);
      var1.writeByte(this.field24839);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleSpawnPlayer(this);
   }

   public int method17592() {
      return this.field24833;
   }

   public UUID method17593() {
      return this.field24834;
   }

   public double method17594() {
      return this.field24835;
   }

   public double method17595() {
      return this.field24836;
   }

   public double method17596() {
      return this.field24837;
   }

   public byte method17597() {
      return this.field24838;
   }

   public byte method17598() {
      return this.field24839;
   }
}
