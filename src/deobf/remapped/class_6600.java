package remapped;

import java.util.Map;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6600 extends class_2875 {
   private static String[] field_34037;
   private static final Logger field_34036 = LogManager.getLogger();
   private int field_34035;
   private String field_34039;
   private final class_9332 field_34038 = class_9332.method_43089();

   public class_6600(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_6600(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20266, var1, var2, var3);
      this.method_18889(this.field_34038);
   }

   @Override
   public boolean method_13212(class_2522 var1) {
      return var1.method_8349(class_2351.field_11799);
   }

   @Override
   public boolean method_13210(class_704 var1, boolean var2) {
      return (var1.playerAbilities.isCreativeMode || var1.field_3840 >= this.field_34038.method_43085()) && this.field_34038.method_43085() > 0;
   }

   @Override
   public ItemStack method_13209(class_704 var1, ItemStack var2) {
      if (!var1.playerAbilities.isCreativeMode) {
         var1.method_3220(-this.field_34038.method_43085());
      }

      this.field_14085.method_31503(0, ItemStack.EMPTY);
      if (this.field_34035 <= 0) {
         this.field_14085.method_31503(1, ItemStack.EMPTY);
      } else {
         ItemStack var5 = this.field_14085.method_31498(1);
         if (!var5.method_28022() && var5.method_27997() > this.field_34035) {
            var5.method_27970(this.field_34035);
            this.field_14085.method_31503(1, var5);
         } else {
            this.field_14085.method_31503(1, ItemStack.EMPTY);
         }
      }

      this.field_34038.method_43087(0);
      this.field_14086.method_42533((var1x, var2x) -> {
         class_2522 var5x = var1x.method_28262(var2x);
         if (!var1.playerAbilities.isCreativeMode && var5x.method_8349(class_2351.field_11799) && var1.method_26594().nextFloat() < 0.12F) {
            class_2522 var6 = class_7372.method_33579(var5x);
            if (var6 != null) {
               var1x.method_7513(var2x, var6, 2);
               var1x.method_43364(1030, var2x, 0);
            } else {
               var1x.method_7508(var2x, false);
               var1x.method_43364(1029, var2x, 0);
            }
         } else {
            var1x.method_43364(1030, var2x, 0);
         }
      });
      return var2;
   }

   @Override
   public void method_13213() {
      ItemStack var3 = this.field_14085.method_31498(0);
      this.field_34038.method_43087(1);
      int var4 = 0;
      int var5 = 0;
      byte var6 = 0;
      if (var3.method_28022()) {
         this.field_14087.method_31503(0, ItemStack.EMPTY);
         this.field_34038.method_43087(0);
      } else {
         ItemStack var7 = var3.method_27973();
         ItemStack var8 = this.field_14085.method_31498(1);
         Map var9 = class_2931.method_13402(var7);
         var5 = var5 + var3.method_27969() + (var8.method_28022() ? 0 : var8.method_27969());
         this.field_34035 = 0;
         if (!var8.method_28022()) {
            boolean var10 = var8.method_27960() == class_4897.field_24879 && !class_7597.method_34501(var8).isEmpty();
            if (var7.method_27959() && var7.method_27960().method_11223(var3, var8)) {
               int var24 = Math.min(var7.method_28026(), var7.method_27957() / 4);
               if (var24 <= 0) {
                  this.field_14087.method_31503(0, ItemStack.EMPTY);
                  this.field_34038.method_43087(0);
                  return;
               }

               int var26;
               for (var26 = 0; var24 > 0 && var26 < var8.method_27997(); var26++) {
                  int var28 = var7.method_28026() - var24;
                  var7.method_27999(var28);
                  var4++;
                  var24 = Math.min(var7.method_28026(), var7.method_27957() / 4);
               }

               this.field_34035 = var26;
            } else {
               if (!var10 && (var7.method_27960() != var8.method_27960() || !var7.method_27959())) {
                  this.field_14087.method_31503(0, ItemStack.EMPTY);
                  this.field_34038.method_43087(0);
                  return;
               }

               if (var7.method_27959() && !var10) {
                  int var11 = var3.method_27957() - var3.method_28026();
                  int var12 = var8.method_27957() - var8.method_28026();
                  int var13 = var12 + var7.method_27957() * 12 / 100;
                  int var14 = var11 + var13;
                  int var15 = var7.method_27957() - var14;
                  if (var15 < 0) {
                     var15 = 0;
                  }

                  if (var15 < var7.method_28026()) {
                     var7.method_27999(var15);
                     var4 += 2;
                  }
               }

               Map var23 = class_2931.method_13402(var8);
               boolean var25 = false;
               boolean var27 = false;

               for (class_4382 var30 : var23.keySet()) {
                  if (var30 != null) {
                     int var16 = var9.getOrDefault(var30, 0);
                     int var17 = (Integer)var23.get(var30);
                     var17 = var16 == var17 ? var17 + 1 : Math.max(var17, var16);
                     boolean var18 = var30.method_20430(var3);
                     if (this.field_14088.playerAbilities.isCreativeMode || var3.method_27960() == class_4897.field_24879) {
                        var18 = true;
                     }

                     for (class_4382 var20 : var9.keySet()) {
                        if (var20 != var30 && !var30.method_20422(var20)) {
                           var18 = false;
                           var4++;
                        }
                     }

                     if (!var18) {
                        var27 = true;
                     } else {
                        var25 = true;
                        if (var17 > var30.method_20417()) {
                           var17 = var30.method_20417();
                        }

                        var9.put(var30, var17);
                        int var32 = 0;
                        switch (var30.method_20432()) {
                           case field_29756:
                              var32 = 1;
                              break;
                           case field_29752:
                              var32 = 2;
                              break;
                           case field_29754:
                              var32 = 4;
                              break;
                           case field_29753:
                              var32 = 8;
                        }

                        if (var10) {
                           var32 = Math.max(1, var32 / 2);
                        }

                        var4 += var32 * var17;
                        if (var3.method_27997() > 1) {
                           var4 = 40;
                        }
                     }
                  }
               }

               if (var27 && !var25) {
                  this.field_14087.method_31503(0, ItemStack.EMPTY);
                  this.field_34038.method_43087(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.field_34039)) {
            if (var3.method_28018()) {
               var6 = 1;
               var4 += var6;
               var7.method_27967();
            }
         } else if (!this.field_34039.equals(var3.method_28008().getString())) {
            var6 = 1;
            var4 += var6;
            var7.method_28032(new StringTextComponent(this.field_34039));
         }

         this.field_34038.method_43087(var5 + var4);
         if (var4 <= 0) {
            var7 = ItemStack.EMPTY;
         }

         if (var6 == var4 && var6 > 0 && this.field_34038.method_43085() >= 40) {
            this.field_34038.method_43087(39);
         }

         if (this.field_34038.method_43085() >= 40 && !this.field_14088.playerAbilities.isCreativeMode) {
            var7 = ItemStack.EMPTY;
         }

         if (!var7.method_28022()) {
            int var22 = var7.method_27969();
            if (!var8.method_28022() && var22 < var8.method_27969()) {
               var22 = var8.method_27969();
            }

            if (var6 != var4 || var6 == 0) {
               var22 = method_30383(var22);
            }

            var7.method_27986(var22);
            class_2931.method_13398(var9, var7);
         }

         this.field_14087.method_31503(0, var7);
         this.method_18877();
      }
   }

   public static int method_30383(int var0) {
      return var0 * 2 + 1;
   }

   public void method_30384(String var1) {
      this.field_34039 = var1;
      if (this.method_18878(2).method_35884()) {
         ItemStack var4 = this.method_18878(2).method_35898();
         if (!StringUtils.isBlank(var1)) {
            var4.method_28032(new StringTextComponent(this.field_34039));
         } else {
            var4.method_27967();
         }
      }

      this.method_13213();
   }

   public int method_30385() {
      return this.field_34038.method_43085();
   }
}
