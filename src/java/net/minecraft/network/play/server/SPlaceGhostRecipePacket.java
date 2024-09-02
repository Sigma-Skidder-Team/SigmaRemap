package net.minecraft.network.play.server;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SPlaceGhostRecipePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24796;
   private int field24797;
   private ResourceLocation field24798;

   public SPlaceGhostRecipePacket() {
   }

   public SPlaceGhostRecipePacket(int var1, IRecipe<?> var2) {
      this.field24797 = var1;
      this.field24798 = var2.getId();
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
      this.field24798 = var1.readResourceLocation();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24797);
      var1.writeResourceLocation(this.field24798);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handlePlaceGhostRecipe(this);
   }
}
