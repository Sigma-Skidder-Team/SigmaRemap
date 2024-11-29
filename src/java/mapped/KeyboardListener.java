package mapped;

import java.util.Locale;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import net.minecraft.block.BlockState;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ControlsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

public class KeyboardListener {
   private final Minecraft mc;
   private boolean field43916;
   private final Class7124 field43917 = new Class7124();
   private long field43918 = -1L;
   private long field43919 = -1L;
   private long field43920 = -1L;
   private boolean field43921;

   public KeyboardListener(Minecraft var1) {
      this.mc = var1;
   }

   private void method36339(String var1, Object... var2) {
      this.mc
         .ingameGUI
         .getChatGUI()
         .sendChatMessage(
            new StringTextComponent("")
               .append(new TranslationTextComponent("debug.prefix").mergeStyle(new TextFormatting[]{TextFormatting.YELLOW, TextFormatting.BOLD}))
               .appendString(" ")
               .append(new TranslationTextComponent(var1, var2))
         );
   }

   private void method36340(String var1, Object... var2) {
      this.mc
         .ingameGUI
         .getChatGUI()
         .sendChatMessage(
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
               this.mc.worldRenderer.loadRenderers();
               this.method36339("debug.reload_chunks.message");
               return true;
            case 66:
               boolean var4 = !this.mc.getRenderManager().method32217();
               this.mc.getRenderManager().method32216(var4);
               this.method36339(var4 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.mc.player.hasReducedDebug()) {
                  return false;
               } else {
                  ClientPlayNetHandler var9 = this.mc.player.connection;
                  if (var9 == null) {
                     return false;
                  }

                  this.method36339("debug.copy_location.message");
                  this.method36350(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.mc.player.world.getDimensionKey().getLocation(),
                        this.mc.player.getPosX(),
                        this.mc.player.getPosY(),
                        this.mc.player.getPosZ(),
                        this.mc.player.rotationYaw,
                        this.mc.player.rotationPitch
                     )
                  );
                  return true;
               }
            case 68:
               if (this.mc.ingameGUI != null) {
                  this.mc.ingameGUI.getChatGUI().clearChatMessages(false);
               }

               return true;
            case 70:
               AbstractOption.field25333
                  .set(
                     this.mc.gameSettings,
                     MathHelper.clamp(
                        (double)(this.mc.gameSettings.renderDistanceChunks + (Screen.method2476() ? -1 : 1)),
                        AbstractOption.field25333.getMinValue(),
                        AbstractOption.field25333.getMaxValue()
                     )
                  );
               this.method36339("debug.cycle_renderdistance.message", this.mc.gameSettings.renderDistanceChunks);
               return true;
            case 71:
               boolean var5 = this.mc.debugRenderer.method27452();
               this.method36339(var5 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.mc.gameSettings.field44588 = !this.mc.gameSettings.field44588;
               this.method36339(this.mc.gameSettings.field44588 ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.mc.gameSettings.saveOptions();
               return true;
            case 73:
               if (!this.mc.player.hasReducedDebug()) {
                  this.method36342(this.mc.player.method3424(2), !Screen.method2476());
               }

               return true;
            case 76:
               Minecraft var6 = Config.method26860();
               var6.worldRenderer.field1023 = 1;
               StringTextComponent var7 = new StringTextComponent(I18n.format("of.message.loadingVisibleChunks"));
               var6.ingameGUI.getChatGUI().method5931(var7, 201435902);
               return true;
            case 78:
               if (!this.mc.player.method3424(2)) {
                  this.method36339("debug.creative_spectator.error");
               } else if (!this.mc.player.isSpectator()) {
                  this.mc.player.method5389("/gamemode spectator");
               } else {
                  this.mc.player.method5389("/gamemode " + this.mc.playerController.method23156().method8153());
               }

               return true;
            case 79:
               if (Config.isShaders()) {
                  Class848 var10 = new Class848((Screen)null, Config.method26928());
                  Config.method26860().displayGuiScreen(var10);
               }

               return true;
            case 80:
               this.mc.gameSettings.field44589 = !this.mc.gameSettings.field44589;
               this.mc.gameSettings.saveOptions();
               this.method36339(this.mc.gameSettings.field44589 ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.method36339("debug.help.message");
               Class1266 var8 = this.mc.ingameGUI.getChatGUI();
               var8.sendChatMessage(new TranslationTextComponent("debug.reload_chunks.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.show_hitboxes.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.copy_location.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.clear_chat.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.cycle_renderdistance.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.chunk_boundaries.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.advanced_tooltips.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.inspect.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.creative_spectator.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.pause_focus.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.help.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.reload_resourcepacks.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.pause.help"));
               var8.sendChatMessage(new TranslationTextComponent("debug.gamemodes.help"));
               return true;
            case 82:
               if (Config.isShaders()) {
                  Shaders.method33033();
                  Shaders.method32953();
               }

               return true;
            case 84:
               this.method36339("debug.reload_resourcepacks.message");
               this.mc.reloadResources();
               return true;
            case 293:
               if (!this.mc.player.method3424(2)) {
                  this.method36339("debug.gamemodes.error");
               } else {
                  this.mc.displayGuiScreen(new Class1318());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void method36342(boolean var1, boolean var2) {
      RayTraceResult var5 = this.mc.objectMouseOver;
      if (var5 != null) {
         switch (Class8869.field40061[var5.getType().ordinal()]) {
            case 1:
               BlockPos var6 = ((BlockRayTraceResult)var5).getPos();
               BlockState var7 = this.mc.player.world.getBlockState(var6);
               if (var1) {
                  if (var2) {
                     this.mc.player.connection.method15799().method14179(var6, var3 -> {
                        this.method36343(var7, var6, var3);
                        this.method36339("debug.inspect.server.block");
                     });
                  } else {
                     TileEntity var11 = this.mc.player.world.getTileEntity(var6);
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
                     this.mc.player.connection.method15799().method14178(var8.getEntityId(), var3 -> {
                        this.method36344(var9, var8.getPositionVec(), var3);
                        this.method36339("debug.inspect.server.entity");
                     });
                  } else {
                     CompoundNBT var10 = var8.writeWithoutTypeId(new CompoundNBT());
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
         var3.remove("x");
         var3.remove("y");
         var3.remove("z");
         var3.remove("id");
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
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1.toString(), var2.x, var2.y, var2.z);
      } else {
         var3.remove("UUID");
         var3.remove("Pos");
         var3.remove("Dimension");
         String var7 = var3.toFormattedComponent().getString();
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1.toString(), var2.x, var2.y, var2.z, var7);
      }

      this.method36350(var6);
   }

   public void onKeyEvent(long windowPointer, int key, int scanCode, int action, int modifiers) {
      if (windowPointer == this.mc.getMainWindow().getHandle()) {
         if (Client.getInstance().getGuiManager().method33480() != null) {
            Client.getInstance().getGuiManager().method33453(key, action);
            return;
         }

         if (this.mc.currentScreen != null) {
            if (this.mc.currentScreen instanceof ChatScreen && key == 258) { //TAB KEY
               EventKeyPress keyPress = new EventKeyPress(key, action == 2, null);
               Client.getInstance().getEventManager().call(keyPress);
               if (keyPress.isCancelled()) {
                  return;
               }
            }
         } else if (action == 1 || action == 2) {
            ModuleKeyPress.press(key);
            EventKeyPress eventKeyPress = new EventKeyPress(key, action == 2, null);
            Client.getInstance().getEventManager().call(eventKeyPress);
            if (eventKeyPress.isCancelled()) {
               return;
            }
         } else if (action == 0) {
            ModuleKeyPress.method29127(key);
         }

         if (this.field43918 <= 0L) {
            if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 67)
               && InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 292)) {
               this.field43921 = true;
               this.field43918 = Util.milliTime();
               this.field43919 = Util.milliTime();
               this.field43920 = 0L;
            }
         } else if (!InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 67)
            || !InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 292)) {
            this.field43918 = -1L;
         }

         Screen var15 = this.mc.currentScreen;
         if (!(this.mc.currentScreen instanceof ControlsScreen) || ((ControlsScreen)var15).field6200 <= Util.milliTime() - 20L) {
            if (action != 1) {
               if (action == 0 && this.mc.currentScreen instanceof ControlsScreen) {
                  ((ControlsScreen)this.mc.currentScreen).field6199 = null;
               }
            } else {
               if (this.mc.gameSettings.keyBindFullscreen.matchesKey(key, scanCode)) {
                  this.mc.getMainWindow().toggleFullscreen();
                  this.mc.gameSettings.fullscreen = this.mc.getMainWindow().isFullscreen();
                  this.mc.gameSettings.saveOptions();
                  return;
               }

               if (this.mc.gameSettings.keyBindScreenshot.matchesKey(key, scanCode)) {
                  if (!Screen.hasControlDown()) {
                  }

                  ScreenShotHelper.saveScreenshot(
                     this.mc.gameDir,
                     this.mc.getMainWindow().getFramebufferWidth(),
                     this.mc.getMainWindow().getFramebufferHeight(),
                     this.mc.getFramebuffer(),
                     var1x -> this.mc.execute(() -> this.mc.ingameGUI.getChatGUI().sendChatMessage(var1x))
                  );
                  return;
               }
            }
         }

         boolean var10 = var15 == null || !(var15.getListener() instanceof TextFieldWidget) || !((TextFieldWidget)var15.getListener()).method5653();
         if (action != 0 && key == 66 && Screen.hasControlDown() && var10) {
            AbstractOption.field25346.method17945(this.mc.gameSettings, 1);
            if (var15 instanceof Class1140) {
               ((Class1140)var15).method5473();
            }
         }

         if (var15 != null) {
            boolean[] var11 = new boolean[]{false};
            Screen.wrapScreenError(() -> {
               if (action != 1 && (action != 2 || !this.field43916)) {
                  if (action == 0) {
                     if (Reflector.field42888.exists()) {
                        var11[0] = Reflector.callBoolean(Reflector.field42888, this.mc.currentScreen, key, scanCode, modifiers);
                        if (var11[0]) {
                           return;
                        }
                     }

                     var11[0] = var15.keyReleased(key, scanCode, modifiers);
                     if (Reflector.field42889.exists() && !var11[0]) {
                        var11[0] = Reflector.callBoolean(Reflector.field42889, this.mc.currentScreen, key, scanCode, modifiers);
                     }
                  }
               } else {
                  if (Reflector.field42886.exists()) {
                     var11[0] = Reflector.callBoolean(Reflector.field42886, this.mc.currentScreen, key, scanCode, modifiers);
                     if (var11[0]) {
                        return;
                     }
                  }

                  var11[0] = var15.keyPressed(key, scanCode, modifiers);
                  if (Reflector.field42887.exists() && !var11[0]) {
                     var11[0] = Reflector.callBoolean(Reflector.field42887, this.mc.currentScreen, key, scanCode, modifiers);
                  }
               }
            }, "keyPressed event handler", var15.getClass().getCanonicalName());
            if (var11[0]) {
               return;
            }
         }

         if (this.mc.currentScreen == null || this.mc.currentScreen.passEvents) {
            InputMappingsInput var16 = InputMappings.method38637(key, scanCode);
            if (action != 0) {
               if (key == 293 && this.mc.gameRenderer != null) {
                  this.mc.gameRenderer.method734();
               }

               boolean var12 = false;
               if (this.mc.currentScreen == null) {
                  if (key == 256) {
                     boolean var13 = InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 292);
                     this.mc.displayInGameMenu(var13);
                  }

                  var12 = InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 292) && this.method36341(key);
                  this.field43921 |= var12;
                  if (key == 290) {
                     this.mc.gameSettings.hideGUI = !this.mc.gameSettings.hideGUI;
                  }
               }

               if (!var12) {
                  KeyBinding.setKeyBindState(var16, true);
                  KeyBinding.onTick(var16);
               } else {
                  KeyBinding.setKeyBindState(var16, false);
               }

               if (this.mc.gameSettings.showDebugProfilerChart && key >= 48 && key <= 57) {
                  this.mc.updateDebugProfilerName(key - 48);
               }
            } else {
               KeyBinding.setKeyBindState(var16, false);
               if (key == 292) {
                  if (!this.field43921) {
                     this.mc.gameSettings.showDebugInfo = !this.mc.gameSettings.showDebugInfo;
                     this.mc.gameSettings.showDebugProfilerChart = this.mc.gameSettings.showDebugInfo && Screen.method2476();
                     this.mc.gameSettings.showLagometer = this.mc.gameSettings.showDebugInfo && Screen.method2477();
                     if (this.mc.gameSettings.showDebugInfo) {
                        if (this.mc.gameSettings.field44697) {
                           this.mc.gameSettings.showLagometer = true;
                        }

                        if (this.mc.gameSettings.field44698) {
                           this.mc.gameSettings.showDebugProfilerChart = true;
                        }
                     }
                  } else {
                     this.field43921 = false;
                  }
               }
            }
         }

         Reflector.field42869.call(key, scanCode, action, modifiers);
      }
   }

   private void method36346(long var1, int var3, int var4) {
      if (var1 == this.mc.getMainWindow().getHandle()) {
         if (Client.getInstance().getGuiManager().method33480() != null) {
            Client.getInstance().getGuiManager().method33454(var3, var4);
            return;
         }

         Screen var7 = this.mc.currentScreen;
         if (var7 != null && this.mc.getLoadingGui() == null) {
            if (Character.charCount(var3) != 1) {
               for (char var11 : Character.toChars(var3)) {
                  Screen.wrapScreenError(() -> {
                     if (!Reflector.field42884.exists() || !Reflector.callBoolean(Reflector.field42884, this.mc.currentScreen, var11, var4)) {
                        boolean var6 = var7.charTyped(var11, var4);
                        if (Reflector.field42885.exists() && !var6) {
                           Reflector.callBoolean(Reflector.field42885, this.mc.currentScreen, var11, var4);
                        }
                     }
                  }, "charTyped event handler", var7.getClass().getCanonicalName());
               }
            } else {
               Screen.wrapScreenError(() -> {
                  if (!Reflector.field42884.exists() || !Reflector.callBoolean(Reflector.field42884, this.mc.currentScreen, (char)var3, var4)) {
                     boolean var6 = var7.charTyped((char)var3, var4);
                     if (Reflector.field42885.exists() && !var6) {
                        Reflector.callBoolean(Reflector.field42885, this.mc.currentScreen, (char)var3, var4);
                     }
                  }
               }, "charTyped event handler", var7.getClass().getCanonicalName());
            }
         }
      }
   }

   public void enableRepeatEvents(boolean var1) {
      this.field43916 = var1;
   }

   public void setupCallbacks(long var1) {
      InputMappings.method38640(
         var1,
         (var1x, var3, var4, var5, var6) -> this.mc.execute(() -> this.onKeyEvent(var1x, var3, var4, var5, var6)),
         (var1x, var3, var4) -> this.mc.execute(() -> this.method36346(var1x, var3, var4))
      );
   }

   public String method36349() {
      return this.field43917.method22228(this.mc.getMainWindow().getHandle(), (var1, var2) -> {
         if (var1 != 65545) {
            this.mc.getMainWindow().method8018(var1, var2);
         }
      });
   }

   public void method36350(String var1) {
      this.field43917.method22230(this.mc.getMainWindow().getHandle(), var1);
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
               this.method36340("debug.crash.warning", MathHelper.ceil((float)var5 / 1000.0F));
            } else {
               this.method36339("debug.crash.message");
            }

            this.field43919 = var3;
            this.field43920++;
         }
      }
   }
}
