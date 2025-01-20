package mapped;

import java.util.ArrayList;
import java.util.List;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import com.mentalfrostbyte.jello.util.ClientColors;
import net.minecraft.block.StairsBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

public class Orientation {
   private Minecraft mc = Minecraft.getInstance();
   private List<Class9510> field39613 = new ArrayList<Class9510>();
   public float field39614 = -999.0F;
   public float field39615 = -999.0F;
   private BlockPos field39616;
   private boolean field39617 = true;
   public Class9510 field39618 = null;

   public void init() {
      Client.getInstance().eventManager.register(this);
   }

   public void method31738() {
      this.field39613.clear();
      this.field39614 = -999.0F;
      this.field39615 = -999.0F;
      Client.getInstance().moduleManager.getModuleByClass(BlockFly.class).setState(false);
      Client.getInstance().moduleManager.getModuleByClass(Fly.class).setState(false);
   }

   public void method31739(List<Class9510> var1) {
      this.method31738();
      this.method31740(false);
      if (var1 == null || this.field39613.isEmpty()) {
         this.field39618 = null;
      }

      this.field39613 = var1;
   }

   public void method31740(boolean var1) {
      this.field39617 = var1;
   }

   public boolean method31741() {
      return this.field39617;
   }

   public boolean method31742() {
      return this.field39613 != null && !this.field39613.isEmpty();
   }

   private boolean method31743() {
      return this.method31742() && !this.method31741();
   }

   public float getAdjustedYaw() {
      return this.method31743() ? this.field39614 : -999.0F;
   }

