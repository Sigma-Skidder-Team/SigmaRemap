// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class684 extends AbstractGui
{
    private static final Logger field3741;
    private final Minecraft field3742;
    private final List<String> field3743;
    private final List<Class8693> field3744;
    private final List<Class8693> field3745;
    private int field3746;
    private boolean field3747;
    private int field3748;
    
    public Class684(final Minecraft field3742) {
        this.field3743 = Lists.newArrayList();
        this.field3744 = Lists.newArrayList();
        this.field3745 = Lists.newArrayList();
        this.field3748 = 0;
        this.field3742 = field3742;
    }
    
    public void method3757(final int n) {
        final int method3772 = this.method3772();
        if (this.field3748 != method3772) {
            this.field3748 = method3772;
            this.method3764();
        }
        if (this.method3758()) {
            final int method3773 = this.method3777();
            final int size = this.field3745.size();
            if (size > 0) {
                boolean b = false;
                if (this.method3770()) {
                    b = true;
                }
                final double method3774 = this.method3774();
                int method3775 = MathHelper.ceil(this.method3772() / method3774);
                RenderSystem.pushMatrix();
                RenderSystem.translatef(2.0f, 8.0f, 0.0f);
                RenderSystem.method30064(method3774, method3774, 1.0);
                final double n2 = this.field3742.gameSettings.field23390 * 0.8999999761581421 + 0.10000000149011612;
                final double field23391 = this.field3742.gameSettings.field23391;
                int n3 = 0;
                final Matrix4f method3776 = Matrix4f.method20760(0.0f, 0.0f, -100.0f);
                for (int n4 = 0; n4 + this.field3746 < this.field3745.size() && n4 < method3773; ++n4) {
                    final Class8693 class8693 = this.field3745.get(n4 + this.field3746);
                    if (class8693 != null) {
                        final int n5 = n - class8693.method29804();
                        if (n5 < 200 || b) {
                            final double n6 = b ? 1.0 : method3759(n5);
                            final int n7 = (int)(255.0 * n6 * n2);
                            final int n8 = (int)(255.0 * n6 * field23391);
                            ++n3;
                            if (n7 > 3) {
                                final int n9 = -n4 * 9;
                                if (this.field3742.gameSettings.field23528 == 5) {
                                    method3775 = this.field3742.fontRenderer.getStringWidth(class8693.method29803().getFormattedText()) - 2;
                                }
                                if (this.field3742.gameSettings.field23528 != 3) {
                                    AbstractGui.method3294(method3776, -2, n9 - 9, 0 + method3775 + 4, n9, n8 << 24);
                                }
                                final String method3777 = class8693.method29803().getFormattedText();
                                RenderSystem.enableBlend();
                                if (this.field3742.gameSettings.field23529) {
                                    this.field3742.fontRenderer.drawStringWithShadow(method3777, 0.0f, (float)(n9 - 8), 16777215 + (n7 << 24));
                                }
                                else {
                                    this.field3742.fontRenderer.method6610(method3777, 0.0f, (float)(n9 - 8), 16777215 + (n7 << 24));
                                }
                                RenderSystem.disableAlphaTest();
                                RenderSystem.disableBlend();
                            }
                        }
                    }
                }
                if (b) {
                    final int n10 = 9;
                    RenderSystem.translatef(-3.0f, 0.0f, 0.0f);
                    final int n11 = size * n10 + size;
                    final int n12 = n3 * n10 + n3;
                    final int n13 = this.field3746 * n12 / size;
                    final int n14 = n12 * n12 / n11;
                    if (n11 != n12) {
                        final int n15 = (n13 <= 0) ? 96 : 170;
                        AbstractGui.fill(0, -n13, 2, -n13 - n14, (this.field3747 ? 13382451 : 3355562) + (n15 << 24));
                        AbstractGui.fill(2, -n13, 1, -n13 - n14, 13421772 + (n15 << 24));
                    }
                }
                RenderSystem.popMatrix();
            }
        }
    }
    
    private boolean method3758() {
        return this.field3742.gameSettings.field23389 != Class2047.field11663;
    }
    
    private static double method3759(final int n) {
        final double method35654 = MathHelper.clamp((1.0 - n / 200.0) * 10.0, 0.0, 1.0);
        return method35654 * method35654;
    }
    
    public void method3760(final boolean b) {
        this.field3745.clear();
        this.field3744.clear();
        if (b) {
            this.field3743.clear();
        }
    }
    
    public void method3761(final ITextComponent class2250) {
        this.method3762(class2250, 0);
    }
    
    public void method3762(final ITextComponent class2250, final int n) {
        this.method3763(class2250, n, this.field3742.field4647.method3808(), false);
        Class684.field3741.info("[CHAT] {}", (Object)class2250.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
    }
    
    private void method3763(final ITextComponent class2250, final int n, final int n2, final boolean b) {
        if (n != 0) {
            this.method3771(n);
        }
        final List<ITextComponent> method31697 = Class8936.method31697(class2250, MathHelper.floor(this.method3772() / this.method3774()), this.field3742.fontRenderer, false, false);
        final boolean method31698 = this.method3770();
        for (final ITextComponent class2251 : method31697) {
            if (method31698) {
                if (this.field3746 > 0) {
                    this.field3747 = true;
                    this.method3768(1.0);
                }
            }
            this.field3745.add(0, new Class8693(n2, class2251, n));
        }
        while (this.field3745.size() > 100) {
            this.field3745.remove(this.field3745.size() - 1);
        }
        if (!b) {
            this.field3744.add(0, new Class8693(n2, class2250, n));
            while (this.field3744.size() > 100) {
                this.field3744.remove(this.field3744.size() - 1);
            }
        }
    }
    
    public void method3764() {
        this.field3745.clear();
        this.method3767();
        for (int i = this.field3744.size() - 1; i >= 0; --i) {
            final Class8693 class8693 = this.field3744.get(i);
            this.method3763(class8693.method29803(), class8693.method29805(), class8693.method29804(), true);
        }
    }
    
    public List<String> method3765() {
        return this.field3743;
    }
    
    public void method3766(final String anObject) {
        if (this.field3743.isEmpty() || !this.field3743.get(this.field3743.size() - 1).equals(anObject)) {
            this.field3743.add(anObject);
        }
    }
    
    public void method3767() {
        this.field3746 = 0;
        this.field3747 = false;
    }
    
    public void method3768(final double n) {
        this.field3746 += (int)n;
        final int size = this.field3745.size();
        if (this.field3746 > size - this.method3777()) {
            this.field3746 = size - this.method3777();
        }
        if (this.field3746 <= 0) {
            this.field3746 = 0;
            this.field3747 = false;
        }
    }
    
    @Nullable
    public ITextComponent method3769(final double n, final double n2) {
        if (this.method3770()) {
            if (!this.field3742.gameSettings.field23464) {
                if (this.method3758()) {
                    final double method3774 = this.method3774();
                    final double n3 = n - 2.0;
                    final double n4 = this.field3742.method5332().method7697() - n2 - 40.0;
                    final double n5 = MathHelper.floor(n3 / method3774);
                    final double n6 = MathHelper.floor(n4 / method3774);
                    if (n5 < 0.0 || n6 < 0.0) {
                        return null;
                    }
                    final int min = Math.min(this.method3777(), this.field3745.size());
                    if (n5 <= MathHelper.floor(this.method3772() / this.method3774()) && n6 < 9 * min + min) {
                        final int n7 = (int)(n6 / 9.0 + this.field3746);
                        if (n7 >= 0) {
                            if (n7 < this.field3745.size()) {
                                final Class8693 class8693 = this.field3745.get(n7);
                                int n8 = 0;
                                for (final ITextComponent class8694 : class8693.method29803()) {
                                    if (!(class8694 instanceof StringTextComponent)) {
                                        continue;
                                    }
                                    n8 += this.field3742.fontRenderer.getStringWidth(Class8936.method31696(((StringTextComponent)class8694).getText(), false));
                                    if (n8 <= n5) {
                                        continue;
                                    }
                                    return class8694;
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }
            }
        }
        return null;
    }
    
    public boolean method3770() {
        return this.field3742.currentScreen instanceof ChatScreen;
    }
    
    public void method3771(final int n) {
        final Iterator<Class8693> iterator = this.field3745.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method29805() != n) {
                continue;
            }
            iterator.remove();
        }
        final Iterator<Class8693> iterator2 = this.field3744.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().method29805() != n) {
                continue;
            }
            iterator2.remove();
            break;
        }
    }
    
    public int method3772() {
        final int method3775 = method3775(this.field3742.gameSettings.field23402);
        final Class1925 method3776 = Minecraft.method5277().method5332();
        return MathHelper.method35651(method3775, 0, (int)((method3776.method7692() - 3) / method3776.getGuiScaleFactor()));
    }
    
    public int method3773() {
        return method3776(this.method3770() ? this.field3742.gameSettings.field23404 : this.field3742.gameSettings.field23403);
    }
    
    public double method3774() {
        return this.field3742.gameSettings.field23401;
    }
    
    public static int method3775(final double n) {
        return MathHelper.floor(n * 280.0 + 40.0);
    }
    
    public static int method3776(final double n) {
        return MathHelper.floor(n * 160.0 + 20.0);
    }
    
    public int method3777() {
        return this.method3773() / 9;
    }
    
    static {
        field3741 = LogManager.getLogger();
    }
}
