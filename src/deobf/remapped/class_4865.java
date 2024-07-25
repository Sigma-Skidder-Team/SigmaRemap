package remapped;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class class_4865 extends class_9101<E>.Itr implements ListIterator<E> {
   private static String[] field_24221;

   public class_4865(class_9101 var1, int var2) {
      super(var1);
      this.field_24222 = var1;
      this.field_26782 = var2;
   }

   @Override
   public boolean hasPrevious() {
      return this.field_26782 > 0;
   }

   @Override
   public int nextIndex() {
      return this.field_26782;
   }

   @Override
   public int previousIndex() {
      return this.field_26782 - 1;
   }

   @Override
   public E previous() {
      int var3 = this.field_26782 - 1;
      if (var3 >= 0) {
         this.field_26782 = var3;
         return (E)this.field_26780.get(this.field_26783 = var3);
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void set(E var1) {
      if (this.field_26783 >= 0) {
         this.field_26780.set(this.field_26783, var1);
         this.field_24222.set(this.field_26783, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void add(E var1) {
      int var4 = this.field_26782;
      this.field_26780.add(var4, var1);
      this.field_24222.add(var4, var1);
      this.field_26782 = var4 + 1;
      this.field_26783 = -1;
   }
}
