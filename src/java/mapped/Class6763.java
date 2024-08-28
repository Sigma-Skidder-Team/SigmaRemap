package mapped;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class Class6763 extends Class6762 {
   private static String[] field29471;

   @Override
   public void method20613(Class1667 var1, Class1006 var2) {
      super.method20613(var1, var2);
      this.field29472 = var2.method4223(Class2163.field14191);
   }

   @Override
   public void method20614() {
      this.field29476.method4224(Class2163.field14191, this.field29472);
      super.method20614();
   }

   @Override
   public Class7176 method20615() {
      int var3;
      if (this.method20649() && this.field29476.method3250()) {
         var3 = Class9679.method37769(this.field29476.getPosY());
         Mutable var4 = new Mutable(this.field29476.getPosX(), (double)var3, this.field29476.getPosZ());

         for (Block var5 = this.field29475.method6738(var4).method23383();
              var5 == Blocks.WATER;
              var5 = this.field29475.method6738(var4).method23383()
         ) {
            var4.method8373(this.field29476.getPosX(), (double)(++var3), this.field29476.getPosZ());
         }
      } else {
         var3 = Class9679.method37769(this.field29476.getPosY() + 0.5);
      }

      BlockPos var10 = this.field29476.method3432();
      Class2163 var11 = this.method20642(this.field29476, var10.method8304(), var3, var10.method8306());
      if (this.field29476.method4223(var11) < 0.0F) {
         Set<BlockPos> var6 = Sets.newHashSet();
         var6.add(new BlockPos(this.field29476.method3389().field28449, (double)var3, this.field29476.method3389().field28451));
         var6.add(new BlockPos(this.field29476.method3389().field28449, (double)var3, this.field29476.method3389().field28454));
         var6.add(new BlockPos(this.field29476.method3389().field28452, (double)var3, this.field29476.method3389().field28451));
         var6.add(new BlockPos(this.field29476.method3389().field28452, (double)var3, this.field29476.method3389().field28454));

         for (BlockPos var8 : var6) {
            Class2163 var9 = this.method20631(this.field29476, var8);
            if (this.field29476.method4223(var9) >= 0.0F) {
               return super.method20641(var8.method8304(), var8.getY(), var8.method8306());
            }
         }
      }

      return super.method20641(var10.method8304(), var3, var10.method8306());
   }

   @Override
   public Class7175 method20616(double var1, double var3, double var5) {
      return new Class7175(super.method20641(Class9679.method37769(var1), Class9679.method37769(var3), Class9679.method37769(var5)));
   }

   @Override
   public int method20617(Class7176[] var1, Class7176 var2) {
      int var5 = 0;
      Class7176 var6 = this.method20641(var2.field30847, var2.field30848, var2.field30849 + 1);
      if (this.method20640(var6)) {
         var1[var5++] = var6;
      }

      Class7176 var7 = this.method20641(var2.field30847 - 1, var2.field30848, var2.field30849);
      if (this.method20640(var7)) {
         var1[var5++] = var7;
      }

      Class7176 var8 = this.method20641(var2.field30847 + 1, var2.field30848, var2.field30849);
      if (this.method20640(var8)) {
         var1[var5++] = var8;
      }

      Class7176 var9 = this.method20641(var2.field30847, var2.field30848, var2.field30849 - 1);
      if (this.method20640(var9)) {
         var1[var5++] = var9;
      }

      Class7176 var10 = this.method20641(var2.field30847, var2.field30848 + 1, var2.field30849);
      if (this.method20640(var10)) {
         var1[var5++] = var10;
      }

      Class7176 var11 = this.method20641(var2.field30847, var2.field30848 - 1, var2.field30849);
      if (this.method20640(var11)) {
         var1[var5++] = var11;
      }

      Class7176 var12 = this.method20641(var2.field30847, var2.field30848 + 1, var2.field30849 + 1);
      if (this.method20640(var12) && this.method20639(var6) && this.method20639(var10)) {
         var1[var5++] = var12;
      }

      Class7176 var13 = this.method20641(var2.field30847 - 1, var2.field30848 + 1, var2.field30849);
      if (this.method20640(var13) && this.method20639(var7) && this.method20639(var10)) {
         var1[var5++] = var13;
      }

      Class7176 var14 = this.method20641(var2.field30847 + 1, var2.field30848 + 1, var2.field30849);
      if (this.method20640(var14) && this.method20639(var8) && this.method20639(var10)) {
         var1[var5++] = var14;
      }

      Class7176 var15 = this.method20641(var2.field30847, var2.field30848 + 1, var2.field30849 - 1);
      if (this.method20640(var15) && this.method20639(var9) && this.method20639(var10)) {
         var1[var5++] = var15;
      }

      Class7176 var16 = this.method20641(var2.field30847, var2.field30848 - 1, var2.field30849 + 1);
      if (this.method20640(var16) && this.method20639(var6) && this.method20639(var11)) {
         var1[var5++] = var16;
      }

      Class7176 var17 = this.method20641(var2.field30847 - 1, var2.field30848 - 1, var2.field30849);
      if (this.method20640(var17) && this.method20639(var7) && this.method20639(var11)) {
         var1[var5++] = var17;
      }

      Class7176 var18 = this.method20641(var2.field30847 + 1, var2.field30848 - 1, var2.field30849);
      if (this.method20640(var18) && this.method20639(var8) && this.method20639(var11)) {
         var1[var5++] = var18;
      }

      Class7176 var19 = this.method20641(var2.field30847, var2.field30848 - 1, var2.field30849 - 1);
      if (this.method20640(var19) && this.method20639(var9) && this.method20639(var11)) {
         var1[var5++] = var19;
      }

      Class7176 var20 = this.method20641(var2.field30847 + 1, var2.field30848, var2.field30849 - 1);
      if (this.method20640(var20) && this.method20639(var9) && this.method20639(var8)) {
         var1[var5++] = var20;
      }

      Class7176 var21 = this.method20641(var2.field30847 + 1, var2.field30848, var2.field30849 + 1);
      if (this.method20640(var21) && this.method20639(var6) && this.method20639(var8)) {
         var1[var5++] = var21;
      }

      Class7176 var22 = this.method20641(var2.field30847 - 1, var2.field30848, var2.field30849 - 1);
      if (this.method20640(var22) && this.method20639(var9) && this.method20639(var7)) {
         var1[var5++] = var22;
      }

      Class7176 var23 = this.method20641(var2.field30847 - 1, var2.field30848, var2.field30849 + 1);
      if (this.method20640(var23) && this.method20639(var6) && this.method20639(var7)) {
         var1[var5++] = var23;
      }

      Class7176 var24 = this.method20641(var2.field30847 + 1, var2.field30848 + 1, var2.field30849 - 1);
      if (this.method20640(var24)
         && this.method20639(var20)
         && this.method20639(var9)
         && this.method20639(var8)
         && this.method20639(var10)
         && this.method20639(var15)
         && this.method20639(var14)) {
         var1[var5++] = var24;
      }

      Class7176 var25 = this.method20641(var2.field30847 + 1, var2.field30848 + 1, var2.field30849 + 1);
      if (this.method20640(var25)
         && this.method20639(var21)
         && this.method20639(var6)
         && this.method20639(var8)
         && this.method20639(var10)
         && this.method20639(var12)
         && this.method20639(var14)) {
         var1[var5++] = var25;
      }

      Class7176 var26 = this.method20641(var2.field30847 - 1, var2.field30848 + 1, var2.field30849 - 1);
      if (this.method20640(var26)
         && this.method20639(var22)
         && this.method20639(var9)
         && this.method20639(var7) & this.method20639(var10)
         && this.method20639(var15)
         && this.method20639(var13)) {
         var1[var5++] = var26;
      }

      Class7176 var27 = this.method20641(var2.field30847 - 1, var2.field30848 + 1, var2.field30849 + 1);
      if (this.method20640(var27)
         && this.method20639(var23)
         && this.method20639(var6)
         && this.method20639(var7) & this.method20639(var10)
         && this.method20639(var12)
         && this.method20639(var13)) {
         var1[var5++] = var27;
      }

      Class7176 var28 = this.method20641(var2.field30847 + 1, var2.field30848 - 1, var2.field30849 - 1);
      if (this.method20640(var28)
         && this.method20639(var20)
         && this.method20639(var9)
         && this.method20639(var8)
         && this.method20639(var11)
         && this.method20639(var19)
         && this.method20639(var18)) {
         var1[var5++] = var28;
      }

      Class7176 var29 = this.method20641(var2.field30847 + 1, var2.field30848 - 1, var2.field30849 + 1);
      if (this.method20640(var29)
         && this.method20639(var21)
         && this.method20639(var6)
         && this.method20639(var8)
         && this.method20639(var11)
         && this.method20639(var16)
         && this.method20639(var18)) {
         var1[var5++] = var29;
      }

      Class7176 var30 = this.method20641(var2.field30847 - 1, var2.field30848 - 1, var2.field30849 - 1);
      if (this.method20640(var30)
         && this.method20639(var22)
         && this.method20639(var9)
         && this.method20639(var7)
         && this.method20639(var11)
         && this.method20639(var19)
         && this.method20639(var17)) {
         var1[var5++] = var30;
      }

      Class7176 var31 = this.method20641(var2.field30847 - 1, var2.field30848 - 1, var2.field30849 + 1);
      if (this.method20640(var31)
         && this.method20639(var23)
         && this.method20639(var6)
         && this.method20639(var7)
         && this.method20639(var11)
         && this.method20639(var16)
         && this.method20639(var17)) {
         var1[var5++] = var31;
      }

      return var5;
   }

   private boolean method20639(Class7176 var1) {
      return var1 != null && var1.field30858 >= 0.0F;
   }

   private boolean method20640(Class7176 var1) {
      return var1 != null && !var1.field30856;
   }

   @Nullable
   @Override
   public Class7176 method20641(int var1, int var2, int var3) {
      Class7176 var6 = null;
      Class2163 var7 = this.method20642(this.field29476, var1, var2, var3);
      float var8 = this.field29476.method4223(var7);
      if (var8 >= 0.0F) {
         var6 = super.method20641(var1, var2, var3);
         var6.field30859 = var7;
         var6.field30858 = Math.max(var6.field30858, var8);
         if (var7 == Class2163.field14186) {
            var6.field30858++;
         }
      }

      return var7 != Class2163.field14185 && var7 != Class2163.field14186 ? var6 : var6;
   }

   @Override
   public Class2163 method20629(Class1665 var1, int var2, int var3, int var4, Class1006 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet<Class2163> var13 = EnumSet.noneOf(Class2163.class);
      Class2163 var14 = Class2163.field14184;
      BlockPos var15 = var5.method3432();
      var14 = this.method20630(var1, var2, var3, var4, var6, var7, var8, var9, var10, var13, var14, var15);
      if (var13.contains(Class2163.field14189)) {
         return Class2163.field14189;
      } else {
         Class2163 var16 = Class2163.field14184;

         for (Class2163 var18 : var13) {
            if (var5.method4223(var18) < 0.0F) {
               return var18;
            }

            if (var5.method4223(var18) >= var5.method4223(var16)) {
               var16 = var18;
            }
         }

         return var14 == Class2163.field14185 && var5.method4223(var16) == 0.0F ? Class2163.field14185 : var16;
      }
   }

   @Override
   public Class2163 method20621(Class1665 var1, int var2, int var3, int var4) {
      Mutable var7 = new Mutable();
      Class2163 var8 = method20635(var1, var7.method8372(var2, var3, var4));
      if (var8 == Class2163.field14185 && var3 >= 1) {
         Class7380 var9 = var1.method6738(var7.method8372(var2, var3 - 1, var4));
         Class2163 var10 = method20635(var1, var7.method8372(var2, var3 - 1, var4));
         if (var10 == Class2163.field14196 || var9.method23448(Blocks.field36890) || var10 == Class2163.field14190 || var9.method23446(Class7645.field32809)
            )
          {
            var8 = Class2163.field14196;
         } else if (var10 != Class2163.field14198) {
            if (var10 != Class2163.field14200) {
               if (var10 != Class2163.field14207) {
                  if (var10 != Class2163.field14189) {
                     var8 = var10 != Class2163.field14186 && var10 != Class2163.field14185 && var10 != Class2163.field14191
                        ? Class2163.field14186
                        : Class2163.field14185;
                  } else {
                     var8 = Class2163.field14189;
                  }
               } else {
                  var8 = Class2163.field14207;
               }
            } else {
               var8 = Class2163.field14200;
            }
         } else {
            var8 = Class2163.field14198;
         }
      }

      if (var8 == Class2163.field14186 || var8 == Class2163.field14185) {
         var8 = method20634(var1, var7.method8372(var2, var3, var4), var8);
      }

      return var8;
   }

   private Class2163 method20631(Class1006 var1, BlockPos var2) {
      return this.method20642(var1, var2.method8304(), var2.getY(), var2.method8306());
   }

   private Class2163 method20642(Class1006 var1, int var2, int var3, int var4) {
      return this.method20629(
         this.field29475, var2, var3, var4, var1, this.field29478, this.field29479, this.field29480, this.method20648(), this.method20647()
      );
   }
}
