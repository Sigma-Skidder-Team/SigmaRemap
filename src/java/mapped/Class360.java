package mapped;

import net.optifine.Config;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class Class360 extends Thread {
   private Class9433 field1594 = null;
   private static final Charset field1595 = Charset.forName("ASCII");
   private static final String field1596 = "Content-Length";
   private static final char field1597 = '\r';
   private static final char field1598 = '\n';

   public Class360(Class9433 var1) {
      super("HttpPipelineReceiver");
      this.field1594 = var1;
   }

   @Override
   public void run() {
      while (!Thread.interrupted()) {
         Class9638 var3 = null;

         try {
            var3 = this.field1594.method36214();
            InputStream var4 = this.field1594.method36212();
            Class8075 var5 = this.method1825(var4);
            this.field1594.method36219(var3, var5);
         } catch (InterruptedException var6) {
            return;
         } catch (Exception var7) {
            this.field1594.method36224(var3, var7);
         }
      }
   }

   private Class8075 method1825(InputStream var1) throws IOException {
      String var4 = this.method1828(var1);
      String[] var5 = Config.method26903(var4, " ");
      if (var5.length >= 3) {
         String var6 = var5[0];
         int var7 = Config.method26899(var5[1], 0);
         String var8 = var5[2];
         LinkedHashMap var9 = new LinkedHashMap();

         while (true) {
            String var10 = this.method1828(var1);
            if (var10.length() <= 0) {
               byte[] var14 = null;
               String var15 = (String)var9.get("Content-Length");
               if (var15 == null) {
                  String var16 = (String)var9.get("Transfer-Encoding");
                  if (Config.equals(var16, "chunked")) {
                     var14 = this.method1826(var1);
                  }
               } else {
                  int var17 = Config.method26899(var15, -1);
                  if (var17 > 0) {
                     var14 = new byte[var17];
                     this.method1827(var14, var1);
                  }
               }

               return new Class8075(var7, var4, var9, var14);
            }

            int var11 = var10.indexOf(":");
            if (var11 > 0) {
               String var12 = var10.substring(0, var11).trim();
               String var13 = var10.substring(var11 + 1).trim();
               var9.put(var12, var13);
            }
         }
      } else {
         throw new IOException("Invalid status line: " + var4);
      }
   }

   private byte[] method1826(InputStream var1) throws IOException {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();

      int var7;
      do {
         String var5 = this.method1828(var1);
         String[] var6 = Config.method26903(var5, "; ");
         var7 = Integer.parseInt(var6[0], 16);
         byte[] var8 = new byte[var7];
         this.method1827(var8, var1);
         var4.write(var8);
         this.method1828(var1);
      } while (var7 != 0);

      return var4.toByteArray();
   }

   private void method1827(byte[] var1, InputStream var2) throws IOException {
      int var5 = 0;

      while (var5 < var1.length) {
         int var6 = var2.read(var1, var5, var1.length - var5);
         if (var6 < 0) {
            throw new EOFException();
         }

         var5 += var6;
      }
   }

   private String method1828(InputStream var1) throws IOException {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      int var5 = -1;
      boolean var6 = false;

      while (true) {
         int var7 = var1.read();
         if (var7 < 0) {
            break;
         }

         var4.write(var7);
         if (var5 == 13 && var7 == 10) {
            var6 = true;
            break;
         }

         var5 = var7;
      }

      byte[] var9 = var4.toByteArray();
      String var8 = new String(var9, field1595);
      if (var6) {
         var8 = var8.substring(0, var8.length() - 2);
      }

      return var8;
   }
}
