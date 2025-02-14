package mapped;

import java.util.Iterator;

public class Class48 implements Iterable<Class7255> {
   private static String[] field98;
   private Iterator<Class7255> field99;

   public Class48(Iterator<Class7255> var1) {
      this.field99 = var1;
   }

   @Override
   public Iterator<Class7255> iterator() {
      return this.field99;
   }
}
