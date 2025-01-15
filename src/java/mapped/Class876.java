// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public final class Class876 implements Class875<Object>
{
    private static String[] field4724;
    public final /* synthetic */ String field4725;
    public final /* synthetic */ Consumer field4726;
    
    public Class876(final String field4725, final Consumer field4726) {
        this.field4725 = field4725;
        this.field4726 = field4726;
    }
    
    @Override
    public String method5376() {
        return this.field4725;
    }
    
    @Override
    public void method5386(final Object o) {
        this.field4726.accept(o);
    }
    
    @Override
    public String toString() {
        return this.field4725;
    }
}
