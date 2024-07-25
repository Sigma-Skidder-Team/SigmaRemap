package remapped;

import java.util.List;
import java.util.function.Function;

public class class_8658<T> implements class_8813<T> {
   private class_2307<T> field_44331;
   public final class_4639 field_44332;

   private class_8658(class_4639 var1) {
      this.field_44332 = var1;
   }

   @Override
   public class_4639 method_40487() {
      return this.field_44332;
   }

   private class_2307<T> method_39700() {
      if (this.field_44331 != null) {
         return this.field_44331;
      } else {
         throw new IllegalStateException("Tag " + this.field_44332 + " used before it was bound");
      }
   }

   public void method_39699(Function<class_4639, class_2307<T>> var1) {
      this.field_44331 = (class_2307<T>)var1.apply(this.field_44332);
   }

   @Override
   public boolean method_10609(T var1) {
      return this.field_44331 != null ? this.method_39700().method_10609((T)var1) : false;
   }

   @Override
   public List<T> method_10608() {
      return this.method_39700().method_10608();
   }
}
