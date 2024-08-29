package mapped;

import java.util.IdentityHashMap;
import java.util.Map;

public class Class8736 {
   public int field39386 = 1;
   public boolean field39387 = false;
   private Map[] field39388 = new Map[8];

   public Class8736(String var1) {
      if (!var1.equals("4")) {
         if (!var1.equals("2")) {
            if (!var1.equals("F")) {
               if (!var1.equals("4F")) {
                  if (!var1.equals("2F")) {
                     Class7944.method26811("NaturalTextures: Unknown type: " + var1);
                  } else {
                     this.field39386 = 2;
                     this.field39387 = true;
                  }
               } else {
                  this.field39386 = 4;
                  this.field39387 = true;
               }
            } else {
               this.field39387 = true;
            }
         } else {
            this.field39386 = 2;
         }
      } else {
         this.field39386 = 4;
      }
   }

   public boolean method31523() {
      return this.field39386 != 2 && this.field39386 != 4 ? this.field39387 : true;
   }

   public synchronized Class8557 method31524(Class8557 var1, int var2, boolean var3) {
      int var6 = var2;
      if (var3) {
         var6 = var2 | 4;
      }

      if (var6 > 0 && var6 < this.field39388.length) {
         Map var7 = this.field39388[var6];
         if (var7 == null) {
            var7 = new IdentityHashMap(1);
            this.field39388[var6] = (Map)var7;
         }

         Class8557 var8 = (Class8557)var7.get(var1);
         if (var8 == null) {
            var8 = this.method31525(var1, var2, var3);
            var7.put(var1, var8);
         }

         return var8;
      } else {
         return var1;
      }
   }

   private Class8557 method31525(Class8557 var1, int var2, boolean var3) {
      int[] var6 = var1.method30511();
      int var7 = var1.method30513();
      Direction var8 = var1.method30514();
      TextureAtlasSprite var9 = var1.method30516();
      boolean var10 = var1.method30515();
      if (!this.method31527(var1)) {
         var2 = 0;
      }

      var6 = this.method31526(var6, var2, var3);
      return new Class8557(var6, var7, var8, var9, var10);
   }

   private int[] method31526(int[] var1, int var2, boolean var3) {
      int[] var6 = (int[])var1.clone();
      int var7 = 4 - var2;
      if (var3) {
         var7 += 3;
      }

      var7 %= 4;
      int var8 = var6.length / 4;

      for (int var9 = 0; var9 < 4; var9++) {
         int var10 = var9 * var8;
         int var11 = var7 * var8;
         var6[var11 + 4] = var1[var10 + 4];
         var6[var11 + 4 + 1] = var1[var10 + 4 + 1];
         if (!var3) {
            if (++var7 > 3) {
               var7 = 0;
            }
         } else if (--var7 < 0) {
            var7 = 3;
         }
      }

      return var6;
   }

   private boolean method31527(Class8557 var1) {
      TextureAtlasSprite var4 = var1.method30516();
      float var5 = var4.method7459();
      float var6 = var4.method7460();
      float var7 = var6 - var5;
      float var8 = var7 / 256.0F;
      float var9 = var4.method7462();
      float var10 = var4.method7463();
      float var11 = var10 - var9;
      float var12 = var11 / 256.0F;
      int[] var13 = var1.method30511();
      int var14 = var13.length / 4;

      for (int var15 = 0; var15 < 4; var15++) {
         int var16 = var15 * var14;
         float var17 = Float.intBitsToFloat(var13[var16 + 4]);
         float var18 = Float.intBitsToFloat(var13[var16 + 4 + 1]);
         if (!this.method31528(var17, var5, var8) && !this.method31528(var17, var6, var8)) {
            return false;
         }

         if (!this.method31528(var18, var9, var12) && !this.method31528(var18, var10, var12)) {
            return false;
         }
      }

      return true;
   }

   private boolean method31528(float var1, float var2, float var3) {
      float var6 = MathHelper.method37771(var1 - var2);
      return var6 < var3;
   }
}
