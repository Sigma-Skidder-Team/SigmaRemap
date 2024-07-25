package remapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import org.json.JSONException;

public class class_3734 {
   private long field_18250;
   private boolean field_18256;
   private long field_18254;
   private long field_18255;
   private char field_18252;
   private Reader field_18249;
   private boolean field_18253;

   public class_3734(Reader var1) {
      this.field_18249 = (Reader)(!var1.markSupported() ? new BufferedReader(var1) : var1);
      this.field_18256 = false;
      this.field_18253 = false;
      this.field_18252 = 0;
      this.field_18254 = 0L;
      this.field_18250 = 1L;
      this.field_18255 = 1L;
   }

   public class_3734(InputStream var1) throws JSONException {
      this(new InputStreamReader(var1));
   }

   public class_3734(String var1) {
      this(new StringReader(var1));
   }

   public void method_17299() throws JSONException {
      if (!this.field_18253 && this.field_18254 > 0L) {
         this.field_18254--;
         this.field_18250--;
         this.field_18253 = true;
         this.field_18256 = false;
      } else {
         throw new class_7584("Stepping back two steps is not supported");
      }
   }

   public static int method_17300(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'A' && var0 <= 'F') {
         return var0 - 55;
      } else {
         return var0 >= 97 && var0 <= 102 ? var0 - 87 : -1;
      }
   }

   public boolean method_17295() {
      return this.field_18256 && !this.field_18253;
   }

   public boolean method_17294() throws JSONException {
      this.method_17289();
      if (!this.method_17295()) {
         this.method_17299();
         return true;
      } else {
         return false;
      }
   }

   public char method_17289() throws JSONException {
      int var3;
      if (this.field_18253) {
         this.field_18253 = false;
         var3 = this.field_18252;
      } else {
         try {
            var3 = this.field_18249.read();
         } catch (IOException var5) {
            throw new class_7584(var5);
         }

         if (var3 <= 0) {
            this.field_18256 = true;
            var3 = 0;
         }
      }

      this.field_18254++;
      if (this.field_18252 == '\r') {
         this.field_18255++;
         this.field_18250 = var3 == 10 ? 0L : 1L;
      } else if (var3 == 10) {
         this.field_18255++;
         this.field_18250 = 0L;
      } else {
         this.field_18250++;
      }

      this.field_18252 = (char)var3;
      return this.field_18252;
   }

   public char method_17290(char var1) throws JSONException {
      char var4 = this.method_17289();
      if (var4 == var1) {
         return var4;
      } else {
         throw this.method_17292("Expected '" + var1 + "' and instead saw '" + var4 + "'");
      }
   }

   public String method_17291(int var1) throws JSONException {
      if (var1 == 0) {
         return "";
      } else {
         char[] var4 = new char[var1];

         for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = this.method_17289();
            if (this.method_17295()) {
               throw this.method_17292("Substring bounds error");
            }
         }

         return new String(var4);
      }
   }

   public char method_17301() throws JSONException {
      char var3;
      do {
         var3 = this.method_17289();
      } while (var3 != 0 && var3 <= ' ');

      return var3;
   }

   public String method_17296(char var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method_17289();
         switch (var5) {
            case '\u0000':
            case '\n':
            case '\r':
               throw this.method_17292("Unterminated string");
            case '\\':
               var5 = this.method_17289();
               switch (var5) {
                  case '"':
                  case '\'':
                  case '/':
                  case '\\':
                     var4.append(var5);
                     continue;
                  case 'b':
                     var4.append('\b');
                     continue;
                  case 'f':
                     var4.append('\f');
                     continue;
                  case 'n':
                     var4.append('\n');
                     continue;
                  case 'r':
                     var4.append('\r');
                     continue;
                  case 't':
                     var4.append('\t');
                     continue;
                  case 'u':
                     var4.append((char)Integer.parseInt(this.method_17291(4), 16));
                     continue;
                  default:
                     throw this.method_17292("Illegal escape.");
               }
            default:
               if (var5 == var1) {
                  return var4.toString();
               }

               var4.append(var5);
         }
      }
   }

   public String method_17297(char var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method_17289();
         if (var5 == var1 || var5 == 0 || var5 == '\n' || var5 == '\r') {
            if (var5 != 0) {
               this.method_17299();
            }

            return var4.toString().trim();
         }

         var4.append(var5);
      }
   }

   public String method_17298(String var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method_17289();
         if (var1.indexOf(var5) >= 0 || var5 == 0 || var5 == '\n' || var5 == '\r') {
            if (var5 != 0) {
               this.method_17299();
            }

            return var4.toString().trim();
         }

         var4.append(var5);
      }
   }

   public Object method_17288() throws JSONException {
      char var3 = this.method_17301();
      switch (var3) {
         case '"':
         case '\'':
            return this.method_17296(var3);
         case '[':
            this.method_17299();
            return new JSONArray(this);
         case '{':
            this.method_17299();
            return new JSONObjectImpl(this);
         default:
            StringBuilder var4;
            for (var4 = new StringBuilder(); var3 >= ' ' && ",:]}/\\\"[{;=#".indexOf(var3) < 0; var3 = this.method_17289()) {
               var4.append(var3);
            }

            this.method_17299();
            String var5 = var4.toString().trim();
            if ("".equals(var5)) {
               throw this.method_17292("Missing value");
            } else {
               return JSONObjectImpl.method_5836(var5);
            }
      }
   }

   public char method_17293(char var1) throws JSONException {
      char var10;
      try {
         long var4 = this.field_18254;
         long var6 = this.field_18250;
         long var8 = this.field_18255;
         this.field_18249.mark(1000000);

         do {
            var10 = this.method_17289();
            if (var10 == 0) {
               this.field_18249.reset();
               this.field_18254 = var4;
               this.field_18250 = var6;
               this.field_18255 = var8;
               return var10;
            }
         } while (var10 != var1);
      } catch (IOException var12) {
         throw new class_7584(var12);
      }

      this.method_17299();
      return var10;
   }

   public class_7584 method_17292(String var1) {
      return new class_7584(var1 + this.toString());
   }

   @Override
   public String toString() {
      return " at " + this.field_18254 + " [character " + this.field_18250 + " line " + this.field_18255 + "]";
   }
}
