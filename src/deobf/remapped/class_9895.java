package remapped;

import org.json.JSONException;

public class class_9895 extends class_3734 {
   public class_9895(String var1) {
      super(var1);
   }

   public String method_45581() throws JSONException {
      StringBuilder var3 = new StringBuilder();

      char var4;
      do {
         var4 = this.method_17289();
      } while (Character.isWhitespace(var4));

      if (var4 != '"' && var4 != '\'') {
         while (var4 != 0 && !Character.isWhitespace(var4)) {
            var3.append(var4);
            var4 = this.method_17289();
         }

         return var3.toString();
      } else {
         char var5 = var4;

         while (true) {
            var4 = this.method_17289();
            if (var4 < ' ') {
               throw this.method_17292("Unterminated string.");
            }

            if (var4 == var5) {
               return var3.toString();
            }

            var3.append(var4);
         }
      }
   }
}
