package remapped;

import java.io.IOException;

public abstract class class_1214 implements AutoCloseable {
   public boolean field_6755;

   private class_1214() {
   }

   public int method_5383(long var1, long var3, int var5) {
      try {
         return this.method_5382(var3, var5);
      } catch (IOException var9) {
         this.field_6755 = true;
         return 0;
      }
   }

   public void method_5387(long var1, int var3) {
      try {
         this.method_5384(var3);
      } catch (IOException var7) {
         this.field_6755 = true;
      }
   }

   public int method_5385(long var1) {
      return !this.field_6755 ? 0 : 1;
   }

   public abstract int method_5382(long var1, int var3) throws IOException;

   public abstract void method_5384(int var1) throws IOException;

   @Override
   public abstract void close() throws IOException;
}
