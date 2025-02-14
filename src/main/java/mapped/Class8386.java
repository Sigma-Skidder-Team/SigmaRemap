package mapped;

import java.util.concurrent.Callable;

public final class Class8386 implements Callable {
   private static String[] field35964;
   public final long field35965;
   public final long field35966;
   public final Class2385 field35967;

   public Class8386(long var1, long var3, Class2385 var5) {
      this.field35965 = var1;
      this.field35966 = var3;
      this.field35967 = var5;
   }

   public Long call() {
      long var3 = 0L;

      for (long var5 = this.field35965; var5 < this.field35966; var5++) {
         if (this.field35967.method9641(var5) == 1) {
            var3++;
         }
      }

      return var3;
   }
}
