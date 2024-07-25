package remapped;

import java.util.AbstractList;

public class class_1416<E> extends AbstractList<E> {
   private final E[] field_7681;

   public class_1416(E[] var1) {
      this.field_7681 = (E[])var1;
   }

   @Override
   public E get(int var1) {
      if (var1 < this.field_7681.length) {
         return this.field_7681[var1];
      } else {
         throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + this.size());
      }
   }

   @Override
   public int size() {
      return this.field_7681.length;
   }
}
