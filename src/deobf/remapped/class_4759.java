package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_4759 extends class_3798 {
   @Override
   public class_2340 method_17661() {
      return class_8532.field_43676;
   }

   @Override
   public class_2340 method_17657() {
      return class_8532.field_43674;
   }

   @Override
   public class_2451 method_10721() {
      return class_4897.field_24999;
   }

   @Override
   public void method_10722(World var1, class_1331 var2, class_4774 var3, Random var4) {
      if (!var3.method_21993() && !var3.<Boolean>method_10313(field_18532)) {
         if (var4.nextInt(64) == 0) {
            var1.method_29527(
               (double)var2.method_12173() + 0.5,
               (double)var2.method_12165() + 0.5,
               (double)var2.method_12185() + 0.5,
               class_463.field_2220,
               class_562.field_3322,
               var4.nextFloat() * 0.25F + 0.75F,
               var4.nextFloat() + 0.5F,
               false
            );
         }
      } else if (var4.nextInt(10) == 0) {
         var1.method_43361(
            class_3090.field_15350,
            (double)var2.method_12173() + var4.nextDouble(),
            (double)var2.method_12165() + var4.nextDouble(),
            (double)var2.method_12185() + var4.nextDouble(),
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Nullable
   @Override
   public class_5079 method_10714() {
      return class_3090.field_15358;
   }

   @Override
   public boolean method_17647() {
      return true;
   }

   @Override
   public void method_17664(class_9379 var1, class_1331 var2, class_2522 var3) {
      class_3757 var6 = !var3.method_8360().method_10802() ? null : var1.method_28260(var2);
      class_6414.method_29296(var3, var1, var2, var6);
   }

   @Override
   public int method_17654(class_4924 var1) {
      return 4;
   }

   @Override
   public class_2522 method_10726(class_4774 var1) {
      return class_4783.field_23900.method_29260().method_10308(class_7855.field_39806, Integer.valueOf(method_17644(var1)));
   }

   @Override
   public boolean method_10723(class_2340 var1) {
      return var1 == class_8532.field_43674 || var1 == class_8532.field_43676;
   }

   @Override
   public int method_17653(class_4924 var1) {
      return 1;
   }

   @Override
   public int method_10711(class_4924 var1) {
      return 5;
   }

   @Override
   public boolean method_10709(class_4774 var1, class_6163 var2, class_1331 var3, class_2340 var4, Direction var5) {
      return var5 == Direction.field_802 && !var4.method_10724(class_6503.field_33094);
   }

   @Override
   public float method_10716() {
      return 100.0F;
   }
}
