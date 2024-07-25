package remapped;

import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_3549 implements class_1517 {
   private static String[] field_17369;
   private final Random field_17366 = new Random();
   private final class_7203 field_17365;
   private int field_17370;
   private int field_17367;
   private int field_17368;

   public class_3549(class_7203 var1) {
      this.field_17365 = var1;
      this.field_17370 = 1200;
      this.field_17367 = var1.method_32968();
      this.field_17368 = var1.method_32982();
      if (this.field_17367 == 0 && this.field_17368 == 0) {
         this.field_17367 = 24000;
         var1.method_32976(this.field_17367);
         this.field_17368 = 25;
         var1.method_32970(this.field_17368);
      }
   }

   @Override
   public int method_6937(class_6331 var1, boolean var2, boolean var3) {
      if (var1.method_29537().method_1285(class_291.field_1041)) {
         if (--this.field_17370 <= 0) {
            this.field_17370 = 1200;
            this.field_17367 -= 1200;
            this.field_17365.method_32976(this.field_17367);
            if (this.field_17367 <= 0) {
               this.field_17367 = 24000;
               if (var1.method_29537().method_1285(class_291.field_1028)) {
                  int var6 = this.field_17368;
                  this.field_17368 = class_9299.method_42829(this.field_17368 + 25, 25, 75);
                  this.field_17365.method_32970(this.field_17368);
                  if (this.field_17366.nextInt(100) <= var6) {
                     if (!this.method_16519(var1)) {
                        return 0;
                     } else {
                        this.field_17368 = 25;
                        return 1;
                     }
                  } else {
                     return 0;
                  }
               } else {
                  return 0;
               }
            } else {
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean method_16519(class_6331 var1) {
      class_9359 var4 = var1.method_28948();
      if (var4 != null) {
         if (this.field_17366.nextInt(10) != 0) {
            return false;
         } else {
            class_1331 var5 = var4.method_37075();
            byte var6 = 48;
            class_1489 var7 = var1.method_28969();
            Optional var8 = var7.method_6876(class_236.field_783.method_1007(), var0 -> true, var5, 48, class_8122.field_41615);
            class_1331 var9 = var8.orElse(var5);
            class_1331 var10 = this.method_16516(var1, var9, 48);
            if (var10 != null && this.method_16517(var1, var10)) {
               if (var1.method_2754(var10).equals(Optional.<class_5621<class_6325>>of(class_8606.field_44126))) {
                  return false;
               }

               class_6862 var11 = class_6629.field_34303
                  .method_30478(var1, (CompoundNBT)null, (ITextComponent)null, (class_704)null, var10, class_2417.field_12040, false, false);
               if (var11 != null) {
                  for (int var12 = 0; var12 < 2; var12++) {
                     this.method_16515(var1, var11, 4);
                  }

                  this.field_17365.method_32967(var11.method_37328());
                  var11.method_31481(48000);
                  var11.method_31484(var9);
                  var11.method_26843(var9, 16);
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   private void method_16515(class_6331 var1, class_6862 var2, int var3) {
      class_1331 var6 = this.method_16516(var1, var2.method_37075(), var3);
      if (var6 != null) {
         class_9629 var7 = class_6629.field_34230
            .method_30478(var1, (CompoundNBT)null, (ITextComponent)null, (class_704)null, var6, class_2417.field_12040, false, false);
         if (var7 != null) {
            var7.method_26901(var2, true);
         }
      }
   }

   @Nullable
   private class_1331 method_16516(class_4924 var1, class_1331 var2, int var3) {
      class_1331 var6 = null;

      for (int var7 = 0; var7 < 10; var7++) {
         int var8 = var2.method_12173() + this.field_17366.nextInt(var3 * 2) - var3;
         int var9 = var2.method_12185() + this.field_17366.nextInt(var3 * 2) - var3;
         int var10 = var1.method_22562(class_3801.field_18592, var8, var9);
         class_1331 var11 = new class_1331(var8, var10, var9);
         if (class_3815.method_17767(class_1257.field_6935, var1, var11, class_6629.field_34303)) {
            var6 = var11;
            break;
         }
      }

      return var6;
   }

   private boolean method_16517(class_6163 var1, class_1331 var2) {
      for (class_1331 var6 : class_1331.method_6076(var2, var2.method_6104(1, 2, 1))) {
         if (!var1.method_28262(var6).method_8324(var1, var6).method_19485()) {
            return false;
         }
      }

      return true;
   }
}
