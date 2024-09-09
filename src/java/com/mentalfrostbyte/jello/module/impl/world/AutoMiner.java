package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.network.play.server.SChunkDataPacket;
import net.minecraft.network.play.server.SMultiBlockChangePacket;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.List;
import java.util.*;

public class AutoMiner extends Module {
   public List<Class6203> field23451 = new ArrayList<Class6203>();
   public Set<ChunkPos> field23452 = new HashSet<ChunkPos>();
   public Class9823 field23453;
   public Thread field23454;
   private BlockPos field23455;
   public int field23456;
   public List<Class9110> field23457 = new ArrayList<Class9110>();
   public List<Class9110> field23458 = new ArrayList<Class9110>();

   public AutoMiner() {
      super(ModuleCategory.WORLD, "AutoMiner", "Automatically mines blocks");
   }

   @EventTarget
   public void method16075(RecievePacketEvent var1) {
      if (this.isEnabled()) {
         if (var1.getPacket() instanceof SChangeBlockPacket) {
            SChangeBlockPacket var4 = (SChangeBlockPacket)var1.getPacket();
            this.method16076(mc.world.getChunkAt(var4.method17632()).method7072());
         }

         if (var1.getPacket() instanceof SMultiBlockChangePacket) {
            SMultiBlockChangePacket var5 = (SMultiBlockChangePacket)var1.getPacket();
            this.method16076(new ChunkPos(var5.field24642.field13027, var5.field24642.field13029));
         }

         if (var1.getPacket() instanceof SChunkDataPacket && Minecraft.getInstance().world != null) {
            SChunkDataPacket var6 = (SChunkDataPacket)var1.getPacket();
            this.method16076(new ChunkPos(var6.method17378(), var6.method17379()));
         }
      }
   }

   public void method16076(ChunkPos var1) {
      for (Class6203 var5 : this.field23451) {
         if (var5.method19107(var1)) {
            this.field23452.add(var5.method19109());
         }
      }
   }

   @EventTarget
   public void method16077(WorldLoadEvent var1) {
      this.field23451.clear();
      this.field23452.clear();
   }

   public List<BlockPos> method16078(ChunkPos var1) {
      ArrayList var4 = new ArrayList();
      int var5 = var1.field32174 * 16;
      int var6 = var1.field32175 * 16;
      byte var7 = 1;
      int var8 = var5 + 15;
      int var9 = var6 + 15;
      short var10 = 255;

      for (float var11 = (float)var7; var11 <= (float)var10 && !(var11 > 100.0F); var11++) {
         for (float var12 = (float)var5; var12 <= (float)var8; var12++) {
            for (float var13 = (float)var6; var13 <= (float)var9; var13++) {
               BlockPos var14 = new BlockPos((double)var12, (double)var11, (double)var13);
               if (mc.world.getBlockState(var14).getBlock() == Blocks.field36536) {
                  var4.add(var14);
               }
            }
         }
      }

      return var4;
   }

