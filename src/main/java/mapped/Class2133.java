package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.MathHelper;
import net.optifine.Config;

import java.util.HashMap;
import java.util.Map;

public enum Class2133 {
   field13921(10, Class2118.field13803, "+", Class2118.field13803, Class2118.field13803),
   field13922(10, Class2118.field13803, "-", Class2118.field13803, Class2118.field13803),
   field13923(11, Class2118.field13803, "*", Class2118.field13803, Class2118.field13803),
   field13924(11, Class2118.field13803, "/", Class2118.field13803, Class2118.field13803),
   field13925(11, Class2118.field13803, "%", Class2118.field13803, Class2118.field13803),
   field13926(12, Class2118.field13803, "neg", Class2118.field13803),
   field13927(Class2118.field13803, "pi"),
   field13928(Class2118.field13803, "sin", Class2118.field13803),
   field13929(Class2118.field13803, "cos", Class2118.field13803),
   field13930(Class2118.field13803, "asin", Class2118.field13803),
   field13931(Class2118.field13803, "acos", Class2118.field13803),
   field13932(Class2118.field13803, "tan", Class2118.field13803),
   field13933(Class2118.field13803, "atan", Class2118.field13803),
   field13934(Class2118.field13803, "atan2", Class2118.field13803, Class2118.field13803),
   field13935(Class2118.field13803, "torad", Class2118.field13803),
   field13936(Class2118.field13803, "todeg", Class2118.field13803),
   field13937(Class2118.field13803, "min", new Class7816().method26100(Class2118.field13803).method26101(Class2118.field13803)),
   field13938(Class2118.field13803, "max", new Class7816().method26100(Class2118.field13803).method26101(Class2118.field13803)),
   field13939(Class2118.field13803, "clamp", Class2118.field13803, Class2118.field13803, Class2118.field13803),
   field13940(Class2118.field13803, "abs", Class2118.field13803),
   field13941(Class2118.field13803, "floor", Class2118.field13803),
   field13942(Class2118.field13803, "ceil", Class2118.field13803),
   field13943(Class2118.field13803, "exp", Class2118.field13803),
   field13944(Class2118.field13803, "frac", Class2118.field13803),
   field13945(Class2118.field13803, "log", Class2118.field13803),
   field13946(Class2118.field13803, "pow", Class2118.field13803, Class2118.field13803),
   field13947(Class2118.field13803, "random"),
   field13948(Class2118.field13803, "round", Class2118.field13803),
   field13949(Class2118.field13803, "signum", Class2118.field13803),
   field13950(Class2118.field13803, "sqrt", Class2118.field13803),
   field13951(Class2118.field13803, "fmod", Class2118.field13803, Class2118.field13803),
   field13952(Class2118.field13803, "time"),
   field13953(
      Class2118.field13803,
      "if",
      new Class7816()
         .method26100(Class2118.field13805, Class2118.field13803)
         .method26101(Class2118.field13805, Class2118.field13803)
         .method26102(Class2118.field13803)
   ),
   field13954(12, Class2118.field13805, "!", Class2118.field13805),
   field13955(3, Class2118.field13805, "&&", Class2118.field13805, Class2118.field13805),
   field13956(2, Class2118.field13805, "||", Class2118.field13805, Class2118.field13805),
   field13957(8, Class2118.field13805, ">", Class2118.field13803, Class2118.field13803),
   field13958(8, Class2118.field13805, ">=", Class2118.field13803, Class2118.field13803),
   field13959(8, Class2118.field13805, "<", Class2118.field13803, Class2118.field13803),
   field13960(8, Class2118.field13805, "<=", Class2118.field13803, Class2118.field13803),
   field13961(7, Class2118.field13805, "==", Class2118.field13803, Class2118.field13803),
   field13962(7, Class2118.field13805, "!=", Class2118.field13803, Class2118.field13803),
   field13963(7, Class2118.field13805, "between", Class2118.field13803, Class2118.field13803, Class2118.field13803),
   field13964(7, Class2118.field13805, "equals", Class2118.field13803, Class2118.field13803, Class2118.field13803),
   field13965(Class2118.field13805, "in", new Class7816().method26100(Class2118.field13803).method26101(Class2118.field13803).method26102(Class2118.field13803)),
   field13966(Class2118.field13803, "smooth", new Class7816().method26100(Class2118.field13803).method26101(Class2118.field13803).method26103(4)),
   field13967(Class2118.field13805, "true"),
   field13968(Class2118.field13805, "false"),
   field13969(Class2118.field13804, "vec2", Class2118.field13803, Class2118.field13803),
   field13970(Class2118.field13804, "vec3", Class2118.field13803, Class2118.field13803, Class2118.field13803),
   field13971(Class2118.field13804, "vec4", Class2118.field13803, Class2118.field13803, Class2118.field13803, Class2118.field13803);

