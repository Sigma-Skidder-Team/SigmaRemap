package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.blur.BlurEngine;
import mapped.KeyBinding;
import mapped.RenderUtil;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Iterator;

public class KeyStrokes extends Module {
    public int xBase = 10;
    public int yBase = 260;
    public ArrayList<KeyAnimationData> animations = new ArrayList<KeyAnimationData>();

    public KeyStrokes() {
        super(ModuleCategory.GUI, "KeyStrokes", "Shows what keybind you are pressing");
        this.setAvailableOnClassic(false);
    }

    public Keystroke getKeyStrokeForKey(int key) {
        if (key != mc.gameSettings.keyBindLeft.keyCode.keyCode) {
            if (key != mc.gameSettings.keyBindRight.keyCode.keyCode) {
                if (key != mc.gameSettings.keyBindForward.keyCode.keyCode) {
                    if (key != mc.gameSettings.keyBindBack.keyCode.keyCode) {
                        if (key != mc.gameSettings.keyBindAttack.keyCode.keyCode) {
                            return key != mc.gameSettings.keyBindUseItem.keyCode.keyCode ? null
                                    : Keystroke.UseItem;
                        } else {
                            return Keystroke.Attack;
                        }
                    } else {
                        return Keystroke.Back;
                    }
                } else {
                    return Keystroke.Forward;
                }
            } else {
                return Keystroke.Right;
            }
        } else {
            return Keystroke.Left;
        }
    }

