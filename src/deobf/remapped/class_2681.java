package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2681 extends Screen {
   private final class_6730 field_13149;
   private long field_13150 = -1L;
   private static final Object2IntMap<class_7335> field_13148 = Util.<Object2IntMap<class_7335>>make(new Object2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(class_7335.field_37504, 5526612);
      var0.put(class_7335.field_37491, 10066329);
      var0.put(class_7335.field_37493, 6250897);
      var0.put(class_7335.field_37496, 8434258);
      var0.put(class_7335.field_37515, 13750737);
      var0.put(class_7335.field_37494, 7497737);
      var0.put(class_7335.field_37498, 7169628);
      var0.put(class_7335.field_37492, 3159410);
      var0.put(class_7335.field_37499, 2213376);
      var0.put(class_7335.field_37512, 13421772);
      var0.put(class_7335.field_37510, 15884384);
      var0.put(class_7335.field_37502, 15658734);
      var0.put(class_7335.field_37514, 16777215);
   });

   public class_2681(class_6730 var1) {
      super(NarratorChatListener.field_38486);
      this.field_13149 = var1;
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_1162() {
      NarratorChatListener.INSTANCE.method_34341(new TranslationTextComponent("narrator.loading.done").getString());
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      String var7 = MathHelper.clamp(this.field_13149.method_30869(), 0, 100) + "%";
      long var8 = Util.getMeasuringTimeMs();
      if (var8 - this.field_13150 > 2000L) {
         this.field_13150 = var8;
         NarratorChatListener.INSTANCE.method_34341(new TranslationTextComponent("narrator.loading", var7).getString());
      }

      int var10 = this.field_941 / 2;
      int var11 = this.field_940 / 2;
      byte var12 = 30;
      method_12059(var1, this.field_13149, var10, var11 + 30, 2, 0);
      method_9787(var1, this.field_948, var7, var10, var11 - 4 - 30, 16777215);
   }

   public static void method_12059(class_7966 var0, class_6730 var1, int var2, int var3, int var4, int var5) {
      int var8 = var4 + var5;
      int var9 = var1.method_30868();
      int var10 = var9 * var8 - var5;
      int var11 = var1.method_30873();
      int var12 = var11 * var8 - var5;
      int var13 = var2 - var12 / 2;
      int var14 = var3 - var12 / 2;
      int var15 = var10 / 2 + 1;
      if (var5 != 0) {
         method_9774(var0, var2 - var15, var3 - var15, var2 - var15 + 1, var3 + var15, -16772609);
         method_9774(var0, var2 + var15 - 1, var3 - var15, var2 + var15, var3 + var15, -16772609);
         method_9774(var0, var2 - var15, var3 - var15, var2 + var15, var3 - var15 + 1, -16772609);
         method_9774(var0, var2 - var15, var3 + var15 - 1, var2 + var15, var3 + var15, -16772609);
      }

      for (int var17 = 0; var17 < var11; var17++) {
         for (int var18 = 0; var18 < var11; var18++) {
            class_7335 var19 = var1.method_30871(var17, var18);
            int var20 = var13 + var17 * var8;
            int var21 = var14 + var18 * var8;
            method_9774(var0, var20, var21, var20 + var4, var21 + var4, field_13148.getInt(var19) | 0xFF000000);
         }
      }
   }
}
