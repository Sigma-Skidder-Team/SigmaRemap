package remapped;

import java.util.Iterator;

public class class_5653 implements Iterable<Object> {
   private static String[] field_28672;
   private Iterator<Object> field_28673;

   public class_5653(Iterator<Object> var1) {
      this.field_28673 = var1;
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field_28673;
   }
}
