// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3237 extends Class3167
{
    public static Class3237 field15720;
    
    public Class3237() {
        super(Class8013.field32984, "XRay", "Shows ores");
        Class3237.field15720 = this;
    }
    
    @Override
    public void method9879() {
        Class3237.field15514.field4636.method5701();
    }
    
    @Override
    public void method9897() {
        Class3237.field15514.field4636.method5701();
    }
    
    @Class6753
    public void method10218(final Class5719 class5719) {
        if (this.method9906()) {
            if (!(class5719.method16986().getBlock() instanceof Class3992)) {
                class5719.method16961(true);
            }
            else {
                class5719.method16988(true);
            }
        }
    }
}
