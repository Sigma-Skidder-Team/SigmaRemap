package mapped;

public class Class4829 {
   private static String[] field22601;
   private final TextureAtlasSprite[] field22602 = new TextureAtlasSprite[2];
   private final TextureAtlasSprite[] field22603 = new TextureAtlasSprite[2];
   private TextureAtlasSprite field22604;

   public void method14919() {
      this.field22602[0] = Minecraft.getInstance().getModelManager().method1025().method38153(Blocks.LAVA.method11579()).getParticleTexture();
      this.field22602[1] = Class8968.field40510.method26198();
      this.field22603[0] = Minecraft.getInstance().getModelManager().method1025().method38153(Blocks.WATER.method11579()).getParticleTexture();
      this.field22603[1] = Class8968.field40511.method26198();
      this.field22604 = Class8968.field40512.method26198();
   }

   private static boolean method14920(Class1665 var0, BlockPos var1, Direction var2, Class7379 var3) {
      BlockPos var6 = var1.method8349(var2);
      Class7379 var7 = var0.method6739(var6);
      return var7.method23472().method25066(var3.method23472());
   }

   private static boolean method14921(Class1665 var0, Direction var1, float var2, BlockPos var3, BlockState var4) {
      if (!var4.method23410()) {
         return false;
      } else {
         Class6408 var7 = Class8022.method27427(0.0, 0.0, 0.0, 1.0, (double)var2, 1.0);
         Class6408 var8 = var4.method23389(var0, var3);
         return Class8022.method27441(var7, var8, var1);
      }
   }

   private static boolean method14922(Class1665 var0, BlockPos var1, Direction var2, float var3) {
      BlockPos var6 = var1.method8349(var2);
      BlockState var7 = var0.getBlockState(var6);
      return method14921(var0, var2, var3, var6, var7);
   }

   private static boolean method14923(Class1665 var0, BlockPos var1, BlockState var2, Direction var3) {
      return method14921(var0, var3.method536(), 1.0F, var1, var2);
   }

   public static boolean method14924(Class1663 var0, BlockPos var1, Class7379 var2, BlockState var3, Direction var4) {
      return !method14923(var0, var1, var3, var4) && !method14920(var0, var1, var4, var2);
   }

