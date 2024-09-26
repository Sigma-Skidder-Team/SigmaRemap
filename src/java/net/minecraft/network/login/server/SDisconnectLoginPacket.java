package net.minecraft.network.login.server;

import java.io.IOException;

import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class SDisconnectLoginPacket implements IPacket<IClientLoginNetHandler> {
    private ITextComponent reason;

   public SDisconnectLoginPacket() {
   }

   public SDisconnectLoginPacket(ITextComponent var1) {
      this.reason = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.reason = ITextComponent$Serializer.getComponentFromJsonLenient(var1.readString(262144));
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeTextComponent(this.reason);
   }

   public void processPacket(IClientLoginNetHandler var1) {
      var1.handleDisconnect(this);
   }

   public ITextComponent getReason() {
      return this.reason;
   }
}
