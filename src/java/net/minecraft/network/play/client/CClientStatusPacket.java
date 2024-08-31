package net.minecraft.network.play.client;

import mapped.CClientStatusPacketState;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CClientStatusPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24690;
   private CClientStatusPacketState field24691;

   public CClientStatusPacket() {
   }

   public CClientStatusPacket(CClientStatusPacketState var1) {
      this.field24691 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24691 = var1.<CClientStatusPacketState>method35712(CClientStatusPacketState.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24691);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processClientStatus(this);
   }

   public CClientStatusPacketState getStatus() {
      return this.field24691;
   }
}
