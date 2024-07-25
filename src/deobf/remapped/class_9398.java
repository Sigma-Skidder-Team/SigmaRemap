package remapped;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class class_9398 implements class_4131 {
   private final class_3947 field_48033;
   private final Deflater field_48031;
   private final class_1000 field_48028;
   private boolean field_48030;
   private final CRC32 field_48032 = new CRC32();

   public class_9398(class_4131 var1) {
      if (var1 != null) {
         this.field_48031 = new Deflater(-1, true);
         this.field_48033 = class_1259.method_5670(var1);
         this.field_48028 = new class_1000(this.field_48033, this.field_48031);
         this.method_43485();
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (var2 != 0L) {
            this.method_43482(var1, var2);
            this.field_48028.method_19191(var1, var2);
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   @Override
   public void flush() throws IOException {
      this.field_48028.flush();
   }

   @Override
   public class_245 method_19192() {
      return this.field_48033.method_19192();
   }

   @Override
   public void close() throws IOException {
      if (!this.field_48030) {
         Throwable var3 = null;

         try {
            this.field_48028.method_4337();
            this.method_43484();
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field_48031.end();
         } catch (Throwable var7) {
            if (var3 == null) {
               var3 = var7;
            }
         }

         try {
            this.field_48033.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field_48030 = true;
         if (var3 != null) {
            class_189.method_826(var3);
         }
      }
   }

   public Deflater method_43483() {
      return this.field_48031;
   }

   private void method_43485() {
      class_7059 var3 = this.field_48033.method_18234();
      var3.method_32493(8075);
      var3.method_32494(8);
      var3.method_32494(0);
      var3.method_32456(0);
      var3.method_32494(0);
      var3.method_32494(0);
   }

   private void method_43484() throws IOException {
      this.field_48033.method_18241((int)this.field_48032.getValue());
      this.field_48033.method_18241((int)this.field_48031.getBytesRead());
   }

   private void method_43482(class_7059 var1, long var2) {
      for (class_7332 var6 = var1.field_36430; var2 > 0L; var6 = var6.field_37475) {
         int var7 = (int)Math.min(var2, (long)(var6.field_37484 - var6.field_37477));
         this.field_48032.update(var6.field_37478, var6.field_37477, var7);
         var2 -= (long)var7;
      }
   }
}
