package mapped;

import java.util.HashMap;
import org.json.JSONException;

public class Class7474 extends Class7475 {
   public static final HashMap<String, Character> field32119 = new HashMap<String, Character>(8);

   public Class7474(String var1) {
      super(var1);
   }

   public String method24211() throws Class2455 {
      StringBuilder var3 = new StringBuilder();

      int var5;
      do {
         char var4 = this.method24221();
         if (this.method24219()) {
            throw this.method24230("Unclosed CDATA");
         }

         var3.append(var4);
         var5 = var3.length() - 3;
      } while (var5 < 0 || var3.charAt(var5) != ']' || var3.charAt(var5 + 1) != ']' || var3.charAt(var5 + 2) != '>');

      var3.setLength(var5);
      return var3.toString();
   }

   public Object method24212() throws Class2455 {
      char var3;
      do {
         var3 = this.method24221();
      } while (Character.isWhitespace(var3));

      if (var3 == 0) {
         return null;
      } else if (var3 == '<') {
         return Class9029.field41317;
      } else {
         StringBuilder var4;
         for (var4 = new StringBuilder(); var3 != '<' && var3 != 0; var3 = this.method24221()) {
            if (var3 != '&') {
               var4.append(var3);
            } else {
               var4.append(this.method24213(var3));
            }
         }

         this.method24217();
         return var4.toString().trim();
      }
   }

   public Object method24213(char var1) throws Class2455 {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method24221();
         if (!Character.isLetterOrDigit(var5) && var5 != '#') {
            if (var5 != ';') {
               throw this.method24230("Missing ';' in XML entity: &" + var4);
            }

            String var7 = var4.toString();
            Object var6 = field32119.get(var7);
            return var6 == null ? var1 + var7 + ";" : var6;
         }

         var4.append(Character.toLowerCase(var5));
      }
   }

   public Object method24214() throws Class2455 {
      char var3;
      do {
         var3 = this.method24221();
      } while (Character.isWhitespace(var3));

      switch (var3) {
         case '\u0000':
            throw this.method24230("Misshaped meta tag");
         case '!':
            return Class9029.field41314;
         case '"':
         case '\'':
            char var4 = var3;

            do {
               var3 = this.method24221();
               if (var3 == 0) {
                  throw this.method24230("Unterminated string");
               }
            } while (var3 != var4);

            return Boolean.TRUE;
         case '/':
            return Class9029.field41320;
         case '<':
            return Class9029.field41317;
         case '=':
            return Class9029.field41315;
         case '>':
            return Class9029.field41316;
         case '?':
            return Class9029.field41318;
         default:
            while (true) {
               var3 = this.method24221();
               if (Character.isWhitespace(var3)) {
                  return Boolean.TRUE;
               }

               switch (var3) {
                  case '\u0000':
                  case '!':
                  case '"':
                  case '\'':
                  case '/':
                  case '<':
                  case '=':
                  case '>':
                  case '?':
                     this.method24217();
                     return Boolean.TRUE;
               }
            }
      }
   }

   public Object method24215() throws Class2455 {
      char var3;
      do {
         var3 = this.method24221();
      } while (Character.isWhitespace(var3));

      switch (var3) {
         case '\u0000':
            throw this.method24230("Misshaped element");
         case '!':
            return Class9029.field41314;
         case '"':
         case '\'':
            char var4 = var3;
            StringBuilder var7 = new StringBuilder();

            while (true) {
               var3 = this.method24221();
               if (var3 == 0) {
                  throw this.method24230("Unterminated string");
               }

               if (var3 == var4) {
                  return var7.toString();
               }

               if (var3 == '&') {
                  var7.append(this.method24213(var3));
               } else {
                  var7.append(var3);
               }
            }
         case '/':
            return Class9029.field41320;
         case '<':
            throw this.method24230("Misplaced '<'");
         case '=':
            return Class9029.field41315;
         case '>':
            return Class9029.field41316;
         case '?':
            return Class9029.field41318;
         default:
            StringBuilder var5 = new StringBuilder();

            while (true) {
               var5.append(var3);
               var3 = this.method24221();
               if (Character.isWhitespace(var3)) {
                  return var5.toString();
               }

               switch (var3) {
                  case '\u0000':
                     return var5.toString();
                  case '!':
                  case '/':
                  case '=':
                  case '>':
                  case '?':
                  case '[':
                  case ']':
                     this.method24217();
                     return var5.toString();
                  case '"':
                  case '\'':
                  case '<':
                     throw this.method24230("Bad character in a name");
               }
            }
      }
   }

   public boolean method24216(String var1) throws Class2455 {
      int var4 = 0;
      int var5 = var1.length();
      char[] var6 = new char[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         char var10 = this.method24221();
         if (var10 == 0) {
            return false;
         }

         var6[var7] = var10;
      }

      while (true) {
         int var8 = var4;
         boolean var9 = true;

         for (int var11 = 0; var11 < var5; var11++) {
            if (var6[var8] != var1.charAt(var11)) {
               var9 = false;
               break;
            }

            if (++var8 >= var5) {
               var8 -= var5;
            }
         }

         if (var9) {
            return true;
         }

         char var12 = this.method24221();
         if (var12 == 0) {
            return false;
         }

         var6[var4] = var12;
         if (++var4 >= var5) {
            var4 -= var5;
         }
      }
   }

   static {
      field32119.put("amp", Class9029.field41312);
      field32119.put("apos", Class9029.field41313);
      field32119.put("gt", Class9029.field41316);
      field32119.put("lt", Class9029.field41317);
      field32119.put("quot", Class9029.field41319);
   }
}
