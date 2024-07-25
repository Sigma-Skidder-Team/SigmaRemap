package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_8097 extends class_2208<class_5104> {
   private static final class_4639 field_41486 = new class_4639("textures/gui/container/shulker_box.png");

   public class_8097(class_5104 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_10973++;
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
      this.field_943.method_8577().method_35674(field_41486);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
   }
}
