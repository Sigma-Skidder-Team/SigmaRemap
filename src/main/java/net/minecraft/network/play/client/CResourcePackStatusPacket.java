package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CResourcePackStatusPacket implements IPacket<IServerPlayNetHandler> {
    private Action action;

   public CResourcePackStatusPacket() {
   }

   public CResourcePackStatusPacket(Action var1) {
      this.action = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.action = var1.readEnumValue(Action.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.action);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleResourcePackStatus(this);
   }

   public enum Action {
      SUCCESSFULLY_LOADED,
      DECLINED,
      FAILED_DOWNLOAD,
      ACCEPTED;
   }
}
