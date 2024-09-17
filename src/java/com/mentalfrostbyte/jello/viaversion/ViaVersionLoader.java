package com.mentalfrostbyte.jello.viaversion;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.impl.player.Blink;
import com.mentalfrostbyte.jello.module.impl.player.OldHitting;
import com.mentalfrostbyte.jello.module.impl.render.Freecam;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mojang.datafixers.util.Pair;
import com.mentalfrostbyte.jello.Client;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CTabCompletePacket;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ViaVersionLoader {
   private static String[] field31490;
   public Minecraft mc = Minecraft.getInstance();
   public List<BlockPos> field31492 = new ArrayList<BlockPos>();
   public static List<Entity> field31493 = new ArrayList<Entity>();
   public static int field31494 = 0;
   public final Class8982 field31495;
   public CTabCompletePacket field31496;
   private UUID field31497;
   public boolean field31498 = false;
   public boolean field31499;

   public ViaVersionLoader() {
      this.field31495 = new Class8982(this);
   }

   public void method23341() {
      Client.getInstance().getEventManager().register(this);
      new JelloPortal(null);
   }

   @EventTarget
   public void method23342(StopUseItemEvent var1) {
      if (JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()) {
         if (this.mc.player.getItemInUseMaxCount() <= 1) {
            var1.setCancelled(true);
         }
      }
   }

   @EventTarget
   public void method23343(EventKeyPress var1) {
      if (var1.getKey() == this.mc.gameSettings.keyBindInventory.inputMappingsInput.getKeyCode() && JelloPortal.getCurrentVersionApplied() <= ViaVerList._1_11_1_or_2.getVersionNumber()) {
         this.mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
      }

      if (JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()
         && var1.getKey() == 258
         && this.field31496 != null
         && this.mc.currentScreen instanceof ChatScreen) {
         this.mc.getConnection().getNetworkManager().method30695(this.field31496);
         this.field31496 = null;
      }
   }

   @EventTarget
   @HigestPriority
   public void method23344(WorldLoadEvent var1) {
      field31494 = 0;
      this.field31495.method33176();
   }

   @EventTarget
   @HigestPriority
   public void method23345(EventRender var1) {
      if (this.mc.player != null
         && this.mc.player.getPose() == Pose.field13622
         && (JelloPortal.getCurrentVersionApplied() < ViaVerList._1_13.getVersionNumber() || ColorUtils.method17716())) {
         this.mc.player.setPose(Pose.STANDING);
      }
   }

   @EventTarget
   @HigestPriority
   public void method23346(EventBlockCollision var1) {
      if (this.mc.world != null && this.mc.player != null) {
         Block var4 = this.mc.world.getBlockState(var1.getBlockPos()).getBlock();
         if (JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber() && var4 instanceof Class3411) {
            VoxelShape var5 = VoxelShapes.create(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            var1.setBoxelShape(var5);
         }

         if (JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()) {
            if (this.mc.player.boundingBox.maxY - this.mc.player.boundingBox.minY == 1.5) {
               this.mc.player.boundingBox = this.mc.player.boundingBox.contract(0.0, 0.29999995F, 0.0);
            }

            if (this.mc.player.eyeHeight == 1.27F) {
               this.mc.player.eyeHeight = 1.38F;
            }
         }
      }
   }

   @EventTarget
   @HigestPriority
   public void method23347(TickEvent var1) {
      if (this.method23351()) {
         int var4 = field31493.size();

         for (int var5 = 0; var5 < var4; var5++) {
            Entity var6 = field31493.get(var5);
            if (!ColorUtils.method17708().contains(var6)) {
               field31493.remove(var6);
               var4--;
               var5--;
            } else {
               Iterator var7 = var6.method2946().iterator();
               boolean var8 = false;

               while (var7.hasNext()) {
                  ItemStack var9 = (ItemStack)var7.next();
                  if (var9.getItem() instanceof ItemSword) {
                     var8 = true;
                  }
               }

               if (!var8) {
                  field31493.remove(var6);
                  var4--;
                  var5--;
               }
            }
         }

         try {
            this.field31495.method33175();
         } catch (ConcurrentModificationException var10) {
         }

         this.field31495.method33177();

         for (int var11 = -5; var11 < 5; var11++) {
            for (int var12 = -5; var12 < 5; var12++) {
               Chunk var13 = this.mc.world.getChunk(this.mc.player.chunkCoordX + var11, this.mc.player.chunkCoordZ + var12);
               if (var13 instanceof Class1675) {
                  int var10001 = this.mc.player.chunkCoordX + var11;
                  int var14 = this.mc.world.getChunkProvider().field9291.method31823(var10001, this.mc.player.chunkCoordZ + var12);
                  Chunk var15 = new Chunk(
                     this.mc.world,
                     new ChunkPos(this.mc.player.chunkCoordX + var11, this.mc.player.chunkCoordZ + var12),
                     var13.getBiomes()
                  );
                  this.mc.world.getChunkProvider().field9291.method31824(var14, var15);
               }
            }
         }
      }
   }

   @EventTarget
   public void method23348(SendPacketEvent var1) {
      if (var1.getPacket() instanceof CHeldItemChangePacket) {
         int var4 = ((CHeldItemChangePacket)var1.getPacket()).getSlotId();
         if (PlayerInventory.isHotbar(var4)) {
            field31494 = var4;
         }
      }

      if (var1.getPacket() instanceof CTabCompletePacket) {
         if (((CTabCompletePacket)var1.getPacket()).getCommand().length() == 1) {
            return;
         }

         this.field31496 = (CTabCompletePacket)var1.getPacket();
         var1.setCancelled(true);
      }
   }

   @EventTarget
   @HigestPriority
   public void method23349(ReceivePacketEvent var1) {
      if (!Client.getInstance().getModuleManager().getModuleByClass(OldHitting.class).isEnabled() && JelloPortal.getCurrentVersionApplied() != ViaVerList._1_8_x.getVersionNumber()) {
         if (!field31493.isEmpty()) {
            field31493.clear();
         }
      } else if (var1.getPacket() instanceof SEntityEquipmentPacket) {
         SEntityEquipmentPacket var4 = (SEntityEquipmentPacket)var1.getPacket();

         for (Pair var6 : var4.func_241790_c_()) {
            if (var6.getFirst() == EquipmentSlotType.OFFHAND
               && var6.getSecond() != null
               && (
                  Client.getInstance().getModuleManager().getModuleByClass(OldHitting.class).isEnabled()
                     || JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()
               )) {
               if (!(((ItemStack)var6.getSecond()).getItem() instanceof Class3334)) {
                  Entity var7 = this.mc.world.getEntityByID(var4.getEntityID());
                  if (field31493.contains(var7)) {
                     field31493.remove(var7);
                  }
               } else {
                  Entity var14 = this.mc.world.getEntityByID(var4.getEntityID());
                  if (!field31493.contains(var14) && !ColorUtils.method17719()) {
                     field31493.add(var14);
                  }

                  var1.setCancelled(true);
               }
            }
         }
      }

      if (this.method23351()) {
         Class8920.method32597(var1, this.field31495);
         if (!(var1.getPacket() instanceof SHeldItemChangePacket)) {
            if (var1.getPacket() instanceof SUnloadChunkPacket && ColorUtils.method17717()) {
               var1.setCancelled(true);
            } else if (!(var1.getPacket() instanceof SAnimateHandPacket)) {
               if (var1.getPacket() instanceof SUpdateChunkPositionPacket && this.mc.player != null) {
                  SUpdateChunkPositionPacket var10 = (SUpdateChunkPositionPacket)var1.getPacket();
               } else if (!(var1.getPacket() instanceof SUpdateViewDistancePacket)) {
                  if (var1.getPacket() instanceof SUpdateBossInfoPacket) {
                     SUpdateBossInfoPacket var8 = (SUpdateBossInfoPacket)var1.getPacket();
                     if (var8.method17206() != Class2151.field14064) {
                        if (this.field31497 != null && var8.method17206() == Class2151.field14065) {
                           if (this.field31497.compareTo(var8.method17205()) != 0) {
                              var1.setCancelled(true);
                           } else {
                              this.field31497 = null;
                           }
                        } else if (this.field31497 != null && this.field31497.compareTo(var8.method17205()) != 0) {
                           var1.setCancelled(true);
                        }
                     } else if (this.field31497 != null) {
                        var1.setCancelled(true);
                     } else {
                        this.field31497 = var8.method17205();
                     }
                  }
               } else {
                  SUpdateViewDistancePacket var9 = (SUpdateViewDistancePacket)var1.getPacket();
               }
            } else {
               SAnimateHandPacket var11 = (SAnimateHandPacket)var1.getPacket();
               Entity var13 = this.mc.world.getEntityByID(var11.method17192());
               if (var13 != null && var11.method17193() == 3 && JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()) {
                  var1.setCancelled(true);
               }
            }
         } else {
            int var12 = ((SHeldItemChangePacket)var1.getPacket()).method17633();
            if (PlayerInventory.isHotbar(var12)) {
               field31494 = var12;
            }
         }
      }
   }

   @EventTarget
   @HigestPriority
   public void method23350(EventMove var1) {
      if (JelloPortal.getCurrentVersionApplied() < ViaVerList._1_13.getVersionNumber() || ColorUtils.method17716()) {
         if (this.mc.player.isInWater()) {
            this.field31498 = true;
            double var4 = this.mc.player.getPosY();
            float var6 = Class9140.method34128();
            float var7 = 0.02F;
            float var8 = (float) EnchantmentHelper.method26326(this.mc.player);
            if (var8 > 3.0F) {
               var8 = 3.0F;
            }

            if (!this.mc.player.onGround) {
               var8 *= 0.5F;
            }

            if (var8 > 0.0F) {
               var6 += (0.54600006F - var6) * var8 / 3.0F;
               var7 += (this.mc.player.getAIMoveSpeed() - var7) * var8 / 3.0F;
            }

            if (!this.mc.gameSettings.keyBindSprint.isKeyDown()) {
               if (this.mc.player.moveStrafing == 0.0F && this.mc.player.moveForward == 0.0F) {
                  this.mc.player.setSprinting(false);
               }
            } else {
               this.mc.player.setSprinting(true);
            }

            var7 *= !this.mc.player.isSprinting() ? 1.0F : (!this.mc.player.onGround ? 1.3F : 1.5F);
            Class9140.method34123(this.mc.player.moveStrafing, this.mc.player.moveVertical, this.mc.player.moveForward, var7);
            Class9140.method34126(Class9140.field42005, Class9140.field42006, Class9140.field42007);
            Class9140.field42005 *= (double)var6;
            Class9140.field42006 *= 0.8F;
            Class9140.field42007 *= (double)var6;
            if (!this.mc.player.method3247()) {
               Class9140.field42006 -= 0.02;
            }

            if (this.mc.player.collidedHorizontally
               && this.mc
                  .player
                  .isOffsetPositionInLiquid(Class9140.field42005, Class9140.field42006 + 0.6F - this.mc.player.getPosY() + var4, Class9140.field42007)) {
               Class9140.field42006 = 0.3F;
            }

            if (this.mc.player.isJumping) {
               Class9140.method34127();
            }

            var1.setX(Class9140.field42005);
            var1.setY(Class9140.field42006);
            var1.setZ(Class9140.field42007);
         } else {
            Class9140.field42006 = this.mc.player.getMotion().y;
            if (this.field31498 && Class9140.method34129()) {
               Class9140.field42006 = 0.2F;
               ColorUtils.setPlayerYMotion(Class9140.field42006);
            }

            Class9140.field42005 = this.mc.player.getMotion().x;
            Class9140.field42007 = this.mc.player.getMotion().z;
            this.field31498 = false;
         }
      }

      if (JelloPortal.getCurrentVersionApplied() == ViaVerList._1_8_x.getVersionNumber()) {
         if (Math.abs(var1.getX()) < 0.005) {
            var1.setX(0.0);
            ColorUtils.setPlayerXMotion(var1.getX());
         }

         if (Math.abs(var1.getY()) < 0.005) {
            var1.setY(0.0);
            ColorUtils.setPlayerYMotion(var1.getY());
         }

         if (Math.abs(var1.getZ()) < 0.005) {
            var1.setZ(0.0);
            ColorUtils.setPlayerZMotion(var1.getZ());
         }
      }
   }

   public boolean method23351() {
      return JelloPortal.getCurrentVersionApplied() <= ViaVerList._1_12_2.getVersionNumber();
   }

   @EventTarget
   @HigestPriority
   public void method23352(EventRenderEntity var1) {
      if (var1.method13953() == this.mc.player || var1.method13953() == Freecam.field23814 || var1.method13953() == Blink.field23863) {
         if (var1.method13948() != 1.0F) {
            if (EventUpdate.prevPitch - this.mc.player.rotationYawHead == 0.0F) {
               if (this.field31499) {
                  var1.method13949(MathHelper.method37827(var1.method13948(), EventUpdate.field21498, var1.method13953().renderYawOffset));
                  var1.method13950(MathHelper.method37827(var1.method13948(), EventUpdate.field21498, var1.method13953().rotationYawHead));
                  var1.method13952(MathHelper.lerp(var1.method13948(), EventUpdate.field21499, var1.method13953().rotationPitch));
                  var1.method13951(var1.method13945() - var1.method13944());
                  var1.method13953().prevRotationPitch = EventUpdate.field21499;
                  var1.method13953().prevRotationYaw = EventUpdate.field21498;
                  var1.method13953().prevRotationYawHead = EventUpdate.field21498;
                  var1.method13953().prevRenderYawOffset = EventUpdate.field21498;
                  this.field31499 = !this.field31499;
               }
            } else {
               var1.method13949(MathHelper.method37827(var1.method13948(), EventUpdate.field21498, EventUpdate.prevPitch));
               var1.method13950(MathHelper.method37827(var1.method13948(), EventUpdate.field21498, EventUpdate.prevPitch));
               var1.method13952(MathHelper.lerp(var1.method13948(), EventUpdate.field21499, EventUpdate.prevYaw));
               var1.method13951(var1.method13945() - var1.method13944());
               this.field31499 = true;
            }
         }
      }
   }
}
