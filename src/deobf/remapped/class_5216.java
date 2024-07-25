package remapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class class_5216 implements Iterator<E> {
   private static String[] field_26779;
   public int field_26782;
   public int field_26783;
   public final class_9101 field_26780;

   public class_5216(class_9101 var1) {
      this.field_26781 = var1;
      this.field_26782 = 0;
      this.field_26783 = -1;
      this.field_26780 = (class_9101)var1.clone();
   }

   @Override
   public boolean hasNext() {
      return this.field_26782 < this.field_26780.size();
   }

   @Override
   public E next() {
      int var3 = this.field_26782;
      if (var3 < this.field_26780.size()) {
         this.field_26782 = var3 + 1;
         return (E)this.field_26780.get(this.field_26783 = var3);
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field_26783 >= 0) {
         this.field_26780.remove(this.field_26783);
         this.field_26781.remove(this.field_26783);
         this.field_26782 = this.field_26783;
         this.field_26783 = -1;
      } else {
         throw new IllegalStateException();
      }
   }
}
