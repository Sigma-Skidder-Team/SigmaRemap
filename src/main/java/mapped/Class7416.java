package mapped;

import javax.security.auth.x500.X500Principal;

public final class Class7416 {
   private final String field31772;
   private final int field31773;
   private int field31774;
   private int field31775;
   private int field31776;
   private int field31777;
   private char[] field31778;

   public Class7416(X500Principal var1) {
      this.field31772 = var1.getName("RFC2253");
      this.field31773 = this.field31772.length();
   }

   private String method23897() {
      while (this.field31774 < this.field31773 && this.field31778[this.field31774] == ' ') {
         this.field31774++;
      }

      if (this.field31774 == this.field31773) {
         return null;
      } else {
         this.field31775 = this.field31774++;

         while (this.field31774 < this.field31773 && this.field31778[this.field31774] != '=' && this.field31778[this.field31774] != ' ') {
            this.field31774++;
         }

         if (this.field31774 >= this.field31773) {
            throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
         } else {
            this.field31776 = this.field31774;
            if (this.field31778[this.field31774] == ' ') {
               while (this.field31774 < this.field31773 && this.field31778[this.field31774] != '=' && this.field31778[this.field31774] == ' ') {
                  this.field31774++;
               }

               if (this.field31778[this.field31774] != '=' || this.field31774 == this.field31773) {
                  throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
               }
            }

            this.field31774++;

            while (this.field31774 < this.field31773 && this.field31778[this.field31774] == ' ') {
               this.field31774++;
            }

            if (this.field31776 - this.field31775 > 4
               && this.field31778[this.field31775 + 3] == '.'
               && (this.field31778[this.field31775] == 'O' || this.field31778[this.field31775] == 'o')
               && (this.field31778[this.field31775 + 1] == 'I' || this.field31778[this.field31775 + 1] == 'i')
               && (this.field31778[this.field31775 + 2] == 'D' || this.field31778[this.field31775 + 2] == 'd')) {
               this.field31775 += 4;
            }

            return new String(this.field31778, this.field31775, this.field31776 - this.field31775);
         }
      }
   }

   private String method23898() {
      this.field31774++;
      this.field31775 = this.field31774;

      for (this.field31776 = this.field31775; this.field31774 != this.field31773; this.field31776++) {
         if (this.field31778[this.field31774] == '"') {
            this.field31774++;

            while (this.field31774 < this.field31773 && this.field31778[this.field31774] == ' ') {
               this.field31774++;
            }

            return new String(this.field31778, this.field31775, this.field31776 - this.field31775);
         }

         if (this.field31778[this.field31774] != '\\') {
            this.field31778[this.field31776] = this.field31778[this.field31774];
         } else {
            this.field31778[this.field31776] = this.method23901();
         }

         this.field31774++;
      }

      throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
   }

