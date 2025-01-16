// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class546 extends Screen
{
    private final ITextComponent field3290;
    private final List<String> field3291;
    public String field3292;
    public String field3293;
    private int field3294;
    public final BooleanConsumer field3295;
    
    public Class546(final BooleanConsumer booleanConsumer, final ITextComponent class2250, final ITextComponent class2251) {
        this(booleanConsumer, class2250, class2251, Class8822.method30773("gui.yes", new Object[0]), Class8822.method30773("gui.no", new Object[0]));
    }
    
    public Class546(final BooleanConsumer field3295, final ITextComponent class2250, final ITextComponent field3296, final String field3297, final String field3298) {
        super(class2250);
        this.field3291 = Lists.newArrayList();
        this.field3295 = field3295;
        this.field3290 = field3296;
        this.field3292 = field3297;
        this.field3293 = field3298;
    }
    
    @Override
    public String method3027() {
        return super.method3027() + ". " + this.field3290.getString();
    }
    
    @Override
    public void init() {
        super.init();
        this.method3029(new Class654(this.width / 2 - 155, this.height / 6 + 96, 150, 20, this.field3292, class654 -> this.field3295.accept(true)));
        this.method3029(new Class654(this.width / 2 - 155 + 160, this.height / 6 + 96, 150, 20, this.field3293, class654 -> this.field3295.accept(false)));
        this.field3291.clear();
        this.field3291.addAll(this.font.method6626(this.field3290.getFormattedText(), this.width - 50));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3291.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.font, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
    
    public void method3209(final int field3294) {
        this.field3294 = field3294;
        final Iterator<Class573> iterator = this.buttons.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3431 = false;
        }
    }
    
    @Override
    public void tick() {
        super.tick();
        final int field3294 = this.field3294 - 1;
        this.field3294 = field3294;
        if (field3294 == 0) {
            final Iterator<Class573> iterator = this.buttons.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        this.field3295.accept(false);
        return true;
    }
}