   @EventTarget
   private void method31745(EventEntityActionState var1) {
      if (this.method31743()) {
         if (this.field39616 == null) {
            double var4 = Math.sqrt(
                  this.mc.player.getMotion().x * this.mc.player.getMotion().x
                        + this.mc.player.getMotion().z * this.mc.player.getMotion().z);
            boolean var6 = MultiUtilities.isAboveBounds(this.mc.player, 0.02F);
            int var7 = this.field39613.size() - 1;
            Class9510 var8 = this.field39613.get(var7);
            Class2317 var9 = var8.field44279;
            double var10 = var8.field44271.method33973(this.mc.player.getPositionVec());
            double var12 = 0.25;
            boolean var14 = false;
            if (this.field39618 != null) {
               var14 = var8.field44271.method33970() - this.field39618.field44271.method33970() != 0.0;
               var14 |= var9 == Class2317.field15874 || var9 == Class2317.field15875;
            }

            BlockPos var15 = this.mc.player.getPosition();
            if (this.mc.player.positionVec.y % 1.0 >= 0.93) {
               var15 = var15.up();
            }

            boolean var16 = var8.field44271.method33979().equals(var15);
            if (var14 && this.mc.player.fallDistance < 2.0F) {
               var16 |= var8.field44271.method33979().up().equals(var15);
            }

            if (this.mc.player.onGround
                  || this.field39618 != null && this.field39618.field44279 == Class2317.field15874) {
               if (this.method31751() != null && this.method31751().field44282.size() > 0) {
                  var16 &= var10 < 0.1;
               }

               if (this.method31750() == Class2317.field15875
                     && this.method31751().field44271.method33976(var8.field44271) > 16.0) {
                  var16 &= var10 < 0.1;
               } else if (var9 == Class2317.field15874 && this.method31750() == Class2317.field15873) {
                  var16 &= var10 < 0.4;
               } else {
                  var16 &= var10 < var12;
               }
            }

            if (var9 == Class2317.field15876
                  && this.mc.world.getBlockState(var8.field44271.method33979().down()).isAir()) {
               var16 = false;
            }

            boolean var17 = (this.method31750() == Class2317.field15874 || this.method31750() == Class2317.field15875
                  || this.method31750() == Class2317.field15876)
                  && !var6;
            if (var16 && !var17) {
               this.field39618 = this.field39613.get(var7);
               this.field39613.remove(var7);
               if (this.field39613.size() == 0) {
                  MultiUtilities.setPlayerXMotion(this.mc.player.getMotion().x * 0.5);
                  MultiUtilities.setPlayerZMotion(this.mc.player.getMotion().z * 0.5);
                  this.method31738();
                  return;
               }

               var7 = this.field39613.size() - 1;
               var8 = this.field39613.get(var7);
               var9 = var8.field44279;
               float var18 = RotationHelper.method34145(this.mc.player.getPositionVec(),
                     var8.field44271.method33972())[0];
               float var19 = RotationHelper.method34145(new Vector3d(0.0, 0.0, 0.0),
                     this.mc.player.getMotion().method11333())[0];
               float var20 = Math.abs(MultiUtilities.method17756(var19, var18));
               if (!this.mc.player.onGround && var20 > 60.0F
                     || !this.mc.player.onGround && var20 > 45.0F && this.mc.player.getMotion().length() > 0.24
                     || var20 > 110.0F) {
                  MultiUtilities.setPlayerXMotion(this.mc.player.getMotion().x * 0.25);
                  MultiUtilities.setPlayerZMotion(this.mc.player.getMotion().z * 0.25);
               }
            }

            if (var10 < var12
                  && (var14 || var8.field44281.size() > 0
                        && (double) this.mc.player.position.field13028 > var8.field44271.method33970())) {
               MultiUtilities.setPlayerXMotion(this.mc.player.getMotion().x * 0.5);
               MultiUtilities.setPlayerZMotion(this.mc.player.getMotion().z * 0.5);
            }

            float var43 = RotationHelper.method34145(this.mc.player.getPositionVec(), var8.field44271.method33972())[0];
            this.field39614 = var43;
            double var21 = Math.cos(Math.toRadians((double) (this.mc.player.rotationYaw - var43)));
            double var23 = Math.sin(Math.toRadians((double) (this.mc.player.rotationYaw - var43)));
            boolean var25 = Class8627.method30924(var8);
            this.mc.player.setSprinting(var8.field44281.isEmpty());
            double var26 = Math.min(1.0 / Math.abs(var21), 1.0 / Math.abs(var23));
            boolean var28 = !this.mc.player.onGround && this.mc.player.collidedHorizontally
                  && var9 == Class2317.field15874;
            if (!var28) {
               this.mc.player.moveForward = (float) (var21 * var26);
               this.mc.player.moveStrafing = (float) (var23 * var26);
            } else {
               if (this.mc.player.isSprinting()) {
                  MultiUtilities.setPlayerXMotion(this.mc.player.getMotion().x * 0.9);
                  MultiUtilities.setPlayerZMotion(this.mc.player.getMotion().z * 0.9);
               }

               this.mc.player.moveForward = 0.0F;
               this.mc.player.moveStrafing = 0.0F;
            }

            double var29 = Math.cos(Math.toRadians((double) (var43 + 90.0F))) * var4;
            double var31 = Math.sin(Math.toRadians((double) (var43 + 90.0F))) * var4;
            boolean var33 = Class8627.method30925();
            boolean var34 = this.mc.world
                  .getCollisionShapes(this.mc.player, this.mc.player.getBoundingBox().offset(var29, -1.0, var31))
                  .count() == 0L;
            boolean var35 = false;
            boolean var36 = false;
            float var37 = this.mc.player.rotationYaw;
            this.mc.player.rotationYaw = var43;
            switch (Class8612.field38732[var9.ordinal()]) {
               case 1:
                  boolean var38 = true;
                  if (var8.field44280 == Class2285.field15126) {
                     var38 = var10 < 1.14;
                     if (this.field39618 != null) {
                        var38 &= (double) this.mc.player.position.field13028 - var8.field44271.method33970() != 0.0;
                     }
                  }

                  if (var25 && var33 && var10 > 0.75 && var38) {
                     if (this.mc.world.getBlockState(var8.field44271.method33979().down())
                           .getBlock() instanceof StairsBlock && var10 < 1.1) {
                        MultiUtilities.addChatMessage("YA" + var10);
                     } else {
                        this.mc.player.jump();
                     }

                     var9 = Class2317.field15873;
                  }
                  break;
               case 2:
                  this.mc.player.setSprinting(true);
                  if (var25 && var33 && var34) {
                     this.mc.player.jump();
                     var9 = Class2317.field15873;
                  }
                  break;
               case 3:
                  var36 = true;
                  break;
               case 4:
                  var35 = true;
               case 5:
            }

            this.mc.player.rotationYaw = var37;
            if (var36 && !this.mc.player.onGround
                  && !Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()) {
               MultiUtilities.setPlayerXMotion(0.0);
               MultiUtilities.setPlayerZMotion(0.0);
            } else {
               if (Client.getInstance().moduleManager.getModuleByClass(Fly.class).isEnabled()
                     && !MultiUtilities.isAboveBounds(this.mc.player, 5.0F)) {
                  var36 = true;
               }

               Client.getInstance().moduleManager.getModuleByClass(BlockFly.class).setState(var35);
               Client.getInstance().moduleManager.getModuleByClass(Fly.class).setState(var36);
               if (!var17 || !var16) {
                  if (var8.field44271.method33972().method11341(this.mc.player.getPositionVec()) > 10.0) {
                     this.method31738();
                  }
               }
            }
         }
      }
   }

