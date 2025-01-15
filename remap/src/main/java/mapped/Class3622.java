// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.Optional;
import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3622 extends Class3617
{
    private static String[] field16824;
    private final Predicate<Class7096> field16825;
    private int field16826;
    private int field16827;
    private boolean field16828;
    private Vec3d field16829;
    private int field16830;
    public final /* synthetic */ Class798 field16831;
    
    public Class3622(final Class798 field16831) {
        this.field16831 = field16831;
        super(field16831, null);
        this.field16825 = (class7096 -> {
            if (!class7096.method21755(Class7188.field27912)) {
                return class7096.method21755(Class7188.field27909);
            }
            else if (class7096.method21696() != Class7521.field29549) {
                return true;
            }
            else {
                return class7096.method21772(Class3870.field17513) == Class182.field564;
            }
        });
        this.field16826 = 0;
        this.field16827 = 0;
        this.field16830 = 0;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11137() {
        if (Class798.method4573(this.field16831) > 0) {
            return false;
        }
        if (this.field16831.method4529()) {
            return false;
        }
        if (this.field16831.field2391.method6771()) {
            return false;
        }
        if (Class798.method4574(this.field16831).nextFloat() < 0.7f) {
            return false;
        }
        final Optional<BlockPos> method11157 = this.method11157();
        if (!method11157.isPresent()) {
            return false;
        }
        Class798.method4565(this.field16831, method11157.get());
        Class798.method4575(this.field16831).method24724(Class798.method4561(this.field16831).method1074() + 0.5, Class798.method4561(this.field16831).method1075() + 0.5, Class798.method4561(this.field16831).method1076() + 0.5, 1.2000000476837158);
        return true;
    }
    
    @Override
    public boolean method11138() {
        if (!this.field16828) {
            return false;
        }
        if (!this.field16831.method4510()) {
            return false;
        }
        if (this.field16831.field2391.method6771()) {
            return false;
        }
        if (this.method11152()) {
            return Class798.method4576(this.field16831).nextFloat() < 0.2f;
        }
        if (this.field16831.field2424 % 20 == 0 && !Class798.method4562(this.field16831, Class798.method4561(this.field16831))) {
            Class798.method4565(this.field16831, null);
            return false;
        }
        return true;
    }
    
    private boolean method11152() {
        return this.field16826 > 400;
    }
    
    private boolean method11153() {
        return this.field16828;
    }
    
    private void method11154() {
        this.field16828 = false;
    }
    
    @Override
    public void method11015() {
        this.field16826 = 0;
        this.field16830 = 0;
        this.field16827 = 0;
        this.field16828 = true;
        this.field16831.method4517();
    }
    
    @Override
    public void method11018() {
        if (this.method11152()) {
            Class798.method4577(this.field16831, true);
        }
        this.field16828 = false;
        Class798.method4578(this.field16831).method24733();
        Class798.method4579(this.field16831, 200);
    }
    
    @Override
    public void method11016() {
        ++this.field16830;
        if (this.field16830 <= 600) {
            final Vec3d method16744 = new Vec3d(Class798.method4561(this.field16831)).add(0.5, 0.6000000238418579, 0.5);
            if (method16744.distanceTo(this.field16831.method1934()) <= 1.0) {
                if (this.field16829 == null) {
                    this.field16829 = method16744;
                }
                final boolean b = this.field16831.method1934().distanceTo(this.field16829) <= 0.1;
                int n = 1;
                if (!b && this.field16830 > 600) {
                    Class798.method4565(this.field16831, null);
                }
                else {
                    if (b) {
                        if (Class798.method4580(this.field16831).nextInt(100) != 0) {
                            n = 0;
                        }
                        else {
                            this.field16829 = new Vec3d(method16744.getX() + this.method11156(), method16744.getY(), method16744.getZ() + this.method11156());
                            Class798.method4581(this.field16831).method24733();
                        }
                        this.field16831.method4147().method24668(method16744.getX(), method16744.getY(), method16744.getZ());
                    }
                    if (n != 0) {
                        this.method11155();
                    }
                    ++this.field16826;
                    if (Class798.method4582(this.field16831).nextFloat() < 0.05f) {
                        if (this.field16826 > this.field16827 + 60) {
                            this.field16827 = this.field16826;
                            this.field16831.method1695(Class8520.field35019, 1.0f, 1.0f);
                        }
                    }
                }
            }
            else {
                this.field16829 = method16744;
                this.method11155();
            }
        }
        else {
            Class798.method4565(this.field16831, null);
        }
    }
    
    private void method11155() {
        this.field16831.method4148().method19907(this.field16829.getX(), this.field16829.getY(), this.field16829.getZ(), 0.3499999940395355);
    }
    
    private float method11156() {
        return (Class798.method4583(this.field16831).nextFloat() * 2.0f - 1.0f) * 0.33333334f;
    }
    
    private Optional<BlockPos> method11157() {
        return this.method11158(this.field16825, 5.0);
    }
    
    private Optional<BlockPos> method11158(final Predicate<Class7096> predicate, final double n) {
        final BlockPos class354 = new BlockPos(this.field16831);
        final Class385 value = new Class385();
        for (int n2 = 0; n2 <= n; n2 = ((n2 <= 0) ? (1 - n2) : (-n2))) {
            for (boolean b = false; (b ? 1 : 0) < n; ++b) {
                for (int i = 0; i <= (b ? 1 : 0); i = ((i <= 0) ? (1 - i) : (-i))) {
                    for (int j = (i < (b ? 1 : 0) && i > ((-b) ? 1 : 0)) ? b : 0; j <= (b ? 1 : 0); j = ((j <= 0) ? (1 - j) : (-j))) {
                        value.method1287(class354).method1292(i, n2 - 1, j);
                        if (class354.withinDistance(value, n) && predicate.test(this.field16831.field2391.method6701(value))) {
                            return (Optional<BlockPos>)Optional.of(value);
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }
}
