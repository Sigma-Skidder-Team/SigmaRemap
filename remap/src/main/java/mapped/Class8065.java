// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class8065
{
    private final Class1932[] field33227;
    
    public Class8065(final Class1932 class1932) {
        this.field33227 = new Class1932[6];
        for (int i = 0; i < 6; ++i) {
            this.field33227[i] = new Class1932(class1932.method7798(), class1932.method7797() + '_' + i + ".png");
        }
    }
    
    public void method26461(final Class869 class869, final float n, final float n2, final float n3) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        Class8726.method30057(5889);
        Class8726.method30059();
        Class8726.method30058();
        Class8726.method30067(Matrix4f.method20755(85.0, class869.method5332().method7692() / (float)class869.method5332().method7693(), 0.05f, 10.0f));
        Class8726.method30057(5888);
        Class8726.method30059();
        Class8726.method30058();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30062(180.0f, 1.0f, 0.0f, 0.0f);
        Class8726.method30011();
        Class8726.method29998();
        Class8726.method30029();
        Class8726.method30010(false);
        Class8726.method30117();
        for (int i = 0; i < 4; ++i) {
            Class8726.method30059();
            Class8726.method30065((i % 2 / 2.0f - 0.5f) / 256.0f, (i / 2 / 2.0f - 0.5f) / 256.0f, 0.0f);
            Class8726.method30062(n, 1.0f, 0.0f, 0.0f);
            Class8726.method30062(n2, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                class869.method5290().method5849(this.field33227[j]);
                method22695.method12390(7, Class9237.field39619);
                final int n4 = Math.round(255.0f * n3) / (i + 1);
                if (j == 0) {
                    method22695.method12432(-1.0, -1.0, 1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, 1.0, 1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, 1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, -1.0, 1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                if (j == 1) {
                    method22695.method12432(1.0, -1.0, 1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, 1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, -1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, -1.0, -1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                if (j == 2) {
                    method22695.method12432(1.0, -1.0, -1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, -1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, 1.0, -1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, -1.0, -1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                if (j == 3) {
                    method22695.method12432(-1.0, -1.0, -1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, 1.0, -1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, 1.0, 1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, -1.0, 1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                if (j == 4) {
                    method22695.method12432(-1.0, -1.0, -1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, -1.0, 1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, -1.0, 1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, -1.0, -1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                if (j == 5) {
                    method22695.method12432(-1.0, 1.0, 1.0).method12391(0.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(-1.0, 1.0, -1.0).method12391(0.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, -1.0).method12391(1.0f, 1.0f).method12399(255, 255, 255, n4).method12397();
                    method22695.method12432(1.0, 1.0, 1.0).method12391(1.0f, 0.0f).method12399(255, 255, 255, n4).method12397();
                }
                method22694.method22695();
            }
            Class8726.method30060();
            Class8726.method30049(true, true, true, false);
        }
        Class8726.method30049(true, true, true, true);
        Class8726.method30057(5889);
        Class8726.method30060();
        Class8726.method30057(5888);
        Class8726.method30060();
        Class8726.method30010(true);
        Class8726.method30028();
        Class8726.method30008();
    }
    
    public CompletableFuture<Void> method26462(final Class1663 class1663, final Executor executor) {
        final CompletableFuture[] cfs = new CompletableFuture[6];
        for (int i = 0; i < cfs.length; ++i) {
            cfs[i] = class1663.method5855(this.field33227[i], executor);
        }
        return CompletableFuture.allOf((CompletableFuture<?>[])cfs);
    }
}
