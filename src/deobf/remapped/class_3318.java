package remapped;

import java.util.Iterator;
import java.util.ListIterator;

public class class_3318 implements Iterator {
   private static String[] field_16391;

   public class_3318(class_1701 var1, ListIterator var2) {
      this.field_16392 = var1;
      this.field_16393 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field_16393.hasPrevious();
   }

   @Override
   public Object next() {
      return this.field_16393.previous();
   }

   @Override
   public void remove() {
      this.field_16393.remove();
   }
}
