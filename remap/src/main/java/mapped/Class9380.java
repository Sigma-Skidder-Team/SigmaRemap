// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.Locale;
import org.apache.logging.log4j.Logger;

public class Class9380
{
    private static final Logger field40225;
    public static final Class4574<?> field40226;
    public static final Class4574<?> field40227;
    public static final Class4574<?> field40228;
    public static final Class4574<?> field40229;
    public static final Class4574<?> field40230;
    public static final Class4574<?> field40231;
    public static final Class4574<?> field40232;
    public static final Class4574<?> field40233;
    public static final Class4574<?> field40234;
    public static final Class4574<?> field40235;
    public static final Class4574<?> field40236;
    public static final Class4574<?> field40237;
    public static final Class4574<?> field40238;
    public static final Class4574<?> field40239;
    public static final Class4574<?> field40240;
    
    private static Class4574<?> method34829(final String s, final Class4574<?> class4574) {
        return Registry.method511(Registry.field230, s.toLowerCase(Locale.ROOT), class4574);
    }
    
    public static void method34830() {
    }
    
    @Nullable
    public static Class5936 method34831(final Class6346<?> class6346, final Class1795 class6347, final CompoundNBT class6348) {
        final String method323 = class6348.getString("id");
        if ("INVALID".equals(method323)) {
            return Class5936.field24429;
        }
        final Class4574 class6349 = Registry.field230.getOrDefault(new ResourceLocation(method323.toLowerCase(Locale.ROOT)));
        if (class6349 == null) {
            Class9380.field40225.error("Unknown feature id: {}", (Object)method323);
            return null;
        }
        final int method324 = class6348.getInt("ChunkX");
        final int method325 = class6348.getInt("ChunkZ");
        final int method326 = class6348.getInt("references");
        final MutableBoundingBox class6350 = class6348.contains("BB") ? new MutableBoundingBox(class6348.getIntArray("BB")) : MutableBoundingBox.getNewBoundingBox();
        final ListNBT method327 = class6348.getList("Children", 10);
        try {
            final Class5936 method328 = class6349.method13595().method19048(class6349, method324, method325, class6350, method326, class6346.method18880());
            for (int i = 0; i < method327.size(); ++i) {
                final CompoundNBT method329 = method327.method346(i);
                final String method330 = method329.getString("id");
                final Class9520 class6351 = Registry.field231.getOrDefault(new ResourceLocation(method330.toLowerCase(Locale.ROOT)));
                if (class6351 == null) {
                    Class9380.field40225.error("Unknown structure piece id: {}", (Object)method330);
                }
                else {
                    try {
                        method328.field24431.add(class6351.method35540(class6347, method329));
                    }
                    catch (final Exception ex) {
                        Class9380.field40225.error("Exception loading structure piece with id {}", (Object)method330, (Object)ex);
                    }
                }
            }
            return method328;
        }
        catch (final Exception ex2) {
            Class9380.field40225.error("Failed Start with id {}", (Object)method323, (Object)ex2);
            return null;
        }
    }
    
    static {
        field40225 = LogManager.getLogger();
        field40226 = method34829("Mineshaft", Class4535.field19959);
        field40227 = method34829("Pillager_Outpost", Class4535.field19958);
        field40228 = method34829("Fortress", Class4535.field19969);
        field40229 = method34829("Stronghold", Class4535.field19966);
        field40230 = method34829("Jungle_Pyramid", Class4535.field19961);
        field40231 = method34829("Ocean_Ruin", Class4535.field19968);
        field40232 = method34829("Desert_Pyramid", Class4535.field19962);
        field40233 = method34829("Igloo", Class4535.field19963);
        field40234 = method34829("Swamp_Hut", Class4535.field19965);
        field40235 = method34829("Monument", Class4535.field19967);
        field40236 = method34829("EndCity", Class4535.field19970);
        field40237 = method34829("Mansion", Class4535.field19960);
        field40238 = method34829("Buried_Treasure", Class4535.field19971);
        field40239 = method34829("Shipwreck", Class4535.field19964);
        field40240 = method34829("Village", Class4535.field19972);
    }
}
