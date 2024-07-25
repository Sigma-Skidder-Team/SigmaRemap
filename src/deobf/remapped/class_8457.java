package remapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class class_8457 extends class_3765 {
   public final int field_43233;
   public final int field_43234;
   public final class_2913[] field_43236;
   private final BiFunction<class_6098, class_2792, class_6098> field_43237;
   private final class_2283 field_43235 = new class_5758(this);

   public class_8457(int var1, int var2, class_7279[] var3, class_2913[] var4) {
      super(var3);
      this.field_43233 = var1;
      this.field_43234 = var2;
      this.field_43236 = var4;
      this.field_43237 = class_5116.method_23457(var4);
   }

   @Override
   public void method_17436(class_4737 var1) {
      super.method_17436(var1);

      for (int var4 = 0; var4 < this.field_43236.length; var4++) {
         this.field_43236[var4].method_12680(var1.method_21888(".functions[" + var4 + "]"));
      }
   }

   public abstract void method_38897(Consumer<class_6098> var1, class_2792 var2);

   @Override
   public boolean method_4277(class_2792 var1, Consumer<class_2283> var2) {
      if (!this.method_17437(var1)) {
         return false;
      } else {
         var2.accept(this.field_43235);
         return true;
      }
   }

   public static class_7550<?> method_38895(class_8043 var0) {
      return new class_6046(var0);
   }
}
