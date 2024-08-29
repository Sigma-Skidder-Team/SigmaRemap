package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;

public class Class3735 extends Class3676<Class1006> {
   private static String[] field19849;
   private int field19850;
   private Class8238 field19851;
   private BlockPos field19852;
   private float field19853;

   public Class3735() {
      this(150, 250);
   }

   public Class3735(int var1, int var2) {
      super(
         ImmutableMap.of(Class8830.field39841, Class2217.field14486, Class8830.field39831, Class2217.field14485, Class8830.field39824, Class2217.field14484),
         var1,
         var2
      );
   }

   public boolean method12508(ServerWorld var1, Class1006 var2) {
      if (this.field19850 <= 0) {
         Class6947<?> var5 = var2.method2992();
         Class8999 var6 = var5.method21410(Class8830.field39824).get();
         boolean var7 = this.method12663(var2, var6);
         if (!var7 && this.method12662(var2, var6, var1.method6783())) {
            this.field19852 = var6.method33251().method26357();
            return true;
         } else {
            var5.method21405(Class8830.field39824);
            if (var7) {
               var5.method21405(Class8830.field39841);
            }

            return false;
         }
      } else {
         this.field19850--;
         return false;
      }
   }

   public boolean method12499(ServerWorld var1, Class1006 var2, long var3) {
      if (this.field19851 != null && this.field19852 != null) {
         Optional var7 = var2.method2992().<Class8999>method21410(Class8830.field39824);
         Class6990 var8 = var2.method4230();
         return !var8.method21664() && var7.isPresent() && !this.method12663(var2, (Class8999)var7.get());
      } else {
         return false;
      }
   }

   public void method12506(ServerWorld var1, Class1006 var2, long var3) {
      if (var2.method2992().method21404(Class8830.field39824)
         && !this.method12663(var2, var2.method2992().<Class8999>method21410(Class8830.field39824).get())
         && var2.method4230().method21677()) {
         this.field19850 = var1.method6814().nextInt(40);
      }

      var2.method4230().method21666();
      var2.method2992().method21405(Class8830.field39824);
      var2.method2992().method21405(Class8830.field39831);
      this.field19851 = null;
   }

   public void method12502(ServerWorld var1, Class1006 var2, long var3) {
      var2.method2992().method21406(Class8830.field39831, this.field19851);
      var2.method4230().method21656(this.field19851, (double)this.field19853);
   }

   public void method12504(ServerWorld var1, Class1006 var2, long var3) {
      Class8238 var7 = var2.method4230().method21657();
      Class6947<?> var8 = var2.method2992();
      if (this.field19851 != var7) {
         this.field19851 = var7;
         var8.method21406(Class8830.field39831, var7);
      }

      if (var7 != null && this.field19852 != null) {
         Class8999 var9 = var8.method21410(Class8830.field39824).get();
         if (var9.method33251().method26357().method8318(this.field19852) > 4.0 && this.method12662(var2, var9, var1.method6783())) {
            this.field19852 = var9.method33251().method26357();
            this.method12502(var1, var2, var3);
         }
      }
   }

   private boolean method12662(Class1006 var1, Class8999 var2, long var3) {
      BlockPos var7 = var2.method33251().method26357();
      this.field19851 = var1.method4230().method21651(var7, 0);
      this.field19853 = var2.method33252();
      Class6947 var8 = var1.method2992();
      if (!this.method12663(var1, var2)) {
         boolean var9 = this.field19851 != null && this.field19851.method28708();
         if (!var9) {
            if (!var8.method21404(Class8830.field39841)) {
               var8.method21406(Class8830.field39841, var3);
            }
         } else {
            var8.method21405(Class8830.field39841);
         }

         if (this.field19851 != null) {
            return true;
         }

         Vector3d var10 = Class8037.method27587((Class1046)var1, 10, 7, Vector3d.method11330(var7));
         if (var10 != null) {
            this.field19851 = var1.method4230().method21648(var10.field18048, var10.field18049, var10.field18050, 0);
            return this.field19851 != null;
         }
      } else {
         var8.method21405(Class8830.field39841);
      }

      return false;
   }

   private boolean method12663(Class1006 var1, Class8999 var2) {
      return var2.method33251().method26357().method8321(var1.getPosition()) <= var2.method33253();
   }
}
