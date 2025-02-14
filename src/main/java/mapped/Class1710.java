package mapped;

import java.io.IOException;

public abstract class Class1710 implements AutoCloseable {
   public boolean field9316;

   public int method7449(long var1, long var3, int var5) {
      try {
         return this.method7452(var3, var5);
      } catch (IOException var9) {
         this.field9316 = true;
         return 0;
      }
   }

   public void method7450(long var1, int var3) {
      try {
         this.method7453(var3);
      } catch (IOException var7) {
         this.field9316 = true;
      }
   }

   public int method7451(long var1) {
      return !this.field9316 ? 0 : 1;
   }

   public abstract int method7452(long var1, int var3) throws IOException;

   public abstract void method7453(int var1) throws IOException;

   @Override
   public abstract void close() throws IOException;
}
