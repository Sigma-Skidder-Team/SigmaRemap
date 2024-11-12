package mapped;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.util.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;


public class Class7426 implements Font {
   private static SGL field31916 = Renderer.get();
   private static final int field31917 = 200;
   private static final int field31918 = 255;
   private boolean field31919 = true;
   private Image field31920;
   private Class7924[] field31921;
   private int field31922;
   private int field31923 = -1;
   private int field31924;
   private Class9685 field31925;
   private final LinkedHashMap field31926 = new Class19(this, 200, 1.0F, true);

   public Class7426(String var1, Image var2) throws Class2451 {
      this.field31920 = var2;
      this.method23934(ResourceLoader.getResourceAsStream(var1));
   }

   public Class7426(String var1, String var2) throws Class2451 {
      this.field31920 = new Image(var2);
      this.method23934(ResourceLoader.getResourceAsStream(var1));
   }

   public Class7426(String var1, Image var2, boolean var3) throws Class2451 {
      this.field31920 = var2;
      this.field31919 = var3;
      this.method23934(ResourceLoader.getResourceAsStream(var1));
   }

   public Class7426(String var1, String var2, boolean var3) throws Class2451 {
      this.field31920 = new Image(var2);
      this.field31919 = var3;
      this.method23934(ResourceLoader.getResourceAsStream(var1));
   }

   public Class7426(String var1, InputStream var2, InputStream var3) throws Class2451 {
      this.field31920 = new Image(var3, var1, false);
      this.method23934(var2);
   }

   public Class7426(String var1, InputStream var2, InputStream var3, boolean var4) throws Class2451 {
      this.field31920 = new Image(var3, var1, false);
      this.field31919 = var4;
      this.method23934(var2);
   }

   private void method23934(InputStream var1) throws Class2451 {
      if (this.field31919) {
         this.field31923 = field31916.glGenLists(200);
         if (this.field31923 == 0) {
            this.field31919 = false;
         }
      }

      try {
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var1));
         String var5 = var4.readLine();
         String var6 = var4.readLine();
         String var7 = var4.readLine();
         Map<Short, List> var8 = new HashMap(64);
         List<Class7924> var9 = new ArrayList<>(255);
         int var10 = 0;
         boolean var11 = false;

