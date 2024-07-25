package remapped;

public class class_7362 extends class_7067<class_1356> {
   private static String[] field_37624;

   public class_7362(class_6122 var1) {
      super(var1);
      this.field_36492 = 0.5F;
   }

   public void method_33527(class_1356 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36065(0.0, 0.5, 0.0);
      if ((float)var1.method_6258() - var3 + 1.0F < 10.0F) {
         float var9 = 1.0F - ((float)var1.method_6258() - var3 + 1.0F) / 10.0F;
         var9 = class_9299.method_42828(var9, 0.0F, 1.0F);
         var9 *= var9;
         var9 *= var9;
         float var10 = 1.0F + var9 * 0.3F;
         var4.method_36062(var10, var10, var10);
      }

      var4.method_36060(class_2426.field_12074.method_11074(-90.0F));
      var4.method_36065(-0.5, -0.5, 0.5);
      var4.method_36060(class_2426.field_12074.method_11074(90.0F));
      class_9382.method_43384(class_4783.field_23252.method_29260(), var4, var5, var6, var1.method_6258() / 5 % 2 == 0);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_33526(class_1356 var1) {
      return class_8359.field_42824;
   }
}
