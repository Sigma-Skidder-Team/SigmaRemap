package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class class_5478 implements class_5322 {
   private final class_8067 field_27906;
   private final Inflater field_27903;
   private int field_27905;
   private boolean field_27904;

   public class_5478(class_5322 var1, Inflater var2) {
      this(class_1259.method_5671(var1), var2);
   }

   public class_5478(class_8067 var1, Inflater var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_27906 = var1;
            this.field_27903 = var2;
         } else {
            throw new IllegalArgumentException("inflater == null");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (this.field_27904) {
         throw new IllegalStateException("closed");
      } else if (var2 == 0L) {
         return 0L;
      } else {
         while (true) {
            boolean var6 = this.method_24897();

            try {
               class_7332 var7 = var1.method_32473(1);
               int var8 = this.field_27903.inflate(var7.field_37478, var7.field_37484, 8192 - var7.field_37484);
               if (var8 > 0) {
                  var7.field_37484 += var8;
                  var1.field_36433 += (long)var8;
                  return (long)var8;
               }

               if (this.field_27903.finished() || this.field_27903.needsDictionary()) {
                  this.method_24896();
                  if (var7.field_37477 == var7.field_37484) {
                     var1.field_36430 = var7.method_33414();
                     class_420.method_2090(var7);
                  }

                  return -1L;
               }

               if (var6) {
                  throw new EOFException("source exhausted prematurely");
               }
            } catch (DataFormatException var9) {
               throw new IOException(var9);
            }
         }
      }
   }

   public boolean method_24897() throws IOException {
      if (this.field_27903.needsInput()) {
         this.method_24896();
         if (this.field_27903.getRemaining() == 0) {
            if (!this.field_27906.method_36605()) {
               class_7332 var3 = this.field_27906.method_18234().field_36430;
               this.field_27905 = var3.field_37484 - var3.field_37477;
               this.field_27903.setInput(var3.field_37478, var3.field_37477, this.field_27905);
               return false;
            } else {
               return true;
            }
         } else {
            throw new IllegalStateException("?");
         }
      } else {
         return false;
      }
   }

   private void method_24896() throws IOException {
      if (this.field_27905 != 0) {
         int var3 = this.field_27905 - this.field_27903.getRemaining();
         this.field_27905 -= var3;
         this.field_27906.method_36583((long)var3);
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_27906.method_19192();
   }

   @Override
   public void close() throws IOException {
      if (!this.field_27904) {
         this.field_27903.end();
         this.field_27904 = true;
         this.field_27906.close();
      }
   }
}
