// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7346 implements Class7345
{
    @Override
    public int method22560(final Class6108 class6108, final Class74 obj) {
        final Class6647 class6109 = class6108.method18207(Class6647.class);
        final Class8322 class6110 = new Class8322(this.method22561(obj.method419("x")), this.method22561(obj.method419("y")), this.method22561(obj.method419("z")));
        if (class6109.method20193(class6110)) {
            int n = class6109.method20194(class6110).method18137() - 972 + 748;
            final Class61 method419 = obj.method419("color");
            if (method419 != null) {
                n += ((Number)method419.method374()).intValue() * 16;
            }
            return n;
        }
        Class8563.method28793().method34742().warning("Received an bed color update packet, but there is no bed! O_o " + obj);
        return -1;
    }
    
    private long method22561(final Class61 class61) {
        return (long)class61.method374();
    }
}
