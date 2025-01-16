// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class9061
{
    private static final Logger field38364;
    private final BlockPos field38365;
    private final Class1849 field38366;
    private final Class8564 field38367;
    private final List<Class9083> field38368;
    private final List<Pair<Class8928, Collection<Class9083>>> field38369;
    private Class7333 field38370;
    private int field38371;
    private Mutable field38372;
    private int field38373;
    
    public Class9061(final Collection<Class8928> collection, final BlockPos field38365, final Class1849 field38366, final Class8564 field38367) {
        this.field38368 = Lists.newArrayList();
        this.field38369 = Lists.newArrayList();
        this.field38371 = 0;
        this.field38373 = 0;
        this.field38372 = new Mutable(field38365);
        this.field38365 = field38365;
        this.field38366 = field38366;
        this.field38367 = field38367;
        collection.forEach(class1850 -> {
            Lists.newArrayList();
            class1850.method31484().iterator();
            final Iterator iterator;
            final ArrayList list;
            while (iterator.hasNext()) {
                final Class9083 class1851 = new Class9083(iterator.next(), class1849);
                list.add(class1851);
                this.field38368.add(class1851);
            }
            this.field38369.add((Pair<Class8928, Collection<Class9083>>)Pair.of((Object)class1850, (Object)list));
        });
    }
    
    public List<Class9083> method32626() {
        return this.field38368;
    }
    
    public void method32627() {
        this.method32628(0);
    }
    
    private void method32628(final int field38371) {
        this.field38371 = field38371;
        this.field38370 = new Class7333();
        if (field38371 < this.field38369.size()) {
            final Pair pair = this.field38369.get(this.field38371);
            final Class8928 class8928 = (Class8928)pair.getFirst();
            final Collection collection = (Collection)pair.getSecond();
            this.method32630(collection);
            class8928.method31485(this.field38366);
            Class9061.field38364.info("Running test batch '" + class8928.method31483() + "' (" + collection.size() + " tests)...");
            collection.forEach(class8929 -> {
                this.field38370.method22485(class8929);
                this.field38370.method22486(new Class7372(this));
                Class6445.method19222(class8929, this.field38367);
            });
        }
    }
    
    private void method32629(final Class9083 class9083) {
        if (this.field38370.method22493()) {
            this.method32628(this.field38371 + 1);
        }
    }
    
    private void method32630(final Collection<Class9083> collection) {
        int n = 0;
        for (final Class9083 class9083 : collection) {
            final BlockPos class9084 = new BlockPos(this.field38372);
            class9083.method32750(class9084);
            Class8787.method30576(class9083.method32770(), class9084, 2, this.field38366, true);
            final BlockPos method32756 = class9083.method32756();
            final int n2 = (method32756 != null) ? method32756.getX() : 1;
            this.field38373 = Math.max(this.field38373, (method32756 != null) ? method32756.getZ() : 1);
            this.field38372.method1292(n2 + 4, 0, 0);
            if (n++ % 8 != 0) {
                continue;
            }
            this.field38372.method1292(0, 0, this.field38373 + 5);
            this.field38372.method1293(this.field38365.getX());
            this.field38373 = 0;
        }
    }
    
    static {
        field38364 = LogManager.getLogger();
    }
}
