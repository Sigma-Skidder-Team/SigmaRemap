// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5631 extends Class5611
{
    private final long field23018;
    private final String field23019;
    private final Class236 field23020;
    public final /* synthetic */ Class5078 field23021;
    
    public Class5631(final Class5078 field23021, final int n, final int n2, final String s, final long field23022, final String field23023, final Class236 field23024) {
        this.field23021 = field23021;
        super(100 + field23024.ordinal(), n, n2, 60, 72, s);
        this.field23018 = field23022;
        this.field23019 = field23023;
        this.field23020 = field23024;
    }
    
    @Override
    public void method16922() {
        super.method16922();
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        Class5078.method15743(this.field23021, this.method16929(), this.method16928(), this.method16923().method3369(), this.field23018, this.field23019, this.field23020, this.method16923().method3360(), this.method16923().isMouseOver(n, n2));
    }
}
