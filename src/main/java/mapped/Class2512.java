package mapped;

import java.io.Serializable;

public final class Class2512 implements Serializable {
   private String field16623;
   private int field16624;
   private int field16625;
   private int field16626;
   private int[] field16627;
   private int field16628;

   private static int[] method10489(char[] var0) {
      int[] var3 = new int[Character.codePointCount(var0, 0, var0.length)];
      int var4 = 0;

      for (int var5 = 0; var4 < var0.length; var5++) {
         int var6 = Character.codePointAt(var0, var4);
         var3[var5] = var6;
         var4 += Character.charCount(var6);
      }

      return var3;
   }

   public Class2512(String var1, int var2, int var3, int var4, char[] var5, int var6) {
      this(var1, var2, var3, var4, method10489(var5), var6);
   }

   public Class2512(String var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.field16623 = var1;
      this.field16624 = var2;
      this.field16625 = var3;
      this.field16626 = var4;
      this.field16627 = var5;
      this.field16628 = var6;
   }

   private boolean method10490(int var1) {
      return Class8852.field40001.method32204(var1);
   }

   public String method10491(int var1, int var2) {
      if (this.field16627 == null) {
         return null;
      } else {
         float var5 = (float)(var2 / 2 - 1);
         int var6 = this.field16628;
         String var7 = "";

         while (var6 > 0 && !this.method10490(this.field16627[var6 - 1])) {
            if ((float)(this.field16628 - --var6) > var5) {
               var7 = " ... ";
               var6 += 5;
               break;
            }
         }

         String var8 = "";
         int var9 = this.field16628;

         while (var9 < this.field16627.length && !this.method10490(this.field16627[var9])) {
            if ((float)(++var9 - this.field16628) > var5) {
               var8 = " ... ";
               var9 -= 5;
               break;
            }
         }

         StringBuilder var10 = new StringBuilder();

         for (int var11 = 0; var11 < var1; var11++) {
            var10.append(" ");
         }

         var10.append(var7);

         for (int var12 = var6; var12 < var9; var12++) {
            var10.appendCodePoint(this.field16627[var12]);
         }

         var10.append(var8);
         var10.append("\n");

         for (int var13 = 0; var13 < var1 + this.field16628 - var6 + var7.length(); var13++) {
            var10.append(" ");
         }

         var10.append("^");
         return var10.toString();
      }
   }

   public String method10492() {
      return this.method10491(4, 75);
   }

   @Override
   public String toString() {
      String var3 = this.method10492();
      StringBuilder var4 = new StringBuilder(" in ");
      var4.append(this.field16623);
      var4.append(", line ");
      var4.append(this.field16625 + 1);
      var4.append(", column ");
      var4.append(this.field16626 + 1);
      var4.append(":\n");
      var4.append(var3);
      return var4.toString();
   }

   public String method10493() {
      return this.field16623;
   }

   public int method10494() {
      return this.field16625;
   }

   public int method10495() {
      return this.field16626;
   }

   public int method10496() {
      return this.field16624;
   }

   public int[] method10497() {
      return this.field16627;
   }

   public int method10498() {
      return this.field16628;
   }
}
