package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1328 extends Screen {
   private final Class7245 field7026;
   private long field7027 = -1L;
   private static final Object2IntMap<Class9176> field7028 = Util.<Object2IntMap<Class9176>>method38508(new Object2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(Class9176.field42133, 5526612);
      var0.put(Class9176.field42134, 10066329);
      var0.put(Class9176.field42135, 6250897);
      var0.put(Class9176.field42136, 8434258);
      var0.put(Class9176.field42137, 13750737);
      var0.put(Class9176.field42138, 7497737);
      var0.put(Class9176.field42139, 7169628);
      var0.put(Class9176.field42140, 3159410);
      var0.put(Class9176.field42141, 2213376);
      var0.put(Class9176.field42142, 13421772);
      var0.put(Class9176.field42143, 15884384);
      var0.put(Class9176.field42144, 15658734);
      var0.put(Class9176.field42145, 16777215);
   });

   public Class1328(Class7245 var1) {
      super(NarratorChatListener.field29300);
      this.field7026 = var1;
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void onClose() {
      NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.loading.done").getString());
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      String var7 = MathHelper.method37775(this.field7026.method22745(), 0, 100) + "%";
      long var8 = Util.milliTime();
      if (var8 - this.field7027 > 2000L) {
         this.field7027 = var8;
         NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.loading", var7).getString());
      }

      int var10 = this.field4564 / 2;
      int var11 = this.field4565 / 2;
      byte var12 = 30;
      method6319(var1, this.field7026, var10, var11 + 30, 2, 0);
      method5690(var1, this.field4568, var7, var10, var11 - 4 - 30, 16777215);
   }

   public static void method6319(MatrixStack var0, Class7245 var1, int var2, int var3, int var4, int var5) {
      int var8 = var4 + var5;
      int var9 = var1.method22743();
      int var10 = var9 * var8 - var5;
      int var11 = var1.method22744();
      int var12 = var11 * var8 - var5;
      int var13 = var2 - var12 / 2;
      int var14 = var3 - var12 / 2;
      int var15 = var10 / 2 + 1;
      if (var5 != 0) {
         method5686(var0, var2 - var15, var3 - var15, var2 - var15 + 1, var3 + var15, -16772609);
         method5686(var0, var2 + var15 - 1, var3 - var15, var2 + var15, var3 + var15, -16772609);
         method5686(var0, var2 - var15, var3 - var15, var2 + var15, var3 - var15 + 1, -16772609);
         method5686(var0, var2 - var15, var3 + var15 - 1, var2 + var15, var3 + var15, -16772609);
      }

      for (int var17 = 0; var17 < var11; var17++) {
         for (int var18 = 0; var18 < var11; var18++) {
            Class9176 var19 = var1.method22746(var17, var18);
            int var20 = var13 + var17 * var8;
            int var21 = var14 + var18 * var8;
            method5686(var0, var20, var21, var20 + var4, var21 + var4, field7028.getInt(var19) | 0xFF000000);
         }
      }
   }
}
