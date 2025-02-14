package mapped;

import java.util.AbstractList;

public class Class2358<E> extends AbstractList<E> {
   private final E[] field16172;

   public Class2358(E[] var1) {
      this.field16172 = (E[])var1;
   }

   @Override
   public E get(int var1) {
      if (var1 < this.field16172.length) {
         return this.field16172[var1];
      } else {
         throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + this.size());
      }
   }

   @Override
   public int size() {
      return this.field16172.length;
   }
}
