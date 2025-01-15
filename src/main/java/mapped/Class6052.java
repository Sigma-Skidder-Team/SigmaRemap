// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;

public class Class6052 implements Class6054
{
    @Override
    public void method17981(final Class2776 class2776) throws InvalidDataException {
    }
    
    @Override
    public void method17982(final Class2776 class2776) {
    }
    
    @Override
    public boolean method17983(final String s) {
        return true;
    }
    
    @Override
    public boolean method17984(final String s) {
        return true;
    }
    
    @Override
    public void method17985(final Class2776 class2776) throws InvalidDataException {
        if (!class2776.method9805()) {
            if (!class2776.method9806()) {
                if (!class2776.method9807()) {
                    return;
                }
            }
        }
        throw new Class2322("bad rsv RSV1: " + class2776.method9805() + " RSV2: " + class2776.method9806() + " RSV3: " + class2776.method9807());
    }
    
    @Override
    public String method17986() {
        return "";
    }
    
    @Override
    public String method17987() {
        return "";
    }
    
    @Override
    public Class6054 method17988() {
        return new Class6052();
    }
    
    @Override
    public void method17989() {
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
}
