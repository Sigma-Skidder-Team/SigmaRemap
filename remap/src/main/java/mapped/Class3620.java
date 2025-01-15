// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import com.google.common.collect.Lists;
import java.util.List;

public class Class3620 extends Class3617
{
    private static String[] field16817;
    private int field16818;
    private List<BlockPos> field16819;
    private Class9468 field16820;
    public final /* synthetic */ Class798 field16821;
    
    public Class3620(final Class798 field16821) {
        this.field16821 = field16821;
        super(field16821, null);
        this.field16818 = this.field16821.world.rand.nextInt(10);
        this.field16819 = Lists.newArrayList();
        this.field16820 = null;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11137() {
        if (Class798.method4545(this.field16821) != null) {
            if (!this.field16821.method4201()) {
                if (Class798.method4544(this.field16821)) {
                    if (!this.method11145(Class798.method4545(this.field16821))) {
                        if (this.field16821.world.method6701(Class798.method4545(this.field16821)).method21755(Class7188.field27931)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11138() {
        return this.method11137();
    }
    
    @Override
    public void method11015() {
        this.field16818 = 0;
        super.method11015();
    }
    
    @Override
    public void method11018() {
        this.field16818 = 0;
        Class798.method4547(this.field16821).method24733();
        Class798.method4548(this.field16821).method24712();
    }
    
    @Override
    public void method11016() {
        if (Class798.method4545(this.field16821) != null) {
            ++this.field16818;
            if (this.field16818 <= 600) {
                if (!Class798.method4549(this.field16821).method24732()) {
                    if (Class798.method4550(this.field16821, Class798.method4545(this.field16821), 16)) {
                        if (this.method11139(Class798.method4545(this.field16821))) {
                            if (this.field16820 != null && Class798.method4553(this.field16821).method24727().method35227(this.field16820)) {
                                this.method11144();
                            }
                            else {
                                this.field16820 = Class798.method4554(this.field16821).method24727();
                            }
                        }
                        else {
                            this.method11143();
                        }
                    }
                    else if (!Class798.method4551(this.field16821, Class798.method4545(this.field16821))) {
                        Class798.method4552(this.field16821, Class798.method4545(this.field16821));
                    }
                    else {
                        this.method11144();
                    }
                }
            }
            else {
                this.method11143();
            }
        }
    }
    
    private boolean method11139(final BlockPos class354) {
        Class798.method4555(this.field16821).method24713(10.0f);
        Class798.method4556(this.field16821).method24724(class354.getX(), class354.getY(), class354.getZ(), 1.0);
        return Class798.method4557(this.field16821).method24727() != null && Class798.method4558(this.field16821).method24727().method35228();
    }
    
    private boolean method11140(final BlockPos class354) {
        return this.field16819.contains(class354);
    }
    
    private void method11141(final BlockPos class354) {
        this.field16819.add(class354);
        while (this.field16819.size() > 3) {
            this.field16819.remove(0);
        }
    }
    
    private void method11142() {
        this.field16819.clear();
    }
    
    private void method11143() {
        if (Class798.method4545(this.field16821) != null) {
            this.method11141(Class798.method4545(this.field16821));
        }
        this.method11144();
    }
    
    private void method11144() {
        Class798.method4546(this.field16821, null);
        Class798.method4559(this.field16821, 200);
    }
    
    private boolean method11145(final BlockPos class354) {
        if (!Class798.method4550(this.field16821, class354, 2)) {
            final Class9468 method24727 = Class798.method4560(this.field16821).method24727();
            if (method24727 != null) {
                if (method24727.method35232().equals(class354)) {
                    if (method24727.method35228()) {
                        if (method24727.method35215()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