   private int field13972;
   private Class2118 field13973;
   private String field13974;
   private Class7815 field13975;
   public static Class2133[] field13976 = values();
   private static final Map<Integer, Float> field13977 = new HashMap<Integer, Float>();
   private static final Class2133[] field13978 = new Class2133[]{
      field13921,
      field13922,
      field13923,
      field13924,
      field13925,
      field13926,
      field13927,
      field13928,
      field13929,
      field13930,
      field13931,
      field13932,
      field13933,
      field13934,
      field13935,
      field13936,
      field13937,
      field13938,
      field13939,
      field13940,
      field13941,
      field13942,
      field13943,
      field13944,
      field13945,
      field13946,
      field13947,
      field13948,
      field13949,
      field13950,
      field13951,
      field13952,
      field13953,
      field13954,
      field13955,
      field13956,
      field13957,
      field13958,
      field13959,
      field13960,
      field13961,
      field13962,
      field13963,
      field13964,
      field13965,
      field13966,
      field13967,
      field13968,
      field13969,
      field13970,
      field13971
   };

   private Class2133(Class2118 var3, String var4, Class2118... var5) {
      this(0, var3, var4, var5);
   }

   private Class2133(int var3, Class2118 var4, String var5, Class2118... var6) {
      this(var3, var4, var5, new Class7814(var6));
   }

   private Class2133(Class2118 var3, String var4, Class7815 var5) {
      this(0, var3, var4, var5);
   }

   private Class2133(int var3, Class2118 var4, String var5, Class7815 var6) {
      this.field13972 = var3;
      this.field13973 = var4;
      this.field13974 = var5;
      this.field13975 = var6;
   }

   public String method8817() {
      return this.field13974;
   }

   public int method8818() {
      return this.field13972;
   }

   public Class2118 method8819() {
      return this.field13973;
   }

   public Class7815 method8820() {
      return this.field13975;
   }

   public int method8821(Class1878[] var1) {
      return this.field13975.method26094(var1).length;
   }

   public Class2118[] method8822(Class1878[] var1) {
      return this.field13975.method26094(var1);
   }

   public float method8823(Class1878[] var1) {
      switch (Class5091.field23178[this.ordinal()]) {
         case 1:
            return method8826(var1, 0) + method8826(var1, 1);
         case 2:
            return method8826(var1, 0) - method8826(var1, 1);
         case 3:
            return method8826(var1, 0) * method8826(var1, 1);
         case 4:
            return method8826(var1, 0) / method8826(var1, 1);
         case 5:
            float var4 = method8826(var1, 0);
            float var5 = method8826(var1, 1);
            return var4 - var5 * (float)((int)(var4 / var5));
         case 6:
            return -method8826(var1, 0);
         case 7:
            return MathHelper.field45210;
         case 8:
            return MathHelper.sin(method8826(var1, 0));
         case 9:
            return MathHelper.cos(method8826(var1, 0));
         case 10:
            return Class7317.method23165(method8826(var1, 0));
         case 11:
            return Class7317.method23166(method8826(var1, 0));
         case 12:
            return (float)Math.tan((double)method8826(var1, 0));
         case 13:
            return (float)Math.atan((double)method8826(var1, 0));
         case 14:
            return (float) MathHelper.method37814((double)method8826(var1, 0), (double)method8826(var1, 1));
         case 15:
            return Class7317.method23172(method8826(var1, 0));
         case 16:
            return Class7317.method23171(method8826(var1, 0));
         case 17:
            return this.method8824(var1);
         case 18:
            return this.method8825(var1);
         case 19:
            return MathHelper.clamp(method8826(var1, 0), method8826(var1, 1), method8826(var1, 2));
         case 20:
            return MathHelper.method37771(method8826(var1, 0));
         case 21:
            return (float)Math.exp((double)method8826(var1, 0));
         case 22:
            return (float) MathHelper.floor(method8826(var1, 0));
         case 23:
            return (float) MathHelper.ceil(method8826(var1, 0));
         case 24:
            return MathHelper.method37807(method8826(var1, 0));
         case 25:
            return (float)Math.log((double)method8826(var1, 0));
         case 26:
            return (float)Math.pow((double)method8826(var1, 0), (double)method8826(var1, 1));
         case 27:
            return (float)Math.random();
         case 28:
            return (float)Math.round(method8826(var1, 0));
         case 29:
            return Math.signum(method8826(var1, 0));
         case 30:
            return MathHelper.sqrt(method8826(var1, 0));
         case 31:
            float var6 = method8826(var1, 0);
            float var7 = method8826(var1, 1);
            return var6 - var7 * (float) MathHelper.floor(var6 / var7);
         case 32:
            Minecraft var8 = Minecraft.getInstance();
            ClientWorld var9 = var8.world;
            if (var9 == null) {
               return 0.0F;
            }

            return (float)(var9.getGameTime() % 24000L) + var8.getRenderPartialTicks();
         case 33:
            int var10 = (var1.length - 1) / 2;

            for (int var15 = 0; var15 < var10; var15++) {
               int var16 = var15 * 2;
               if (method8828(var1, var16)) {
                  return method8826(var1, var16 + 1);
               }
            }

            return method8826(var1, var10 * 2);
         case 34:
            int var11 = (int)method8826(var1, 0);
            float var12 = method8826(var1, 1);
            float var13 = var1.length > 2 ? method8826(var1, 2) : 1.0F;
            float var14 = var1.length > 3 ? method8826(var1, 3) : var13;
            return Class9717.method38075(var11, var12, var13, var14);
         default:
            Config.method26811("Unknown function type: " + this);
            return 0.0F;
      }
   }

