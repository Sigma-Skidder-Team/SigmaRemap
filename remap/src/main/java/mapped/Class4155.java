// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector4f;
import net.minecraft.util.Direction;

public class Class4155 extends Class4154
{
    private static String[] field18518;
    private final Class4150 field18519;
    private final Class6789 field18520;
    private final Class9429 field18521;
    private float field18522;
    private float field18523;
    private float field18524;
    private int field18525;
    private int field18526;
    private int field18527;
    private float field18528;
    private float field18529;
    private float field18530;
    
    public Class4155(final Class4150 field18519, final Class8996 class8996) {
        this.field18519 = field18519;
        (this.field18520 = class8996.method32111().method20758()).method20751();
        (this.field18521 = class8996.method32112().method35045()).method35041();
        this.method12452();
    }
    
    private void method12452() {
        this.field18522 = 0.0f;
        this.field18523 = 0.0f;
        this.field18524 = 0.0f;
        this.field18525 = 0;
        this.field18526 = 10;
        this.field18527 = 15728880;
        this.field18528 = 0.0f;
        this.field18529 = 1.0f;
        this.field18530 = 0.0f;
    }
    
    @Override
    public void method12397() {
        final Vector3f class9138 = new Vector3f(this.field18528, this.field18529, this.field18530);
        class9138.method33324(this.field18521);
        final Direction method800 = Direction.getFacingFromVector(class9138.method33311(), class9138.method33312(), class9138.method33313());
        final Vector4f class9139 = new Vector4f(this.field18522, this.field18523, this.field18524, 1.0f);
        class9139.method28603(this.field18520);
        class9139.method28604(Vector3f.field38718.rotationDegrees(180.0f));
        class9139.method28604(Vector3f.XP.rotationDegrees(-90.0f));
        class9139.method28604(method800.getRotation());
        this.field18519.method12432(this.field18522, this.field18523, this.field18524).method12439(1.0f, 1.0f, 1.0f, 1.0f).method12391(-class9139.method28595(), -class9139.method28596()).method12433(this.field18525, this.field18526).method12440(this.field18527).method12436(this.field18528, this.field18529, this.field18530).method12397();
        this.method12452();
    }
    
    @Override
    public Class4150 method12432(final double n, final double n2, final double n3) {
        this.field18522 = (float)n;
        this.field18523 = (float)n2;
        this.field18524 = (float)n3;
        return this;
    }
    
    @Override
    public Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        return this;
    }
    
    @Override
    public Class4150 method12391(final float n, final float n2) {
        return this;
    }
    
    @Override
    public Class4150 method12433(final int field18525, final int field18526) {
        this.field18525 = field18525;
        this.field18526 = field18526;
        return this;
    }
    
    @Override
    public Class4150 method12434(final int n, final int n2) {
        this.field18527 = (n | n2 << 16);
        return this;
    }
    
    @Override
    public Class4150 method12436(final float field18528, final float field18529, final float field18530) {
        this.field18528 = field18528;
        this.field18529 = field18529;
        this.field18530 = field18530;
        return this;
    }
}
