// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Objects;
import javax.annotation.Nullable;

public class Class9323
{
    private static String[] field40027;
    private final Class2095 field40028;
    private final byte field40029;
    private final byte field40030;
    private final byte field40031;
    private final ITextComponent field40032;
    
    public Class9323(final Class2095 field40028, final byte field40029, final byte field40030, final byte field40031, final ITextComponent field40032) {
        this.field40028 = field40028;
        this.field40029 = field40029;
        this.field40030 = field40030;
        this.field40031 = field40031;
        this.field40032 = field40032;
    }
    
    public byte method34522() {
        return this.field40028.method8212();
    }
    
    public Class2095 method34523() {
        return this.field40028;
    }
    
    public byte method34524() {
        return this.field40029;
    }
    
    public byte method34525() {
        return this.field40030;
    }
    
    public byte method34526() {
        return this.field40031;
    }
    
    public boolean method34527() {
        return this.field40028.method8213();
    }
    
    @Nullable
    public ITextComponent method34528() {
        return this.field40032;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class9323) {
            final Class9323 class9323 = (Class9323)o;
            return this.field40028 == class9323.field40028 && this.field40031 == class9323.field40031 && this.field40029 == class9323.field40029 && this.field40030 == class9323.field40030 && Objects.equals(this.field40032, class9323.field40032);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.field40028.method8212() + this.field40029) + this.field40030) + this.field40031) + Objects.hashCode(this.field40032);
    }
}
