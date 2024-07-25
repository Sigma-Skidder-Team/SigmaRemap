package remapped;

public class class_3997 extends class_2451 {
   private static String[] field_19415;
   private final class_2340 field_19414;

   public class_3997(class_2340 var1, class_317 var2) {
      super(var2);
      this.field_19414 = var1;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      ItemStack var6 = var2.method_26617(var3);
      class_9529 var7 = method_11238(var1, var2, this.field_19414 != class_8532.field_43673 ? class_9583.field_48747 : class_9583.field_48749);
      if (var7.method_33990() != class_1430.field_7721) {
         if (var7.method_33990() != class_1430.field_7717) {
            return class_954.<ItemStack>method_4207(var6);
         } else {
            class_9529 var8 = var7;
            class_1331 var9 = var8.method_43955();
            Direction var10 = var8.method_43956();
            class_1331 var11 = var9.method_6098(var10);
            if (!var1.method_29538(var2, var9) || !var2.method_3208(var11, var10, var6)) {
               return class_954.<ItemStack>method_4202(var6);
            } else if (this.field_19414 == class_8532.field_43673) {
               class_2522 var15 = var1.method_28262(var9);
               if (var15.method_8360() instanceof class_5978) {
                  class_2340 var16 = ((class_5978)var15.method_8360()).method_27280(var1, var9, var15);
                  if (var16 != class_8532.field_43673) {
                     var2.method_3211(class_6234.field_31907.method_43790(this));
                     var2.method_37155(!var16.method_10724(class_6503.field_33095) ? class_463.field_2142 : class_463.field_2434, 1.0F, 1.0F);
                     ItemStack var14 = class_4754.method_21940(var6, var2, new ItemStack(var16.method_10721()));
                     if (!var1.field_33055) {
                        class_8807.field_45082.method_44414((class_9359)var2, new ItemStack(var16.method_10721()));
                     }

                     return class_954.<ItemStack>method_4208(var14, var1.method_22567());
                  }
               }

               return class_954.<ItemStack>method_4202(var6);
            } else {
               class_2522 var12 = var1.method_28262(var9);
               class_1331 var13 = var12.method_8360() instanceof class_4582 && this.field_19414 == class_8532.field_43674 ? var9 : var11;
               if (!this.method_18424(var2, var1, var13, var8)) {
                  return class_954.<ItemStack>method_4202(var6);
               } else {
                  this.method_18422(var1, var6, var13);
                  if (var2 instanceof class_9359) {
                     class_8807.field_45052.method_10661((class_9359)var2, var13, var6);
                  }

                  var2.method_3211(class_6234.field_31907.method_43790(this));
                  return class_954.<ItemStack>method_4208(this.method_18423(var6, var2), var1.method_22567());
               }
            }
         }
      } else {
         return class_954.<ItemStack>method_4207(var6);
      }
   }

   public ItemStack method_18423(ItemStack var1, class_704 var2) {
      return var2.field_3876.isCreativeMode ? var1 : new ItemStack(class_4897.field_24548);
   }

   public void method_18422(World var1, ItemStack var2, class_1331 var3) {
   }

   public boolean method_18424(class_704 var1, World var2, class_1331 var3, class_9529 var4) {
      if (!(this.field_19414 instanceof class_3798)) {
         return false;
      } else {
         class_2522 var7 = var2.method_28262(var3);
         class_6414 var8 = var7.method_8360();
         class_5371 var9 = var7.method_8362();
         boolean var10 = var7.method_8375(this.field_19414);
         boolean var11 = var7.method_8345() || var10 || var8 instanceof class_4582 && ((class_4582)var8).method_21238(var2, var3, var7, this.field_19414);
         if (var11) {
            if (var2.method_22572().method_40242() && this.field_19414.method_10724(class_6503.field_33094)) {
               int var12 = var3.method_12173();
               int var13 = var3.method_12165();
               int var14 = var3.method_12185();
               var2.method_43359(
                  var1, var3, class_463.field_2472, class_562.field_3322, 0.5F, 2.6F + (var2.field_33033.nextFloat() - var2.field_33033.nextFloat()) * 0.8F
               );

               for (int var15 = 0; var15 < 8; var15++) {
                  var2.method_43361(
                     class_3090.field_15319, (double)var12 + Math.random(), (double)var13 + Math.random(), (double)var14 + Math.random(), 0.0, 0.0, 0.0
                  );
               }

               return true;
            } else if (var8 instanceof class_4582 && this.field_19414 == class_8532.field_43674) {
               ((class_4582)var8).method_21237(var2, var3, var7, ((class_3798)this.field_19414).method_17649(false));
               this.method_18425(var1, var2, var3);
               return true;
            } else {
               if (!var2.field_33055 && var10 && !var9.method_24494()) {
                  var2.method_7510(var3, true);
               }

               if (!var2.method_7513(var3, this.field_19414.method_10710().method_22006(), 11) && !var7.method_8364().method_21993()) {
                  return false;
               } else {
                  this.method_18425(var1, var2, var3);
                  return true;
               }
            }
         } else {
            return var4 != null && this.method_18424(var1, var2, var4.method_43955().method_6098(var4.method_43956()), (class_9529)null);
         }
      }
   }

   public void method_18425(class_704 var1, class_9379 var2, class_1331 var3) {
      class_8461 var6 = !this.field_19414.method_10724(class_6503.field_33095) ? class_463.field_2168 : class_463.field_2089;
      var2.method_43359(var1, var3, var6, class_562.field_3322, 1.0F, 1.0F);
   }
}
