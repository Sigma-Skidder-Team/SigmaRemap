package remapped;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class class_6620 {
   public static void main(String[] var0) throws Exception {
      class_1833 var3 = new class_1833((class_3608)null);

      while (true) {
         try {
            InputStreamReader var4 = new InputStreamReader(System.in);
            BufferedReader var5 = new BufferedReader(var4);
            String var6 = var5.readLine();
            if (var6.length() <= 0) {
               return;
            }

            class_3999 var7 = var3.method_8106(var6);
            if (var7 instanceof class_6839) {
               class_6839 var8 = (class_6839)var7;
               float var9 = var8.method_31353();
               System.out.println("" + var9);
            }

            if (var7 instanceof class_1342) {
               class_1342 var11 = (class_1342)var7;
               boolean var12 = var11.method_6191();
               System.out.println("" + var12);
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }
}
