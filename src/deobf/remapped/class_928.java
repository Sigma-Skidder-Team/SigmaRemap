package remapped;

import java.util.Iterator;

public class class_928 implements Iterable<class_8087> {
   private static String[] field_4760;
   private Iterator<class_8087> field_4759;

   public class_928(Iterator<class_8087> var1) {
      this.field_4759 = var1;
   }

   @Override
   public Iterator<class_8087> iterator() {
      return this.field_4759;
   }
}
