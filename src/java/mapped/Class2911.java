package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2911 extends Class2898<Class4697> {
   public Class2911(Codec<Class4697> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4697 var5) {
      if (var5.field22289.contains(var1.method6738(var4.method8311()).method23383())) {
         if (var5.field22286 && !var5.field22289.contains(var1.method6738(var4.method8313()).method23383())) {
            return false;
         } else {
            Class7380 var8 = var1.method6738(var4);
            if (!var8.method23393() && !var5.field22289.contains(var8.method23383())) {
               return false;
            } else {
               int var9 = 0;
               int var10 = 0;
               if (var5.field22289.contains(var1.method6738(var4.method8345()).method23383())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.method6738(var4.method8347()).method23383())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.method6738(var4.method8341()).method23383())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.method6738(var4.method8343()).method23383())) {
                  var10++;
               }

               if (var5.field22289.contains(var1.method6738(var4.method8313()).method23383())) {
                  var10++;
               }

               int var11 = 0;
               if (var1.method7007(var4.method8345())) {
                  var11++;
               }

               if (var1.method7007(var4.method8347())) {
                  var11++;
               }

               if (var1.method7007(var4.method8341())) {
                  var11++;
               }

               if (var1.method7007(var4.method8343())) {
                  var11++;
               }

               if (var1.method7007(var4.method8313())) {
                  var11++;
               }

               if (var10 == var5.field22287 && var11 == var5.field22288) {
                  var1.method6725(var4, var5.field22285.method23484(), 2);
                  var1.method6861().method20726(var4, var5.field22285.method23472(), 0);
                  var9++;
               }

               return var9 > 0;
            }
         }
      } else {
         return false;
      }
   }
}