package net.minecraft.network.play.client;

import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CUpdateRecipeBookStatusPacket implements IPacket<IServerPlayNetHandler> {
    private RecipeBookCategory field_244314_a;
   private boolean field_244315_b;
   private boolean field_244316_c;

   public CUpdateRecipeBookStatusPacket() {
   }

   public CUpdateRecipeBookStatusPacket(RecipeBookCategory var1, boolean var2, boolean var3) {
      this.field_244314_a = var1;
      this.field_244315_b = var2;
      this.field_244316_c = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_244314_a = var1.<RecipeBookCategory>readEnumValue(RecipeBookCategory.class);
      this.field_244315_b = var1.readBoolean();
      this.field_244316_c = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.field_244314_a);
      var1.writeBoolean(this.field_244315_b);
      var1.writeBoolean(this.field_244316_c);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_241831_a(this);
   }

   public RecipeBookCategory func_244317_b() {
      return this.field_244314_a;
   }

   public boolean func_244318_c() {
      return this.field_244315_b;
   }

   public boolean func_244319_d() {
      return this.field_244316_c;
   }
}
