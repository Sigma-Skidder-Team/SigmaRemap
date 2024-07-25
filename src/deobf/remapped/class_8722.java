package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_8722 extends class_3798 {
   @Override
   public class_2340 method_17661() {
      return class_8532.field_43677;
   }

   @Override
   public class_2340 method_17657() {
      return class_8532.field_43675;
   }

   @Override
   public class_2451 method_10721() {
      return class_4897.field_24938;
   }

   @Override
   public void method_10722(World var1, BlockPos var2, class_4774 var3, Random var4) {
      BlockPos var7 = var2.method_6081();
      if (var1.method_28262(var7).method_8345() && !var1.method_28262(var7).method_8321(var1, var7)) {
         if (var4.nextInt(100) == 0) {
            double var8 = (double)var2.method_12173() + var4.nextDouble();
            double var10 = (double)var2.method_12165() + 1.0;
            double var12 = (double)var2.method_12185() + var4.nextDouble();
            var1.method_43361(class_3090.field_15372, var8, var10, var12, 0.0, 0.0, 0.0);
            var1.method_29527(
               var8, var10, var12, class_463.field_2511, class_562.field_3322, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }

         if (var4.nextInt(200) == 0) {
            var1.method_29527(
               (double)var2.method_12173(),
               (double)var2.method_12165(),
               (double)var2.method_12185(),
               class_463.field_2339,
               class_562.field_3322,
               0.2F + var4.nextFloat() * 0.2F,
               0.9F + var4.nextFloat() * 0.15F,
               false
            );
         }
      }
   }

   @Override
   public void method_10706(World var1, BlockPos var2, class_4774 var3, Random var4) {
      if (var1.method_29537().method_1285(class_291.field_1035)) {
         int var7 = var4.nextInt(3);
         if (var7 <= 0) {
            for (int var8 = 0; var8 < 3; var8++) {
               BlockPos var9 = var2.method_6104(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
               if (!var1.method_29585(var9)) {
                  return;
               }

               if (var1.method_22548(var9.method_6081()) && this.method_40068(var1, var9)) {
                  var1.method_29594(var9.method_6081(), class_9476.method_43768(var1, var9));
               }
            }
         } else {
            BlockPos var11 = var2;

            for (int var12 = 0; var12 < var7; var12++) {
               var11 = var11.method_6104(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if (!var1.method_29585(var11)) {
                  return;
               }

               class_2522 var10 = var1.method_28262(var11);
               if (!var10.method_8345()) {
                  if (var10.method_8362().method_24502()) {
                     return;
                  }
               } else if (this.method_40066(var1, var11)) {
                  var1.method_29594(var11, class_9476.method_43768(var1, var11));
                  return;
               }
            }
         }
      }
   }

   private boolean method_40066(class_4924 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method_40068(var1, var2.method_6098(var8))) {
            return true;
         }
      }

      return false;
   }

   private boolean method_40068(class_4924 var1, BlockPos var2) {
      return var2.method_12165() >= 0 && var2.method_12165() < 256 && !var1.isBlockLoaded(var2) ? false : var1.method_28262(var2).method_8362().method_24495();
   }

   @Nullable
   @Override
   public class_5079 method_10714() {
      return class_3090.field_15336;
   }

   @Override
   public void method_17664(class_9379 var1, BlockPos var2, class_2522 var3) {
      this.method_40067(var1, var2);
   }

   @Override
   public int method_17654(class_4924 var1) {
      return !var1.method_22572().method_40242() ? 2 : 4;
   }

   @Override
   public class_2522 method_10726(class_4774 var1) {
      return class_4783.field_23811.method_29260().method_10308(class_7855.field_39806, Integer.valueOf(method_17644(var1)));
   }

   @Override
   public boolean method_10723(class_2340 var1) {
      return var1 == class_8532.field_43675 || var1 == class_8532.field_43677;
   }

   @Override
   public int method_17653(class_4924 var1) {
      return !var1.method_22572().method_40242() ? 2 : 1;
   }

   @Override
   public boolean method_10709(class_4774 var1, class_6163 var2, BlockPos var3, class_2340 var4, Direction var5) {
      return var1.method_22008(var2, var3) >= 0.44444445F && var4.method_10724(class_6503.field_33094);
   }

   @Override
   public int method_10711(class_4924 var1) {
      return !var1.method_22572().method_40242() ? 30 : 10;
   }

   @Override
   public int method_17645(World var1, BlockPos var2, class_4774 var3, class_4774 var4) {
      int var7 = this.method_10711(var1);
      if (!var3.method_22001()
         && !var4.method_22001()
         && !var3.<Boolean>method_10313(field_18532)
         && !var4.<Boolean>method_10313(field_18532)
         && var4.method_22008(var1, var2) > var3.method_22008(var1, var2)
         && var1.method_43360().nextInt(4) != 0) {
         var7 *= 4;
      }

      return var7;
   }

   private void method_40067(class_9379 var1, BlockPos var2) {
      var1.method_43364(1501, var2, 0);
   }

   @Override
   public boolean method_17647() {
      return false;
   }

   @Override
   public void method_17658(class_9379 var1, BlockPos var2, class_2522 var3, Direction var4, class_4774 var5) {
      if (var4 == Direction.field_802) {
         class_4774 var8 = var1.method_28258(var2);
         if (this.method_10724(class_6503.field_33095) && var8.method_22007(class_6503.field_33094)) {
            if (var3.method_8360() instanceof class_7855) {
               var1.method_7513(var2, class_4783.field_23644.method_29260(), 3);
            }

            this.method_40067(var1, var2);
            return;
         }
      }

      super.method_17658(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_10715() {
      return true;
   }

   @Override
   public float method_10716() {
      return 100.0F;
   }
}
