package mapped;

import net.minecraft.util.Util;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.World;

public class Class6997 extends Class6990 {
   private static String[] field30271;
   private boolean field30272;

   public Class6997(MobEntity var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9597 method21644(int var1) {
      this.field30272 = this.field30243 instanceof DolphinEntity;
      this.field30257 = new Class6765(this.field30272);
      return new Class9597(this.field30257, var1);
   }

   @Override
   public boolean method21668() {
      return this.field30272 || this.method21669();
   }

   @Override
   public Vector3d method21667() {
      return new Vector3d(this.field30243.getPosX(), this.field30243.getPosYHeight(0.5), this.field30243.getPosZ());
   }

   @Override
   public void method21658() {
      this.field30247++;
      if (this.field30255) {
         this.method21647();
      }

      if (!this.method21664()) {
         if (!this.method21668()) {
            if (this.field30245 != null && !this.field30245.method28693()) {
               Vector3d var3 = this.field30245.method28703(this.field30243);
               if (MathHelper.floor(this.field30243.getPosX()) == MathHelper.floor(var3.x)
                  && MathHelper.floor(this.field30243.getPosY()) == MathHelper.floor(var3.y)
                  && MathHelper.floor(this.field30243.getPosZ()) == MathHelper.floor(var3.z)) {
                  this.field30245.method28691();
               }
            }
         } else {
            this.method21659();
         }

         DebugPacketSender.method23617(this.field30244, this.field30243, this.field30245, this.field30254);
         if (!this.method21664()) {
            Vector3d var4 = this.field30245.method28703(this.field30243);
            this.field30243.method4228().method20813(var4.x, var4.y, var4.z, this.field30246);
         }
      }
   }

   @Override
   public void method21659() {
      if (this.field30245 != null) {
         Vector3d var3 = this.method21667();
         float var4 = this.field30243.getWidth();
         float var5 = !(var4 > 0.75F) ? 0.75F - var4 / 2.0F : var4 / 2.0F;
         Vector3d var6 = this.field30243.getMotion();
         if (Math.abs(var6.x) > 0.2 || Math.abs(var6.z) > 0.2) {
            var5 = (float)((double)var5 * var6.length() * 6.0);
         }

         byte var7 = 6;
         Vector3d var8 = Vector3d.method11330(this.field30245.method28704());
         if (Math.abs(this.field30243.getPosX() - var8.x) < (double)var5
            && Math.abs(this.field30243.getPosZ() - var8.z) < (double)var5
            && Math.abs(this.field30243.getPosY() - var8.y) < (double)(var5 * 2.0F)) {
            this.field30245.method28691();
         }

         for (int var9 = Math.min(this.field30245.method28699() + 6, this.field30245.method28698() - 1); var9 > this.field30245.method28699(); var9--) {
            var8 = this.field30245.method28701(this.field30243, var9);
            if (!(var8.squareDistanceTo(var3) > 36.0) && this.method21671(var3, var8, 0, 0, 0)) {
               this.field30245.method28700(var9);
               break;
            }
         }

         this.method21661(var3);
      }
   }

   @Override
   public void method21661(Vector3d var1) {
      if (this.field30247 - this.field30248 > 100) {
         if (var1.squareDistanceTo(this.field30249) < 2.25) {
            this.method21666();
         }

         this.field30248 = this.field30247;
         this.field30249 = var1;
      }

      if (this.field30245 != null && !this.field30245.method28693()) {
         BlockPos var4 = this.field30245.method28704();
         if (!var4.equals(this.field30250)) {
            this.field30250 = var4;
            double var5 = var1.method11341(Vector3d.method11328(this.field30250));
            this.field30253 = !(this.field30243.getAIMoveSpeed() > 0.0F) ? 0.0 : var5 / (double)this.field30243.getAIMoveSpeed() * 100.0;
         } else {
            this.field30251 = this.field30251 + (Util.milliTime() - this.field30252);
         }

         if (this.field30253 > 0.0 && (double)this.field30251 > this.field30253 * 2.0) {
            this.field30250 = Vector3i.field13026;
            this.field30251 = 0L;
            this.field30253 = 0.0;
            this.method21666();
         }

         this.field30252 = Util.milliTime();
      }
   }

   @Override
   public boolean method21671(Vector3d var1, Vector3d var2, int var3, int var4, int var5) {
      Vector3d var8 = new Vector3d(var2.x, var2.y + (double)this.field30243.getHeight() * 0.5, var2.z);
      return this.field30244.rayTraceBlocks(new RayTraceContext(var1, var8, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this.field30243)).getType()
         == RayTraceResult.Type.MISS;
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return !this.field30244.getBlockState(var1).method23409(this.field30244, var1);
   }

   @Override
   public void method21674(boolean var1) {
   }
}
