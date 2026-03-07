package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.EventRender3D;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.blur.BlurEngine;
import mapped.QuadraticEasing;
import mapped.RenderUtil;
import mapped.TabGuiSelectionEffect;
import net.minecraft.client.Minecraft;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TabGUI extends Module {
    public HashMap<ModuleCategory, Float> categoryTextOffset = new HashMap<>();
    public HashMap<Module, Float> moduleTextOffset = new HashMap<>();
    public boolean submenuOpen = false;
    public ArrayList<TabGuiSelectionEffect> effects = new ArrayList<>();
    public int HIGHTLIGHT_FILL = MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.0625F);
    public int HIGHTLIGHT_SHADOW_TINT = MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.3F);
    public List<ModuleCategory> categories = this.getCategories();
    public int HQ_BLUR_BACKGROUND = MultiUtilities.applyAlpha(ClientColors.MID_GREY.getColor(), 0.05F);
    private final Color[] catGradientTop = new Color[3];
    private final Color[] catGradientBottom = new Color[3];
    private final Color[] modGradientTop = new Color[3];
    private final Color[] modGradientBottom = new Color[3];
    private final Color[] modGradientMid = new Color[3];
    private final int INITIAL_X = 10;
    private int y = 90;
    private final int CATEGORY_WIDTH = 150;
    private int categoryHeight = 150;
    private int selectedCategoryIndex = 0;
    private int categorySelectorY = 0;
    private int moduleSelectorY = 0;
    private final int ROW_HEIGHT = 30;
    private final int ROW_PADDING = 4;
    private float animSpeed = 1.0F;
    private ModuleCategory selectedCategory;
    private int modulePanelHeight = 0;
    private int selectedModuleIndex;
    private Module selectedModule;
    private final int MODULE_WIDTH = 170;
    private float categoryScrollOffset = 0.0F;

    public TabGUI() {
        super(ModuleCategory.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
        this.setAvailableOnClassic(false);
    }

    @EventTarget
    @HigestPriority
    private void onRender(Render2DEvent event) {
        if (this.isEnabled() && mc.player != null) {
            if (Client.getInstance().guiManager.getHqIngameBlur()) {
                if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                    if (!Minecraft.getInstance().gameSettings.hideGUI) {
                        BlurEngine.drawBlur(this.INITIAL_X, this.y, this.CATEGORY_WIDTH, this.categoryHeight);
                        if (this.submenuOpen) {
                            BlurEngine.drawBlur(170, this.y, this.MODULE_WIDTH, this.modulePanelHeight);
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    @HigestPriority
    private void onRender(EventRender event) {
        if (this.isEnabled() && mc.player != null && mc.world != null) {
            if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                if (!Minecraft.getInstance().gameSettings.hideGUI) {
                    this.categoryHeight = 5 * this.ROW_HEIGHT + this.ROW_PADDING;
                    float var4 = Math.abs((float) this.getDesiredCategoryScroll() - this.categoryScrollOffset);
                    boolean var5 = (float) this.getDesiredCategoryScroll() - this.categoryScrollOffset < 0.0F;
                    this.categoryScrollOffset = this.categoryScrollOffset
                            + Math.min(var4, var4 * 0.14F * this.animSpeed) * (float) (!var5 ? 1 : -1);
                    this.y = event.getYOffset();
                    this.drawPanelBackground(this.INITIAL_X, this.y, this.CATEGORY_WIDTH, this.categoryHeight,
                            this.catGradientTop, null, this.catGradientBottom);
                    RenderUtil.startScissor((float) this.INITIAL_X, (float) this.y, (float) this.CATEGORY_WIDTH,
                            (float) this.categoryHeight);
                    this.drawSelector(
                            this.INITIAL_X,
                            this.y - Math.round(this.categoryScrollOffset),
                            this.categories.size() * this.ROW_HEIGHT + this.ROW_PADDING,
                            this.CATEGORY_WIDTH,
                            this.selectedCategoryIndex,
                            false
                    );
                    this.method16595(this.INITIAL_X, this.y - Math.round(this.categoryScrollOffset), this.categories);
                    RenderUtil.endScissor();
                    if (this.submenuOpen) {
                        this.modulePanelHeight = this.getModulesForCategory(this.selectedCategory).size() * this.ROW_HEIGHT + this.ROW_PADDING;
                        this.drawPanelBackground(170, this.y, this.MODULE_WIDTH, this.modulePanelHeight, this.modGradientTop,
                                this.modGradientMid, this.modGradientBottom);
                        this.drawSelector(170, this.y, this.modulePanelHeight, this.MODULE_WIDTH, this.selectedModuleIndex, true
                        );
                        this.method16594(170, this.y, this.getModulesForCategory(this.selectedCategory));
                    }

                    event.addOffset(this.categoryHeight + 10);
                }
            }
        }
    }

    private int getDesiredCategoryScroll() {
        return Math.max(this.selectedCategoryIndex * this.ROW_HEIGHT - 4 * this.ROW_HEIGHT, 0);
    }

    private List<Module> getModulesForCategory(ModuleCategory var1) {
        ArrayList var4 = new ArrayList();

        for (Module var6 : Client.getInstance().moduleManager.getModulesByCategory(var1)) {
            var4.add(var6);
        }

        return var4;
    }

    private void method16594(int var1, int var2, List<Module> var3) {
        int var7 = 0;

        for (Module var9 : var3) {
            if (this.selectedModuleIndex == var7) {
                this.selectedModule = var9;
            }

            if (!this.moduleTextOffset.containsKey(var9)) {
                this.moduleTextOffset.put(var9, 0.0F);
            }

            if (this.selectedModuleIndex == var7 && this.moduleTextOffset.get(var9) < 14.0F) {
                this.moduleTextOffset.put(var9, this.moduleTextOffset.get(var9) + this.animSpeed);
            } else if (this.selectedModuleIndex != var7 && this.moduleTextOffset.get(var9) > 0.0F) {
                this.moduleTextOffset.put(var9, this.moduleTextOffset.get(var9) - this.animSpeed);
            }

            if (var9.isEnabled()) {
                RenderUtil.drawString(
                        ResourceRegistry.JelloMediumFont20,
                        (float) (var1 + 11) + this.moduleTextOffset.get(var9),
                        (float) (var2 + this.ROW_HEIGHT / 2 - ResourceRegistry.JelloMediumFont20.getHeight() / 2 + 3
                                + var7 * this.ROW_HEIGHT),
                        var9.getName(),
                        ClientColors.LIGHT_GREYISH_BLUE.getColor());
            } else {
                RenderUtil.drawString(
                        ResourceRegistry.JelloLightFont20,
                        (float) (var1 + 11) + this.moduleTextOffset.get(var9),
                        (float) (var2 + this.ROW_HEIGHT / 2 - ResourceRegistry.JelloLightFont20.getHeight() / 2 + 2
                                + var7 * this.ROW_HEIGHT),
                        var9.getName(),
                        ClientColors.LIGHT_GREYISH_BLUE.getColor());
            }

            var7++;
        }
    }

    private void method16595(int var1, int var2, List<ModuleCategory> var3) {
        int var6 = 0;

        for (ModuleCategory var8 : var3) {
            if (this.selectedCategoryIndex == var6) {
                this.selectedCategory = var8;
            }

            if (!this.categoryTextOffset.containsKey(var8)) {
                this.categoryTextOffset.put(var8, 0.0F);
            }

            if (this.selectedCategoryIndex == var6 && this.categoryTextOffset.get(var8) < 14.0F) {
                this.categoryTextOffset.put(var8, this.categoryTextOffset.get(var8) + this.animSpeed);
            } else if (this.selectedCategoryIndex != var6 && this.categoryTextOffset.get(var8) > 0.0F) {
                this.categoryTextOffset.put(var8, this.categoryTextOffset.get(var8) - this.animSpeed);
            }

            RenderUtil.drawString(
                    ResourceRegistry.JelloLightFont20,
                    (float) (var1 + 11) + this.categoryTextOffset.get(var8),
                    (float) (var2 + this.ROW_HEIGHT / 2 - ResourceRegistry.JelloLightFont20.getHeight() / 2 + 2
                            + var6 * this.ROW_HEIGHT),
                    var8.toString(),
                    -1);
            var6++;
        }
    }

    private void drawSelector(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var10;
        if (var6) {
            float var11 = (float) (var5 * this.ROW_HEIGHT - this.moduleSelectorY);
            if (this.moduleSelectorY > var5 * this.ROW_HEIGHT) {
                this.moduleSelectorY = (int) ((float) this.moduleSelectorY
                        + (!(var11 * 0.14F * this.animSpeed >= 1.0F) ? var11 * 0.14F * this.animSpeed
                        : -this.animSpeed));
            }

            if (this.moduleSelectorY < var5 * this.ROW_HEIGHT) {
                this.moduleSelectorY = (int) ((float) this.moduleSelectorY
                        + (!(var11 * 0.14F * this.animSpeed <= 1.0F) ? var11 * 0.14F * this.animSpeed
                        : this.animSpeed));
            }

            if (var11 > 0.0F && this.moduleSelectorY > var5 * this.ROW_HEIGHT) {
                this.moduleSelectorY = var5 * this.ROW_HEIGHT;
            }

            if (var11 < 0.0F && this.moduleSelectorY < var5 * this.ROW_HEIGHT) {
                this.moduleSelectorY = var5 * this.ROW_HEIGHT;
            }

            var10 = this.moduleSelectorY;
        } else {
            float var15 = (float) (var5 * this.ROW_HEIGHT - this.categorySelectorY);
            if (this.categorySelectorY > var5 * this.ROW_HEIGHT) {
                this.categorySelectorY = (int) ((float) this.categorySelectorY
                        + (!(var15 * 0.14F * this.animSpeed >= 1.0F) ? var15 * 0.14F * this.animSpeed
                        : -this.animSpeed));
            }

            if (this.categorySelectorY < var5 * this.ROW_HEIGHT) {
                this.categorySelectorY = (int) ((float) this.categorySelectorY
                        + (!(var15 * 0.14F * this.animSpeed <= 1.0F) ? var15 * 0.14F * this.animSpeed
                        : this.animSpeed));
            }

            if (var15 > 0.0F && this.categorySelectorY > var5 * this.ROW_HEIGHT) {
                this.categorySelectorY = var5 * this.ROW_HEIGHT;
            }

            if (var15 < 0.0F && this.categorySelectorY < var5 * this.ROW_HEIGHT) {
                this.categorySelectorY = var5 * this.ROW_HEIGHT;
            }

            var10 = this.categorySelectorY;
        }

        if (Math.round(this.categoryScrollOffset) > 0 && this.categorySelectorY > 120) {
            this.categorySelectorY = Math.max(this.categorySelectorY, 120 + Math.round(this.categoryScrollOffset));
        }

        RenderUtil.drawRect(
                (float) var1,
                var10 >= 0 ? (float) (var10 + var2) : (float) var2,
                (float) (var1 + var4),
                var10 + this.ROW_PADDING + this.ROW_HEIGHT <= var3
                        ? (float) (var10 + var2 + this.ROW_HEIGHT + this.ROW_PADDING)
                        : (float) (var2 + var3 + this.ROW_PADDING),
                this.HIGHTLIGHT_FILL);
        RenderUtil.drawImage(
                (float) var1,
                var10 + this.ROW_PADDING + this.ROW_HEIGHT <= var3 ? (float) (var10 + var2 + this.ROW_HEIGHT - 10)
                        : (float) (var2 + var3 - 10),
                (float) var4,
                14.0F,
                ResourceList.shadowTopPNG,
                this.HIGHTLIGHT_SHADOW_TINT);
        RenderUtil.drawImage((float) var1, var10 >= 0 ? (float) (var10 + var2) : (float) var2, (float) var4, 14.0F,
                ResourceList.shadowBottomPNG, this.HIGHTLIGHT_SHADOW_TINT);
        RenderUtil.startScissorNoGL(
                var1,
                var10 >= 0 ? var10 + var2 : var2,
                var1 + var4,
                var10 + this.ROW_PADDING + this.ROW_HEIGHT <= var3 ? var10 + var2 + this.ROW_HEIGHT + this.ROW_PADDING
                        : var2 + var3 + this.ROW_PADDING);
        Iterator<TabGuiSelectionEffect> iterator = this.effects.iterator();

        while (iterator.hasNext()) {
            TabGuiSelectionEffect next = iterator.next();
            if (next.submenu == var6) {
                float animation = next.animation.calcPercent();
                int color = MultiUtilities.applyAlpha(-5658199, (1.0F - animation * (0.5F + animation * 0.5F)) * 0.8F);

                if (Client.getInstance().guiManager.getHqIngameBlur()) {
                    color = MultiUtilities.applyAlpha(-1, (1.0F - animation) * 0.14F);
                }

                RenderUtil.drawFilledArc(
                        (float) var1, var10 >= 0 ? (float) (var10 + var2 + 14) : (float) var2,
                        (float) var4 * QuadraticEasing.easeOutQuad(animation, 0.0F, 1.0F, 1.0F) + 4.0F, color);

                if (next.animation.calcPercent() == 1.0F) {
                    iterator.remove();
                }
            }
        }

        RenderUtil.endScissor();
    }

    private List<ModuleCategory> getCategories() {
        List<ModuleCategory> categories = new ArrayList<>();
        categories.add(ModuleCategory.MOVEMENT);
        categories.add(ModuleCategory.PLAYER);
        categories.add(ModuleCategory.COMBAT);
        categories.add(ModuleCategory.ITEM);
        categories.add(ModuleCategory.RENDER);
        categories.add(ModuleCategory.WORLD);
        categories.add(ModuleCategory.MISC);
        return categories;
    }

    @EventTarget
    private void onRender3D(EventRender3D event) {
        if (this.isEnabled() && mc.player != null) {
            this.updateSampledPanelColors();
            this.animSpeed = (float) Math.max(Math.round(6.0F - (float) Minecraft.getFps() / 10.0F), 1);
        }
    }

    @EventTarget
    private void onKey(EventKeyPress event) {
        if (this.isEnabled()) {
            switch (event.getKey()) {
                case 257:
                    if (this.submenuOpen) {
                        this.selectedModule.toggle();
                        this.effects.add(new TabGuiSelectionEffect(this.submenuOpen));
                    }
                    break;
                case 262:
                    this.effects.add(new TabGuiSelectionEffect(this.submenuOpen));
                    if (this.submenuOpen) {
                        this.selectedModule.toggle();
                    }

                    this.submenuOpen = true;
                    break;
                case 263:
                    this.submenuOpen = false;
                    break;
                case 264:
                    if (!this.submenuOpen) {
                        this.selectedCategoryIndex++;
                        this.selectedModuleIndex = 0;
                    } else {
                        this.selectedModuleIndex++;
                    }
                    break;
                case 265:
                    if (!this.submenuOpen) {
                        this.selectedCategoryIndex--;
                        this.selectedModuleIndex = 0;
                    } else {
                        this.selectedModuleIndex--;
                    }
                    break;
                case 258:
                case 259:
                case 260:
                case 261:
                default:
                    return;
            }

            if (this.selectedCategoryIndex >= this.categories.size()) {
                this.selectedCategoryIndex = 0;
                this.categorySelectorY = -this.ROW_HEIGHT;
            } else if (this.selectedCategoryIndex < 0) {
                this.selectedCategoryIndex = this.categories.size() - 1;
                this.categorySelectorY = this.selectedCategoryIndex * this.ROW_HEIGHT + this.ROW_HEIGHT;
            }

            if (this.selectedModuleIndex >= this.getModulesForCategory(this.selectedCategory).size()) {
                this.selectedModuleIndex = this.getModulesForCategory(this.selectedCategory).size() - 1;
            } else if (this.selectedModuleIndex < 0) {
                this.selectedModuleIndex = 0;
            }
        }
    }

    private void drawPanelBackground(int x, int y, int width, int height, Color[] topColors, Color[] midColorsOrNull, Color[] bottomColors) {
        boolean hqBlur = Client.getInstance().guiManager.getHqIngameBlur();
        int top = MultiUtilities.averageColors(topColors).getRGB();
        int bottom = MultiUtilities.averageColors(bottomColors).getRGB();
        if (midColorsOrNull != null) {
            int var16 = MultiUtilities.averageColors(midColorsOrNull).getRGB();
            top = MultiUtilities.blendColors(top, var16, 0.75F);
            bottom = MultiUtilities.blendColors(bottom, var16, 0.75F);
        }

        if (!hqBlur) {
            RenderUtil.drawVerticalGradientRect(x, y, x + width, y + height, top, bottom);
        } else {
            RenderUtil.startScissor((float) x, (float) y, (float) width, (float) height);
            BlurEngine.endBlur();
            RenderUtil.endScissor();
            RenderUtil.drawRect((float) x, (float) y, (float) (x + width), (float) (y + height),
                    this.HQ_BLUR_BACKGROUND);
        }

        RenderUtil.drawRoundedRect((float) x, (float) y, (float) width, (float) height, 8.0F, 0.7f);
    }

    private void updateSampledPanelColors() {
        if (!Client.getInstance().guiManager.getHqIngameBlur()) {
            if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                if (!Minecraft.getInstance().gameSettings.hideGUI) {
                    for (int i = 0; i < 3; i++) {
                        this.catGradientTop[i] = this.sampleScreenColor(this.INITIAL_X + this.CATEGORY_WIDTH / 3 * i,
                                this.y, this.catGradientTop[i]);
                        this.catGradientBottom[i] = this.sampleScreenColor(
                                this.INITIAL_X + this.CATEGORY_WIDTH / 3 * i, this.y + this.categoryHeight,
                                this.catGradientBottom[i]);
                        this.modGradientTop[i] = this.sampleScreenColor(this.INITIAL_X + this.CATEGORY_WIDTH + 56 * i,
                                this.y, this.modGradientTop[i]);
                        this.modGradientBottom[i] = this.sampleScreenColor(
                                this.INITIAL_X + this.CATEGORY_WIDTH + 56 * i, this.y + this.modulePanelHeight,
                                this.modGradientBottom[i]);
                        this.modGradientMid[i] = this.sampleScreenColor(
                                this.INITIAL_X + this.CATEGORY_WIDTH + 56 * i, this.y + this.modulePanelHeight / 2,
                                this.modGradientMid[i]);
                    }
                }
            }
        }
    }

    private Color sampleScreenColor(int var1, int var2, Color previous) {
        Color sampled = RenderUtil.sampleScreenColor(var1, var2, previous);
        if (previous != null) {
            sampled = MultiUtilities.blendColor(sampled, previous, 0.08F * this.animSpeed);
        }

        return sampled;
    }
}
