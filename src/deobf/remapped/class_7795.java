package remapped;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import net.optifine.expr.ParseException;

public class class_7795 {
   public static class_2428[] method_35357(String var0) throws IOException, ParseException {
      StringReader var3 = new StringReader(var0);
      PushbackReader var4 = new PushbackReader(var3);
      ArrayList var5 = new ArrayList();

      while (true) {
         int var6 = var4.read();
         if (var6 < 0) {
            return var5.<class_2428>toArray(new class_2428[var5.size()]);
         }

         char var7 = (char)var6;
         if (!Character.isWhitespace(var7)) {
            class_6950 var8 = class_6950.method_31793(var7);
            if (var8 == null) {
               throw new class_425("Invalid character: '" + var7 + "', in: " + var0);
            }

            class_2428 var9 = method_35358(var7, var8, var4);
            var5.add(var9);
         }
      }
   }

   private static class_2428 method_35358(char var0, class_6950 var1, PushbackReader var2) throws IOException {
      StringBuffer var5 = new StringBuffer();
      var5.append(var0);

      while (true) {
         int var6 = var2.read();
         if (var6 < 0) {
            break;
         }

         char var7 = (char)var6;
         if (!var1.method_31792(var7)) {
            var2.unread(var7);
            break;
         }

         var5.append(var7);
      }

      return new class_2428(var1, var5.toString());
   }
}
