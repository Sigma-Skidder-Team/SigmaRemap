package mapped;

import java.util.Map;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5824 extends Class5823 {
   private static String[] field25516;
   private static final Logger field25517 = LogManager.getLogger();
   private int field25518;
   private String field25519;
   private final Class4923 field25520 = Class4923.method15238();

   public Class5824(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5824(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35655, var1, var2, var3);
      this.method18125(this.field25520);
   }

   @Override
   public boolean method18191(Class7380 var1) {
      return var1.method23446(Class7645.field32765);
   }

   @Override
   public boolean method18189(PlayerEntity var1, boolean var2) {
      return (var1.field4919.field29609 || var1.field4920 >= this.field25520.method15234()) && this.field25520.method15234() > 0;
   }

   @Override
   public Class8848 method18190(PlayerEntity var1, Class8848 var2) {
      if (!var1.field4919.field29609) {
         var1.method2727(-this.field25520.method15234());
      }

      this.field25513.method3621(0, Class8848.field39973);
      if (this.field25518 <= 0) {
         this.field25513.method3621(1, Class8848.field39973);
      } else {
         Class8848 var5 = this.field25513.method3618(1);
         if (!var5.method32105() && var5.method32179() > this.field25518) {
            var5.method32182(this.field25518);
            this.field25513.method3621(1, var5);
         } else {
            this.field25513.method3621(1, Class8848.field39973);
         }
      }

      this.field25520.method15235(0);
      this.field25514.method31716((var1x, var2x) -> {
         Class7380 var5x = var1x.method6738(var2x);
         if (!var1.field4919.field29609 && var5x.method23446(Class7645.field32765) && var1.method3013().nextFloat() < 0.12F) {
            Class7380 var6 = Class3218.method11607(var5x);
            if (var6 != null) {
               var1x.method6725(var2x, var6, 2);
               var1x.method6999(1030, var2x, 0);
            } else {
               var1x.method6728(var2x, false);
               var1x.method6999(1029, var2x, 0);
            }
         } else {
            var1x.method6999(1030, var2x, 0);
         }
      });
      return var2;
   }

   @Override
   public void method18192() {
      Class8848 var3 = this.field25513.method3618(0);
      this.field25520.method15235(1);
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var3.method32105()) {
         this.field25512.method3621(0, Class8848.field39973);
         this.field25520.method15235(0);
      } else {
         Class8848 var7 = var3.method32126();
         Class8848 var8 = this.field25513.method3618(1);
         Map<Class6069, Integer> var9 = Class7858.method26312(var7);
         var5 = var5 + var3.method32169() + (var8.method32105() ? 0 : var8.method32169());
         this.field25518 = 0;
         if (!var8.method32105()) {
            boolean var10 = var8.method32107() == Class8514.field38070 && !Class3290.method11830(var8).isEmpty();
            if (var7.method32115() && var7.method32107().method11699(var3, var8)) {
               int var24 = Math.min(var7.method32117(), var7.method32119() / 4);
               if (var24 <= 0) {
                  this.field25512.method3621(0, Class8848.field39973);
                  this.field25520.method15235(0);
                  return;
               }

               int var26;
               for (var26 = 0; var24 > 0 && var26 < var8.method32179(); var26++) {
                  int var28 = var7.method32117() - var24;
                  var7.method32118(var28);
                  var4++;
                  var24 = Math.min(var7.method32117(), var7.method32119() / 4);
               }

               this.field25518 = var26;
            } else {
               if (!var10 && (var7.method32107() != var8.method32107() || !var7.method32115())) {
                  this.field25512.method3621(0, Class8848.field39973);
                  this.field25520.method15235(0);
                  return;
               }

               if (var7.method32115() && !var10) {
                  int var11 = var3.method32119() - var3.method32117();
                  int var12 = var8.method32119() - var8.method32117();
                  int var13 = var12 + var7.method32119() * 12 / 100;
                  int var14 = var11 + var13;
                  int var15 = var7.method32119() - var14;
                  if (var15 < 0) {
                     var15 = 0;
                  }

                  if (var15 < var7.method32117()) {
                     var7.method32118(var15);
                     var4 += 2;
                  }
               }

               Map<Class6069, Integer> var23 = Class7858.method26312(var8);
               boolean var25 = false;
               boolean var27 = false;

               for (Class6069 var30 : var23.keySet()) {
                  if (var30 != null) {
                     int var16 = var9.getOrDefault(var30, 0);
                     int var17 = (Integer)var23.get(var30);
                     var17 = var16 == var17 ? var17 + 1 : Math.max(var17, var16);
                     boolean var18 = var30.method18821(var3);
                     if (this.field25515.field4919.field29609 || var3.method32107() == Class8514.field38070) {
                        var18 = true;
                     }

                     for (Class6069 var20 : var9.keySet()) {
                        if (var20 != var30 && !var30.method18816(var20)) {
                           var18 = false;
                           var4++;
                        }
                     }

                     if (!var18) {
                        var27 = true;
                     } else {
                        var25 = true;
                        if (var17 > var30.method18809()) {
                           var17 = var30.method18809();
                        }

                        var9.put(var30, var17);
                        int var32 = 0;
                        switch (Class9719.field45410[var30.method18812().ordinal()]) {
                           case 1:
                              var32 = 1;
                              break;
                           case 2:
                              var32 = 2;
                              break;
                           case 3:
                              var32 = 4;
                              break;
                           case 4:
                              var32 = 8;
                        }

                        if (var10) {
                           var32 = Math.max(1, var32 / 2);
                        }

                        var4 += var32 * var17;
                        if (var3.method32179() > 1) {
                           var4 = 40;
                        }
                     }
                  }
               }

               if (var27 && !var25) {
                  this.field25512.method3621(0, Class8848.field39973);
                  this.field25520.method15235(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.field25519)) {
            if (var3.method32152()) {
               var6 = 1;
               var4 += var6;
               var7.method32151();
            }
         } else if (!this.field25519.equals(var3.method32149().getString())) {
            var6 = 1;
            var4 += var6;
            var7.method32150(new StringTextComponent(this.field25519));
         }

         this.field25520.method15235(var5 + var4);
         if (var4 <= 0) {
            var7 = Class8848.field39973;
         }

         if (var6 == var4 && var6 > 0 && this.field25520.method15234() >= 40) {
            this.field25520.method15235(39);
         }

         if (this.field25520.method15234() >= 40 && !this.field25515.field4919.field29609) {
            var7 = Class8848.field39973;
         }

         if (!var7.method32105()) {
            int var22 = var7.method32169();
            if (!var8.method32105() && var22 < var8.method32169()) {
               var22 = var8.method32169();
            }

            if (var6 != var4 || var6 == 0) {
               var22 = method18196(var22);
            }

            var7.method32170(var22);
            Class7858.method26314(var9, var7);
         }

         this.field25512.method3621(0, var7);
         this.method18130();
      }
   }

   public static int method18196(int var0) {
      return var0 * 2 + 1;
   }

   public void method18197(String var1) {
      this.field25519 = var1;
      if (this.method18131(2).method18266()) {
         Class8848 var4 = this.method18131(2).method18265();
         if (!StringUtils.isBlank(var1)) {
            var4.method32150(new StringTextComponent(this.field25519));
         } else {
            var4.method32151();
         }
      }

      this.method18192();
   }

   public int method18198() {
      return this.field25520.method15234();
   }
}
