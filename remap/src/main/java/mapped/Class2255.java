// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.base.Joiner;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import org.apache.logging.log4j.Logger;

public abstract class Class2255 extends TextComponent implements Class2253
{
    private static final Logger field13800;
    public final boolean field13801;
    public final String field13802;
    public final NBTPath field13803;
    
    @Nullable
    private static NBTPath method8480(final String s) {
        try {
            return new NBTPathArgument().parse(new StringReader(s));
        }
        catch (final CommandSyntaxException ex) {
            return null;
        }
    }
    
    public Class2255(final String s, final boolean b) {
        this(s, method8480(s), b);
    }
    
    public Class2255(final String field13802, final NBTPath field13803, final boolean field13804) {
        this.field13802 = field13802;
        this.field13803 = field13803;
        this.field13801 = field13804;
    }
    
    public abstract Stream<CompoundNBT> method8481(final Class7492 p0) throws CommandSyntaxException;
    
    @Override
    public String getUnformattedComponentText() {
        return "";
    }
    
    public String method8482() {
        return this.field13802;
    }
    
    public boolean method8483() {
        return this.field13801;
    }
    
    @Override
    public ITextComponent method8473(final Class7492 class7492, final Entity class7493, final int n) throws CommandSyntaxException {
        if (class7492 != null && this.field13803 != null) {
            final Stream<Object> map = this.method8481(class7492).flatMap(class7494 -> {
                try {
                    return this.field13803.func_218071_a(class7494).stream();
                }
                catch (final CommandSyntaxException ex) {
                    return Stream.empty();
                }
            }).map((Function<? super Object, ?>) INBT::getString);
            return this.field13801 ? ((ITextComponent)map.flatMap(str -> {
                try {
                    return Stream.of(Class9479.method35294(class7495, Class5953.method17871(str), class7496, n2));
                }
                catch (final Exception ex2) {
                    Class2255.field13800.warn("Failed to parse component: " + str, (Throwable)ex2);
                    return Stream.of(new ITextComponent[0]);
                }
            }).reduce((class7497, class7499) -> class7497.appendText(", ").appendSibling(class7499)).orElse(new StringTextComponent(""))) : new StringTextComponent(Joiner.on(", ").join((Iterator)map.iterator()));
        }
        return new StringTextComponent("");
    }
    
    static {
        field13800 = LogManager.getLogger();
    }
}
