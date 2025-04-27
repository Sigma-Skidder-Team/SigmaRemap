// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.Random;
import io.netty.util.internal.ThreadLocalRandom;
import net.minecraft.util.math.MathHelper;

import java.util.UUID;
import java.util.function.Supplier;

public class Class7919
{
    private final double field32509;
    private final Class2157 field32510;
    private final Supplier<String> field32511;
    private final UUID field32512;
    private boolean field32513;
    
    public Class7919(final String s, final double n, final Class2157 class2157) {
        this(MathHelper.method35690(ThreadLocalRandom.current()), () -> s2, n, class2157);
    }
    
    public Class7919(final UUID uuid, final String s, final double n, final Class2157 class2157) {
        this(uuid, () -> s2, n, class2157);
    }
    
    public Class7919(final UUID field32512, final Supplier<String> field32513, final double field32514, final Class2157 field32515) {
        this.field32513 = true;
        this.field32512 = field32512;
        this.field32511 = field32513;
        this.field32509 = field32514;
        this.field32510 = field32515;
    }
    
    public UUID method25635() {
        return this.field32512;
    }
    
    public String method25636() {
        return this.field32511.get();
    }
    
    public Class2157 method25637() {
        return this.field32510;
    }
    
    public double method25638() {
        return this.field32509;
    }
    
    public boolean method25639() {
        return this.field32513;
    }
    
    public Class7919 method25640(final boolean field32513) {
        this.field32513 = field32513;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.field32512, ((Class7919)o).field32512));
    }
    
    @Override
    public int hashCode() {
        return (this.field32512 == null) ? 0 : this.field32512.hashCode();
    }
    
    @Override
    public String toString() {
        return "AttributeModifier{amount=" + this.field32509 + ", operation=" + this.field32510 + ", name='" + this.field32511.get() + '\'' + ", id=" + this.field32512 + ", serialize=" + this.field32513 + '}';
    }
}
