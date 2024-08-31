package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SMountEntityPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24814;
   private int field24815;
   private int field24816;

   public SMountEntityPacket() {
   }

   public SMountEntityPacket(Entity var1, Entity var2) {
      this.field24815 = var1.method3205();
      this.field24816 = var2 == null ? 0 : var2.method3205();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24815 = var1.readInt();
      this.field24816 = var1.readInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24815);
      var1.writeInt(this.field24816);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleEntityAttach(this);
   }

   public int method17577() {
      return this.field24815;
   }

   public int method17578() {
      return this.field24816;
   }
}
