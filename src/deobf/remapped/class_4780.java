package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_4780 extends Screen {
   private static String[] field_23152;
   private final Runnable field_23155;
   public final ITextComponent field_23151;
   private class_416 field_23150 = class_416.field_1766;
   public final ITextComponent field_23154;
   private int field_23153;

   public class_4780(Runnable var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, var3, class_1402.field_7632);
   }

   public class_4780(Runnable var1, ITextComponent var2, ITextComponent var3, ITextComponent var4) {
      super(var2);
      this.field_23155 = var1;
      this.field_23151 = var3;
      this.field_23154 = var4;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 6 + 168, 200, 20, this.field_23154, var1 -> this.field_23155.run())
      );
      this.field_23150 = class_416.method_2075(this.field_948, this.field_23151, this.field_941 - 50);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 70, 16777215);
      this.field_23150.method_2067(var1, this.field_941 / 2, 90);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (--this.field_23153 == 0) {
         for (class_7114 var4 : this.field_950) {
            var4.field_36675 = true;
         }
      }
   }
}
