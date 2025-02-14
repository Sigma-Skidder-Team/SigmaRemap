package mapped;

import java.util.Iterator;

public class Class4541 implements Iterator<Object> {
   private static String[] field21889;
   public final Class9134 field21890;

   public Class4541(Class9134 var1) {
      this.field21890 = var1;
   }

   @Override
   public boolean hasNext() {
      return this.field21890.field41975.method19158();
   }

   @Override
   public Object next() {
      return this.field21890.field41975.method19159();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
