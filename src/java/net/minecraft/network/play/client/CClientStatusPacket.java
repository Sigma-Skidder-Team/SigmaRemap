package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CClientStatusPacket implements IPacket<IServerPlayNetHandler> {
   private static String[] field24690;
   private State field24691;

   public CClientStatusPacket() {
   }

   public CClientStatusPacket(State var1) {
      this.field24691 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24691 = var1.<State>readEnumValue(State.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.field24691);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processClientStatus(this);
   }

   public State getStatus() {
      return this.field24691;
   }

   public enum State {
      field14277,
      field14278,
      OPEN_INVENTORY;
   }
}
