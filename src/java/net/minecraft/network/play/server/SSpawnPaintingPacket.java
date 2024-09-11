package net.minecraft.network.play.server;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

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
      this.field24276 = var1.getEntityId();
      this.field24277 = var1.getUniqueID();
      this.field24278 = var1.method4085();
      this.field24279 = var1.method3386();
      this.field24280 = Registry.field16079.getId(var1.field5496);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24276 = var1.readVarInt();
      this.field24277 = var1.readUniqueId();
      this.field24280 = var1.readVarInt();
      this.field24278 = var1.readBlockPos();
      this.field24279 = Direction.method547(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24276);
      var1.writeUniqueId(this.field24277);
      var1.writeVarInt(this.field24280);
      var1.writeBlockPos(this.field24278);
      var1.writeByte(this.field24279.method534());
   }

   public void processPacket(IClientPlayNetHandler var1) {
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