   public boolean method14925(Class1663 var1, BlockPos var2, Class5422 var3, Class7379 var4) {
      BlockState var7 = var4.method23484();

      boolean var23;
      try {
         if (Class7944.method26921()) {
            Class7698.method25376(var7, var3);
         }

         boolean var8 = var4.method23486(Class8953.field40470);
         TextureAtlasSprite[] var9 = var8 ? this.field22602 : this.field22603;
         BlockState var10 = var1.getBlockState(var2);
         if (Class9299.field42875.method20214()) {
            TextureAtlasSprite[] var11 = (TextureAtlasSprite[])Class9299.method35062(Class9299.field42875, var1, var2, var4);
            if (var11 != null) {
               var9 = var11;
            }
         }

         Class8391 var81 = var3.method17022(var7, var2);
         int var12 = -1;
         float var13 = 1.0F;
         if (Class9299.field42833.method20214()) {
            Object var14 = Class9299.method35070(var4.method23472(), Class9299.field42833);
            if (var14 != null && Class9299.field42840.method20214()) {
               var12 = Class9299.method35065(var14, Class9299.field42840, var1, var2);
               var13 = (float)(var12 >> 24 & 0xFF) / 255.0F;
            }
         }

         boolean var82 = !method14920(var1, var2, Direction.field673, var4);
         boolean var15 = method14924(var1, var2, var4, var10, Direction.DOWN) && !method14922(var1, var2, Direction.DOWN, 0.8888889F);
         boolean var16 = method14924(var1, var2, var4, var10, Direction.NORTH);
         boolean var17 = method14924(var1, var2, var4, var10, Direction.SOUTH);
         boolean var18 = method14924(var1, var2, var4, var10, Direction.WEST);
         boolean var19 = method14924(var1, var2, var4, var10, Direction.EAST);
         if (var82 || var15 || var19 || var18 || var16 || var17) {
            if (var12 < 0) {
               var12 = Class9680.method37854(var1, var7, var2, var81);
            }

            float var20 = (float)(var12 >> 16 & 0xFF) / 255.0F;
            float var21 = (float)(var12 >> 8 & 0xFF) / 255.0F;
            float var22 = (float)(var12 & 0xFF) / 255.0F;
            var23 = false;
            float var24 = var1.method6877(Direction.DOWN, true);
            float var25 = var1.method6877(Direction.field673, true);
            float var26 = var1.method6877(Direction.NORTH, true);
            float var27 = var1.method6877(Direction.WEST, true);
            float var28 = this.method14929(var1, var2, var4.method23472());
            float var29 = this.method14929(var1, var2.method8343(), var4.method23472());
            float var30 = this.method14929(var1, var2.method8347().method8343(), var4.method23472());
            float var31 = this.method14929(var1, var2.method8347(), var4.method23472());
            double var32 = (double)(var2.getX() & 15);
            double var34 = (double)(var2.getY() & 15);
            double var36 = (double)(var2.getZ() & 15);
            if (Class7944.method26977()) {
               int var38 = var2.getX() >> 4 << 4;
               int var39 = var2.getY() >> 4 << 4;
               int var40 = var2.getZ() >> 4 << 4;
               byte var41 = 8;
               int var42 = var38 >> var41 << var41;
               int var43 = var40 >> var41 << var41;
               int var44 = var38 - var42;
               int var45 = var40 - var43;
               var32 += (double)var44;
               var34 += (double)var39;
               var36 += (double)var45;
            }

            float var84 = 0.001F;
            float var85 = var15 ? 0.001F : 0.0F;
            if (var82 && !method14922(var1, var2, Direction.field673, Math.min(Math.min(var28, var29), Math.min(var30, var31)))) {
               var23 = true;
               var28 -= 0.001F;
               var29 -= 0.001F;
               var30 -= 0.001F;
               var31 -= 0.001F;
               Vector3d var86 = var4.method23483(var1, var2);
               float var47;
               float var48;
               float var49;
               float var90;
               float var94;
               float var98;
               float var101;
               float var104;
               if (var86.field18048 == 0.0 && var86.field18050 == 0.0) {
                  TextureAtlasSprite var107 = var9[0];
                  var3.method17043(var107);
                  var101 = var107.method7461(0.0);
                  var90 = var107.method7464(0.0);
                  var104 = var101;
                  var47 = var107.method7464(16.0);
                  var48 = var107.method7461(16.0);
                  var94 = var47;
                  var49 = var48;
                  var98 = var90;
               } else {
                  TextureAtlasSprite var46 = var9[1];
                  var3.method17043(var46);
                  float var50 = (float) MathHelper.method37814(var86.field18050, var86.field18048) - (float) (Math.PI / 2);
                  float var51 = MathHelper.sin(var50) * 0.25F;
                  float var52 = MathHelper.cos(var50) * 0.25F;
                  float var53 = 8.0F;
                  var101 = var46.method7461((double)(8.0F + (-var52 - var51) * 16.0F));
                  var90 = var46.method7464((double)(8.0F + (-var52 + var51) * 16.0F));
                  var104 = var46.method7461((double)(8.0F + (-var52 + var51) * 16.0F));
                  var47 = var46.method7464((double)(8.0F + (var52 + var51) * 16.0F));
                  var48 = var46.method7461((double)(8.0F + (var52 + var51) * 16.0F));
                  var94 = var46.method7464((double)(8.0F + (var52 - var51) * 16.0F));
                  var49 = var46.method7461((double)(8.0F + (var52 - var51) * 16.0F));
                  var98 = var46.method7464((double)(8.0F + (-var52 - var51) * 16.0F));
               }

               float var108 = (var101 + var104 + var48 + var49) / 4.0F;
               float var115 = (var90 + var47 + var94 + var98) / 4.0F;
               float var116 = (float)var9[0].method7457() / (var9[0].method7460() - var9[0].method7459());
               float var118 = (float)var9[0].method7458() / (var9[0].method7463() - var9[0].method7462());
               float var120 = 4.0F / Math.max(var118, var116);
               var101 = MathHelper.method37821(var120, var101, var108);
               var104 = MathHelper.method37821(var120, var104, var108);
               var48 = MathHelper.method37821(var120, var48, var108);
               var49 = MathHelper.method37821(var120, var49, var108);
               var90 = MathHelper.method37821(var120, var90, var115);
               var47 = MathHelper.method37821(var120, var47, var115);
               var94 = MathHelper.method37821(var120, var94, var115);
               var98 = MathHelper.method37821(var120, var98, var115);
               int var54 = this.method14928(var1, var2);
               float var55 = var25 * var20;
               float var56 = var25 * var21;
               float var57 = var25 * var22;
               this.method14927(var3, var32 + 0.0, var34 + (double)var28, var36 + 0.0, var55, var56, var57, var13, var101, var90, var54);
               this.method14927(var3, var32 + 0.0, var34 + (double)var29, var36 + 1.0, var55, var56, var57, var13, var104, var47, var54);
               this.method14927(var3, var32 + 1.0, var34 + (double)var30, var36 + 1.0, var55, var56, var57, var13, var48, var94, var54);
               this.method14927(var3, var32 + 1.0, var34 + (double)var31, var36 + 0.0, var55, var56, var57, var13, var49, var98, var54);
               if (var4.method23478(var1, var2.method8311())) {
                  this.method14927(var3, var32 + 0.0, var34 + (double)var28, var36 + 0.0, var55, var56, var57, var13, var101, var90, var54);
                  this.method14927(var3, var32 + 1.0, var34 + (double)var31, var36 + 0.0, var55, var56, var57, var13, var49, var98, var54);
                  this.method14927(var3, var32 + 1.0, var34 + (double)var30, var36 + 1.0, var55, var56, var57, var13, var48, var94, var54);
                  this.method14927(var3, var32 + 0.0, var34 + (double)var29, var36 + 1.0, var55, var56, var57, var13, var104, var47, var54);
               }
            }

            if (var15) {
               var3.method17043(var9[0]);
               float var87 = var9[0].method7459();
               float var92 = var9[0].method7460();
               float var96 = var9[0].method7462();
               float var100 = var9[0].method7463();
               int var103 = this.method14928(var1, var2.method8313());
               float var106 = var1.method6877(Direction.DOWN, true);
               float var112 = var106 * var20;
               float var114 = var106 * var21;
               float var110 = var106 * var22;
               this.method14927(var3, var32, var34 + (double)var85, var36 + 1.0, var112, var114, var110, var13, var87, var100, var103);
               this.method14927(var3, var32, var34 + (double)var85, var36, var112, var114, var110, var13, var87, var96, var103);
               this.method14927(var3, var32 + 1.0, var34 + (double)var85, var36, var112, var114, var110, var13, var92, var96, var103);
               this.method14927(var3, var32 + 1.0, var34 + (double)var85, var36 + 1.0, var112, var114, var110, var13, var92, var100, var103);
               var23 = true;
            }

            for (int var88 = 0; var88 < 4; var88++) {
               double var58;
               double var60;
               double var62;
               double var64;
               float var93;
               float var97;
               Direction var117;
               boolean var119;
               if (var88 == 0) {
                  var93 = var28;
                  var97 = var31;
                  var58 = var32;
                  var60 = var32 + 1.0;
                  var62 = var36 + 0.001F;
                  var64 = var36 + 0.001F;
                  var117 = Direction.NORTH;
                  var119 = var16;
               } else if (var88 == 1) {
                  var93 = var30;
                  var97 = var29;
                  var58 = var32 + 1.0;
                  var60 = var32;
                  var62 = var36 + 1.0 - 0.001F;
                  var64 = var36 + 1.0 - 0.001F;
                  var117 = Direction.SOUTH;
                  var119 = var17;
               } else if (var88 == 2) {
                  var93 = var29;
                  var97 = var28;
                  var58 = var32 + 0.001F;
                  var60 = var32 + 0.001F;
                  var62 = var36 + 1.0;
                  var64 = var36;
                  var117 = Direction.WEST;
                  var119 = var18;
               } else {
                  var93 = var31;
                  var97 = var30;
                  var58 = var32 + 1.0 - 0.001F;
                  var60 = var32 + 1.0 - 0.001F;
                  var62 = var36;
                  var64 = var36 + 1.0;
                  var117 = Direction.EAST;
                  var119 = var19;
               }

               if (var119 && !method14922(var1, var2, var117, Math.max(var93, var97))) {
                  var23 = true;
                  BlockPos var121 = var2.method8349(var117);
                  TextureAtlasSprite var122 = var9[1];
                  float var123 = 0.0F;
                  float var125 = 0.0F;
                  boolean var127 = !var8;
                  if (Class9299.field42831.method20214()) {
                     var127 = var9[2] != null;
                  }

                  if (var127) {
                     BlockState var66 = var1.getBlockState(var121);
                     Block var67 = var66.getBlock();
                     boolean var68 = false;
                     if (Class9299.field42831.method20214()) {
                        var68 = Class9299.method35064(var66, Class9299.field42831, var1, var121, var4);
                     }

                     if (var68 || var67 instanceof Class3231 || var67 instanceof Class3465 || var67 == Blocks.BEACON) {
                        var122 = this.field22604;
                     }

                     if (var67 == Blocks.FARMLAND || var67 == Blocks.field36885) {
                        var123 = 0.9375F;
                        var125 = 0.9375F;
                     }

                     if (var67 instanceof Class3208) {
                        Class3208 var69 = (Class3208)var67;
                        if (var66.<Class86>method23463(Class3208.field18605) == Class86.field219) {
                           var123 = 0.5F;
                           var125 = 0.5F;
                        }
                     }
                  }

                  var3.method17043(var122);
                  if (!(var93 <= var123) || !(var97 <= var125)) {
                     var123 = Math.min(var123, var93);
                     var125 = Math.min(var125, var97);
                     if (var123 > var84) {
                        var123 -= var84;
                     }

                     if (var125 > var84) {
                        var125 -= var84;
                     }

                     float var128 = var122.method7464((double)((1.0F - var123) * 16.0F * 0.5F));
                     float var129 = var122.method7464((double)((1.0F - var125) * 16.0F * 0.5F));
                     float var130 = var122.method7461(0.0);
                     float var131 = var122.method7461(8.0);
                     float var70 = var122.method7464((double)((1.0F - var93) * 16.0F * 0.5F));
                     float var71 = var122.method7464((double)((1.0F - var97) * 16.0F * 0.5F));
                     float var72 = var122.method7464(8.0);
                     int var73 = this.method14928(var1, var121);
                     float var74 = var88 < 2 ? var1.method6877(Direction.NORTH, true) : var1.method6877(Direction.WEST, true);
                     float var75 = 1.0F * var74 * var20;
                     float var76 = 1.0F * var74 * var21;
                     float var77 = 1.0F * var74 * var22;
                     this.method14927(var3, var58, var34 + (double)var93, var62, var75, var76, var77, var13, var130, var70, var73);
                     this.method14927(var3, var60, var34 + (double)var97, var64, var75, var76, var77, var13, var131, var71, var73);
                     this.method14927(var3, var60, var34 + (double)var85, var64, var75, var76, var77, var13, var131, var129, var73);
                     this.method14927(var3, var58, var34 + (double)var85, var62, var75, var76, var77, var13, var130, var128, var73);
                     if (var122 != this.field22604) {
                        this.method14927(var3, var58, var34 + (double)var85, var62, var75, var76, var77, var13, var130, var128, var73);
                        this.method14927(var3, var60, var34 + (double)var85, var64, var75, var76, var77, var13, var131, var129, var73);
                        this.method14927(var3, var60, var34 + (double)var97, var64, var75, var76, var77, var13, var131, var71, var73);
                        this.method14927(var3, var58, var34 + (double)var93, var62, var75, var76, var77, var13, var130, var70, var73);
                     }
                  }
               }
            }

            var3.method17043((TextureAtlasSprite)null);
            return var23;
         }

         var23 = false;
      } finally {
         if (Class7944.method26921()) {
            Class7698.method25377(var3);
         }
      }

      return var23;
   }

