// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5044<E>
{
    private static String[] field21604;
    private E[] field21605;
    private int field21606;
    
    public Class5044(final int n) {
        this.field21605 = (E[])new Object[n];
    }
    
    public void method15362(final E e) {
        this.field21605[this.field21606] = e;
        ++this.field21606;
    }
    
    public E method15363(final int n) {
        return this.field21605[n];
    }
    
    public int method15364() {
        return this.field21606;
    }
    
    public void method15365() {
        this.field21606 = 0;
    }
}
