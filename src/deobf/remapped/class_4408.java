package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class class_4408 implements class_5322 {
   private static final byte field_21582 = 1;
   private static final byte field_21577 = 2;
   private static final byte field_21576 = 3;
   private static final byte field_21580 = 4;
   private static final byte field_21581 = 0;
   private static final byte field_21572 = 1;
   private static final byte field_21575 = 2;
   private static final byte field_21578 = 3;
   private int field_21584 = 0;
   private final class_8067 field_21571;
   private final Inflater field_21579;
   private final class_5478 field_21573;
   private final CRC32 field_21574 = new CRC32();

   public class_4408(class_5322 var1) {
      if (var1 != null) {
         this.field_21579 = new Inflater(true);
         this.field_21571 = class_1259.method_5671(var1);
         this.field_21573 = new class_5478(this.field_21571, this.field_21579);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (var2 != 0L) {
            if (this.field_21584 == 0) {
               this.method_20539();
               this.field_21584 = 1;
            }

            if (this.field_21584 == 1) {
               long var6 = var1.field_36433;
               long var8 = this.field_21573.method_24273(var1, var2);
               if (var8 != -1L) {
                  this.method_20538(var1, var6, var8);
                  return var8;
               }

               this.field_21584 = 2;
            }

            if (this.field_21584 == 2) {
               this.method_20537();
               this.field_21584 = 3;
               if (!this.field_21571.method_36605()) {
                  throw new IOException("gzip finished without exhausting source");
               }
            }

            return -1L;
         } else {
            return 0L;
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   private void method_20539() throws IOException {
      this.field_21571.method_36608(10L);
      byte var3 = this.field_21571.method_18234().method_32485(3L);
      boolean var4 = (var3 >> 1 & 1) == 1;
      if (var4) {
         this.method_20538(this.field_21571.method_18234(), 0L, 10L);
      }

      short var5 = this.field_21571.method_36588();
      this.method_20541("ID1ID2", 8075, var5);
      this.field_21571.method_36583(8L);
      if ((var3 >> 2 & 1) == 1) {
         this.field_21571.method_36608(2L);
         if (var4) {
            this.method_20538(this.field_21571.method_18234(), 0L, 2L);
         }

         short var6 = this.field_21571.method_18234().method_36582();
         this.field_21571.method_36608((long)var6);
         if (var4) {
            this.method_20538(this.field_21571.method_18234(), 0L, (long)var6);
         }

         this.field_21571.method_36583((long)var6);
      }

      if ((var3 >> 3 & 1) == 1) {
         long var7 = this.field_21571.method_36609((byte)0);
         if (var7 == -1L) {
            throw new EOFException();
         }

         if (var4) {
            this.method_20538(this.field_21571.method_18234(), 0L, var7 + 1L);
         }

         this.field_21571.method_36583(var7 + 1L);
      }

      if ((var3 >> 4 & 1) == 1) {
         long var9 = this.field_21571.method_36609((byte)0);
         if (var9 == -1L) {
            throw new EOFException();
         }

         if (var4) {
            this.method_20538(this.field_21571.method_18234(), 0L, var9 + 1L);
         }

         this.field_21571.method_36583(var9 + 1L);
      }

      if (var4) {
         this.method_20541("FHCRC", this.field_21571.method_36582(), (short)((int)this.field_21574.getValue()));
         this.field_21574.reset();
      }
   }

   private void method_20537() throws IOException {
      this.method_20541("CRC", this.field_21571.method_36604(), (int)this.field_21574.getValue());
      this.method_20541("ISIZE", this.field_21571.method_36604(), (int)this.field_21579.getBytesWritten());
   }

   @Override
   public class_245 method_19192() {
      return this.field_21571.method_19192();
   }

   @Override
   public void close() throws IOException {
      this.field_21573.close();
   }

   private void method_20538(class_7059 var1, long var2, long var4) {
      class_7332 var8;
      for (var8 = var1.field_36430; var2 >= (long)(var8.field_37484 - var8.field_37477); var8 = var8.field_37475) {
         var2 -= (long)(var8.field_37484 - var8.field_37477);
      }

      while (var4 > 0L) {
         int var9 = (int)((long)var8.field_37477 + var2);
         int var10 = (int)Math.min((long)(var8.field_37484 - var9), var4);
         this.field_21574.update(var8.field_37478, var9, var10);
         var4 -= (long)var10;
         var2 = 0L;
         var8 = var8.field_37475;
      }
   }

   private void method_20541(String var1, int var2, int var3) throws IOException {
      if (var3 != var2) {
         throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", var1, var3, var2));
      }
   }
}
