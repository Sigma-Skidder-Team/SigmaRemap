package mapped;

import com.mentalfrostbyte.jello.module.impl.render.Projectiles;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;

public enum Class2309 {
   addItem(Items.BOW, 0.0F, 3.0F, 0.0F),
   field15815(Items.SNOWBALL, 0.0F, 1.875F, 0.0F),
   field15816(Items.ENDER_PEARL, 0.0F, 1.875F, 0.0F),
   field15817(Items.EGG, 0.0F, 1.875F, 0.0F),
   field15818(Items.SPLASH_POTION, 0.0F, 0.5F, 0.0F),
   field15819(Items.EXPERIENCE_BOTTLE, 0.0F, 0.6F, 0.0F),
   field15820(Items.TRIDENT, 0.0F, 2.5F, 0.0F);

   private Item item;
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
   private static final Class2309[] field15833 = new Class2309[]{addItem, field15815, field15816, field15817, field15818, field15819, field15820};

   private Class2309(Item var3, float var4, float var5, float var6) {
      this.item = var3;
      this.field15822 = var4;
      this.field15823 = var5;
      this.field15824 = var6;
   }

   public float method9081() {
      if (!this.item.equals(Items.BOW)) {
         return this.field15823;
      } else {
         return !(this.field15823 * BowItem.method11777(Projectiles.getMinecraft().player.getItemInUseCount()) > 0.0F)
            ? BowItem.method11777(20)
            : BowItem.method11777(Projectiles.getMinecraft().player.getItemInUseCount());
      }
   }

   public float method9082() {
      return this.field15822;
   }

   public float method9083() {
      return this.field15824;
   }

   public Item method9084() {
      return this.item;
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
      float var4 = (float)Math.toRadians((double) Projectiles.getMinecraft().player.rotationYaw);
      float var5 = (float)Math.toRadians((double) Projectiles.getMinecraft().player.rotationPitch);
      double var6 = Projectiles.getMinecraft().player.lastTickPosX
         + (Projectiles.getMinecraft().player.getPosX() - Projectiles.getMinecraft().player.lastTickPosX)
            * (double) Projectiles.getMinecraft().timer.renderPartialTicks;
      double var8 = Projectiles.getMinecraft().player.lastTickPosY
         + (Projectiles.getMinecraft().player.getPosY() - Projectiles.getMinecraft().player.lastTickPosY)
            * (double) Projectiles.getMinecraft().timer.renderPartialTicks;
      double var10 = Projectiles.getMinecraft().player.lastTickPosZ
         + (Projectiles.getMinecraft().player.getPosZ() - Projectiles.getMinecraft().player.lastTickPosZ)
            * (double) Projectiles.getMinecraft().timer.renderPartialTicks;
      this.field15825 = var6;
      this.field15826 = var8 + (double) Projectiles.getMinecraft().player.getEyeHeight() - 0.1F;
      this.field15827 = var10;
      float var12 = Math.min(20.0F, (float)(72000 - Projectiles.getMinecraft().player.getItemInUseCount()) + Projectiles.getMinecraft().getRenderPartialTicks()) / 20.0F;
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
         float var15 = (float)(!(this.item instanceof BowItem) ? 0.25 : 0.3);
         AxisAlignedBB var16 = new AxisAlignedBB(
            this.field15825 - (double)var15,
            this.field15826 - (double)var15,
            this.field15827 - (double)var15,
            this.field15825 + (double)var15,
            this.field15826 + (double)var15,
            this.field15827 + (double)var15
         );
         List<Entity> var17 = Projectiles.getMinecraft()
            .world
            .getEntitiesInAABBexcluding(
               Projectiles.getMinecraft().player,
               var16.offset((double)this.field15828, (double)this.field15829, (double)this.field15830).grow(1.0, 1.0, 1.0),
               EntityPredicates.field34763.and(new Class167(this, var15, var13, var14))
            );
         if (var17.size() > 0) {
            for (Entity var22 : var17) {
               this.field15832 = var22;
            }
            break;
         }

         BlockRayTraceResult var18 = Projectiles.getMinecraft()
            .world
            .rayTraceBlocks(new RayTraceContext(var13, var14, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, Projectiles.getMinecraft().player));
         if (var18 != null && var18.getType() != RayTraceResult.Type.MISS) {
            this.field15831 = var18;
            this.field15825 = this.field15831.getHitVec().x;
            this.field15826 = this.field15831.getHitVec().y;
            this.field15827 = this.field15831.getHitVec().z;
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
