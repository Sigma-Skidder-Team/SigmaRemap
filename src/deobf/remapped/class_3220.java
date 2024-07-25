package remapped;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class class_3220 extends Thread {
   private class_8356 field_16051 = null;
   private static final Charset field_16050 = Charset.forName("ASCII");
   private static final String field_16047 = "Content-Length";
   private static final char field_16049 = '\r';
   private static final char field_16046 = '\n';

   public class_3220(class_8356 var1) {
      super("HttpPipelineReceiver");
      this.field_16051 = var1;
   }

   @Override
   public void run() {
      while (!Thread.interrupted()) {
         class_9144 var3 = null;

         try {
            var3 = this.field_16051.method_38470();
            InputStream var4 = this.field_16051.method_38487();
            class_3548 var5 = this.method_14763(var4);
            this.field_16051.method_38471(var3, var5);
         } catch (InterruptedException var6) {
            return;
         } catch (Exception var7) {
            this.field_16051.method_38491(var3, var7);
         }
      }
   }

   private class_3548 method_14763(InputStream var1) throws IOException {
      String var4 = this.method_14764(var1);
      String[] var5 = class_3111.method_14302(var4, " ");
      if (var5.length >= 3) {
         String var6 = var5[0];
         int var7 = class_3111.method_14361(var5[1], 0);
         String var8 = var5[2];
         LinkedHashMap var9 = new LinkedHashMap();

         while (true) {
            String var10 = this.method_14764(var1);
            if (var10.length() <= 0) {
               byte[] var14 = null;
               String var15 = (String)var9.get("Content-Length");
               if (var15 == null) {
                  String var16 = (String)var9.get("Transfer-Encoding");
                  if (class_3111.equals(var16, "chunked")) {
                     var14 = this.method_14762(var1);
                  }
               } else {
                  int var17 = class_3111.method_14361(var15, -1);
                  if (var17 > 0) {
                     var14 = new byte[var17];
                     this.method_14761(var14, var1);
                  }
               }

               return new class_3548(var7, var4, var9, var14);
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

   private byte[] method_14762(InputStream var1) throws IOException {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();

      int var7;
      do {
         String var5 = this.method_14764(var1);
         String[] var6 = class_3111.method_14302(var5, "; ");
         var7 = Integer.parseInt(var6[0], 16);
         byte[] var8 = new byte[var7];
         this.method_14761(var8, var1);
         var4.write(var8);
         this.method_14764(var1);
      } while (var7 != 0);

      return var4.toByteArray();
   }

   private void method_14761(byte[] var1, InputStream var2) throws IOException {
      int var5 = 0;

      while (var5 < var1.length) {
         int var6 = var2.read(var1, var5, var1.length - var5);
         if (var6 < 0) {
            throw new EOFException();
         }

         var5 += var6;
      }
   }

   private String method_14764(InputStream var1) throws IOException {
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
      String var8 = new String(var9, field_16050);
      if (var6) {
         var8 = var8.substring(0, var8.length() - 2);
      }

      return var8;
   }
}
