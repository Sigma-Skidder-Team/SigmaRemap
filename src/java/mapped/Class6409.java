// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6409 extends Class6404
{
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        final Class5488 method16764 = Class3955.method12072(class5491);
        final Class179 class5493 = class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859);
        final Class401 method16765 = this.method19093(method16763, method16764, class5492);
        method16765.method1958(class5493.method785(), class5493.method786() + 0.1f, class5493.method787(), this.method19095(), this.method19094());
        method16763.method6886((Class399)method16765);
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1002, class5491.method16764(), 0);
    }
    
    public abstract Class401 method19093(final Class1847 p0, final Class5488 p1, final Class8321 p2);
    
    public float method19094() {
        return 6.0f;
    }
    
    public float method19095() {
        return 1.1f;
    }
}
