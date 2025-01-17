// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Renderer;

public class Class6021 implements Class6020
{
    private static String[] field24508;
    private SGL field24509;
    
    public Class6021() {
        this.field24509 = Renderer.get();
    }
    
    @Override
    public void method17933() {
        this.field24509.method19253();
    }
    
    @Override
    public void method17936(final boolean b) {
        if (!b) {
            this.field24509.method19264(2848);
        }
        else {
            this.field24509.method19265(2848);
        }
    }
    
    @Override
    public void method17935(final float n) {
        this.field24509.method19266(n);
    }
    
    @Override
    public void method17932() {
        this.field24509.glBegin(3);
    }
    
    @Override
    public void method17934(final float n, final float n2) {
        this.field24509.glVertex2f(n, n2);
    }
    
    @Override
    public void method17940(final float n, final float n2, final float n3, final float n4) {
        this.field24509.method19252(n, n2, n3, n4);
    }
    
    @Override
    public void method17931(final boolean b) {
    }
    
    @Override
    public boolean method17941() {
        return true;
    }
}
