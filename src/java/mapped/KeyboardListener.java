package mapped;

import java.util.Locale;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class KeyboardListener {
   private final Minecraft field43915;
   private boolean field43916;
   private final Class7124 field43917 = new Class7124();
   private long field43918 = -1L;
   private long field43919 = -1L;
   private long field43920 = -1L;
   private boolean field43921;

   public KeyboardListener(Minecraft var1) {
      this.field43915 = var1;
   }

   private void method36339(String var1, Object... var2) {
      this.field43915
         .ingameGUI
         .getChatGUI()
         .method5930(
            new StringTextComponent("")
               .append(new TranslationTextComponent("debug.prefix").mergeStyle(new TextFormatting[]{TextFormatting.YELLOW, TextFormatting.BOLD}))
               .appendString(" ")
               .append(new TranslationTextComponent(var1, var2))
         );
   }

   private void method36340(String var1, Object... var2) {
      this.field43915
         .ingameGUI
         .getChatGUI()
         .method5930(
            new StringTextComponent("")
               .append(new TranslationTextComponent("debug.prefix").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.BOLD}))
               .appendString(" ")
               .append(new TranslationTextComponent(var1, var2))
         );
   }

   private boolean method36341(int var1) {
      if (this.field43918 > 0L && this.field43918 < Util.milliTime() - 100L) {
         return true;
      } else {
         switch (var1) {
            case 65:
               this.field43915.worldRenderer.loadRenderers();
               this.method36339("debug.reload_chunks.message");
               return true;
            case 66:
               boolean var4 = !this.field43915.getRenderManager().method32217();
               this.field43915.getRenderManager().method32216(var4);
               this.method36339(var4 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.field43915.player.hasReducedDebug()) {
                  return false;
               } else {
                  ClientPlayNetHandler var9 = this.field43915.player.connection;
                  if (var9 == null) {
                     return false;
                  }

                  this.method36339("debug.copy_location.message");
                  this.method36350(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.field43915.player.world.getDimensionKey().getLocation(),
                        this.field43915.player.getPosX(),
                        this.field43915.player.getPosY(),
                        this.field43915.player.getPosZ(),
                        this.field43915.player.rotationYaw,
                        this.field43915.player.rotationPitch
                     )
                  );
                  return true;
               }
            case 68:
               if (this.field43915.ingameGUI != null) {
                  this.field43915.ingameGUI.getChatGUI().clearChatMessages(false);
               }

               return true;
            case 70:
               AbstractOption.field25333
                  .method18089(
                     this.field43915.gameSettings,
                     MathHelper.method37778(
                        (double)(this.field43915.gameSettings.field44574 + (Screen.method2476() ? -1 : 1)),
                        AbstractOption.field25333.method18086(),
                        AbstractOption.field25333.getMaxValue()
                     )
                  );
               this.method36339("debug.cycle_renderdistance.message", this.field43915.gameSettings.field44574);
               return true;
            case 71:
               boolean var5 = this.field43915.debugRenderer.method27452();
               this.method36339(var5 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.field43915.gameSettings.field44588 = !this.field43915.gameSettings.field44588;
               this.method36339(this.field43915.gameSettings.field44588 ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.field43915.gameSettings.saveOptions();
               return true;
            case 73:
               if (!this.field43915.player.hasReducedDebug()) {
                  this.method36342(this.field43915.player.method3424(2), !Screen.method2476());
               }

               return true;
            case 76:
               Minecraft var6 = Class7944.method26860();
               var6.worldRenderer.field1023 = 1;
               StringTextComponent var7 = new StringTextComponent(I18n.format("of.message.loadingVisibleChunks"));
               var6.ingameGUI.getChatGUI().method5931(var7, 201435902);
               return true;
            case 78:
               if (!this.field43915.player.method3424(2)) {
                  this.method36339("debug.creative_spectator.error");
               } else if (!this.field43915.player.isSpectator()) {
                  this.field43915.player.method5389("/gamemode spectator");
               } else {
                  this.field43915.player.method5389("/gamemode " + this.field43915.playerController.method23156().method8153());
               }

               return true;
            case 79:
               if (Class7944.method26921()) {
                  Class848 var10 = new Class848((Screen)null, Class7944.method26928());
                  Class7944.method26860().displayGuiScreen(var10);
               }

               return true;
            case 80:
               this.field43915.gameSettings.field44589 = !this.field43915.gameSettings.field44589;
               this.field43915.gameSettings.saveOptions();
               this.method36339(this.field43915.gameSettings.field44589 ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.method36339("debug.help.message");
               Class1266 var8 = this.field43915.ingameGUI.getChatGUI();
               var8.method5930(new TranslationTextComponent("debug.reload_chunks.help"));
               var8.method5930(new TranslationTextComponent("debug.show_hitboxes.help"));
               var8.method5930(new TranslationTextComponent("debug.copy_location.help"));
               var8.method5930(new TranslationTextComponent("debug.clear_chat.help"));
               var8.method5930(new TranslationTextComponent("debug.cycle_renderdistance.help"));
               var8.method5930(new TranslationTextComponent("debug.chunk_boundaries.help"));
               var8.method5930(new TranslationTextComponent("debug.advanced_tooltips.help"));
               var8.method5930(new TranslationTextComponent("debug.inspect.help"));
               var8.method5930(new TranslationTextComponent("debug.creative_spectator.help"));
               var8.method5930(new TranslationTextComponent("debug.pause_focus.help"));
               var8.method5930(new TranslationTextComponent("debug.help.help"));
               var8.method5930(new TranslationTextComponent("debug.reload_resourcepacks.help"));
               var8.method5930(new TranslationTextComponent("debug.pause.help"));
               var8.method5930(new TranslationTextComponent("debug.gamemodes.help"));
               return true;
            case 82:
               if (Class7944.method26921()) {
                  Shaders.method33033();
                  Shaders.method32953();
               }

               return true;
            case 84:
               this.method36339("debug.reload_resourcepacks.message");
               this.field43915.reloadResources();
               return true;
            case 293:
               if (!this.field43915.player.method3424(2)) {
                  this.method36339("debug.gamemodes.error");
               } else {
                  this.field43915.displayGuiScreen(new Class1318());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void method36342(boolean var1, boolean var2) {
      RayTraceResult var5 = this.field43915.objectMouseOver;
      if (var5 != null) {
         switch (Class8869.field40061[var5.getType().ordinal()]) {
            case 1:
               BlockPos var6 = ((BlockRayTraceResult)var5).getPos();
               BlockState var7 = this.field43915.player.world.getBlockState(var6);
               if (var1) {
                  if (var2) {
                     this.field43915.player.connection.method15799().method14179(var6, var3 -> {
                        this.method36343(var7, var6, var3);
                        this.method36339("debug.inspect.server.block");
                     });
                  } else {
                     TileEntity var11 = this.field43915.player.world.getTileEntity(var6);
                     CompoundNBT var12 = var11 != null ? var11.write(new CompoundNBT()) : null;
                     this.method36343(var7, var6, var12);
                     this.method36339("debug.inspect.client.block");
                  }
               } else {
                  this.method36343(var7, var6, (CompoundNBT)null);
                  this.method36339("debug.inspect.client.block");
               }
               break;
            case 2:
               Entity var8 = ((EntityRayTraceResult)var5).getEntity();
               ResourceLocation var9 = Registry.ENTITY_TYPE.getKey(var8.getType());
               if (var1) {
                  if (var2) {
                     this.field43915.player.connection.method15799().method14178(var8.method3205(), var3 -> {
                        this.method36344(var9, var8.getPositionVec(), var3);
                        this.method36339("debug.inspect.server.entity");
                     });
                  } else {
                     CompoundNBT var10 = var8.method3294(new CompoundNBT());
                     this.method36344(var9, var8.getPositionVec(), var10);
                     this.method36339("debug.inspect.client.entity");
                  }
               } else {
                  this.method36344(var9, var8.getPositionVec(), (CompoundNBT)null);
                  this.method36339("debug.inspect.client.entity");
               }
         }
      }
   }

   private void method36343(BlockState var1, BlockPos var2, CompoundNBT var3) {
      if (var3 != null) {
         var3.method133("x");
         var3.method133("y");
         var3.method133("z");
         var3.method133("id");
      }

      StringBuilder var6 = new StringBuilder(Class8268.toString(var1));
      if (var3 != null) {
         var6.append(var3);
      }

      String var7 = String.format(Locale.ROOT, "/setblock %d %d %d %s", var2.getX(), var2.getY(), var2.getZ(), var6);
      this.method36350(var7);
   }

   private void method36344(ResourceLocation var1, Vector3d var2, CompoundNBT var3) {
      String var6;
      if (var3 == null) {
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1.toString(), var2.field18048, var2.field18049, var2.field18050);
      } else {
         var3.method133("UUID");
         var3.method133("Pos");
         var3.method133("Dimension");
         String var7 = var3.method82().getString();
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1.toString(), var2.field18048, var2.field18049, var2.field18050, var7);
      }

      this.method36350(var6);
   }

   public void method36345(long var1, int var3, int var4, int var5, int var6) {
      if (var1 == this.field43915.getMainWindow().getHandle()) {
         if (Client.getInstance().getGuiManager().method33480() != null) {
            Client.getInstance().getGuiManager().method33453(var3, var5);
            return;
         }

         if (this.field43915.currentScreen != null) {
            if (this.field43915.currentScreen instanceof ChatScreen && var3 == 258) {
               Class4430 var14 = new Class4430(var3, var5 == 2, null);
               Client.getInstance().getEventManager().call(var14);
               if (var14.isCancelled()) {
                  return;
               }
            }
         } else if (var5 == 1 || var5 == 2) {
            Class8319.method29126(var3);
            Class4430 var9 = new Class4430(var3, var5 == 2, null);
            Client.getInstance().getEventManager().call(var9);
            if (var9.isCancelled()) {
               return;
            }
         } else if (var5 == 0) {
            Class8319.method29127(var3);
         }

         if (this.field43918 <= 0L) {
            if (Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 67)
               && Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 292)) {
               this.field43921 = true;
               this.field43918 = Util.milliTime();
               this.field43919 = Util.milliTime();
               this.field43920 = 0L;
            }
         } else if (!Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 67)
            || !Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 292)) {
            this.field43918 = -1L;
         }

         Screen var15 = this.field43915.currentScreen;
         if (!(this.field43915.currentScreen instanceof Class1138) || ((Class1138)var15).field6200 <= Util.milliTime() - 20L) {
            if (var5 != 1) {
               if (var5 == 0 && this.field43915.currentScreen instanceof Class1138) {
                  ((Class1138)this.field43915.currentScreen).field6199 = null;
               }
            } else {
               if (this.field43915.gameSettings.field44652.method8519(var3, var4)) {
                  this.field43915.getMainWindow().toggleFullscreen();
                  this.field43915.gameSettings.fullscreen = this.field43915.getMainWindow().isFullscreen();
                  this.field43915.gameSettings.saveOptions();
                  return;
               }

               if (this.field43915.gameSettings.field44649.method8519(var3, var4)) {
                  if (!Screen.hasControlDown()) {
                  }

                  Class8683.method31251(
                     this.field43915.gameDir,
                     this.field43915.getMainWindow().getFramebufferWidth(),
                     this.field43915.getMainWindow().getFramebufferHeight(),
                     this.field43915.getFramebuffer(),
                     var1x -> this.field43915.execute(() -> this.field43915.ingameGUI.getChatGUI().method5930(var1x))
                  );
                  return;
               }
            }
         }

         boolean var10 = var15 == null || !(var15.method5533() instanceof Class1189) || !((Class1189)var15.method5533()).method5653();
         if (var5 != 0 && var3 == 66 && Screen.hasControlDown() && var10) {
            AbstractOption.field25346.method17945(this.field43915.gameSettings, 1);
            if (var15 instanceof Class1140) {
               ((Class1140)var15).method5473();
            }
         }

         if (var15 != null) {
            boolean[] var11 = new boolean[]{false};
            Screen.wrapScreenError(() -> {
               if (var5 != 1 && (var5 != 2 || !this.field43916)) {
                  if (var5 == 0) {
                     if (Class9299.field42888.method20214()) {
                        var11[0] = Class9299.method35056(Class9299.field42888, this.field43915.currentScreen, var3, var4, var6);
                        if (var11[0]) {
                           return;
                        }
                     }

                     var11[0] = var15.method2644(var3, var4, var6);
                     if (Class9299.field42889.method20214() && !var11[0]) {
                        var11[0] = Class9299.method35056(Class9299.field42889, this.field43915.currentScreen, var3, var4, var6);
                     }
                  }
               } else {
                  if (Class9299.field42886.method20214()) {
                     var11[0] = Class9299.method35056(Class9299.field42886, this.field43915.currentScreen, var3, var4, var6);
                     if (var11[0]) {
                        return;
                     }
                  }

                  var11[0] = var15.method1920(var3, var4, var6);
                  if (Class9299.field42887.method20214() && !var11[0]) {
                     var11[0] = Class9299.method35056(Class9299.field42887, this.field43915.currentScreen, var3, var4, var6);
                  }
               }
            }, "keyPressed event handler", var15.getClass().getCanonicalName());
            if (var11[0]) {
               return;
            }
         }

         if (this.field43915.currentScreen == null || this.field43915.currentScreen.field4567) {
            Class8115 var16 = Class9798.method38637(var3, var4);
            if (var5 != 0) {
               if (var3 == 293 && this.field43915.gameRenderer != null) {
                  this.field43915.gameRenderer.method734();
               }

               boolean var12 = false;
               if (this.field43915.currentScreen == null) {
                  if (var3 == 256) {
                     boolean var13 = Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 292);
                     this.field43915.displayInGameMenu(var13);
                  }

                  var12 = Class9798.method38639(Minecraft.getInstance().getMainWindow().getHandle(), 292) && this.method36341(var3);
                  this.field43921 |= var12;
                  if (var3 == 290) {
                     this.field43915.gameSettings.hideGUI = !this.field43915.gameSettings.hideGUI;
                  }
               }

               if (!var12) {
                  KeyBinding.method8505(var16, true);
                  KeyBinding.method8504(var16);
               } else {
                  KeyBinding.method8505(var16, false);
               }

               if (this.field43915.gameSettings.showDebugProfilerChart && var3 >= 48 && var3 <= 57) {
                  this.field43915.updateDebugProfilerName(var3 - 48);
               }
            } else {
               KeyBinding.method8505(var16, false);
               if (var3 == 292) {
                  if (!this.field43921) {
                     this.field43915.gameSettings.showDebugInfo = !this.field43915.gameSettings.showDebugInfo;
                     this.field43915.gameSettings.showDebugProfilerChart = this.field43915.gameSettings.showDebugInfo && Screen.method2476();
                     this.field43915.gameSettings.field44666 = this.field43915.gameSettings.showDebugInfo && Screen.method2477();
                     if (this.field43915.gameSettings.showDebugInfo) {
                        if (this.field43915.gameSettings.field44697) {
                           this.field43915.gameSettings.field44666 = true;
                        }

                        if (this.field43915.gameSettings.field44698) {
                           this.field43915.gameSettings.showDebugProfilerChart = true;
                        }
                     }
                  } else {
                     this.field43921 = false;
                  }
               }
            }
         }

         Class9299.field42869.method20217(var3, var4, var5, var6);
      }
   }

   private void method36346(long var1, int var3, int var4) {
      if (var1 == this.field43915.getMainWindow().getHandle()) {
         if (Client.getInstance().getGuiManager().method33480() != null) {
            Client.getInstance().getGuiManager().method33454(var3, var4);
            return;
         }

         Screen var7 = this.field43915.currentScreen;
         if (var7 != null && this.field43915.getLoadingGui() == null) {
            if (Character.charCount(var3) != 1) {
               for (char var11 : Character.toChars(var3)) {
                  Screen.wrapScreenError(() -> {
                     if (!Class9299.field42884.method20214() || !Class9299.method35056(Class9299.field42884, this.field43915.currentScreen, var11, var4)) {
                        boolean var6 = var7.method1932(var11, var4);
                        if (Class9299.field42885.method20214() && !var6) {
                           Class9299.method35056(Class9299.field42885, this.field43915.currentScreen, var11, var4);
                        }
                     }
                  }, "charTyped event handler", var7.getClass().getCanonicalName());
               }
            } else {
               Screen.wrapScreenError(() -> {
                  if (!Class9299.field42884.method20214() || !Class9299.method35056(Class9299.field42884, this.field43915.currentScreen, (char)var3, var4)) {
                     boolean var6 = var7.method1932((char)var3, var4);
                     if (Class9299.field42885.method20214() && !var6) {
                        Class9299.method35056(Class9299.field42885, this.field43915.currentScreen, (char)var3, var4);
                     }
                  }
               }, "charTyped event handler", var7.getClass().getCanonicalName());
            }
         }
      }
   }

   public void method36347(boolean var1) {
      this.field43916 = var1;
   }

   public void setupCallbacks(long var1) {
      Class9798.method38640(
         var1,
         (var1x, var3, var4, var5, var6) -> this.field43915.execute(() -> this.method36345(var1x, var3, var4, var5, var6)),
         (var1x, var3, var4) -> this.field43915.execute(() -> this.method36346(var1x, var3, var4))
      );
   }

   public String method36349() {
      return this.field43917.method22228(this.field43915.getMainWindow().getHandle(), (var1, var2) -> {
         if (var1 != 65545) {
            this.field43915.getMainWindow().method8018(var1, var2);
         }
      });
   }

   public void method36350(String var1) {
      this.field43917.method22230(this.field43915.getMainWindow().getHandle(), var1);
   }

   public void tick() {
      if (this.field43918 > 0L) {
         long var3 = Util.milliTime();
         long var5 = 10000L - (var3 - this.field43918);
         long var7 = var3 - this.field43919;
         if (var5 < 0L) {
            if (Screen.hasControlDown()) {
               Class7511.method24482();
            }

            throw new ReportedException(new CrashReport("Manually triggered debug crash", new Throwable()));
         }

         if (var7 >= 1000L) {
            if (this.field43920 != 0L) {
               this.method36340("debug.crash.warning", MathHelper.method37773((float)var5 / 1000.0F));
            } else {
               this.method36339("debug.crash.message");
            }

            this.field43919 = var3;
            this.field43920++;
         }
      }
   }
}
