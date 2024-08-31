package net.minecraft.network.play.client;

import mapped.Class2066;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CResourcePackStatusPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24666;
   private Class2066 field24667;

   public CResourcePackStatusPacket() {
   }

   public CResourcePackStatusPacket(Class2066 var1) {
      this.field24667 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24667 = var1.<Class2066>method35712(Class2066.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24667);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleResourcePackStatus(this);
   }
}
