package remapped;

public class class_9871<T extends class_704> extends class_4171<T, class_3169<T>> {
   private final class_151 field_49923 = new class_151();

   public class_9871(class_2514<T, class_3169<T>> var1) {
      super(var1);
   }

   public void method_45495(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.method_45494(var1, var2, var3, (T)var4, var5, var6, var9, var10, true);
      this.method_45494(var1, var2, var3, (T)var4, var5, var6, var9, var10, false);
   }

   private void method_45494(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, boolean var9) {
      CompoundNBT var12 = !var9 ? var4.method_3171() : var4.method_3160();
      class_6629.method_30460(var12.method_25965("id")).filter(var0 -> var0 == class_6629.field_34228).ifPresent(var11 -> {
         Entity var14 = Config.method_14387().field_21016;
         if (var4 instanceof class_9716) {
            class_9716 var15 = (class_9716)var4;
            class_7819 var16 = !var9 ? var15.field_49395 : var15.field_49383;
            if (var16 != null) {
               Config.method_14387().field_21016 = var16;
               if (Config.method_14424()) {
                  class_6588.method_30181(var16);
               }
            }
         }

         var1.method_36063();
         var1.method_36065(!var9 ? -0.4F : 0.4F, !var4.method_37382() ? -1.5 : -1.3F, 0.0);
         class_7907 var17 = var2.method_11645(this.field_49923.method_45498(class_1677.field_8682[var12.method_25947("Variant")]));
         this.field_49923.method_604(var1, var17, var3, class_5367.field_27381, var5, var6, var7, var8, var4.field_41697);
         var1.method_36064();
         Config.method_14387().field_21016 = var14;
         if (Config.method_14424()) {
            class_6588.method_30181(var14);
         }
      });
   }
}
