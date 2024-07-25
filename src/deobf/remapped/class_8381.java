package remapped;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8381 extends class_8379 {
   private static final Logger field_42890 = LogManager.getLogger();
   private boolean field_42888;
   private final Socket field_42891;
   private final byte[] field_42892 = new byte[1460];
   private final String field_42889;
   private final class_8685 field_42887;

   public class_8381(class_8685 var1, String var2, Socket var3) {
      super("RCON Client " + var3.getInetAddress());
      this.field_42887 = var1;
      this.field_42891 = var3;

      try {
         this.field_42891.setSoTimeout(0);
      } catch (Exception var7) {
         this.field_42882 = false;
      }

      this.field_42889 = var2;
   }

   @Override
   public void run() {
      try {
         while (this.field_42882) {
            BufferedInputStream var3 = new BufferedInputStream(this.field_42891.getInputStream());
            int var4 = var3.read(this.field_42892, 0, 1460);
            if (10 > var4) {
               return;
            }

            int var5 = 0;
            int var6 = class_4517.method_20986(this.field_42892, 0, var4);
            if (var6 != var4 - 4) {
               return;
            }

            var5 += 4;
            int var7 = class_4517.method_20986(this.field_42892, var5, var4);
            var5 += 4;
            int var8 = class_4517.method_20987(this.field_42892, var5);
            var5 += 4;
            switch (var8) {
               case 2:
                  if (this.field_42888) {
                     String var23 = class_4517.method_20988(this.field_42892, var5, var4);

                     try {
                        this.method_38631(var7, this.field_42887.method_39877(var23));
                     } catch (Exception var16) {
                        this.method_38631(var7, "Error executing: " + var23 + " (" + var16.getMessage() + ")");
                     }
                     break;
                  }

                  this.method_38629();
                  break;
               case 3:
                  String var9 = class_4517.method_20988(this.field_42892, var5, var4);
                  int var10 = var5 + var9.length();
                  if (!var9.isEmpty() && var9.equals(this.field_42889)) {
                     this.field_42888 = true;
                     this.method_38630(var7, 2, "");
                     break;
                  }

                  this.field_42888 = false;
                  this.method_38629();
                  break;
               default:
                  this.method_38631(var7, String.format("Unknown request %s", Integer.toHexString(var8)));
            }
         }
      } catch (IOException var17) {
      } catch (Exception var18) {
         field_42890.error("Exception whilst parsing RCON input", var18);
      } finally {
         this.method_38632();
         field_42890.info("Thread {} shutting down", this.field_42880);
         this.field_42882 = false;
      }
   }

   private void method_38630(int var1, int var2, String var3) throws IOException {
      ByteArrayOutputStream var6 = new ByteArrayOutputStream(1248);
      DataOutputStream var7 = new DataOutputStream(var6);
      byte[] var8 = var3.getBytes(StandardCharsets.UTF_8);
      var7.writeInt(Integer.reverseBytes(var8.length + 10));
      var7.writeInt(Integer.reverseBytes(var1));
      var7.writeInt(Integer.reverseBytes(var2));
      var7.write(var8);
      var7.write(0);
      var7.write(0);
      this.field_42891.getOutputStream().write(var6.toByteArray());
   }

   private void method_38629() throws IOException {
      this.method_38630(-1, 2, "");
   }

   private void method_38631(int var1, String var2) throws IOException {
      int var5 = var2.length();

      do {
         int var6 = 4096 > var5 ? var5 : 4096;
         this.method_38630(var1, 0, var2.substring(0, var6));
         var2 = var2.substring(var6);
         var5 = var2.length();
      } while (0 != var5);
   }

   @Override
   public void method_38623() {
      this.field_42882 = false;
      this.method_38632();
      super.method_38623();
   }

   private void method_38632() {
      try {
         this.field_42891.close();
      } catch (IOException var4) {
         field_42890.warn("Failed to close socket", var4);
      }
   }
}
