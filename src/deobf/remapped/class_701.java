package remapped;

public final class class_701 implements class_2498 {
   private static String[] field_3818;

   @Override
   public class_5167 method_11411(class_5167 var1, Integer[] var2) {
      int var5 = var2[0];
      int var6 = (var5 & 4095) << 4 | var5 >> 12 & 15;
      int var7 = class_2750.method_12391(var6);
      var1.method_23687().add(new class_7579(class_8039.field_41157, var7));
      return var1;
   }
}
