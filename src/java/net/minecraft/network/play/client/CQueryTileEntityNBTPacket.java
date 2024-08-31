package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CQueryTileEntityNBTPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24356;
   private int field24357;
   private BlockPos field24358;

   public CQueryTileEntityNBTPacket() {
   }

   public CQueryTileEntityNBTPacket(int var1, BlockPos var2) {
      this.field24357 = var1;
      this.field24358 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24357 = var1.readVarInt();
      this.field24358 = var1.method35707();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24357);
      var1.method35708(this.field24358);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processNBTQueryBlockEntity(this);
   }

   public int method17254() {
      return this.field24357;
   }

   public BlockPos method17255() {
      return this.field24358;
   }
}