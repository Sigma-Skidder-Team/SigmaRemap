// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class6340 extends Class6322
{
    private final Optional<ResourceLocation> field25354;
    private final boolean field25355;
    private final boolean field25356;
    
    public Class6340(final ResourceLocation value, final boolean field25355, final boolean field25356) {
        super("texture", () -> {
            Class8726.method30040();
            Minecraft.method5277().method5290();
            final Class1663 class1933;
            class1933.method5849(class1932);
            class1933.method5860().method5868(b, b2);
            return;
        }, () -> {});
        this.field25354 = Optional.of(value);
        this.field25355 = field25355;
        this.field25356 = field25356;
    }
    
    public Class6340() {
        super("texture", () -> Class8726.method30041(), () -> Class8726.method30040());
        this.field25354 = Optional.empty();
        this.field25355 = false;
        this.field25356 = false;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6340 class6340 = (Class6340)o;
            if (this.field25354.equals(class6340.field25354)) {
                if (this.field25355 == class6340.field25355) {
                    if (this.field25356 == class6340.field25356) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field25354.hashCode();
    }
    
    public Optional<ResourceLocation> method18842() {
        return this.field25354;
    }
}
