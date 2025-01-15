// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class8441
{
    private static String[] field34693;
    public Class8777[] field34694;
    public ArrayList field34695;
    public final /* synthetic */ Class8014 field34696;
    
    public Class8441(final Class8014 field34696, final Class8014 class8014, final int n) {
        this.field34696 = field34696;
        this.field34694 = new Class8777[n];
        this.field34695 = new ArrayList();
        for (int i = 0; i < this.field34694.length; ++i) {
            this.field34694[i] = field34696.method26238(class8014);
        }
        this.method28176(class8014);
    }
    
    public void method28176(final Class8014 class8014) {
        this.field34695.clear();
        for (int i = 0; i < this.field34694.length; ++i) {
            this.field34695.add(this.field34694[i]);
        }
    }
}
