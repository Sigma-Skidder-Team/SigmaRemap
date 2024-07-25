package remapped;

import java.util.Iterator;

public class class_2390 implements Iterable<class_1621> {
   private static String[] field_11918;
   private Iterator<class_1621> field_11917;

   public class_2390(Iterator<class_1621> var1) {
      this.field_11917 = var1;
   }

   @Override
   public Iterator<class_1621> iterator() {
      return this.field_11917;
   }
}
