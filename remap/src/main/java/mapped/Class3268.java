// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3268 extends Class3167
{
    public Class3268() {
        super(Class8013.field32987, "AutoFish", "Automatically catches fish for you");
    }
    
    @Class6753
    public void method10301(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (!(class5723.method16998() instanceof Class4282) && !(class5723.method16998() instanceof Class4342)) {
            return;
        }
        if (Class3268.field15514.player.getHeldItemMainhand() == null) {
            return;
        }
        if (Class3268.field15514.player.getHeldItemMainhand().getItem() instanceof Class4047) {
            if (!(class5723.method16998() instanceof Class4282)) {
                if (class5723.method16998() instanceof Class4342) {
                    if (!((Class4342)class5723.method16998()).field19450.equals("entity.bobber.splash")) {
                        return;
                    }
                }
            }
            else if (!((Class4282)class5723.method16998()).method12863().equals(Class8520.field35037)) {
                return;
            }
            Class3268.field15514.method5269().method17292(new Class4307(Class316.field1877));
            Class3268.field15514.method5269().method17292(new Class4307(Class316.field1877));
            Class9463.method35173().method35197().method25776(new Class6224("AutoFish", "We catched something!", Class7853.field32192));
        }
    }
}
