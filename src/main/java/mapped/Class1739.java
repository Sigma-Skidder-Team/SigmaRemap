package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class Class1739 implements Class1737 {
   private static final byte field9431 = 1;
   private static final byte field9432 = 2;
   private static final byte field9433 = 3;
   private static final byte field9434 = 4;
   private static final byte field9435 = 0;
   private static final byte field9436 = 1;
   private static final byte field9437 = 2;
   private static final byte field9438 = 3;
   private int field9439 = 0;
   private final Class1735 field9440;
   private final Inflater field9441;
   private final Class1738 field9442;
   private final CRC32 field9443 = new CRC32();

   public Class1739(Class1737 var1) {
      if (var1 != null) {
         this.field9441 = new Inflater(true);
         this.field9440 = Class7001.method21696(var1);
         this.field9442 = new Class1738(this.field9440, this.field9441);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (var2 != 0L) {
            if (this.field9439 == 0) {
               this.method7658();
               this.field9439 = 1;
            }

            if (this.field9439 == 1) {
               long var6 = var1.field9423;
               long var8 = this.field9442.method7633(var1, var2);
               if (var8 != -1L) {
                  this.method7660(var1, var6, var8);
                  return var8;
               }

               this.field9439 = 2;
            }

            if (this.field9439 == 2) {
               this.method7659();
               this.field9439 = 3;
               if (!this.field9440.method7583()) {
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

   private void method7658() throws IOException {
      this.field9440.method7584(10L);
      byte var3 = this.field9440.method7559().method7597(3L);
      boolean var4 = (var3 >> 1 & 1) == 1;
      if (var4) {
         this.method7660(this.field9440.method7559(), 0L, 10L);
      }

      short var5 = this.field9440.method7598();
      this.method7661("ID1ID2", 8075, var5);
      this.field9440.method7627(8L);
      if ((var3 >> 2 & 1) == 1) {
         this.field9440.method7584(2L);
         if (var4) {
            this.method7660(this.field9440.method7559(), 0L, 2L);
         }

         short var6 = this.field9440.method7559().method7601();
         this.field9440.method7584((long)var6);
         if (var4) {
            this.method7660(this.field9440.method7559(), 0L, (long)var6);
         }

         this.field9440.method7627((long)var6);
      }

      if ((var3 >> 3 & 1) == 1) {
         long var7 = this.field9440.method7634((byte)0);
         if (var7 == -1L) {
            throw new EOFException();
         }

         if (var4) {
            this.method7660(this.field9440.method7559(), 0L, var7 + 1L);
         }

         this.field9440.method7627(var7 + 1L);
      }

      if ((var3 >> 4 & 1) == 1) {
         long var9 = this.field9440.method7634((byte)0);
         if (var9 == -1L) {
            throw new EOFException();
         }

         if (var4) {
            this.method7660(this.field9440.method7559(), 0L, var9 + 1L);
         }

         this.field9440.method7627(var9 + 1L);
      }

      if (var4) {
         this.method7661("FHCRC", this.field9440.method7601(), (short)((int)this.field9443.getValue()));
         this.field9443.reset();
      }
   }

   private void method7659() throws IOException {
      this.method7661("CRC", this.field9440.method7602(), (int)this.field9443.getValue());
      this.method7661("ISIZE", this.field9440.method7602(), (int)this.field9441.getBytesWritten());
   }

   @Override
   public Class4916 method7541() {
      return this.field9440.method7541();
   }

   @Override
   public void close() throws IOException {
      this.field9442.close();
   }

   private void method7660(Class1734 var1, long var2, long var4) {
      Class9174 var8;
      for (var8 = var1.field9422; var2 >= (long)(var8.field42123 - var8.field42122); var8 = var8.field42126) {
         var2 -= (long)(var8.field42123 - var8.field42122);
      }

      while (var4 > 0L) {
         int var9 = (int)((long)var8.field42122 + var2);
         int var10 = (int)Math.min((long)(var8.field42123 - var9), var4);
         this.field9443.update(var8.field42121, var9, var10);
         var4 -= (long)var10;
         var2 = 0L;
         var8 = var8.field42126;
      }
   }

   private void method7661(String var1, int var2, int var3) throws IOException {
      if (var3 != var2) {
         throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", var1, var3, var2));
      }
   }
}
