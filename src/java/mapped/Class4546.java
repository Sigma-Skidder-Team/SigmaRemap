package mapped;

import java.util.Iterator;

public class Class4546 implements Iterator<Class7255> {
   private static String[] field21910;
   public final Class9205 field21911;
   public final Class9134 field21912;

   public Class4546(Class9134 var1, Class9205 var2) {
      this.field21912 = var1;
      this.field21911 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field21911.method34495();
   }

   public Class7255 next() {
      return this.field21911.method34496();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
