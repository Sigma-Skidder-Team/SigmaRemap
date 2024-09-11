package mapped;

public class Class3074 implements Class2982 {
   public final Class4032 field18244;

   public Class3074(Class4032 var1) {
      this.field18244 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class6039 var5 = var1.method30580().<Class6039>method22438(Class6039.class);
      Class4824 var6 = new Class4824(var4);
      Class4749 var7 = new Class4749(var4);
      Class8173 var8 = var1.<Class8173>method30559(var6);
      var1.method30560(var7, var8);

      for (int var9 = 0; var9 < var8.method28446().length; var9++) {
         Class8225 var10 = var8.method28446()[var9];
         if (var10 != null) {
            for (int var11 = 0; var11 < var10.method28631(); var11++) {
               int var12 = var10.method28632(var11);
               int var13 = Class7795.method25886(var12);
               var10.method28633(var11, var13);
            }

            boolean var23 = false;

            for (int var27 = 0; var27 < var10.method28631(); var27++) {
               int var30 = var10.method28632(var27);
               if (var5.method18687(var30)) {
                  var23 = true;
                  break;
               }
            }

            boolean var28 = false;
            if (ViaVersion3.method27612().method21925() && Class9322.method35227()) {
               for (int var31 = 0; var31 < var10.method28631(); var31++) {
                  int var14 = var10.method28632(var31);
                  if (Class9322.method35230(var14)) {
                     var28 = true;
                     break;
                  }
               }
            }

            if (var23) {
               for (int var32 = 0; var32 < 16; var32++) {
                  for (int var35 = 0; var35 < 16; var35++) {
                     for (int var15 = 0; var15 < 16; var15++) {
                        int var16 = var10.method28626(var15, var32, var35);
                        if (var5.method18687(var16)) {
                           var5.method18685(
                              new Class9695(var15 + (var8.method28440() << 4), (short)(var32 + (var9 << 4)), var35 + (var8.method28441() << 4)), var16
                           );
                        }
                     }
                  }
               }
            }

            if (var28) {
               for (int var33 = 0; var33 < 16; var33++) {
                  for (int var36 = 0; var36 < 16; var36++) {
                     for (int var38 = 0; var38 < 16; var38++) {
                        int var40 = var10.method28626(var38, var33, var36);
                        if (Class9322.method35230(var40)) {
                           Class9322.field43273
                              .method16987(var1.method30580(), var38 + (var8.method28440() << 4), var33 + (var9 << 4), var36 + (var8.method28441() << 4), var40);
                        }
                     }
                  }
               }
            }
         }
      }

      if (var8.method28439()) {
         int var18 = Integer.MIN_VALUE;

         for (int var20 = 0; var20 < 256; var20++) {
            int var24 = var8.method28447()[var20];
            if (!Class7795.method25889().contains(var24)) {
               if (var24 != 255 && var18 != var24) {
                  if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
                     ViaVersion3.method27613().getLogger().warning("Received invalid biome id " + var24);
                  }

                  var18 = var24;
               }

               var8.method28447()[var20] = 1;
            }
         }
      }

      Class5412 var19 = ViaVersion3.getInstance().method34424().<Class5412>method31084(Class5412.class);

      for (Class72 var25 : var8.method28451()) {
         int var29 = var19.method16999(var1.method30580(), null, var25, false);
         if (var29 != -1) {
            int var34 = (Integer)var25.<Class61>method235("x").method205();
            int var37 = (Integer)var25.<Class61>method235("y").method205();
            int var39 = (Integer)var25.<Class61>method235("z").method205();
            Class9695 var41 = new Class9695(var34, (short)var37, var39);
            Class9344 var17 = var5.method18689(var41);
            if (var17 != null) {
               var17.method35364(var29);
            }

            var8.method28446()[var37 >> 4].method28623(var34 & 15, var37 & 15, var39 & 15, var29);
         }
      }

      if (ViaVersion3.method27612().method21925()) {
         Class9322.method35228(var1.method30580(), var8);
         var1.method30568(Class6380.class, true, true);
         var1.method30578();

         for (int var22 = 0; var22 < var8.method28446().length; var22++) {
            Class8225 var26 = var8.method28446()[var22];
            if (var26 != null) {
               Class9322.method35223(var1.method30580(), var8.method28440(), var8.method28441(), var22);
            }
         }
      }
   }
}
