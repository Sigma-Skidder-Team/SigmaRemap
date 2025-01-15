// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.arguments.StringArgumentType;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.function.Supplier;
import org.apache.logging.log4j.Logger;

public class Class1921 implements AutoCloseable
{
    private static final Logger field10442;
    private static final Class8545 field10443;
    private final String field10444;
    private final Supplier<Class1727> field10445;
    private final ITextComponent field10446;
    private final ITextComponent field10447;
    private final Class2009 field10448;
    private final Class2043 field10449;
    private final boolean field10450;
    private final boolean field10451;
    
    @Nullable
    public static <T extends Class1921> T method7615(final String s, final boolean b, final Supplier<Class1727> supplier, final Class6712<T> class6712, final Class2043 class6713) {
        try (final Class1727 class6714 = supplier.get()) {
            Class8545 field10443 = class6714.method6101((Class5092<Class8545>)Class8545.field35888);
            if (b && field10443 == null) {
                Class1921.field10442.error("Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!");
                field10443 = Class1921.field10443;
            }
            if (field10443 != null) {
                return class6712.method20389(s, b, supplier, class6714, field10443, class6713);
            }
            Class1921.field10442.warn("Couldn't find pack meta for pack {}", (Object)s);
            return null;
        }
        catch (final IOException ex) {
            Class1921.field10442.warn("Couldn't get pack info for: {}", (Object)ex.toString());
        }
        return null;
    }
    
    public Class1921(final String field10444, final boolean field10445, final Supplier<Class1727> field10446, final ITextComponent field10447, final ITextComponent field10448, final Class2009 field10449, final Class2043 field10450, final boolean field10451) {
        this.field10444 = field10444;
        this.field10445 = field10446;
        this.field10446 = field10447;
        this.field10447 = field10448;
        this.field10448 = field10449;
        this.field10450 = field10445;
        this.field10449 = field10450;
        this.field10451 = field10451;
    }
    
    public Class1921(final String s, final boolean b, final Supplier<Class1727> supplier, final Class1727 class1727, final Class8545 class1728, final Class2043 class1729) {
        this(s, b, supplier, new StringTextComponent(class1727.method6102()), class1728.method28688(), Class2009.method8044(class1728.method28689()), class1729, false);
    }
    
    public ITextComponent method7616() {
        return this.field10446;
    }
    
    public ITextComponent method7617() {
        return this.field10447;
    }
    
    public ITextComponent method7618(final boolean b) {
        return Class9479.method35299(new StringTextComponent(this.field10444)).applyTextStyle(class8768 -> {
            class8768.setColor(b2 ? TextFormatting.GREEN : TextFormatting.RED).method30421(StringArgumentType.escapeIfRequired(this.field10444));
            new Class9390(Class1961.field10697, new StringTextComponent("").appendSibling(this.field10446).appendText("\n").appendSibling(this.field10447));
            final Class9390 class8769;
            final Object o;
            ((Style)o).method30420(class8769);
        });
    }
    
    public Class2009 method7619() {
        return this.field10448;
    }
    
    public Class1727 method7620() {
        return this.field10445.get();
    }
    
    public String method7621() {
        return this.field10444;
    }
    
    public boolean method7622() {
        return this.field10450;
    }
    
    public boolean method7623() {
        return this.field10451;
    }
    
    public Class2043 method7624() {
        return this.field10449;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class1921 && this.field10444.equals(((Class1921)o).field10444));
    }
    
    @Override
    public int hashCode() {
        return this.field10444.hashCode();
    }
    
    @Override
    public void close() {
    }
    
    static {
        field10442 = LogManager.getLogger();
        field10443 = new Class8545(new Class2259("resourcePack.broken_assets", new Object[0]).applyTextStyles(TextFormatting.RED, TextFormatting.ITALIC), Class9528.method35579().getPackVersion());
    }
}
