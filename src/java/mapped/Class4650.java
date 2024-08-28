package mapped;

import java.util.ArrayList;

public class Class4650 implements Class4651, Class4649 {
   private static String[] field22181;
   private ArrayList field22182 = new ArrayList();
   private Class8731 field22183 = new Class8731(this);
   private Class7237 field22184;
   private int field22185;
   private Class2022[][] field22186;
   private boolean field22187;
   private Class7693 field22188;
   private Class2022 field22189;
   private Class7559 field22190;
   private int field22191;
   private int field22192;
   private int field22193;

   public Class4650(Class7237 var1, int var2, boolean var3) {
      this(var1, var2, var3, new Class7694());
   }

   public Class4650(Class7237 var1, int var2, boolean var3, Class7693 var4) {
      this.field22188 = var4;
      this.field22184 = var1;
      this.field22185 = var2;
      this.field22187 = var3;
      this.field22186 = new Class2022[var1.method22727()][var1.method22728()];

      for (int var7 = 0; var7 < var1.method22727(); var7++) {
         for (int var8 = 0; var8 < var1.method22728(); var8++) {
            this.field22186[var7][var8] = new Class2022(this, var7, var8);
         }
      }
   }

   @Override
   public Class2423 method14606(Class7559 var1, int var2, int var3, int var4, int var5) {
      this.field22189 = null;
      this.field22190 = var1;
      this.field22191 = var4;
      this.field22192 = var5;
      this.field22193 = 0;
      if (this.field22184.method22730(this, var4, var5)) {
         return null;
      } else {
         for (int var8 = 0; var8 < this.field22184.method22727(); var8++) {
            for (int var9 = 0; var9 < this.field22184.method22728(); var9++) {
               this.field22186[var8][var9].method8615();
            }
         }

         Class2022.method8616(this.field22186[var2][var3], 0.0F);
         Class2022.method8617(this.field22186[var2][var3], 0);
         this.field22182.clear();
         this.field22183.method31513();
         this.method14610(this.field22186[var2][var3]);
         Class2022.method8618(this.field22186[var4][var5], null);
         int var17 = 0;

         while (var17 < this.field22185 && this.field22183.method31516() != 0) {
            int var18 = var2;
            int var10 = var3;
            if (this.field22189 != null) {
               var18 = Class2022.method8619(this.field22189);
               var10 = Class2022.method8620(this.field22189);
            }

            this.field22189 = this.method14609();
            this.field22193 = Class2022.method8621(this.field22189);
            if (this.field22189 == this.field22186[var4][var5] && this.method14616(var1, var18, var10, var4, var5)) {
               break;
            }

            this.method14612(this.field22189);
            this.method14613(this.field22189);

            for (int var11 = -1; var11 < 2; var11++) {
               for (int var12 = -1; var12 < 2; var12++) {
                  if ((var11 != 0 || var12 != 0) && (this.field22187 || var11 == 0 || var12 == 0)) {
                     int var13 = var11 + Class2022.method8619(this.field22189);
                     int var14 = var12 + Class2022.method8620(this.field22189);
                     if (this.method14616(var1, Class2022.method8619(this.field22189), Class2022.method8620(this.field22189), var13, var14)) {
                        float var15 = Class2022.method8622(this.field22189)
                           + this.method14617(var1, Class2022.method8619(this.field22189), Class2022.method8620(this.field22189), var13, var14);
                        Class2022 var16 = this.field22186[var13][var14];
                        this.field22184.method22729(var13, var14);
                        if (var15 < Class2022.method8622(var16)) {
                           if (this.method14611(var16)) {
                              this.method14612(var16);
                           }

                           if (this.method14614(var16)) {
                              this.method14615(var16);
                           }
                        }

                        if (!this.method14611(var16) && !this.method14614(var16)) {
                           Class2022.method8616(var16, var15);
                           Class2022.method8623(var16, this.method14618(var1, var13, var14, var4, var5));
                           var17 = Math.max(var17, var16.method8610(this.field22189));
                           this.method14610(var16);
                        }
                     }
                  }
               }
            }
         }

         if (Class2022.method8624(this.field22186[var4][var5]) == null) {
            return null;
         } else {
            Class2423 var19 = new Class2423();

            for (Class2022 var20 = this.field22186[var4][var5]; var20 != this.field22186[var2][var3]; var20 = Class2022.method8624(var20)) {
               var19.method10381(Class2022.method8619(var20), Class2022.method8620(var20));
            }

            var19.method10381(var2, var3);
            return var19;
         }
      }
   }

   public int method14607() {
      return this.field22189 != null ? Class2022.method8619(this.field22189) : -1;
   }

   public int method14608() {
      return this.field22189 != null ? Class2022.method8620(this.field22189) : -1;
   }

   public Class2022 method14609() {
      return (Class2022)this.field22183.method31512();
   }

   public void method14610(Class2022 var1) {
      var1.method8611(true);
      this.field22183.method31514(var1);
   }

   public boolean method14611(Class2022 var1) {
      return var1.method8612();
   }

   public void method14612(Class2022 var1) {
      var1.method8611(false);
      this.field22183.method31515(var1);
   }

   public void method14613(Class2022 var1) {
      var1.method8613(true);
      this.field22182.add(var1);
   }

   public boolean method14614(Class2022 var1) {
      return var1.method8614();
   }

   public void method14615(Class2022 var1) {
      var1.method8613(false);
      this.field22182.remove(var1);
   }

   public boolean method14616(Class7559 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 < 0 || var5 < 0 || var4 >= this.field22184.method22727() || var5 >= this.field22184.method22728();
      if (!var8 && (var2 != var4 || var3 != var5)) {
         this.field22190 = var1;
         this.field22191 = var2;
         this.field22192 = var3;
         var8 = this.field22184.method22730(this, var4, var5);
      }

      return !var8;
   }

   public float method14617(Class7559 var1, int var2, int var3, int var4, int var5) {
      this.field22190 = var1;
      this.field22191 = var2;
      this.field22192 = var3;
      return this.field22184.method22731(this, var4, var5);
   }

   public float method14618(Class7559 var1, int var2, int var3, int var4, int var5) {
      return this.field22188.method25325(this.field22184, var1, var2, var3, var4, var5);
   }

   @Override
   public Class7559 method14602() {
      return this.field22190;
   }

   @Override
   public int method14603() {
      return this.field22193;
   }

   @Override
   public int method14604() {
      return this.field22191;
   }

   @Override
   public int method14605() {
      return this.field22192;
   }
}
