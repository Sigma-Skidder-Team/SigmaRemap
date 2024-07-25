package remapped;

import java.util.Iterator;

public class class_4504 implements Iterator<class_1621> {
   private static String[] field_22030;

   public class_4504(class_7151 var1, class_7464 var2) {
      this.field_22029 = var1;
      this.field_22028 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field_22028.method_33976();
   }

   public class_1621 next() {
      return this.field_22028.method_33973();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
