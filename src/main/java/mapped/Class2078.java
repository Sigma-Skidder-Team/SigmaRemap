// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.IntConsumer;

public enum Class2078
{
    field12010("Position", (n, n3, n5, n7, p4) -> {
        Class8933.method31650(n, n3, n5, n7);
        Class8933.method31653(32884);
        return;
    }, p0 -> Class8933.method31654(32884)), 
    field12011("Normal", (p0, n12, n14, n16, p4) -> {
        Class8933.method31648(n12, n14, n16);
        Class8933.method31653(32885);
        return;
    }, p0 -> Class8933.method31654(32885)), 
    field12012("Vertex Color", (n20, n22, n24, n26, p4) -> {
        Class8933.method31651(n20, n22, n24, n26);
        Class8933.method31653(32886);
        return;
    }, p0 -> {
        Class8933.method31654(32886);
        Class8933.method31647();
        return;
    }), 
    field12013("UV", (n30, n32, n34, n36, n38) -> {
        Class8933.method31565(33984 + n38);
        Class8933.method31649(n30, n32, n34, n36);
        Class8933.method31653(32888);
        Class8933.method31565(33984);
        return;
    }, n40 -> {
        Class8933.method31565(33984 + n40);
        Class8933.method31654(32888);
        Class8933.method31565(33984);
        return;
    }), 
    field12014("Padding", (p0, p1, p2, p3, p4) -> {}, p0 -> {}), 
    field12015("Generic", (n48, n50, n52, n54, n56) -> {
        Class8933.method31655(n56);
        Class8933.method31652(n56, n48, n50, false, n52, n54);
        return;
    }, Class8933::method31656);
    
    private final String field12016;
    private final Class8382 field12017;
    private final IntConsumer field12018;
    
    private Class2078(final String field12016, final Class8382 field12017, final IntConsumer field12018) {
        this.field12016 = field12016;
        this.field12017 = field12017;
        this.field12018 = field12018;
    }
    
    private void method8187(final int n, final int n2, final int n3, final long n4, final int n5) {
        this.field12017.method27938(n, n2, n3, n4, n5);
    }
    
    public void method8188(final int n) {
        this.field12018.accept(n);
    }
    
    public String method8189() {
        return this.field12016;
    }
}
