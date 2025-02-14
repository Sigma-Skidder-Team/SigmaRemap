package mapped;

import java.util.Iterator;

public class Class2346 implements Iterable<Object> {
   private static String[] field16029;
   private Iterator<Object> field16030;

   public Class2346(Iterator<Object> var1) {
      this.field16030 = var1;
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field16030;
   }
}
