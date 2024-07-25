package remapped;

public class class_3984 implements class_5256<class_2427> {
   private static String[] field_19380;
   private final class_6571 field_19379;

   public class_3984(class_6571 var1) {
      this.field_19379 = var1;
   }

   public class_9733 method_18379(class_2427 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      class_6446 var17 = new class_6446(var2, var3, var5, var7, var9, var11, var13, null);
      var17.method_44953(0.3F, 0.5F, 1.0F);
      var17.method_40053(this.field_19379);
      var17.method_44956(1.0F - var2.field_33033.nextFloat() * 0.7F);
      var17.method_44950(var17.method_44958() / 2);
      return var17;
   }
}
