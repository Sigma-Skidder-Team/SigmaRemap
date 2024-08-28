package mapped;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Class9285 {
   public static Class7681[] method35011(String var0) throws IOException, Class2445 {
      StringReader var3 = new StringReader(var0);
      PushbackReader var4 = new PushbackReader(var3);
      List<Class7681> var5 = new ArrayList();

      while (true) {
         int var6 = var4.read();
         if (var6 < 0) {
            return var5.toArray(new Class7681[var5.size()]);
         }

         char var7 = (char)var6;
         if (!Character.isWhitespace(var7)) {
            Class2161 var8 = Class2161.method8882(var7);
            if (var8 == null) {
               throw new Class2445("Invalid character: '" + var7 + "', in: " + var0);
            }

            Class7681 var9 = method35012(var7, var8, var4);
            var5.add(var9);
         }
      }
   }

   private static Class7681 method35012(char var0, Class2161 var1, PushbackReader var2) throws IOException {
      StringBuffer var5 = new StringBuffer();
      var5.append(var0);

      while (true) {
         int var6 = var2.read();
         if (var6 < 0) {
            break;
         }

         char var7 = (char)var6;
         if (!var1.method8883(var7)) {
            var2.unread(var7);
            break;
         }

         var5.append(var7);
      }

      return new Class7681(var1, var5.toString());
   }
}
