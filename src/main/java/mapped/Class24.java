package mapped;

import java.util.AbstractList;

public class Class24<E> extends AbstractList<E> {
   private final E[] field44;
   private final E[] field45;

   public Class24(E[] var1, E[] var2) {
      this.field44 = (E[])var1;
      this.field45 = (E[])var2;
   }

   @Override
   public E get(int var1) {
      Object var4;
      if (var1 >= this.field44.length) {
         if (var1 - this.field44.length >= this.field45.length) {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + this.size());
         }

         var4 = this.field45[var1 - this.field44.length];
      } else {
         var4 = this.field44[var1];
      }

      return (E)var4;
   }

   @Override
   public int size() {
      return this.field44.length + this.field45.length;
   }
}
