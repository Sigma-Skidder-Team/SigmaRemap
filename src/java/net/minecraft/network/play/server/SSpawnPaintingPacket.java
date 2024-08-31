package net.minecraft.network.play.server;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.UUID;

public class SSpawnPaintingPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24275;
   private int field24276;
   private UUID field24277;
   private BlockPos field24278;
   private Direction field24279;
   private int field24280;

   public SSpawnPaintingPacket() {
   }

   public SSpawnPaintingPacket(PaintingEntity var1) {
      this.field24276 = var1.method3205();
      this.field24277 = var1.getUniqueID();
      this.field24278 = var1.method4085();
      this.field24279 = var1.method3386();
      this.field24280 = Registry.field16079.method9171(var1.field5496);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24276 = var1.method35714();
      this.field24277 = var1.method35717();
      this.field24280 = var1.method35714();
      this.field24278 = var1.method35707();
      this.field24279 = Direction.method547(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24276);
      var1.method35716(this.field24277);
      var1.writeVarInt(this.field24280);
      var1.method35708(this.field24278);
      var1.writeByte(this.field24279.method534());
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleSpawnPainting(this);
   }

   public int method17194() {
      return this.field24276;
   }

   public UUID method17195() {
      return this.field24277;
   }

   public BlockPos method17196() {
      return this.field24278;
   }

   public Direction method17197() {
      return this.field24279;
   }

   public Class9078 method17198() {
      return Registry.field16079.method9172(this.field24280);
   }
}
