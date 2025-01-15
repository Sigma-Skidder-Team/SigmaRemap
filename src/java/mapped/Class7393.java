// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7393 implements Class7394
{
    private static String[] field28470;
    private int field28471;
    private int field28472;
    private int field28473;
    private int field28474;
    private float field28475;
    
    public Class7393() {
        this.field28473 = 50;
        this.field28475 = 40.0f;
    }
    
    public Class7393(final int field28471, final int field28472) {
        this.field28473 = 50;
        this.field28475 = 40.0f;
        this.field28471 = field28471;
        this.field28472 = field28472;
    }
    
    public Class7393(final int field28471, final int field28472, final float field28473) {
        this.field28473 = 50;
        this.field28475 = 40.0f;
        this.field28471 = field28471;
        this.field28472 = field28472;
        this.field28475 = field28473;
    }
    
    @Override
    public void method22697(final Class8014 class8014, final int n) {
        this.field28474 -= n;
        if (this.field28474 <= 0) {
            this.field28474 = this.field28473;
            final Class8777 method26253 = class8014.method26253(this, 1000.0f);
            method26253.method30502(1.0f, 1.0f, 1.0f, 0.5f);
            method26253.method30503((float)this.field28471, (float)this.field28472);
            method26253.method30497(this.field28475);
            method26253.method30504((float)(-0.019999999552965164 + Math.random() * 0.03999999910593033), (float)(-(Math.random() * 0.15000000596046448)), 1.1f);
        }
    }
    
    @Override
    public void method22698(final Class8777 class8777, final int n) {
        if (class8777.method30489() <= 600.0f) {
            class8777.method30498(-0.04f * n * (this.field28475 / 40.0f));
        }
        else {
            class8777.method30498(0.07f * n);
        }
        final float n2 = 0.002f * n;
        class8777.method30508(0.0f, -n2 / 2.0f, -n2 * 2.0f, -n2 / 4.0f);
    }
    
    @Override
    public boolean method22699() {
        return true;
    }
    
    @Override
    public void method22700(final boolean b) {
    }
    
    @Override
    public boolean method22701() {
        return false;
    }
    
    @Override
    public boolean method22702() {
        return false;
    }
    
    @Override
    public Class7764 method22703() {
        return null;
    }
    
    @Override
    public boolean method22704(final Class8014 class8014) {
        return false;
    }
    
    @Override
    public boolean method22705() {
        return false;
    }
    
    @Override
    public void method22706() {
    }
    
    @Override
    public void method22707() {
    }
}
