// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6135 extends Class6132
{
    public Class6135(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntityShulkerBoxColorFix", Class9451.field40621, "minecraft:shulker_box");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("Color"));
    }
}
