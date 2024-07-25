package remapped;

import java.io.IOException;

public final class class_5326 implements class_4131 {
   public int field_27175;
   public long field_27176;
   public boolean field_27171;
   public boolean field_27173;

   public class_5326(class_1308 var1) {
      this.field_27172 = var1;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (this.field_27173) {
         throw new IOException("closed");
      } else {
         this.field_27172.field_7230.method_19191(var1, var2);
         boolean var6 = this.field_27171 && this.field_27176 != -1L && this.field_27172.field_7230.method_32468() > this.field_27176 - 8192L;
         long var7 = this.field_27172.field_7230.method_32467();
         if (var7 > 0L && !var6) {
            synchronized (this.field_27172) {
               this.field_27172.method_5954(this.field_27175, var7, this.field_27171, false);
            }

            this.field_27171 = false;
         }
      }
   }

   @Override
   public void flush() throws IOException {
      if (this.field_27173) {
         throw new IOException("closed");
      } else {
         synchronized (this.field_27172) {
            this.field_27172.method_5954(this.field_27175, this.field_27172.field_7230.method_32468(), this.field_27171, false);
         }

         this.field_27171 = false;
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_27172.field_7229.method_19192();
   }

   @Override
   public void close() throws IOException {
      if (this.field_27173) {
         throw new IOException("closed");
      } else {
         synchronized (this.field_27172) {
            this.field_27172.method_5954(this.field_27175, this.field_27172.field_7230.method_32468(), this.field_27171, true);
         }

         this.field_27173 = true;
         this.field_27172.field_7234 = false;
      }
   }
}
