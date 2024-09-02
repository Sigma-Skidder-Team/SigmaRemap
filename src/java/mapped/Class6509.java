package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public class Class6509 implements Class6504<Class4846> {
   public Class4846 method19700(ResourceLocation var1, JsonObject var2) {
      Class120 var5 = Class120.method344(JSONUtils.method32782(var2, "base"));
      Class120 var6 = Class120.method344(JSONUtils.method32782(var2, "addition"));
      ItemStack var7 = Class4852.method14987(JSONUtils.method32782(var2, "result"));
      return new Class4846(var1, var5, var6, var7);
   }

   public Class4846 method19699(ResourceLocation var1, PacketBuffer var2) {
      Class120 var5 = Class120.method343(var2);
      Class120 var6 = Class120.method343(var2);
      ItemStack var7 = var2.readItemStack();
      return new Class4846(var1, var5, var6, var7);
   }

   public void method19698(PacketBuffer var1, Class4846 var2) {
      Class4846.method14973(var2).method335(var1);
      Class4846.method14974(var2).method335(var1);
      var1.writeItemStack(Class4846.method14975(var2));
   }
}
