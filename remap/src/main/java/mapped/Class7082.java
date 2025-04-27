// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

public class Class7082 implements Class7079
{
    private static final ITextComponent field27585;
    private static final ITextComponent field27586;
    private final Class9106 field27587;
    private Class6869 field27588;
    private int field27589;
    private int field27590;
    
    public Class7082(final Class9106 field27587) {
        this.field27587 = field27587;
    }
    
    @Override
    public void method21655() {
        ++this.field27589;
        if (this.field27587.method32928() == Class101.field298) {
            if (this.field27589 == 1) {
                final ClientPlayerEntity field4684 = this.field27587.method32927().player;
                if (field4684 != null) {
                    if (field4684.inventory.method2377(Class7855.field32250)) {
                        this.field27587.method32926(Class2012.field11443);
                        return;
                    }
                    if (Class7080.method21663(field4684)) {
                        this.field27587.method32926(Class2012.field11443);
                        return;
                    }
                }
            }
            if (this.field27589 >= 600 || this.field27590 > 3) {
                if (this.field27588 == null) {
                    this.field27588 = new Class6869(Class2240.field13769, Class7082.field27585, Class7082.field27586, true);
                    this.field27587.method32927().method5318().method3852(this.field27588);
                }
            }
        }
        else {
            this.field27587.method32926(Class2012.field11444);
        }
    }
    
    @Override
    public void method21656() {
        if (this.field27588 != null) {
            this.field27588.method20985();
            this.field27588 = null;
        }
    }
    
    @Override
    public void method21660(final ClientWorld clientWorld, final BlockPos class1849, final BlockState class1850, final float n) {
        final boolean method21755 = class1850.method21755(Class7188.field27893);
        if (method21755 && n > 0.0f) {
            if (this.field27588 != null) {
                this.field27588.method20986(n);
            }
            if (n >= 1.0f) {
                this.field27587.method32926(Class2012.field11442);
            }
        }
        else if (this.field27588 == null) {
            if (method21755) {
                ++this.field27590;
            }
        }
        else {
            this.field27588.method20986(0.0f);
        }
    }
    
    @Override
    public void method21662(final ItemStack class8321) {
        if (Class7855.field32250.method25618(class8321.getItem())) {
            this.field27587.method32926(Class2012.field11443);
        }
    }
    
    static {
        field27585 = new Class2259("tutorial.punch_tree.title");
        field27586 = new Class2259("tutorial.punch_tree.description", Class9106.method32929("attack"));
    }
}
