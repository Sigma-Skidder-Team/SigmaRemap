package mapped;

import java.util.Iterator;

public class Class4549 implements Iterator<Class5931> {
   private static String[] field21919;
   public final Class6981 field21920;
   public final Class9134 field21921;

   public Class4549(Class9134 var1, Class6981 var2) {
      this.field21921 = var1;
      this.field21920 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field21920.method21552() != null;
   }

   public Class5931 next() {
      return this.field21920.method21553();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
