package net.minecraft.network.play.server;

import java.io.IOException;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;

public class SPlayerListHeaderFooterPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24534;
   private ITextComponent field24535;
   private ITextComponent field24536;

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24535 = var1.method35710();
      this.field24536 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24535);
      var1.method35711(this.field24536);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handlePlayerListHeaderFooter(this);
   }

   public ITextComponent method17391() {
      return this.field24535;
   }

   public ITextComponent method17392() {
      return this.field24536;
   }
}
