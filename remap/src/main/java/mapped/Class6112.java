// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class6112 implements Class6113
{
    private static String[] field24819;
    private final Minecraft field24820;
    
    public Class6112(final Minecraft field24820) {
        this.field24820 = field24820;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        Class8726.method30008();
        Class8726.method30045(7425);
        Class8726.method29999();
        Class8726.method30118();
        final Entity method18166 = this.field24820.field4644.method5833().method18166();
        final Class7392 method18167 = Class7392.method22694();
        final Class4148 method18168 = method18167.method22696();
        final double n4 = 0.0 - n2;
        final double n5 = 256.0 - n2;
        Class8726.method30041();
        Class8726.method30012();
        final double n6 = (method18166.chunkCoordX << 4) - n;
        final double n7 = (method18166.chunkCoordZ << 4) - n3;
        Class8726.method30072(1.0f);
        method18168.method12390(3, Class9237.field39615);
        for (int i = -16; i <= 32; i += 16) {
            for (int j = -16; j <= 32; j += 16) {
                method18168.method12432(n6 + i, n4, n7 + j).method12439(1.0f, 0.0f, 0.0f, 0.0f).method12397();
                method18168.method12432(n6 + i, n4, n7 + j).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method18168.method12432(n6 + i, n5, n7 + j).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method18168.method12432(n6 + i, n5, n7 + j).method12439(1.0f, 0.0f, 0.0f, 0.0f).method12397();
            }
        }
        for (int k = 2; k < 16; k += 2) {
            method18168.method12432(n6 + k, n4, n7).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6 + k, n4, n7).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + k, n5, n7).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + k, n5, n7).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6 + k, n4, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6 + k, n4, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + k, n5, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + k, n5, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
        }
        for (int l = 2; l < 16; l += 2) {
            method18168.method12432(n6, n4, n7 + l).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6, n4, n7 + l).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6, n5, n7 + l).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6, n5, n7 + l).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6 + 16.0, n4, n7 + l).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6 + 16.0, n4, n7 + l).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n5, n7 + l).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n5, n7 + l).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
        }
        for (int n8 = 0; n8 <= 256; n8 += 2) {
            final double n9 = n8 - n2;
            method18168.method12432(n6, n9, n7).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
            method18168.method12432(n6, n9, n7).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6, n9, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n9, n7 + 16.0).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n9, n7).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6, n9, n7).method12439(1.0f, 1.0f, 0.0f, 1.0f).method12397();
            method18168.method12432(n6, n9, n7).method12439(1.0f, 1.0f, 0.0f, 0.0f).method12397();
        }
        method18167.method22695();
        Class8726.method30072(2.0f);
        method18168.method12390(3, Class9237.field39615);
        for (int n10 = 0; n10 <= 16; n10 += 16) {
            for (int n11 = 0; n11 <= 16; n11 += 16) {
                method18168.method12432(n6 + n10, n4, n7 + n11).method12439(0.25f, 0.25f, 1.0f, 0.0f).method12397();
                method18168.method12432(n6 + n10, n4, n7 + n11).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
                method18168.method12432(n6 + n10, n5, n7 + n11).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
                method18168.method12432(n6 + n10, n5, n7 + n11).method12439(0.25f, 0.25f, 1.0f, 0.0f).method12397();
            }
        }
        for (int n12 = 0; n12 <= 256; n12 += 16) {
            final double n13 = n12 - n2;
            method18168.method12432(n6, n13, n7).method12439(0.25f, 0.25f, 1.0f, 0.0f).method12397();
            method18168.method12432(n6, n13, n7).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
            method18168.method12432(n6, n13, n7 + 16.0).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n13, n7 + 16.0).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
            method18168.method12432(n6 + 16.0, n13, n7).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
            method18168.method12432(n6, n13, n7).method12439(0.25f, 0.25f, 1.0f, 1.0f).method12397();
            method18168.method12432(n6, n13, n7).method12439(0.25f, 0.25f, 1.0f, 0.0f).method12397();
        }
        method18167.method22695();
        Class8726.method30072(1.0f);
        Class8726.method30011();
        Class8726.method30040();
        Class8726.method30045(7424);
    }
}
