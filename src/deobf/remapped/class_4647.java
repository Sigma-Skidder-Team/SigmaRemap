package remapped;

public class class_4647 extends class_2596 {
   private static MinecraftClient field_22680 = MinecraftClient.getInstance();
   private static class_2440 field_22681;
   private static boolean field_22678 = true;
   private class_4098 field_22679;

   public class_4647() {
      super("ClassicScreen");
      field_22681 = new class_2440(250, 200, class_4043.field_19620);
      this.method_21495();
      class_314.method_1403();
   }

   public void method_21496() {
      this.method_32102(() -> this.method_21495());
   }

   public void method_21497(String var1, class_5664... var2) {
      this.method_32102(() -> {
         if (this.field_22679 != null) {
            this.method_32179(this.field_22679);
         }

         this.method_32148(this.field_22679 = new class_9573(this, var1, this.method_32109() / 2, this.method_32137() / 2, var2));
      });
   }

   private void method_21495() {
      if (this.field_22679 != null) {
         this.method_32179(this.field_22679);
      }

      this.method_32148(this.field_22679 = new class_9898(this, "Sigma", this.method_32109() / 2, this.method_32137() / 2));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public int method_11773() {
      return MinecraftClient.method_8501();
   }

   @Override
   public class_1293 method_32180(class_1293 var1) {
      class_314.method_1430();
      return super.method_32180(var1);
   }

   @Override
   public void method_32159(class_1293 var1) {
      super.method_32159(var1);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         field_22680.method_8609(null);
      }
   }

   @Override
   public void method_32178(float var1) {
      float var4 = field_22681.method_11123();
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var4 * 0.35F)
      );
      super.method_32178(var1);
   }
}
