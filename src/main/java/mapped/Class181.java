// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.Comparator;
import java.util.Arrays;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum Class181 implements Class103
{
    field537(0, "white", 16383998, Class8819.field37040, 15790320, 16777215), 
    field538(1, "orange", 16351261, Class8819.field37047, 15435844, 16738335), 
    field539(2, "magenta", 13061821, Class8819.field37048, 12801229, 16711935), 
    field540(3, "light_blue", 3847130, Class8819.field37049, 6719955, 10141901), 
    field541(4, "yellow", 16701501, Class8819.field37050, 14602026, 16776960), 
    field542(5, "lime", 8439583, Class8819.field37051, 4312372, 12582656), 
    field543(6, "pink", 15961002, Class8819.field37052, 14188952, 16738740), 
    field544(7, "gray", 4673362, Class8819.field37053, 4408131, 8421504), 
    field545(8, "light_gray", 10329495, Class8819.field37054, 11250603, 13882323), 
    field546(9, "cyan", 1481884, Class8819.field37055, 2651799, 65535), 
    field547(10, "purple", 8991416, Class8819.field37056, 8073150, 10494192), 
    field548(11, "blue", 3949738, Class8819.field37057, 2437522, 255), 
    field549(12, "brown", 8606770, Class8819.field37058, 5320730, 9127187), 
    field550(13, "green", 6192150, Class8819.field37059, 3887386, 65280), 
    field551(14, "red", 11546150, Class8819.field37060, 11743532, 16711680), 
    field552(15, "black", 1908001, Class8819.field37061, 1973019, 0);
    
    private static final Class181[] field553;
    private static final Int2ObjectOpenHashMap<Class181> field554;
    private final int field555;
    private final String field556;
    private final Class8819 field557;
    private final int field558;
    private final int field559;
    private final float[] field560;
    private final int field561;
    private final int field562;
    
    private Class181(final int field555, final String field556, final int field557, final Class8819 field558, final int field559, final int field560) {
        this.field555 = field555;
        this.field556 = field556;
        this.field558 = field557;
        this.field557 = field558;
        this.field562 = field560;
        final int n = (field557 & 0xFF0000) >> 16;
        final int n2 = (field557 & 0xFF00) >> 8;
        final int n3 = (field557 & 0xFF) >> 0;
        this.field559 = (n3 << 16 | n2 << 8 | n << 0);
        this.field560 = new float[] { n / 255.0f, n2 / 255.0f, n3 / 255.0f };
        this.field561 = field559;
    }
    
    public int method813() {
        return this.field555;
    }
    
    public String method814() {
        return this.field556;
    }
    
    public float[] method815() {
        return this.field560;
    }
    
    public Class8819 method816() {
        return this.field557;
    }
    
    public int method817() {
        return this.field561;
    }
    
    public int method818() {
        return this.field562;
    }
    
    public static Class181 method819(int n) {
        if (n < 0 || n >= Class181.field553.length) {
            n = 0;
        }
        return Class181.field553[n];
    }
    
    public static Class181 method820(final String anObject, final Class181 class181) {
        for (final Class181 class182 : values()) {
            if (class182.field556.equals(anObject)) {
                return class182;
            }
        }
        return class181;
    }
    
    @Nullable
    public static Class181 method821(final int n) {
        return (Class181)Class181.field554.get(n);
    }
    
    @Override
    public String toString() {
        return this.field556;
    }
    
    @Override
    public String method596() {
        return this.field556;
    }
    
    static {
        field553 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class181::method813)).toArray(Class181[]::new);
        field554 = new Int2ObjectOpenHashMap((Map)Arrays.stream(values()).collect(Collectors.toMap(class181 -> class181.field561, class182 -> class182)));
    }
}
