package mapped;

import java.util.AbstractList;
import java.util.RandomAccess;

public final class Class43 extends AbstractList<Class2003> implements RandomAccess {
   private static String[] field93;
   public final Class2003[] field94;

   private Class43(Class2003[] var1) {
      this.field94 = var1;
   }

   public static Class43 of(Class2003... var0) {
      return new Class43((Class2003[])var0.clone());
   }

   public Class2003 get(int var1) {
      return this.field94[var1];
   }

   @Override
   public int size() {
      return this.field94.length;
   }
}
