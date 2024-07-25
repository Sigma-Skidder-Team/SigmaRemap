package remapped;

import java.util.AbstractList;

public class class_6431<E> extends AbstractList<E> {
   private final E[] field_32852;
   private final E[] field_32853;

   public class_6431(E[] var1, E[] var2) {
      this.field_32852 = (E[])var1;
      this.field_32853 = (E[])var2;
   }

   @Override
   public E get(int var1) {
      Object var4;
      if (var1 >= this.field_32852.length) {
         if (var1 - this.field_32852.length >= this.field_32853.length) {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + this.size());
         }

         var4 = this.field_32853[var1 - this.field_32852.length];
      } else {
         var4 = this.field_32852[var1];
      }

      return (E)var4;
   }

   @Override
   public int size() {
      return this.field_32852.length + this.field_32853.length;
   }
}
