// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;

public class Class7081 implements Class7079
{
    private static final ITextComponent field27580;
    private static final ITextComponent field27581;
    private final Class9106 field27582;
    private Class6869 field27583;
    private int field27584;
    
    public Class7081(final Class9106 field27582) {
        this.field27582 = field27582;
    }
    
    @Override
    public void method21655() {
        ++this.field27584;
        if (this.field27582.method32928() == Class101.field298) {
            if (this.field27584 == 1) {
                final Class756 field4684 = this.field27582.method32927().player;
                if (field4684 != null) {
                    if (field4684.field3006.method2377(Class7855.field32237)) {
                        this.field27582.method32926(Class2012.field11444);
                        return;
                    }
                    if (method21664(field4684, Class7855.field32237)) {
                        this.field27582.method32926(Class2012.field11444);
                        return;
                    }
                }
            }
            if (this.field27584 >= 1200) {
                if (this.field27583 == null) {
                    this.field27583 = new Class6869(Class2240.field13771, Class7081.field27580, Class7081.field27581, false);
                    this.field27582.method32927().method5318().method3852(this.field27583);
                }
            }
        }
        else {
            this.field27582.method32926(Class2012.field11444);
        }
    }
    
    @Override
    public void method21656() {
        if (this.field27583 != null) {
            this.field27583.method20985();
            this.field27583 = null;
        }
    }
    
    @Override
    public void method21662(final ItemStack class8321) {
        if (Class7855.field32237.method25618(class8321.getItem())) {
            this.field27582.method32926(Class2012.field11444);
        }
    }
    
    public static boolean method21664(final Class756 class756, final Class7909<Item> class757) {
        final Iterator<Item> iterator = class757.method25616().iterator();
        while (iterator.hasNext()) {
            if (class756.method4121().method23091(Class8276.field33980.method8449(iterator.next())) <= 0) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    static {
        field27580 = new Class2259("tutorial.craft_planks.title", new Object[0]);
        field27581 = new Class2259("tutorial.craft_planks.description", new Object[0]);
    }
}
