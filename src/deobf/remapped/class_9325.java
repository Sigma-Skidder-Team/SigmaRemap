package remapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class class_9325 extends class_6891 {
   public static String field_47615;

   @Override
   public String method_31579() {
      if (field_47615 == null) {
         method_43029();
      }

      if (field_47615 == null) {
         method_43028();
      }

      if (field_47615 != null) {
         return field_47615;
      } else {
         throw new RuntimeException("Cannot find computer SN");
      }
   }

   private static void method_43028() {
      Object var2 = null;
      String var3 = "system.hardware.serial =";
      BufferedReader var4 = null;

      try {
         var4 = method_43027("lshal");

         while ((var2 = var4.readLine()) != null) {
            if (var2.indexOf(var3) != -1) {
               field_47615 = var2.split(var3)[1].replaceAll("\\(string\\)|(\\')", "").trim();
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

   private static void method_43029() {
      Object var2 = null;
      String var3 = "Serial Number:";
      BufferedReader var4 = null;

      try {
         var4 = method_43027("dmidecode -t system");

         while ((var2 = var4.readLine()) != null) {
            if (var2.indexOf(var3) != -1) {
               field_47615 = var2.split(var3)[1].trim();
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

   private static BufferedReader method_43027(String var0) {
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
