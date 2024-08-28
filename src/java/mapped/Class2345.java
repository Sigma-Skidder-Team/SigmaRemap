package mapped;

import java.util.Iterator;

public class Class2345 implements Iterable<Object> {
   private static String[] field16027;
   private Iterator<Object> field16028;

   public Class2345(Iterator<Object> var1) {
      this.field16028 = var1;
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field16028;
   }
}
