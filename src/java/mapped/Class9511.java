package mapped;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.event.impl.Class4431;
import org.lwjgl.glfw.GLFWDropCallback;

public class Class9511 {
   private final Minecraft field44285;
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
   private double field44298;
   private double field44299;
   private double field44300;
   private double field44301 = Double.MIN_VALUE;
   private boolean field44302;

   public Class9511(Minecraft var1) {
      this.field44285 = var1;
   }

   private void method36730(long var1, int var3, int var4, int var5) {
      if (Client.getInstance().getGuiManager().method33480() != null) {
         Client.getInstance().getGuiManager().method33456(var3, var4);
      } else {
         if (this.field44285.currentScreen == null) {
            if (var4 != 1 && var4 != 2) {
               if (var4 == 0) {
                  Class4426 var15 = new Class4426(var3);
                  Client.getInstance().getEventManager().call(var15);
                  if (var15.isCancelled()) {
                     return;
                  }
               }
            } else {
               if (var3 > 1) {
                  Class8319.method29126(var3);
               }

               Class4430 var8 = new Class4430(var3, var4 == 2, null);
               Client.getInstance().getEventManager().call(var8);
               if (var8.isCancelled()) {
                  return;
               }
            }
         }

         if (var1 == this.field44285.method1580().method8039()) {
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
                  if (this.field44285.gameSettings.field44625 && --this.field44294 > 0) {
                     return;
                  }

                  this.field44292 = -1;
               }
            } else {
               if (this.field44285.gameSettings.field44625 && this.field44294++ > 0) {
                  return;
               }

               this.field44292 = var9;
               this.field44295 = Class7511.method24483();
            }

            boolean[] var10 = new boolean[]{false};
            if (this.field44285.loadingGuiIn == null) {
               if (this.field44285.currentScreen != null) {
                  double var11 = this.field44289 * (double)this.field44285.method1580().getScaledWidth() / (double)this.field44285.method1580().method8043();
                  double var13 = this.field44290 * (double)this.field44285.method1580().getScaledHeight() / (double)this.field44285.method1580().method8044();
                  if (!var16) {
                     Screen.method2483(
                        () -> var10[0] = this.field44285.currentScreen.method2565(var11, var13, var9),
                        "mouseReleased event handler",
                        this.field44285.currentScreen.getClass().getCanonicalName()
                     );
                  } else {
                     Screen.method2483(
                        () -> var10[0] = this.field44285.currentScreen.method1958(var11, var13, var9),
                        "mouseClicked event handler",
                        this.field44285.currentScreen.getClass().getCanonicalName()
                     );
                  }
               } else if (!this.field44302 && var16) {
                  this.grabMouse();
               }
            }

            if (!var10[0] && (this.field44285.currentScreen == null || this.field44285.currentScreen.field4567) && this.field44285.loadingGuiIn == null) {
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

               KeyBinding.method8505(Class1938.field12594.method8197(var9), var16);
               if (var16) {
                  if (this.field44285.player.method2800() && var9 == 2) {
                     this.field44285.ingameGUI.method5992().method5727();
                  } else {
                     KeyBinding.method8504(Class1938.field12594.method8197(var9));
                  }
               }
            }
         }
      }
   }

   private void method36731(long var1, double var3, double var5) {
      if (Client.getInstance().getGuiManager().method33480() == null) {
         Class4431 var9 = new Class4431(var5);
         Client.getInstance().getEventManager().call(var9);
         if (!var9.isCancelled()) {
            if (var1 == Minecraft.getInstance().method1580().method8039()) {
               double var10 = (!this.field44285.gameSettings.field44619 ? var5 : Math.signum(var5)) * this.field44285.gameSettings.field44607;
               if (this.field44285.loadingGuiIn == null) {
                  if (this.field44285.currentScreen == null) {
                     if (this.field44285.player != null) {
                        if (this.field44300 != 0.0 && Math.signum(var10) != Math.signum(this.field44300)) {
                           this.field44300 = 0.0;
                        }

                        this.field44300 += var10;
                        float var16 = (float)((int)this.field44300);
                        if (var16 == 0.0F) {
                           return;
                        }

                        this.field44300 -= (double)var16;
                        if (!this.field44285.player.method2800()) {
                           this.field44285.player.field4902.method4039((double)var16);
                        } else if (!this.field44285.ingameGUI.method5992().method5725()) {
                           float var17 = MathHelper.method37777(this.field44285.player.field4919.method20714() + var16 * 0.005F, 0.0F, 0.2F);
                           this.field44285.player.field4919.method20715(var17);
                        } else {
                           this.field44285.ingameGUI.method5992().method5726((double)(-var16));
                        }
                     }
                  } else {
                     double var12 = this.field44289 * (double)this.field44285.method1580().getScaledWidth() / (double)this.field44285.method1580().method8043();
                     double var14 = this.field44290 * (double)this.field44285.method1580().getScaledHeight() / (double)this.field44285.method1580().method8044();
                     this.field44285.currentScreen.method2649(var12, var14, var10);
                  }
               }
            }
         }
      } else {
         Client.getInstance().getGuiManager().method33455(var3, var5);
      }
   }

   private void method36732(long var1, List<Path> var3) {
      if (this.field44285.currentScreen != null) {
         this.field44285.currentScreen.method2486(var3);
      }
   }

   public void method36733(long var1) {
      Class9798.method38641(
         var1,
         (var1x, var3, var5) -> this.field44285.execute(() -> this.method36734(var1x, var3, var5)),
         (var1x, var3, var4, var5) -> this.field44285.execute(() -> this.method36730(var1x, var3, var4, var5)),
         (var1x, var3, var5) -> this.field44285.execute(() -> this.method36731(var1x, var3, var5)),
         (var1x, var3, var4) -> {
            Path[] var8 = new Path[var3];

            for (int var9 = 0; var9 < var3; var9++) {
               var8[var9] = Paths.get(GLFWDropCallback.getName(var4, var9));
            }

            this.field44285.execute(() -> this.method36732(var1x, Arrays.<Path>asList(var8)));
         }
      );
   }

   private void method36734(long var1, double var3, double var5) {
      if (var1 == Minecraft.getInstance().method1580().method8039()) {
         if (this.field44293) {
            this.field44289 = var3;
            this.field44290 = var5;
            this.field44293 = false;
         }

         Screen var9 = this.field44285.currentScreen;
         if (var9 != null && this.field44285.loadingGuiIn == null) {
            double var10 = var3 * (double)this.field44285.method1580().getScaledWidth() / (double)this.field44285.method1580().method8043();
            double var12 = var5 * (double)this.field44285.method1580().getScaledHeight() / (double)this.field44285.method1580().method8044();
            Screen.method2483(() -> var9.method5541(var10, var12), "mouseMoved event handler", var9.getClass().getCanonicalName());
            if (this.field44292 != -1 && this.field44295 > 0.0) {
               double var14 = (var3 - this.field44289) * (double)this.field44285.method1580().getScaledWidth() / (double)this.field44285.method1580().method8043();
               double var16 = (var5 - this.field44290) * (double)this.field44285.method1580().getScaledHeight() / (double)this.field44285.method1580().method8044();
               Screen.method2483(
                  () -> var9.method2516(var10, var12, this.field44292, var14, var16), "mouseDragged event handler", var9.getClass().getCanonicalName()
               );
            }
         }

         this.field44285.method1574().startSection("mouse");
         if (this.method36741() && this.field44285.method1568()) {
            this.field44298 = this.field44298 + (var3 - this.field44289);
            this.field44299 = this.field44299 + (var5 - this.field44290);
         }

         this.updatePlayerLook();
         this.field44289 = var3;
         this.field44290 = var5;
         this.field44285.method1574().endSection();
      }
   }

   public void updatePlayerLook() {
      double var3 = Class7511.method24483();
      double var5 = var3 - this.field44301;
      this.field44301 = var3;
      if (this.method36741() && this.field44285.method1568()) {
         double var7 = this.field44285.gameSettings.field44573 * 0.6F + 0.2F;
         double var9 = var7 * var7 * var7 * 8.0;
         double var11;
         double var13;
         if (!this.field44285.gameSettings.field44668) {
            this.field44296.method24912();
            this.field44297.method24912();
            var11 = this.field44298 * var9;
            var13 = this.field44299 * var9;
         } else {
            double var15 = this.field44296.method24911(this.field44298 * var9, var5 * var9);
            double var17 = this.field44297.method24911(this.field44299 * var9, var5 * var9);
            var11 = var15;
            var13 = var17;
         }

         this.field44298 = 0.0;
         this.field44299 = 0.0;
         byte var19 = 1;
         if (this.field44285.gameSettings.field44618) {
            var19 = -1;
         }

         this.field44285.method1567().method37024(var11, var13);
         if (this.field44285.player != null) {
            this.field44285.player.method3217(var11, var13 * (double)var19);
         }
      } else {
         this.field44298 = 0.0;
         this.field44299 = 0.0;
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

   public void method36740() {
      this.field44293 = true;
   }

   public boolean method36741() {
      return this.field44302;
   }

   public void grabMouse() {
      if (this.field44285.method1568() && !this.field44302) {
         if (!Minecraft.IS_RUNNING_ON_MAC) {
            KeyBinding.method8506();
         }

         this.field44302 = true;
         this.field44289 = (double)(this.field44285.method1580().method8043() / 2);
         this.field44290 = (double)(this.field44285.method1580().method8044() / 2);
         Class9798.method38642(this.field44285.method1580().method8039(), 212995, this.field44289, this.field44290);
         this.field44285.displayGuiScreen((Screen)null);
         this.field44285.field1348 = 10000;
         this.field44293 = true;
      }
   }

   public void ungrabMouse() {
      if (this.field44302) {
         this.field44302 = false;
         this.field44289 = (double)(this.field44285.method1580().method8043() / 2);
         this.field44290 = (double)(this.field44285.method1580().method8044() / 2);
         Class9798.method38642(this.field44285.method1580().method8039(), 212993, this.field44289, this.field44290);
      }
   }

   public void method36744() {
      this.field44293 = true;
   }
}
