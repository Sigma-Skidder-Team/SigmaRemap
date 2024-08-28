package mapped;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

public final class Class1792 implements Closeable {
   private static String[] field9664;
   private final String field9665;
   private final long field9666;
   private final Class1737[] field9667;
   private final long[] field9668;
   public final Class1756 field9669;

   public Class1792(Class1756 var1, String var2, long var3, Class1737[] var5, long[] var6) {
      this.field9669 = var1;
      this.field9665 = var2;
      this.field9666 = var3;
      this.field9667 = var5;
      this.field9668 = var6;
   }

   public String method7828() {
      return this.field9665;
   }

   @Nullable
   public Class7163 method7829() throws IOException {
      return this.field9669.method7684(this.field9665, this.field9666);
   }

   public Class1737 method7830(int var1) {
      return this.field9667[var1];
   }

   public long method7831(int var1) {
      return this.field9668[var1];
   }

   @Override
   public void close() {
      for (Class1737 var6 : this.field9667) {
         Class9474.method36535(var6);
      }
   }

   // $VF: synthetic method
   public static String method7832(Class1792 var0) {
      return var0.field9665;
   }
}
