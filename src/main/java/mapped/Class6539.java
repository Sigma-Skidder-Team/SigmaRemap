// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import java.util.List;

public class Class6539
{
    private List field25990;
    public final /* synthetic */ Class7290 field25991;
    
    private Class6539(final Class7290 field25991) {
        this.field25991 = field25991;
        this.field25990 = new LinkedList();
    }
    
    public Object method19770() {
        return this.field25990.get(0);
    }
    
    public void method19771() {
        this.field25990.clear();
    }
    
    public void method19772(final Object o) {
        for (int i = 0; i < this.field25990.size(); ++i) {
            if (((Comparable<Object>)this.field25990.get(i)).compareTo(o) > 0) {
                this.field25990.add(i, o);
                break;
            }
        }
        if (!this.field25990.contains(o)) {
            this.field25990.add(o);
        }
    }
    
    public void method19773(final Object o) {
        this.field25990.remove(o);
    }
    
    public int method19774() {
        return this.field25990.size();
    }
    
    public boolean method19775(final Object o) {
        return this.field25990.contains(o);
    }
    
    @Override
    public String toString() {
        String string = "{";
        for (int i = 0; i < this.method19774(); ++i) {
            string = string + this.field25990.get(i).toString() + ",";
        }
        return string + "}";
    }
}