         while (!var11) {
            String var12 = var4.readLine();
            if (var12 == null) {
               var11 = true;
            } else {
               if (!var12.startsWith("chars c") && var12.startsWith("char")) {
                  Class7924 var13 = this.method23935(var12);
                  if (var13 != null) {
                     var10 = Math.max(var10, var13.field33919);
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
                  List var17 = var8.get(new Short(var14));
                  if (var17 == null) {
                     var17 = new ArrayList();
                     var8.put(new Short(var14), var17);
                  }

                  var17.add(new Short((short)(var16 << 8 | var15)));
               }
            }
         }

         this.field31921 = new Class7924[var10 + 1];

         for (Class7924 var23 : var9) {
            this.field31921[var23.field33919] = var23;
         }

         for (Entry var24 : var8.entrySet()) {
            short var25 = (Short)var24.getKey();
            List var26 = (List)var24.getValue();
            short[] var27 = new short[var26.size()];
            int var28 = 0;

            for (Iterator var18 = var26.iterator(); var18.hasNext(); var28++) {
               var27[var28] = (Short)var18.next();
            }

            this.field31921[var25].field33929 = var27;
         }
      } catch (IOException var19) {
         Log.error(var19);
         throw new Class2451("Failed to parse font file: " + var1);
      }
   }

   private Class7924 method23935(String var1) throws Class2451 {
      Class7924 var4 = new Class7924(this, null);
      StringTokenizer var5 = new StringTokenizer(var1, " =");
      var5.nextToken();
      var5.nextToken();
      var4.field33919 = Short.parseShort(var5.nextToken());
      if (var4.field33919 >= 0) {
         if (var4.field33919 <= 255) {
            var5.nextToken();
            var4.field33920 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33921 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33922 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33923 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33924 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33925 = Short.parseShort(var5.nextToken());
            var5.nextToken();
            var4.field33926 = Short.parseShort(var5.nextToken());
            var4.method26594();
            if (var4.field33919 != 32) {
               this.field31922 = Math.max(var4.field33923 + var4.field33925, this.field31922);
            }

            return var4;
         } else {
            throw new Class2451("Invalid character '" + var4.field33919 + "': AngelCodeFont does not support characters above " + 255);
         }
      } else {
         return null;
      }
   }

   @Override
   public void drawString(float var1, float var2, String var3) {
      this.drawString(var1, var2, var3, Color.white);
   }

   @Override
   public void drawString(float var1, float var2, String var3, Color var4) {
      this.drawString(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void drawString(float var1, float var2, String var3, Color var4, int var5, int var6) {
      this.field31920.method23522();
      var4.bind();
      field31916.glTranslatef(var1, var2, 0.0F);
      if (this.field31919 && var5 == 0 && var6 == var3.length() - 1) {
         Class9685 var9 = (Class9685)this.field31926.get(var3);
         if (var9 == null) {
            var9 = new Class9685(null);
            var9.field45292 = var3;
            int var10 = this.field31926.size();
            if (var10 >= 200) {
               var9.field45288 = this.field31924;
               this.field31926.remove(this.field31925.field45292);
            } else {
               var9.field45288 = this.field31923 + var10;
            }

            this.field31926.put(var3, var9);
            field31916.glNewList(var9.field45288, 4865);
            this.method23939(var3, var5, var6);
            field31916.glEndList();
         } else {
            field31916.glCallList(var9.field45288);
         }
      } else {
         this.method23939(var3, var5, var6);
      }

      field31916.glTranslatef(-var1, -var2, 0.0F);
   }

   private void method23939(String var1, int var2, int var3) {
      field31916.glBegin(7);
      int var6 = 0;
      int var7 = 0;
      Class7924 var8 = null;
      char[] var9 = var1.toCharArray();

      for (int var10 = 0; var10 < var9.length; var10++) {
         char var11 = var9[var10];
         if (var11 != '\n') {
            if (var11 < this.field31921.length) {
               Class7924 var12 = this.field31921[var11];
               if (var12 != null) {
                  if (var8 != null) {
                     var6 += var8.method26596(var11);
                  }

                  var8 = var12;
                  if (var10 >= var2 && var10 <= var3) {
                     var12.method26595((float)var6, (float)var7);
                  }

                  var6 += var12.field33926;
               }
            }
         } else {
            var6 = 0;
            var7 += this.getLineHeight();
         }
      }

      field31916.glEnd();
   }

   public int method23940(String var1) {
      Class9685 var4 = null;
      if (this.field31919) {
         var4 = (Class9685)this.field31926.get(var1);
         if (var4 != null && var4.field45289 != null) {
            return var4.field45289.intValue();
         }
      }

      int var5 = var1.indexOf(10);
      if (var5 == -1) {
         var5 = var1.length();
      }

      int var6 = 10000;

      for (int var7 = 0; var7 < var5; var7++) {
         char var8 = var1.charAt(var7);
         Class7924 var9 = this.field31921[var8];
         if (var9 != null) {
            var6 = Math.min(var9.field33925, var6);
         }
      }

      if (var4 != null) {
         var4.field45289 = new Short((short)var6);
      }

      return var6;
   }

   @Override
   public int getHeight(String var1) {
      Class9685 var4 = null;
      if (this.field31919) {
         var4 = (Class9685)this.field31926.get(var1);
         if (var4 != null && var4.field45291 != null) {
            return var4.field45291.intValue();
         }
      }

      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.length(); var7++) {
         char var8 = var1.charAt(var7);
         if (var8 != '\n') {
            if (var8 != ' ') {
               Class7924 var9 = this.field31921[var8];
               if (var9 != null) {
                  var6 = Math.max(var9.field33923 + var9.field33925, var6);
               }
            }
         } else {
            var5++;
            var6 = 0;
         }
      }

      var6 += var5 * this.getLineHeight();
      if (var4 != null) {
         var4.field45291 = new Short((short)var6);
      }

      return var6;
   }

   @Override
   public int getWidth(String var1) {
      Class9685 var4 = null;
      if (this.field31919) {
         var4 = (Class9685)this.field31926.get(var1);
         if (var4 != null && var4.field45290 != null) {
            return var4.field45290.intValue();
         }
      }

      int var5 = 0;
      int var6 = 0;
      Class7924 var7 = null;
      int var8 = 0;

      for (int var9 = var1.length(); var8 < var9; var8++) {
         char var10 = var1.charAt(var8);
         if (var10 != '\n') {
            if (var10 < this.field31921.length) {
               Class7924 var11 = this.field31921[var10];
               if (var11 != null) {
                  if (var7 != null) {
                     var6 += var7.method26596(var10);
                  }

                  var7 = var11;
                  if (var8 >= var9 - 1) {
                     var6 += var11.field33922;
                  } else {
                     var6 += var11.field33926;
                  }

                  var5 = Math.max(var5, var6);
               }
            }
         } else {
            var6 = 0;
         }
      }

      if (var4 != null) {
         var4.field45290 = new Short((short)var5);
      }

      return var5;
   }

   @Override
   public int getLineHeight() {
      return this.field31922;
   }

   // $VF: synthetic method
   public static Class9685 method23944(Class7426 var0, Class9685 var1) {
      return var0.field31925 = var1;
   }

   // $VF: synthetic method
   public static int method23945(Class7426 var0, int var1) {
      return var0.field31924 = var1;
   }

   // $VF: synthetic method
   public static Class9685 method23946(Class7426 var0) {
      return var0.field31925;
   }

   // $VF: synthetic method
   public static Image method23947(Class7426 var0) {
      return var0.field31920;
   }
}
