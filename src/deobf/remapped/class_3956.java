package remapped;

import java.util.Random;

public class class_3956 extends class_6414 {
   private static String[] field_19180;
   public static final class_4190 field_19179 = class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   public final class_5079 field_19181;

   public class_3956(class_3073 var1, class_5079 var2) {
      super(var1);
      this.field_19181 = var2;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_19179;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field_802 && !this.method_10787(var1, var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return method_29266(var2, var3.method_6100(), Direction.field_817);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.5;
      double var9 = (double)var3.getY() + 0.7;
      double var11 = (double)var3.getZ() + 0.5;
      var2.method_43361(class_3090.field_15376, var7, var9, var11, 0.0, 0.0, 0.0);
      var2.method_43361(this.field_19181, var7, var9, var11, 0.0, 0.0, 0.0);
   }
}
