package net.minecraft.network.play.client;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CPlaceRecipePacket implements Packet<IServerPlayNetHandler> {
   private int windowId;
   private ResourceLocation recipeId;
   private boolean placeAll;

   public CPlaceRecipePacket() {
   }

   public CPlaceRecipePacket(int var1, IRecipe<?> var2, boolean var3) {
      this.windowId = var1;
      this.recipeId = var2.getId();
      this.placeAll = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
      this.recipeId = var1.readResourceLocation();
      this.placeAll = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
      var1.writeResourceLocation(this.recipeId);
      var1.writeBoolean(this.placeAll);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPlaceRecipe(this);
   }

   public int getWindowId() {
      return this.windowId;
   }

   public ResourceLocation getRecipeId() {
      return this.recipeId;
   }

   public boolean shouldPlaceAll() {
      return this.placeAll;
   }
}
