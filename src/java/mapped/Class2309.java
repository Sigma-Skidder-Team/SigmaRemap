package mapped;

import com.mentalfrostbyte.jello.module.impl.render.Projectiles;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.ArrayList;
import java.util.List;

public enum Class2309 {
   field15814(Items.BOW, 0.0F, 3.0F, 0.0F),
   field15815(Items.field37888, 0.0F, 1.875F, 0.0F),
   field15816(Items.field37966, 0.0F, 1.875F, 0.0F),
   field15817(Items.field37904, 0.0F, 1.875F, 0.0F),
   field15818(Items.field38115, 0.0F, 0.5F, 0.0F),
   field15819(Items.field38045, 0.0F, 0.6F, 0.0F),
   field15820(Items.field38144, 0.0F, 2.5F, 0.0F);

   private Item field15821;
   private float field15822;
   private float field15823;
   private float field15824;
   public double field15825;
   public double field15826;
   public double field15827;
   public float field15828;
   public float field15829;
   public float field15830;
   public RayTraceResult field15831;
   public Entity field15832;
   private static final Class2309[] field15833 = new Class2309[]{field15814, field15815, field15816, field15817, field15818, field15819, field15820};

   private Class2309(Item var3, float var4, float var5, float var6) {
      this.field15821 = var3;
      this.field15822 = var4;
      this.field15823 = var5;
      this.field15824 = var6;
   }

   public float method9081() {
      if (!this.field15821.equals(Items.BOW)) {
         return this.field15823;
      } else {
         return !(this.field15823 * Class3263.method11777(Projectiles.method16524().player.method3159()) > 0.0F)
            ? Class3263.method11777(20)
            : Class3263.method11777(Projectiles.method16525().player.method3159());
      }
   }

   public float method9082() {
      return this.field15822;
   }

   public float method9083() {
      return this.field15824;
   }

   public Item method9084() {
      return this.field15821;
   }

   public static Class2309 method9085(Item var0) {
      for (Class2309 var6 : values()) {
         if (var6.method9084().equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public List<Class9110> method9086() {
      ArrayList var3 = new ArrayList();
      float var4 = (float)Math.toRadians((double) Projectiles.method16526().player.rotationYaw);
      float var5 = (float)Math.toRadians((double) Projectiles.method16527().player.rotationPitch);
      double var6 = Projectiles.method16528().player.lastTickPosX
         + (Projectiles.method16529().player.getPosX() - Projectiles.method16530().player.lastTickPosX)
            * (double) Projectiles.method16531().timer.renderPartialTicks;
      double var8 = Projectiles.method16532().player.lastTickPosY
         + (Projectiles.method16533().player.getPosY() - Projectiles.method16534().player.lastTickPosY)
            * (double) Projectiles.method16535().timer.renderPartialTicks;
      double var10 = Projectiles.method16536().player.lastTickPosZ
         + (Projectiles.method16537().player.getPosZ() - Projectiles.method16538().player.lastTickPosZ)
            * (double) Projectiles.method16539().timer.renderPartialTicks;
      this.field15825 = var6;
      this.field15826 = var8 + (double) Projectiles.method16540().player.method3393() - 0.1F;
      this.field15827 = var10;
      float var12 = Math.min(20.0F, (float)(72000 - Projectiles.method16541().player.method3159()) + Projectiles.method16542().getRenderPartialTicks()) / 20.0F;
      this.field15828 = -MathHelper.sin(var4) * MathHelper.cos(var5) * this.field15823 * var12;
      this.field15829 = -MathHelper.sin(var5) * this.field15823 * var12;
      this.field15830 = MathHelper.cos(var4) * MathHelper.cos(var5) * this.field15823 * var12;
      this.field15831 = null;
      this.field15832 = null;
      var3.add(new Class9110(this.field15825, this.field15826, this.field15827));

      while (this.field15831 == null && this.field15832 == null && this.field15826 > 0.0) {
         Vector3d var13 = new Vector3d(this.field15825, this.field15826, this.field15827);
         Vector3d var14 = new Vector3d(
            this.field15825 + (double)this.field15828, this.field15826 + (double)this.field15829, this.field15827 + (double)this.field15830
         );
         float var15 = (float)(!(this.field15821 instanceof Class3263) ? 0.25 : 0.3);
         AxisAlignedBB var16 = new AxisAlignedBB(
            this.field15825 - (double)var15,
            this.field15826 - (double)var15,
            this.field15827 - (double)var15,
            this.field15825 + (double)var15,
            this.field15826 + (double)var15,
            this.field15827 + (double)var15
         );
         List<Entity> var17 = Projectiles.method16544()
            .world
            .method6770(
               Projectiles.method16543().player,
               var16.method19667((double)this.field15828, (double)this.field15829, (double)this.field15830).method19663(1.0, 1.0, 1.0),
               Class8088.field34763.and(new Class167(this, var15, var13, var14))
            );
         if (var17.size() > 0) {
            for (Entity var22 : var17) {
               this.field15832 = var22;
            }
            break;
         }

         BlockRayTraceResult var18 = Projectiles.method16546()
            .world
            .method7036(new Class6809(var13, var14, Class2271.field14774, Class1985.field12962, Projectiles.method16545().player));
         if (var18 != null && var18.getType() != RayTraceResult.Type.MISS) {
            this.field15831 = var18;
            this.field15825 = this.field15831.method31419().field18048;
            this.field15826 = this.field15831.method31419().field18049;
            this.field15827 = this.field15831.method31419().field18050;
            var3.add(new Class9110(this.field15825, this.field15826, this.field15827));
            break;
         }

         float var19 = 0.99F;
         float var20 = 0.05F;
         this.field15825 = this.field15825 + (double)this.field15828;
         this.field15826 = this.field15826 + (double)this.field15829;
         this.field15827 = this.field15827 + (double)this.field15830;
         var3.add(new Class9110(this.field15825, this.field15826, this.field15827));
         this.field15828 *= var19;
         this.field15829 *= var19;
         this.field15830 *= var19;
         this.field15829 -= var20;
      }

      return var3;
   }
}
