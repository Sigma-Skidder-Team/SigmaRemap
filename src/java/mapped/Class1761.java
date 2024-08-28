package mapped;

import java.io.IOException;

public class Class1761 implements Appendable {
   public int field9542;
   public char[] field9543;
   public final Appendable field9544;
   public final Class7579 field9545;

   public Class1761(Class7579 var1, Appendable var2) {
      this.field9545 = var1;
      this.field9544 = var2;
      this.field9542 = -1;
      this.field9543 = new char[2];
   }

   @Override
   public Appendable append(CharSequence var1) throws IOException {
      return this.append(var1, 0, var1.length());
   }

   @Override
   public Appendable append(CharSequence var1, int var2, int var3) throws IOException {
      int var6 = var2;
      if (var2 < var3) {
         int var7 = var2;
         if (this.field9542 != -1) {
            var6 = var2 + 1;
            char var8 = var1.charAt(var2);
            if (!Character.isLowSurrogate(var8)) {
               throw new IllegalArgumentException("Expected low surrogate character but got " + var8);
            }

            char[] var9 = this.field9545.method24806(Character.toCodePoint((char)this.field9542, var8));
            if (var9 == null) {
               this.field9544.append((char)this.field9542);
            } else {
               this.method7702(var9, var9.length);
               var7 = var2 + 1;
            }

            this.field9542 = -1;
         }

         while (true) {
            var6 = this.field9545.method24807(var1, var6, var3);
            if (var6 > var7) {
               this.field9544.append(var1, var7, var6);
            }

            if (var6 == var3) {
               break;
            }

            int var12 = Class7579.method24811(var1, var6, var3);
            if (var12 < 0) {
               this.field9542 = -var12;
               break;
            }

            char[] var13 = this.field9545.method24806(var12);
            if (var13 == null) {
               int var10 = Character.toChars(var12, this.field9543, 0);
               this.method7702(this.field9543, var10);
            } else {
               this.method7702(var13, var13.length);
            }

            var6 += !Character.isSupplementaryCodePoint(var12) ? 1 : 2;
            var7 = var6;
         }
      }

      return this;
   }

   @Override
   public Appendable append(char var1) throws IOException {
      if (this.field9542 == -1) {
         if (!Character.isHighSurrogate(var1)) {
            if (Character.isLowSurrogate(var1)) {
               throw new IllegalArgumentException("Unexpected low surrogate character '" + var1 + "' with value " + var1);
            }

            char[] var4 = this.field9545.method24806(var1);
            if (var4 == null) {
               this.field9544.append(var1);
            } else {
               this.method7702(var4, var4.length);
            }
         } else {
            this.field9542 = var1;
         }
      } else {
         if (!Character.isLowSurrogate(var1)) {
            throw new IllegalArgumentException("Expected low surrogate character but got '" + var1 + "' with value " + var1);
         }

         char[] var5 = this.field9545.method24806(Character.toCodePoint((char)this.field9542, var1));
         if (var5 == null) {
            this.field9544.append((char)this.field9542);
            this.field9544.append(var1);
         } else {
            this.method7702(var5, var5.length);
         }

         this.field9542 = -1;
      }

      return this;
   }

   private void method7702(char[] var1, int var2) throws IOException {
      for (int var5 = 0; var5 < var2; var5++) {
         this.field9544.append(var1[var5]);
      }
   }
}
