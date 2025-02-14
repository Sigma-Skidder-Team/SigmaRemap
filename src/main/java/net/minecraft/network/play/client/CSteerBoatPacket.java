package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CSteerBoatPacket implements IPacket<IServerPlayNetHandler> {
    private boolean left;
   private boolean right;

   public CSteerBoatPacket() {
   }

   public CSteerBoatPacket(boolean var1, boolean var2) {
      this.left = var1;
      this.right = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.left = var1.readBoolean();
      this.right = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.left);
      var1.writeBoolean(this.right);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processSteerBoat(this);
   }

   public boolean getLeft() {
      return this.left;
   }

   public boolean getRight() {
      return this.right;
   }
}
