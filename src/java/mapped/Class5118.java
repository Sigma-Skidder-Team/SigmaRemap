package mapped;

public class Class5118 implements Class5119 {
   private static String[] field23288;
   private final Minecraft field23289;

   public Class5118(Minecraft var1) {
      this.field23289 = var1;
   }

   @Override
   public void method15813(Class9332 var1, Class7733 var2, double var3, double var5, double var7) {
      Class1655 var11 = this.field23289.field1339.field5024;
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.method27893(2.0F);
      RenderSystem.method27862();
      RenderSystem.depthMask(false);
      BlockPos var12 = new BlockPos(var3, var5, var7);

      for (BlockPos var14 : BlockPos.method8359(var12.method8336(-6, -6, -6), var12.method8336(6, 6, 6))) {
         Class7380 var15 = var11.method6738(var14);
         if (!var15.method23448(Class8487.field36387)) {
            Class6408 var16 = var15.method23412(var11, var14);

            for (Class6488 var18 : var16.method19521()) {
               Class6488 var19 = var18.method19668(var14).method19664(0.002).method19667(-var3, -var5, -var7);
               double var20 = var19.field28449;
               double var22 = var19.field28450;
               double var24 = var19.field28451;
               double var26 = var19.field28452;
               double var28 = var19.field28453;
               double var30 = var19.field28454;
               float var32 = 1.0F;
               float var33 = 0.0F;
               float var34 = 0.0F;
               float var35 = 0.5F;
               if (var15.method23454(var11, var14, Direction.WEST)) {
                  Class9352 var36 = Class9352.method35409();
                  Class5425 var37 = var36.method35411();
                  var37.method17063(5, Class9337.field43342);
                  var37.method17025(var20, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var37.method17025(var20, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var37.method17025(var20, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var37.method17025(var20, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var36.method35410();
               }

               if (var15.method23454(var11, var14, Direction.SOUTH)) {
                  Class9352 var38 = Class9352.method35409();
                  Class5425 var43 = var38.method35411();
                  var43.method17063(5, Class9337.field43342);
                  var43.method17025(var20, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var43.method17025(var20, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var43.method17025(var26, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var43.method17025(var26, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var38.method35410();
               }

               if (var15.method23454(var11, var14, Direction.EAST)) {
                  Class9352 var39 = Class9352.method35409();
                  Class5425 var44 = var39.method35411();
                  var44.method17063(5, Class9337.field43342);
                  var44.method17025(var26, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var44.method17025(var26, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var44.method17025(var26, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var44.method17025(var26, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var39.method35410();
               }

               if (var15.method23454(var11, var14, Direction.NORTH)) {
                  Class9352 var40 = Class9352.method35409();
                  Class5425 var45 = var40.method35411();
                  var45.method17063(5, Class9337.field43342);
                  var45.method17025(var26, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var45.method17025(var26, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var45.method17025(var20, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var45.method17025(var20, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var40.method35410();
               }

               if (var15.method23454(var11, var14, Direction.field672)) {
                  Class9352 var41 = Class9352.method35409();
                  Class5425 var46 = var41.method35411();
                  var46.method17063(5, Class9337.field43342);
                  var46.method17025(var20, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var46.method17025(var26, var22, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var46.method17025(var20, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var46.method17025(var26, var22, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var41.method35410();
               }

               if (var15.method23454(var11, var14, Direction.field673)) {
                  Class9352 var42 = Class9352.method35409();
                  Class5425 var47 = var42.method35411();
                  var47.method17063(5, Class9337.field43342);
                  var47.method17025(var20, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var47.method17025(var20, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var47.method17025(var26, var28, var24).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var47.method17025(var26, var28, var30).method17033(1.0F, 0.0F, 0.0F, 0.5F).method17031();
                  var42.method35410();
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.method27861();
      RenderSystem.disableBlend();
   }
}
