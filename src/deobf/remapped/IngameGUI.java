package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TextProcessing;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class IngameGUI extends AbstractGui {
   private static final Identifier VIGNETTE_TEX_PATH = new Identifier("textures/misc/vignette.png");
   private static final Identifier WIDGETS_TEX_PATH = new Identifier("textures/gui/widgets.png");
   private static final Identifier PUMPKIN_BLUR_TEX_PATH = new Identifier("textures/misc/pumpkinblur.png");
   private static final ITextComponent field_243249_e = new TranslationTextComponent("demo.demoExpired");
   private final Random rand = new Random();
   private final MinecraftClient mc;
   private final ItemRenderer itemRenderer;
   private final NewChatGui persistantChatGUI;
   private int ticks;
   private ITextComponent overlayMessage;
   private int overlayMessageTime;
   private boolean animateOverlayMessageColor;
   public float prevVignetteBrightness = 1.0F;
   private int remainingHighlightTicks;
   private ItemStack highlightingItemStack = ItemStack.EMPTY;
   public final DebugOverlayGui overlayDebug;
   private final SubtitleOverlayGui overlaySubtitle;
   private final SpectatorGui spectatorGui;
   private final PlayerTabOverlayGui overlayPlayerList;
   private final BossOverlayGui overlayBoss;
   private int titlesTimer;
   private ITextComponent displayedTitle;
   private ITextComponent displayedSubTitle;
   private int titleFadeIn;
   private int titleDisplayTime;
   private int titleFadeOut;
   private int playerHealth;
   private int lastPlayerHealth;
   private long lastSystemTime;
   private long healthUpdateCounter;
   private int scaledWidth;
   private int scaledHeight;
   private final Map<ChatType, List<IChatListener>> chatListeners = Maps.newHashMap();

   public IngameGUI(MinecraftClient var1) {
      this.mc = var1;
      this.itemRenderer = var1.method_8511();
      this.overlayDebug = new DebugOverlayGui(var1);
      this.spectatorGui = new SpectatorGui(var1);
      this.persistantChatGUI = new NewChatGui(var1);
      this.overlayPlayerList = new PlayerTabOverlayGui(var1, this);
      this.overlayBoss = new BossOverlayGui(var1);
      this.overlaySubtitle = new SubtitleOverlayGui(var1);

      for (ChatType var7 : ChatType.values()) {
         this.chatListeners.put(var7, Lists.newArrayList());
      }

      IChatListener var8 = NarratorChatListener.INSTANCE;
      this.chatListeners.get(ChatType.CHAT).add(new NormalChatListener(var1));
      this.chatListeners.get(ChatType.CHAT).add(var8);
      this.chatListeners.get(ChatType.SYSTEM).add(new NormalChatListener(var1));
      this.chatListeners.get(ChatType.SYSTEM).add(var8);
      this.chatListeners.get(ChatType.GAME_INFO).add(new OverlayChatListener(var1));
      this.setDefaultTitlesTimes();
   }

   public void setDefaultTitlesTimes() {
      this.titleFadeIn = 10;
      this.titleDisplayTime = 70;
      this.titleFadeOut = 20;
   }

   public void renderIngameGui(class_7966 matrixStack, float partialTicks) {
      this.scaledWidth = this.mc.getMainWindow().getScaledWidth();
      this.scaledHeight = this.mc.getMainWindow().getScaledHeight();
      TextRenderer var5 = this.getFontRenderer();
      RenderSystem.enableBlend();
      if (!Config.isVignetteEnabled()) {
         RenderSystem.enableDepthTest();
         RenderSystem.defaultBlendFunc();
      } else {
         this.renderVignette(this.mc.getRenderViewEntity());
      }

      SigmaMainClass.getInstance().method_3333();
      ItemStack var6 = this.mc.thePlayer.inventory.armorItemInSlot(3);
      if (this.mc.gameOptions.getPointOfView().method_42383() && var6.method_27960() == class_4783.field_23281.method_10803()) {
         this.renderPumpkinOverlay();
      }

      float var7 = MathHelper.lerp(partialTicks, this.mc.thePlayer.prevTimeInPortal, this.mc.thePlayer.timeInPortal);
      if (var7 > 0.0F && !this.mc.thePlayer.isPotionActive(Effects.NAUSEA)) {
         this.renderPortal(var7);
      }

      if (this.mc.playerController.getCurrentGameType() != GameType.SPECTATOR) {
         if (!this.mc.gameOptions.hideGUI) {
            this.renderHotbar(partialTicks, matrixStack);
         }
      } else {
         this.spectatorGui.func_238528_a_(matrixStack, partialTicks);
      }

      if (!this.mc.gameOptions.hideGUI) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.getTextureManager().bindTexture(GUI_ICONS_LOCATION);
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         this.func_238456_d_(matrixStack);
         GlStateManager.enableAlphaTest();
         RenderSystem.defaultBlendFunc();
         this.mc.getProfiler().startSection("bossHealth");
         this.overlayBoss.func_238484_a_(matrixStack);
         this.mc.getProfiler().endSection();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.getTextureManager().bindTexture(GUI_ICONS_LOCATION);
         if (this.mc.playerController.shouldDrawHUD()) {
            this.func_238457_e_(matrixStack);
         }

         this.func_238458_f_(matrixStack);
         RenderSystem.disableBlend();
         int var8 = this.scaledWidth / 2 - 91;
         if (!this.mc.thePlayer.isRidingHorse()) {
            if (this.mc.playerController.gameIsSurvivalOrAdventure()) {
               this.func_238454_b_(matrixStack, var8);
            }
         } else {
            this.renderHorseJumpBar(matrixStack, var8);
         }

         if (this.mc.gameOptions.heldItemTooltips && this.mc.playerController.getCurrentGameType() != GameType.SPECTATOR) {
            this.method_13993(matrixStack);
         } else if (this.mc.thePlayer.method_37221()) {
            this.spectatorGui.method_38563(matrixStack);
         }
      }

      if (this.mc.thePlayer.method_3202() > 0) {
         this.mc.getProfiler().startSection("sleep");
         RenderSystem.method_16491();
         RenderSystem.method_16458();
         float var14 = (float)this.mc.thePlayer.method_3202();
         float var9 = var14 / 100.0F;
         if (var9 > 1.0F) {
            var9 = 1.0F - (var14 - 100.0F) / 10.0F;
         }

         int var10 = (int)(220.0F * var9) << 24 | 1052704;
         method_9774(matrixStack, 0, 0, this.scaledWidth, this.scaledHeight, var10);
         RenderSystem.enableAlphaTest();
         RenderSystem.enableDepthTest();
         this.mc.getProfiler().endSection();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      if (this.mc.method_8493()) {
         this.method_13971(matrixStack);
      }

      this.method_13983(matrixStack);
      if (this.mc.gameOptions.field_45470) {
         this.overlayDebug.method_17982(matrixStack);
      }

      if (!this.mc.gameOptions.hideGUI) {
         if (this.overlayMessage != null && this.overlayMessageTime > 0) {
            this.mc.getProfiler().startSection("overlayMessage");
            float var15 = (float)this.overlayMessageTime - partialTicks;
            int var18 = (int)(var15 * 255.0F / 20.0F);
            if (var18 > 255) {
               var18 = 255;
            }

            if (var18 > 8) {
               RenderSystem.method_16438();
               RenderSystem.method_16413((float)(this.scaledWidth / 2), (float)(this.scaledHeight - 68), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               int var22 = 16777215;
               if (this.animateOverlayMessageColor) {
                  var22 = MathHelper.hsvToRGB(var15 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int var11 = var18 << 24 & 0xFF000000;
               int var12 = var5.method_45379(this.overlayMessage);
               this.method_14005(matrixStack, var5, -4, var12, 16777215 | var11);
               var5.method_45378(matrixStack, this.overlayMessage, (float)(-var12 / 2), -4.0F, var22 | var11);
               RenderSystem.disableBlend();
               RenderSystem.method_16489();
            }

            this.mc.getProfiler().endSection();
         }

         if (this.displayedTitle != null && this.titlesTimer > 0) {
            this.mc.getProfiler().startSection("titleAndSubtitle");
            float var16 = (float)this.titlesTimer - partialTicks;
            int var19 = 255;
            if (this.titlesTimer > this.titleFadeOut + this.titleDisplayTime) {
               float var23 = (float)(this.titleFadeIn + this.titleDisplayTime + this.titleFadeOut) - var16;
               var19 = (int)(var23 * 255.0F / (float)this.titleFadeIn);
            }

            if (this.titlesTimer <= this.titleFadeOut) {
               var19 = (int)(var16 * 255.0F / (float)this.titleFadeOut);
            }

            var19 = MathHelper.clamp(var19, 0, 255);
            if (var19 > 8) {
               RenderSystem.method_16438();
               RenderSystem.method_16413((float)(this.scaledWidth / 2), (float)(this.scaledHeight / 2), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.method_16438();
               RenderSystem.method_16403(4.0F, 4.0F, 4.0F);
               int var24 = var19 << 24 & 0xFF000000;
               int var26 = var5.method_45379(this.displayedTitle);
               this.method_14005(matrixStack, var5, -10, var26, 16777215 | var24);
               var5.method_45392(matrixStack, this.displayedTitle, (float)(-var26 / 2), -10.0F, 16777215 | var24);
               RenderSystem.method_16489();
               if (this.displayedSubTitle != null) {
                  RenderSystem.method_16438();
                  RenderSystem.method_16403(2.0F, 2.0F, 2.0F);
                  int var30 = var5.method_45379(this.displayedSubTitle);
                  this.method_14005(matrixStack, var5, 5, var30, 16777215 | var24);
                  var5.method_45392(matrixStack, this.displayedSubTitle, (float)(-var30 / 2), 5.0F, 16777215 | var24);
                  RenderSystem.method_16489();
               }

               RenderSystem.disableBlend();
               RenderSystem.method_16489();
            }

            this.mc.getProfiler().endSection();
         }

         this.overlaySubtitle.method_20416(matrixStack);
         class_1097 var17 = this.mc.theWorld.method_29562();
         class_4399 var21 = null;
         class_3903 var25 = var17.method_4848(this.mc.thePlayer.method_37206());
         if (var25 != null) {
            int var27 = var25.method_23381().getColorIndex();
            if (var27 >= 0) {
               var21 = var17.method_4833(3 + var27);
            }
         }

         class_4399 var28 = var21 == null ? var17.method_4833(1) : var21;
         if (var28 != null) {
            class_4459 var31 = new class_4459(true);
            SigmaMainClass.getInstance().getEventManager().call(var31);
            if (var31.method_29716()) {
               return;
            }

            this.method_13977(matrixStack, var28);
            class_4459 var13 = new class_4459(false);
            SigmaMainClass.getInstance().getEventManager().call(var13);
         }

         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.method_16458();
         RenderSystem.method_16438();
         RenderSystem.method_16413(0.0F, (float)(this.scaledHeight - 48), 0.0F);
         this.mc.getProfiler().startSection("chat");
         this.persistantChatGUI.method_18678(matrixStack, this.ticks);
         this.mc.getProfiler().endSection();
         RenderSystem.method_16489();
         var28 = var17.method_4833(0);
         if (this.mc.gameOptions.keyPlayerList.isKeyDown()
            && (!this.mc.method_8566() || this.mc.thePlayer.connection.method_4798().size() > 1 || var28 != null)) {
            this.overlayPlayerList.method_9944(true);
            this.overlayPlayerList.method_9940(matrixStack, this.scaledWidth, var17, var28);
         } else {
            this.overlayPlayerList.method_9944(false);
         }
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
   }

   private void method_14005(class_7966 var1, TextRenderer var2, int var3, int var4, int var5) {
      int var8 = this.mc.gameOptions.method_40888(0.0F);
      if (var8 != 0) {
         int var9 = -var4 / 2;
         method_9774(var1, var9 - 2, var3 - 2, var9 + var4 + 2, var3 + 9 + 2, class_8496.method_39155(var8, var5));
      }
   }

   private void func_238456_d_(class_7966 var1) {
      GameOptions var4 = this.mc.gameOptions;
      if (var4.getPointOfView().method_42383()
         && (this.mc.playerController.getCurrentGameType() != GameType.SPECTATOR || this.method_14001(this.mc.field_9587))) {
         if (var4.field_45470 && !var4.hideGUI && !this.mc.thePlayer.method_3179() && !var4.field_45500) {
            RenderSystem.method_16438();
            RenderSystem.method_16413((float)(this.scaledWidth / 2), (float)(this.scaledHeight / 2), (float)this.method_9777());
            Camera var11 = this.mc.gameRenderer.method_35949();
            RenderSystem.method_16410(var11.method_41638(), -1.0F, 0.0F, 0.0F);
            RenderSystem.method_16410(var11.method_41640(), 0.0F, 1.0F, 0.0F);
            RenderSystem.method_16403(-1.0F, -1.0F, -1.0F);
            RenderSystem.method_16412(10);
            RenderSystem.method_16489();
         } else {
            RenderSystem.method_16425(class_5033.field_26037, class_8535.field_43686, class_5033.field_26047, class_8535.field_43699);
            byte var5 = 15;
            this.method_9781(var1, (this.scaledWidth - 15) / 2, (this.scaledHeight - 15) / 2, 0, 0, 15, 15);
            if (this.mc.gameOptions.field_45555 == class_8846.field_45243) {
               float var6 = this.mc.thePlayer.method_3203(0.0F);
               boolean var7 = false;
               if (this.mc.field_9662 != null && this.mc.field_9662 instanceof LivingEntity && var6 >= 1.0F) {
                  var7 = this.mc.thePlayer.method_3163() > 5.0F;
                  var7 &= this.mc.field_9662.isAlive();
               }

               int var8 = this.scaledHeight / 2 - 7 + 16;
               int var9 = this.scaledWidth / 2 - 8;
               if (!var7) {
                  if (var6 < 1.0F) {
                     int var10 = (int)(var6 * 17.0F);
                     this.method_9781(var1, var9, var8, 36, 94, 16, 4);
                     this.method_9781(var1, var9, var8, 52, 94, var10, 4);
                  }
               } else {
                  this.method_9781(var1, var9, var8, 68, 94, 16, 16);
               }
            }
         }
      }
   }

   private boolean method_14001(class_7474 var1) {
      if (var1 != null) {
         if (var1.method_33990() != class_1430.field_7718) {
            if (var1.method_33990() != class_1430.field_7717) {
               return false;
            } else {
               BlockPos var4 = ((class_9529)var1).method_43955();
               ClientWorld var5 = this.mc.theWorld;
               return var5.method_28262(var4).method_8317(var5, var4) != null;
            }
         } else {
            return ((class_5631)var1).method_25524() instanceof class_4259;
         }
      } else {
         return false;
      }
   }

   public void method_13983(class_7966 var1) {
      Collection var4 = this.mc.thePlayer.method_26503();
      if (!var4.isEmpty()) {
         RenderSystem.enableBlend();
         int var5 = 0;
         int var6 = 0;
         class_3944 var7 = this.mc.method_8551();
         ArrayList var8 = Lists.newArrayListWithExpectedSize(var4.size());
         this.mc.getTextureManager().bindTexture(class_2208.field_10969);

         for (class_2250 var10 : Ordering.natural().reverse().sortedCopy(var4)) {
            class_1425 var11 = var10.method_10339();
            if (class_7860.field_40209.method_3596()) {
               if (!class_7860.method_35565(var10, class_7860.field_40209)) {
                  continue;
               }

               this.mc.getTextureManager().bindTexture(class_2208.field_10969);
            }

            if (var10.method_10342()) {
               int var12 = this.scaledWidth;
               byte var13 = 1;
               if (this.mc.method_8493()) {
                  var13 += 15;
               }

               if (!var11.method_6542()) {
                  var6++;
                  var12 -= 25 * var6;
                  var13 += 26;
               } else {
                  var5++;
                  var12 -= 25 * var5;
               }

               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               float var14 = 1.0F;
               if (!var10.method_10338()) {
                  this.method_9781(var1, var12, var13, 141, 166, 24, 24);
                  if (var10.method_10347() <= 200) {
                     int var15 = 10 - var10.method_10347() / 20;
                     var14 = MathHelper.clamp((float)var10.method_10347() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + MathHelper.cos((float)var10.method_10347() * (float) Math.PI / 5.0F)
                           * MathHelper.clamp((float)var15 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               } else {
                  this.method_9781(var1, var12, var13, 165, 166, 24, 24);
               }

               class_5155 var20 = var7.method_18228(var11);
               int var16 = var12;
               byte var17 = var13;
               float var18 = var14;
               var8.add(() -> {
                  this.mc.getTextureManager().bindTexture(var20.method_23608().method_38519());
                  RenderSystem.color4f(1.0F, 1.0F, 1.0F, var18);
                  method_9782(var1, var16 + 3, var17 + 3, this.method_9777(), 18, 18, var20);
               });
               if (class_7860.field_39873.method_3596()) {
                  class_7860.method_35555(var10, class_7860.field_39873, this, var1, var12, Integer.valueOf(var13), this.method_9777(), var14);
               }
            }
         }

         var8.forEach(Runnable::run);
      }
   }

   public void renderHotbar(float var1, class_7966 var2) {
      PlayerEntity var5 = this.method_13976();
      if (var5 != null) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.getTextureManager().bindTexture(WIDGETS_TEX_PATH);
         ItemStack var6 = var5.method_26568();
         class_1736 var7 = var5.method_26432().method_7745();
         int var8 = this.scaledWidth / 2;
         int var9 = this.method_9777();
         short var10 = 182;
         byte var11 = 91;
         this.method_9776(-90);
         this.method_9781(var2, var8 - 91, this.scaledHeight - 22, 0, 0, 182, 22);
         this.method_9781(var2, var8 - 91 - 1 + var5.inventory.field_36404 * 20, this.scaledHeight - 22 - 1, 0, 22, 24, 22);
         if (!var6.method_28022()) {
            if (var7 != class_1736.field_8940) {
               this.method_9781(var2, var8 + 91, this.scaledHeight - 23, 53, 22, 29, 24);
            } else {
               this.method_9781(var2, var8 - 91 - 29, this.scaledHeight - 23, 24, 22, 29, 24);
            }
         }

         this.method_9776(var9);
         RenderSystem.method_16381();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         class_3290.method_15104(false);

         for (int var12 = 0; var12 < 9; var12++) {
            int var13 = var8 - 90 + var12 * 20 + 2;
            int var14 = this.scaledHeight - 16 - 3;
            this.method_13984(var13, var14, var1, var5, var5.inventory.field_36401.get(var12));
         }

         if (!var6.method_28022()) {
            class_3290.method_15104(true);
            int var16 = this.scaledHeight - 16 - 3;
            if (var7 != class_1736.field_8940) {
               this.method_13984(var8 + 91 + 10, var16, var1, var5, var6);
            } else {
               this.method_13984(var8 - 91 - 26, var16, var1, var5, var6);
            }

            class_3290.method_15104(false);
         }

         if (this.mc.gameOptions.field_45555 == class_8846.field_45241) {
            float var17 = this.mc.thePlayer.method_3203(0.0F);
            if (var17 < 1.0F) {
               int var18 = this.scaledHeight - 20;
               int var19 = var8 + 91 + 6;
               if (var7 == class_1736.field_8943) {
                  var19 = var8 - 91 - 22;
               }

               this.mc.getTextureManager().bindTexture(AbstractGui.GUI_ICONS_LOCATION);
               int var15 = (int)(var17 * 19.0F);
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               this.method_9781(var2, var19, var18, 0, 94, 18, 18);
               this.method_9781(var2, var19, var18 + 18 - var15, 18, 112 - var15, 18, var15);
            }
         }

         RenderSystem.method_16443();
         RenderSystem.disableBlend();
      }
   }

   public void renderHorseJumpBar(class_7966 var1, int var2) {
      this.mc.getProfiler().startSection("jumpBar");
      this.mc.getTextureManager().bindTexture(AbstractGui.GUI_ICONS_LOCATION);
      float var5 = this.mc.thePlayer.method_27313();
      short var6 = 182;
      int var7 = (int)(var5 * 183.0F);
      int var8 = this.scaledHeight - 32 + 3;
      this.method_9781(var1, var2, var8, 0, 84, 182, 5);
      if (var7 > 0) {
         this.method_9781(var1, var2, var8, 0, 89, var7, 5);
      }

      this.mc.getProfiler().endSection();
   }

   public void func_238454_b_(class_7966 var1, int var2) {
      this.mc.getProfiler().startSection("expBar");
      this.mc.getTextureManager().bindTexture(AbstractGui.GUI_ICONS_LOCATION);
      int var5 = this.mc.thePlayer.method_3194();
      if (var5 > 0) {
         short var6 = 182;
         int var7 = (int)(this.mc.thePlayer.field_3842 * 183.0F);
         int var8 = this.scaledHeight - 32 + 3;
         this.method_9781(var1, var2, var8, 0, 64, 182, 5);
         if (var7 > 0) {
            this.method_9781(var1, var2, var8, 0, 69, var7, 5);
         }
      }

      this.mc.getProfiler().endSection();
      if (this.mc.thePlayer.field_3840 > 0) {
         this.mc.getProfiler().startSection("expLevel");
         int var10 = 8453920;
         if (Config.method_14438()) {
            var10 = class_9300.method_42858(var10);
         }

         String var11 = "" + this.mc.thePlayer.field_3840;
         int var12 = (this.scaledWidth - this.getFontRenderer().method_45395(var11)) / 2;
         int var9 = this.scaledHeight - 31 - 4;
         this.getFontRenderer().method_45385(var1, var11, (float)(var12 + 1), (float)var9, 0);
         this.getFontRenderer().method_45385(var1, var11, (float)(var12 - 1), (float)var9, 0);
         this.getFontRenderer().method_45385(var1, var11, (float)var12, (float)(var9 + 1), 0);
         this.getFontRenderer().method_45385(var1, var11, (float)var12, (float)(var9 - 1), 0);
         this.getFontRenderer().method_45385(var1, var11, (float)var12, (float)var9, var10);
         this.mc.getProfiler().endSection();
      }
   }

   public void method_13993(class_7966 var1) {
      this.mc.getProfiler().startSection("selectedItemName");
      if (this.remainingHighlightTicks > 0 && !this.highlightingItemStack.method_28022()) {
         IFormattableTextComponent var4 = new StringTextComponent("")
            .append(this.highlightingItemStack.method_28008())
            .mergeStyle(this.highlightingItemStack.method_28010().field_26118);
         if (this.highlightingItemStack.method_28018()) {
            var4.mergeStyle(TextFormatting.ITALIC);
         }

         Object var5 = var4;
         if (class_7860.field_40201.method_3596()) {
            var5 = (ITextComponent)class_7860.method_35555(this.highlightingItemStack, class_7860.field_40201, var4);
         }

         int var6 = this.getFontRenderer().method_45379((ITextProperties)var5);
         int var7 = (this.scaledWidth - var6) / 2;
         int var8 = this.scaledHeight - 59;
         if (!this.mc.playerController.shouldDrawHUD()) {
            var8 += 14;
         }

         int var9 = (int)((float)this.remainingHighlightTicks * 256.0F / 10.0F);
         if (var9 > 255) {
            var9 = 255;
         }

         if (var9 > 0) {
            RenderSystem.method_16438();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            method_9774(var1, var7 - 2, var8 - 2, var7 + var6 + 2, var8 + 9 + 2, this.mc.gameOptions.method_40881(0));
            TextRenderer var10 = null;
            if (class_7860.field_40211.method_3596()) {
               var10 = (TextRenderer)class_7860.method_35555(this.highlightingItemStack.method_27960(), class_7860.field_40211, this.highlightingItemStack);
            }

            if (var10 == null) {
               this.getFontRenderer().method_45392(var1, (ITextComponent)var5, (float)var7, (float)var8, 16777215 + (var9 << 24));
            } else {
               var6 = (this.scaledWidth - var10.method_45379((ITextProperties)var5)) / 2;
               var10.method_45382(var1, ((ITextComponent)var5).func_241878_f(), (float)var7, (float)var8, 16777215 + (var9 << 24));
            }

            RenderSystem.disableBlend();
            RenderSystem.method_16489();
         }
      }

      this.mc.getProfiler().endSection();
   }

   public void method_13971(class_7966 var1) {
      this.mc.getProfiler().startSection("demo");
      Object var4;
      if (this.mc.theWorld.method_29546() < 120500L) {
         var4 = new TranslationTextComponent("demo.remainingTime", class_6660.method_30575((int)(120500L - this.mc.theWorld.method_29546())));
      } else {
         var4 = field_243249_e;
      }

      int var5 = this.getFontRenderer().method_45379((ITextProperties)var4);
      this.getFontRenderer().method_45392(var1, (ITextComponent)var4, (float)(this.scaledWidth - var5 - 10), 5.0F, 16777215);
      this.mc.getProfiler().endSection();
   }

   private void method_13977(class_7966 var1, class_4399 var2) {
      class_1097 var5 = var2.method_20486();
      Collection var6 = var5.method_4863(var2);
      List var7 = var6.stream().filter(var0 -> var0.method_38147() != null && !var0.method_38147().startsWith("#")).collect(Collectors.toList());
      if (var7.size() <= 15) {
         var6 = var7;
      } else {
         var6 = Lists.newArrayList(Iterables.skip(var7, var6.size() - 15));
      }

      ArrayList var8 = Lists.newArrayListWithCapacity(var6.size());
      ITextComponent var9 = var2.method_20488();
      int var10 = this.getFontRenderer().method_45379(var9);
      int var11 = var10;
      int var12 = this.getFontRenderer().method_45395(": ");

      for (class_8274 var14 : var6) {
         class_3903 var15 = var5.method_4848(var14.method_38147());
         IFormattableTextComponent var16 = class_3903.method_18063(var15, new StringTextComponent(var14.method_38147()));
         var8.add(Pair.of(var14, var16));
         var11 = Math.max(var11, this.getFontRenderer().method_45379(var16) + var12 + this.getFontRenderer().method_45395(Integer.toString(var14.method_38146())));
      }

      int var28 = var6.size() * 9;
      int var29 = this.scaledHeight / 2 + var28 / 3;
      byte var30 = 3;
      int var31 = this.scaledWidth - var11 - 3;
      int var17 = 0;
      int var18 = this.mc.gameOptions.method_40888(0.3F);
      int var19 = this.mc.gameOptions.method_40888(0.4F);

      for (Pair var21 : var8) {
         var17++;
         class_8274 var22 = (class_8274)var21.getFirst();
         ITextComponent var23 = (ITextComponent)var21.getSecond();
         String var24 = TextFormatting.RED + "" + var22.method_38146();
         int var25 = var29 - var17 * 9;
         int var26 = this.scaledWidth - 3 + 2;
         method_9774(var1, var31 - 2, var25, var26, var25 + 9, var18);
         this.getFontRenderer().method_45378(var1, var23, (float)var31, (float)var25, -1);
         this.getFontRenderer().method_45385(var1, var24, (float)(var26 - this.getFontRenderer().method_45395(var24)), (float)var25, -1);
         if (var17 == var6.size()) {
            method_9774(var1, var31 - 2, var25 - 9 - 1, var26, var25 - 1, var19);
            method_9774(var1, var31 - 2, var25 - 1, var26, var25, var18);
            this.getFontRenderer().method_45378(var1, var9, (float)(var31 + var11 / 2 - var10 / 2), (float)(var25 - 9), -1);
         }
      }
   }

   private PlayerEntity method_13976() {
      return this.mc.getRenderViewEntity() instanceof PlayerEntity ? (PlayerEntity)this.mc.getRenderViewEntity() : null;
   }

   private LivingEntity method_13981() {
      PlayerEntity var3 = this.method_13976();
      if (var3 != null) {
         Entity var4 = var3.getRidingEntity();
         if (var4 == null) {
            return null;
         }

         if (var4 instanceof LivingEntity) {
            return (LivingEntity)var4;
         }
      }

      return null;
   }

   private int method_13980(LivingEntity var1) {
      if (var1 != null && var1.method_37359()) {
         float var4 = var1.method_26465();
         int var5 = (int)(var4 + 0.5F) / 2;
         if (var5 > 30) {
            var5 = 30;
         }

         return var5;
      } else {
         return 0;
      }
   }

   private int method_13970(int var1) {
      return (int)Math.ceil((double)var1 / 10.0);
   }

   private void func_238457_e_(class_7966 var1) {
      PlayerEntity var4 = this.method_13976();
      if (var4 != null) {
         int var5 = MathHelper.ceil(var4.method_26551());
         boolean var6 = this.healthUpdateCounter > (long)this.ticks && (this.healthUpdateCounter - (long)this.ticks) / 3L % 2L == 1L;
         long var7 = Util.getMeasuringTimeMs();
         if (var5 < this.playerHealth && var4.field_41749 > 0) {
            this.lastSystemTime = var7;
            this.healthUpdateCounter = (long)(this.ticks + 20);
         } else if (var5 > this.playerHealth && var4.field_41749 > 0) {
            this.lastSystemTime = var7;
            this.healthUpdateCounter = (long)(this.ticks + 10);
         }

         if (var7 - this.lastSystemTime > 1000L) {
            this.playerHealth = var5;
            this.lastPlayerHealth = var5;
            this.lastSystemTime = var7;
         }

         this.playerHealth = var5;
         int var9 = this.lastPlayerHealth;
         this.rand.setSeed((long)(this.ticks * 312871));
         class_9163 var10 = var4.method_3161();
         int var11 = var10.method_42238();
         int var12 = this.scaledWidth / 2 - 91;
         int var13 = this.scaledWidth / 2 + 91;
         int var14 = this.scaledHeight - 39;
         float var15 = (float)var4.method_26575(Attributes.MAX_HEALTH);
         int var16 = MathHelper.ceil(var4.method_26493());
         int var17 = MathHelper.ceil((var15 + (float)var16) / 2.0F / 10.0F);
         int var18 = Math.max(10 - (var17 - 2), 3);
         int var19 = var14 - (var17 - 1) * var18 - 10;
         int var20 = var14 - 10;
         int var21 = var16;
         int var22 = var4.method_26565();
         int var23 = -1;
         if (var4.isPotionActive(Effects.field_19742)) {
            var23 = this.ticks % MathHelper.ceil(var15 + 5.0F);
         }

         this.mc.getProfiler().startSection("armor");

         for (int var24 = 0; var24 < 10; var24++) {
            if (var22 > 0) {
               int var25 = var12 + var24 * 8;
               if (var24 * 2 + 1 < var22) {
                  this.method_9781(var1, var25, var19, 34, 9, 9, 9);
               }

               if (var24 * 2 + 1 == var22) {
                  this.method_9781(var1, var25, var19, 25, 9, 9, 9);
               }

               if (var24 * 2 + 1 > var22) {
                  this.method_9781(var1, var25, var19, 16, 9, 9, 9);
               }
            }
         }

         this.mc.getProfiler().method_16050("health");

         for (int var33 = MathHelper.ceil((var15 + (float)var16) / 2.0F) - 1; var33 >= 0; var33--) {
            byte var35 = 16;
            if (!var4.isPotionActive(Effects.field_19718)) {
               if (var4.isPotionActive(Effects.field_19725)) {
                  var35 += 72;
               }
            } else {
               var35 += 36;
            }

            byte var26 = 0;
            if (var6) {
               var26 = 1;
            }

            int var27 = MathHelper.ceil((float)(var33 + 1) / 10.0F) - 1;
            int var28 = var12 + var33 % 10 * 8;
            int var29 = var14 - var27 * var18;
            if (var5 <= 4) {
               var29 += this.rand.nextInt(2);
            }

            if (var21 <= 0 && var33 == var23) {
               var29 -= 2;
            }

            byte var30 = 0;
            if (var4.world.method_43366().method_8659()) {
               var30 = 5;
            }

            this.method_9781(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
            if (var6) {
               if (var33 * 2 + 1 < var9) {
                  this.method_9781(var1, var28, var29, var35 + 54, 9 * var30, 9, 9);
               }

               if (var33 * 2 + 1 == var9) {
                  this.method_9781(var1, var28, var29, var35 + 63, 9 * var30, 9, 9);
               }
            }

            if (var21 <= 0) {
               if (var33 * 2 + 1 < var5) {
                  this.method_9781(var1, var28, var29, var35 + 36, 9 * var30, 9, 9);
               }

               if (var33 * 2 + 1 == var5) {
                  this.method_9781(var1, var28, var29, var35 + 45, 9 * var30, 9, 9);
               }
            } else if (var21 == var16 && var16 % 2 == 1) {
               this.method_9781(var1, var28, var29, var35 + 153, 9 * var30, 9, 9);
               var21--;
            } else {
               this.method_9781(var1, var28, var29, var35 + 144, 9 * var30, 9, 9);
               var21 -= 2;
            }
         }

         LivingEntity var34 = this.method_13981();
         int var36 = this.method_13980(var34);
         if (var36 == 0) {
            this.mc.getProfiler().method_16050("food");

            for (int var37 = 0; var37 < 10; var37++) {
               int var39 = var14;
               byte var41 = 16;
               byte var43 = 0;
               if (var4.isPotionActive(Effects.field_19747)) {
                  var41 += 36;
                  var43 = 13;
               }

               if (var4.method_3161().method_42237() <= 0.0F && this.ticks % (var11 * 3 + 1) == 0) {
                  var39 = var14 + (this.rand.nextInt(3) - 1);
               }

               int var45 = var13 - var37 * 8 - 9;
               this.method_9781(var1, var45, var39, 16 + var43 * 9, 27, 9, 9);
               if (var37 * 2 + 1 < var11) {
                  this.method_9781(var1, var45, var39, var41 + 36, 27, 9, 9);
               }

               if (var37 * 2 + 1 == var11) {
                  this.method_9781(var1, var45, var39, var41 + 45, 27, 9, 9);
               }
            }

            var20 -= 10;
         }

         this.mc.getProfiler().method_16050("air");
         int var38 = var4.method_37099();
         int var40 = Math.min(var4.method_37229(), var38);
         if (var4.method_37261(class_6503.field_33094) || var40 < var38) {
            int var42 = this.method_13970(var36) - 1;
            var20 -= var42 * 10;
            int var44 = MathHelper.ceil((double)(var40 - 2) * 10.0 / (double)var38);
            int var46 = MathHelper.ceil((double)var40 * 10.0 / (double)var38) - var44;

            for (int var31 = 0; var31 < var44 + var46; var31++) {
               if (var31 >= var44) {
                  this.method_9781(var1, var13 - var31 * 8 - 9, var20, 25, 18, 9, 9);
               } else {
                  this.method_9781(var1, var13 - var31 * 8 - 9, var20, 16, 18, 9, 9);
               }
            }
         }

         this.mc.getProfiler().endSection();
      }
   }

   private void func_238458_f_(class_7966 var1) {
      LivingEntity var4 = this.method_13981();
      if (var4 != null) {
         int var5 = this.method_13980(var4);
         if (var5 != 0) {
            int var6 = (int)Math.ceil((double)var4.method_26551());
            this.mc.getProfiler().method_16050("mountHealth");
            int var7 = this.scaledHeight - 39;
            int var8 = this.scaledWidth / 2 + 91;
            int var9 = var7;
            byte var10 = 0;

            for (boolean var11 = false; var5 > 0; var10 += 20) {
               int var12 = Math.min(var5, 10);
               var5 -= var12;

               for (int var13 = 0; var13 < var12; var13++) {
                  byte var14 = 52;
                  byte var15 = 0;
                  int var16 = var8 - var13 * 8 - 9;
                  this.method_9781(var1, var16, var9, 52 + var15 * 9, 9, 9, 9);
                  if (var13 * 2 + 1 + var10 < var6) {
                     this.method_9781(var1, var16, var9, 88, 9, 9, 9);
                  }

                  if (var13 * 2 + 1 + var10 == var6) {
                     this.method_9781(var1, var16, var9, 97, 9, 9, 9);
                  }
               }

               var9 -= 10;
            }
         }
      }
   }

   private void renderPumpkinOverlay() {
      RenderSystem.method_16491();
      RenderSystem.method_16387(false);
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method_16458();
      this.mc.getTextureManager().bindTexture(PUMPKIN_BLUR_TEX_PATH);
      class_8042 var3 = class_8042.method_36499();
      class_9633 var4 = var3.method_36501();
      var4.method_44471(7, class_7985.field_40912);
      var4.method_35761(0.0, (double)this.scaledHeight, -90.0).method_35745(0.0F, 1.0F).method_35735();
      var4.method_35761((double)this.scaledWidth, (double)this.scaledHeight, -90.0).method_35745(1.0F, 1.0F).method_35735();
      var4.method_35761((double)this.scaledWidth, 0.0, -90.0).method_35745(1.0F, 0.0F).method_35735();
      var4.method_35761(0.0, 0.0, -90.0).method_35745(0.0F, 0.0F).method_35735();
      var3.method_36500();
      RenderSystem.method_16387(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableAlphaTest();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void method_14006(Entity var1) {
      if (var1 != null) {
         float var4 = MathHelper.clamp(1.0F - var1.method_37193(), 0.0F, 1.0F);
         this.prevVignetteBrightness = (float)((double)this.prevVignetteBrightness + (double)(var4 - this.prevVignetteBrightness) * 0.01);
      }
   }

   private void renderVignette(Entity var1) {
      if (Config.isVignetteEnabled()) {
         class_2098 var4 = this.mc.theWorld.method_6673();
         float var5 = (float)var4.method_9809(var1);
         double var6 = Math.min(var4.method_9806() * (double)var4.method_9812() * 1000.0, Math.abs(var4.method_9817() - var4.method_9824()));
         double var8 = Math.max((double)var4.method_9819(), var6);
         if (!((double)var5 < var8)) {
            var5 = 0.0F;
         } else {
            var5 = 1.0F - (float)((double)var5 / var8);
         }

         RenderSystem.method_16491();
         RenderSystem.method_16387(false);
         RenderSystem.method_16425(class_5033.field_26048, class_8535.field_43686, class_5033.field_26047, class_8535.field_43699);
         if (!(var5 > 0.0F)) {
            RenderSystem.color4f(this.prevVignetteBrightness, this.prevVignetteBrightness, this.prevVignetteBrightness, 1.0F);
         } else {
            RenderSystem.color4f(0.0F, var5, var5, 1.0F);
         }

         this.mc.getTextureManager().bindTexture(VIGNETTE_TEX_PATH);
         class_8042 var10 = class_8042.method_36499();
         class_9633 var11 = var10.method_36501();
         var11.method_44471(7, class_7985.field_40912);
         var11.method_35761(0.0, (double)this.scaledHeight, -90.0).method_35745(0.0F, 1.0F).method_35735();
         var11.method_35761((double)this.scaledWidth, (double)this.scaledHeight, -90.0).method_35745(1.0F, 1.0F).method_35735();
         var11.method_35761((double)this.scaledWidth, 0.0, -90.0).method_35745(1.0F, 0.0F).method_35735();
         var11.method_35761(0.0, 0.0, -90.0).method_35745(0.0F, 0.0F).method_35735();
         var10.method_36500();
         RenderSystem.method_16387(true);
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.defaultBlendFunc();
      } else {
         RenderSystem.enableDepthTest();
         RenderSystem.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      }
   }

   private void renderPortal(float var1) {
      if (var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      RenderSystem.method_16458();
      RenderSystem.method_16491();
      RenderSystem.method_16387(false);
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var1);
      this.mc.getTextureManager().bindTexture(class_8359.field_42824);
      class_5155 var4 = this.mc.method_8505().method_3716().method_43938(class_4783.field_23588.method_29260());
      float var5 = var4.method_23630();
      float var6 = var4.method_23642();
      float var7 = var4.method_23619();
      float var8 = var4.method_23640();
      class_8042 var9 = class_8042.method_36499();
      class_9633 var10 = var9.method_36501();
      var10.method_44471(7, class_7985.field_40912);
      var10.method_35761(0.0, (double)this.scaledHeight, -90.0).method_35745(var5, var8).method_35735();
      var10.method_35761((double)this.scaledWidth, (double)this.scaledHeight, -90.0).method_35745(var7, var8).method_35735();
      var10.method_35761((double)this.scaledWidth, 0.0, -90.0).method_35745(var7, var6).method_35735();
      var10.method_35761(0.0, 0.0, -90.0).method_35745(var5, var6).method_35735();
      var9.method_36500();
      RenderSystem.method_16387(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableAlphaTest();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void method_13984(int var1, int var2, float var3, PlayerEntity var4, ItemStack var5) {
      if (!var5.method_28022()) {
         float var8 = (float)var5.method_27975() - var3;
         if (var8 > 0.0F) {
            RenderSystem.method_16438();
            float var9 = 1.0F + var8 / 5.0F;
            RenderSystem.method_16413((float)(var1 + 8), (float)(var2 + 12), 0.0F);
            RenderSystem.method_16403(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
            RenderSystem.method_16413((float)(-(var1 + 8)), (float)(-(var2 + 12)), 0.0F);
         }

         this.itemRenderer.method_40273(var4, var5, var1, var2);
         if (var8 > 0.0F) {
            RenderSystem.method_16489();
         }

         this.itemRenderer.method_40281(this.mc.textRenderer, var5, var1, var2);
      }
   }

   public void method_13990() {
      if (this.mc.theWorld == null) {
         class_4454.method_20652();
      }

      if (this.overlayMessageTime > 0) {
         this.overlayMessageTime--;
      }

      if (this.titlesTimer > 0) {
         this.titlesTimer--;
         if (this.titlesTimer <= 0) {
            this.displayedTitle = null;
            this.displayedSubTitle = null;
         }
      }

      this.ticks++;
      Entity var3 = this.mc.getRenderViewEntity();
      if (var3 != null) {
         this.method_14006(var3);
      }

      if (this.mc.thePlayer != null) {
         ItemStack var4 = this.mc.thePlayer.inventory.method_32403();
         boolean var5 = true;
         if (class_7860.field_40201.method_3596()) {
            ITextComponent var6 = (ITextComponent)class_7860.method_35555(var4, class_7860.field_40201, var4.method_28008());
            ITextComponent var7 = (ITextComponent)class_7860.method_35555(this.highlightingItemStack, class_7860.field_40201, this.highlightingItemStack.method_28008());
            var5 = Config.equals(var6, var7);
         }

         if (!var4.method_28022()) {
            if (this.highlightingItemStack.method_28022()
               || var4.method_27960() != this.highlightingItemStack.method_27960()
               || !var4.method_28008().equals(this.highlightingItemStack.method_28008())
               || !var5) {
               this.remainingHighlightTicks = 40;
            } else if (this.remainingHighlightTicks > 0) {
               this.remainingHighlightTicks--;
            }
         } else {
            this.remainingHighlightTicks = 0;
         }

         this.highlightingItemStack = var4;
      }
   }

   public void method_13974(ITextComponent var1) {
      this.method_13982(new TranslationTextComponent("record.nowPlaying", var1), true);
   }

   public void method_13982(ITextComponent var1, boolean var2) {
      this.overlayMessage = var1;
      this.overlayMessageTime = 60;
      this.animateOverlayMessageColor = var2;
   }

   public void method_14002(ITextComponent var1, ITextComponent var2, int var3, int var4, int var5) {
      if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
         this.displayedTitle = null;
         this.displayedSubTitle = null;
         this.titlesTimer = 0;
      } else if (var1 == null) {
         if (var2 == null) {
            if (var3 >= 0) {
               this.titleFadeIn = var3;
            }

            if (var4 >= 0) {
               this.titleDisplayTime = var4;
            }

            if (var5 >= 0) {
               this.titleFadeOut = var5;
            }

            if (this.titlesTimer > 0) {
               this.titlesTimer = this.titleFadeIn + this.titleDisplayTime + this.titleFadeOut;
            }
         } else {
            this.displayedSubTitle = var2;
         }
      } else {
         this.displayedTitle = var1;
         this.titlesTimer = this.titleFadeIn + this.titleDisplayTime + this.titleFadeOut;
      }
   }

   public UUID method_13986(ITextComponent var1) {
      String var4 = TextProcessing.func_244782_a(var1);
      String var5 = StringUtils.substringBetween(var4, "<", ">");
      return var5 != null ? this.mc.method_8586().method_42342(var5) : Util.NIL_UUID;
   }

   public void method_13992(ChatType var1, ITextComponent var2, UUID var3) {
      if (!this.mc.method_8526(var3) && (!this.mc.gameOptions.field_45405 || !this.mc.method_8526(this.method_13986(var2)))) {
         for (IChatListener var7 : this.chatListeners.get(var1)) {
            var7.method_44914(var1, var2, var3);
         }
      }
   }

   public NewChatGui method_13991() {
      return this.persistantChatGUI;
   }

   public int method_13995() {
      return this.ticks;
   }

   public TextRenderer getFontRenderer() {
      return this.mc.textRenderer;
   }

   public SpectatorGui method_14004() {
      return this.spectatorGui;
   }

   public PlayerTabOverlayGui method_13985() {
      return this.overlayPlayerList;
   }

   public void method_13988() {
      this.overlayPlayerList.method_9937();
      this.overlayBoss.method_21873();
      this.mc.method_8519().method_42332();
   }

   public BossOverlayGui method_13972() {
      return this.overlayBoss;
   }

   public void method_13978() {
      this.overlayDebug.method_17995();
   }
}
