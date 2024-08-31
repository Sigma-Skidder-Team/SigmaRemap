package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SOpenSignMenuPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24379;
   private BlockPos field24380;

   public SOpenSignMenuPacket() {
   }

   public SOpenSignMenuPacket(BlockPos var1) {
      this.field24380 = var1;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleSignEditorOpen(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24380 = var1.method35707();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24380);
   }

   public BlockPos method17271() {
      return this.field24380;
   }
}
