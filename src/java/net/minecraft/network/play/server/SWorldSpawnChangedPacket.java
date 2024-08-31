package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SWorldSpawnChangedPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24511;
   private BlockPos field24512;
   private float field24513;

   public SWorldSpawnChangedPacket() {
   }

   public SWorldSpawnChangedPacket(BlockPos var1, float var2) {
      this.field24512 = var1;
      this.field24513 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24512 = var1.readBlockPos();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.field24512);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.func_230488_a_(this);
   }

   public BlockPos method17372() {
      return this.field24512;
   }

   public float method17373() {
      return this.field24513;
   }
}
