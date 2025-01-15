// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.Random;
import java.util.Iterator;

public class Class3523 extends Class3446
{
    private static String[] field16526;
    private final Class800 field16527;
    private Class512 field16528;
    private BlockPos field16529;
    private int field16530;
    
    public Class3523(final Class800 field16527) {
        this.field16527 = field16527;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16527.method4480()) {
            return false;
        }
        if (!this.field16527.method4483()) {
            final Class511 method4488 = this.field16527.method4488();
            if (method4488 instanceof Class512) {
                this.field16528 = (Class512)method4488;
                if (!method4488.method2783()) {
                    return false;
                }
                if (this.field16527.method1734(this.field16528) > 100.0) {
                    return false;
                }
                final BlockPos class354 = new BlockPos(this.field16528);
                final Class7096 method4489 = this.field16527.field2391.method6701(class354);
                if (method4489.method21696().method11785(Class7188.field27910)) {
                    final Direction class355 = method4489.method21772((Class7111<Direction>)Class3900.field17564);
                    this.field16529 = new BlockPos(class354.getX() - class355.getXOffset(), class354.getY(), class354.getZ() - class355.getZOffset());
                    return !this.method11075();
                }
            }
            return false;
        }
        return false;
    }
    
    private boolean method11075() {
        for (final Class800 class800 : this.field16527.field2391.method7128((Class<? extends Class800>)Class800.class, new AxisAlignedBB(this.field16529).method18496(2.0))) {
            if (class800 != this.field16527 && (class800.method4610() || class800.method4612())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16527.method4480()) {
            if (!this.field16527.method4483()) {
                if (this.field16528 != null) {
                    if (this.field16528.method2783()) {
                        if (this.field16529 != null) {
                            if (!this.method11075()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        if (this.field16529 != null) {
            this.field16527.method4490().method11058(false);
            this.field16527.method4150().method24724(this.field16529.getX(), this.field16529.getY(), this.field16529.getZ(), 1.100000023841858);
        }
    }
    
    @Override
    public void method11018() {
        this.field16527.method4609(false);
        final float method6952 = this.field16527.field2391.method6952(1.0f);
        if (this.field16528.method2852() >= 100) {
            if (method6952 > 0.77) {
                if (method6952 < 0.8) {
                    if (this.field16527.field2391.method6790().nextFloat() < 0.7) {
                        this.method11076();
                    }
                }
            }
        }
        this.field16530 = 0;
        this.field16527.method4611(false);
        this.field16527.method4150().method24733();
    }
    
    private void method11076() {
        final Random method2633 = this.field16527.method2633();
        final Class385 class385 = new Class385();
        class385.method1285(this.field16527);
        this.field16527.method2775(class385.getX() + method2633.nextInt(11) - 5, class385.getY() + method2633.nextInt(5) - 2, class385.getZ() + method2633.nextInt(11) - 5, false);
        class385.method1285(this.field16527);
        final Iterator<ItemStack> iterator = this.field16527.field2391.method6679().method1581().method6402(Class9020.field38120).method34485(new Class9098((Class1849)this.field16527.field2391).method32877(Class6683.field26367, class385).method32877(Class6683.field26362, this.field16527).method32873(method2633).method32883(Class7104.field27716)).iterator();
        while (iterator.hasNext()) {
            this.field16527.field2391.method6886(new Class427(this.field16527.field2391, class385.getX() - MathHelper.sin(this.field16527.field2951 * 0.017453292f), class385.getY(), class385.getZ() + MathHelper.cos(this.field16527.field2951 * 0.017453292f), iterator.next()));
        }
    }
    
    @Override
    public void method11016() {
        if (this.field16528 != null) {
            if (this.field16529 != null) {
                this.field16527.method4490().method11058(false);
                this.field16527.method4150().method24724(this.field16529.getX(), this.field16529.getY(), this.field16529.getZ(), 1.100000023841858);
                if (this.field16527.method1734(this.field16528) >= 2.5) {
                    this.field16527.method4609(false);
                }
                else {
                    ++this.field16530;
                    if (this.field16530 <= 16) {
                        this.field16527.method4176(this.field16528, 45.0f, 45.0f);
                        this.field16527.method4611(true);
                    }
                    else {
                        this.field16527.method4609(true);
                        this.field16527.method4611(false);
                    }
                }
            }
        }
    }
}
