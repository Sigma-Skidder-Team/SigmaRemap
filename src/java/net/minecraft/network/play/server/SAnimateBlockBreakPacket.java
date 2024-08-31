package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SAnimateBlockBreakPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24507;
   private int field24508;
   private BlockPos field24509;
   private int field24510;

   public SAnimateBlockBreakPacket() {
   }

   public SAnimateBlockBreakPacket(int var1, BlockPos var2, int var3) {
      this.field24508 = var1;
      this.field24509 = var2;
      this.field24510 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24508 = var1.readVarInt();
      this.field24509 = var1.method35707();
      this.field24510 = var1.readUnsignedByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24508);
      var1.method35708(this.field24509);
      var1.writeByte(this.field24510);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleBlockBreakAnim(this);
   }

   public int method17369() {
      return this.field24508;
   }

   public BlockPos method17370() {
      return this.field24509;
   }

   public int method17371() {
      return this.field24510;
   }
}
