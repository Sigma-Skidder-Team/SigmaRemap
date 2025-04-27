// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import org.apache.logging.log4j.LogManager;

import java.util.TreeSet;
import java.util.Set;
import java.util.function.Function;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;

public class Class9280
{
    public static final PrintStream field39814;
    private static boolean field39815;
    private static final Logger field39816;
    
    public static void method34254() {
        if (!Class9280.field39815) {
            Class9280.field39815 = true;
            if (Registry.field204.method559()) {
                throw new IllegalStateException("Unable to load registries");
            }
            Class4011.method12193();
            Class3965.method12094();
            if (EntityType.method23354(EntityType.field29058) == null) {
                throw new IllegalStateException("Failed loading EntityTypes");
            }
            Class7652.method24248();
            Class9030.method32365();
            Class6423.method19101();
            Class8381.method27931();
            method34258();
        }
    }
    
    private static <T> void method34255(final Registry<T> class90, final Function<T, String> function, final Set<String> set) {
        class90.iterator().forEachRemaining(o -> {
            Class8837.method30858();
            final String s = function2.apply(o);
            if (!class91.method30862(s)) {
                set2.add(s);
            }
        });
    }
    
    public static Set<String> method34256() {
        final TreeSet set = new TreeSet();
        method34255(Registry.field210, EntityType::method23366, set);
        method34255(Registry.field207, Class5328::method16455, set);
        method34255(Registry.field211, Item::getTranslationKey, set);
        method34255(Registry.field209, Class6257::method18598, set);
        method34255(Registry.field217, Biome::method9865, set);
        method34255(Registry.BLOCK, Block::getTranslationKey, set);
        method34255(Registry.field228, class1932 -> "stat." + class1932.toString().replace(':', '.'), (Set<String>)set);
        return set;
    }
    
    public static void method34257() {
        if (Class9280.field39815) {
            if (Class9528.field41021) {
                method34256().forEach(str -> Class9280.field39816.error("Missing translations: " + str));
            }
            return;
        }
        throw new IllegalArgumentException("Not bootstrapped");
    }
    
    private static void method34258() {
        if (!Class9280.field39816.isDebugEnabled()) {
            System.setErr(new Class1721("STDERR", System.err));
            System.setOut(new Class1721("STDOUT", Class9280.field39814));
        }
        else {
            System.setErr(new Class1722("STDERR", System.err));
            System.setOut(new Class1722("STDOUT", Class9280.field39814));
        }
    }
    
    public static void method34259(final String x) {
        Class9280.field39814.println(x);
    }
    
    static {
        field39814 = System.out;
        field39816 = LogManager.getLogger();
    }
}
