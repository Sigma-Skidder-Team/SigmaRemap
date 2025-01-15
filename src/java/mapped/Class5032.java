// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class5032 extends Class5033
{
    public Class5032(final Schema schema, final boolean b) {
        super("EntityZombieSplitFix", schema, b);
    }
    
    @Override
    public Pair<String, Dynamic<?>> method15323(final String b, Dynamic<?> set) {
        if (Objects.equals("Zombie", b)) {
            String s = "Zombie";
            final int int1 = set.get("ZombieType").asInt(0);
            switch (int1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: {
                    s = "ZombieVillager";
                    set = set.set("Profession", set.createInt(int1 - 1));
                    break;
                }
                case 6: {
                    s = "Husk";
                    break;
                }
            }
            return (Pair<String, Dynamic<?>>)Pair.of((Object)s, (Object)set.remove("ZombieType"));
        }
        return (Pair<String, Dynamic<?>>)Pair.of((Object)b, (Object)set);
    }
}
