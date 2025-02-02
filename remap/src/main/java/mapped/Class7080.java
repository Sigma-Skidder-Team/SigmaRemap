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
                final ClientPlayerEntity field4684 = this.field27577.method32927().player;
                if (field4684 != null) {
                    final Iterator<Block> iterator = Class7080.field27574.iterator();
                    while (iterator.hasNext()) {
                        if (!field4684.inventory.method2376(new ItemStack(iterator.next()))) {
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
    public void method21659(final ClientWorld clientWorld, final RayTraceResult class1849) {
        if (class1849.getType() == RayTraceResult.Type.BLOCK) {
            if (Class7080.field27574.contains(clientWorld.getBlockState(((BlockRayTraceResult)class1849).getPos()).method21696())) {
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
    
    public static boolean method21663(final ClientPlayerEntity clientPlayerEntity) {
        final Iterator<Block> iterator = Class7080.field27574.iterator();
        while (iterator.hasNext()) {
            if (clientPlayerEntity.method4121().method23091(Class8276.field33979.method8449(iterator.next())) <= 0) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    static {
        field27574 = Sets.newHashSet((Object[])new Block[] { Blocks.field29181, Blocks.field29182, Blocks.field29183, Blocks.field29184, Blocks.field29185, Blocks.field29186, Blocks.field29193, Blocks.field29194, Blocks.field29195, Blocks.field29196, Blocks.field29197, Blocks.field29198, Blocks.field29205, Blocks.field29206, Blocks.field29207, Blocks.field29208, Blocks.field29209, Blocks.field29210 });
        field27575 = new Class2259("tutorial.find_tree.title", new Object[0]);
        field27576 = new Class2259("tutorial.find_tree.description", new Object[0]);
    }
}
