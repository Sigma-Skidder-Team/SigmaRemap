package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4786 extends class_446 {
   public static class_590 field_23926 = new class_590(
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_6206.field_31724,
      class_6206.field_31726
   );
   private int field_23924 = this.field_36275.length();
   private int field_23922;
   private int field_23923;

   public class_4786(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, field_23926, var7, false);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_36275 != null) {
         class_73.method_94((float)this.method_32132(), (float)this.method_32173(), (float)this.field_36278, (float)this.field_36257, -14144460);
         class_73.method_147(
            (float)this.method_32132(), (float)this.method_32173(), (float)this.field_36278, (float)(this.field_36257 - this.method_32173()), 114.0F, var1
         );
         byte var4 = 30;
         class_3384 var5 = class_5320.field_27139;
         String var6 = System.getProperty("line.separator");
         String[] var7 = this.field_36275.split("(?<=" + var6 + ")");
         int var8 = this.field_23924;
         int var9 = -1;
         float var10 = (float)var5.method_18547(this.field_36275.substring(0, this.field_23924));

         for (int var11 = 0; var11 < var7.length; var11++) {
            List var12 = this.method_22078(var7[var11]);
            int var13 = 0;

            for (String var15 : var12) {
               class_73.method_87(
                  var5,
                  (float)(this.method_32132() + var13 + var4),
                  (float)(this.method_32173() + var4 + var11 * var5.method_15654()),
                  var15,
                  class_314.method_1444(this.method_22079(var15), var1)
               );
               var13 += var5.method_18547(var15);
               var8 -= var15.length();
            }

            if ((var8 >= 0 || var9 != -1) && (this.field_23924 != this.field_36275.length() || var8 != 0 || this.field_36275.endsWith(var6))) {
               if (var9 == -1) {
                  var10 -= (float)var13;
               }
            } else {
               var9 = var11;
            }

            if (this.field_23924 == this.field_36275.length() && var8 == 0 && this.field_36275.endsWith(var6)) {
               var9 = var11 + 1;
            }
         }

         class_73.method_94(
            (float)var4 + var10,
            (float)(this.method_32173() + var4 + var9 * var5.method_15654()),
            (float)var4 + var10 + 1.0F,
            (float)(this.method_32173() + var4 + var5.method_18548(this.field_36275) + var9 * var5.method_15654()),
            class_314.method_1444(class_1255.field_6918.field_6917, var1)
         );
         super.method_32178(var1);
      }
   }

   public List<String> method_22078(String var1) {
      String var4 = System.getProperty("line.separator");
      String[] var5 = var1.split("(?<=[^a-zA-Z0-9'])");
      ArrayList var6 = new ArrayList();
      StringBuilder var7 = new StringBuilder("");

      for (String var11 : var5) {
         if (this.method_22079(var11) == class_1255.field_6918.field_6917) {
            var7.append(var11);
         } else {
            var6.add(var7.toString());
            var6.add(var11);
            var7 = new StringBuilder("");
         }
      }

      var6.add(var7.toString());
      return var6;
   }

   public int method_22079(String var1) {
      if (var1.startsWith("var") && var1.endsWith(" ")) {
         return -4363603;
      } else if (var1.startsWith("function") && var1.endsWith(" ")) {
         return -4363603;
      } else if (!var1.endsWith(".")) {
         if (!var1.startsWith("if")) {
            if (!var1.endsWith("(")) {
               return !var1.startsWith(")") ? class_1255.field_6918.field_6917 : -2774170;
            } else {
               return -2774170;
            }
         } else {
            return class_1255.field_6918.field_6917;
         }
      } else {
         return -10442018;
      }
   }

   @Override
   public void method_29507(char var1) {
      super.method_29507(var1);
      if (this.method_32098() && class_6324.method_28823(var1) && class_5320.field_27139.method_18547(Character.toString(var1)) > 1) {
         this.field_36275 = class_6324.method_28834(this.field_36275, Character.toString(var1), this.field_23924);
         this.field_23924++;
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      String var4 = System.getProperty("line.separator");
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_36267) {
         String var5 = System.getProperty("line.separator");
         String[] var6 = this.field_36275.split("(?<=" + var5 + ")");
         int var7 = (var2 - this.method_32093() - class_5320.field_27139.method_15654() / 2) / class_5320.field_27139.method_15654() - 1;
         if (var7 > var6.length - 1) {
            var7 = var6.length - 1;
         }

         if (var7 < 0) {
            var7 = 0;
         }

         int var8 = 0;

         for (int var9 = 0; var9 < var7; var9++) {
            var8 += var6[var9].length();
         }

         this.field_23924 = var8 + class_6324.method_28822(var6[var7], class_5320.field_27139, (float)this.method_32155(), var1, 30.0F);
         if (this.field_36275.substring(0, this.field_23924).endsWith(var5) && this.field_23924 != this.field_36275.length()) {
            this.field_23924--;
         }

         this.field_23924 = Math.min(Math.max(0, this.field_23924), this.field_36275.length());
         this.field_23923 = this.field_23924;
      }
   }

   public boolean method_22077() {
      return false;
   }
}
