package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateSignPacket implements Packet<IServerPlayNetHandler> {
    private BlockPos pos;
   private String[] lines;

   public CUpdateSignPacket() {
   }

   public CUpdateSignPacket(BlockPos var1, String var2, String var3, String var4, String var5) {
      this.pos = var1;
      this.lines = new String[]{var2, var3, var4, var5};
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.pos = buf.readBlockPos();
      this.lines = new String[4];

      for (int i = 0; i < 4; ++i)
      {
         this.lines[i] = buf.readString(384);
      }
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeBlockPos(this.pos);

      for (int i = 0; i < 4; ++i)
      {
         buf.writeString(this.lines[i]);
      }
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateSign(this);
   }

   public BlockPos getPosition() {
      return this.pos;
   }

   public String[] getLines() {
      return this.lines;
   }
}
