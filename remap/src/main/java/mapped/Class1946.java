// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class Class1946 extends Class1944
{
    private final Class9006 field10601;
    public final /* synthetic */ Class8974 field10599;
    
    public Class1946(final Class8974 class8974, final double n, final Class9006 class8975) {
        this(class8974, null, n, class8975);
    }
    
    public Class1946(final Class8974 field10599, final Class7859 class7859, final double n, final Class9006 field10600) {
        this.field10599 = field10599;
        super(field10599, class7859, n);
        this.field10601 = field10600;
    }
    
    @Override
    public CompletableFuture<Class2033> method7894(final Class9226 class9226) {
        if (this.field10597.get()) {
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        if (!this.field10599.method31864()) {
            this.field10597.set(true);
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        if (this.field10597.get()) {
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        final Vec3d method23456 = this.field10599.field37833.method23456();
        final float n = (float)method23456.x;
        final float n2 = (float)method23456.y;
        final float n3 = (float)method23456.z;
        final Class7819 method23457 = Class9006.method32225(this.field10601);
        if (method23457 == null || !Class9006.method32221(this.field10601).contains(Class6332.method18765())) {
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        final Class4148 method23458 = class9226.method34024(Class6332.method18765());
        Class8974.method31913(this.field10599, method23458);
        method23458.method12389(method23457);
        method23458.method12385(n - Class8974.method31909(this.field10599).method1074(), n2 - Class8974.method31909(this.field10599).method1075(), n3 - Class8974.method31909(this.field10599).method1076());
        Class9006.method32222(this.field10601, method23458.method12387());
        method23458.method12393();
        if (!this.field10597.get()) {
            return this.field10599.field37833.method23461(class9226.method34024(Class6332.method18765()), this.field10599.method31866(Class6332.method18765())).thenApply(p0 -> Class2033.field11590).handle((p0, t2) -> {
                if (t2 != null) {
                    if (!(t2 instanceof CancellationException)) {
                        if (!(t2 instanceof InterruptedException)) {
                            Minecraft.method5277().method5238(CrashReport.makeCrashReport(t2, "Rendering chunk"));
                        }
                    }
                }
                return this.field10597.get() ? Class2033.field11590 : Class2033.field11589;
            });
        }
        return CompletableFuture.completedFuture(Class2033.field11590);
    }
    
    @Override
    public void method7895() {
        this.field10597.set(true);
    }
}
