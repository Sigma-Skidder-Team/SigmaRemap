package net.minecraft.network.play.client;

import mapped.Class92;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateJigsawBlockPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24607;
   private BlockPos field24608;
   private ResourceLocation field24609;
   private ResourceLocation field24610;
   private ResourceLocation field24611;
   private String field24612;
   private Class92 field24613;

   public CUpdateJigsawBlockPacket() {
   }

   public CUpdateJigsawBlockPacket(BlockPos var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4, String var5, Class92 var6) {
      this.field24608 = var1;
      this.field24609 = var2;
      this.field24610 = var3;
      this.field24611 = var4;
      this.field24612 = var5;
      this.field24613 = var6;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24608 = var1.method35707();
      this.field24609 = var1.readResourceLocation();
      this.field24610 = var1.readResourceLocation();
      this.field24611 = var1.readResourceLocation();
      this.field24612 = var1.readString(32767);
      this.field24613 = Class92.method269(var1.readString(32767)).orElse(Class92.field238);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24608);
      var1.writeResourceLocation(this.field24609);
      var1.writeResourceLocation(this.field24610);
      var1.writeResourceLocation(this.field24611);
      var1.writeString(this.field24612);
      var1.writeString(this.field24613.method257());
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_217262_a(this);
   }

   public BlockPos method17426() {
      return this.field24608;
   }

   public ResourceLocation method17427() {
      return this.field24609;
   }

   public ResourceLocation method17428() {
      return this.field24610;
   }

   public ResourceLocation method17429() {
      return this.field24611;
   }

   public String method17430() {
      return this.field24612;
   }

   public Class92 method17431() {
      return this.field24613;
   }
}
