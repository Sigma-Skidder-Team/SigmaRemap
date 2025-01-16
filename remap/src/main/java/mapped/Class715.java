// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import java.util.List;

public class Class715 extends Class698
{
    private Screen field3904;
    private String field3905;
    private String field3906;
    private final List<String> field3907;
    public String field3908;
    private int field3909;
    
    public Class715(final Screen field3904, final String field3905, final String field3906) {
        super(new Class2259("of.options.detailsTitle", new Object[0]));
        this.field3907 = Lists.newArrayList();
        this.field3904 = field3904;
        this.field3905 = field3905;
        this.field3906 = field3906;
        this.field3908 = Class8822.method30773("gui.done", new Object[0]);
    }
    
    @Override
    public void init() {
        this.addButton(new Class673(0, this.width / 2 - 100, this.height / 6 + 96, this.field3908));
        this.field3907.clear();
        this.field3907.addAll(this.minecraft.fontRenderer.method6626(this.field3906, this.width - 50));
    }
    
    @Override
    public void method3896(final Widget class573) {
        Config.method28894().displayGuiScreen(this.field3904);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.field3843, this.field3905, this.width / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3907.iterator();
        while (iterator.hasNext()) {
            this.drawCenteredString(this.field3843, iterator.next(), this.width / 2, n4, 16777215);
            n4 += 9;
        }
        super.render(n, n2, n3);
    }
    
    public void method3933(final int field3909) {
        this.field3909 = field3909;
        final Iterator<Widget> iterator = this.field3842.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3431 = false;
        }
    }
    
    @Override
    public void tick() {
        super.tick();
        final int field3909 = this.field3909 - 1;
        this.field3909 = field3909;
        if (field3909 == 0) {
            final Iterator<Widget> iterator = this.field3842.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
}
