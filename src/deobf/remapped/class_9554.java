package remapped;

import java.util.function.Predicate;

public class class_9554<T> implements class_2874<T> {
   private static String[] field_48608;
   private final class_95<T> field_48607;
   private final T field_48606;

   public class_9554(class_95<T> var1, T var2) {
      this.field_48607 = var1;
      this.field_48606 = (T)var2;
   }

   @Override
   public int method_13201(T var1) {
      int var4 = this.field_48607.method_14041((T)var1);
      return var4 != -1 ? var4 : 0;
   }

   @Override
   public boolean method_13203(Predicate<T> var1) {
      return true;
   }

   @Override
   public T method_13200(int var1) {
      Object var4 = this.field_48607.method_14040(var1);
      return (T)(var4 != null ? var4 : this.field_48606);
   }

   @Override
   public void method_13206(class_8248 var1) {
   }

   @Override
   public void method_13202(class_8248 var1) {
   }

   @Override
   public int method_13204() {
      return class_8248.method_37766(0);
   }

   @Override
   public void method_13205(class_3416 var1) {
   }
}
