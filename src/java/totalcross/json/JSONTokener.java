package totalcross.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class JSONTokener {
   private long field32120;
   private boolean field32121;
   private long field32122;
   private long field32123;
   private char field32124;
   private Reader field32125;
   private boolean field32126;

   public JSONTokener(Reader var1) {
      this.field32125 = (Reader)(!var1.markSupported() ? new BufferedReader(var1) : var1);
      this.field32121 = false;
      this.field32126 = false;
      this.field32124 = 0;
      this.field32122 = 0L;
      this.field32120 = 1L;
      this.field32123 = 1L;
   }

   public JSONTokener(InputStream var1) throws JSONException {
      this(new InputStreamReader(var1));
   }

   public JSONTokener(String var1) {
      this(new StringReader(var1));
   }

   public void back() throws JSONException {
      if (!this.field32126 && this.field32122 > 0L) {
         this.field32122--;
         this.field32120--;
         this.field32126 = true;
         this.field32121 = false;
      } else {
         throw new JSONException2("Stepping back two steps is not supported");
      }
   }

   public static int method24218(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'A' && var0 <= 'F') {
         return var0 - 55;
      } else {
         return var0 >= 97 && var0 <= 102 ? var0 - 87 : -1;
      }
   }

   public boolean method24219() {
      return this.field32121 && !this.field32126;
   }

   public boolean method24220() throws JSONException {
      this.method24221();
      if (!this.method24219()) {
         this.back();
         return true;
      } else {
         return false;
      }
   }

   public char method24221() throws JSONException {
      int var3;
      if (this.field32126) {
         this.field32126 = false;
         var3 = this.field32124;
      } else {
         try {
            var3 = this.field32125.read();
         } catch (IOException var5) {
            throw new JSONException2(var5);
         }

         if (var3 <= 0) {
            this.field32121 = true;
            var3 = 0;
         }
      }

      this.field32122++;
      if (this.field32124 == '\r') {
         this.field32123++;
         this.field32120 = var3 == 10 ? 0L : 1L;
      } else if (var3 == 10) {
         this.field32123++;
         this.field32120 = 0L;
      } else {
         this.field32120++;
      }

      this.field32124 = (char)var3;
      return this.field32124;
   }

   public char method24222(char var1) throws JSONException {
      char var4 = this.method24221();
      if (var4 == var1) {
         return var4;
      } else {
         throw this.syntaxError("Expected '" + var1 + "' and instead saw '" + var4 + "'");
      }
   }

   public String method24223(int var1) throws JSONException {
      if (var1 == 0) {
         return "";
      } else {
         char[] var4 = new char[var1];

         for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = this.method24221();
            if (this.method24219()) {
               throw this.syntaxError("Substring bounds error");
            }
         }

         return new String(var4);
      }
   }

   public char nextClean() throws JSONException {
      char var3;
      do {
         var3 = this.method24221();
      } while (var3 != 0 && var3 <= ' ');

      return var3;
   }

   public String method24225(char var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method24221();
         switch (var5) {
            case '\u0000':
            case '\n':
            case '\r':
               throw this.syntaxError("Unterminated string");
            case '\\':
               var5 = this.method24221();
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
                     var4.append((char)Integer.parseInt(this.method24223(4), 16));
                     continue;
                  default:
                     throw this.syntaxError("Illegal escape.");
               }
            default:
               if (var5 == var1) {
                  return var4.toString();
               }

               var4.append(var5);
         }
      }
   }

   public String method24226(char var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method24221();
         if (var5 == var1 || var5 == 0 || var5 == '\n' || var5 == '\r') {
            if (var5 != 0) {
               this.back();
            }

            return var4.toString().trim();
         }

         var4.append(var5);
      }
   }

   public String method24227(String var1) throws JSONException {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         char var5 = this.method24221();
         if (var1.indexOf(var5) >= 0 || var5 == 0 || var5 == '\n' || var5 == '\r') {
            if (var5 != 0) {
               this.back();
            }

            return var4.toString().trim();
         }

         var4.append(var5);
      }
   }

   public Object nextValue() throws JSONException {
      char var3 = this.nextClean();
      switch (var3) {
         case '"':
         case '\'':
            return this.method24225(var3);
         case '[':
            this.back();
            return new JSONArray(this);
         case '{':
            this.back();
            return new JSONObject(this);
         default:
            StringBuilder var4;
            for (var4 = new StringBuilder(); var3 >= ' ' && ",:]}/\\\"[{;=#".indexOf(var3) < 0; var3 = this.method24221()) {
               var4.append(var3);
            }

            this.back();
            String var5 = var4.toString().trim();
            if ("".equals(var5)) {
               throw this.syntaxError("Missing value");
            } else {
               return JSONObject.method21813(var5);
            }
      }
   }

   public char method24229(char var1) throws JSONException {
      char var10;
      try {
         long var4 = this.field32122;
         long var6 = this.field32120;
         long var8 = this.field32123;
         this.field32125.mark(1000000);

         do {
            var10 = this.method24221();
            if (var10 == 0) {
               this.field32125.reset();
               this.field32122 = var4;
               this.field32120 = var6;
               this.field32123 = var8;
               return var10;
            }
         } while (var10 != var1);
      } catch (IOException var12) {
         throw new JSONException2(var12);
      }

      this.back();
      return var10;
   }

   public JSONException2 syntaxError(String var1) {
      return new JSONException2(var1 + this.toString());
   }

   @Override
   public String toString() {
      return " at " + this.field32122 + " [character " + this.field32120 + " line " + this.field32123 + "]";
   }
}
