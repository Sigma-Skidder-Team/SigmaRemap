// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import net.minecraft.util.text.ITextComponent;

import java.util.Map;

public class Class8467
{
    private static String[] field34748;
    private final MinecraftServer field34749;
    private final Map<ResourceLocation, Class6878> field34750;
    
    public Class8467(final MinecraftServer field34749) {
        this.field34750 = Maps.newHashMap();
        this.field34749 = field34749;
    }
    
    @Nullable
    public Class6878 method28260(final ResourceLocation class1932) {
        return this.field34750.get(class1932);
    }
    
    public Class6878 method28261(final ResourceLocation class1932, final ITextComponent class1933) {
        final Class6878 class1934 = new Class6878(class1932, class1933);
        this.field34750.put(class1932, class1934);
        return class1934;
    }
    
    public void method28262(final Class6878 class6878) {
        this.field34750.remove(class6878.method21048());
    }
    
    public Collection<ResourceLocation> method28263() {
        return this.field34750.keySet();
    }
    
    public Collection<Class6878> method28264() {
        return this.field34750.values();
    }
    
    public CompoundNBT method28265() {
        final CompoundNBT class51 = new CompoundNBT();
        for (final Class6878 class52 : this.field34750.values()) {
            class51.put(class52.method21048().toString(), class52.method21059());
        }
        return class51;
    }
    
    public void method28266(final CompoundNBT class51) {
        for (final String s : class51.keySet()) {
            final ResourceLocation class52 = new ResourceLocation(s);
            this.field34750.put(class52, Class6878.method21060(class51.getCompound(s), class52));
        }
    }
    
    public void method28267(final Class513 class513) {
        final Iterator<Class6878> iterator = this.field34750.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method21061(class513);
        }
    }
    
    public void method28268(final Class513 class513) {
        final Iterator<Class6878> iterator = this.field34750.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method21062(class513);
        }
    }
}
