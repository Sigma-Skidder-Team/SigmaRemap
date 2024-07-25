package remapped;

import java.io.IOException;

public class class_3417 implements class_5322 {
   public class_3417(class_1353 var1, class_5322 var2) {
      this.field_16820 = var1;
      this.field_16819 = var2;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      boolean var6 = false;
      this.field_16820.method_6243();

      long var9;
      try {
         long var7 = this.field_16819.method_24273(var1, var2);
         var6 = true;
         var9 = var7;
      } catch (IOException var15) {
         throw this.field_16820.method_6250(var15);
      } finally {
         this.field_16820.method_6251(var6);
      }

      return var9;
   }

   @Override
   public void close() throws IOException {
      boolean var3 = false;

      try {
         this.field_16819.close();
         var3 = true;
      } catch (IOException var8) {
         throw this.field_16820.method_6250(var8);
      } finally {
         this.field_16820.method_6251(var3);
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_16820;
   }

   @Override
   public String toString() {
      return "AsyncTimeout.source(" + this.field_16819 + ")";
   }
}
