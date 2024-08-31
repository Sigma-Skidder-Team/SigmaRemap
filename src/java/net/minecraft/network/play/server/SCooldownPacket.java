package net.minecraft.network.play.server;

import mapped.Item;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SCooldownPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24721;
   private Item field24722;
   private int field24723;

   public SCooldownPacket() {
   }

   public SCooldownPacket(Item var1, int var2) {
      this.field24722 = var1;
      this.field24723 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24722 = Item.method11702(var1.readVarInt());
      this.field24723 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Item.method11701(this.field24722));
      var1.writeVarInt(this.field24723);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleCooldown(this);
   }

   public Item method17506() {
      return this.field24722;
   }

   public int method17507() {
      return this.field24723;
   }
}
