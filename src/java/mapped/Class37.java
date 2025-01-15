// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;

public class Class37 extends LinkedList<Class4248>
{
    public final /* synthetic */ Class4967 field92;
    public final /* synthetic */ Class4960 field93;
    
    public Class37(final Class4960 field93, final Class4967 field94) {
        this.field93 = field93;
        this.field92 = field94;
        this.add(Class8415.method28106(this.field92, "open", new Class4696(this)));
        this.add(Class8415.method28106(this.field92, "packet", new Class4677(this)));
        this.add(Class8415.method28106(this.field92, "close", new Class4674(this)));
    }
}