   private String method23899() {
      if (this.field31774 + 4 >= this.field31773) {
         throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
      } else {
         this.field31775 = this.field31774++;

         label78:
         while (true) {
            if (this.field31774 != this.field31773
               && this.field31778[this.field31774] != '+'
               && this.field31778[this.field31774] != ','
               && this.field31778[this.field31774] != ';') {
               if (this.field31778[this.field31774] != ' ') {
                  if (this.field31778[this.field31774] >= 'A' && this.field31778[this.field31774] <= 'F') {
                     this.field31778[this.field31774] = (char)(this.field31778[this.field31774] + ' ');
                  }

                  this.field31774++;
                  continue;
               }

               this.field31776 = this.field31774++;

               while (true) {
                  if (this.field31774 >= this.field31773 || this.field31778[this.field31774] != ' ') {
                     break label78;
                  }

                  this.field31774++;
               }
            }

            this.field31776 = this.field31774;
            break;
         }

         int var3 = this.field31776 - this.field31775;
         if (var3 >= 5 && (var3 & 1) != 0) {
            byte[] var4 = new byte[var3 / 2];
            int var5 = 0;

            for (int var6 = this.field31775 + 1; var5 < var4.length; var5++) {
               var4[var5] = (byte)this.method23903(var6);
               var6 += 2;
            }

            return new String(this.field31778, this.field31775, var3);
         } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
         }
      }
   }

   private String method23900() {
      this.field31775 = this.field31774;
      this.field31776 = this.field31774;

      while (this.field31774 < this.field31773) {
         switch (this.field31778[this.field31774]) {
            case ' ':
               this.field31777 = this.field31776;
               this.field31774++;

               for (this.field31778[this.field31776++] = ' '; this.field31774 < this.field31773 && this.field31778[this.field31774] == ' '; this.field31774++) {
                  this.field31778[this.field31776++] = ' ';
               }

               if (this.field31774 == this.field31773
                  || this.field31778[this.field31774] == ','
                  || this.field31778[this.field31774] == '+'
                  || this.field31778[this.field31774] == ';') {
                  return new String(this.field31778, this.field31775, this.field31777 - this.field31775);
               }
               break;
            case '+':
            case ',':
            case ';':
               return new String(this.field31778, this.field31775, this.field31776 - this.field31775);
            case '\\':
               this.field31778[this.field31776++] = this.method23901();
               this.field31774++;
               break;
            default:
               this.field31778[this.field31776++] = this.field31778[this.field31774];
               this.field31774++;
         }
      }

      return new String(this.field31778, this.field31775, this.field31776 - this.field31775);
   }

   private char method23901() {
      this.field31774++;
      if (this.field31774 == this.field31773) {
         throw new IllegalStateException("Unexpected end of DN: " + this.field31772);
      } else {
         switch (this.field31778[this.field31774]) {
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
               return this.field31778[this.field31774];
            default:
               return this.method23902();
         }
      }
   }

   private char method23902() {
      int var3 = this.method23903(this.field31774);
      this.field31774++;
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
            this.field31774++;
            if (this.field31774 == this.field31773 || this.field31778[this.field31774] != '\\') {
               return '?';
            }

            this.field31774++;
            int var6 = this.method23903(this.field31774);
            this.field31774++;
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

   private int method23903(int var1) {
      if (var1 + 1 >= this.field31773) {
         throw new IllegalStateException("Malformed DN: " + this.field31772);
      } else {
         int var4 = this.field31778[var1];
         if (var4 >= 48 && var4 <= 57) {
            var4 -= 48;
         } else if (var4 >= 97 && var4 <= 102) {
            var4 -= 87;
         } else {
            if (var4 < 65 || var4 > 70) {
               throw new IllegalStateException("Malformed DN: " + this.field31772);
            }

            var4 -= 55;
         }

         int var5 = this.field31778[var1 + 1];
         if (var5 >= 48 && var5 <= 57) {
            var5 -= 48;
         } else if (var5 >= 97 && var5 <= 102) {
            var5 -= 87;
         } else {
            if (var5 < 65 || var5 > 70) {
               throw new IllegalStateException("Malformed DN: " + this.field31772);
            }

            var5 -= 55;
         }

         return (var4 << 4) + var5;
      }
   }

   public String method23904(String var1) {
      this.field31774 = 0;
      this.field31775 = 0;
      this.field31776 = 0;
      this.field31777 = 0;
      this.field31778 = this.field31772.toCharArray();
      String var4 = this.method23897();
      if (var4 == null) {
         return null;
      } else {
         do {
            String var5 = "";
            if (this.field31774 == this.field31773) {
               return null;
            }

            switch (this.field31778[this.field31774]) {
               case '"':
                  var5 = this.method23898();
                  break;
               case '#':
                  var5 = this.method23899();
               case '+':
               case ',':
               case ';':
                  break;
               default:
                  var5 = this.method23900();
            }

            if (var1.equalsIgnoreCase(var4)) {
               return var5;
            }

            if (this.field31774 >= this.field31773) {
               return null;
            }

            if (this.field31778[this.field31774] != ',' && this.field31778[this.field31774] != ';' && this.field31778[this.field31774] != '+') {
               throw new IllegalStateException("Malformed DN: " + this.field31772);
            }

            this.field31774++;
            var4 = this.method23897();
         } while (var4 != null);

         throw new IllegalStateException("Malformed DN: " + this.field31772);
      }
   }
}
