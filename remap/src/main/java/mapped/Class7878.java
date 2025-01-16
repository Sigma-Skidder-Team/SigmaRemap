// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.util2.Direction;

import java.util.Map;
import java.util.List;

public class Class7878
{
    private final List<Class8754> field32337;
    private final Map<Direction, List<Class8754>> field32338;
    private final Class9168 field32339;
    private final boolean field32340;
    private TextureAtlasSprite field32341;
    private final boolean field32342;
    private final boolean field32343;
    private final Class7503 field32344;
    
    public Class7878(final Class7685 class7685, final Class9168 class7686, final boolean b) {
        this(class7685.method24388(), class7685.method24389().method889(), b, class7685.method24399(), class7686);
    }
    
    private Class7878(final boolean field32340, final boolean field32341, final boolean field32342, final Class7503 field32343, final Class9168 field32344) {
        this.field32337 = Lists.newArrayList();
        this.field32338 = Maps.newEnumMap((Class) Direction.class);
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.field32338.put(values[i], Lists.newArrayList());
        }
        this.field32339 = field32344;
        this.field32340 = field32340;
        this.field32342 = field32341;
        this.field32343 = field32342;
        this.field32344 = field32343;
    }
    
    public Class7878 method25528(final Direction class179, final Class8754 class180) {
        this.field32338.get(class179).add(class180);
        return this;
    }
    
    public Class7878 method25529(final Class8754 class8754) {
        this.field32337.add(class8754);
        return this;
    }
    
    public Class7878 method25530(final TextureAtlasSprite field32341) {
        this.field32341 = field32341;
        return this;
    }
    
    public Class6313 method25531() {
        if (this.field32341 != null) {
            return new Class6315(this.field32337, this.field32338, this.field32340, this.field32342, this.field32343, this.field32341, this.field32344, this.field32339);
        }
        throw new RuntimeException("Missing particle!");
    }
}
