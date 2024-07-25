package remapped;

public class class_6339 extends class_6499<class_2547> {
   private static final Identifier field_32363 = new Identifier("textures/entity/illager/illusioner.png");

   public class_6339(class_6122 var1) {
      super(var1, new class_5723<class_2547>(0.0F, 0.0F, 64, 64), 0.5F);
      this.method_29100(new class_822(this, this));
      this.field_32487.method_25894().field_8200 = true;
   }

   public Identifier method_29012(class_2547 var1) {
      return field_32363;
   }

   public void method_29013(class_2547 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (!var1.method_37109()) {
         super.method_32866(var1, var2, var3, var4, var5, var6);
      } else {
         class_1343[] var9 = var1.method_11597(var3);
         float var10 = this.method_29109(var1, var3);

         for (int var11 = 0; var11 < var9.length; var11++) {
            var4.method_36063();
            var4.method_36065(
               var9[var11].field_7336 + (double)class_9299.method_42840((float)var11 + var10 * 0.5F) * 0.025,
               var9[var11].field_7333 + (double)class_9299.method_42840((float)var11 + var10 * 0.75F) * 0.0125,
               var9[var11].field_7334 + (double)class_9299.method_42840((float)var11 + var10 * 0.7F) * 0.025
            );
            super.method_32866(var1, var2, var3, var4, var5, var6);
            var4.method_36064();
         }
      }
   }

   public boolean method_29011(class_2547 var1) {
      return true;
   }
}
