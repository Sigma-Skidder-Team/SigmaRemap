package remapped;

public class class_6432 extends class_2596 {
   private static MinecraftClient field_32855 = MinecraftClient.getInstance();
   public class_6086 field_32857;

   public class_6432() {
      super("Spotlight");
      this.method_32105(false);
      int var3 = (this.method_32109() - 675) / 2;
      this.method_32148(this.field_32857 = new class_6086(this, "search", var3, (int)((float)this.field_36257 * 0.25F), 675, 60, true));
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         field_32855.method_8609(null);
      }
   }
}
