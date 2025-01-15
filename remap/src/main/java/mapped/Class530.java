// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class530 extends Class527
{
    private final Class527 field3168;
    private final ITextComponent field3169;
    private final ITextComponent field3170;
    private final ITextComponent field3171;
    private final ITextComponent field3172;
    private final ITextComponent field3173;
    private Class682 field3174;
    private final List<String> field3175;
    
    public Class530(final Class527 field3168) {
        super(Class7895.field32402);
        this.field3169 = new Class2259("multiplayerWarning.header", new Object[0]).method8469(Class2116.field12326);
        this.field3170 = new Class2259("multiplayerWarning.message", new Object[0]);
        this.field3171 = new Class2259("multiplayerWarning.check", new Object[0]);
        this.field3172 = new Class2259("gui.proceed", new Object[0]);
        this.field3173 = new Class2259("gui.back", new Object[0]);
        this.field3175 = Lists.newArrayList();
        this.field3168 = field3168;
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3175.clear();
        this.field3175.addAll(this.field3156.method6626(this.field3170.method8461(), this.field3152 - 50));
        final int n = (this.field3175.size() + 1) * 9;
        this.method3029(new Class654(this.field3152 / 2 - 155, 100 + n, 150, 20, this.field3172.method8461(), class654 -> {
            if (this.field3174.method3743()) {
                this.field3150.field4648.field23434 = true;
                this.field3150.field4648.method17121();
            }
            this.field3150.method5244(new Class720(this.field3168));
        }));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 160, 100 + n, 150, 20, this.field3173.method8461(), class654 -> this.field3150.method5244(this.field3168)));
        this.method3029(this.field3174 = new Class682(this.field3152 / 2 - 155 + 80, 76 + n, 150, 20, this.field3171.method8461(), false));
    }
    
    @Override
    public String method3027() {
        return this.field3169.getString() + "\n" + this.field3170.getString();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3043(0);
        this.method3295(this.field3156, this.field3169.method8461(), this.field3152 / 2, 30, 16777215);
        int n4 = 70;
        final Iterator<String> iterator = this.field3175.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.field3156, iterator.next(), this.field3152 / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
}
