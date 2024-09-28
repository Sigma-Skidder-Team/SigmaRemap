package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Random;
import java.util.stream.Stream;

public abstract class Class4587 {
   private static final AxisAlignedBB field22036 = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   public final ClientWorld field22037;
   public double field22038;
   public double field22039;
   public double field22040;
   public double field22041;
   public double field22042;
   public double field22043;
   public double field22044;
   public double field22045;
   public double field22046;
   private AxisAlignedBB field22047 = field22036;
   public boolean field22048;
   public boolean field22049 = true;
   private boolean field22050;
   public boolean field22051;
   public float field22052 = 0.6F;
   public float field22053 = 1.8F;
   public final Random field22054 = new Random();
   public int field22055;
   public int field22056;
   public float field22057;
   public float field22058 = 1.0F;
   public float field22059 = 1.0F;
   public float field22060 = 1.0F;
   public float field22061 = 1.0F;
   public float field22062;
   public float field22063;
   private Class2001 field22064 = new Class2001();

   public Class4587(ClientWorld var1, double var2, double var4, double var6) {
      this.field22037 = var1;
      this.method14519(0.2F, 0.2F);
      this.method14520(var2, var4, var6);
      this.field22038 = var2;
      this.field22039 = var4;
      this.field22040 = var6;
      this.field22056 = (int)(4.0F / (this.field22054.nextFloat() * 0.9F + 0.1F));
   }

   public Class4587(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.field22044 = var8 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.field22045 = var10 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.field22046 = var12 + (Math.random() * 2.0 - 1.0) * 0.4F;
      float var16 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var17 = MathHelper.sqrt(this.field22044 * this.field22044 + this.field22045 * this.field22045 + this.field22046 * this.field22046);
      this.field22044 = this.field22044 / (double)var17 * (double)var16 * 0.4F;
      this.field22045 = this.field22045 / (double)var17 * (double)var16 * 0.4F + 0.1F;
      this.field22046 = this.field22046 / (double)var17 * (double)var16 * 0.4F;
   }

   public Class4587 method14513(float var1) {
      this.field22044 *= (double)var1;
      this.field22045 = (this.field22045 - 0.1F) * (double)var1 + 0.1F;
      this.field22046 *= (double)var1;
      return this;
   }

   public Class4587 method14512(float var1) {
      this.method14519(0.2F * var1, 0.2F * var1);
      return this;
   }

   public void method14514(float var1, float var2, float var3) {
      this.field22058 = var1;
      this.field22059 = var2;
      this.field22060 = var3;
   }

   public void method14515(float var1) {
      this.field22061 = var1;
   }

   public void method14516(int var1) {
      this.field22056 = var1;
   }

   public int method14517() {
      return this.field22056;
   }

   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.field22045 = this.field22045 - 0.04 * (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.98F;
         this.field22045 *= 0.98F;
         this.field22046 *= 0.98F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }

   public abstract void method14510(IVertexBuilder var1, ActiveRenderInfo var2, float var3);

   public abstract Class6843 method14501();

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.field22041
         + ","
         + this.field22042
         + ","
         + this.field22043
         + "), RGBA ("
         + this.field22058
         + ","
         + this.field22059
         + ","
         + this.field22060
         + ","
         + this.field22061
         + "), Age "
         + this.field22055;
   }

   public void method14518() {
      this.field22051 = true;
   }

   public void method14519(float var1, float var2) {
      if (var1 != this.field22052 || var2 != this.field22053) {
         this.field22052 = var1;
         this.field22053 = var2;
         AxisAlignedBB var5 = this.method14523();
         double var6 = (var5.minX + var5.maxX - (double)var1) / 2.0;
         double var8 = (var5.minZ + var5.maxZ - (double)var1) / 2.0;
         this.method14524(
            new AxisAlignedBB(
               var6, var5.minY, var8, var6 + (double)this.field22052, var5.minY + (double)this.field22053, var8 + (double)this.field22052
            )
         );
      }
   }

   public void method14520(double var1, double var3, double var5) {
      this.field22041 = var1;
      this.field22042 = var3;
      this.field22043 = var5;
      float var9 = this.field22052 / 2.0F;
      float var10 = this.field22053;
      this.method14524(new AxisAlignedBB(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)var10, var5 + (double)var9));
   }

   public void method14511(double var1, double var3, double var5) {
      if (!this.field22050) {
         double var9 = var1;
         double var11 = var3;
         double var13 = var5;
         if (this.field22049 && (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) && this.method14525(var1, var3, var5)) {
            Vector3d var15 = Entity.collideBoundingBoxHeuristically(
               (Entity)null,
               new Vector3d(var1, var3, var5),
               this.method14523(),
               this.field22037,
               ISelectionContext.method14947(),
               new Class8544<VoxelShape>(Stream.<VoxelShape>empty())
            );
            var1 = var15.x;
            var3 = var15.y;
            var5 = var15.z;
         }

         if (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) {
            this.method14524(this.method14523().offset(var1, var3, var5));
            this.method14521();
         }

         if (Math.abs(var11) >= 1.0E-5F && Math.abs(var3) < 1.0E-5F) {
            this.field22050 = true;
         }

         this.field22048 = var11 != var3 && var11 < 0.0;
         if (var9 != var1) {
            this.field22044 = 0.0;
         }

         if (var13 != var5) {
            this.field22046 = 0.0;
         }
      }
   }

   public void method14521() {
      AxisAlignedBB var3 = this.method14523();
      this.field22041 = (var3.minX + var3.maxX) / 2.0;
      this.field22042 = var3.minY;
      this.field22043 = (var3.minZ + var3.maxZ) / 2.0;
   }

   public int method14499(float var1) {
      BlockPos var4 = new BlockPos(this.field22041, this.field22042, this.field22043);
      return !this.field22037.isBlockLoaded(var4) ? 0 : WorldRenderer.method944(this.field22037, var4);
   }

   public boolean method14522() {
      return !this.field22051;
   }

   public AxisAlignedBB method14523() {
      return this.field22047;
   }

   public void method14524(AxisAlignedBB var1) {
      this.field22047 = var1;
   }

   private boolean method14525(double var1, double var3, double var5) {
      if (!(this.field22052 > 1.0F) && !(this.field22053 > 1.0F)) {
         int var9 = MathHelper.floor(this.field22041);
         int var10 = MathHelper.floor(this.field22042);
         int var11 = MathHelper.floor(this.field22043);
         this.field22064.method8384(var9, var10, var11);
         BlockState var12 = this.field22037.getBlockState(this.field22064);
         if (var12.isAir()) {
            double var13 = !(var1 > 0.0) ? (!(var1 < 0.0) ? this.field22041 : this.field22047.minX) : this.field22047.maxX;
            double var15 = !(var3 > 0.0) ? (!(var3 < 0.0) ? this.field22042 : this.field22047.minY) : this.field22047.maxY;
            double var17 = !(var5 > 0.0) ? (!(var5 < 0.0) ? this.field22043 : this.field22047.minZ) : this.field22047.maxZ;
            int var19 = MathHelper.floor(var13 + var1);
            int var20 = MathHelper.floor(var15 + var3);
            int var21 = MathHelper.floor(var17 + var5);
            if (var19 != var9 || var20 != var10 || var21 != var11) {
               this.field22064.method8384(var19, var20, var21);
               BlockState var22 = this.field22037.getBlockState(this.field22064);
               if (!var22.isAir()) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method14526() {
      return true;
   }
}
