package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class130 extends Class128 {
   private static String[] field445;
   private final Class6872 field446;
   private final int field447;

   public Class130(Class122[] var1, Class6872 var2, int var3) {
      super(var1);
      this.field446 = var2;
      this.field447 = var3;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38623;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44333);
   }

   private boolean method378() {
      return this.field447 > 0;
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      Entity var5 = var2.<Entity>method26081(Class9525.field44333);
      if (var5 instanceof Class880) {
         int var6 = Class7858.method26330((Class880)var5);
         if (var6 == 0) {
            return var1;
         }

         float var7 = (float)var6 * this.field446.method20924(var2.method26088());
         var1.method32181(Math.round(var7));
         if (this.method378() && var1.method32179() > this.field447) {
            var1.method32180(this.field447);
         }
      }

      return var1;
   }

   public static Class5882 method379(Class6872 var0) {
      return new Class5882(var0);
   }

   // $VF: synthetic method
   public static Class6872 method380(Class130 var0) {
      return var0.field446;
   }

   // $VF: synthetic method
   public static boolean method381(Class130 var0) {
      return var0.method378();
   }

   // $VF: synthetic method
   public static int method382(Class130 var0) {
      return var0.field447;
   }
}
