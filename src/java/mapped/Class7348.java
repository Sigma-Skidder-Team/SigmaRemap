// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7348 implements Class7345
{
    private final int field28363 = 5447;
    private final int field28364 = 5566;
    
    @Override
    public int method22560(final Class6108 class6108, final Class74 class6109) {
        final Class6647 class6110 = class6108.method18207(Class6647.class);
        final Class8322 class6111 = new Class8322(this.method22562(class6109.method419("x")), this.method22562(class6109.method419("y")), this.method22562(class6109.method419("z")));
        if (!class6110.method20193(class6111)) {
            Class8563.method28793().method34742().warning("Received an head update packet, but there is no head! O_o " + class6109);
            return -1;
        }
        int method18137 = class6110.method20194(class6111).method18137();
        if (method18137 >= 5447 && method18137 <= 5566) {
            if (class6109.method419("SkullType") != null) {
                method18137 += ((Number)class6109.method419("SkullType").method374()).intValue() * 20;
            }
            if (class6109.method418("Rot")) {
                method18137 += ((Number)class6109.method419("Rot").method374()).intValue();
            }
            return method18137;
        }
        Class8563.method28793().method34742().warning("Why does this block have the skull block entity? " + class6109);
        return -1;
    }
    
    private long method22562(final Class61 class61) {
        return (long)class61.method374();
    }
}
