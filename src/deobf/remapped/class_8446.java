package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public abstract class class_8446 extends class_3259 {
   private final class_1013[] field_43201;
   private class_7114 field_43200;
   private class_2825 field_43199;

   public class_8446(class_266 var1, GameOptions var2, ITextComponent var3, class_1013[] var4) {
      super(var1, var2, var3);
      this.field_43201 = var4;
   }

   @Override
   public void method_1163() {
      this.field_43199 = new class_2825(this.field_943, this.field_941, this.field_940, 32, this.field_940 - 32, 25);
      this.field_43199.method_12856(this.field_43201);
      this.field_942.add(this.field_43199);
      this.method_38846();
      this.field_43200 = this.field_43199.method_12854(class_1013.field_5254);
      if (this.field_43200 != null) {
         this.field_43200.field_36675 = class_7542.field_38482.method_34346();
      }
   }

   public void method_38846() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 - 27, 200, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_16162))
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_43199.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      super.method_6767(var1, var2, var3, var4);
      List var7 = method_14872(this.field_43199, var2, var3);
      if (var7 != null) {
         this.method_1175(var1, var7, var2, var3);
      }
   }

   public void method_38845() {
      if (this.field_43200 != null) {
         this.field_43200.method_32687(class_1013.field_5254.method_18454(this.field_16164));
      }
   }
}
