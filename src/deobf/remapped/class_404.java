package remapped;

import java.io.Serializable;

public final class class_404 implements Serializable {
   private String field_1678;
   private int field_1680;
   private int field_1677;
   private int field_1681;
   private int[] field_1679;
   private int field_1683;

   private static int[] method_2012(char[] var0) {
      int[] var3 = new int[Character.codePointCount(var0, 0, var0.length)];
      int var4 = 0;

      for (int var5 = 0; var4 < var0.length; var5++) {
         int var6 = Character.codePointAt(var0, var4);
         var3[var5] = var6;
         var4 += Character.charCount(var6);
      }

      return var3;
   }

   public class_404(String var1, int var2, int var3, int var4, char[] var5, int var6) {
      this(var1, var2, var3, var4, method_2012(var5), var6);
   }

   public class_404(String var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.field_1678 = var1;
      this.field_1680 = var2;
      this.field_1677 = var3;
      this.field_1681 = var4;
      this.field_1679 = var5;
      this.field_1683 = var6;
   }

   private boolean method_2009(int var1) {
      return class_6121.field_31290.method_28112(var1);
   }

   public String method_2014(int var1, int var2) {
      if (this.field_1679 == null) {
         return null;
      } else {
         float var5 = (float)(var2 / 2 - 1);
         int var6 = this.field_1683;
         String var7 = "";

         while (var6 > 0 && !this.method_2009(this.field_1679[var6 - 1])) {
            if ((float)(this.field_1683 - --var6) > var5) {
               var7 = " ... ";
               var6 += 5;
               break;
            }
         }

         String var8 = "";
         int var9 = this.field_1683;

         while (var9 < this.field_1679.length && !this.method_2009(this.field_1679[var9])) {
            if ((float)(++var9 - this.field_1683) > var5) {
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
            var10.appendCodePoint(this.field_1679[var12]);
         }

         var10.append(var8);
         var10.append("\n");

         for (int var13 = 0; var13 < var1 + this.field_1683 - var6 + var7.length(); var13++) {
            var10.append(" ");
         }

         var10.append("^");
         return var10.toString();
      }
   }

   public String method_2013() {
      return this.method_2014(4, 75);
   }

   @Override
   public String toString() {
      String var3 = this.method_2013();
      StringBuilder var4 = new StringBuilder(" in ");
      var4.append(this.field_1678);
      var4.append(", line ");
      var4.append(this.field_1677 + 1);
      var4.append(", column ");
      var4.append(this.field_1681 + 1);
      var4.append(":\n");
      var4.append(var3);
      return var4.toString();
   }

   public String method_2011() {
      return this.field_1678;
   }

   public int method_2015() {
      return this.field_1677;
   }

   public int method_2006() {
      return this.field_1681;
   }

   public int method_2007() {
      return this.field_1680;
   }

   public int[] method_2010() {
      return this.field_1679;
   }

   public int method_2008() {
      return this.field_1683;
   }
}
