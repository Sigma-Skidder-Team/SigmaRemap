package mapped;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class8990 {
   public static void main(String[] var0) throws Exception {
      Class7344 var3 = new Class7344((Class6267)null);

      while (true) {
         try {
            InputStreamReader var4 = new InputStreamReader(System.in);
            BufferedReader var5 = new BufferedReader(var4);
            String var6 = var5.readLine();
            if (var6.length() <= 0) {
               return;
            }

            Class1878 var7 = var3.method23272(var6);
            if (var7 instanceof Class1884) {
               Class1884 var8 = (Class1884)var7;
               float var9 = var8.method8142();
               System.out.println("" + var9);
            }

            if (var7 instanceof Class1876) {
               Class1876 var11 = (Class1876)var7;
               boolean var12 = var11.method8137();
               System.out.println("" + var12);
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }
}
