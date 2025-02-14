package mapped;

import java.util.Iterator;

public class Class4540<T> implements Iterator<Class7678<T>> {
   private static String[] field21886;
   public Class7678<T> field21887;
   public final Class9380 field21888;

   public Class4540(Class9380 var1) {
      this.field21888 = var1;
      this.field21887 = this.field21888.method35603();
   }

   @Override
   public boolean hasNext() {
      return this.field21887 != null;
   }

   public Class7678<T> next() {
      Class7678 var3 = this.field21887;
      if (this.field21887 != null) {
         this.field21887 = Class7678.method25263(this.field21887);
      }

      return var3;
   }
}
