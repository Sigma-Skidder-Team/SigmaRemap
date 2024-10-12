package net.minecraft.client;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventMouse;
import com.mentalfrostbyte.jello.util.Rots;
import mapped.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFWDropCallback;

public class MouseHelper {
   private final Minecraft mc;
   private boolean field44286;
   private boolean field44287;
   private boolean field44288;
   private double field44289;
   private double field44290;
   private int field44291;
   private int field44292 = -1;
   private boolean field44293 = true;
   private int field44294;
   private double field44295;
   private final Class7605 field44296 = new Class7605();
   private final Class7605 field44297 = new Class7605();
   private double smoothCamYaw;
   private double smoothCamPitch;
   private double field44300;
   private double field44301 = Double.MIN_VALUE;
   private boolean field44302;

   public MouseHelper(Minecraft var1) {
      this.mc = var1;
   }

   private void method36730(long var1, int var3, int var4, int var5) {
      if (Client.getInstance().getGuiManager().method33480() != null) {
         Client.getInstance().getGuiManager().method33456(var3, var4);
      } else {
         if (this.mc.currentScreen == null) {
            if (var4 != 1 && var4 != 2) {
               if (var4 == 0) {
                  MouseHoverEvent var15 = new MouseHoverEvent(var3);
                  Client.getInstance().getEventManager().call(var15);
                  if (var15.isCancelled()) {
                     return;
                  }
               }
            } else {
               if (var3 > 1) {
                  ModuleKeyPress.press(var3);
               }

               EventKeyPress var8 = new EventKeyPress(var3, var4 == 2, null);
               Client.getInstance().getEventManager().call(var8);
               if (var8.isCancelled()) {
                  return;
               }
            }
         }

         if (var1 == this.mc.getMainWindow().getHandle()) {
            boolean var16 = var4 == 1;
            if (Minecraft.IS_RUNNING_ON_MAC && var3 == 0) {
               if (!var16) {
                  if (this.field44291 > 0) {
                     var3 = 1;
                     this.field44291--;
                  }
               } else if ((var5 & 2) == 2) {
                  var3 = 1;
                  this.field44291++;
               }
            }

            int var9 = var3;
            if (!var16) {
               if (this.field44292 != -1) {
                  if (this.mc.gameSettings.touchscreen && --this.field44294 > 0) {
                     return;
                  }

                  this.field44292 = -1;
               }
            } else {
               if (this.mc.gameSettings.touchscreen && this.field44294++ > 0) {
                  return;
               }

               this.field44292 = var9;
               this.field44295 = Class7511.method24483();
            }

            boolean[] var10 = new boolean[]{false};
            if (this.mc.loadingGui == null) {
               if (this.mc.currentScreen != null) {
                  double var11 = this.field44289 * (double)this.mc.getMainWindow().getScaledWidth() / (double)this.mc.getMainWindow().getWidth();
                  double var13 = this.field44290 * (double)this.mc.getMainWindow().getScaledHeight() / (double)this.mc.getMainWindow().getHeight();
                  if (!var16) {
                     Screen.wrapScreenError(
                        () -> var10[0] = this.mc.currentScreen.mouseReleased(var11, var13, var9),
                        "mouseReleased event handler",
                        this.mc.currentScreen.getClass().getCanonicalName()
                     );
                  } else {
                     Screen.wrapScreenError(
                        () -> var10[0] = this.mc.currentScreen.mouseClicked(var11, var13, var9),
                        "mouseClicked event handler",
                        this.mc.currentScreen.getClass().getCanonicalName()
                     );
                  }
               } else if (!this.field44302 && var16) {
                  this.grabMouse();
               }
            }

            if (!var10[0] && (this.mc.currentScreen == null || this.mc.currentScreen.passEvents) && this.mc.loadingGui == null) {
               if (var9 != 0) {
                  if (var9 != 2) {
                     if (var9 == 1) {
                        this.field44288 = var16;
                     }
                  } else {
                     this.field44287 = var16;
                  }
               } else {
                  this.field44286 = var16;
               }

               KeyBinding.setKeyBindState(InputMappingsType.MOUSE.method8197(var9), var16);
               if (var16) {
                  if (this.mc.player.isSpectator() && var9 == 2) {
                     this.mc.ingameGUI.getSpectatorGui().method5727();
                  } else {
                     KeyBinding.onTick(InputMappingsType.MOUSE.method8197(var9));
                  }
               }
            }
         }
      }
   }

