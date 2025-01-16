// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.OptionalDouble;

public class Class6327 extends Class6322
{
    private final OptionalDouble field25324;
    
    public Class6327(final OptionalDouble field25324) {
        super("line_width", () -> {
            if (!Objects.equals(a, OptionalDouble.of(1.0))) {
                if (!a.isPresent()) {
                    Class8726.method30072(Math.max(2.5f, Minecraft.method5277().method5332().method7692() / 1920.0f * 2.5f));
                }
                else {
                    Class8726.method30072((float)a.getAsDouble());
                }
            }
            return;
        }, () -> {
            if (!Objects.equals(a2, OptionalDouble.of(1.0))) {
                Class8726.method30072(1.0f);
            }
            return;
        });
        this.field25324 = field25324;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && super.equals(o) && Objects.equals(this.field25324, ((Class6327)o).field25324));
    }
    
    @Override
    public int hashCode() {
        return Class7827.method25283(super.hashCode(), this.field25324);
    }
}