   private float method8824(Class1878[] var1) {
      if (var1.length != 2) {
         float var4 = method8826(var1, 0);

         for (int var5 = 1; var5 < var1.length; var5++) {
            float var6 = method8826(var1, var5);
            if (var6 < var4) {
               var4 = var6;
            }
         }

         return var4;
      } else {
         return Math.min(method8826(var1, 0), method8826(var1, 1));
      }
   }

   private float method8825(Class1878[] var1) {
      if (var1.length != 2) {
         float var4 = method8826(var1, 0);

         for (int var5 = 1; var5 < var1.length; var5++) {
            float var6 = method8826(var1, var5);
            if (var6 > var4) {
               var4 = var6;
            }
         }

         return var4;
      } else {
         return Math.max(method8826(var1, 0), method8826(var1, 1));
      }
   }

   private static float method8826(Class1878[] var0, int var1) {
      Class1884 var4 = (Class1884)var0[var1];
      return var4.method8142();
   }

   public boolean method8827(Class1878[] var1) {
      switch (Class5091.field23178[this.ordinal()]) {
         case 35:
            return true;
         case 36:
            return false;
         case 37:
            return !method8828(var1, 0);
         case 38:
            return method8828(var1, 0) && method8828(var1, 1);
         case 39:
            return method8828(var1, 0) || method8828(var1, 1);
         case 40:
            return method8826(var1, 0) > method8826(var1, 1);
         case 41:
            return method8826(var1, 0) >= method8826(var1, 1);
         case 42:
            return method8826(var1, 0) < method8826(var1, 1);
         case 43:
            return method8826(var1, 0) <= method8826(var1, 1);
         case 44:
            return method8826(var1, 0) == method8826(var1, 1);
         case 45:
            return method8826(var1, 0) != method8826(var1, 1);
         case 46:
            float var4 = method8826(var1, 0);
            return var4 >= method8826(var1, 1) && var4 <= method8826(var1, 2);
         case 47:
            float var5 = method8826(var1, 0) - method8826(var1, 1);
            float var6 = method8826(var1, 2);
            return Math.abs(var5) <= var6;
         case 48:
            float var7 = method8826(var1, 0);

            for (int var8 = 1; var8 < var1.length; var8++) {
               float var9 = method8826(var1, var8);
               if (var7 == var9) {
                  return true;
               }
            }

            return false;
         default:
            Config.method26811("Unknown function type: " + this);
            return false;
      }
   }

   private static boolean method8828(Class1878[] var0, int var1) {
      Class1876 var4 = (Class1876)var0[var1];
      return var4.method8137();
   }

   public float[] method8829(Class1878[] var1) {
      switch (Class5091.field23178[this.ordinal()]) {
         case 49:
            return new float[]{method8826(var1, 0), method8826(var1, 1)};
         case 50:
            return new float[]{method8826(var1, 0), method8826(var1, 1), method8826(var1, 2)};
         case 51:
            return new float[]{method8826(var1, 0), method8826(var1, 1), method8826(var1, 2), method8826(var1, 3)};
         default:
            Config.method26811("Unknown function type: " + this);
            return null;
      }
   }

   public static Class2133 method8830(String var0) {
      for (int var3 = 0; var3 < field13976.length; var3++) {
         Class2133 var4 = field13976[var3];
         if (var4.method8817().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