   @EventTarget
   private void method31747(EventUpdate var1) {
      if (var1.isPre()) {
         if (this.method31743()) {
            ArrayList var4 = new ArrayList();
            int var5 = this.field39613.size() - 1;
            Class9510 var6 = this.field39613.get(var5);
            if (this.field39615 != -999.0F && var6.field44279 == Class2317.field15876) {
            }

            for (long var8 : var6.field44281) {
               BlockPos var10 = BlockPos.fromLong(var8);
               if (this.mc.player.getPositionVec().method11343((double) var10.getX(), (double) var10.getY(),
                     (double) var10.getZ()) < 9.0
                     && !Class9110.method33985(var10)
                     && !this.mc.world.getBlockState(var10).isAir()) {
                  var4.add(var10);
               }
            }

            BlockUtil.method34545(var4);
            if (var4.isEmpty()) {
               this.field39616 = null;
            } else if (this.field39616 != null) {
               if (this.mc.world.getBlockState(this.field39616).isAir()
                     || Math.sqrt(
                           this.mc.player
                                 .getDistanceNearest(
                                       (double) this.field39616.getX() + 0.5,
                                       (double) this.field39616.getY() + 0.5,
                                       (double) this.field39616.getZ() + 0.5)) > 6.0) {
                  this.field39616 = (BlockPos) var4.get(0);
               }

               Direction var13 = BlockUtil.method34580(this.field39616);
               float[] var11 = BlockUtil.method34542(this.field39616, var13);
               var1.setYaw(var11[0]);
               var1.setPitch(var11[1]);
               this.mc.player.swingArm(Hand.MAIN_HAND);
               this.mc.playerController.onPlayerDamageBlock(this.field39616, BlockUtil.method34580(this.field39616));
            } else {
               this.field39616 = (BlockPos) var4.get(0);
               Direction var14 = BlockUtil.method34580(this.field39616);
               float[] var15 = BlockUtil.method34542(this.field39616, var14);
               var1.setYaw(var15[0]);
               var1.setPitch(var15[1]);
               EventKeyPress var12 = new EventKeyPress(0, false, this.field39616);
               Client.getInstance().eventManager.call(var12);
            }

            if (var6.field44279 != Class2317.field15876) {
               this.field39615 = var1.getPitch();
               this.field39614 = var1.getYaw();
            }
         }
      }
   }

   @EventTarget
   public void method31748(EventBlockCollision var1) {
      if (this.method31743()) {
         int var4 = this.field39613.size() - 1;
         Class9510 var5 = this.field39613.get(var4);
         if (var5 != null && var5.field44282.contains(var1.getBlockPos().toLong())) {
            VoxelShape var6 = VoxelShapes.create(0.0, 0.0, 0.0, 1.0, 0.1, 1.0);
            var1.setBoxelShape(var6);
         }
      }
   }

