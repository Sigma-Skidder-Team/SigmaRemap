package net.minecraft.client.gui;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventRenderGUI;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.util.Util;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.*;
import net.minecraft.world.GameType;
import net.optifine.Config;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class IngameGui extends AbstractGui {
    private static final ResourceLocation field6711 = new ResourceLocation("textures/misc/vignette.png");
    private static final ResourceLocation field6712 = new ResourceLocation("textures/gui/widgets.png");
    private static final ResourceLocation field6713 = new ResourceLocation("textures/misc/pumpkinblur.png");
    private static final ITextComponent field6714 = new TranslationTextComponent("demo.demoExpired");
    private final Random field6715 = new Random();
    private final Minecraft field6716;
    private final ItemRenderer field6717;
    private final Class1266 field6718;
    private int field6719;
    private ITextComponent field6720;
    private int field6721;
    private boolean field6722;
    public float field6723 = 1.0F;
    private int field6724;
    private ItemStack field6725 = ItemStack.EMPTY;
    public final DebugOverlayGui field6726;
    private final Class1269 field6727;
    private final Class1195 field6728;
    private final Class1265 field6729;
    private final Class1267 field6730;
    private int field6731;
    private ITextComponent field6732;
    private ITextComponent field6733;
    private int field6734;
    private int field6735;
    private int field6736;
    private int field6737;
    private int field6738;
    private long field6739;
    private long field6740;
    private int field6741;
    private int field6742;
    private final Map<ChatType, List<Class6687>> field6743 = Maps.newHashMap();

    public IngameGui(Minecraft var1) {
        this.field6716 = var1;
        this.field6717 = var1.getItemRenderer();
        this.field6726 = new DebugOverlayGui(var1);
        this.field6728 = new Class1195(var1);
        this.field6718 = new Class1266(var1);
        this.field6729 = new Class1265(var1, this);
        this.field6730 = new Class1267(var1);
        this.field6727 = new Class1269(var1);

        for (ChatType var7 : ChatType.values()) {
            this.field6743.put(var7, Lists.newArrayList());
        }

        NarratorChatListener var8 = NarratorChatListener.INSTANCE;
        this.field6743.get(ChatType.CHAT).add(new Class6686(var1));
        this.field6743.get(ChatType.CHAT).add(var8);
        this.field6743.get(ChatType.SYSTEM).add(new Class6686(var1));
        this.field6743.get(ChatType.SYSTEM).add(var8);
        this.field6743.get(ChatType.GAME_INFO).add(new Class6689(var1));
        this.method5960();
    }

    public void method5960() {
        this.field6734 = 10;
        this.field6735 = 70;
        this.field6736 = 20;
    }

    public void method5961(MatrixStack var1, float var2) {
        this.field6741 = this.field6716.getMainWindow().getScaledWidth();
        this.field6742 = this.field6716.getMainWindow().getScaledHeight();
        FontRenderer var5 = this.method5991();
        RenderSystem.enableBlend();
        if (!Config.method26883()) {
            RenderSystem.enableDepthTest();
            RenderSystem.defaultBlendFunc();
        } else {
            this.method5980(this.field6716.getRenderViewEntity());
        }

        Client.getInstance().method19926();
        ItemStack var6 = this.field6716.player.inventory.method4052(3);
        if (this.field6716.gameSettings.getPointOfView().func_243192_a() && var6.getItem() == Blocks.field36589.method11581()) {
            this.method5978();
        }

        float var7 = MathHelper.lerp(var2, this.field6716.player.prevTimeInPortal, this.field6716.player.timeInPortal);
        if (var7 > 0.0F && !this.field6716.player.isPotionActive(Effects.NAUSEA)) {
            this.method5981(var7);
        }

        if (this.field6716.playerController.getCurrentGameType() != GameType.SPECTATOR) {
            if (!this.field6716.gameSettings.hideGUI) {
                this.method5966(var2, var1);
            }
        } else {
            this.field6728.method5720(var1, var2);
        }

        if (!this.field6716.gameSettings.hideGUI) {
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6453);
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            this.method5963(var1);
            GlStateManager.enableAlphaTest();
            RenderSystem.defaultBlendFunc();
            this.field6716.getProfiler().startSection("bossHealth");
            this.field6730.method5953(var1);
            this.field6716.getProfiler().endSection();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6453);
            if (this.field6716.playerController.shouldDrawHUD()) {
                this.method5976(var1);
            }

            this.method5977(var1);
            RenderSystem.disableBlend();
            int var8 = this.field6741 / 2 - 91;
            if (!this.field6716.player.method5405()) {
                if (this.field6716.playerController.gameIsSurvivalOrAdventure()) {
                    this.method5968(var1, var8);
                }
            } else {
                this.method5967(var1, var8);
            }

            if (this.field6716.gameSettings.field44594 && this.field6716.playerController.getCurrentGameType() != GameType.SPECTATOR) {
                this.method5969(var1);
            } else if (this.field6716.player.isSpectator()) {
                this.field6728.method5723(var1);
            }
        }

        if (this.field6716.player.method2910() > 0) {
            this.field6716.getProfiler().startSection("sleep");
            RenderSystem.disableDepthTest();
            RenderSystem.disableAlphaTest();
            float var14 = (float) this.field6716.player.method2910();
            float var9 = var14 / 100.0F;
            if (var9 > 1.0F) {
                var9 = 1.0F - (var14 - 100.0F) / 10.0F;
            }

            int var10 = (int) (220.0F * var9) << 24 | 1052704;
            fill(var1, 0, 0, this.field6741, this.field6742, var10);
            RenderSystem.enableAlphaTest();
            RenderSystem.enableDepthTest();
            this.field6716.getProfiler().endSection();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        }

        if (this.field6716.isDemo()) {
            this.method5970(var1);
        }

        this.method5965(var1);
        if (this.field6716.gameSettings.showDebugInfo) {
            this.field6726.render(var1);
        }

        if (!this.field6716.gameSettings.hideGUI) {
            if (this.field6720 != null && this.field6721 > 0) {
                this.field6716.getProfiler().startSection("overlayMessage");
                float var15 = (float) this.field6721 - var2;
                int var18 = (int) (var15 * 255.0F / 20.0F);
                if (var18 > 255) {
                    var18 = 255;
                }

                if (var18 > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 - 68), 0.0F);
                    RenderSystem.enableBlend();
                    RenderSystem.defaultBlendFunc();
                    int var22 = 16777215;
                    if (this.field6722) {
                        var22 = MathHelper.method37818(var15 / 50.0F, 0.7F, 0.6F) & 16777215;
                    }

                    int var11 = var18 << 24 & 0xFF000000;
                    int var12 = var5.method38821(this.field6720);
                    this.method5962(var1, var5, -4, var12, 16777215 | var11);
                    var5.func_243248_b(var1, this.field6720, (float) (-var12 / 2), -4.0F, var22 | var11);
                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }

                this.field6716.getProfiler().endSection();
            }

            if (this.field6732 != null && this.field6731 > 0) {
                this.field6716.getProfiler().startSection("titleAndSubtitle");
                float var16 = (float) this.field6731 - var2;
                int var19 = 255;
                if (this.field6731 > this.field6736 + this.field6735) {
                    float var23 = (float) (this.field6734 + this.field6735 + this.field6736) - var16;
                    var19 = (int) (var23 * 255.0F / (float) this.field6734);
                }

                if (this.field6731 <= this.field6736) {
                    var19 = (int) (var16 * 255.0F / (float) this.field6736);
                }

                var19 = MathHelper.clamp(var19, 0, 255);
                if (var19 > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 / 2), 0.0F);
                    RenderSystem.enableBlend();
                    RenderSystem.defaultBlendFunc();
                    RenderSystem.pushMatrix();
                    RenderSystem.scalef(4.0F, 4.0F, 4.0F);
                    int var24 = var19 << 24 & 0xFF000000;
                    int var26 = var5.method38821(this.field6732);
                    this.method5962(var1, var5, -10, var26, 16777215 | var24);
                    var5.method38803(var1, this.field6732, (float) (-var26 / 2), -10.0F, 16777215 | var24);
                    RenderSystem.popMatrix();
                    if (this.field6733 != null) {
                        RenderSystem.pushMatrix();
                        RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                        int var30 = var5.method38821(this.field6733);
                        this.method5962(var1, var5, 5, var30, 16777215 | var24);
                        var5.method38803(var1, this.field6733, (float) (-var30 / 2), 5.0F, 16777215 | var24);
                        RenderSystem.popMatrix();
                    }

                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }

                this.field6716.getProfiler().endSection();
            }

            this.field6727.method5999(var1);
            Scoreboard var17 = this.field6716.world.method6805();
            Class8375 var21 = null;
            ScorePlayerTeam var25 = var17.method20998(this.field6716.player.method2956());
            if (var25 != null) {
                int var27 = var25.getColor().getColorIndex();
                if (var27 >= 0) {
                    var21 = var17.method20989(3 + var27);
                }
            }

            Class8375 var28 = var21 == null ? var17.method20989(1) : var21;
            if (var28 != null) {
                EventRenderGUI var31 = new EventRenderGUI(true);
                Client.getInstance().getEventManager().call(var31);
                if (var31.isCancelled()) {
                    return;
                }

                this.method5971(var1, var28);
                EventRenderGUI var13 = new EventRenderGUI(false);
                Client.getInstance().getEventManager().call(var13);
            }

            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableAlphaTest();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0F, (float) (this.field6742 - 48), 0.0F);
            this.field6716.getProfiler().startSection("chat");
            this.field6718.method5926(var1, this.field6719);
            this.field6716.getProfiler().endSection();
            RenderSystem.popMatrix();
            var28 = var17.method20989(0);
            if (this.field6716.gameSettings.keyBindTablist.isKeyDown()
                    && (!this.field6716.isIntegratedServerRunning() || this.field6716.player.connection.method15790().size() > 1 || var28 != null)) {
                this.field6729.method5919(true);
                this.field6729.method5920(var1, this.field6741, var17, var28);
            } else {
                this.field6729.method5919(false);
            }
        }

        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.enableAlphaTest();
    }

    private void method5962(MatrixStack var1, FontRenderer var2, int var3, int var4, int var5) {
        int var8 = this.field6716.gameSettings.method37140(0.0F);
        if (var8 != 0) {
            int var9 = -var4 / 2;
            fill(var1, var9 - 2, var3 - 2, var9 + var4 + 2, var3 + 9 + 2, Class9470.method36521(var8, var5));
        }
    }

    private void method5963(MatrixStack var1) {
        GameSettings var4 = this.field6716.gameSettings;
        if (var4.getPointOfView().func_243192_a() && (this.field6716.playerController.getCurrentGameType() != GameType.SPECTATOR || this.method5964(this.field6716.objectMouseOver))) {
            if (var4.showDebugInfo && !var4.hideGUI && !this.field6716.player.hasReducedDebug() && !var4.reducedDebugInfo) {
                RenderSystem.pushMatrix();
                RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 / 2), (float) this.method5702());
                ActiveRenderInfo var11 = this.field6716.gameRenderer.getActiveRenderInfo();
                RenderSystem.rotatef(var11.getPitch(), -1.0F, 0.0F, 0.0F);
                RenderSystem.rotatef(var11.getYaw(), 0.0F, 1.0F, 0.0F);
                RenderSystem.scalef(-1.0F, -1.0F, -1.0F);
                RenderSystem.renderCrosshair(10);
                RenderSystem.popMatrix();
            } else {
                RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR, DestFactor.field12933, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
                this.blit(var1, (this.field6741 - 15) / 2, (this.field6742 - 15) / 2, 0, 0, 15, 15);
                if (this.field6716.gameSettings.field44603 == Class2207.field14426) {
                    float var6 = this.field6716.player.getCooledAttackStrength(0.0F);
                    boolean var7 = false;
                    if (this.field6716.pointedEntity != null && this.field6716.pointedEntity instanceof LivingEntity && var6 >= 1.0F) {
                        var7 = this.field6716.player.method2973() > 5.0F;
                        var7 &= this.field6716.pointedEntity.isAlive();
                    }

                    int var8 = this.field6742 / 2 - 7 + 16;
                    int var9 = this.field6741 / 2 - 8;
                    if (!var7) {
                        if (var6 < 1.0F) {
                            int var10 = (int) (var6 * 17.0F);
                            this.blit(var1, var9, var8, 36, 94, 16, 4);
                            this.blit(var1, var9, var8, 52, 94, var10, 4);
                        }
                    } else {
                        this.blit(var1, var9, var8, 68, 94, 16, 16);
                    }
                }
            }
        }
    }

    private boolean method5964(RayTraceResult var1) {
        if (var1 != null) {
            if (var1.getType() != RayTraceResult.Type.ENTITY) {
                if (var1.getType() != RayTraceResult.Type.BLOCK) {
                    return false;
                } else {
                    BlockPos var4 = ((BlockRayTraceResult) var1).getPos();
                    ClientWorld var5 = this.field6716.world;
                    return var5.getBlockState(var4).method23445(var5, var4) != null;
                }
            } else {
                return ((EntityRayTraceResult) var1).getEntity() instanceof Class949;
            }
        } else {
            return false;
        }
    }

    public void method5965(MatrixStack var1) {
        Collection<EffectInstance> var4 = this.field6716.player.getActivePotionEffects();
        if (!var4.isEmpty()) {
            RenderSystem.enableBlend();
            int var5 = 0;
            int var6 = 0;
            PotionSpriteUploader var7 = this.field6716.getPotionSpriteUploader();
            List<Runnable> var8 = Lists.newArrayListWithExpectedSize(var4.size());
            this.field6716.getTextureManager().bindTexture(ContainerScreen.INVENTORY_BACKGROUND);

            for (EffectInstance var10 : Ordering.natural().reverse().sortedCopy(var4)) {
                Effect var11 = var10.getPotion();
                if (Reflector.field42935.exists()) {
                    if (!Reflector.method35064(var10, Reflector.field42935)) {
                        continue;
                    }

                    this.field6716.getTextureManager().bindTexture(ContainerScreen.INVENTORY_BACKGROUND);
                }

                if (var10.method8632()) {
                    int var12 = this.field6741;
                    int var13 = 1;
                    if (this.field6716.isDemo()) {
                        var13 += 15;
                    }

                    if (!var11.isBeneficial()) {
                        var6++;
                        var12 -= 25 * var6;
                        var13 += 26;
                    } else {
                        var5++;
                        var12 -= 25 * var5;
                    }

                    RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                    float var14 = 1.0F;
                    if (!var10.isAmbient()) {
                        this.blit(var1, var12, var13, 141, 166, 24, 24);
                        if (var10.method8628() <= 200) {
                            int var15 = 10 - var10.method8628() / 20;
                            var14 = MathHelper.clamp((float) var10.method8628() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                                    + MathHelper.cos((float) var10.method8628() * (float) Math.PI / 5.0F)
                                    * MathHelper.clamp((float) var15 / 10.0F * 0.25F, 0.0F, 0.25F);
                        }
                    } else {
                        this.blit(var1, var12, var13, 165, 166, 24, 24);
                    }

                    TextureAtlasSprite var20 = var7.method1022(var11);
                    int var16 = var12;
                    int var17 = var13;
                    float var18 = var14;
                    var8.add(() -> {
                        this.field6716.getTextureManager().bindTexture(var20.getAtlasTexture().getTextureLocation());
                        RenderSystem.color4f(1.0F, 1.0F, 1.0F, var18);
                        method5695(var1, var16 + 3, var17 + 3, this.method5702(), 18, 18, var20);
                    });
                    if (Reflector.field42936.exists()) {
                        Reflector.call(var10, Reflector.field42936, this, var1, var12, Integer.valueOf(var13), this.method5702(), var14);
                    }
                }
            }

            var8.forEach(Runnable::run);
        }
    }

    public void method5966(float var1, MatrixStack var2) {
        PlayerEntity var5 = this.method5972();
        if (var5 != null) {
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6712);
            ItemStack var6 = var5.getHeldItemOffhand();
            HandSide var7 = var5.getPrimaryHand().opposite();
            int var8 = this.field6741 / 2;
            int var9 = this.method5702();
            this.method5703(-90);
            this.blit(var2, var8 - 91, this.field6742 - 22, 0, 0, 182, 22);
            this.blit(var2, var8 - 91 - 1 + var5.inventory.currentItem * 20, this.field6742 - 22 - 1, 0, 22, 24, 22);
            if (!var6.isEmpty()) {
                if (var7 != HandSide.LEFT) {
                    this.blit(var2, var8 + 91, this.field6742 - 23, 53, 22, 29, 24);
                } else {
                    this.blit(var2, var8 - 91 - 29, this.field6742 - 23, 24, 22, 29, 24);
                }
            }

            this.method5703(var9);
            RenderSystem.enableRescaleNormal();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            Class7992.method27282(false);

            for (int var12 = 0; var12 < 9; var12++) {
                int var13 = var8 - 90 + var12 * 20 + 2;
                int var14 = this.field6742 - 16 - 3;
                this.method5982(var13, var14, var1, var5, var5.inventory.field5439.get(var12));
            }

            if (!var6.isEmpty()) {
                Class7992.method27282(true);
                int var16 = this.field6742 - 16 - 3;
                if (var7 != HandSide.LEFT) {
                    this.method5982(var8 + 91 + 10, var16, var1, var5, var6);
                } else {
                    this.method5982(var8 - 91 - 26, var16, var1, var5, var6);
                }

                Class7992.method27282(false);
            }

            if (this.field6716.gameSettings.field44603 == Class2207.field14427) {
                float var17 = this.field6716.player.getCooledAttackStrength(0.0F);
                if (var17 < 1.0F) {
                    int var18 = this.field6742 - 20;
                    int var19 = var8 + 91 + 6;
                    if (var7 == HandSide.RIGHT) {
                        var19 = var8 - 91 - 22;
                    }

                    this.field6716.getTextureManager().bindTexture(AbstractGui.field6453);
                    int var15 = (int) (var17 * 19.0F);
                    RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                    this.blit(var2, var19, var18, 0, 94, 18, 18);
                    this.blit(var2, var19, var18 + 18 - var15, 18, 112 - var15, 18, var15);
                }
            }

            RenderSystem.disableRescaleNormal();
            RenderSystem.disableBlend();
        }
    }

    public void method5967(MatrixStack var1, int var2) {
        this.field6716.getProfiler().startSection("jumpBar");
        this.field6716.getTextureManager().bindTexture(AbstractGui.field6453);
        float var5 = this.field6716.player.method5406();
        int var7 = (int) (var5 * 183.0F);
        int var8 = this.field6742 - 32 + 3;
        this.blit(var1, var2, var8, 0, 84, 182, 5);
        if (var7 > 0) {
            this.blit(var1, var2, var8, 0, 89, var7, 5);
        }

        this.field6716.getProfiler().endSection();
    }

    public void method5968(MatrixStack var1, int var2) {
        this.field6716.getProfiler().startSection("expBar");
        this.field6716.getTextureManager().bindTexture(AbstractGui.field6453);
        int var5 = this.field6716.player.method2930();
        if (var5 > 0) {
            int var7 = (int) (this.field6716.player.field4922 * 183.0F);
            int var8 = this.field6742 - 32 + 3;
            this.blit(var1, var2, var8, 0, 64, 182, 5);
            if (var7 > 0) {
                this.blit(var1, var2, var8, 0, 69, var7, 5);
            }
        }

        this.field6716.getProfiler().endSection();
        if (this.field6716.player.field4920 > 0) {
            this.field6716.getProfiler().startSection("expLevel");
            int var10 = 8453920;
            if (Config.method26911()) {
                var10 = Class9680.method37898(var10);
            }

            String var11 = "" + this.field6716.player.field4920;
            int var12 = (this.field6741 - this.method5991().getStringWidth(var11)) / 2;
            int var9 = this.field6742 - 31 - 4;
            this.method5991().method38801(var1, var11, (float) (var12 + 1), (float) var9, 0);
            this.method5991().method38801(var1, var11, (float) (var12 - 1), (float) var9, 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) (var9 + 1), 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) (var9 - 1), 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) var9, var10);
            this.field6716.getProfiler().endSection();
        }
    }

    public void method5969(MatrixStack var1) {
        this.field6716.getProfiler().startSection("selectedItemName");
        if (this.field6724 > 0 && !this.field6725.isEmpty()) {
            IFormattableTextComponent var4 = new StringTextComponent("").append(this.field6725.method32149()).mergeStyle(this.field6725.method32160().field12889);
            if (this.field6725.method32152()) {
                var4.mergeStyle(TextFormatting.ITALIC);
            }

            Object var5 = var4;
            if (Reflector.field42924.exists()) {
                var5 = (ITextComponent) Reflector.call(this.field6725, Reflector.field42924, var4);
            }

            int var6 = this.method5991().method38821((ITextProperties) var5);
            int var7 = (this.field6741 - var6) / 2;
            int var8 = this.field6742 - 59;
            if (!this.field6716.playerController.shouldDrawHUD()) {
                var8 += 14;
            }

            int var9 = (int) ((float) this.field6724 * 256.0F / 10.0F);
            if (var9 > 255) {
                var9 = 255;
            }

            if (var9 > 0) {
                RenderSystem.pushMatrix();
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                fill(var1, var7 - 2, var8 - 2, var7 + var6 + 2, var8 + 9 + 2, this.field6716.gameSettings.method37141(0));
                FontRenderer var10 = null;
                if (Reflector.field42912.exists()) {
                    var10 = (FontRenderer) Reflector.call(this.field6725.getItem(), Reflector.field42912, this.field6725);
                }

                if (var10 == null) {
                    this.method5991().method38803(var1, (ITextComponent) var5, (float) var7, (float) var8, 16777215 + (var9 << 24));
                } else {
                    var6 = (this.field6741 - var10.method38821((ITextProperties) var5)) / 2;
                    var10.method38804(var1, ((ITextComponent) var5).func_241878_f(), (float) var7, (float) var8, 16777215 + (var9 << 24));
                }

                RenderSystem.disableBlend();
                RenderSystem.popMatrix();
            }
        }

        this.field6716.getProfiler().endSection();
    }

    public void method5970(MatrixStack var1) {
        this.field6716.getProfiler().startSection("demo");
        Object var4;
        if (this.field6716.world.getGameTime() < 120500L) {
            var4 = new TranslationTextComponent("demo.remainingTime", Class9001.method33254((int) (120500L - this.field6716.world.getGameTime())));
        } else {
            var4 = field6714;
        }

        int var5 = this.method5991().method38821((ITextProperties) var4);
        this.method5991().method38803(var1, (ITextComponent) var4, (float) (this.field6741 - var5 - 10), 5.0F, 16777215);
        this.field6716.getProfiler().endSection();
    }

    private void method5971(MatrixStack var1, Class8375 var2) {
        Scoreboard var5 = var2.method29335();
        Collection<Class9411> var6 = var5.method20981(var2);
        List var7 = var6.stream().filter(var0 -> var0.method36054() != null && !var0.method36054().startsWith("#")).collect(Collectors.toList());
        if (var7.size() <= 15) {
            var6 = var7;
        } else {
            var6 = Lists.newArrayList(Iterables.skip(var7, var6.size() - 15));
        }

        List<Pair> var8 = Lists.newArrayListWithCapacity(var6.size());
        ITextComponent var9 = var2.method29338();
        int var10 = this.method5991().method38821(var9);
        int var11 = var10;
        int var12 = this.method5991().getStringWidth(": ");

        for (Class9411 var14 : var6) {
            ScorePlayerTeam var15 = var5.method20998(var14.method36054());
            IFormattableTextComponent var16 = ScorePlayerTeam.method28577(var15, new StringTextComponent(var14.method36054()));
            var8.add(Pair.of(var14, var16));
            var11 = Math.max(var11, this.method5991().method38821(var16) + var12 + this.method5991().getStringWidth(Integer.toString(var14.method36050())));
        }

        int var28 = var6.size() * 9;
        int var29 = this.field6742 / 2 + var28 / 3;
        int var31 = this.field6741 - var11 - 3;
        int var17 = 0;
        int var18 = this.field6716.gameSettings.method37140(0.3F);
        int var19 = this.field6716.gameSettings.method37140(0.4F);

        for (Pair var21 : var8) {
            var17++;
            Class9411 var22 = (Class9411) var21.getFirst();
            ITextComponent var23 = (ITextComponent) var21.getSecond();
            String var24 = TextFormatting.RED + "" + var22.method36050();
            int var25 = var29 - var17 * 9;
            int var26 = this.field6741 - 3 + 2;
            fill(var1, var31 - 2, var25, var26, var25 + 9, var18);
            this.method5991().func_243248_b(var1, var23, (float) var31, (float) var25, -1);
            this.method5991().method38801(var1, var24, (float) (var26 - this.method5991().getStringWidth(var24)), (float) var25, -1);
            if (var17 == var6.size()) {
                fill(var1, var31 - 2, var25 - 9 - 1, var26, var25 - 1, var19);
                fill(var1, var31 - 2, var25 - 1, var26, var25, var18);
                this.method5991().func_243248_b(var1, var9, (float) (var31 + var11 / 2 - var10 / 2), (float) (var25 - 9), -1);
            }
        }
    }

    private PlayerEntity method5972() {
        return this.field6716.getRenderViewEntity() instanceof PlayerEntity ? (PlayerEntity) this.field6716.getRenderViewEntity() : null;
    }

    private LivingEntity method5973() {
        PlayerEntity var3 = this.method5972();
        if (var3 != null) {
            Entity var4 = var3.getRidingEntity();
            if (var4 == null) {
                return null;
            }

            if (var4 instanceof LivingEntity) {
                return (LivingEntity) var4;
            }
        }

        return null;
    }

    private int method5974(LivingEntity var1) {
        if (var1 != null && var1.method3312()) {
            float var4 = var1.method3075();
            int var5 = (int) (var4 + 0.5F) / 2;
            if (var5 > 30) {
                var5 = 30;
            }

            return var5;
        } else {
            return 0;
        }
    }

    private int method5975(int var1) {
        return (int) Math.ceil((double) var1 / 10.0);
    }

    private void method5976(MatrixStack var1) {
        PlayerEntity var4 = this.method5972();
        if (var4 != null) {
            int var5 = MathHelper.ceil(var4.getHealth());
            boolean var6 = this.field6740 > (long) this.field6719 && (this.field6740 - (long) this.field6719) / 3L % 2L == 1L;
            long var7 = Util.milliTime();
            if (var5 < this.field6737 && var4.hurtResistantTime > 0) {
                this.field6739 = var7;
                this.field6740 = (long) (this.field6719 + 20);
            } else if (var5 > this.field6737 && var4.hurtResistantTime > 0) {
                this.field6739 = var7;
                this.field6740 = (long) (this.field6719 + 10);
            }

            if (var7 - this.field6739 > 1000L) {
                this.field6737 = var5;
                this.field6738 = var5;
                this.field6739 = var7;
            }

            this.field6737 = var5;
            int var9 = this.field6738;
            this.field6715.setSeed((long) (this.field6719 * 312871));
            FoodStats var10 = var4.getFoodStats();
            int var11 = var10.getFoodLevel();
            int var12 = this.field6741 / 2 - 91;
            int var13 = this.field6741 / 2 + 91;
            int var14 = this.field6742 - 39;
            float var15 = (float) var4.getAttributeValue(Attributes.MAX_HEALTH);
            int var16 = MathHelper.ceil(var4.getAbsorptionAmount());
            int var17 = MathHelper.ceil((var15 + (float) var16) / 2.0F / 10.0F);
            int var18 = Math.max(10 - (var17 - 2), 3);
            int var19 = var14 - (var17 - 1) * var18 - 10;
            int var20 = var14 - 10;
            int var21 = var16;
            int var22 = var4.method3070();
            int var23 = -1;
            if (var4.isPotionActive(Effects.REGENERATION)) {
                var23 = this.field6719 % MathHelper.ceil(var15 + 5.0F);
            }

            this.field6716.getProfiler().startSection("armor");

            for (int var24 = 0; var24 < 10; var24++) {
                if (var22 > 0) {
                    int var25 = var12 + var24 * 8;
                    if (var24 * 2 + 1 < var22) {
                        this.blit(var1, var25, var19, 34, 9, 9, 9);
                    }

                    if (var24 * 2 + 1 == var22) {
                        this.blit(var1, var25, var19, 25, 9, 9, 9);
                    }

                    if (var24 * 2 + 1 > var22) {
                        this.blit(var1, var25, var19, 16, 9, 9, 9);
                    }
                }
            }

            this.field6716.getProfiler().endStartSection("health");

            for (int var33 = MathHelper.ceil((var15 + (float) var16) / 2.0F) - 1; var33 >= 0; var33--) {
                int var35 = 16;
                if (!var4.isPotionActive(Effects.POISON)) {
                    if (var4.isPotionActive(Effects.WITHER)) {
                        var35 += 72;
                    }
                } else {
                    var35 += 36;
                }

                int var26 = 0;
                if (var6) {
                    var26 = 1;
                }

                int var27 = MathHelper.ceil((float) (var33 + 1) / 10.0F) - 1;
                int var28 = var12 + var33 % 10 * 8;
                int var29 = var14 - var27 * var18;
                if (var5 <= 4) {
                    var29 += this.field6715.nextInt(2);
                }

                if (var21 <= 0 && var33 == var23) {
                    var29 -= 2;
                }

                int var30 = 0;
                if (var4.world.getWorldInfo().isHardcore()) {
                    var30 = 5;
                }

                this.blit(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
                if (var6) {
                    if (var33 * 2 + 1 < var9) {
                        this.blit(var1, var28, var29, var35 + 54, 9 * var30, 9, 9);
                    }

                    if (var33 * 2 + 1 == var9) {
                        this.blit(var1, var28, var29, var35 + 63, 9 * var30, 9, 9);
                    }
                }

                if (var21 <= 0) {
                    if (var33 * 2 + 1 < var5) {
                        this.blit(var1, var28, var29, var35 + 36, 9 * var30, 9, 9);
                    }

                    if (var33 * 2 + 1 == var5) {
                        this.blit(var1, var28, var29, var35 + 45, 9 * var30, 9, 9);
                    }
                } else if (var21 == var16 && var16 % 2 == 1) {
                    this.blit(var1, var28, var29, var35 + 153, 9 * var30, 9, 9);
                    var21--;
                } else {
                    this.blit(var1, var28, var29, var35 + 144, 9 * var30, 9, 9);
                    var21 -= 2;
                }
            }

            LivingEntity var34 = this.method5973();
            int var36 = this.method5974(var34);
            if (var36 == 0) {
                this.field6716.getProfiler().endStartSection("food");

                for (int var37 = 0; var37 < 10; var37++) {
                    int var39 = var14;
                    int var41 = 16;
                    int var43 = 0;
                    if (var4.isPotionActive(Effects.HUNGER)) {
                        var41 += 36;
                        var43 = 13;
                    }

                    if (var4.getFoodStats().method37577() <= 0.0F && this.field6719 % (var11 * 3 + 1) == 0) {
                        var39 = var14 + (this.field6715.nextInt(3) - 1);
                    }

                    int var45 = var13 - var37 * 8 - 9;
                    this.blit(var1, var45, var39, 16 + var43 * 9, 27, 9, 9);
                    if (var37 * 2 + 1 < var11) {
                        this.blit(var1, var45, var39, var41 + 36, 27, 9, 9);
                    }

                    if (var37 * 2 + 1 == var11) {
                        this.blit(var1, var45, var39, var41 + 45, 27, 9, 9);
                    }
                }

                var20 -= 10;
            }

            this.field6716.getProfiler().endStartSection("air");
            int var38 = var4.getMaxAir();
            int var40 = Math.min(var4.getAir(), var38);
            if (var4.areEyesInFluid(FluidTags.field40469) || var40 < var38) {
                int var42 = this.method5975(var36) - 1;
                var20 -= var42 * 10;
                int var44 = MathHelper.method37774((double) (var40 - 2) * 10.0 / (double) var38);
                int var46 = MathHelper.method37774((double) var40 * 10.0 / (double) var38) - var44;

                for (int var31 = 0; var31 < var44 + var46; var31++) {
                    if (var31 >= var44) {
                        this.blit(var1, var13 - var31 * 8 - 9, var20, 25, 18, 9, 9);
                    } else {
                        this.blit(var1, var13 - var31 * 8 - 9, var20, 16, 18, 9, 9);
                    }
                }
            }

            this.field6716.getProfiler().endSection();
        }
    }

    private void method5977(MatrixStack var1) {
        LivingEntity var4 = this.method5973();
        if (var4 != null) {
            int var5 = this.method5974(var4);
            if (var5 != 0) {
                int var6 = (int) Math.ceil((double) var4.getHealth());
                this.field6716.getProfiler().endStartSection("mountHealth");
                int var7 = this.field6742 - 39;
                int var8 = this.field6741 / 2 + 91;
                int var9 = var7;
                int var10 = 0;

                for (; var5 > 0; var10 += 20) {
                    int var12 = Math.min(var5, 10);
                    var5 -= var12;

                    for (int var13 = 0; var13 < var12; var13++) {
                        int var15 = 0;
                        int var16 = var8 - var13 * 8 - 9;
                        this.blit(var1, var16, var9, 52 + var15 * 9, 9, 9, 9);
                        if (var13 * 2 + 1 + var10 < var6) {
                            this.blit(var1, var16, var9, 88, 9, 9, 9);
                        }

                        if (var13 * 2 + 1 + var10 == var6) {
                            this.blit(var1, var16, var9, 97, 9, 9, 9);
                        }
                    }

                    var9 -= 10;
                }
            }
        }
    }

    private void method5978() {
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableAlphaTest();
        this.field6716.getTextureManager().bindTexture(field6713);
        Tessellator var3 = Tessellator.getInstance();
        BufferBuilder var4 = var3.getBuffer();
        var4.begin(7, DefaultVertexFormats.field43344);
        var4.pos(0.0, (double) this.field6742, -90.0).tex(0.0F, 1.0F).endVertex();
        var4.pos((double) this.field6741, (double) this.field6742, -90.0).tex(1.0F, 1.0F).endVertex();
        var4.pos((double) this.field6741, 0.0, -90.0).tex(1.0F, 0.0F).endVertex();
        var4.pos(0.0, 0.0, -90.0).tex(0.0F, 0.0F).endVertex();
        var3.draw();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableAlphaTest();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void method5979(Entity var1) {
        if (var1 != null) {
            float var4 = MathHelper.clamp(1.0F - var1.getBrightness(), 0.0F, 1.0F);
            this.field6723 = (float) ((double) this.field6723 + (double) (var4 - this.field6723) * 0.01);
        }
    }

    private void method5980(Entity var1) {
        if (Config.method26883()) {
            WorldBorder var4 = this.field6716.world.getWorldBorder();
            float var5 = (float) var4.method24526(var1);
            double var6 = Math.min(var4.method24550() * (double) var4.method24551() * 1000.0, Math.abs(var4.method24539() - var4.method24537()));
            double var8 = Math.max((double) var4.method24553(), var6);
            if (!((double) var5 < var8)) {
                var5 = 0.0F;
            } else {
                var5 = 1.0F - (float) ((double) var5 / var8);
            }

            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.ZERO, DestFactor.field12933, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
            if (!(var5 > 0.0F)) {
                RenderSystem.color4f(this.field6723, this.field6723, this.field6723, 1.0F);
            } else {
                RenderSystem.color4f(0.0F, var5, var5, 1.0F);
            }

            this.field6716.getTextureManager().bindTexture(field6711);
            Tessellator var10 = Tessellator.getInstance();
            BufferBuilder var11 = var10.getBuffer();
            var11.begin(7, DefaultVertexFormats.field43344);
            var11.pos(0.0, (double) this.field6742, -90.0).tex(0.0F, 1.0F).endVertex();
            var11.pos((double) this.field6741, (double) this.field6742, -90.0).tex(1.0F, 1.0F).endVertex();
            var11.pos((double) this.field6741, 0.0, -90.0).tex(1.0F, 0.0F).endVertex();
            var11.pos(0.0, 0.0, -90.0).tex(0.0F, 0.0F).endVertex();
            var10.draw();
            RenderSystem.depthMask(true);
            RenderSystem.enableDepthTest();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.defaultBlendFunc();
        } else {
            RenderSystem.enableDepthTest();
            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
        }
    }

    private void method5981(float var1) {
        if (var1 < 1.0F) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
        }

        RenderSystem.disableAlphaTest();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, var1);
        this.field6716.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
        TextureAtlasSprite var4 = this.field6716.getBlockRendererDispatcher().getBlockModelShapes().getTexture(Blocks.field36588.getDefaultState());
        float var5 = var4.getMinU();
        float var6 = var4.getMinV();
        float var7 = var4.getMaxU();
        float var8 = var4.getMaxV();
        Tessellator var9 = Tessellator.getInstance();
        BufferBuilder var10 = var9.getBuffer();
        var10.begin(7, DefaultVertexFormats.field43344);
        var10.pos(0.0, (double) this.field6742, -90.0).tex(var5, var8).endVertex();
        var10.pos((double) this.field6741, (double) this.field6742, -90.0).tex(var7, var8).endVertex();
        var10.pos((double) this.field6741, 0.0, -90.0).tex(var7, var6).endVertex();
        var10.pos(0.0, 0.0, -90.0).tex(var5, var6).endVertex();
        var9.draw();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableAlphaTest();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void method5982(int var1, int var2, float var3, PlayerEntity var4, ItemStack var5) {
        if (!var5.isEmpty()) {
            float var8 = (float) var5.method32177() - var3;
            if (var8 > 0.0F) {
                RenderSystem.pushMatrix();
                float var9 = 1.0F + var8 / 5.0F;
                RenderSystem.translatef((float) (var1 + 8), (float) (var2 + 12), 0.0F);
                RenderSystem.scalef(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
                RenderSystem.translatef((float) (-(var1 + 8)), (float) (-(var2 + 12)), 0.0F);
            }

            this.field6717.method795(var4, var5, var1, var2);
            if (var8 > 0.0F) {
                RenderSystem.popMatrix();
            }

            this.field6717.method797(this.field6716.fontRenderer, var5, var1, var2);
        }
    }

    public void tick() {
        if (this.field6716.world == null) {
            TextureAnimations.method29394();
        }

        if (this.field6721 > 0) {
            this.field6721--;
        }

        if (this.field6731 > 0) {
            this.field6731--;
            if (this.field6731 <= 0) {
                this.field6732 = null;
                this.field6733 = null;
            }
        }

        this.field6719++;
        Entity var3 = this.field6716.getRenderViewEntity();
        if (var3 != null) {
            this.method5979(var3);
        }

        if (this.field6716.player != null) {
            ItemStack var4 = this.field6716.player.inventory.method4028();
            boolean var5 = true;
            if (Reflector.field42924.exists()) {
                ITextComponent var6 = (ITextComponent) Reflector.call(var4, Reflector.field42924, var4.method32149());
                ITextComponent var7 = (ITextComponent) Reflector.call(this.field6725, Reflector.field42924, this.field6725.method32149());
                var5 = Config.equals(var6, var7);
            }

            if (!var4.isEmpty()) {
                if (this.field6725.isEmpty()
                        || var4.getItem() != this.field6725.getItem()
                        || !var4.method32149().equals(this.field6725.method32149())
                        || !var5) {
                    this.field6724 = 40;
                } else if (this.field6724 > 0) {
                    this.field6724--;
                }
            } else {
                this.field6724 = 0;
            }

            this.field6725 = var4;
        }
    }

    public void method5984(ITextComponent var1) {
        this.method5985(new TranslationTextComponent("record.nowPlaying", var1), true);
    }

    public void method5985(ITextComponent var1, boolean var2) {
        this.field6720 = var1;
        this.field6721 = 60;
        this.field6722 = var2;
    }

    public void method5986(ITextComponent var1, ITextComponent var2, int var3, int var4, int var5) {
        if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
            this.field6732 = null;
            this.field6733 = null;
            this.field6731 = 0;
        } else if (var1 == null) {
            if (var2 == null) {
                if (var3 >= 0) {
                    this.field6734 = var3;
                }

                if (var4 >= 0) {
                    this.field6735 = var4;
                }

                if (var5 >= 0) {
                    this.field6736 = var5;
                }

                if (this.field6731 > 0) {
                    this.field6731 = this.field6734 + this.field6735 + this.field6736;
                }
            } else {
                this.field6733 = var2;
            }
        } else {
            this.field6732 = var1;
            this.field6731 = this.field6734 + this.field6735 + this.field6736;
        }
    }

    public UUID method5987(ITextComponent var1) {
        String var4 = TextProcessing.func_244782_a(var1);
        String var5 = StringUtils.substringBetween(var4, "<", ">");
        return var5 != null ? this.field6716.func_244599_aA().method37610(var5) : Util.DUMMY_UUID;
    }

    public void method5988(ChatType var1, ITextComponent var2, UUID var3) {
        if (!this.field6716.cannotSendChatMessages(var3) && (!this.field6716.gameSettings.field44631 || !this.field6716.cannotSendChatMessages(this.method5987(var2)))) {
            for (Class6687 var7 : this.field6743.get(var1)) {
                var7.method20400(var1, var2, var3);
            }
        }
    }

    public Class1266 getChatGUI() {
        return this.field6718;
    }

    public int method5990() {
        return this.field6719;
    }

    public FontRenderer method5991() {
        return this.field6716.fontRenderer;
    }

    public Class1195 getSpectatorGui() {
        return this.field6728;
    }

    public Class1265 method5993() {
        return this.field6729;
    }

    public void resetPlayersOverlayFooterHeader() {
        this.field6729.method5925();
        this.field6730.method5956();
        this.field6716.getToastGui().method5913();
    }

    public Class1267 getBossOverlay() {
        return this.field6730;
    }

    public void reset() {
        this.field6726.resetChunk();
    }
}