   private void method36731(long var1, double var3, double var5) {
      if (Client.getInstance().getGuiManager().method33480() == null) {
         EventMouse var9 = new EventMouse(var5);
         Client.getInstance().getEventManager().call(var9);
         if (!var9.isCancelled()) {
            if (var1 == Minecraft.getInstance().getMainWindow().getHandle()) {
               double var10 = (!this.mc.gameSettings.field44619 ? var5 : Math.signum(var5)) * this.mc.gameSettings.field44607;
               if (this.mc.loadingGui == null) {
                  if (this.mc.currentScreen == null) {
                     if (this.mc.player != null) {
                        if (this.field44300 != 0.0 && Math.signum(var10) != Math.signum(this.field44300)) {
                           this.field44300 = 0.0;
                        }

                        this.field44300 += var10;
                        float var16 = (float)((int)this.field44300);
                        if (var16 == 0.0F) {
                           return;
                        }

                        this.field44300 -= (double)var16;
                        if (!this.mc.player.isSpectator()) {
                           this.mc.player.inventory.method4039((double)var16);
                        } else if (!this.mc.ingameGUI.getSpectatorGui().method5725()) {
                           float var17 = MathHelper.clamp(this.mc.player.abilities.getFlySpeed() + var16 * 0.005F, 0.0F, 0.2F);
                           this.mc.player.abilities.setFlySpeed(var17);
                        } else {
                           this.mc.ingameGUI.getSpectatorGui().method5726((double)(-var16));
                        }
                     }
                  } else {
                     double var12 = this.field44289 * (double)this.mc.getMainWindow().getScaledWidth() / (double)this.mc.getMainWindow().getWidth();
                     double var14 = this.field44290 * (double)this.mc.getMainWindow().getScaledHeight() / (double)this.mc.getMainWindow().getHeight();
                     this.mc.currentScreen.mouseScrolled(var12, var14, var10);
                  }
               }
            }
         }
      } else {
         Client.getInstance().getGuiManager().method33455(var3, var5);
      }
   }

   private void method36732(long var1, List<Path> var3) {
      if (this.mc.currentScreen != null) {
         this.mc.currentScreen.method2486(var3);
      }
   }

   public void registerCallbacks(long var1) {
      InputMappings.method38641(
         var1,
         (var1x, var3, var5) -> this.mc.execute(() -> this.method36734(var1x, var3, var5)),
         (var1x, var3, var4, var5) -> this.mc.execute(() -> this.method36730(var1x, var3, var4, var5)),
         (var1x, var3, var5) -> this.mc.execute(() -> this.method36731(var1x, var3, var5)),
         (var1x, var3, var4) -> {
            Path[] var8 = new Path[var3];

            for (int var9 = 0; var9 < var3; var9++) {
               var8[var9] = Paths.get(GLFWDropCallback.getName(var4, var9));
            }

            this.mc.execute(() -> this.method36732(var1x, Arrays.<Path>asList(var8)));
         }
      );
   }

