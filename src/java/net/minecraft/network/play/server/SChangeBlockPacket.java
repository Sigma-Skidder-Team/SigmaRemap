package net.minecraft.network.play.server;

import mapped.Block;
import mapped.Class1665;
import net.minecraft.network.PacketBuffer;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SChangeBlockPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24886;
   private BlockPos field24887;
   private BlockState field24888;

   public SChangeBlockPacket() {
   }

   public SChangeBlockPacket(BlockPos var1, BlockState var2) {
      this.field24887 = var1;
      this.field24888 = var2;
   }

   public SChangeBlockPacket(Class1665 var1, BlockPos var2) {
      this(var2, var1.getBlockState(var2));
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24887 = var1.readBlockPos();
      this.field24888 = Block.field18610.method9172(var1.readVarInt());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.field24887);
      var1.writeVarInt(Block.getStateId(this.field24888));
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleBlockChange(this);
   }

   public BlockState method17631() {
      return this.field24888;
   }

   public BlockPos method17632() {
      return this.field24887;
   }
}
