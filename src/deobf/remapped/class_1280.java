package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_1280<T extends class_2875> extends class_2208<T> implements class_117 {
   private static String[] field_7042;
   private Identifier field_7041;

   public class_1280(T var1, class_7051 var2, ITextComponent var3, Identifier var4) {
      super((T)var1, var2, var3);
      this.field_7041 = var4;
   }

   public void method_5724() {
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.method_5724();
      this.field_10956.method_18888(this);
   }

   @Override
   public void method_1162() {
      super.method_1162();
      this.field_10956.method_18880(this);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      class_3542.method_16448();
      this.method_5725(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   public void method_5725(class_7966 var1, int var2, int var3, float var4) {
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(this.field_7041);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      this.method_9781(var1, var7 + 59, var8 + 20, 0, this.field_10973 + (!this.field_10956.method_18878(0).method_35884() ? 16 : 0), 110, 16);
      if ((this.field_10956.method_18878(0).method_35884() || this.field_10956.method_18878(1).method_35884())
         && !this.field_10956.method_18878(2).method_35884()) {
         this.method_9781(var1, var7 + 99, var8 + 45, this.field_10981, 0, 28, 21);
      }
   }

   @Override
   public void method_347(class_4088 var1, class_2831<class_6098> var2) {
      this.method_348(var1, 0, var1.method_18878(0).method_35898());
   }

   @Override
   public void method_346(class_4088 var1, int var2, int var3) {
   }

   @Override
   public void method_348(class_4088 var1, int var2, class_6098 var3) {
   }
}
