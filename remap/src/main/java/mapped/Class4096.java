// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4096 extends Item
{
    public Class4096(final Class8959 class8959) {
        super(class8959);
    }
    
    public static boolean method12339(final Class51 class51) {
        return Class4049.method12247(class51) && class51.method316("title", 8) && class51.method323("title").length() <= 32 && class51.method316("author", 8);
    }
    
    public static int method12340(final ItemStack class8321) {
        return class8321.method27657().method319("generation");
    }
    
    public static int method12341(final ItemStack class8321) {
        final Class51 method27657 = class8321.method27657();
        return (method27657 == null) ? 0 : method27657.method328("pages", 8).size();
    }
    
    @Override
    public ITextComponent method11729(final ItemStack class8321) {
        if (class8321.method27656()) {
            final String method323 = class8321.method27657().method323("title");
            if (!Class8272.method27500(method323)) {
                return new StringTextComponent(method323);
            }
        }
        return super.method11729(class8321);
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        if (class8321.method27656()) {
            final Class51 method27657 = class8321.method27657();
            final String method27658 = method27657.method323("author");
            if (!Class8272.method27500(method27658)) {
                list.add(new Class2259("book.byAuthor", new Object[] { method27658 }).applyTextStyle(TextFormatting.GRAY));
            }
            list.add(new Class2259("book.generation." + method27657.method319("generation"), new Object[0]).applyTextStyle(TextFormatting.GRAY));
        }
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (method21656.getBlock() != Class7521.field29813) {
            return Class2201.field13402;
        }
        return Class3930.method12040(method21654, method21655, method21656, class7075.method21651()) ? Class2201.field13400 : Class2201.field13402;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        class1848.method2835(method2715, class1849);
        class1848.method2859(Class8276.field33981.method8449(this));
        return Class9355.method34674(method2715);
    }
    
    public static boolean method12342(final ItemStack class8321, final Class7492 class8322, final PlayerEntity class8323) {
        final Class51 method27657 = class8321.method27657();
        if (method27657 == null || method27657.method329("resolved")) {
            return false;
        }
        method27657.method312("resolved", true);
        if (!method12339(method27657)) {
            return false;
        }
        final Class52 method27658 = method27657.method328("pages", 8);
        for (int i = 0; i < method27658.size(); ++i) {
            final String method27659 = method27658.method353(i);
            ITextComponent method27660;
            try {
                method27660 = Class9479.method35294(class8322, Class5953.method17873(method27659), class8323, 0);
            }
            catch (final Exception ex) {
                method27660 = new StringTextComponent(method27659);
            }
            method27658.set(i, Class50.method290(Class5953.method17869(method27660)));
        }
        method27657.method295("pages", method27658);
        return true;
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return true;
    }
}