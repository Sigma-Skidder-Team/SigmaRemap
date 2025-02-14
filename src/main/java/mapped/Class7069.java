package mapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Class7069 extends Class7067 {
   public static String field30446;

   @Override
   public String method21980() {
      if (field30446 != null) {
         return field30446;
      } else {
         OutputStream var3 = null;
         InputStream var4 = null;
         Runtime var5 = Runtime.getRuntime();
         Process var6 = null;

         try {
            var6 = var5.exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
         } catch (IOException var21) {
            throw new RuntimeException(var21);
         }

         var3 = var6.getOutputStream();
         var4 = var6.getInputStream();

         try {
            var3.close();
         } catch (IOException var20) {
            throw new RuntimeException(var20);
         }

         BufferedReader var7 = new BufferedReader(new InputStreamReader(var4));
         String var8 = null;
         String var9 = "Serial Number";

         try {
            while ((var8 = var7.readLine()) != null) {
               if (var8.contains(var9)) {
                  field30446 = var8.split(":")[1].trim();
                  break;
               }
            }
         } catch (IOException var22) {
            throw new RuntimeException(var22);
         } finally {
            try {
               var4.close();
            } catch (IOException var19) {
               throw new RuntimeException(var19);
            }
         }

         if (field30446 == null) {
            throw new RuntimeException("Cannot find computer SN");
         } else {
            return field30446;
         }
      }
   }
}
