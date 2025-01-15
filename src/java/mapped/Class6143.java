// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6143 extends Class6132
{
    public Class6143(final Schema schema, final boolean b) {
        super(schema, b, "EntityItemFrameDirectionFix", Class9451.field40626, "minecraft:item_frame");
    }
    
    public Dynamic<?> method18368(final Dynamic<?> dynamic) {
        return (Dynamic<?>)dynamic.set("Facing", dynamic.createByte(method18369(dynamic.get("Facing").asByte((byte)0))));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18368);
    }
    
    private static byte method18369(final byte b) {
        switch (b) {
            case 0: {
                return 3;
            }
            case 1: {
                return 4;
            }
            default: {
                return 2;
            }
            case 3: {
                return 5;
            }
        }
    }
}
