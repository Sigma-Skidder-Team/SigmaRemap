package mapped;

import java.util.ArrayList;

public class Class4648 implements Class4649 {
   private static String[] field22176;
   private int field22177;
   private int field22178;
   private float field22179 = 0.2F;
   private boolean field22180;

   public Class9392 method14596(Class7237 var1) {
      return this.method14597(var1, true);
   }

   public Class9392 method14597(Class7237 var1, boolean var2) {
      this.field22180 = var2;
      ArrayList var5 = new ArrayList();
      if (!var2) {
         Class7701 var6 = new Class7701(0.0F, 0.0F, (float)var1.method22727(), (float)var1.method22728());
         this.method14601(var1, var6, var5);
      } else {
         for (int var8 = 0; var8 < var1.method22727(); var8++) {
            for (int var7 = 0; var7 < var1.method22728(); var7++) {
               if (!var1.method22730(this, var8, var7)) {
                  var5.add(new Class7701((float)var8, (float)var7, 1.0F, 1.0F));
               }
            }
         }
      }

      while (this.method14598(var5)) {
      }

      this.method14599(var5);
      return new Class9392(var5);
   }

   private boolean method14598(ArrayList var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         Class7701 var5 = (Class7701)var1.get(var4);

         for (int var6 = var4 + 1; var6 < var1.size(); var6++) {
            Class7701 var7 = (Class7701)var1.get(var6);
            if (var5.method25449(var7)) {
               var1.remove(var5);
               var1.remove(var7);
               var1.add(var5.method25448(var7));
               return true;
            }
         }
      }

      return false;
   }

   private void method14599(ArrayList var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         Class7701 var5 = (Class7701)var1.get(var4);

         for (int var6 = var4 + 1; var6 < var1.size(); var6++) {
            Class7701 var7 = (Class7701)var1.get(var6);
            if (var5.method25447(var7)) {
               var5.method25445(var7);
               var7.method25445(var5);
            }
         }
      }
   }

   public boolean method14600(Class7237 var1, Class7701 var2) {
      if (this.field22180) {
         return true;
      } else {
         float var5 = 0.0F;
         boolean var6 = false;

         while (var5 < var2.method25441()) {
            float var7 = 0.0F;
            boolean var8 = false;

            while (var7 < var2.method25442()) {
               this.field22177 = (int)(var2.method25443() + var5);
               this.field22178 = (int)(var2.method25444() + var7);
               if (var1.method22730(this, this.field22177, this.field22178)) {
                  return false;
               }

               var7 += 0.1F;
               if (var7 > var2.method25442() && !var8) {
                  var7 = var2.method25442();
                  var8 = true;
               }
            }

            var5 += 0.1F;
            if (var5 > var2.method25441() && !var6) {
               var5 = var2.method25441();
               var6 = true;
            }
         }

         return true;
      }
   }

   private void method14601(Class7237 var1, Class7701 var2, ArrayList var3) {
      if (this.method14600(var1, var2)) {
         var3.add(var2);
      } else {
         float var6 = var2.method25441() / 2.0F;
         float var7 = var2.method25442() / 2.0F;
         if (var6 < this.field22179 && var7 < this.field22179) {
            return;
         }

         this.method14601(var1, new Class7701(var2.method25443(), var2.method25444(), var6, var7), var3);
         this.method14601(var1, new Class7701(var2.method25443(), var2.method25444() + var7, var6, var7), var3);
         this.method14601(var1, new Class7701(var2.method25443() + var6, var2.method25444(), var6, var7), var3);
         this.method14601(var1, new Class7701(var2.method25443() + var6, var2.method25444() + var7, var6, var7), var3);
      }
   }

   @Override
   public Class7559 method14602() {
      return null;
   }

   @Override
   public int method14603() {
      return 0;
   }

   @Override
   public int method14604() {
      return this.field22177;
   }

   @Override
   public int method14605() {
      return this.field22178;
   }
}
