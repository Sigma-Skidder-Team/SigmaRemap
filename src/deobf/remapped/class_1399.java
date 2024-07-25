package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_1399 extends class_2208<class_7249> {
   private static final Identifier field_7616 = new Identifier("textures/gui/container/dispenser.png");

   public class_1399(class_7249 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_10959 = (this.field_10981 - this.field_948.method_45379(this.field_947)) / 2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_7616);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
   }
}
