// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class7075
{
    private static String[] field27550;
    public final Class512 field27551;
    public final Class316 field27552;
    public final Class7005 field27553;
    public final Class1847 field27554;
    public final Class8321 field27555;
    
    public Class7075(final Class512 class512, final Class316 class513, final Class7005 class514) {
        this(class512.field2391, class512, class513, class512.method2715(class513), class514);
    }
    
    public Class7075(final Class1847 field27554, final Class512 field27555, final Class316 field27556, final Class8321 field27557, final Class7005 field27558) {
        this.field27551 = field27555;
        this.field27552 = field27556;
        this.field27553 = field27558;
        this.field27555 = field27557;
        this.field27554 = field27554;
    }
    
    public BlockPos method21639() {
        return this.field27553.method21447();
    }
    
    public Direction method21648() {
        return this.field27553.method21448();
    }
    
    public Vec3d method21649() {
        return this.field27553.method21451();
    }
    
    public boolean method21650() {
        return this.field27553.method21450();
    }
    
    public Class8321 method21651() {
        return this.field27555;
    }
    
    @Nullable
    public Class512 method21652() {
        return this.field27551;
    }
    
    public Class316 method21653() {
        return this.field27552;
    }
    
    public Class1847 method21654() {
        return this.field27554;
    }
    
    public Direction method21644() {
        return (this.field27551 != null) ? this.field27551.method1882() : Direction.NORTH;
    }
    
    public boolean method21645() {
        return this.field27551 != null && this.field27551.method2804();
    }
    
    public float method21646() {
        return (this.field27551 != null) ? this.field27551.field2399 : 0.0f;
    }
}