    @EventTarget
    private void onRender(EventRender event) {
        if (this.isEnabled() && mc.player != null) {
            if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                if (!Minecraft.getInstance().gameSettings.hideGUI) {
                    this.yBase = event.getYOffset();
                    if (Client.getInstance().guiManager.getHqIngameBlur()) {
                        for (Keystroke keystroke : Keystroke.values()) {
                            KeyPosition topLeftKey = keystroke.getTopLeftPosition();
                            KeyPosition bottomRightKey = keystroke.getBottomRightPosition();
                            RenderUtil.drawBlurredBackground(
                                    this.xBase + topLeftKey.x,
                                    this.yBase + topLeftKey.y,
                                    this.xBase + topLeftKey.x + bottomRightKey.x,
                                    this.yBase + topLeftKey.y + bottomRightKey.y);
                            BlurEngine.drawBlur(this.xBase + topLeftKey.x, this.yBase + topLeftKey.y, bottomRightKey.x, bottomRightKey.y);
                            BlurEngine.endBlur();
                            RenderUtil.endScissor();
                        }
                    }

                    for (Keystroke keystroke : Keystroke.values()) {
                        KeyPosition topLeftKey = keystroke.getTopLeftPosition();
                        KeyPosition bottomRightKey = keystroke.getBottomRightPosition();
                        float topLeftOpacityMul = 1.0F;
                        float bottomRightOpacityMul = 1.0F;
                        if (Client.getInstance().guiManager.getHqIngameBlur()) {
                            bottomRightOpacityMul = 0.5F;
                            topLeftOpacityMul = 0.5F;
                        }

                        String keyName = MultiUtilities.getKeyName(keystroke.bind.keyCode.keyCode);
                        if (keystroke.bind != mc.gameSettings.keyBindAttack) {
                            if (keystroke.bind == mc.gameSettings.keyBindUseItem) {
                                keyName = "R";
                            }
                        } else {
                            keyName = "L";
                        }

                        RenderUtil.drawRect(
                                (float) (this.xBase + topLeftKey.x),
                                (float) (this.yBase + topLeftKey.y),
                                (float) (this.xBase + topLeftKey.x + bottomRightKey.x),
                                (float) (this.yBase + topLeftKey.y + bottomRightKey.y),
                                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.5F * topLeftOpacityMul));
                        RenderUtil.drawRoundedRect(
                                (float) (this.xBase + topLeftKey.x),
                                (float) (this.yBase + topLeftKey.y),
                                (float) bottomRightKey.x,
                                (float) bottomRightKey.y,
                                10.0F,
                                0.75F * bottomRightOpacityMul);
                        RenderUtil.drawString(
                                ResourceRegistry.JelloLightFont18,
                                (float) (this.xBase + topLeftKey.x + (bottomRightKey.x - ResourceRegistry.JelloLightFont18.getWidth(keyName)) / 2),
                                (float) (this.yBase + topLeftKey.y + 12),
                                keyName,
                                ClientColors.LIGHT_GREYISH_BLUE.getColor());
                    }

                    Iterator<KeyAnimationData> iter = this.animations.iterator();

                    while (iter.hasNext()) {
                        KeyAnimationData animationData = iter.next();
                        Keystroke keyStroke = animationData.keyStroke;
                        KeyPosition topLeftPosition = keyStroke.getTopLeftPosition();
                        KeyPosition bottomRightPosition = keyStroke.getBottomRightPosition();
                        RenderUtil.drawBlurredBackground(
                                this.xBase + topLeftPosition.x,
                                this.yBase + topLeftPosition.y,
                                this.xBase + topLeftPosition.x + bottomRightPosition.x,
                                this.yBase + topLeftPosition.y + bottomRightPosition.y);
                        float maxAnimPercent = 0.7F;
                        int duplicates = 0;

                        for (KeyAnimationData var28 : this.animations) {
                            if (var28.keyStroke.equals(keyStroke)) {
                                duplicates++;
                            }
                        }

                        if (keyStroke.getKeyBinding().isKeyDown() && animationData.animation.calcPercent() >= maxAnimPercent && duplicates < 2) {
                            animationData.animation.updateStartTime(maxAnimPercent);
                        }

                        float animPercent = animationData.animation.calcPercent();
                        float alpha = (1.0F - animPercent * (0.5F + animPercent * 0.5F)) * 0.8F;
                        int color = MultiUtilities.applyAlpha(-5658199, alpha);
                        if (Client.getInstance().guiManager.getHqIngameBlur()) {
                            color = MultiUtilities.applyAlpha(-1, alpha);
                        }

                        RenderUtil.drawFilledArc(
                                (float) (this.xBase + topLeftPosition.x + bottomRightPosition.getX() / 2),
                                (float) (this.yBase + topLeftPosition.y + bottomRightPosition.y / 2),
                                (float) (bottomRightPosition.getX() - 4) * animPercent + 4.0F,
                                color);
                        RenderUtil.endScissor();
                        if (animationData.animation.calcPercent() == 1.0F) {
                            iter.remove();
                        }
                    }

                    event.addOffset(160);
                }
            }
        }
    }

    @EventTarget
    private void onKeyPress(EventKeyPress event) {
        if (this.isEnabled() && mc.player != null) {
            if (this.getKeyStrokeForKey(event.getKey()) != null && !event.isPressed()) {
                this.animations.add(new KeyAnimationData(this.getKeyStrokeForKey(event.getKey())));
            }
        }
    }

    public enum Keystroke {
        Left(0.0F, 1.0F, mc.gameSettings.keyBindLeft),
        Right(2.0F, 1.0F, mc.gameSettings.keyBindRight),
        Forward(1.0F, 0.0F, mc.gameSettings.keyBindForward),
        Back(1.0F, 1.0F, mc.gameSettings.keyBindBack),
        Attack(0.0F, 2.0F, 74, mc.gameSettings.keyBindAttack),
        UseItem(1.02F, 2.0F, 73, mc.gameSettings.keyBindUseItem);

        public float positionX;
        public float positionY;
        public int width = 48;
        public int height = 48;
        public int padding = 3;
        public KeyBinding bind;

        private Keystroke(float var3, float var4, KeyBinding var5) {
            this.positionX = var3;
            this.positionY = var4;
            this.bind = var5;
        }

        private Keystroke(float var3, float var4, int var5, KeyBinding var6) {
            this.positionX = var3;
            this.positionY = var4;
            this.bind = var6;
            this.width = var5;
        }

        public KeyPosition getTopLeftPosition() {
            return new KeyPosition(
                    this, (int) (this.positionX * (float) (this.width + this.padding)),
                    (int) (this.positionY * (float) (this.height + this.padding)));
        }

        public KeyPosition getBottomRightPosition() {
            return new KeyPosition(this, this.width, this.height);
        }

        public KeyBinding getKeyBinding() {
            if (this != Left) {
                if (this != Right) {
                    if (this != Forward) {
                        if (this != Back) {
                            if (this != Attack) {
                                return this != UseItem ? null : mc.gameSettings.keyBindUseItem;
                            } else {
                                return mc.gameSettings.keyBindAttack;
                            }
                        } else {
                            return mc.gameSettings.keyBindBack;
                        }
                    } else {
                        return mc.gameSettings.keyBindForward;
                    }
                } else {
                    return mc.gameSettings.keyBindRight;
                }
            } else {
                return mc.gameSettings.keyBindLeft;
            }
        }
    }

    public static class KeyAnimationData {
        public Keystroke keyStroke;
        public Animation animation;

        public KeyAnimationData(Keystroke var2) {
            this.animation = new Animation(300, 0);
            this.keyStroke = var2;
        }
    }

    public static class KeyPosition {
        public int x;
        public int y;
        public final Keystroke keystroke;

        public KeyPosition(Keystroke var1, int var2, int var3) {
            this.keystroke = var1;
            this.x = var2;
            this.y = var3;
        }

        public int getX() {
            return this.x;
        }
    }
}
