// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class4170 extends Class4158<Class501>
{
    private static String[] field18583;
    
    public Class4170(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12486(final Class501 class501, final float n, final Class7351 class502, final Class7807 class503, final int n2, final int n3) {
        if (Class869.method5277().field4684.method2908() || Class869.method5277().field4684.isSpectator()) {
            final BlockPos method2560 = class501.method2560();
            final BlockPos method2561 = class501.method2562();
            if (method2561.getX() >= 1 && method2561.getY() >= 1 && method2561.getZ() >= 1 && (class501.method2570() == Class102.field305 || class501.method2570() == Class102.field306)) {
                final double n4 = method2560.getX();
                final double n5 = method2560.getZ();
                final double n6 = method2560.getY();
                final double n7 = n6 + method2561.getY();
                double n8 = 0.0;
                double n9 = 0.0;
                switch (Class9403.field40344[class501.method2564().ordinal()]) {
                    case 1: {
                        n8 = method2561.getX();
                        n9 = -method2561.getZ();
                        break;
                    }
                    case 2: {
                        n8 = -method2561.getX();
                        n9 = method2561.getZ();
                        break;
                    }
                    default: {
                        n8 = method2561.getX();
                        n9 = method2561.getZ();
                        break;
                    }
                }
                double n10 = 0.0;
                double n11 = 0.0;
                double n12 = 0.0;
                double n13 = 0.0;
                switch (Class9403.field40345[class501.method2566().ordinal()]) {
                    case 1: {
                        n10 = ((n9 < 0.0) ? n4 : (n4 + 1.0));
                        n11 = ((n8 < 0.0) ? (n5 + 1.0) : n5);
                        n12 = n10 - n9;
                        n13 = n11 + n8;
                        break;
                    }
                    case 2: {
                        n10 = ((n8 < 0.0) ? n4 : (n4 + 1.0));
                        n11 = ((n9 < 0.0) ? n5 : (n5 + 1.0));
                        n12 = n10 - n8;
                        n13 = n11 - n9;
                        break;
                    }
                    case 3: {
                        n10 = ((n9 < 0.0) ? (n4 + 1.0) : n4);
                        n11 = ((n8 < 0.0) ? n5 : (n5 + 1.0));
                        n12 = n10 + n9;
                        n13 = n11 - n8;
                        break;
                    }
                    default: {
                        n10 = ((n8 < 0.0) ? (n4 + 1.0) : n4);
                        n11 = ((n9 < 0.0) ? (n5 + 1.0) : n5);
                        n12 = n10 + n8;
                        n13 = n11 + n9;
                        break;
                    }
                }
                final Class4150 method2562 = class503.method25214(Class6332.method18791());
                if (class501.method2570() == Class102.field305 || class501.method2595()) {
                    Class1656.method5733(class502, method2562, n10, n6, n11, n12, n7, n13, 0.9f, 0.9f, 0.9f, 1.0f, 0.5f, 0.5f, 0.5f);
                }
                if (class501.method2570() == Class102.field305 && class501.method2593()) {
                    this.method12487(class501, method2562, method2560, true, class502);
                    this.method12487(class501, method2562, method2560, false, class502);
                }
            }
        }
    }
    
    private void method12487(final Class501 class501, final Class4150 class502, final BlockPos class503, final boolean b, final Class7351 class504) {
        final World method2186 = class501.method2186();
        final BlockPos method2187 = class501.method2193();
        final BlockPos method2188 = method2187.add(class503);
        for (final BlockPos class505 : BlockPos.getAllInBoxMutable(method2188, method2188.add(class501.method2562()).add(-1, -1, -1))) {
            final Class7096 method2189 = method2186.method6701(class505);
            final boolean method2190 = method2189.method21706();
            final boolean b2 = method2189.method21696() == Class7521.field29646;
            if (!method2190 && !b2) {
                continue;
            }
            final float n = method2190 ? 0.05f : 0.0f;
            final double n2 = class505.getX() - method2187.getX() + 0.45f - n;
            final double n3 = class505.getY() - method2187.getY() + 0.45f - n;
            final double n4 = class505.getZ() - method2187.getZ() + 0.45f - n;
            final double n5 = class505.getX() - method2187.getX() + 0.55f + n;
            final double n6 = class505.getY() - method2187.getY() + 0.55f + n;
            final double n7 = class505.getZ() - method2187.getZ() + 0.55f + n;
            if (!b) {
                if (!method2190) {
                    Class1656.method5733(class504, class502, n2, n3, n4, n5, n6, n7, 1.0f, 0.25f, 0.25f, 1.0f, 1.0f, 0.25f, 0.25f);
                }
                else {
                    Class1656.method5733(class504, class502, n2, n3, n4, n5, n6, n7, 0.5f, 0.5f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f);
                }
            }
            else {
                Class1656.method5733(class504, class502, n2, n3, n4, n5, n6, n7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }
    
    public boolean method12488(final Class501 class501) {
        return true;
    }
}
