package remapped;

import java.util.Iterator;

public class class_7083 implements Iterable<Object> {
   private static String[] field_36572;
   private Iterator<Object> field_36571;

   public class_7083(Iterator<Object> var1) {
      this.field_36571 = var1;
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field_36571;
   }
}