   @EventTarget
   public void method16079(TickEvent var1) {
      if (this.isEnabled()) {
         if (mc.player.ticksExisted < 20) {
            this.field23451.clear();
         } else {
            int var4 = (int)this.getNumberValueBySettingName("Chunk Range");
            List<ChunkPos> var5 = new ArrayList<>();

            for (int var6 = -4; var6 < 4; var6++) {
               for (int var7 = -4; var7 < 4; var7++) {
                  var5.add(new ChunkPos(mc.player.chunkCoordX + var6, mc.player.chunkCoordZ + var7));
               }
            }

            Iterator var12 = this.field23451.iterator();

            while (var12.hasNext()) {
               Class6203 var13 = (Class6203)var12.next();
               if (var13.method19108(new ChunkPos(mc.player.chunkCoordX, mc.player.chunkCoordZ)) > 7
                  || this.field23452.contains(var13.method19109())) {
                  var12.remove();
               }
            }

            this.field23452.clear();
            boolean var14 = false;

            label90:
            for (ChunkPos var9 : var5) {
               for (Class6203 var11 : this.field23451) {
                  if (var11.method19107(var9)) {
                     continue label90;
                  }
               }

               this.field23451.add(new Class6203(var9.field32174, var9.field32175, this.method16078(var9)));
               var14 = true;
               break;
            }

            if (!var14 && mc.player.onGround && !Client.getInstance().method19950().method31742() && this.field23454 == null) {
               List<BlockPos> var15 = this.method16081();
               Client.getInstance().getNotificationManager().post(new Notification("AutoMiner", "Computing...", ResourcesDecrypter.directionIconPNG));
               this.field23454 = new Thread(
                  () -> {
                     boolean var4x = false;

                     for (BlockPos var6x : var15) {
                        try {
                           this.field23453 = new Class9823();
                           Class9510 var7x = new Class9510(new Class9110(mc.player.getPosition()));
                           Class9510 var8 = new Class9510(new Class9110(var6x));
                           double var9x = (double)var8.field44271.method33975(var7x.field44271);
                           int var11x = (int)Math.min(30000.0, 5000.0 + var9x * 100.0);
                           Class7267 var12x = new Class7267(var7x, var8);
                           var12x.field31170 = var11x;
                           var12x.field31173 = true;
                           var12x.field31176 = 14;
                           var12x.field31174 = true;
                           List var13x = this.field23453.method38776(var12x);
                           if (var13x.size() > 1) {
                              Client.getInstance().method19950().method31739(var13x);
                              Client.getInstance()
                                 .getNotificationManager()
                                 .post(
                                    new Notification(
                                       "AutoMiner",
                                       "Solved in " + var13x.size() + " steps! (" + this.field23453.field45900 + ":" + var11x + ")",
                                       ResourcesDecrypter.directionIconPNG
                                    )
                                 );
                              var4x = true;
                              break;
                           }
                        } catch (Exception var15x) {
                           var15x.printStackTrace();
                        }
                     }

                     try {
                        if (!var4x) {
                           Client.getInstance()
                              .getNotificationManager()
                              .post(new Notification("AutoMiner", "Could not fin any safe path. (" + var15.size() + ")", ResourcesDecrypter.directionIconPNG));
                           Thread.sleep(1000L);
                        }
                     } catch (InterruptedException var14x) {
                     }

                     this.field23454 = null;
                  }
               );
               this.field23454.start();
            }

            if (this.isEnabled() && this.field23453 != null && this.field23454 != null) {
               if (mc.player.ticksExisted % 20 == 0) {
                  this.field23458 = this.field23457;
                  this.field23457 = this.method16085();
               }

               Client.getInstance()
                  .getNotificationManager()
                  .post(new Notification("AutoMiner", "Computing... (" + this.field23453.field45900 + ")", ResourcesDecrypter.directionIconPNG));
            }
         }
      }
   }

   public BlockPos method16080(float var1) {
      ArrayList var4 = new ArrayList();

      for (Class6203 var6 : this.field23451) {
         var4.addAll(var6.field27685);
      }

      BlockUtil.method34545(var4);
      return var4.size() <= 0 ? null : (BlockPos)var4.get(0);
   }

   public List<BlockPos> method16081() {
      List<BlockPos> var3 = new ArrayList<>();

      for (Class6203 var5 : this.field23451) {
         var3.addAll(var5.field27685);
      }

      BlockUtil.method34545(var3);
      if (var3.size() > 1) {
         List<BlockPos> var10 = new ArrayList<>();
         var10.add(var3.get(0));

         for (BlockPos var6 : var3) {
            BlockPos var7 = (BlockPos)var10.get(var10.size() - 1);
            double var8 = Math.sqrt(var6.method8318(var7));
            if (var8 > 4.0 && !Class9110.method33984(var6)) {
               var10.add(var6);
            }
         }

         return var10;
      } else {
         return var3;
      }
   }