   @EventTarget
   public void method31749(SafeWalkEvent var1) {
      if (this.method31743() && this.mc.player.onGround) {
         int var4 = this.field39613.size() - 1;
         Class9510 var5 = this.field39613.get(var4);
         if (var5.field44279 == Class2317.field15876) {
            var1.setSafe(true);
         }
      }
   }

   public Class2317 method31750() {
      Class9510 var3 = this.method31751();
      return var3 == null ? Class2317.field15873 : var3.field44279;
   }

   public Class9510 method31751() {
      return this.field39613.size() <= 1 ? null : this.field39613.get(this.field39613.size() - 2);
   }

   @EventTarget
   public void method31752(Render3DEvent var1) {
      if (this.method31743()) {
         if (this.field39613 != null) {
            for (Class9510 var5 : this.field39613) {
               this.method31753(
                     var5.field44271.method33969(), var5.field44271.method33970(), var5.field44271.method33971(),
                     var5.field44279 + " " + var5.field44273);
            }
         }

         BlockPos var17 = BlockUtil.method34564(this.mc.player.rotationYaw, this.mc.player.rotationPitch, 100.0F);
         if (var17 != null) {
            if (this.field39613 != null && this.field39613.size() > 0) {
               int var18 = MultiUtilities.applyAlpha(ClientColors.PALE_ORANGE.getColor(), 0.02F);
               int var6 = MultiUtilities.applyAlpha(ClientColors.DARK_SLATE_GREY.getColor(), 0.02F);
               GL11.glPushMatrix();
               GL11.glDisable(2929);

               for (Long var8 : this.field39613.get(0).field44283) {
                  BlockPos var9 = BlockPos.fromLong(var8);
                  if (!this.mc.world.getBlockState(var9).isAir()) {
                     double var10 = (double) var9.getX() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                     double var12 = (double) var9.getY() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                     double var14 = (double) var9.getZ() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                     Box3D var16 = new Box3D(var10, var12, var14, var10 + 1.0, var12 + 1.0, var14 + 1.0);
                     RenderUtil.render3DColoredBox(var16, var18);
                  }
               }

               for (Long var20 : this.field39613.get(0).field44284) {
                  BlockPos var21 = BlockPos.fromLong(var20);
                  if (this.mc.world.getBlockState(var21).isAir()) {
                     double var22 = (double) var21.getX() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                     double var23 = (double) var21.getY() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                     double var24 = (double) var21.getZ() - this.mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                     Box3D var25 = new Box3D(var22, var23, var24, var22 + 1.0, var23 + 1.0, var24 + 1.0);
                     RenderUtil.render3DColoredBox(var25, var6);
                  }
               }

               GL11.glEnable(2929);
               GL11.glPopMatrix();
            }
         }
      }
   }

   public void method31753(double var1, double var3, double var5, String var7) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glPushMatrix();
      GL11.glTranslated(
            var1 - this.mc.gameRenderer.getActiveRenderInfo().getPos().getX() + 0.5,
            var3 - this.mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
            var5 - this.mc.gameRenderer.getActiveRenderInfo().getPos().getZ() + 0.5);
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glRotatef(this.mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(this.mc.gameRenderer.getActiveRenderInfo().getPitch(), 1.0F, 0.0F, 0.0F);
      TrueTypeFont var10 = ResourceRegistry.JelloLightFont25;
      GL11.glPushMatrix();
      GL11.glScalef(-0.01F, -0.01F, -0.01F);
      RenderUtil.drawRect(
            (float) (-var10.getStringWidth(var7) / 2 - 10),
            0.0F,
            (float) (var10.getStringWidth(var7) / 2 + 10),
            (float) (var10.method23952() + 2),
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.1F));
      GL11.glTranslated((double) (-var10.getStringWidth(var7) / 2), 0.0, 0.0);
      RenderUtil.drawString(var10, 0.0F, 0.0F, var7,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.3F));
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }
}
