package com.mentalfrostbyte.jello.viaversion;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.impl.player.Blink;
import com.mentalfrostbyte.jello.module.impl.player.OldHitting;
import com.mentalfrostbyte.jello.module.impl.render.Freecam;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mojang.datafixers.util.Pair;
import com.mentalfrostbyte.jello.Client;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CTabCompletePacket;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.BlockPos;

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
      new Class8005(null);
   }

   @EventTarget
   public void method23342(StopUseItemEvent var1) {
      if (Class8005.method27349() == Class5989.field26129.method18582()) {
         if (this.mc.player.method3160() <= 1) {
            var1.method13900(true);
         }
      }
   }

   @EventTarget
   public void method23343(Class4430 var1) {
      if (var1.method13977() == this.mc.gameSettings.keyBindInventory.keycode.getKeyCode() && Class8005.method27349() <= Class5989.field26136.method18582()) {
         this.mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
      }

      if (Class8005.method27349() == Class5989.field26129.method18582()
         && var1.method13977() == 258
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
   public void method23345(Class4415 var1) {
      if (this.mc.player != null
         && this.mc.player.method3212() == Pose.field13622
         && (Class8005.method27349() < Class5989.field26140.method18582() || ColorUtils.method17716())) {
         this.mc.player.method3211(Pose.STANDING);
      }
   }

   @EventTarget
   @HigestPriority
   public void method23346(Class4398 var1) {
      if (this.mc.world != null && this.mc.player != null) {
         Block var4 = this.mc.world.getBlockState(var1.method13902()).getBlock();
         if (Class8005.method27349() == Class5989.field26129.method18582() && var4 instanceof Class3411) {
            VoxelShape var5 = VoxelShapes.create(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            var1.method13905(var5);
         }

         if (Class8005.method27349() == Class5989.field26129.method18582()) {
            if (this.mc.player.boundingBox.field28453 - this.mc.player.boundingBox.field28450 == 1.5) {
               this.mc.player.boundingBox = this.mc.player.boundingBox.method19662(0.0, 0.29999995F, 0.0);
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
                     new Class7481(this.mc.player.chunkCoordX + var11, this.mc.player.chunkCoordZ + var12),
                     var13.method7077()
                  );
                  this.mc.world.getChunkProvider().field9291.method31824(var14, var15);
               }
            }
         }
      }
   }

   @EventTarget
   public void method23348(SendPacketEvent var1) {
      if (var1.method13932() instanceof CHeldItemChangePacket) {
         int var4 = ((CHeldItemChangePacket)var1.method13932()).getSlotId();
         if (PlayerInventory.isHotbar(var4)) {
            field31494 = var4;
         }
      }

      if (var1.method13932() instanceof CTabCompletePacket) {
         if (((CTabCompletePacket)var1.method13932()).getCommand().length() == 1) {
            return;
         }

         this.field31496 = (CTabCompletePacket)var1.method13932();
         var1.method13900(true);
      }
   }

   @EventTarget
   @HigestPriority
   public void method23349(RecievePacketEvent var1) {
      if (!Client.getInstance().getModuleManager().getModuleByClass(OldHitting.class).isEnabled() && Class8005.method27349() != Class5989.field26129.method18582()) {
         if (!field31493.isEmpty()) {
            field31493.clear();
         }
      } else if (var1.getPacket() instanceof SEntityEquipmentPacket) {
         SEntityEquipmentPacket var4 = (SEntityEquipmentPacket)var1.getPacket();

         for (Pair var6 : var4.method17562()) {
            if (var6.getFirst() == Class2106.field13732
               && var6.getSecond() != null
               && (
                  Client.getInstance().getModuleManager().getModuleByClass(OldHitting.class).isEnabled()
                     || Class8005.method27349() == Class5989.field26129.method18582()
               )) {
               if (!(((ItemStack)var6.getSecond()).getItem() instanceof Class3334)) {
                  Entity var7 = this.mc.world.getEntityByID(var4.method17561());
                  if (field31493.contains(var7)) {
                     field31493.remove(var7);
                  }
               } else {
                  Entity var14 = this.mc.world.getEntityByID(var4.method17561());
                  if (!field31493.contains(var14) && !ColorUtils.method17719()) {
                     field31493.add(var14);
                  }

                  var1.method13900(true);
               }
            }
         }
      }

      if (this.method23351()) {
         Class8920.method32597(var1, this.field31495);
         if (!(var1.getPacket() instanceof SHeldItemChangePacket)) {
            if (var1.getPacket() instanceof SUnloadChunkPacket && ColorUtils.method17717()) {
               var1.method13900(true);
            } else if (!(var1.getPacket() instanceof SAnimateHandPacket)) {
               if (var1.getPacket() instanceof SUpdateChunkPositionPacket && this.mc.player != null) {
                  SUpdateChunkPositionPacket var10 = (SUpdateChunkPositionPacket)var1.getPacket();
               } else if (!(var1.getPacket() instanceof SUpdateViewDistancePacket)) {
                  if (var1.getPacket() instanceof SUpdateBossInfoPacket) {
                     SUpdateBossInfoPacket var8 = (SUpdateBossInfoPacket)var1.getPacket();
                     if (var8.method17206() != Class2151.field14064) {
                        if (this.field31497 != null && var8.method17206() == Class2151.field14065) {
                           if (this.field31497.compareTo(var8.method17205()) != 0) {
                              var1.method13900(true);
                           } else {
                              this.field31497 = null;
                           }
                        } else if (this.field31497 != null && this.field31497.compareTo(var8.method17205()) != 0) {
                           var1.method13900(true);
                        }
                     } else if (this.field31497 != null) {
                        var1.method13900(true);
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
               if (var13 != null && var11.method17193() == 3 && Class8005.method27349() == Class5989.field26129.method18582()) {
                  var1.method13900(true);
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
   public void method23350(Class4435 var1) {
      if (Class8005.method27349() < Class5989.field26140.method18582() || ColorUtils.method17716()) {
         if (this.mc.player.method3250()) {
            this.field31498 = true;
            double var4 = this.mc.player.getPosY();
            float var6 = Class9140.method34128();
            float var7 = 0.02F;
            float var8 = (float)Class7858.method26326(this.mc.player);
            if (var8 > 3.0F) {
               var8 = 3.0F;
            }

            if (!this.mc.player.onGround) {
               var8 *= 0.5F;
            }

            if (var8 > 0.0F) {
               var6 += (0.54600006F - var6) * var8 / 3.0F;
               var7 += (this.mc.player.method2918() - var7) * var8 / 3.0F;
            }

            if (!this.mc.gameSettings.keyBindSprint.isKeyDown()) {
               if (this.mc.player.field4982 == 0.0F && this.mc.player.field4984 == 0.0F) {
                  this.mc.player.setSprinting(false);
               }
            } else {
               this.mc.player.setSprinting(true);
            }

            var7 *= !this.mc.player.method3337() ? 1.0F : (!this.mc.player.onGround ? 1.3F : 1.5F);
            Class9140.method34123(this.mc.player.field4982, this.mc.player.field4983, this.mc.player.field4984, var7);
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
                  .method3224(Class9140.field42005, Class9140.field42006 + 0.6F - this.mc.player.getPosY() + var4, Class9140.field42007)) {
               Class9140.field42006 = 0.3F;
            }

            if (this.mc.player.field4981) {
               Class9140.method34127();
            }

            var1.method13993(Class9140.field42005);
            var1.method13995(Class9140.field42006);
            var1.method13997(Class9140.field42007);
         } else {
            Class9140.field42006 = this.mc.player.method3433().y;
            if (this.field31498 && Class9140.method34129()) {
               Class9140.field42006 = 0.2F;
               ColorUtils.method17725(Class9140.field42006);
            }

            Class9140.field42005 = this.mc.player.method3433().x;
            Class9140.field42007 = this.mc.player.method3433().z;
            this.field31498 = false;
         }
      }

      if (Class8005.method27349() == Class5989.field26129.method18582()) {
         if (Math.abs(var1.method13992()) < 0.005) {
            var1.method13993(0.0);
            ColorUtils.method17724(var1.method13992());
         }

         if (Math.abs(var1.method13994()) < 0.005) {
            var1.method13995(0.0);
            ColorUtils.method17725(var1.method13994());
         }

         if (Math.abs(var1.method13996()) < 0.005) {
            var1.method13997(0.0);
            ColorUtils.method17726(var1.method13996());
         }
      }
   }

   public boolean method23351() {
      return Class8005.method27349() <= Class5989.field26139.method18582();
   }

   @EventTarget
   @HigestPriority
   public void method23352(Class4410 var1) {
      if (var1.method13953() == this.mc.player || var1.method13953() == Freecam.field23814 || var1.method13953() == Blink.field23863) {
         if (var1.method13948() != 1.0F) {
            if (Class4399.field21496 - this.mc.player.field4967 == 0.0F) {
               if (this.field31499) {
                  var1.method13949(MathHelper.method37827(var1.method13948(), Class4399.field21498, var1.method13953().field4965));
                  var1.method13950(MathHelper.method37827(var1.method13948(), Class4399.field21498, var1.method13953().field4967));
                  var1.method13952(MathHelper.lerp(var1.method13948(), Class4399.field21499, var1.method13953().rotationPitch));
                  var1.method13951(var1.method13945() - var1.method13944());
                  var1.method13953().prevRotationPitch = Class4399.field21499;
                  var1.method13953().prevRotationYaw = Class4399.field21498;
                  var1.method13953().field4968 = Class4399.field21498;
                  var1.method13953().field4966 = Class4399.field21498;
                  this.field31499 = !this.field31499;
               }
            } else {
               var1.method13949(MathHelper.method37827(var1.method13948(), Class4399.field21498, Class4399.field21496));
               var1.method13950(MathHelper.method37827(var1.method13948(), Class4399.field21498, Class4399.field21496));
               var1.method13952(MathHelper.lerp(var1.method13948(), Class4399.field21499, Class4399.field21497));
               var1.method13951(var1.method13945() - var1.method13944());
               this.field31499 = true;
            }
         }
      }
   }
}
