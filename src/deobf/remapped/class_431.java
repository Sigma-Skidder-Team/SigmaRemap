package remapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class class_431 implements Iterator<T> {
   private static String[] field_1807;
   private int field_1808;
   private int field_1806;

   private class_431(class_1548 var1) {
      this.field_1805 = var1;
      this.field_1806 = -1;
   }

   @Override
   public boolean hasNext() {
      return this.field_1808 < class_1548.method_7023(this.field_1805);
   }

   @Override
   public T next() {
      if (this.field_1808 < class_1548.method_7023(this.field_1805)) {
         this.field_1806 = this.field_1808++;
         return (T)class_1548.method_7027(this.field_1805)[this.field_1806];
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field_1806 != -1) {
         class_1548.method_7020(this.field_1805, this.field_1806);
         this.field_1808--;
         this.field_1806 = -1;
      } else {
         throw new IllegalStateException();
      }
   }
}
