// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class3360 extends Class3355
{
    private boolean field16003;
    public boolean field16004;
    
    public Class3360() {
        super("BoatFly", "Fly with a boat", Class8013.field32990);
        this.field16004 = false;
    }
    
    @Class6753
    public void method10641(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class3360.field15514.field4684.method1920() != null) {
            final Class5487 method1935 = Class3360.field15514.field4684.method1920().method1935();
            if (Math.sqrt(method1935.field22770 * method1935.field22770 + method1935.field22772 * method1935.field22772) >= 1.399999976158142) {}
            final float method1936 = Class7482.method23147();
            double n = Math.cos(Math.toRadians(method1936)) * 5.0;
            double n2 = Math.sin(Math.toRadians(method1936)) * 5.0;
            if (!Class7482.method23148()) {
                n = 0.0;
                n2 = 0.0;
            }
            final Entity method1937 = Class3360.field15514.field4684.method1920();
            method1937.field2399 = Class3360.field15514.field4684.field2399;
            method1937.method1937(n, Class3360.field15514.field4684.field2967 ? 1.0 : (this.field16004 ? -1.0 : 0.03999999910593033), n2);
            if (Class3360.field15514.field4684.field2424 % 100 != 0) {}
        }
    }
    
    @Class6753
    private void method10642(final Class5752 class5752) {
        if (!this.method9906()) {
            return;
        }
        if (Class3360.field15514.field4684.method1920() == null) {
            return;
        }
        if (!Class3360.field15514.field4684.method1920().field2404) {
            if (class5752.method17061() == Class3360.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field16004 = true;
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10643(final Class5721 class5721) {
        if (this.method9906()) {
            if (!class5721.method16990().toString().contains(".play.client.")) {}
            if (!(class5721.method16990() instanceof Class4303)) {
                if (class5721.method16990() instanceof Class4323) {
                    if (!Class3360.field15514.field4684.method1768()) {}
                }
            }
        }
    }
    
    @Class6753
    private void method10644(final Class5715 class5715) {
        if (!this.method9906()) {
            return;
        }
        if (Class3360.field15514.field4684.method1920() == null) {
            return;
        }
        if (!Class3360.field15514.field4684.method1920().field2404) {
            if (class5715.method16963() == Class3360.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field16004 = false;
            }
        }
    }
    
    @Override
    public void method9879() {
        this.field16004 = false;
    }
    
    @Override
    public void method9897() {
        Class3360.field15514.field4648.field23440.field2162 = this.field16004;
    }
}
