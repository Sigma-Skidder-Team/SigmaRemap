package remapped;

import java.util.function.Consumer;

public abstract class class_4024 extends class_3765 {
   public final class_3765[] field_19559;
   private final class_978 field_19558;

   public class_4024(class_3765[] var1, class_7279[] var2) {
      super(var2);
      this.field_19559 = var1;
      this.field_19558 = this.method_18540(var1);
   }

   @Override
   public void method_17436(class_4737 var1) {
      super.method_17436(var1);
      if (this.field_19559.length == 0) {
         var1.method_21892("Empty children list");
      }

      for (int var4 = 0; var4 < this.field_19559.length; var4++) {
         this.field_19559[var4].method_17436(var1.method_21888(".entry[" + var4 + "]"));
      }
   }

   public abstract class_978 method_18540(class_978[] var1);

   @Override
   public final boolean method_4277(class_2792 var1, Consumer<class_2283> var2) {
      return this.method_17437(var1) ? this.field_19558.method_4277(var1, var2) : false;
   }

   public static <T extends class_4024> class_2570<T> method_18539(class_5696<T> var0) {
      return new class_9759(var0);
   }
}
