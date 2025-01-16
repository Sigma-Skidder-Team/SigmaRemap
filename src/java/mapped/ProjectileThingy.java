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

public enum ProjectileThingy {
   BOW(Items.BOW, 0.0F, 3.0F, 0.0F),
   SNOWBALL(Items.SNOWBALL, 0.0F, 1.875F, 0.0F),
   ENDER_PEARL(Items.ENDER_PEARL, 0.0F, 1.875F, 0.0F),
   EGG(Items.EGG, 0.0F, 1.875F, 0.0F),
   SPLASH_POTION(Items.SPLASH_POTION, 0.0F, 0.5F, 0.0F),
   EXPERIENCE_BOTTLE(Items.EXPERIENCE_BOTTLE, 0.0F, 0.6F, 0.0F),
   TRIDENT(Items.TRIDENT, 0.0F, 2.5F, 0.0F);

   private final Item item;
   private final float posX;
   private final float posY;
   private final float posZ;
   public double traceX;
   public double traceY;
   public double traceZ;
   public float traceXOffset;
   public float traceYOffset;
   public float traceZOffset;
   public RayTraceResult rayTraceResult;
   public Entity field15832;

   private ProjectileThingy(Item var3, float var4, float var5, float var6) {
      this.item = var3;
      this.posX = var4;
      this.posY = var5;
      this.posZ = var6;
   }

   public float method9081() {
      if (!this.item.equals(Items.BOW)) {
         return this.posY;
      } else {
         return !(this.posY * BowItem.calculateBowPower(Projectiles.getMinecraft().player.getItemInUseCount()) > 0.0F)
            ? BowItem.calculateBowPower(20)
            : BowItem.calculateBowPower(Projectiles.getMinecraft().player.getItemInUseCount());
      }
   }

   public float getPosX() {
      return this.posX;
   }

   public float getPosZ() {
      return this.posZ;
   }

   public Item getItem() {
      return this.item;
   }

   public static ProjectileThingy getProjectileThingyForItem(Item item) {
      for (ProjectileThingy var6 : values()) {
         if (var6.getItem().equals(item)) {
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
      this.traceX = var6;
      this.traceY = var8 + (double) Projectiles.getMinecraft().player.getEyeHeight() - 0.1F;
      this.traceZ = var10;
      float var12 = Math.min(20.0F, (float)(72000 - Projectiles.getMinecraft().player.getItemInUseCount()) + Projectiles.getMinecraft().getRenderPartialTicks()) / 20.0F;
      this.traceXOffset = -MathHelper.sin(var4) * MathHelper.cos(var5) * this.posY * var12;
      this.traceYOffset = -MathHelper.sin(var5) * this.posY * var12;
      this.traceZOffset = MathHelper.cos(var4) * MathHelper.cos(var5) * this.posY * var12;
      this.rayTraceResult = null;
      this.field15832 = null;
      var3.add(new Class9110(this.traceX, this.traceY, this.traceZ));

      while (this.rayTraceResult == null && this.field15832 == null && this.traceY > 0.0) {
         Vector3d var13 = new Vector3d(this.traceX, this.traceY, this.traceZ);
         Vector3d var14 = new Vector3d(
            this.traceX + (double)this.traceXOffset, this.traceY + (double)this.traceYOffset, this.traceZ + (double)this.traceZOffset
         );
         float var15 = (float)(!(this.item instanceof BowItem) ? 0.25 : 0.3);
         AxisAlignedBB var16 = new AxisAlignedBB(
            this.traceX - (double)var15,
            this.traceY - (double)var15,
            this.traceZ - (double)var15,
            this.traceX + (double)var15,
            this.traceY + (double)var15,
            this.traceZ + (double)var15
         );
         List<Entity> entities = Projectiles.getMinecraft()
            .world
            .getEntitiesInAABBexcluding(
               Projectiles.getMinecraft().player,
               var16.offset((double)this.traceXOffset, (double)this.traceYOffset, (double)this.traceZOffset).grow(1.0, 1.0, 1.0),
               EntityPredicates.field34763.and(new Class167(this, var15, var13, var14))
            );
         if (entities.size() > 0) {
            for (Entity entity : entities) {
               this.field15832 = entity;
            }
            break;
         }

         BlockRayTraceResult var18 = Projectiles.getMinecraft()
            .world
            .rayTraceBlocks(new RayTraceContext(var13, var14, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, Projectiles.getMinecraft().player));
         if (var18 != null && var18.getType() != RayTraceResult.Type.MISS) {
            this.rayTraceResult = var18;
            this.traceX = this.rayTraceResult.getHitVec().x;
            this.traceY = this.rayTraceResult.getHitVec().y;
            this.traceZ = this.rayTraceResult.getHitVec().z;
            var3.add(new Class9110(this.traceX, this.traceY, this.traceZ));
            break;
         }

         float var19 = 0.99F;
         float var20 = 0.05F;
         this.traceX = this.traceX + (double)this.traceXOffset;
         this.traceY = this.traceY + (double)this.traceYOffset;
         this.traceZ = this.traceZ + (double)this.traceZOffset;
         var3.add(new Class9110(this.traceX, this.traceY, this.traceZ));
         this.traceXOffset *= var19;
         this.traceYOffset *= var19;
         this.traceZOffset *= var19;
         this.traceYOffset -= var20;
      }

      return var3;
   }
}
