package mapped;

import lol.Font;
import lol.Log;

import java.io.UnsupportedEncodingException;

public class Class7428 implements Font {
   private Class7386 field31927;
   private char field31928;
   private int field31929;
   private int field31930;
   private int field31931;
   private int field31932;

   public Class7428(Class7386 var1, char var2) {
      this.field31927 = var1;
      this.field31928 = var2;
      this.field31931 = var1.method23505();
      int var5 = var1.method23506();
      this.field31929 = var1.method23558() / this.field31931;
      this.field31930 = var1.method23559() / var5;
      this.field31932 = this.field31931 * var5;
   }

   @Override
   public void method23936(float var1, float var2, String var3) {
      this.method23937(var1, var2, var3, Color.field16442);
   }

   @Override
   public void method23937(float var1, float var2, String var3, Color var4) {
      this.method23938(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void method23938(float var1, float var2, String var3, Color var4, int var5, int var6) {
      try {
         byte[] var9 = var3.getBytes("US-ASCII");

         for (int var10 = 0; var10 < var9.length; var10++) {
            int var11 = var9[var10] - this.field31928;
            if (var11 < this.field31932) {
               int var12 = var11 % this.field31931;
               int var13 = var11 / this.field31931;
               if (var10 >= var5 || var10 <= var6) {
                  this.field31927.method23504(var12, var13).method23528(var1 + (float)(var10 * this.field31929), var2, var4);
               }
            }
         }
      } catch (UnsupportedEncodingException var14) {
         Log.method25661(var14);
      }
   }

   @Override
   public int method23941(String var1) {
      return this.field31930;
   }

   @Override
   public int getStringWidth(String var1) {
      return this.field31929 * var1.length();
   }

   @Override
   public int method23943() {
      return this.field31930;
   }
}
