package mapped;

import java.util.Iterator;
import java.util.ListIterator;

public class Class4557 implements Iterator {
   private static String[] field21982;
   public final ListIterator field21983;
   public final Class7301 field21984;

   public Class4557(Class7301 var1, ListIterator var2) {
      this.field21984 = var1;
      this.field21983 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field21983.hasPrevious();
   }

   @Override
   public Object next() {
      return this.field21983.previous();
   }

   @Override
   public void remove() {
      this.field21983.remove();
   }
}
