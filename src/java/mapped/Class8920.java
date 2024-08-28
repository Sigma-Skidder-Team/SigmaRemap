package mapped;

import com.mentalfrostbyte.jello.event.impl.Class4396;

public class Class8920 {
   private static String[] field40380;

   public static void method32597(Class4396 var0, Class8982 var1) {
      if (var0.method13898() instanceof Class5607) {
         Class5607 var4 = (Class5607)var0.method13898();
         var1.method33183(var4.method17632(), var4.method17631());
         if (var1 != null) {
            var1.method33174();
         }

         var1.method33180(var0.method13898());
         var0.method13900(true);
      }

      if (var0.method13898() instanceof Class5549) {
         Class5549 var17 = (Class5549)var0.method13898();

         for (int var5 = 0; var5 < var17.field24643.length; var5++) {
            BlockPos var6 = var17.field24642.method8405(var17.field24643[var5]);
            if (var1.method33182(var17.field24644[var5])) {
               var1.method33183(var6, var17.field24644[var5]);
            }
         }

         var1.method33174();
         var1.method33180(var0.method13898());
         var0.method13900(true);
      }

      if (var0.method13898() instanceof Class5526 && Minecraft.getInstance().world != null) {
         Class5526 var18 = (Class5526)var0.method13898();

         try {
            while (Minecraft.getInstance().getClientPlayNetHandler() == null) {
               Thread.sleep(100L);
            }
         } catch (InterruptedException var16) {
         }

         Class1684 var19 = var18.method17384() == null
            ? null
            : new Class1684(Minecraft.getInstance().getClientPlayNetHandler().field23287.<Biome>method32453(Registry.BIOME_KEY), var18.method17384());
         Class1674 var20 = new Class1674(Minecraft.getInstance().world, new Class7481(var18.method17378(), var18.method17379()), null);
         var20.method7142(var19, new PacketBuffer(var18.method17374().copy()), var18.method17382(), var18.method17380());
         if (var20 != null) {
            int var7 = 0;

            for (Class7038 var11 : var20.method7067()) {
               if (var11 != null && !var11.method21858()) {
                  for (float var12 = 0.0F; var12 <= 15.0F; var12++) {
                     for (float var13 = 0.0F; var13 <= 15.0F; var13++) {
                        for (float var14 = 0.0F; var14 <= 15.0F; var14++) {
                           Class7380 var15 = var20.method6738(new BlockPos((double)var13, (double)((float)(var7 * 16) + var12), (double)var14));
                           if (var1.method33182(var15)) {
                              var1.method33183(
                                 new BlockPos(
                                    (double)((float)(var20.method7072().field32174 * 16) + var13),
                                    (double)((float)(var7 * 16) + var12),
                                    (double)((float)(var20.method7072().field32175 * 16) + var14)
                                 ),
                                 var15
                              );
                           }
                        }
                     }
                  }
               }

               var7++;
            }

            var1.method33174();
            var1.method33185(var20);
            if (var20 == null) {
               return;
            }

            Class5526 var21 = new Class5526(var20, var20.method7077() == null ? '\ufffe' : '\uffff');
            var21.field24521 = var18.method17381();
            var21.field24520 = var18.method17383();
            var0.method13899(var21);
         }
      }
   }
}
