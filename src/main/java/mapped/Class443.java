package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Class443 extends Class440 {
   private static final Logger field2005 = LogManager.getLogger();
   private boolean field2006;
   private final Socket field2007;
   private final byte[] field2008 = new byte[1460];
   private final String field2009;
   private final Class1646 field2010;

   public Class443(Class1646 var1, String var2, Socket var3) {
      super("RCON Client " + var3.getInetAddress());
      this.field2010 = var1;
      this.field2007 = var3;

      try {
         this.field2007.setSoTimeout(0);
      } catch (Exception var7) {
         this.field1982 = false;
      }

      this.field2009 = var2;
   }

   @Override
   public void run() {
      try {
         while (this.field1982) {
            BufferedInputStream var3 = new BufferedInputStream(this.field2007.getInputStream());
            int var4 = var3.read(this.field2008, 0, 1460);
            if (10 > var4) {
               return;
            }

            int var5 = 0;
            int var6 = Class8414.method29544(this.field2008, 0, var4);
            if (var6 != var4 - 4) {
               return;
            }

            var5 += 4;
            int var7 = Class8414.method29544(this.field2008, var5, var4);
            var5 += 4;
            int var8 = Class8414.method29543(this.field2008, var5);
            var5 += 4;
            switch (var8) {
               case 2:
                  if (this.field2006) {
                     String var23 = Class8414.method29542(this.field2008, var5, var4);

                     try {
                        this.method1887(var7, this.field2010.handleRConCommand(var23));
                     } catch (Exception var16) {
                        this.method1887(var7, "Error executing: " + var23 + " (" + var16.getMessage() + ")");
                     }
                     break;
                  }

                  this.method1886();
                  break;
               case 3:
                  String var9 = Class8414.method29542(this.field2008, var5, var4);
                  int var10 = var5 + var9.length();
                  if (!var9.isEmpty() && var9.equals(this.field2009)) {
                     this.field2006 = true;
                     this.method1885(var7, 2, "");
                     break;
                  }

                  this.field2006 = false;
                  this.method1886();
                  break;
               default:
                  this.method1887(var7, String.format("Unknown request %s", Integer.toHexString(var8)));
            }
         }
      } catch (IOException var17) {
      } catch (Exception var18) {
         field2005.error("Exception whilst parsing RCON input", var18);
      } finally {
         this.method1888();
         field2005.info("Thread {} shutting down", this.field1983);
         this.field1982 = false;
      }
   }

   private void method1885(int var1, int var2, String var3) throws IOException {
      ByteArrayOutputStream var6 = new ByteArrayOutputStream(1248);
      DataOutputStream var7 = new DataOutputStream(var6);
      byte[] var8 = var3.getBytes(StandardCharsets.UTF_8);
      var7.writeInt(Integer.reverseBytes(var8.length + 10));
      var7.writeInt(Integer.reverseBytes(var1));
      var7.writeInt(Integer.reverseBytes(var2));
      var7.write(var8);
      var7.write(0);
      var7.write(0);
      this.field2007.getOutputStream().write(var6.toByteArray());
   }

   private void method1886() throws IOException {
      this.method1885(-1, 2, "");
   }

   private void method1887(int var1, String var2) throws IOException {
      int var5 = var2.length();

      do {
         int var6 = 4096 > var5 ? var5 : 4096;
         this.method1885(var1, 0, var2.substring(0, var6));
         var2 = var2.substring(var6);
         var5 = var2.length();
      } while (0 != var5);
   }

   @Override
   public void method1868() {
      this.field1982 = false;
      this.method1888();
      super.method1868();
   }

   private void method1888() {
      try {
         this.field2007.close();
      } catch (IOException var4) {
         field2005.warn("Failed to close socket", var4);
      }
   }
}
