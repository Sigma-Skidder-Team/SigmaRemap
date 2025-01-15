// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.schemas.Schema;

public class Class4141 extends Class4139
{
    public Class4141(final Schema schema, final boolean b) {
        super("EntityTippedArrowFix", schema, b);
    }
    
    @Override
    public String method12372(final String a) {
        return Objects.equals(a, "TippedArrow") ? "Arrow" : a;
    }
}
