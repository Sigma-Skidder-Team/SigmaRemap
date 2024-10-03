package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.LightType;
import net.optifine.reflect.ReflectorForge;

public abstract class EntityRenderer<T extends Entity> {
   public final EntityRendererManager field25097;
   public float shadowSize;
   public float shadowOpaque = 1.0F;
   private EntityType field25100 = null;
   private ResourceLocation field25101 = null;

   public EntityRenderer(EntityRendererManager var1) {
      this.field25097 = var1;
   }

   public final int method17894(T var1, float var2) {
      BlockPos var5 = new BlockPos(var1.method3287(var2));
      return Class1699.method7321(this.method17858((T)var1, var5), this.method17895((T)var1, var5));
   }

   public int method17895(T var1, BlockPos var2) {
      return var1.world.getLightFor(LightType.SKY, var2);
   }

   public int method17858(T var1, BlockPos var2) {
      return !var1.isBurning() ? var1.world.getLightFor(LightType.BLOCK, var2) : 15;
   }

   public boolean method17854(T var1, Class7647 var2, double var3, double var5, double var7) {
      if (var1.isInRangeToRender3d(var3, var5, var7)) {
         if (var1.ignoreFrustumCheck) {
            return true;
         } else {
            AxisAlignedBB var11 = var1.getRenderBoundingBox().grow(0.5);
            if (var11.method19684() || var11.getAverageEdgeLength() == 0.0) {
               var11 = new AxisAlignedBB(
                  var1.getPosX() - 2.0,
                  var1.getPosY() - 2.0,
                  var1.getPosZ() - 2.0,
                  var1.getPosX() + 2.0,
                  var1.getPosY() + 2.0,
                  var1.getPosZ() + 2.0
               );
            }

            return var2.method25122(var11);
         }
      } else {
         return false;
      }
   }

   public Vector3d getRenderOffset(T var1, float var2) {
      return Vector3d.ZERO;
   }

   public void render(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (Reflector.field42994.exists()) {
         Object var9 = Reflector.method35087(Reflector.field42994, var1, var1.getDisplayName(), this, var4, var5, var6, var3);
         Reflector.method35086(var9);
         Object var10 = Reflector.call(var9, Reflector.field42810);
         if (var10 != ReflectorForge.field44533 && (var10 == ReflectorForge.field44532 || this.method17852((T)var1))) {
            ITextComponent var11 = (ITextComponent) Reflector.call(var9, Reflector.field42995);
            this.method17893((T)var1, var11, var4, var5, var6);
         }
      } else if (this.method17852((T)var1)) {
         this.method17893((T)var1, var1.getDisplayName(), var4, var5, var6);
      }
   }

   public boolean method17852(T var1) {
      return var1.getAlwaysRenderNameTagForRender() && var1.method3381();
   }

   public abstract ResourceLocation method17843(T var1);

   public FontRenderer method17896() {
      return this.field25097.method32231();
   }

   public void method17893(T var1, ITextComponent var2, MatrixStack var3, Class7733 var4, int var5) {
      double var8 = this.field25097.method32228(var1);
      boolean var10 = !(var8 > 4096.0);
      if (Reflector.field42879.exists()) {
         var10 = Reflector.field42879.method20218(var1, var8);
      }

      if (var10) {
         boolean var11 = !var1.isDiscrete();
         float var12 = var1.getHeight() + 0.5F;
         int var13 = !"deadmau5".equals(var2.getString()) ? 0 : -10;
         var3.push();
         var3.translate(0.0, (double)var12, 0.0);
         var3.rotate(this.field25097.method32230());
         var3.scale(-0.025F, -0.025F, 0.025F);
         Matrix4f var14 = var3.getLast().getMatrix();
         float var15 = Minecraft.getInstance().gameSettings.method37139(0.25F);
         int var16 = (int)(var15 * 255.0F) << 24;
         FontRenderer var17 = this.method17896();
         float var18 = (float)(-var17.method38821(var2) / 2);
         var17.method38812(var2, var18, (float)var13, 553648127, false, var14, var4, var11, var16, var5);
         if (var11) {
            var17.method38812(var2, var18, (float)var13, -1, false, var14, var4, false, 0, var5);
         }

         var3.pop();
      }
   }

   public EntityRendererManager method17897() {
      return this.field25097;
   }

   public Class4862<EntityType, TileEntityType> method17898() {
      return this.field25100 != null ? Class4862.<EntityType, TileEntityType>method15005(this.field25100) : null;
   }

   public void method17899(Class4862<EntityType, TileEntityType> var1) {
      this.field25100 = (EntityType)var1.method15003().get();
   }

   public ResourceLocation method17900() {
      return this.field25101;
   }

   public void method17901(ResourceLocation var1) {
      this.field25101 = var1;
   }
}
