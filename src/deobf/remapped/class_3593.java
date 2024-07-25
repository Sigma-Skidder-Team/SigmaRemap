package remapped;

import java.util.Iterator;

public class class_3593 implements Iterator<class_2418<T>> {
   private static String[] field_17607;
   public class_2418<T> field_17605;

   public class_3593(class_8161 var1) {
      this.field_17606 = var1;
      this.field_17605 = this.field_17606.method_37448();
   }

   @Override
   public boolean hasNext() {
      return this.field_17605 != null;
   }

   public class_2418<T> next() {
      class_2418 var3 = this.field_17605;
      if (this.field_17605 != null) {
         this.field_17605 = class_2418.method_11030(this.field_17605);
      }

      return var3;
   }
}
