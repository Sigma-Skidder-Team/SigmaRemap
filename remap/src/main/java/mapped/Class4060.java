// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.Collection;

public class Class4060 extends Item
{
    public Class4060(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return true;
    }
    
    @Override
    public boolean method11703(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        if (!class7097.isRemote) {
            this.method12265(class7099, class7096, class7097, class7098, false, class7099.method2715(Class316.field1877));
        }
        return false;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final PlayerEntity method21652 = class7075.method21652();
        final World method21653 = class7075.method21654();
        if (!method21653.isRemote) {
            if (method21652 != null) {
                final BlockPos method21654 = class7075.method21639();
                this.method12265(method21652, method21653.getBlockState(method21654), method21653, method21654, true, class7075.method21651());
            }
        }
        return Class2201.field13400;
    }
    
    private void method12265(final PlayerEntity playerEntity, final BlockState class513, final Class1851 class514, final BlockPos class515, final boolean b, final ItemStack class516) {
        if (playerEntity.method2908()) {
            final Block method21696 = class513.getBlock();
            final StateContainer<Block, BlockState> method21697 = method21696.getStateContainer();
            final Collection method21698 = method21697.method32905();
            final String string = Registry.BLOCK.getKey(method21696).toString();
            if (!method21698.isEmpty()) {
                final Class51 method21699 = class516.method27659("DebugProperty");
                IProperty method21700 = method21697.getProperty(method21699.method323(string));
                if (!b) {
                    final IProperty<?> class517 = method12267(method21698, method21700, playerEntity.method2804());
                    final String method21701 = class517.getName();
                    method21699.method306(string, method21701);
                    method12268(playerEntity, new Class2259(this.method11717() + ".select", new Object[] { method21701, method12269(class513, class517) }));
                }
                else {
                    if (method21700 == null) {
                        method21700 = (IProperty)method21698.iterator().next();
                    }
                    final BlockState method21702 = method12266(class513, method21700, playerEntity.method2804());
                    class514.setBlockState(class515, method21702, 18);
                    method12268(playerEntity, new Class2259(this.method11717() + ".update", new Object[] { method21700.getName(), method12269(method21702, method21700) }));
                }
            }
            else {
                method12268(playerEntity, new Class2259(this.method11717() + ".empty", new Object[] { string }));
            }
        }
    }
    
    private static <T extends Comparable<T>> BlockState method12266(final BlockState class7096, final IProperty<T> class7097, final boolean b) {
        return ((StateHolder<O, BlockState>)class7096).with(class7097, (Comparable)method12267((Iterable<V>)class7097.getAllowedValues(), (V)class7096.get((IProperty<T>)class7097), b));
    }
    
    private static <T> T method12267(final Iterable<T> iterable, final T t, final boolean b) {
        return b ? Class8349.method27849(iterable, t) : Class8349.method27848(iterable, t);
    }
    
    private static void method12268(final PlayerEntity playerEntity, final ITextComponent class513) {
        ((Class513) playerEntity).method2941(class513, Class285.field1574);
    }
    
    private static <T extends Comparable<T>> String method12269(final BlockState class7096, final IProperty<T> class7097) {
        return class7097.getName(class7096.get(class7097));
    }
}
