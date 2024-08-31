package net.minecraft.network.play.server;

import java.io.IOException;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;

public class SDisconnectPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24532;
   private ITextComponent field24533;

   public SDisconnectPacket() {
   }

   public SDisconnectPacket(ITextComponent var1) {
      this.field24533 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24533 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24533);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleDisconnect(this);
   }

   public ITextComponent method17390() {
      return this.field24533;
   }
}
