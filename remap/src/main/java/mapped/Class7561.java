// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7561 extends DataFix
{
    public Class7561(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("HeightmapRenamingFix", this.getInputSchema().getType(Class9451.field40613), typed -> {
            final Type type;
            type.findField("Level");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), (Function)this::method23735));
        });
    }
    
    private Dynamic<?> method23735(final Dynamic<?> dynamic) {
        final Optional value = dynamic.get("Heightmaps").get();
        if (value.isPresent()) {
            Dynamic dynamic2 = value.get();
            final Optional value2 = dynamic2.get("LIQUID").get();
            if (value2.isPresent()) {
                dynamic2 = dynamic2.remove("LIQUID").set("WORLD_SURFACE_WG", (Dynamic)value2.get());
            }
            final Optional value3 = dynamic2.get("SOLID").get();
            if (value3.isPresent()) {
                dynamic2 = dynamic2.remove("SOLID").set("OCEAN_FLOOR_WG", (Dynamic)value3.get()).set("OCEAN_FLOOR", (Dynamic)value3.get());
            }
            final Optional value4 = dynamic2.get("LIGHT").get();
            if (value4.isPresent()) {
                dynamic2 = dynamic2.remove("LIGHT").set("LIGHT_BLOCKING", (Dynamic)value4.get());
            }
            final Optional value5 = dynamic2.get("RAIN").get();
            if (value5.isPresent()) {
                dynamic2 = dynamic2.remove("RAIN").set("MOTION_BLOCKING", (Dynamic)value5.get()).set("MOTION_BLOCKING_NO_LEAVES", (Dynamic)value5.get());
            }
            return (Dynamic<?>)dynamic.set("Heightmaps", dynamic2);
        }
        return dynamic;
    }
}
