package remapped;

public class class_5376 extends class_446 {
   public class_8310 field_27454;

   public class_5376(class_8310 var1, int var2, String var3) {
      super(var1, "bezierButton-" + var3, 0, 0, var2, var2, true);
      this.method_1533(true);
      this.field_20347 = true;
      this.field_27454 = var1;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      int var5 = this.field_27454.method_32109() - this.field_27454.field_42562;
      int var6 = this.field_27454.method_32137() - this.method_32137();
      int var7 = this.field_27454.field_42562;
      if (this.method_32132() > var5) {
         this.method_32175(var5);
      }

      if (this.method_32173() > var6) {
         this.method_32117(var6);
      }

      if (this.method_32132() < var7) {
         this.method_32175(var7);
      }
   }

   public void method_24510(float var1, float var2) {
      this.field_36270 = (int)var1;
      this.field_36261 = (int)var2;
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_121(
         (float)(this.field_36270 + 5),
         (float)(this.field_36261 + 5),
         10.0F,
         class_314.method_1444(!this.method_1535() ? class_1255.field_6930.field_6917 : class_1255.field_6925.field_6917, var1)
      );
      super.method_32178(var1);
   }
}
