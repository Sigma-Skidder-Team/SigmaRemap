// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.Set;

public class Class7080 implements Class7079
{
    private static final Set<Block> field27574;
    private static final ITextComponent field27575;
    private static final ITextComponent field27576;
    private final Class9106 field27577;
    private Class6869 field27578;
    private int field27579;
    
    public Class7080(final Class9106 field27577) {
        this.field27577 = field27577;
    }
    
    @Override
    public void method21655() {
        ++this.field27579;
        if (this.field27577.method32928() == Class101.field298) {
            if (this.field27579 == 1) {
                final Class756 field4684 = this.field27577.method32927().player;
                if (field4684 != null) {
                    final Iterator<Block> iterator = Class7080.field27574.iterator();
                    while (iterator.hasNext()) {
                        if (!field4684.field3006.method2376(new ItemStack(iterator.next()))) {
                            continue;
                        }
                        this.field27577.method32926(Class2012.field11443);
                        return;
                    }
                    if (method21663(field4684)) {
                        this.field27577.method32926(Class2012.field11443);
                        return;
                    }
                }
            }
            if (this.field27579 >= 6000) {
                if (this.field27578 == null) {
                    this.field27578 = new Class6869(Class2240.field13769, Class7080.field27575, Class7080.field27576, false);
                    this.field27577.method32927().method5318().method3852(this.field27578);
                }
            }
        }
        else {
            this.field27577.method32926(Class2012.field11444);
        }
    }
    
    @Override
    public void method21656() {
        if (this.field27578 != null) {
            this.field27578.method20985();
            this.field27578 = null;
        }
    }
    
    @Override
    public void method21659(final Class1848 class1848, final RayTraceResult class1849) {
        if (class1849.getType() == RayTraceResult.Type.BLOCK) {
            if (Class7080.field27574.contains(class1848.getBlockState(((BlockRayTraceResult)class1849).getPos()).method21696())) {
                this.field27577.method32926(Class2012.field11441);
            }
        }
    }
    
    @Override
    public void method21662(final ItemStack class8321) {
        final Iterator<Block> iterator = Class7080.field27574.iterator();
        while (iterator.hasNext()) {
            if (class8321.getItem() != iterator.next().method11704()) {
                continue;
            }
            this.field27577.method32926(Class2012.field11443);
        }
    }
    
    public static boolean method21663(final Class756 class756) {
        final Iterator<Block> iterator = Class7080.field27574.iterator();
        while (iterator.hasNext()) {
            if (class756.method4121().method23091(Class8276.field33979.method8449(iterator.next())) <= 0) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    static {
        field27574 = Sets.newHashSet((Object[])new Block[] { Class7521.field29181, Class7521.field29182, Class7521.field29183, Class7521.field29184, Class7521.field29185, Class7521.field29186, Class7521.field29193, Class7521.field29194, Class7521.field29195, Class7521.field29196, Class7521.field29197, Class7521.field29198, Class7521.field29205, Class7521.field29206, Class7521.field29207, Class7521.field29208, Class7521.field29209, Class7521.field29210 });
        field27575 = new Class2259("tutorial.find_tree.title", new Object[0]);
        field27576 = new Class2259("tutorial.find_tree.description", new Object[0]);
    }
}
