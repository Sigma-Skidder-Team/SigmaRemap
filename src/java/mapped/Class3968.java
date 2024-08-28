package mapped;

import java.util.List;

public class Class3968 extends Class3758 {
   private static String[] field20259;
   public final Class6377 field20260;

   public Class3968(Class6377 var1) {
      this.field20260 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var0 -> {
         int var3 = var0.<Integer>method30561(Class4750.field22544);
         var0.<String>method30561(Class4750.field22539);
         var0.<Integer>method30561(Class4750.field22536);
         int var4 = var0.<Integer>method30561(Class4750.field22544);
         Class6038 var5 = var0.method30580().method22465();
         var5.method18676(var3);
         if (Class8042.method27614().method34424().<Class5417>method31084(Class5417.class) == null) {
            var0.method30580().method22469(false);
         } else {
            int var6 = Class8042.method27614().method34424().<Class5417>method31084(Class5417.class).method17012(var0.method30580());
            var5.method18678(var6);
            List<Class9284<Integer, Class6355>> var7 = null;
            if (var5.method18675() >= var6 || Class8042.method27613().method27365()) {
               var7 = Class9019.method33363(var5.method18675(), var6);
            }

            Class6376 var8 = var0.method30580().method22465().method18683();
            if (var7 != null) {
               for (Class9284 var10 : var7) {
                  var8.method19388((Class6355)var10.method35009());
                  Class9019.method33367((Class<? extends Class6355>)((Class6355)var10.method35009()).getClass());
               }

               Class5989 var11 = Class5989.method18569(var6);
               var0.method30558(Class4750.field22544, 0, var11.method18576());
            }

            var8.method19388(Class9019.method33365(var6));
            if (var4 == 1) {
               var5.method18674(Class187.field700);
            }

            if (var4 == 2) {
               var5.method18674(Class187.field701);
            }
         }
      });
   }
}
