package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class2354 implements Iterable<Class7380> {
   private static String[] field16163;
   public static final Class7380 field16164 = Blocks.AIR.method11579();
   private final Class2352<Class7380> field16165 = new Class2352<Class7380>(16);
   private int field16166;

   public Class2354() {
   }

   public int method9281(Class7380 var1) {
      int var4 = this.field16165.method9171(var1);
      if (var4 == -1) {
         var4 = this.field16166++;
         this.field16165.method9268(var1, var4);
      }

      return var4;
   }

   @Nullable
   public Class7380 method9282(int var1) {
      Class7380 var4 = this.field16165.method9172(var1);
      return var4 != null ? var4 : field16164;
   }

   @Override
   public Iterator<Class7380> iterator() {
      return this.field16165.iterator();
   }

   public void method9283(Class7380 var1, int var2) {
      this.field16165.method9268(var1, var2);
   }
}
