// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.Map;
import java.util.List;

public class Class6315 implements Class6313
{
    private static String[] field25243;
    public final List<Class8754> field25244;
    public final Map<Direction, List<Class8754>> field25245;
    public final boolean field25246;
    public final boolean field25247;
    public final boolean field25248;
    public final Class1912 field25249;
    public final Class7503 field25250;
    public final Class9168 field25251;
    
    public Class6315(final List<Class8754> field25244, final Map<Direction, List<Class8754>> field25245, final boolean field25246, final boolean field25247, final boolean field25248, final Class1912 field25249, final Class7503 field25250, final Class9168 field25251) {
        this.field25244 = field25244;
        this.field25245 = field25245;
        this.field25246 = field25246;
        this.field25247 = field25248;
        this.field25248 = field25247;
        this.field25249 = field25249;
        this.field25250 = field25250;
        this.field25251 = field25251;
    }
    
    @Override
    public List<Class8754> method18691(final BlockState class7096, final Direction class7097, final Random random) {
        return (class7097 != null) ? this.field25245.get(class7097) : this.field25244;
    }
    
    @Override
    public boolean method18692() {
        return this.field25246;
    }
    
    @Override
    public boolean method18693() {
        return this.field25247;
    }
    
    @Override
    public boolean method18694() {
        return this.field25248;
    }
    
    @Override
    public boolean method18695() {
        return false;
    }
    
    @Override
    public Class1912 method18696() {
        return this.field25249;
    }
    
    @Override
    public Class7503 method18697() {
        return this.field25250;
    }
    
    @Override
    public Class9168 method18698() {
        return this.field25251;
    }
}
