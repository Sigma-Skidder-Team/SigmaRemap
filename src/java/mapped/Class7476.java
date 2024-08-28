package mapped;

import org.json.JSONException;

public class Class7476 extends Class7475 {
   public Class7476(String var1) {
      super(var1);
   }

   public String method24231() throws Class2455 {
      StringBuilder var3 = new StringBuilder();

      char var4;
      do {
         var4 = this.method24221();
      } while (Character.isWhitespace(var4));

      if (var4 != '"' && var4 != '\'') {
         while (var4 != 0 && !Character.isWhitespace(var4)) {
            var3.append(var4);
            var4 = this.method24221();
         }

         return var3.toString();
      } else {
         char var5 = var4;

         while (true) {
            var4 = this.method24221();
            if (var4 < ' ') {
               throw this.method24230("Unterminated string.");
            }

            if (var4 == var5) {
               return var3.toString();
            }

            var3.append(var4);
         }
      }
   }
}