   private void method36734(long var1, double var3, double var5) {
      if (var1 == Minecraft.getInstance().getMainWindow().getHandle()) {
         if (this.field44293) {
            this.field44289 = var3;
            this.field44290 = var5;
            this.field44293 = false;
         }

         Screen var9 = this.mc.currentScreen;
         if (var9 != null && this.mc.loadingGui == null) {
            double var10 = var3 * (double)this.mc.getMainWindow().getScaledWidth() / (double)this.mc.getMainWindow().getWidth();
            double var12 = var5 * (double)this.mc.getMainWindow().getScaledHeight() / (double)this.mc.getMainWindow().getHeight();
            Screen.wrapScreenError(() -> var9.mouseMoved(var10, var12), "mouseMoved event handler", var9.getClass().getCanonicalName());
            if (this.field44292 != -1 && this.field44295 > 0.0) {
               double var14 = (var3 - this.field44289) * (double)this.mc.getMainWindow().getScaledWidth() / (double)this.mc.getMainWindow().getWidth();
               double var16 = (var5 - this.field44290) * (double)this.mc.getMainWindow().getScaledHeight() / (double)this.mc.getMainWindow().getHeight();
               Screen.wrapScreenError(
                  () -> var9.mouseDragged(var10, var12, this.field44292, var14, var16), "mouseDragged event handler", var9.getClass().getCanonicalName()
               );
            }
         }

         this.mc.getProfiler().startSection("mouse");
         if (this.isMouseGrabbed() && this.mc.isGameFocused()) {
            this.smoothCamYaw = this.smoothCamYaw + (var3 - this.field44289);
            this.smoothCamPitch = this.smoothCamPitch + (var5 - this.field44290);
         }

         this.updatePlayerLook();
         this.field44289 = var3;
         this.field44290 = var5;
         this.mc.getProfiler().endSection();
      }
   }

   public void updatePlayerLook() {
      double var3 = Class7511.method24483();
      double var5 = var3 - this.field44301;
      this.field44301 = var3;
      if (this.isMouseGrabbed() && this.mc.isGameFocused()) {
         double var7 = this.mc.gameSettings.field44573 * 0.6F + 0.2F;
         double var9 = var7 * var7 * var7 * 8.0;
         double f2;
         double f3 ;
         if (!this.mc.gameSettings.smoothCamera) {
            this.field44296.method24912();
            this.field44297.method24912();
            f2 = this.smoothCamYaw * var9;
            f3  = this.smoothCamPitch * var9;
         } else {
            double var15 = this.field44296.method24911(this.smoothCamYaw * var9, var5 * var9);
            double var17 = this.field44297.method24911(this.smoothCamPitch * var9, var5 * var9);
            f2 = var15;
            f3 = var17;
         }

         this.smoothCamYaw = 0.0;
         this.smoothCamPitch = 0.0;
         double i = 1;
         if (this.mc.gameSettings.invertMouse) {
            i = -1;
         }

         this.mc.getTutorial().method37024(f2, f3);
         if (this.mc.player != null) {
            this.mc.player.setAngles(f2, f3 * i);
         }
      } else {
         this.smoothCamYaw = 0.0;
         this.smoothCamPitch = 0.0;
      }
   }

   public boolean method36736() {
      return this.field44286;
   }

   public boolean method36737() {
      return this.field44288;
   }

   public double method36738() {
      return this.field44289;
   }

   public double method36739() {
      return this.field44290;
   }

   public void setIgnoreFirstMove() {
      this.field44293 = true;
   }

   public boolean isMouseGrabbed() {
      return this.field44302;
   }

   public void grabMouse() {
      if (this.mc.isGameFocused() && !this.field44302) {
         if (!Minecraft.IS_RUNNING_ON_MAC) {
            KeyBinding.updateKeyBindState();
         }

         this.field44302 = true;
         this.field44289 = (double)(this.mc.getMainWindow().getWidth() / 2);
         this.field44290 = (double)(this.mc.getMainWindow().getHeight() / 2);
         InputMappings.method38642(this.mc.getMainWindow().getHandle(), 212995, this.field44289, this.field44290);
         this.mc.displayGuiScreen((Screen)null);
         this.mc.leftClickCounter = 10000;
         this.field44293 = true;
      }
   }

   public void ungrabMouse() {
      if (this.field44302) {
         this.field44302 = false;
         this.field44289 = (double)(this.mc.getMainWindow().getWidth() / 2);
         this.field44290 = (double)(this.mc.getMainWindow().getHeight() / 2);
         InputMappings.method38642(this.mc.getMainWindow().getHandle(), 212993, this.field44289, this.field44290);
      }
   }

   public void ignoreFirstMove() {
      this.field44293 = true;
   }
}
