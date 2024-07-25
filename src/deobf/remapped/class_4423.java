package remapped;

import java.util.Random;

public class class_4423 extends class_6414 {
   private static String[] field_21617;
   public static final class_7044 field_21618 = class_6023.field_30689;
   public static final class_6720 field_21619 = class_6023.field_30722;

   public class_4423(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_21618, Integer.valueOf(7)).method_10308(field_21619, Boolean.valueOf(false)));
   }

   @Override
   public class_4190 method_10774(class_2522 var1, class_6163 var2, BlockPos var3) {
      return class_3370.method_15536();
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_21618) == 7 && !var1.<Boolean>method_10313(field_21619);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>method_10313(field_21619) && var1.<Integer>method_10313(field_21618) == 7) {
         method_29294(var1, var2, var3);
         var2.method_7508(var3, false);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      var2.method_7513(var3, method_20562(var1, var2, var3), 3);
   }

   @Override
   public int method_10794(class_2522 var1, class_6163 var2, BlockPos var3) {
      return 1;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      int var9 = method_20561(var3) + 1;
      if (var9 != 1 || var1.<Integer>method_10313(field_21618) != var9) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return var1;
   }

   private static class_2522 method_20562(class_2522 var0, class_9379 var1, BlockPos var2) {
      int var5 = 7;
      class_2921 var6 = new class_2921();

      for (Direction var10 : Direction.values()) {
         var6.method_13371(var2, var10);
         var5 = Math.min(var5, method_20561(var1.method_28262(var6)) + 1);
         if (var5 == 1) {
            break;
         }
      }

      return var0.method_10308(field_21618, Integer.valueOf(var5));
   }

   private static int method_20561(class_2522 var0) {
      if (!class_2351.field_11730.method_10609(var0.method_8360())) {
         return !(var0.method_8360() instanceof class_4423) ? 7 : var0.<Integer>method_10313(field_21618);
      } else {
         return 0;
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var2.method_29569(var3.method_6081()) && var4.nextInt(15) == 1) {
         BlockPos var7 = var3.method_6100();
         class_2522 var8 = var2.method_28262(var7);
         if (!var8.method_8302() || !var8.method_8308(var2, var7, Direction.field_817)) {
            double var9 = (double)var3.getX() + var4.nextDouble();
            double var11 = (double)var3.getY() - 0.05;
            double var13 = (double)var3.getZ() + var4.nextDouble();
            var2.method_43361(class_3090.field_15358, var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_21618, field_21619);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return method_20562(this.method_29260().method_10308(field_21619, Boolean.valueOf(true)), var1.method_21862(), var1.method_21858());
   }
}
