// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6421 extends Class6404
{
    private static String[] field25523;
    private final Class6404 field25530;
    
    public Class6421() {
        this.field25530 = new Class6404();
    }
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Direction class5493 = class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859);
        final World method16763 = class5491.method16763();
        final double n = class5491.getX() + class5493.getXOffset() * 1.125;
        final double n2 = Math.floor(class5491.getY()) + class5493.getYOffset();
        final double n3 = class5491.getZ() + class5493.getZOffset() * 1.125;
        final BlockPos method16764 = class5491.method16764().method1149(class5493);
        final Class7096 method16765 = method16763.method6701(method16764);
        final Class104 class5494 = (method16765.method21696() instanceof Class4017) ? method16765.method21772(((Class4017)method16765.method21696()).method12205()) : Class104.field311;
        double n4;
        if (!method16765.method21755(Class7188.field27906)) {
            if (!method16765.method21706() || !method16763.method6701(method16764.method1139()).method21755(Class7188.field27906)) {
                return this.field25530.method19090(class5491, class5492);
            }
            final Class7096 method16766 = method16763.method6701(method16764.method1139());
            final Class104 class5495 = (method16766.method21696() instanceof Class4017) ? method16766.method21772(((Class4017)method16766.method21696()).method12205()) : Class104.field311;
            if (class5493 != Direction.DOWN && class5495.method597()) {
                n4 = -0.4;
            }
            else {
                n4 = -0.9;
            }
        }
        else if (!class5494.method597()) {
            n4 = 0.1;
        }
        else {
            n4 = 0.6;
        }
        final Class428 method16767 = Class428.method2122(method16763, n, n2 + n4, n3, Class4068.method12273((Class4068)class5492.method27622()));
        if (class5492.method27667()) {
            method16767.method1872(class5492.method27664());
        }
        method16763.method6886(method16767);
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1000, class5491.method16764(), 0);
    }
}
