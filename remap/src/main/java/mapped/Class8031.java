// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class8031
{
    private static String[] field33057;
    private final ArrayList field33058;
    public final /* synthetic */ Class2425 field33059;
    
    public Class8031(final Class2425 field33059) {
        this.field33059 = field33059;
        this.field33058 = new ArrayList();
    }
    
    public boolean method26338(final Class9579 o) {
        return this.field33058.contains(o);
    }
    
    public void method26339(final Class9579 e) {
        this.field33058.add(e);
    }
    
    public void method26340(final Class9579 o) {
        this.field33058.remove(o);
    }
    
    public int method26341() {
        return this.field33058.size();
    }
    
    public Class9579 method26342(final int index) {
        return this.field33058.get(index);
    }
    
    public void method26343() {
        this.field33058.clear();
    }
}
