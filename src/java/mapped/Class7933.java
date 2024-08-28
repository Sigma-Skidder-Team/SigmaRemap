package mapped;

import java.io.EOFException;
import java.io.IOException;

public final class Class7933 implements Class7932 {
   private static final int field34005 = 0;
   private static final int field34006 = 1;
   private static final int field34007 = 2;
   private static final int field34008 = 3;
   private static final int field34009 = 4;
   private static final int field34010 = 5;
   private static final int field34011 = 6;
   public final Class2391 field34012;
   public final Class5751 field34013;
   public final Class1735 field34014;
   public final Class1733 field34015;
   public int field34016 = 0;

   public Class7933(Class2391 var1, Class5751 var2, Class1735 var3, Class1733 var4) {
      this.field34012 = var1;
      this.field34013 = var2;
      this.field34014 = var3;
      this.field34015 = var4;
   }

   @Override
   public Class1716 method26665(Class8223 var1, long var2) {
      if (!"chunked".equalsIgnoreCase(var1.method28615("Transfer-Encoding"))) {
         if (var2 == -1L) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
         } else {
            return this.method26679(var2);
         }
      } else {
         return this.method26678();
      }
   }

   @Override
   public void method26673() {
      Class7263 var3 = this.field34013.method17932();
      if (var3 != null) {
         var3.method22813();
      }
   }

   @Override
   public void method26666(Class8223 var1) throws IOException {
      String var4 = Class8797.method31759(var1, this.field34013.method17932().method22812().method25540().type());
      this.method26676(var1.method28614(), var4);
   }

   @Override
   public Class1793 method26672(Class1797 var1) throws IOException {
      Class1737 var4 = this.method26674(var1);
      return new Class1796(var1.method7853(), Class7001.method21696(var4));
   }

   private Class1737 method26674(Class1797 var1) throws IOException {
      if (Class8394.method29453(var1)) {
         if (!"chunked".equalsIgnoreCase(var1.method7851("Transfer-Encoding"))) {
            long var4 = Class8394.method29441(var1);
            return var4 == -1L ? this.method26682() : this.method26680(var4);
         } else {
            return this.method26681(var1.method7844().method28612());
         }
      } else {
         return this.method26680(0L);
      }
   }

   public boolean method26675() {
      return this.field34016 == 6;
   }

   @Override
   public void method26667() throws IOException {
      this.field34015.flush();
   }

   @Override
   public void method26668() throws IOException {
      this.field34015.flush();
   }

   public void method26676(Class9371 var1, String var2) throws IOException {
      if (this.field34016 != 0) {
         throw new IllegalStateException("state: " + this.field34016);
      } else {
         this.field34015.method7565(var2).method7565("\r\n");
         int var5 = 0;

         for (int var6 = var1.method35546(); var5 < var6; var5++) {
            this.field34015.method7565(var1.method35547(var5)).method7565(": ").method7565(var1.method35548(var5)).method7565("\r\n");
         }

         this.field34015.method7565("\r\n");
         this.field34016 = 1;
      }
   }

   @Override
   public Class9279 method26669(boolean var1) throws IOException {
      if (this.field34016 != 1 && this.field34016 != 3) {
         throw new IllegalStateException("state: " + this.field34016);
      } else {
         try {
            Class9776 var4 = Class9776.method38545(this.field34014.method7617());
            Class9279 var7 = new Class9279()
               .method34978(var4.field45730)
               .method34979(var4.field45731)
               .method34980(var4.field45732)
               .method34985(this.method26677());
            if (var1 && var4.field45731 == 100) {
               return null;
            } else {
               this.field34016 = 4;
               return var7;
            }
         } catch (EOFException var6) {
            IOException var5 = new IOException("unexpected end of stream on " + this.field34013);
            var5.initCause(var6);
            throw var5;
         }
      }
   }

   public Class9371 method26677() throws IOException {
      Class9192 var3 = new Class9192();

      String var4;
      while ((var4 = this.field34014.method7617()).length() != 0) {
         Class6605.field29047.method20014(var3, var4);
      }

      return var3.method34442();
   }

   public Class1716 method26678() {
      if (this.field34016 == 1) {
         this.field34016 = 2;
         return new Class1719(this);
      } else {
         throw new IllegalStateException("state: " + this.field34016);
      }
   }

   public Class1716 method26679(long var1) {
      if (this.field34016 == 1) {
         this.field34016 = 2;
         return new Class1718(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field34016);
      }
   }

   public Class1737 method26680(long var1) throws IOException {
      if (this.field34016 == 4) {
         this.field34016 = 5;
         return new Class1751(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field34016);
      }
   }

   public Class1737 method26681(Class7284 var1) throws IOException {
      if (this.field34016 == 4) {
         this.field34016 = 5;
         return new Class1750(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field34016);
      }
   }

   public Class1737 method26682() throws IOException {
      if (this.field34016 == 4) {
         if (this.field34013 != null) {
            this.field34016 = 5;
            this.field34013.method17934();
            return new Class1752(this);
         } else {
            throw new IllegalStateException("streamAllocation == null");
         }
      } else {
         throw new IllegalStateException("state: " + this.field34016);
      }
   }

   public void method26683(Class4921 var1) {
      Class4916 var4 = var1.method15232();
      var1.method15233(Class4916.field22810);
      var4.method15216();
      var4.method15215();
   }
}
