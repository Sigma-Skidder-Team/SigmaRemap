package remapped;

public class class_175 extends class_8715 {
   private static String[] field_580;
   private final class_6571 field_581;

   private class_175(ClientWorld var1, double var2, double var4, double var6, double var8, class_6571 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_49476 = 6 + this.field_49466.nextInt(4);
      float var13 = this.field_49466.nextFloat() * 0.6F + 0.4F;
      this.field_49485 = var13;
      this.field_49468 = var13;
      this.field_49487 = var13;
      this.field_10503 = 2.0F * (1.0F - (float)var8 * 0.5F);
      this.field_581 = var10;
      this.method_40054(var10);
   }

   @Override
   public int method_44952(float var1) {
      return 15728880;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_581);
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36846;
   }
}
