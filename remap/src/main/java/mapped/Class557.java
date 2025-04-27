// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class557 extends Screen implements Class558
{
    private static final ResourceLocation field3336;
    private static final ResourceLocation field3337;
    private final Class8840 field3338;
    private final Map<Class8863, Class572> field3339;
    private Class572 field3340;
    private boolean field3341;
    
    public Class557(final Class8840 field3338) {
        super(NarratorChatListener.EMPTY);
        this.field3339 = Maps.newLinkedHashMap();
        this.field3338 = field3338;
    }
    
    @Override
    public void init() {
        this.field3339.clear();
        this.field3340 = null;
        this.field3338.method30870(this);
        if (this.field3340 == null && !this.field3339.isEmpty()) {
            this.field3338.method30869(this.field3339.values().iterator().next().method3337(), true);
        }
        else {
            this.field3338.method30869((this.field3340 != null) ? this.field3340.method3337() : null, true);
        }
    }
    
    @Override
    public void removed() {
        this.field3338.method30870(null);
        final Class5799 method5269 = this.minecraft.method5269();
        if (method5269 != null) {
            method5269.method17292(Class4334.method13014());
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final int n4 = (this.width - 252) / 2;
            final int n5 = (this.height - 140) / 2;
            for (final Class572 class572 : this.field3339.values()) {
                if (!class572.method3343(n4, n5, n, n2)) {
                    continue;
                }
                this.field3338.method30869(class572.method3337(), true);
                break;
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (!this.minecraft.gameSettings.field23456.method1066(keyCode, n2)) {
            return super.keyPressed(keyCode, n2, n3);
        }
        this.minecraft.displayGuiScreen(null);
        this.minecraft.field4650.method26963();
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        final int n4 = (this.width - 252) / 2;
        final int n5 = (this.height - 140) / 2;
        this.renderBackground();
        this.method3260(n, n2, n4, n5);
        this.method3261(n4, n5);
        this.method3262(n, n2, n4, n5);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (n3 == 0) {
            if (this.field3341) {
                if (this.field3340 != null) {
                    this.field3340.method3345(n4, n5);
                }
            }
            else {
                this.field3341 = true;
            }
            return true;
        }
        return this.field3341 = false;
    }
    
    private void method3260(final int n, final int n2, final int n3, final int n4) {
        final Class572 field3340 = this.field3340;
        if (field3340 != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(n3 + 9), (float)(n4 + 18), 0.0f);
            field3340.method3341();
            RenderSystem.popMatrix();
            RenderSystem.method30009(515);
            RenderSystem.disableDepthTest();
        }
        else {
            AbstractGui.fill(n3 + 9, n4 + 18, n3 + 9 + 234, n4 + 18 + 113, -16777216);
            final String method30773 = Class8822.method30773("advancements.empty");
            this.font.method6610(method30773, (float)(n3 + 9 + 117 - this.font.getStringWidth(method30773) / 2), (float)(n4 + 18 + 56 - 4), -1);
            this.font.method6610(":(", (float)(n3 + 9 + 117 - this.font.getStringWidth(":(") / 2), (float)(n4 + 18 + 113 - 9), -1);
        }
    }
    
    public void method3261(final int n, final int n2) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableBlend();
        this.minecraft.method5290().method5849(Class557.field3336);
        this.blit(n, n2, 0, 0, 252, 140);
        if (this.field3339.size() > 1) {
            this.minecraft.method5290().method5849(Class557.field3337);
            for (final Class572 class572 : this.field3339.values()) {
                class572.method3339(n, n2, class572 == this.field3340);
            }
            RenderSystem.enableRescaleNormal();
            RenderSystem.defaultBlendFunc();
            final Iterator<Class572> iterator2 = this.field3339.values().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().method3340(n, n2, this.itemRenderer);
            }
            RenderSystem.disableBlend();
        }
        this.font.method6610(Class8822.method30773("gui.advancements"), (float)(n + 8), (float)(n2 + 6), 4210752);
    }
    
    private void method3262(final int n, final int n2, final int n3, final int n4) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.field3340 != null) {
            RenderSystem.pushMatrix();
            RenderSystem.enableDepthTest();
            RenderSystem.translatef((float)(n3 + 9), (float)(n4 + 18), 400.0f);
            this.field3340.method3342(n - n3 - 9, n2 - n4 - 18, n3, n4);
            RenderSystem.disableDepthTest();
            RenderSystem.popMatrix();
        }
        if (this.field3339.size() > 1) {
            for (final Class572 class572 : this.field3339.values()) {
                if (!class572.method3343(n3, n4, n, n2)) {
                    continue;
                }
                this.renderTooltip(class572.method3338(), n, n2);
            }
        }
    }
    
    @Override
    public void method3263(final Class8863 class8863) {
        final Class572 method3344 = Class572.method3344(this.minecraft, this, this.field3339.size(), class8863);
        if (method3344 != null) {
            this.field3339.put(class8863, method3344);
        }
    }
    
    @Override
    public void method3264(final Class8863 class8863) {
    }
    
    @Override
    public void method3265(final Class8863 class8863) {
        final Class572 method3271 = this.method3271(class8863);
        if (method3271 != null) {
            method3271.method3346(class8863);
        }
    }
    
    @Override
    public void method3266(final Class8863 class8863) {
    }
    
    @Override
    public void method3267(final Class8863 class8863, final Class348 class8864) {
        final Class683 method3270 = this.method3270(class8863);
        if (method3270 != null) {
            method3270.method3748(class8864);
        }
    }
    
    @Override
    public void method3268(final Class8863 class8863) {
        this.field3340 = this.field3339.get(class8863);
    }
    
    @Override
    public void method3269() {
        this.field3339.clear();
        this.field3340 = null;
    }
    
    @Nullable
    public Class683 method3270(final Class8863 class8863) {
        final Class572 method3271 = this.method3271(class8863);
        return (method3271 != null) ? method3271.method3348(class8863) : null;
    }
    
    @Nullable
    private Class572 method3271(Class8863 method31035) {
        while (method31035.method31035() != null) {
            method31035 = method31035.method31035();
        }
        return this.field3339.get(method31035);
    }
    
    static {
        field3336 = new ResourceLocation("textures/gui/advancements/window.png");
        field3337 = new ResourceLocation("textures/gui/advancements/tabs.png");
    }
}
