package mapped;

import javax.annotation.Nullable;

public class Class3249 extends Block implements Class3245 {
   public static final Class8552<Class182> field18712 = Class8820.field39723;

   public Class3249(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18712, Class182.field657));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18712);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18712, var2.method251().method510(var1.<Class182>method23463(field18712)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23465(field18712, var2.method8751().method510(var1.<Class182>method23463(field18712)));
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Direction var4 = var1.method18354();
      Direction var5;
      if (var4.method544() != Class113.field414) {
         var5 = Direction.field673;
      } else {
         var5 = var1.method18350().method536();
      }

      return this.method11579().method23465(field18712, Class182.method526(var4, var5));
   }

   @Nullable
   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class965();
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class944 var9 = var2.method6759(var3);
      if (var9 instanceof Class965 && var4.method2979()) {
         var4.method2892((Class965)var9);
         return Class2274.method9002(var2.field9020);
      } else {
         return Class2274.field14820;
      }
   }

   public static boolean method11674(Class8266 var0, Class8266 var1) {
      Direction var4 = method11675(var0.field35531);
      Direction var5 = method11675(var1.field35531);
      Direction var6 = method11676(var0.field35531);
      Direction var7 = method11676(var1.field35531);
      Class92 var8 = Class92.method269(var0.field35532.method126("joint")).orElseGet(() -> !var4.method544().method324() ? Class92.field237 : Class92.field238);
      boolean var9 = var8 == Class92.field237;
      return var4 == var5.method536() && (var9 || var6 == var7) && var0.field35532.method126("target").equals(var1.field35532.method126("name"));
   }

   public static Direction method11675(Class7380 var0) {
      return var0.<Class182>method23463(field18712).method527();
   }

   public static Direction method11676(Class7380 var0) {
      return var0.<Class182>method23463(field18712).method528();
   }
}
