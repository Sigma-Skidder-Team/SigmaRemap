package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;

public class class_9640 extends class_266 {
   private final ITextComponent field_49116;
   private class_416 field_49117 = class_416.field_1766;
   public ITextComponent field_49114;
   public ITextComponent field_49115;
   private int field_49118;
   public final BooleanConsumer field_49113;

   public class_9640(BooleanConsumer var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, var3, class_1402.field_7626, class_1402.field_7628);
   }

   public class_9640(BooleanConsumer var1, ITextComponent var2, ITextComponent var3, ITextComponent var4, ITextComponent var5) {
      super(var2);
      this.field_49113 = var1;
      this.field_49116 = var3;
      this.field_49114 = var4;
      this.field_49115 = var5;
   }

   @Override
   public String method_1165() {
      return super.method_1165() + ". " + this.field_49116.getString();
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155, this.field_940 / 6 + 96, 150, 20, this.field_49114, var1 -> this.field_49113.accept(true))
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155 + 160, this.field_940 / 6 + 96, 150, 20, this.field_49115, var1 -> this.field_49113.accept(false))
      );
      this.field_49117 = class_416.method_2075(this.field_948, this.field_49116, this.field_941 - 50);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 70, 16777215);
      this.field_49117.method_2067(var1, this.field_941 / 2, 90);
      super.method_6767(var1, var2, var3, var4);
   }

   public void method_44506(int var1) {
      this.field_49118 = var1;

      for (class_7114 var5 : this.field_950) {
         var5.field_36675 = false;
      }
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (--this.field_49118 == 0) {
         for (class_7114 var4 : this.field_950) {
            var4.field_36675 = true;
         }
      }
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_49113.accept(false);
         return true;
      }
   }
}
