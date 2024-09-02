package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CQueryTileEntityNBTPacket implements Packet<IServerPlayNetHandler> {
    private int transactionId;
   private BlockPos pos;

   public CQueryTileEntityNBTPacket() {
   }

   public CQueryTileEntityNBTPacket(int var1, BlockPos var2) {
      this.transactionId = var1;
      this.pos = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.transactionId = var1.readVarInt();
      this.pos = var1.readBlockPos();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.transactionId);
      var1.writeBlockPos(this.pos);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processNBTQueryBlockEntity(this);
   }

   public int getTransactionID() {
      return this.transactionId;
   }

   public BlockPos getPosition() {
      return this.pos;
   }
}
