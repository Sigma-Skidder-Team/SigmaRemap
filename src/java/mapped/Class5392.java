package mapped;

import java.util.Random;

public class Class5392 implements Class5391 {
   private static String[] field24031;
   private final ItemStack field24032;
   private final int field24033;
   private final int field24034;
   private final int field24035;
   private final float field24036;

   public Class5392(Class3257 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0.05F);
   }

   public Class5392(Class3257 var1, int var2, int var3, int var4, float var5) {
      this.field24032 = new ItemStack(var1);
      this.field24033 = var2;
      this.field24034 = var3;
      this.field24035 = var4;
      this.field24036 = var5;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      int var5 = 5 + var2.nextInt(15);
      ItemStack var6 = Class7858.method26342(var2, new ItemStack(this.field24032.method32107()), var5, false);
      int var7 = Math.min(this.field24033 + var5, 64);
      ItemStack var8 = new ItemStack(Class8514.field38049, var7);
      return new Class9346(var8, var6, this.field24034, this.field24035, this.field24036);
   }
}