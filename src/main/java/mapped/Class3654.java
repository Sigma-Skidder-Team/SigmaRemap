// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3654 extends Class3651
{
    private int field16931;
    
    public static List<Class7220> method11246() {
        final ArrayList list = new ArrayList(2);
        final Class3654 class3654 = new Class3654();
        list.add(class3654.method11237("minecraft:chorus_plant"));
        list.add(class3654.method11247());
        return list;
    }
    
    public Class3654() {
        super(null);
        this.field16931 = Class8881.method31263("minecraft:end_stone");
    }
    
    public Class7220 method11247() {
        return new Class7227(this);
    }
    
    @Override
    public byte method11238(final Class9223 class9223) {
        byte method11238 = super.method11238(class9223);
        if (class9223.method34008("up").equals("true")) {
            method11238 |= 0x10;
        }
        if (class9223.method34008("down").equals("true")) {
            method11238 |= 0x20;
        }
        return method11238;
    }
    
    @Override
    public byte method11239(final Class6108 class6108, final Class8322 class6109, final int n) {
        byte method11239 = super.method11239(class6108, class6109, n);
        if (this.method11240(Class222.field775, this.method11205(class6108, class6109.method27702(Class222.field775)), false)) {
            method11239 |= 0x10;
        }
        if (this.method11240(Class222.field776, this.method11205(class6108, class6109.method27702(Class222.field776)), false)) {
            method11239 |= 0x20;
        }
        return method11239;
    }
    
    @Override
    public boolean method11240(final Class222 class222, final int i, final boolean b) {
        return this.method11241().contains(i) || (class222 == Class222.field776 && i == this.field16931);
    }
}
