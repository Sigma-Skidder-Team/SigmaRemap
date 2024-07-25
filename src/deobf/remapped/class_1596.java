package remapped;

import java.util.List;

public class class_1596 extends class_2233<class_1621> {
   private final List<class_1621> field_8313;

   public class_1596(class_9592 var1, boolean var2, List<class_1621> var3, class_404 var4, class_404 var5, class_435 var6) {
      super(var1, var4, var5, var6);
      if (var3 != null) {
         this.field_8313 = var3;
         this.field_8429 = var2;
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public class_1596(class_9592 var1, List<class_1621> var2, class_435 var3) {
      this(var1, true, var2, null, null, var3);
   }

   @Override
   public class_99 method_7221() {
      return class_99.field_234;
   }

   @Override
   public List<class_1621> method_10282() {
      return this.field_8313;
   }

   public void method_7154(Class<? extends Object> var1) {
      for (class_1621 var5 : this.field_8313) {
         var5.method_7226(var1);
      }
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + " (tag=" + this.method_7232() + ", value=" + this.method_10282() + ")>";
   }
}
