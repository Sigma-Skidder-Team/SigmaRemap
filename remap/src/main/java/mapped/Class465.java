// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;
import net.minecraft.item.ItemStack;
import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class465 extends TileEntity implements INameable
{
    private ITextComponent field2747;
    private Class181 field2748;
    private Class52 field2749;
    private boolean field2750;
    private List<Pair<Class230, Class181>> field2751;
    
    public Class465() {
        super(Class5412.field22559);
        this.field2748 = Class181.field537;
    }
    
    public Class465(final Class181 field2748) {
        this();
        this.field2748 = field2748;
    }
    
    @Nullable
    public static Class52 method2382(final ItemStack class8321) {
        Class52 method355 = null;
        final Class51 method356 = class8321.method27660("BlockEntityTag");
        if (method356 != null) {
            if (method356.method316("Patterns", 9)) {
                method355 = method356.method328("Patterns", 10).method355();
            }
        }
        return method355;
    }
    
    public void method2383(final ItemStack class8321, final Class181 field2748) {
        this.field2749 = method2382(class8321);
        this.field2748 = field2748;
        this.field2751 = null;
        this.field2750 = true;
        this.field2747 = (class8321.method27667() ? class8321.method27664() : null);
    }
    
    @Override
    public ITextComponent getName() {
        return (this.field2747 == null) ? new Class2259("block.minecraft.banner", new Object[0]) : this.field2747;
    }
    
    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return this.field2747;
    }
    
    public void method2384(final ITextComponent field2747) {
        this.field2747 = field2747;
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        if (this.field2749 != null) {
            class51.method295("Patterns", this.field2749);
        }
        if (this.field2747 != null) {
            class51.method306("CustomName", Class5953.method17869(this.field2747));
        }
        return class51;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        if (class51.method316("CustomName", 8)) {
            this.field2747 = Class5953.method17871(class51.method323("CustomName"));
        }
        if (!this.method2188()) {
            this.field2748 = null;
        }
        else {
            this.field2748 = ((Class3944)this.method2194().method21696()).method12064();
        }
        this.field2749 = class51.method328("Patterns", 10);
        this.field2751 = null;
        this.field2750 = true;
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 6, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
    
    public static int method2385(final ItemStack class8321) {
        final Class51 method27660 = class8321.method27660("BlockEntityTag");
        return (method27660 != null && method27660.method315("Patterns")) ? method27660.method328("Patterns", 10).size() : 0;
    }
    
    public List<Pair<Class230, Class181>> method2386() {
        if (this.field2751 == null) {
            if (this.field2750) {
                this.field2751 = method2387(this.method2390(this::method2194), this.field2749);
            }
        }
        return this.field2751;
    }
    
    public static List<Pair<Class230, Class181>> method2387(final Class181 class181, final Class52 class182) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(Pair.of((Object)Class230.field812, (Object)class181));
        if (class182 != null) {
            for (int i = 0; i < class182.size(); ++i) {
                final Class51 method346 = class182.method346(i);
                final Class230 method347 = Class230.method860(method346.method323("Pattern"));
                if (method347 != null) {
                    arrayList.add(Pair.of((Object)method347, (Object)Class181.method819(method346.method319("Color"))));
                }
            }
        }
        return arrayList;
    }
    
    public static void method2388(final ItemStack class8321) {
        final Class51 method27660 = class8321.method27660("BlockEntityTag");
        if (method27660 != null) {
            if (method27660.method316("Patterns", 9)) {
                final Class52 method27661 = method27660.method328("Patterns", 10);
                if (!method27661.isEmpty()) {
                    method27661.remove(method27661.size() - 1);
                    if (method27661.isEmpty()) {
                        class8321.method27661("BlockEntityTag");
                    }
                }
            }
        }
    }
    
    public ItemStack method2389(final BlockState class7096) {
        final ItemStack class7097 = new ItemStack(Class3946.method12065(this.method2390(() -> class7098)));
        if (this.field2749 != null) {
            if (!this.field2749.isEmpty()) {
                class7097.method27659("BlockEntityTag").method295("Patterns", this.field2749.method355());
            }
        }
        if (this.field2747 != null) {
            class7097.method27665(this.field2747);
        }
        return class7097;
    }
    
    public Class181 method2390(final Supplier<BlockState> supplier) {
        if (this.field2748 == null) {
            this.field2748 = ((Class3944)supplier.get().method21696()).method12064();
        }
        return this.field2748;
    }
}
