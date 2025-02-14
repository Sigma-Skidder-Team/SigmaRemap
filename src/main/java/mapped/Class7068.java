package mapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Class7068 extends Class7067 {
   public static String field30445;

   @Override
   public String method21980() {
      if (field30445 == null) {
         method21982();
      }

      if (field30445 == null) {
         method21981();
      }

      if (field30445 != null) {
         return field30445;
      } else {
         throw new RuntimeException("Cannot find computer SN");
      }
   }

   private static void method21981() {
      String var2 = null;
      String var3 = "system.hardware.serial =";
      BufferedReader var4 = null;

      try {
         var4 = method21983("lshal");

         while ((var2 = var4.readLine()) != null) {
            if (var2.indexOf(var3) != -1) {
               field30445 = var2.split(var3)[1].replaceAll("\\(string\\)|(\\')", "").trim();
               break;
            }
         }
      } catch (IOException var13) {
         throw new RuntimeException(var13);
      } finally {
         if (var4 != null) {
            try {
               var4.close();
            } catch (IOException var12) {
               throw new RuntimeException(var12);
            }
         }
      }
   }

   private static void method21982() {
      String var2 = null;
      String var3 = "Serial Number:";
      BufferedReader var4 = null;

      try {
         var4 = method21983("dmidecode -t system");

         while ((var2 = var4.readLine()) != null) {
            if (var2.indexOf(var3) != -1) {
               field30445 = var2.split(var3)[1].trim();
               break;
            }
         }
      } catch (IOException var13) {
         throw new RuntimeException(var13);
      } finally {
         if (var4 != null) {
            try {
               var4.close();
            } catch (IOException var12) {
               throw new RuntimeException(var12);
            }
         }
      }
   }

   private static BufferedReader method21983(String var0) {
      OutputStream var3 = null;
      Object var4 = null;
      Runtime var5 = Runtime.getRuntime();
      Process var6 = null;

      try {
         var6 = var5.exec(var0.split(" "));
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }

      var3 = var6.getOutputStream();
      var4 = var6.getInputStream();

      try {
         var3.close();
      } catch (IOException var8) {
         throw new RuntimeException(var8);
      }

      return new BufferedReader(new InputStreamReader((InputStream)var4));
   }
}
