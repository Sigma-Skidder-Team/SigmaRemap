package mapped;

public class Class9110 {
   private static String[] field41864;
   private double field41865;
   private double field41866;
   private double field41867;
   public static Minecraft field41868 = Minecraft.getInstance();
   public Class9510 field41869;
   private static Class9485[] field41870 = new Class9485[]{
      new Class9485(1.0, 0.0, 0.0),
      new Class9485(-1.0, 0.0, 0.0),
      new Class9485(0.0, 0.0, 1.0),
      new Class9485(0.0, 0.0, -1.0),
      new Class9485(0.0, -1.0, 0.0),
      new Class9485(0.0, 1.0, 0.0)
   };

   public Class9110(double var1, double var3, double var5, Class9510 var7) {
      this.method33964(var1, var3, var5);
      this.field41869 = var7;
   }

   public Class9110(double var1, double var3, double var5) {
      this.method33964(var1, var3, var5);
   }

   public Class9110(BlockPos var1) {
      this.method33964((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   public void method33964(double var1, double var3, double var5) {
      this.field41865 = var1;
      this.field41866 = var3;
      this.field41867 = var5;
   }

   public Class9110 method33965(double var1, double var3, double var5) {
      return new Class9110(this.field41865 + var1, this.field41866 + var3, this.field41867 + var5);
   }

   public void method33966(float var1) {
      this.field41865 = (double)var1;
   }

   public void method33967(float var1) {
      this.field41866 = (double)var1;
   }

   public void method33968(float var1) {
      this.field41867 = (double)var1;
   }

   public double method33969() {
      return this.field41865;
   }

   public double method33970() {
      return this.field41866;
   }

   public double method33971() {
      return this.field41867;
   }

   public Vector3d method33972() {
      return new Vector3d(this.method33969(), this.method33970(), this.method33971()).method11339(0.5, 0.0, 0.5);
   }

   public double method33973(Vector3d var1) {
      double var4 = var1.field18048 - this.method33969() - 0.5;
      double var6 = var1.field18050 - this.method33971() - 0.5;
      return (double) MathHelper.method37766(var4 * var4 + var6 * var6);
   }

   public float method33974(Entity var1) {
      double var4 = var1.getPosX() - this.method33969();
      double var6 = var1.getPosY() - this.method33970();
      double var8 = var1.getPosZ() - this.method33971();
      return MathHelper.method37766(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public float method33975(Class9110 var1) {
      double var4 = var1.method33969() - this.method33969();
      double var6 = var1.method33970() - this.method33970();
      double var8 = var1.method33971() - this.method33971();
      return MathHelper.method37766(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public double method33976(Class9110 var1) {
      double var4 = var1.method33969() - this.method33969();
      double var6 = var1.method33970() - this.method33970();
      double var8 = var1.method33971() - this.method33971();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public Class9110 method33977(float var1, float var2, float var3) {
      return new Class9110(this.method33969() + (double)var1, this.method33970() + (double)var2, this.method33971() + (double)var3, this.field41869);
   }

   public double method33978(Class9110 var1) {
      double var4 = var1.method33969() - this.method33969();
      double var6 = var1.method33970() - this.method33970();
      double var8 = var1.method33971() - this.method33971();
      return Math.abs(var4) + Math.abs(var8) + Math.abs(var6);
   }

   public BlockPos method33979() {
      return new BlockPos(this.method33969(), this.method33970(), this.method33971());
   }

   public boolean method33980() {
      if (field41868.world.getBlockState(this.method33979()).getBlock() == Blocks.LAVA) {
         return false;
      } else if (field41868.world.getBlockState(this.method33979()).method23449().method23474()) {
         return field41868.world.getBlockState(this.method33979().down()).getBlock() instanceof Class3239
            ? false
            : this.method33988(this.method33979()) && this.method33988(this.method33979().up());
      } else {
         return false;
      }
   }

   public boolean method33981() {
      return this.method33980() && this.method33988(this.method33979().method8339(2));
   }

   public boolean method33982() {
      return this.method33981() && this.method33988(this.method33979().method8339(3));
   }

   public boolean method33983() {
      return this.method33980() && this.method33990(this.method33979().down());
   }

   public static boolean method33984(BlockPos var0) {
      for (Class9485 var6 : field41870) {
         BlockState var7 = field41868.world.getBlockState(var0.method8335(var6.field44096, var6.field44097, var6.field44098));
         if (var7.getBlock() == Blocks.WATER || var7.getBlock() == Blocks.LAVA) {
            return true;
         }
      }

      return false;
   }

   public static boolean method33985(BlockPos var0) {
      for (Class9485 var6 : field41870) {
         BlockState var7 = field41868.world.getBlockState(var0.method8335(var6.field44096, var6.field44097, var6.field44098));
         if (var7.isAir()) {
            return false;
         }
      }

      return true;
   }

   public boolean method33986() {
      for (Class9485 var6 : field41870) {
         BlockState var7 = field41868.world.getBlockState(this.method33979().method8335(var6.field44096, var6.field44097, var6.field44098));
         if (var7.getBlock() == Blocks.WATER || var7.getBlock() == Blocks.LAVA) {
            return true;
         }
      }

      for (Class9485 var11 : field41870) {
         BlockState var12 = field41868.world.getBlockState(this.method33979().method8335(var11.field44096, var11.field44097 + 1.0, var11.field44098));
         if (var12.getBlock() == Blocks.WATER || var12.getBlock() == Blocks.LAVA) {
            return true;
         }
      }

      return field41868.world.getBlockState(this.method33979().method8339(2)).getBlock() instanceof Class3213
         && !this.field41869.field44283.contains(this.method33979().method8339(2).method8332());
   }

   public boolean method33987() {
      return this.method33986()
         || field41868.world.getBlockState(this.method33979()).getBlock() == Blocks.BEDROCK
         || field41868.world.getBlockState(this.method33979().up()).getBlock() == Blocks.BEDROCK;
   }

   public boolean method33988(BlockPos var1) {
      return !this.field41869.field44283.contains(var1.method8332())
         ? Minecraft.getInstance().world.getBlockState(var1).method23414(field41868.world, var1).method19516()
         : true;
   }

   public boolean method33989() {
      return this.method33990(this.method33979());
   }

   public boolean method33990(BlockPos var1) {
      if (!this.field41869.field44283.contains(this.method33979().method8332())) {
         VoxelShape var4 = Minecraft.getInstance().world.getBlockState(var1).method23414(field41868.world, var1);
         if (var4.method19516()) {
            return false;
         } else {
            AxisAlignedBB var5 = var4.method19514();
            return var5.method19677() >= 0.9 && var5.method19677() <= 1.0;
         }
      } else {
         return false;
      }
   }
}
