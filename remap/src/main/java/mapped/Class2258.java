// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Objects;
import java.util.stream.Stream;

public class Class2258 extends Class2255
{
    private final ResourceLocation field13808;
    
    public Class2258(final String s, final boolean b, final ResourceLocation field13808) {
        super(s, b);
        this.field13808 = field13808;
    }
    
    public Class2258(final String s, final NBTPath class8570, final boolean b, final ResourceLocation field13808) {
        super(s, class8570, b);
        this.field13808 = field13808;
    }
    
    public ResourceLocation method8491() {
        return this.field13808;
    }
    
    @Override
    public ITextComponent shallowCopy() {
        return new Class2258(this.field13802, this.field13803, this.field13801, this.field13808);
    }
    
    @Override
    public Stream<CompoundNBT> method8481(final Class7492 class7492) {
        return Stream.of(class7492.method23255().method1580().method31805(this.field13808));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2258) {
            final Class2258 class2258 = (Class2258)o;
            if (Objects.equals(this.field13808, class2258.field13808)) {
                if (Objects.equals(this.field13802, class2258.field13802)) {
                    if (super.equals(o)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "StorageNbtComponent{id='" + this.field13808 + '\'' + "path='" + this.field13802 + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
}
