// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Objects;

public abstract class Widget extends AbstractGui implements IRenderable, IGuiEventListener
{
    public static final ResourceLocation field3421;
    private static final int field3422 = 750;
    private static final int field3423 = 200;
    public int field3424;
    public int field3425;
    public int field3426;
    public int field3427;
    private String field3428;
    private boolean field3429;
    public boolean field3430;
    public boolean field3431;
    public boolean field3432;
    public float field3433;
    public long field3434;
    private boolean field3435;
    
    public Widget(final int n, final int n2, final String s) {
        this(n, n2, 200, 20, s);
    }
    
    public Widget(final int field3426, final int field3427, final int field3428, final int field3429, final String field3430) {
        this.field3431 = true;
        this.field3432 = true;
        this.field3433 = 1.0f;
        this.field3434 = Long.MAX_VALUE;
        this.field3426 = field3426;
        this.field3427 = field3427;
        this.field3424 = field3428;
        this.field3425 = field3429;
        this.field3428 = field3430;
    }
    
    public int method3350(final boolean b) {
        int n = 1;
        if (this.field3431) {
            if (b) {
                n = 2;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3432) {
            boolean field3430 = false;
            Label_0070: {
                if (n >= this.field3426) {
                    if (n2 >= this.field3427) {
                        if (n < this.field3426 + this.field3424) {
                            if (n2 < this.field3427 + this.field3425) {
                                field3430 = true;
                                break Label_0070;
                            }
                        }
                    }
                }
                field3430 = false;
            }
            this.field3430 = field3430;
            if (this.field3429 != this.method3360()) {
                if (!this.method3360()) {
                    this.field3434 = Long.MAX_VALUE;
                }
                else if (!this.field3435) {
                    this.method3368(750);
                }
                else {
                    this.method3368(200);
                }
            }
            if (this.field3432) {
                this.method3353(n, n2, n3);
            }
            this.method3351();
            this.field3429 = this.method3360();
        }
    }
    
    public void method3351() {
        if (this.field3431) {
            if (this.method3360()) {
                if (Util.method27837() > this.field3434) {
                    final String method3352 = this.method3352();
                    if (!method3352.isEmpty()) {
                        NarratorChatListener.field32404.method25556(method3352);
                        this.field3434 = Long.MAX_VALUE;
                    }
                }
            }
        }
    }
    
    public String method3352() {
        return this.method3369().isEmpty() ? "" : Class8822.method30773("gui.narrate.button", this.method3369());
    }
    
    public void method3353(final int n, final int n2, final float n3) {
        final Minecraft method5277 = Minecraft.getInstance();
        final FontRenderer field4643 = method5277.fontRenderer;
        method5277.method5290().method5849(Widget.field3421);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, this.field3433);
        final int method5278 = this.method3350(this.method3360());
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.method30013(Class2050.field11693, Class2135.field12460);
        this.blit(this.field3426, this.field3427, 0, 46 + method5278 * 20, this.field3424 / 2, this.field3425);
        this.blit(this.field3426 + this.field3424 / 2, this.field3427, 200 - this.field3424 / 2, 46 + method5278 * 20, this.field3424 / 2, this.field3425);
        this.method3354(method5277, n, n2);
        this.drawCenteredString(field4643, this.method3369(), this.field3426 + this.field3424 / 2, this.field3427 + (this.field3425 - 8) / 2, (this.field3431 ? 16777215 : 10526880) | MathHelper.ceil(this.field3433 * 255.0f) << 24);
    }
    
    public void method3354(final Minecraft class869, final int n, final int n2) {
    }
    
    public void method3355(final double n, final double n2) {
    }
    
    public void method3356(final double n, final double n2) {
    }
    
    public void method3357(final double n, final double n2, final double n3, final double n4) {
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (!this.field3431 || !this.field3432) {
            return false;
        }
        if (this.method3358(n3) && this.method3359(n, n2)) {
            this.method3363(Minecraft.getInstance().method5299());
            this.method3355(n, n2);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        if (!this.method3358(n3)) {
            return false;
        }
        this.method3356(n, n2);
        return true;
    }
    
    public boolean method3358(final int n) {
        return n == 0;
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (!this.method3358(n3)) {
            return false;
        }
        this.method3357(n, n2, n4, n5);
        return true;
    }
    
    public boolean method3359(final double n, final double n2) {
        if (this.field3431) {
            if (this.field3432) {
                if (n >= this.field3426) {
                    if (n2 >= this.field3427) {
                        if (n < this.field3426 + this.field3424) {
                            if (n2 < this.field3427 + this.field3425) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method3360() {
        return this.field3430 || this.field3435;
    }
    
    @Override
    public boolean changeFocus(final boolean b) {
        if (this.field3431 && this.field3432) {
            this.method3361(this.field3435 = !this.field3435);
            return this.field3435;
        }
        return false;
    }
    
    public void method3361(final boolean b) {
    }
    
    @Override
    public boolean isMouseOver(final double n, final double n2) {
        if (this.field3431) {
            if (this.field3432) {
                if (n >= this.field3426) {
                    if (n2 >= this.field3427) {
                        if (n < this.field3426 + this.field3424) {
                            if (n2 < this.field3427 + this.field3425) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void method3362(final int n, final int n2) {
    }
    
    public void method3363(final Class1784 class1784) {
        class1784.method6422(Class6836.method20933(Class8520.field35662, 1.0f));
    }
    
    public int method3364() {
        return this.field3424;
    }
    
    public void method3365(final int field3424) {
        this.field3424 = field3424;
    }
    
    public void method3366(final float field3433) {
        this.field3433 = field3433;
    }
    
    public void method3367(final String s) {
        if (!Objects.equals(s, this.field3428)) {
            this.method3368(250);
        }
        this.field3428 = s;
    }
    
    public void method3368(final int n) {
        this.field3434 = Util.method27837() + n;
    }
    
    public String method3369() {
        return this.field3428;
    }
    
    public boolean method3370() {
        return this.field3435;
    }
    
    public void method3371(final boolean field3435) {
        this.field3435 = field3435;
    }
    
    static {
        field3421 = new ResourceLocation("textures/gui/widgets.png");
    }
}
