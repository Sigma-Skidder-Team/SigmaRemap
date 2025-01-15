// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class3208 extends Class3167
{
    public Class3208() {
        super(Class8013.field32986, "InteractRange", "Allows you to interact farer away");
        this.method9881(new Class4996("Range", "Range value", 4.0f, Float.class, 3.0f, 8.0f, 0.01f));
    }
    
    @Class6753
    private void method10085(final Class5748 class5748) {
        if (this.method9906()) {
            final Entity method19141 = Class6430.method19141(Class3208.field15514.field4684.field2399, Class3208.field15514.field4684.field2400, this.method9886("Range"), 0.0);
            final Class7005 method19142 = Class4609.method13697(Class3208.field15514.field4684.field2399, Class3208.field15514.field4684.field2400, this.method9886("Range"));
            if (method19141 != null) {
                if (Class3208.field15514.field4691.method21449() == Class2165.field12880) {
                    Class3208.field15514.field4691 = new Class7007(method19141);
                }
            }
            if (method19141 == null) {
                if (Class3208.field15514.field4691.method21449() == Class2165.field12880) {
                    if (method19142 != null) {
                        Class3208.field15514.field4691 = method19142;
                    }
                }
            }
        }
    }
}
