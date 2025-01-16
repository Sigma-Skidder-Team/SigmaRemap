// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.Matrix4f;

import java.util.List;

public class Class1919 implements AutoCloseable
{
    private final Class1926 field10429;
    public final Class6153 field10430;
    public final Class6153 field10431;
    private final List<Object> field10432;
    private final List<String> field10433;
    private final List<Integer> field10434;
    private final List<Integer> field10435;
    private Matrix4f field10436;
    
    public Class1919(final Class6582 class6582, final String s, final Class6153 field10430, final Class6153 field10431) throws IOException {
        this.field10432 = Lists.newArrayList();
        this.field10433 = Lists.newArrayList();
        this.field10434 = Lists.newArrayList();
        this.field10435 = Lists.newArrayList();
        this.field10429 = new Class1926(class6582, s);
        this.field10430 = field10430;
        this.field10431 = field10431;
    }
    
    @Override
    public void close() {
        this.field10429.close();
    }
    
    public void method7602(final String s, final Object o, final int i, final int j) {
        this.field10433.add(this.field10433.size(), s);
        this.field10432.add(this.field10432.size(), o);
        this.field10434.add(this.field10434.size(), i);
        this.field10435.add(this.field10435.size(), j);
    }
    
    public void method7603(final Matrix4f field10436) {
        this.field10436 = field10436;
    }
    
    public void method7604(final float n) {
        this.field10430.method18397();
        final float n2 = (float)this.field10431.field24884;
        final float n3 = (float)this.field10431.field24885;
        Class8726.method30048(0, 0, (int)n2, (int)n3);
        this.field10429.method7718("DiffuseSampler", this.field10430);
        for (int i = 0; i < this.field10432.size(); ++i) {
            this.field10429.method7718(this.field10433.get(i), this.field10432.get(i));
            this.field10429.method7715("AuxSize" + i).method7164(this.field10434.get(i), this.field10435.get(i));
        }
        this.field10429.method7715("ProjMat").method7170(this.field10436);
        this.field10429.method7715("InSize").method7164((float)this.field10430.field24884, (float)this.field10430.field24885);
        this.field10429.method7715("OutSize").method7164(n2, n3);
        this.field10429.method7715("Time").method7163(n);
        final Minecraft method5277 = Minecraft.method5277();
        this.field10429.method7715("ScreenSize").method7164((float)method5277.method5332().method7692(), (float)method5277.method5332().method7693());
        this.field10429.method7712();
        this.field10431.method18402(Minecraft.field4623);
        this.field10431.method18395(false);
        Class8726.method30010(false);
        final Class4148 method5278 = Class7392.method22694().method22696();
        method5278.method12390(7, Class9237.field39615);
        method5278.method12432(0.0, 0.0, 500.0).method12399(255, 255, 255, 255).method12397();
        method5278.method12432(n2, 0.0, 500.0).method12399(255, 255, 255, 255).method12397();
        method5278.method12432(n2, n3, 500.0).method12399(255, 255, 255, 255).method12397();
        method5278.method12432(0.0, n3, 500.0).method12399(255, 255, 255, 255).method12397();
        method5278.method12393();
        Class8475.method28282(method5278);
        Class8726.method30010(true);
        this.field10429.method7711();
        this.field10431.method18397();
        this.field10430.method18394();
        for (final Class6153 next : this.field10432) {
            if (!(next instanceof Class6153)) {
                continue;
            }
            next.method18394();
        }
    }
    
    public Class1926 method7605() {
        return this.field10429;
    }
}
