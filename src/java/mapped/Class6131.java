// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import java.util.Random;

public class Class6131 extends Class6132
{
    private static final Random field24876;
    
    public Class6131(final Schema schema, final boolean b) {
        super(schema, b, "EntityZombieVillagerTypeFix", Class9451.field40626, "Zombie");
    }
    
    public Dynamic<?> method18355(Dynamic<?> dynamic) {
        if (dynamic.get("IsVillager").asBoolean(false)) {
            if (!dynamic.get("ZombieType").get().isPresent()) {
                int n = this.method18356(dynamic.get("VillagerProfession").asInt(-1));
                if (n == -1) {
                    n = this.method18356(Class6131.field24876.nextInt(6));
                }
                dynamic = dynamic.set("ZombieType", dynamic.createInt(n));
            }
            dynamic = dynamic.remove("IsVillager");
        }
        return (Dynamic<?>)dynamic;
    }
    
    private int method18356(final int n) {
        return (n >= 0 && n < 6) ? n : -1;
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18355);
    }
    
    static {
        field24876 = new Random();
    }
}
