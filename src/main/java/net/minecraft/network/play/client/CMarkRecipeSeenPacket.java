package net.minecraft.network.play.client;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CMarkRecipeSeenPacket implements IPacket<IServerPlayNetHandler> {
    private ResourceLocation field_244320_a;

   public CMarkRecipeSeenPacket() {
   }

   public CMarkRecipeSeenPacket(IRecipe<?> var1) {
      this.field_244320_a = var1.getId();
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_244320_a = var1.readResourceLocation();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeResourceLocation(this.field_244320_a);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleRecipeBookUpdate(this);
   }

   public ResourceLocation func_244321_b() {
      return this.field_244320_a;
   }
}
