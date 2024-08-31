package net.minecraft.network.play.server;

import mapped.Class4843;
import net.minecraft.network.PacketBuffer;
import mapped.ResourceLocation;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SPlaceGhostRecipePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24796;
   private int field24797;
   private ResourceLocation field24798;

   public SPlaceGhostRecipePacket() {
   }

   public SPlaceGhostRecipePacket(int var1, Class4843<?> var2) {
      this.field24797 = var1;
      this.field24798 = var2.method14964();
   }

   public ResourceLocation method17563() {
      return this.field24798;
   }

   public int method17564() {
      return this.field24797;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24797 = var1.readByte();
      this.field24798 = var1.method35731();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24797);
      var1.method35732(this.field24798);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handlePlaceGhostRecipe(this);
   }
}
