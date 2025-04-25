// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class6994 implements Class6991
{
    private static String[] field27286;
    private final Class6749 field27287;
    private final ResourceLocation field27288;
    private final List<Class9081> field27289;
    public final /* synthetic */ Class6990 field27290;
    
    public Class6994(final Class6990 field27290, final Class6749 field27291) {
        this.field27290 = field27290;
        this.field27287 = field27291;
        this.field27289 = Lists.newArrayList();
        final Iterator<String> iterator = field27291.method20547().iterator();
        while (iterator.hasNext()) {
            final Class9081 method17372 = Minecraft.getInstance().method5269().method17372(iterator.next());
            if (method17372 == null) {
                continue;
            }
            this.field27289.add(method17372);
        }
        if (!this.field27289.isEmpty()) {
            final String name = this.field27289.get(new Random().nextInt(this.field27289.size())).method32719().getName();
            Class754.method4101(this.field27288 = Class754.method4102(name), name);
        }
        else {
            this.field27288 = Class7634.method24003();
        }
    }
    
    @Override
    public void method21402(final Class9039 class9039) {
        class9039.method32499(new Class6987(this.field27289));
    }
    
    @Override
    public ITextComponent method21403() {
        return this.field27287.method20540();
    }
    
    @Override
    public void method21404(final float n, final int n2) {
        final Integer method8256 = this.field27287.getColor().getColor();
        if (method8256 != null) {
            AbstractGui.fill(1, 1, 15, 15, MathHelper.method35684((method8256 >> 16 & 0xFF) / 255.0f * n, (method8256 >> 8 & 0xFF) / 255.0f * n, (method8256 & 0xFF) / 255.0f * n) | n2 << 24);
        }
        Minecraft.getInstance().method5290().method5849(this.field27288);
        RenderSystem.method30068(n, n, n, n2 / 255.0f);
        AbstractGui.blit(2, 2, 12, 12, 8.0f, 8.0f, 8, 8, 64, 64);
        AbstractGui.blit(2, 2, 12, 12, 40.0f, 8.0f, 8, 8, 64, 64);
    }
    
    @Override
    public boolean method21405() {
        return !this.field27289.isEmpty();
    }
}
