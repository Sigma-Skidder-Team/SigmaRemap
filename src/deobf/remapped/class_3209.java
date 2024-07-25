package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_3209 extends class_2208<class_1039> {
   private static final class_4639 field_16015 = new class_4639("textures/gui/container/grindstone.png");

   public class_3209(class_1039 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.method_10223(var1, var4, var2, var3);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_16015);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      if ((this.field_10956.method_18878(0).method_35884() || this.field_10956.method_18878(1).method_35884())
         && !this.field_10956.method_18878(2).method_35884()) {
         this.method_9781(var1, var7 + 92, var8 + 31, this.field_10981, 0, 28, 21);
      }
   }
}
