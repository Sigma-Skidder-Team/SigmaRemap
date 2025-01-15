// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3172 extends Class3167
{
    public float field15533;
    
    public Class3172() {
        super(Class8013.field32984, "Fullbright", "Makes you see in the dark");
        this.field15533 = 1.0f;
        this.method9881(new Class5001("Type", "Fullbright type", 0, new String[] { "Normal" }));
    }
    
    @Override
    public void method9917() {
        if (!this.method9906()) {
            Class3172.field15514.field4648.field23472 = 1.0;
        }
    }
    
    @Override
    public void method9879() {
        if (this.method9887("Type").equals("Normal")) {
            Class3172.field15514.field4648.field23472 = 999.0;
        }
    }
    
    @Class6753
    public void method9938(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        Class3172.field15514.field4648.field23472 = 999.0;
        if (Class3172.field15514.field4683 == null) {
            return;
        }
        if (this.method9887("Type").equals("Normal")) {
            return;
        }
        int n = 16;
        final BlockPos method1137 = new BlockPos(Class3172.field15514.field4684.field2395, Class3172.field15514.field4684.field2396, Class3172.field15514.field4684.field2397).method1137();
        final Class1860 method1138 = Class3172.field15514.field4683.method6965(method1137);
        if (method1138 != null) {
            if (method1137.getY() >= 0) {
                if (method1137.getY() < 256) {
                    if (!method1138.method7043()) {
                        n -= method1138.method6984(method1137);
                    }
                }
            }
        }
        this.field15533 += (n - this.field15533) * 0.2f;
        if (this.field15533 >= 1.5f) {
            Class3172.field15514.field4648.field23472 = Math.min(Math.max(1.0f, this.field15533), 10.0f);
        }
    }
    
    @Override
    public void method9897() {
        Class3172.field15514.field4648.field23472 = 1.0;
    }
}
