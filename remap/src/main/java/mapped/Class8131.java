// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class8131
{
    private static String[] field33499;
    private Entity field33500;
    private Class7988 field33501;
    private Class6938 field33502;
    
    public Class8131(final Entity field33500, final Class7988 field33501) {
        this.field33500 = field33500;
        this.field33501 = field33501;
        this.field33502 = null;
    }
    
    public Class8131(final Entity field33500, final Class7988 field33501, final Class6938 field33502) {
        this.field33500 = field33500;
        this.field33501 = field33501;
        this.field33502 = field33502;
    }
    
    public Entity method26798() {
        return this.field33500;
    }
    
    public Class7988 method26799() {
        return this.field33501;
    }
    
    public boolean method26800() {
        return this.field33502 != null && this.field33502.method21312();
    }
    
    public Class6938 method26801() {
        return this.field33502;
    }
    
    public void method26802(final Class7988 field33501) {
        this.field33501 = field33501;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class8131 && ((Class8131)o).method26798() == this.method26798());
    }
}
