// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class6316 implements Class6313
{
    private static String[] field25252;
    private final int field25253;
    private final List<Class6825> field25254;
    private final Class6313 field25255;
    
    public Class6316(final List<Class6825> field25254) {
        this.field25254 = field25254;
        this.field25253 = Class8223.method27248(field25254);
        this.field25255 = field25254.get(0).field26814;
    }
    
    @Override
    public List<Class8754> method18691(final BlockState class7096, final Direction class7097, final Random random) {
        return Class8223.method27250(this.field25254, Math.abs((int)random.nextLong()) % this.field25253).field26814.method18691(class7096, class7097, random);
    }
    
    @Override
    public boolean method18692() {
        return this.field25255.method18692();
    }
    
    @Override
    public boolean method18693() {
        return this.field25255.method18693();
    }
    
    @Override
    public boolean method18694() {
        return this.field25255.method18694();
    }
    
    @Override
    public boolean method18695() {
        return this.field25255.method18695();
    }
    
    @Override
    public TextureAtlasSprite method18696() {
        return this.field25255.method18696();
    }
    
    @Override
    public Class7503 method18697() {
        return this.field25255.method18697();
    }
    
    @Override
    public Class9168 method18698() {
        return this.field25255.method18698();
    }
}
