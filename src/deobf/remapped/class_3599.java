package remapped;

import java.util.EnumSet;

public abstract class class_3599 {
   private final EnumSet<class_1891> field_17615 = EnumSet.<class_1891>noneOf(class_1891.class);

   public abstract boolean method_16795();

   public boolean method_16799() {
      return this.method_16795();
   }

   public boolean method_16801() {
      return true;
   }

   public void method_16796() {
   }

   public void method_16793() {
   }

   public void method_16794() {
   }

   public void method_16800(EnumSet<class_1891> var1) {
      this.field_17615.clear();
      this.field_17615.addAll(var1);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<class_1891> method_16797() {
      return this.field_17615;
   }
}
