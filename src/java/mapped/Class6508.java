package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class Class6508<T extends Class4844> implements Class6504<T> {
   public final Class5644<T> field28493;

   public Class6508(Class5644<T> var1) {
      this.field28493 = var1;
   }

   public T method19700(ResourceLocation var1, JsonObject var2) {
      String var5 = JSONUtils.method32764(var2, "group", "");
      Class120 var6;
      if (!JSONUtils.method32759(var2, "ingredient")) {
         var6 = Class120.method344(JSONUtils.method32782(var2, "ingredient"));
      } else {
         var6 = Class120.method344(JSONUtils.method32785(var2, "ingredient"));
      }

      String var7 = JSONUtils.getString(var2, "result");
      int var8 = JSONUtils.method32777(var2, "count");
      ItemStack var9 = new ItemStack(Registry.ITEM.getOrDefault(new ResourceLocation(var7)), var8);
      return this.field28493.method17789(var1, var5, var6, var9);
   }

   public T method19699(ResourceLocation var1, PacketBuffer var2) {
      String var5 = var2.readString(32767);
      Class120 var6 = Class120.method343(var2);
      ItemStack var7 = var2.readItemStack();
      return this.field28493.method17789(var1, var5, var6, var7);
   }

   public void method19698(PacketBuffer var1, T var2) {
      var1.writeString(var2.field22623);
      var2.field22618.method335(var1);
      var1.writeItemStack(var2.field22619);
   }
}