   private void method14926(Class5422 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, int var13) {
      var1.pos(var2, var4, var6)
         .method17033(var8, var9, var10, 1.0F)
         .method17027(var11, var12)
         .method17034(var13)
         .method17030(0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   private void method14927(
      Class5422 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, float var13, int var14
   ) {
      var1.pos(var2, var4, var6)
         .method17033(var8, var9, var10, var11)
         .method17027(var12, var13)
         .method17034(var14)
         .method17030(0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   private int method14928(Class1663 var1, BlockPos var2) {
      int var5 = WorldRenderer.method944(var1, var2);
      int var6 = WorldRenderer.method944(var1, var2.method8311());
      int var7 = var5 & 0xFF;
      int var8 = var6 & 0xFF;
      int var9 = var5 >> 16 & 0xFF;
      int var10 = var6 >> 16 & 0xFF;
      return (var7 <= var8 ? var8 : var7) | (var9 <= var10 ? var10 : var9) << 16;
   }

   private float method14929(Class1665 var1, BlockPos var2, Class7631 var3) {
      int var6 = 0;
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 4; var8++) {
         BlockPos var9 = var2.method8336(-(var8 & 1), 0, -(var8 >> 1 & 1));
         if (var1.method6739(var9.method8311()).method23472().method25066(var3)) {
            return 1.0F;
         }

         Class7379 var10 = var1.method6739(var9);
         if (!var10.method23472().method25066(var3)) {
            if (!var1.getBlockState(var9).method23384().method31086()) {
               var6++;
            }
         } else {
            float var11 = var10.method23475(var1, var9);
            if (!(var11 >= 0.8F)) {
               var7 += var11;
               var6++;
            } else {
               var7 += var11 * 10.0F;
               var6 += 10;
            }
         }
      }

      return var7 / (float)var6;
   }
}
