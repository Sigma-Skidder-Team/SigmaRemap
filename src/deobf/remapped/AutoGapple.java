package remapped;

import java.util.List;

public class AutoGapple extends SecondModule {
   public AutoGapple() {
      super(Category.ITEM, "AutoGapple", "Automatically eat golden apples", new BasicAutoGapple(), new HypixelAutoGapple());
      this.addSetting(new FloatSetting<Float>("Health", "Maximum health before eating gapple.", 7.0F, Float.class, 0.5F, 10.0F, 0.5F));
   }

   public int method_29349(boolean var1) {
      for (int var4 = 36; var4 < 45; var4++) {
         if (client.thePlayer.field_3869.method_18878(var4).method_35884()) {
            ItemStack var5 = client.thePlayer.field_3869.method_18878(var4).method_35898();
            if (var5 != null) {
               if (!var1) {
                  if (var5.method_27960() == class_4897.field_25037 || var5.method_27960() == class_4897.field_24966) {
                     return var4 - 36;
                  }
               } else {
                  List var6 = class_2740.method_12313(var5);
                  if (var6 != null) {
                     for (class_2250 var8 : var6) {
                        if (var8.method_10339() == Effects.field_19745) {
                           return var4 - 36;
                        }
                     }
                  }
               }
            }
         }
      }

      for (int var9 = 9; var9 < 36; var9++) {
         if (client.thePlayer.field_3869.method_18878(var9).method_35884()) {
            ItemStack var10 = client.thePlayer.field_3869.method_18878(var9).method_35898();
            if (!var1) {
               if (var10.method_27960() == class_4897.field_25037 || var10.method_27960() == class_4897.field_24966) {
                  class_2740.method_12312(var9, 4);
                  return -1;
               }
            } else {
               List var11 = class_2740.method_12313(var10);
               if (var11 != null) {
                  for (class_2250 var13 : var11) {
                     if (var13.method_10339() == Effects.field_19745) {
                        class_2740.method_12312(var9, 4);
                        return -1;
                     }
                  }
               }
            }
         }
      }

      return -1;
   }
}