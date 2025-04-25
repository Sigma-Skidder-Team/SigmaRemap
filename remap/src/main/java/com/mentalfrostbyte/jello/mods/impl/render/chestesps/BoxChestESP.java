// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.chestesps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import org.lwjgl.opengl.GL11;

public class BoxChestESP extends Module
{
    public BoxChestESP() {
        super(Category.RENDER, "Box", "Draws a box where chests are");
    }
    
    @EventListener
    private void method10086(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (BoxChestESP.mc.player != null && BoxChestESP.mc.world != null) {
            this.method10088();
            this.method10087();
            this.method10089();
        }
    }
    
    private void method10087() {
        final int method19118 = ColorUtils.applyAlpha(this.method9914().method9885("Regular Color"), 0.14f);
        final int method19119 = ColorUtils.applyAlpha(this.method9914().method9885("Ender Color"), 0.14f);
        final int method19120 = ColorUtils.applyAlpha(this.method9914().method9885("Trapped Color"), 0.14f);
        for (final TileEntity tileEntity : BoxChestESP.mc.world.loadedTileEntityList) {
            boolean b = false;
            Label_0129: {
                if (tileEntity instanceof Class475) {
                    if (!(tileEntity instanceof Class478)) {
                        if (this.method9914().method9883("Show Regular Chests")) {
                            b = true;
                            break Label_0129;
                        }
                    }
                }
                b = false;
            }
            final boolean b2 = b;
            final boolean b3 = tileEntity instanceof Class477 && this.method9914().method9883("Show Ender Chests");
            final boolean b4 = tileEntity instanceof Class478 && this.method9914().method9883("Show Trapped Chests");
            if (!b2) {
                if (!b3) {
                    if (!b4) {
                        continue;
                    }
                }
            }
            final double field38854 = Class8591.method29095(tileEntity.getPos()).field38854;
            final double field38855 = Class8591.method29095(tileEntity.getPos()).field38855;
            final double field38856 = Class8591.method29095(tileEntity.getPos()).field38856;
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            int n = method19118;
            if (!(tileEntity instanceof Class477)) {
                if (tileEntity instanceof Class478) {
                    n = method19120;
                }
            }
            else {
                n = method19119;
            }
            final Class7644 class437 = new Class7644(tileEntity.method2194().getShape(BoxChestESP.mc.world, tileEntity.getPos()).getBoundingBox().offset(field38854, field38855, field38856));
            GL11.glAlphaFunc(519, 0.0f);
            RenderUtil.method26909(class437, n);
            RenderUtil.method26912(class437, 2.0f, n);
            GL11.glDisable(3042);
        }
    }
    
    private void method10088() {
        GL11.glLineWidth(3.0f);
        GL11.glPointSize(3.0f);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        BoxChestESP.mc.field4644.field9396.method1417();
    }
    
    private void method10089() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = BoxChestESP.mc.method5290();
        BoxChestESP.mc.method5290();
        method5290.method5849(Class1663.field9428);
        BoxChestESP.mc.field4644.field9396.method1418();
    }
}
