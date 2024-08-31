package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import mapped.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CEditBookPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24648;
   private ItemStack field24649;
   private boolean field24650;
   private int field24651;

   public CEditBookPacket() {
   }

   public CEditBookPacket(ItemStack var1, boolean var2, int var3) {
      this.field24649 = var1.copy();
      this.field24650 = var2;
      this.field24651 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24649 = var1.method35726();
      this.field24650 = var1.readBoolean();
      this.field24651 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35724(this.field24649);
      var1.writeBoolean(this.field24650);
      var1.writeVarInt(this.field24651);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processEditBook(this);
   }

   public ItemStack method17465() {
      return this.field24649;
   }

   public boolean method17466() {
      return this.field24650;
   }

   public int method17467() {
      return this.field24651;
   }
}
