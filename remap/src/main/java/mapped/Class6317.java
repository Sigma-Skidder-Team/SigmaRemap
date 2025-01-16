// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class6317 implements Class6313
{
    private static String[] field25256;
    private final Class7503 field25257;
    private final Class9168 field25258;
    private final Class1912 field25259;
    private final boolean field25260;
    
    public Class6317(final Class7503 field25257, final Class9168 field25258, final Class1912 field25259, final boolean field25260) {
        this.field25257 = field25257;
        this.field25258 = field25258;
        this.field25259 = field25259;
        this.field25260 = field25260;
    }
    
    @Override
    public List<Class8754> method18691(final BlockState class7096, final Direction class7097, final Random random) {
        return Collections.emptyList();
    }
    
    @Override
    public boolean method18692() {
        return false;
    }
    
    @Override
    public boolean method18693() {
        return true;
    }
    
    @Override
    public boolean method18694() {
        return this.field25260;
    }
    
    @Override
    public boolean method18695() {
        return true;
    }
    
    @Override
    public Class1912 method18696() {
        return this.field25259;
    }
    
    @Override
    public Class7503 method18697() {
        return this.field25257;
    }
    
    @Override
    public Class9168 method18698() {
        return this.field25258;
    }
}
