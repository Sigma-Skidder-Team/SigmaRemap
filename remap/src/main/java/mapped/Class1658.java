// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class1658 implements Class1657
{
    private final Class9509 field9369;
    private final Class9144 field9370;
    private final Class9356 field9371;
    private final Random field9372;
    private final Class7860 field9373;
    
    public Class1658(final Class9509 field9369, final Class7860 field9370) {
        this.field9372 = new Random();
        this.field9369 = field9369;
        this.field9373 = field9370;
        if (!Class9570.field41237.method22619()) {
            this.field9370 = new Class9144(this.field9373);
        }
        else {
            this.field9370 = (Class9144)Class9570.method35842(Class9570.field41237, this.field9373);
        }
        this.field9371 = new Class9356();
    }
    
    public Class9509 method5787() {
        return this.field9369;
    }
    
    public void method5788(final BlockState class7096, final BlockPos class7097, final Class1856 class7098, final Class7351 class7099, final Class4150 class7100) {
        this.method5789(class7096, class7097, class7098, class7099, class7100, Class6350.field25397);
    }
    
    public void method5789(final BlockState class7096, final BlockPos class7097, final Class1856 class7098, final Class7351 class7099, final Class4150 class7100, final Class6349 class7101) {
        if (class7096.method21710() == Class2115.field12307) {
            this.field9370.method33354(class7098, this.field9369.method35428(class7096), class7096, class7097, class7099, class7100, true, this.field9372, class7096.method21758(class7097), Class1904.field10335, class7101);
        }
    }
    
    public boolean method5790(final BlockState class7096, final BlockPos class7097, final Class1856 class7098, final Class7351 class7099, final Class4150 class7100, final boolean b, final Random random) {
        return this.method5791(class7096, class7097, class7098, class7099, class7100, b, random, Class6350.field25397);
    }
    
    public boolean method5791(final BlockState class7096, final BlockPos class7097, final Class1856 class7098, final Class7351 class7099, final Class4150 class7100, final boolean b, final Random random, final Class6349 class7101) {
        try {
            return class7096.method21710() == Class2115.field12307 && this.field9370.method33354(class7098, this.method5794(class7096), class7096, class7097, class7099, class7100, b, random, class7096.method21758(class7097), Class1904.field10335, class7101);
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, "Tesselating block in world");
            CrashReportCategory.method16304(method24421.makeCategory("Block being tesselated"), class7097, class7096);
            throw new ReportedException(method24421);
        }
    }
    
    public boolean method5792(final BlockPos class354, final Class1856 class355, final Class4150 class356, final IFluidState class357) {
        try {
            return this.field9371.method34681(class355, class354, class356, class357);
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, "Tesselating liquid in world");
            CrashReportCategory.method16304(method24421.makeCategory("Block being tesselated"), class354, null);
            throw new ReportedException(method24421);
        }
    }
    
    public Class9144 method5793() {
        return this.field9370;
    }
    
    public Class6313 method5794(final BlockState class7096) {
        return this.field9369.method35428(class7096);
    }
    
    public void method5795(final BlockState class7096, final Class7351 class7097, final Class7807 class7098, final int n, final int n2) {
        this.method5796(class7096, class7097, class7098, n, n2, Class6350.field25397);
    }
    
    public void method5796(final BlockState class7096, final Class7351 class7097, final Class7807 class7098, final int n, final int n2, final Class6349 class7099) {
        final Class2115 method21710 = class7096.method21710();
        if (method21710 != Class2115.field12305) {
            switch (Class8083.field33291[method21710.ordinal()]) {
                case 1: {
                    final Class6313 method21711 = this.method5794(class7096);
                    final int method21712 = this.field9373.method25441(class7096, null, null, 0);
                    this.field9370.method33364(class7097.method22569(), class7098.method25214(Class7969.method25825(class7096)), class7096, method21711, (method21712 >> 16 & 0xFF) / 255.0f, (method21712 >> 8 & 0xFF) / 255.0f, (method21712 & 0xFF) / 255.0f, n, n2, class7099);
                    break;
                }
                case 2: {
                    Class9388.field40282.method34897(new ItemStack(class7096.getBlock()), class7097, class7098, n, n2);
                    break;
                }
            }
        }
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9371.method34678();
    }
    
    public Class2014 method5797() {
        return Class2013.field11448;
    }
}