   @Override
   public void onEnable() {
      if (this.field23454 != null) {
         this.field23454.interrupt();
      }

      this.field23454 = null;
      this.field23451.clear();
      this.field23452.clear();
      Client.getInstance().method19950().method31738();
      Client.getInstance().getNotificationManager().post(new Notification("AutoMiner", "Scanning Terrain..."));
   }

   @Override
   public void onDisable() {
      if (this.field23454 != null) {
         this.field23454.interrupt();
      }

      this.field23454 = null;
      this.field23451.clear();
      this.field23452.clear();
      Client.getInstance().method19950().method31738();
   }

   private void method16082() {
      Color[] var3 = new Color[]{
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(103, 181, 75),
         null,
         null
      };

      for (int var4 = 0; var4 <= 315; var4 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var4, 0.0F, 1.0F, 0.0F);
         int var5 = var4 / 45;
         this.method16083((float)var3[var5].getRed() / 255.0F, (float)var3[var5].getGreen() / 255.0F, (float)var3[var5].getBlue() / 255.0F);
         GL11.glPopMatrix();
      }

      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);

      for (int var7 = 0; var7 <= 315; var7 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var7, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         int var8 = var7 / 45;
         Color var6 = new Color(ColorUtils.method17691(var3[var8].getRGB(), 0.2F), false);
         this.method16083((float)var6.getRed() / 255.0F, (float)var6.getGreen() / 255.0F, (float)var6.getBlue() / 255.0F);
         GL11.glPopMatrix();
      }
   }

   private void method16083(float var1, float var2, float var3) {
      GL11.glColor3f(var1, var2, var3);
      GL11.glTranslatef(0.0F, 0.0F, 0.25F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.5F);
      GL11.glVertex2f(-0.105F, 0.0F);
      GL11.glVertex2f(0.105F, 0.0F);
      GL11.glEnd();
   }

   @EventTarget
   public void method16084(Render3DEvent var1) {
      if (this.isEnabled()) {
         this.method16086();
      }
   }

   private List<Class9110> method16085() {
      ArrayList var3 = new ArrayList();

      for (Class9510 var4 = this.field23453.field45898; var4 != null; var4 = var4.field44278) {
         var3.add(var4.field44271);
      }

      Collections.reverse(var3);
      return var3;
   }

   public void method16086() {
      if (this.isEnabled() && this.field23453 != null && this.field23454 != null) {
         GL11.glPushMatrix();
         GL11.glEnable(2848);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         GL11.glEnable(32925);
         GL11.glLineWidth(1.4F);
         GL11.glColor4d(1.0, 1.0, 1.0, 0.44F);
         GL11.glBegin(3);
         float var3 = Math.min(1.0F, ((float)(mc.player.ticksExisted % 20) + mc.timer.renderPartialTicks) / 20.0F);

         for (int var4 = 0; var4 < (int)((float)this.field23457.size() * var3); var4++) {
            Class9110 var5 = this.field23457.get(var4);
            Class9110 var6 = null;
            if (this.field23458.size() - 1 >= var4) {
               var6 = this.field23458.get(var4);
            } else {
               var6 = var5;
            }

            double var7 = var6.method33969() + (var5.method33969() - var6.method33969());
            double var9 = var6.method33970() + (var5.method33970() - var6.method33970());
            double var11 = var6.method33971() + (var5.method33971() - var6.method33971());
            GL11.glVertex3d(
               var7 - mc.gameRenderer.getActiveRenderInfo().getPos().getX() + 0.5,
               var9 - mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
               var11 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ() + 0.5
            );
         }

         GL11.glEnd();
         GL11.glPushMatrix();
         GL11.glTranslated(
            mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
            mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
            mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
         );
         GL11.glPopMatrix();
         GL11.glDisable(3042);
         GL11.glEnable(3553);
         GL11.glEnable(2929);
         GL11.glDisable(32925);
         GL11.glDisable(2848);
         GL11.glPopMatrix();
      } else {
         this.field23457.clear();
      }
   }
}
