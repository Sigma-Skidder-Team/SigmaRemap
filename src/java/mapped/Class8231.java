package mapped;

import net.minecraft.util.ResourceLocation;

public class Class8231 implements Class8232 {
   private static String[] field35346;

   @Override
   public int method28653(String var1, int var2) {
      ResourceLocation var5 = new ResourceLocation(var1);
      Class6069 var6 = Class7849.method26307(var5);
      return var6 != null ? Registry.field16073.getId(var6) : var2;
   }
}
