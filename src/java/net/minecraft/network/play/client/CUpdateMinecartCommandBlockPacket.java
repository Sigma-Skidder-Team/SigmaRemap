package net.minecraft.network.play.client;

import mapped.Class911;
import mapped.Class918;
import mapped.IServerPlayNetHandler;
import mapped.World;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import javax.annotation.Nullable;

public class CUpdateMinecartCommandBlockPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24528;
   private int field24529;
   private String field24530;
   private boolean field24531;

   public CUpdateMinecartCommandBlockPacket() {
   }

   public CUpdateMinecartCommandBlockPacket(int var1, String var2, boolean var3) {
      this.field24529 = var1;
      this.field24530 = var2;
      this.field24531 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24529 = var1.readVarInt();
      this.field24530 = var1.readString(32767);
      this.field24531 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24529);
      var1.writeString(this.field24530);
      var1.writeBoolean(this.field24531);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateCommandMinecart(this);
   }

   @Nullable
   public Class911 method17387(World var1) {
      Entity var4 = var1.getEntityByID(this.field24529);
      return !(var4 instanceof Class918) ? null : ((Class918)var4).method3614();
   }

   public String method17388() {
      return this.field24530;
   }

   public boolean method17389() {
      return this.field24531;
   }
}