package remapped;

import java.util.function.Predicate;

public abstract class class_3765 implements class_978 {
   public final class_7279[] field_18417;
   private final Predicate<class_2792> field_18418;

   public class_3765(class_7279[] var1) {
      this.field_18417 = var1;
      this.field_18418 = class_5110.<class_2792>method_23432(var1);
   }

   public void method_17436(class_4737 var1) {
      for (int var4 = 0; var4 < this.field_18417.length; var4++) {
         this.field_18417[var4].method_12680(var1.method_21888(".condition[" + var4 + "]"));
      }
   }

   public final boolean method_17437(class_2792 var1) {
      return this.field_18418.test(var1);
   }

   public abstract class_3515 method_17435();
}
