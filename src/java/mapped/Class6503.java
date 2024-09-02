package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public class Class6503<T extends Class4847> implements Class6504<T> {
   private final int field28468;
   private final Class8806<T> field28469;

   public Class6503(Class8806<T> var1, int var2) {
      this.field28468 = var2;
      this.field28469 = var1;
   }

   public T method19700(ResourceLocation var1, JsonObject var2) {
      String var5 = JSONUtils.method32764(var2, "group", "");
      Object var6 = !JSONUtils.method32759(var2, "ingredient") ? JSONUtils.method32782(var2, "ingredient") : JSONUtils.method32785(var2, "ingredient");
      Class120 var7 = Class120.method344((JsonElement)var6);
      String var8 = JSONUtils.method32763(var2, "result");
      ResourceLocation var9 = new ResourceLocation(var8);
      ItemStack var10 = new ItemStack(Registry.ITEM.method9187(var9).orElseThrow(() -> new IllegalStateException("Item: " + var8 + " does not exist")));
      float var11 = JSONUtils.method32772(var2, "experience", 0.0F);
      int var12 = JSONUtils.getInt(var2, "cookingtime", this.field28468);
      return this.field28469.method31802(var1, var5, var7, var10, var11, var12);
   }

   @Override
   public T method19699(ResourceLocation var1, PacketBuffer var2) {
      String var5 = var2.readString(32767);
      Class120 var6 = Class120.method343(var2);
      ItemStack var7 = var2.readItemStack();
      float var8 = var2.readFloat();
      int var9 = var2.readVarInt();
      return this.field28469.method31802(var1, var5, var6, var7, var8, var9);
   }

   public void method19698(PacketBuffer var1, T var2) {
      var1.writeString(var2.field22632);
      var2.field22633.method335(var1);
      var1.writeItemStack(var2.field22634);
      var1.writeFloat(var2.field22635);
      var1.writeVarInt(var2.field22636);
   }
}
