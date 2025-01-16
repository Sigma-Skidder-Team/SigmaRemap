// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class528 extends Screen
{
    private final Runnable field3158;
    public final ITextComponent field3159;
    private final List<String> field3160;
    public final String field3161;
    private int field3162;
    
    public Class528(final Runnable runnable, final ITextComponent class2250, final ITextComponent class2251) {
        this(runnable, class2250, class2251, "gui.back");
    }
    
    public Class528(final Runnable field3158, final ITextComponent class2250, final ITextComponent field3159, final String s) {
        super(class2250);
        this.field3160 = Lists.newArrayList();
        this.field3158 = field3158;
        this.field3159 = field3159;
        this.field3161 = Class8822.method30773(s, new Object[0]);
    }
    
    @Override
    public void init() {
        super.init();
        this.method3029(new Class654(this.width / 2 - 100, this.height / 6 + 168, 200, 20, this.field3161, class654 -> this.field3158.run()));
        this.field3160.clear();
        this.field3160.addAll(this.font.method6626(this.field3159.getFormattedText(), this.width - 50));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3160.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.font, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
    
    @Override
    public void tick() {
        super.tick();
        final int field3162 = this.field3162 - 1;
        this.field3162 = field3162;
        if (field3162 == 0) {
            final Iterator<Class573> iterator = this.buttons.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
}
