package mapped;

import java.io.IOException;

public class Class1748 implements Class1737 {
   public final Class1737 field9470;
   public final Class4918 field9471;

   public Class1748(Class4918 var1, Class1737 var2) {
      this.field9471 = var1;
      this.field9470 = var2;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      boolean var6 = false;
      this.field9471.method15219();

      long var9;
      try {
         long var7 = this.field9470.method7633(var1, var2);
         var6 = true;
         var9 = var7;
      } catch (IOException var15) {
         throw this.field9471.method15228(var15);
      } finally {
         this.field9471.method15227(var6);
      }

      return var9;
   }

   @Override
   public void close() throws IOException {
      boolean var3 = false;

      try {
         this.field9470.close();
         var3 = true;
      } catch (IOException var8) {
         throw this.field9471.method15228(var8);
      } finally {
         this.field9471.method15227(var3);
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9471;
   }

   @Override
   public String toString() {
      return "AsyncTimeout.source(" + this.field9470 + ")";
   }
}
