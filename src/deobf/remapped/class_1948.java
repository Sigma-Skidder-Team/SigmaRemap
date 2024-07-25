package remapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import org.newdawn.slick.SlickException;

public class class_1948 implements class_4027 {
   private static class_1299 field_9929 = class_3980.method_18363();
   private static final int field_9932 = 200;
   private static final int field_9931 = 255;
   private boolean field_9933 = true;
   private class_8112 field_9935;
   private class_3053[] field_9936;
   private int field_9938;
   private int field_9930 = -1;
   private int field_9928;
   private class_9319 field_9934;
   private final LinkedHashMap field_9937 = new class_76(this, 200, 1.0F, true);

   public class_1948(String var1, class_8112 var2) throws SlickException {
      this.field_9935 = var2;
      this.method_9004(class_8975.method_41153(var1));
   }

   public class_1948(String var1, String var2) throws SlickException {
      this.field_9935 = new class_8112(var2);
      this.method_9004(class_8975.method_41153(var1));
   }

   public class_1948(String var1, class_8112 var2, boolean var3) throws SlickException {
      this.field_9935 = var2;
      this.field_9933 = var3;
      this.method_9004(class_8975.method_41153(var1));
   }

   public class_1948(String var1, String var2, boolean var3) throws SlickException {
      this.field_9935 = new class_8112(var2);
      this.field_9933 = var3;
      this.method_9004(class_8975.method_41153(var1));
   }

   public class_1948(String var1, InputStream var2, InputStream var3) throws SlickException {
      this.field_9935 = new class_8112(var3, var1, false);
      this.method_9004(var2);
   }

   public class_1948(String var1, InputStream var2, InputStream var3, boolean var4) throws SlickException {
      this.field_9935 = new class_8112(var3, var1, false);
      this.field_9933 = var4;
      this.method_9004(var2);
   }

   private void method_9004(InputStream var1) throws SlickException {
      if (this.field_9933) {
         this.field_9930 = field_9929.method_5915(200);
         if (this.field_9930 == 0) {
            this.field_9933 = false;
         }
      }

      try {
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var1));
         String var5 = var4.readLine();
         String var6 = var4.readLine();
         String var7 = var4.readLine();
         HashMap var8 = new HashMap(64);
         ArrayList var9 = new ArrayList(255);
         int var10 = 0;
         boolean var11 = false;

         while (!var11) {
            String var12 = var4.readLine();
            if (var12 == null) {
               var11 = true;
            } else {
               if (!var12.startsWith("chars c") && var12.startsWith("char")) {
                  class_3053 var13 = this.method_8999(var12);
                  if (var13 != null) {
                     var10 = Math.max(var10, var13.field_14980);
                     var9.add(var13);
                  }
               }

               if (!var12.startsWith("kernings c") && var12.startsWith("kerning")) {
                  StringTokenizer var22 = new StringTokenizer(var12, " =");
                  var22.nextToken();
                  var22.nextToken();
                  short var14 = Short.parseShort(var22.nextToken());
                  var22.nextToken();
                  int var15 = Integer.parseInt(var22.nextToken());
                  var22.nextToken();
                  int var16 = Integer.parseInt(var22.nextToken());
                  Object var17 = (List)var8.get(new Short(var14));
                  if (var17 == null) {
                     var17 = new ArrayList();
                     var8.put(new Short(var14), var17);
                  }

                  var17.add(new Short((short)(var16 << 8 | var15)));
               }
            }
         }

         this.field_9936 = new class_3053[var10 + 1];

         for (class_3053 var23 : var9) {
            this.field_9936[var23.field_14980] = var23;
         }

