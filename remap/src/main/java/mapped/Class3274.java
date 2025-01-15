// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3274 extends Class3167
{
    public Class3274() {
        super(Class8013.field32985, "FastEat", "Allows you to eat faster");
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "Hypixel" }).method15211("Hypixel"));
        this.method9881(new Class4996("Speed", "Eating speed.", 0.55f, Float.class, 0.0f, 1.0f, 0.01f));
    }
    
    @Class6753
    public void method10319(final Class5743 class5743) {
        if (!this.method9906() || Class3274.field15514.field4684 == null) {
            return;
        }
        if (Class3274.field15514.field4684.method2756()) {
            final ItemStack method2766 = Class3274.field15514.field4684.method2766();
            if (method2766 != null && (method2766.method27653() == Class1992.field11156 || method2766.method27653() == Class1992.field11155) && Class3274.field15514.field4684.method2767() < this.method9886("Speed") * 32.0f) {
                final String method2767 = this.method9887("Mode");
                switch (method2767) {
                    case "Basic": {
                        for (int n2 = Class3274.field15514.field4684.method2767() + 2, i = 0; i < n2; ++i) {
                            Class3274.field15514.method5269().method17292(new Class4353(Class3274.field15514.field4684.field2404));
                            Class3274.field15514.field4684.method2769();
                        }
                        break;
                    }
                    case "Hypixel": {
                        Class3274.field15514.method5269().method17292(new Class4321((Class3274.field15514.field4684.field3006.field2743 + 1 >= 9) ? 0 : (Class3274.field15514.field4684.field3006.field2743 + 1)));
                        Class3274.field15514.method5269().method17292(new Class4321(Class3274.field15514.field4684.field3006.field2743));
                        break;
                    }
                }
            }
        }
    }
}
