// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class533 extends Screen
{
    private int field3181;
    private final ITextComponent field3182;
    private final boolean field3183;
    
    public Class533(final ITextComponent field3182, final boolean field3183) {
        super(new Class2259(field3183 ? "deathScreen.title.hardcore" : "deathScreen.title"));
        this.field3182 = field3182;
        this.field3183 = field3183;
    }
    
    @Override
    public void init() {
        this.field3181 = 0;
        this.addButton(new Class654(this.width / 2 - 100, this.height / 4 + 72, 200, 20, this.field3183 ? Class8822.method30773("deathScreen.spectate") : Class8822.method30773("deathScreen.respawn"), class654 -> {
            this.minecraft.player.method2842();
            this.minecraft.displayGuiScreen(null);
        }));
        final Class654 class654 = this.addButton(new Class654(this.width / 2 - 100, this.height / 4 + 96, 200, 20, Class8822.method30773("deathScreen.titleScreen"), class654 -> {
            if (!this.field3183) {
                final Class546 class655 = new Class546(this::method3076, new Class2259("deathScreen.quit.confirm"), new StringTextComponent(""), Class8822.method30773("deathScreen.titleScreen"), Class8822.method30773("deathScreen.respawn"));
                this.minecraft.displayGuiScreen(class655);
                class655.method3209(20);
            }
            else {
                this.method3077();
            }
        }));
        if (!this.field3183) {
            if (this.minecraft.method5287() == null) {
                class654.field3431 = false;
            }
        }
        final Iterator<Widget> iterator = this.buttons.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3431 = false;
        }
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    private void method3076(final boolean b) {
        if (!b) {
            this.minecraft.player.method2842();
            this.minecraft.displayGuiScreen(null);
        }
        else {
            this.method3077();
        }
    }
    
    private void method3077() {
        if (this.minecraft.world != null) {
            this.minecraft.world.method6751();
        }
        this.minecraft.method5265(new Class729(new Class2259("menu.savingLevel")));
        this.minecraft.displayGuiScreen(new MainMenu());
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.fillGradient(0, 0, this.width, this.height, 1615855616, -1602211792);
        RenderSystem.pushMatrix();
        RenderSystem.method30063(2.0f, 2.0f, 2.0f);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2 / 2, 30, 16777215);
        RenderSystem.popMatrix();
        if (this.field3182 != null) {
            this.drawCenteredString(this.font, this.field3182.getFormattedText(), this.width / 2, 85, 16777215);
        }
        this.drawCenteredString(this.font, Class8822.method30773("deathScreen.score") + ": " + TextFormatting.YELLOW + this.minecraft.player.method2817(), this.width / 2, 100, 16777215);
        if (this.field3182 != null) {
            if (n2 > 85) {
                if (n2 < 94) {
                    final ITextComponent method3078 = this.method3078(n);
                    if (method3078 != null) {
                        if (method3078.getStyle().getHoverEvent() != null) {
                            this.renderComponentHoverEffect(method3078, n, n2);
                        }
                    }
                }
            }
        }
        super.render(n, n2, n3);
    }
    
    @Nullable
    public ITextComponent method3078(final int n) {
        if (this.field3182 == null) {
            return null;
        }
        final int method6617 = this.minecraft.fontRenderer.getStringWidth(this.field3182.getFormattedText());
        final int n2 = this.width / 2 - method6617 / 2;
        final int n3 = this.width / 2 + method6617 / 2;
        int n4 = n2;
        if (n >= n2 && n <= n3) {
            for (final ITextComponent class2250 : this.field3182) {
                n4 += this.minecraft.fontRenderer.getStringWidth(Class8936.method31696(class2250.getUnformattedComponentText(), false));
                if (n4 <= n) {
                    continue;
                }
                return class2250;
            }
            return null;
        }
        return null;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (this.field3182 != null) {
            if (n2 > 85.0) {
                if (n2 < 94.0) {
                    final ITextComponent method3078 = this.method3078((int)n);
                    if (method3078 != null) {
                        if (method3078.getStyle().method30410() != null) {
                            if (method3078.getStyle().method30410().method35309() == Class2075.field11971) {
                                this.method3035(method3078);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    @Override
    public void tick() {
        super.tick();
        ++this.field3181;
        if (this.field3181 == 20) {
            final Iterator<Widget> iterator = this.buttons.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
}
