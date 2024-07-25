package remapped;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class class_1000 implements class_4131 {
   private final class_3947 field_5165;
   private final Deflater field_5163;
   private boolean field_5164;

   public class_1000(class_4131 var1, Deflater var2) {
      this(class_1259.method_5670(var1), var2);
   }

   public class_1000(class_3947 var1, Deflater var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_5165 = var1;
            this.field_5163 = var2;
         } else {
            throw new IllegalArgumentException("inflater == null");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      class_189.method_830(var1.field_36433, 0L, var2);

      while (var2 > 0L) {
         class_7332 var6 = var1.field_36430;
         int var7 = (int)Math.min(var2, (long)(var6.field_37484 - var6.field_37477));
         this.field_5163.setInput(var6.field_37478, var6.field_37477, var7);
         this.method_4336(false);
         var1.field_36433 -= (long)var7;
         var6.field_37477 += var7;
         if (var6.field_37477 == var6.field_37484) {
            var1.field_36430 = var6.method_33414();
            class_420.method_2090(var6);
         }

         var2 -= (long)var7;
      }
   }

   @IgnoreJRERequirement
   private void method_4336(boolean var1) throws IOException {
      class_7059 var4 = this.field_5165.method_18234();

      while (true) {
         class_7332 var5 = var4.method_32473(1);
         int var6 = !var1
            ? this.field_5163.deflate(var5.field_37478, var5.field_37484, 8192 - var5.field_37484)
            : this.field_5163.deflate(var5.field_37478, var5.field_37484, 8192 - var5.field_37484, 2);
         if (var6 <= 0) {
            if (this.field_5163.needsInput()) {
               if (var5.field_37477 == var5.field_37484) {
                  var4.field_36430 = var5.method_33414();
                  class_420.method_2090(var5);
               }

               return;
            }
         } else {
            var5.field_37484 += var6;
            var4.field_36433 += (long)var6;
            this.field_5165.method_18243();
         }
      }
   }

   @Override
   public void flush() throws IOException {
      this.method_4336(true);
      this.field_5165.flush();
   }

   public void method_4337() throws IOException {
      this.field_5163.finish();
      this.method_4336(false);
   }

   @Override
   public void close() throws IOException {
      if (!this.field_5164) {
         Throwable var3 = null;

         try {
            this.method_4337();
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field_5163.end();
         } catch (Throwable var7) {
            if (var3 == null) {
               var3 = var7;
            }
         }

         try {
            this.field_5165.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field_5164 = true;
         if (var3 != null) {
            class_189.method_826(var3);
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_5165.method_19192();
   }

   @Override
   public String toString() {
      return "DeflaterSink(" + this.field_5165 + ")";
   }
}
