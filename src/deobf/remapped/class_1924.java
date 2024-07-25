package remapped;

import javax.security.auth.x500.X500Principal;

public final class class_1924 {
   private final String field_9851;
   private final int field_9850;
   private int field_9853;
   private int field_9847;
   private int field_9848;
   private int field_9849;
   private char[] field_9854;

   public class_1924(X500Principal var1) {
      this.field_9851 = var1.getName("RFC2253");
      this.field_9850 = this.field_9851.length();
   }

   private String method_8946() {
      while (this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] == ' ') {
         this.field_9853++;
      }

      if (this.field_9853 == this.field_9850) {
         return null;
      } else {
         this.field_9847 = this.field_9853++;

         while (this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] != '=' && this.field_9854[this.field_9853] != ' ') {
            this.field_9853++;
         }

         if (this.field_9853 >= this.field_9850) {
            throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
         } else {
            this.field_9848 = this.field_9853;
            if (this.field_9854[this.field_9853] == ' ') {
               while (this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] != '=' && this.field_9854[this.field_9853] == ' ') {
                  this.field_9853++;
               }

               if (this.field_9854[this.field_9853] != '=' || this.field_9853 == this.field_9850) {
                  throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
               }
            }

            this.field_9853++;

            while (this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] == ' ') {
               this.field_9853++;
            }

            if (this.field_9848 - this.field_9847 > 4
               && this.field_9854[this.field_9847 + 3] == '.'
               && (this.field_9854[this.field_9847] == 'O' || this.field_9854[this.field_9847] == 'o')
               && (this.field_9854[this.field_9847 + 1] == 'I' || this.field_9854[this.field_9847 + 1] == 'i')
               && (this.field_9854[this.field_9847 + 2] == 'D' || this.field_9854[this.field_9847 + 2] == 'd')) {
               this.field_9847 += 4;
            }

            return new String(this.field_9854, this.field_9847, this.field_9848 - this.field_9847);
         }
      }
   }

   private String method_8940() {
      this.field_9853++;
      this.field_9847 = this.field_9853;

      for (this.field_9848 = this.field_9847; this.field_9853 != this.field_9850; this.field_9848++) {
         if (this.field_9854[this.field_9853] == '"') {
            this.field_9853++;

            while (this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] == ' ') {
               this.field_9853++;
            }

            return new String(this.field_9854, this.field_9847, this.field_9848 - this.field_9847);
         }

         if (this.field_9854[this.field_9853] != '\\') {
            this.field_9854[this.field_9848] = this.field_9854[this.field_9853];
         } else {
            this.field_9854[this.field_9848] = this.method_8942();
         }

         this.field_9853++;
      }

      throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
   }

   private String method_8938() {
      if (this.field_9853 + 4 >= this.field_9850) {
         throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
      } else {
         this.field_9847 = this.field_9853++;

         label78:
         while (true) {
            if (this.field_9853 != this.field_9850
               && this.field_9854[this.field_9853] != '+'
               && this.field_9854[this.field_9853] != ','
               && this.field_9854[this.field_9853] != ';') {
               if (this.field_9854[this.field_9853] != ' ') {
                  if (this.field_9854[this.field_9853] >= 'A' && this.field_9854[this.field_9853] <= 'F') {
                     this.field_9854[this.field_9853] = (char)(this.field_9854[this.field_9853] + ' ');
                  }

                  this.field_9853++;
                  continue;
               }

               this.field_9848 = this.field_9853++;

               while (true) {
                  if (this.field_9853 >= this.field_9850 || this.field_9854[this.field_9853] != ' ') {
                     break label78;
                  }

                  this.field_9853++;
               }
            }

            this.field_9848 = this.field_9853;
            break;
         }

         int var3 = this.field_9848 - this.field_9847;
         if (var3 >= 5 && (var3 & 1) != 0) {
            byte[] var4 = new byte[var3 / 2];
            int var5 = 0;

            for (int var6 = this.field_9847 + 1; var5 < var4.length; var5++) {
               var4[var5] = (byte)this.method_8939(var6);
               var6 += 2;
            }

            return new String(this.field_9854, this.field_9847, var3);
         } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
         }
      }
   }

   private String method_8945() {
      this.field_9847 = this.field_9853;
      this.field_9848 = this.field_9853;

      while (this.field_9853 < this.field_9850) {
         switch (this.field_9854[this.field_9853]) {
            case ' ':
               this.field_9849 = this.field_9848;
               this.field_9853++;

               for (this.field_9854[this.field_9848++] = ' '; this.field_9853 < this.field_9850 && this.field_9854[this.field_9853] == ' '; this.field_9853++) {
                  this.field_9854[this.field_9848++] = ' ';
               }

               if (this.field_9853 == this.field_9850
                  || this.field_9854[this.field_9853] == ','
                  || this.field_9854[this.field_9853] == '+'
                  || this.field_9854[this.field_9853] == ';') {
                  return new String(this.field_9854, this.field_9847, this.field_9849 - this.field_9847);
               }
               break;
            case '+':
            case ',':
            case ';':
               return new String(this.field_9854, this.field_9847, this.field_9848 - this.field_9847);
            case '\\':
               this.field_9854[this.field_9848++] = this.method_8942();
               this.field_9853++;
               break;
            default:
               this.field_9854[this.field_9848++] = this.field_9854[this.field_9853];
               this.field_9853++;
         }
      }

      return new String(this.field_9854, this.field_9847, this.field_9848 - this.field_9847);
   }

   private char method_8942() {
      this.field_9853++;
      if (this.field_9853 == this.field_9850) {
         throw new IllegalStateException("Unexpected end of DN: " + this.field_9851);
      } else {
         switch (this.field_9854[this.field_9853]) {
            case ' ':
            case '"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
               return this.field_9854[this.field_9853];
            default:
               return this.method_8943();
         }
      }
   }

   private char method_8943() {
      int var3 = this.method_8939(this.field_9853);
      this.field_9853++;
      if (var3 < 128) {
         return (char)var3;
      } else if (var3 >= 192 && var3 <= 247) {
         byte var4;
         if (var3 > 223) {
            if (var3 > 239) {
               var4 = 3;
               var3 &= 7;
            } else {
               var4 = 2;
               var3 &= 15;
            }
         } else {
            var4 = 1;
            var3 &= 31;
         }

         for (int var5 = 0; var5 < var4; var5++) {
            this.field_9853++;
            if (this.field_9853 == this.field_9850 || this.field_9854[this.field_9853] != '\\') {
               return '?';
            }

            this.field_9853++;
            int var6 = this.method_8939(this.field_9853);
            this.field_9853++;
            if ((var6 & 192) != 128) {
               return '?';
            }

            var3 = (var3 << 6) + (var6 & 63);
         }

         return (char)var3;
      } else {
         return '?';
      }
   }

   private int method_8939(int var1) {
      if (var1 + 1 >= this.field_9850) {
         throw new IllegalStateException("Malformed DN: " + this.field_9851);
      } else {
         int var4 = this.field_9854[var1];
         if (var4 >= 48 && var4 <= 57) {
            var4 -= 48;
         } else if (var4 >= 97 && var4 <= 102) {
            var4 -= 87;
         } else {
            if (var4 < 65 || var4 > 70) {
               throw new IllegalStateException("Malformed DN: " + this.field_9851);
            }

            var4 -= 55;
         }

         int var5 = this.field_9854[var1 + 1];
         if (var5 >= 48 && var5 <= 57) {
            var5 -= 48;
         } else if (var5 >= 97 && var5 <= 102) {
            var5 -= 87;
         } else {
            if (var5 < 65 || var5 > 70) {
               throw new IllegalStateException("Malformed DN: " + this.field_9851);
            }

            var5 -= 55;
         }

         return (var4 << 4) + var5;
      }
   }

   public String method_8941(String var1) {
      this.field_9853 = 0;
      this.field_9847 = 0;
      this.field_9848 = 0;
      this.field_9849 = 0;
      this.field_9854 = this.field_9851.toCharArray();
      String var4 = this.method_8946();
      if (var4 == null) {
         return null;
      } else {
         do {
            String var5 = "";
            if (this.field_9853 == this.field_9850) {
               return null;
            }

            switch (this.field_9854[this.field_9853]) {
               case '"':
                  var5 = this.method_8940();
                  break;
               case '#':
                  var5 = this.method_8938();
               case '+':
               case ',':
               case ';':
                  break;
               default:
                  var5 = this.method_8945();
            }

            if (var1.equalsIgnoreCase(var4)) {
               return var5;
            }

            if (this.field_9853 >= this.field_9850) {
               return null;
            }

            if (this.field_9854[this.field_9853] != ',' && this.field_9854[this.field_9853] != ';' && this.field_9854[this.field_9853] != '+') {
               throw new IllegalStateException("Malformed DN: " + this.field_9851);
            }

            this.field_9853++;
            var4 = this.method_8946();
         } while (var4 != null);

         throw new IllegalStateException("Malformed DN: " + this.field_9851);
      }
   }
}
