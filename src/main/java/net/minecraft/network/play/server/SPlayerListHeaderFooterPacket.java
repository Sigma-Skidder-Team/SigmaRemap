package net.minecraft.network.play.server;

import java.io.IOException;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.text.ITextComponent;

public class SPlayerListHeaderFooterPacket implements IPacket<IClientPlayNetHandler> {
    private ITextComponent header;
   private ITextComponent footer;

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.header = var1.readTextComponent();
      this.footer = var1.readTextComponent();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeTextComponent(this.header);
      var1.writeTextComponent(this.footer);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handlePlayerListHeaderFooter(this);
   }

   public ITextComponent getHeader() {
      return this.header;
   }

   public ITextComponent getFooter() {
      return this.footer;
   }
}
