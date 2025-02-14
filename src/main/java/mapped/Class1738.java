package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class Class1738 implements Class1737 {
   private final Class1735 field9427;
   private final Inflater field9428;
   private int field9429;
   private boolean field9430;

   public Class1738(Class1737 var1, Inflater var2) {
      this(Class7001.method21696(var1), var2);
   }

   public Class1738(Class1735 var1, Inflater var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field9427 = var1;
            this.field9428 = var2;
         } else {
            throw new IllegalArgumentException("inflater == null");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (this.field9430) {
         throw new IllegalStateException("closed");
      } else if (var2 == 0L) {
         return 0L;
      } else {
         while (true) {
            boolean var6 = this.method7656();

            try {
               Class9174 var7 = var1.method7632(1);
               int var8 = this.field9428.inflate(var7.field42121, var7.field42123, 8192 - var7.field42123);
               if (var8 > 0) {
                  var7.field42123 += var8;
                  var1.field9423 += (long)var8;
                  return (long)var8;
               }

               if (this.field9428.finished() || this.field9428.needsDictionary()) {
                  this.method7657();
                  if (var7.field42122 == var7.field42123) {
                     var1.field9422 = var7.method34280();
                     Class5996.method18608(var7);
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

   public boolean method7656() throws IOException {
      if (this.field9428.needsInput()) {
         this.method7657();
         if (this.field9428.getRemaining() == 0) {
            if (!this.field9427.method7583()) {
               Class9174 var3 = this.field9427.method7559().field9422;
               this.field9429 = var3.field42123 - var3.field42122;
               this.field9428.setInput(var3.field42121, var3.field42122, this.field9429);
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

   private void method7657() throws IOException {
      if (this.field9429 != 0) {
         int var3 = this.field9429 - this.field9428.getRemaining();
         this.field9429 -= var3;
         this.field9427.method7627((long)var3);
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9427.method7541();
   }

   @Override
   public void close() throws IOException {
      if (!this.field9430) {
         this.field9428.end();
         this.field9430 = true;
         this.field9427.close();
      }
   }
}
