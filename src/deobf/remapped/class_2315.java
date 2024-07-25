package remapped;

import java.util.Date;

public class class_2315 extends class_2596 {
   private static class_1893 field_11583 = class_1893.method_8510();
   private class_8343 field_11591;
   public Date field_11592;
   public class_3451 field_11588;
   public boolean field_11584 = false;
   public boolean field_11586;
   public int field_11590;
   public boolean field_11585;
   public class_556 field_11594;
   private boolean field_11587;
   private boolean field_11593;

   public class_2315() {
      super("KeybindManager");
      this.field_11592 = new Date();
      int var3 = Math.max(300, Math.min(850, class_1893.method_8510().field_9602.method_43166() - 40));
      int var4 = Math.max(200, Math.min(550, class_1893.method_8510().field_9602.method_43163() - 80));
      this.method_32148(this.field_11588 = new class_3451(this, "mapView", (this.field_36278 - var3) / 2, (this.field_36257 - var4) / 2, var3, var4));
      this.field_11588.field_16933.method_4322((var2, var3x, var4x, var5) -> this.method_32102(new class_1006(this, this, var3x, var4x, var5)));
      this.field_11588.field_16933.method_4320(var1 -> this.method_10637());
      class_314.method_1403();
   }

   private void method_10635(class_556 var1) {
      var1.method_2667((var1x, var2, var3, var4) -> {
         this.field_11588.field_16931.method_27166(var2, var3, var4);
         SigmaMainClass.method_3328().method_3309().method_21973(new class_4333(var2, var3.method_12173(), var3.method_12185(), var4));
         this.method_10637();
      });
   }

   private void method_10637() {
      class_2315 var3 = this;

      for (class_7038 var5 : this.method_32134()) {
         if (var5 instanceof class_556) {
            class_556 var6 = (class_556)var5;
            this.method_32102(new class_2295(this, var3, var5));
         }
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.method_32105(false);
   }

   @Override
   public int method_11773() {
      return 60;
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         class_314.method_1430();
         field_11583.method_8609(null);
      }
   }

   @Override
   public void method_32178(float var1) {
      var1 = (float)Math.min(200L, new Date().getTime() - this.field_11592.getTime()) / 200.0F;
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var5)
      );
      super.method_32190();
      super.method_32178(var1);
   }
}
