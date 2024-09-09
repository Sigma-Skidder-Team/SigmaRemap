package mapped;

public class Class3181 implements Class2982 {
   public final Class3790 field18436;

   public Class3181(Class3790 var1) {
      this.field18436 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class8173 var5 = var1.<Class8173>method30559(new Class4749(var4));
      var1.method30560(new Class4772(), var5);
      int[] var6 = new int[256];
      int[] var7 = new int[256];

      for (int var8 = 0; var8 < 16; var8++) {
         Class8225 var9 = var5.method28446()[var8];
         if (var9 != null) {
            boolean var10 = false;

            for (int var11 = 0; var11 < var9.method28631(); var11++) {
               int var12 = var9.method28632(var11);
               int var13 = this.field18436.field19972.method19376().method18528(var12);
               if (!var10 && var13 != Class7290.field31272 && var13 != Class7290.field31273 && var13 != Class7290.field31274) {
                  var10 = true;
               }

               var9.method28633(var11, var13);
            }

            if (!var10) {
               var9.method28652(0);
            } else {
               int var19 = 0;

               for (int var21 = 0; var21 < 16; var21++) {
                  for (int var26 = 0; var26 < 16; var26++) {
                     for (int var14 = 0; var14 < 16; var14++) {
                        int var15 = var9.method28626(var21, var26, var14);
                        if (var15 != Class7290.field31272 && var15 != Class7290.field31273 && var15 != Class7290.field31274) {
                           var19++;
                           var7[var21 + var14 * 16] = var26 + var8 * 16 + 1;
                        }

                        if (this.field18436.field19972.method19376().method18525().contains(var15)) {
                           var6[var21 + var14 * 16] = var26 + var8 * 16 + 1;
                        }

                        if (ViaVersion3.method27612().method21935() && this.field18436.field19972.method19376().method18526().contains(var15)) {
                           Class7290.method23055(var5, var9, var8, var21, var26, var14);
                        }
                     }
                  }
               }

               var9.method28652(var19);
            }
         }
      }

      Class72 var16 = new Class72("");
      var16.<Class65>method236(new Class65("MOTION_BLOCKING", Class7290.method23056(var6)));
      var16.<Class65>method236(new Class65("WORLD_SURFACE", Class7290.method23056(var7)));
      var5.method28450(var16);
      Class8563 var17 = var1.method30573(36);
      var17.method30560(Class4750.field22544, var5.method28440());
      var17.method30560(Class4750.field22544, var5.method28441());
      int var18 = !var5.method28442() ? 0 : 262143;
      int var20 = 0;

      for (int var22 = 0; var22 < var5.method28446().length; var22++) {
         Class8225 var27 = var5.method28446()[var22];
         if (var27 != null) {
            if (!var5.method28442() && var27.method28649()) {
               var18 |= 1 << var22 + 1;
            }

            var20 |= 1 << var22 + 1;
         }
      }

      var17.method30560(Class4750.field22544, var18);
      var17.method30560(Class4750.field22544, var20);
      var17.method30560(Class4750.field22544, 0);
      var17.method30560(Class4750.field22544, 0);
      if (var5.method28442()) {
         var17.method30560(Class4750.field22520, Class7290.method23057());
      }

      for (Class8225 var34 : var5.method28446()) {
         if (var34 != null && var34.method28649()) {
            var17.method30560(Class4750.field22520, var34.method28642());
         } else if (var5.method28442()) {
            var17.method30560(Class4750.field22520, Class7290.method23057());
         }
      }

      if (var5.method28442()) {
         var17.method30560(Class4750.field22520, Class7290.method23057());
      }

      for (Class8225 var35 : var5.method28446()) {
         if (var35 != null) {
            var17.method30560(Class4750.field22520, var35.method28640());
         }
      }

      Class6058 var25 = var1.method30580().<Class6058>method22438(Class6058.class);
      int var30 = Math.abs(var25.method18785() - var5.method28440());
      int var33 = Math.abs(var25.method18787() - var5.method28441());
      if (var25.method18783() || var30 >= 64 || var33 >= 64) {
         Class8563 var36 = var1.method30573(64);
         var36.method30560(Class4750.field22544, var5.method28440());
         var36.method30560(Class4750.field22544, var5.method28441());
         var36.method30568(Class6371.class, true, true);
         var25.method18786(var5.method28440());
         var25.method18788(var5.method28441());
      }

      var17.method30568(Class6371.class, true, true);
   }

   private Byte[] method11406(byte[] var1) {
      Byte[] var4 = new Byte[var1.length];

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4[var5] = var1[var5];
      }

      return var4;
   }
}
