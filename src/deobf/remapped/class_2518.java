package remapped;

import java.util.Iterator;

public class class_2518 implements Iterator<Object> {
   private static String[] field_12479;

   public class_2518(class_7151 var1) {
      this.field_12480 = var1;
   }

   @Override
   public boolean hasNext() {
      return this.field_12480.field_36829.method_42420();
   }

   @Override
   public Object next() {
      return this.field_12480.field_36829.method_42404();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
