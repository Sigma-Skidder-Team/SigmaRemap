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
    public String getNarrationMessage() {
        return super.getNarrationMessage() + ". " + this.field3290.getString();
    }
    
    @Override
    public void init() {
        super.init();
        this.addButton(new Class654(this.width / 2 - 155, this.height / 6 + 96, 150, 20, this.field3292, class654 -> this.field3295.accept(true)));
        this.addButton(new Class654(this.width / 2 - 155 + 160, this.height / 6 + 96, 150, 20, this.field3293, class654 -> this.field3295.accept(false)));
        this.field3291.clear();
        this.field3291.addAll(this.font.method6626(this.field3290.getFormattedText(), this.width - 50));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3291.iterator();
        while (iterator.hasNext()) {
            this.drawCenteredString(this.font, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.render(n, n2, n3);
    }
    
    public void method3209(final int field3294) {
        this.field3294 = field3294;
        final Iterator<Widget> iterator = this.buttons.iterator();
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
            final Iterator<Widget> iterator = this.buttons.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode != 256) {
            return super.keyPressed(keyCode, n2, n3);
        }
        this.field3295.accept(false);
        return true;
    }
}
