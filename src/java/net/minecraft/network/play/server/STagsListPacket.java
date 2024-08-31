package net.minecraft.network.play.server;

import mapped.Class8933;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class STagsListPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24905;
   private Class8933 field24906;

   public STagsListPacket() {
   }

   public STagsListPacket(Class8933 var1) {
      this.field24906 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24906 = Class8933.method32663(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      this.field24906.method32662(var1);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleTags(this);
   }

   public Class8933 method17639() {
      return this.field24906;
   }
}
