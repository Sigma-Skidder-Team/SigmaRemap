// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

import java.util.Date;

public class Class8592
{
    private static String[] field36093;
    public boolean field36094;
    public String[] field36095;
    public Date field36096;
    
    public Class8592(final String s, final boolean field36094) {
        this.field36096 = new Date();
        this.field36094 = field36094;
        this.field36095 = AllUtils.method19175(s, 200, ClientFonts.JelloLight18);
    }
    
    public int method29096() {
        return Class4824.method14453().method23539() * this.field36095.length + 20;
    }
    
    public int method29097() {
        return (this.field36095.length != 1) ? 225 : (Class4824.method14453().method23505(this.field36095[0]) + 20);
    }
}
