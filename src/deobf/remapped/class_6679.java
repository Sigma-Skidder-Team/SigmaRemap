package remapped;

public final class class_6679 extends class_9873 {
   private static String[] field_34524;
   public final class_1549 field_34525 = new class_1549(64, 32, 0, 0);
   public final class_1549 field_34523;

   public class_6679() {
      super(RenderLayer::method_16755);
      this.field_34525.method_7049(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F, 0.0F);
      this.field_34523 = new class_1549(64, 32, 0, 14);
      this.field_34523.method_7049(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_34525.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_34523.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
