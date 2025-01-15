// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7571
{
    private ArrayList field30023;
    
    public Class7571() {
        this.field30023 = new ArrayList();
    }
    
    public void method23793(final Class9527 e) {
        this.field30023.add(e);
    }
    
    public int method23794() {
        return this.field30023.size();
    }
    
    public float method23795(final int index) {
        return this.field30023.get(index).method35573();
    }
    
    public float method23796(final int index) {
        return this.field30023.get(index).method35574();
    }
    
    @Override
    public String toString() {
        return "[Path length=" + this.method23794() + "]";
    }
    
    public void method23797(final int index) {
        this.field30023.remove(index);
    }
}
