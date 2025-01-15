// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class8651<L, R>
{
    private Optional<L> field36315;
    private Optional<R> field36316;
    
    private Class8651(final Optional<L> field36315, final Optional<R> field36316) {
        this.field36315 = field36315;
        this.field36316 = field36316;
        if (!this.field36315.isPresent() && !this.field36316.isPresent()) {
            throw new IllegalArgumentException("Both left and right are not present");
        }
        if (this.field36315.isPresent() && this.field36316.isPresent()) {
            throw new IllegalArgumentException("Both left and right are present");
        }
    }
    
    public Optional<L> method29436() {
        return this.field36315;
    }
    
    public Optional<R> method29437() {
        return this.field36316;
    }
    
    public static <L, R> Class8651<L, R> method29438(final L value) {
        return new Class8651<L, R>(Optional.of(value), Optional.empty());
    }
    
    public static <L, R> Class8651 method29439(final R value) {
        return new Class8651(Optional.empty(), (Optional<R>)Optional.of(value));
    }
}