         for (Entry var24 : var8.entrySet()) {
            short var25 = (Short)var24.getKey();
            List var26 = (List)var24.getValue();
            short[] var27 = new short[var26.size()];
            int var28 = 0;

            for (Iterator var18 = var26.iterator(); var18.hasNext(); var28++) {
               var27[var28] = (Short)var18.next();
            }

            this.field_9936[var25].field_14981 = var27;
         }
      } catch (IOException var19) {
         class_2598.method_11785(var19);
         throw new class_1162("Failed to parse font file: " + var1);
      }
   }

   private class_3053 method_8999(String var1) throws SlickException {
      class_3053 var4 = new class_3053(this, null);
      StringTokenizer var5 = new StringTokenizer(var1, " =");
      var5.nextToken();
      var5.nextToken();
      var4.field_14980 = Short.parseShort(var5.nextToken());
      if (var4.field_14980 >= 0) {
         if (var4.field_14980 <= 255) {
            var5.nextToken();
            var4.field_14984 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14986 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14977 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14974 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14982 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14975 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field_14979 = Short.parseShort(var5.nextToken());
            var4.method_13947();
            if (var4.field_14980 != 32) {
               this.field_9938 = Math.max(var4.field_14974 + var4.field_14975, this.field_9938);
            }

            return var4;
         } else {
            throw new class_1162("Invalid character '" + var4.field_14980 + "': AngelCodeFont does not support characters above " + 255);
         }
      } else {
         return null;
      }
   }

   @Override
   public void method_18544(float var1, float var2, String var3) {
      this.method_18545(var1, var2, var3, class_8709.field_44646);
   }

   @Override
   public void method_18545(float var1, float var2, String var3, class_8709 var4) {
      this.method_18546(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void method_18546(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      this.field_9935.method_36849();
      var4.method_40021();
      field_9929.method_5902(var1, var2, 0.0F);
      if (this.field_9933 && var5 == 0 && var6 == var3.length() - 1) {
         class_9319 var9 = (class_9319)this.field_9937.get(var3);
         if (var9 == null) {
            var9 = new class_9319(null);
            var9.field_47594 = var3;
            int var10 = this.field_9937.size();
            if (var10 >= 200) {
               var9.field_47595 = this.field_9928;
               this.field_9937.remove(this.field_9934.field_47594);
            } else {
               var9.field_47595 = this.field_9930 + var10;
            }

            this.field_9937.put(var3, var9);
            field_9929.method_5928(var9.field_47595, 4865);
            this.method_8997(var3, var5, var6);
            field_9929.method_5930();
         } else {
            field_9929.method_5936(var9.field_47595);
         }
      } else {
         this.method_8997(var3, var5, var6);
      }

      field_9929.method_5902(-var1, -var2, 0.0F);
   }

   private void method_8997(String var1, int var2, int var3) {
      field_9929.method_5934(7);
      int var6 = 0;
      int var7 = 0;
      class_3053 var8 = null;
      char[] var9 = var1.toCharArray();

      for (int var10 = 0; var10 < var9.length; var10++) {
         char var11 = var9[var10];
         if (var11 != '\n') {
            if (var11 < this.field_9936.length) {
               class_3053 var12 = this.field_9936[var11];
               if (var12 != null) {
                  if (var8 != null) {
                     var6 += var8.method_13946(var11);
                  }

                  var8 = var12;
                  if (var10 >= var2 && var10 <= var3) {
                     var12.method_13948((float)var6, (float)var7);
                  }

                  var6 += var12.field_14979;
               }
            }
         } else {
            var6 = 0;
            var7 += this.method_18543();
         }
      }

      field_9929.method_5940();
   }

   public int method_9000(String var1) {
      class_9319 var4 = null;
      if (this.field_9933) {
         var4 = (class_9319)this.field_9937.get(var1);
         if (var4 != null && var4.field_47593 != null) {
            return var4.field_47593.intValue();
         }
      }

      int var5 = var1.indexOf(10);
      if (var5 == -1) {
         var5 = var1.length();
      }

      int var6 = 10000;

      for (int var7 = 0; var7 < var5; var7++) {
         char var8 = var1.charAt(var7);
         class_3053 var9 = this.field_9936[var8];
         if (var9 != null) {
            var6 = Math.min(var9.field_14975, var6);
         }
      }

      if (var4 != null) {
         var4.field_47593 = new Short((short)var6);
      }

      return var6;
   }

   @Override
   public int method_18548(String var1) {
      class_9319 var4 = null;
      if (this.field_9933) {
         var4 = (class_9319)this.field_9937.get(var1);
         if (var4 != null && var4.field_47591 != null) {
            return var4.field_47591.intValue();
         }
      }

      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.length(); var7++) {
         char var8 = var1.charAt(var7);
         if (var8 != '\n') {
            if (var8 != ' ') {
               class_3053 var9 = this.field_9936[var8];
               if (var9 != null) {
                  var6 = Math.max(var9.field_14974 + var9.field_14975, var6);
               }
            }
         } else {
            var5++;
            var6 = 0;
         }
      }

      var6 += var5 * this.method_18543();
      if (var4 != null) {
         var4.field_47591 = new Short((short)var6);
      }

      return var6;
   }

   @Override
   public int method_18547(String var1) {
      class_9319 var4 = null;
      if (this.field_9933) {
         var4 = (class_9319)this.field_9937.get(var1);
         if (var4 != null && var4.field_47590 != null) {
            return var4.field_47590.intValue();
         }
      }

      int var5 = 0;
      int var6 = 0;
      class_3053 var7 = null;
      int var8 = 0;

      for (int var9 = var1.length(); var8 < var9; var8++) {
         char var10 = var1.charAt(var8);
         if (var10 != '\n') {
            if (var10 < this.field_9936.length) {
               class_3053 var11 = this.field_9936[var10];
               if (var11 != null) {
                  if (var7 != null) {
                     var6 += var7.method_13946(var10);
                  }

                  var7 = var11;
                  if (var8 >= var9 - 1) {
                     var6 += var11.field_14977;
                  } else {
                     var6 += var11.field_14979;
                  }

                  var5 = Math.max(var5, var6);
               }
            }
         } else {
            var6 = 0;
         }
      }

      if (var4 != null) {
         var4.field_47590 = new Short((short)var5);
      }

      return var5;
   }

   @Override
   public int method_18543() {
      return this.field_9938;
   }
}
