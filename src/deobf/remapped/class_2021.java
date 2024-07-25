package remapped;

import java.util.HashMap;
import org.json.JSONException;

public class class_2021 extends class_3734 {
   public static final HashMap<String, Character> field_10245 = new HashMap<String, Character>(8);

   public class_2021(String var1) {
      super(var1);
   }

   public String method_9387() throws JSONException {
      StringBuilder var3 = new StringBuilder();

      int var5;
      do {
         char var4 = this.method_17289();
         if (this.method_17295()) {
            throw this.method_17292("Unclosed CDATA");
         }

         var3.append(var4);
         var5 = var3.length() - 3;
      } while (var5 < 0 || var3.charAt(var5) != ']' || var3.charAt(var5 + 1) != ']' || var3.charAt(var5 + 2) != '>');

      var3.setLength(var5);
      return var3.toString();
   }

   public Object method_9390() throws JSONException {
      char var3;
      do {
         var3 = this.method_17289();
      } while (Character.isWhitespace(var3));

      if (var3 == 0) {
         return null;
      } else if (var3 == '<') {
         return class_6745.field_34815;
      } else {
         StringBuilder var4;
         for (var4 = new StringBuilder(); var3 != '<' && var3 != 0; var3 = this.method_17289()) {
            if (var3 != '&') {
               var4.append(var3);
            } else {
               var4.append(this.method_9388(var3));
            }
         }

         this.method_17299();
         return var4.toString().trim();
      }
   }

   public Object method_9388(char var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method_17289();
         if (!Character.isLetterOrDigit(var5) && var5 != '#') {
            if (var5 != ';') {
               throw this.method_17292("Missing ';' in XML entity: &" + var4);
            }

            String var7 = var4.toString();
            Object var6 = field_10245.get(var7);
            return var6 == null ? var1 + var7 + ";" : var6;
         }

         var4.append(Character.toLowerCase(var5));
      }
   }

   public Object method_9389() throws JSONException {
      char var3;
      do {
         var3 = this.method_17289();
      } while (Character.isWhitespace(var3));

      switch (var3) {
         case '\u0000':
            throw this.method_17292("Misshaped meta tag");
         case '!':
            return class_6745.field_34819;
         case '"':
         case '\'':
            char var4 = var3;

            do {
               var3 = this.method_17289();
               if (var3 == 0) {
                  throw this.method_17292("Unterminated string");
               }
            } while (var3 != var4);

            return Boolean.TRUE;
         case '/':
            return class_6745.field_34811;
         case '<':
            return class_6745.field_34815;
         case '=':
            return class_6745.field_34814;
         case '>':
            return class_6745.field_34812;
         case '?':
            return class_6745.field_34817;
         default:
            while (true) {
               var3 = this.method_17289();
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
                     this.method_17299();
                     return Boolean.TRUE;
               }
            }
      }
   }

   public Object method_9391() throws JSONException {
      char var3;
      do {
         var3 = this.method_17289();
      } while (Character.isWhitespace(var3));

      switch (var3) {
         case '\u0000':
            throw this.method_17292("Misshaped element");
         case '!':
            return class_6745.field_34819;
         case '"':
         case '\'':
            char var4 = var3;
            StringBuilder var7 = new StringBuilder();

            while (true) {
               var3 = this.method_17289();
               if (var3 == 0) {
                  throw this.method_17292("Unterminated string");
               }

               if (var3 == var4) {
                  return var7.toString();
               }

               if (var3 == '&') {
                  var7.append(this.method_9388(var3));
               } else {
                  var7.append(var3);
               }
            }
         case '/':
            return class_6745.field_34811;
         case '<':
            throw this.method_17292("Misplaced '<'");
         case '=':
            return class_6745.field_34814;
         case '>':
            return class_6745.field_34812;
         case '?':
            return class_6745.field_34817;
         default:
            StringBuilder var5 = new StringBuilder();

            while (true) {
               var5.append(var3);
               var3 = this.method_17289();
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
                     this.method_17299();
                     return var5.toString();
                  case '"':
                  case '\'':
                  case '<':
                     throw this.method_17292("Bad character in a name");
               }
            }
      }
   }

   public boolean method_9386(String var1) throws JSONException {
      int var4 = 0;
      int var5 = var1.length();
      char[] var6 = new char[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         char var10 = this.method_17289();
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

         char var12 = this.method_17289();
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
      field_10245.put("amp", class_6745.field_34818);
      field_10245.put("apos", class_6745.field_34813);
      field_10245.put("gt", class_6745.field_34812);
      field_10245.put("lt", class_6745.field_34815);
      field_10245.put("quot", class_6745.field_34820);
   }
}
