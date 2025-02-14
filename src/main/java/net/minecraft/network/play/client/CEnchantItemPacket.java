package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CEnchantItemPacket implements IPacket<IServerPlayNetHandler> {
    private int windowId;
   private int button;

   public CEnchantItemPacket() {
   }

   public CEnchantItemPacket(int var1, int var2) {
      this.windowId = var1;
      this.button = var2;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processEnchantItem(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
      this.button = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
      var1.writeByte(this.button);
   }

   public int getWindowId() {
      return this.windowId;
   }

   public int getButton() {
      return this.button;
   }
}
