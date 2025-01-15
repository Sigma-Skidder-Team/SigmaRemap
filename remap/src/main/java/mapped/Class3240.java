// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3240 extends Class3167
{
    public Class3240() {
        super(Class8013.field32990, "FastLadder", "Allows you to climp ladders faster");
        this.method9881(new Class4996("Motion", "Climbing motion", 0.35f, Float.class, 0.2f, 1.0f, 0.05f));
        this.method9881(new Class5001("Down mode", "The way you will go down on ladders", 0, new String[] { "None", "OnSneak", "Always" }));
    }
    
    @Class6753
    private void method10233(final Class5717 class5717) {
        if (this.method9906() && Class3240.field15514.field4684.method2688()) {
            final boolean b = Class9367.method34762() >= Class7906.field32453.method25613() || Class3240.field15514.method5282() == null;
            if (!Class3240.field15514.field4684.collidedHorizontally && (!Class3240.field15514.field4684.field2967 || !b)) {
                if ((this.method9887("Down mode").equals("OnSneak") && Class3240.field15514.field4648.field23440.method1056()) || this.method9887("Down mode").equals("Always")) {
                    class5717.method16975(-this.method9886("Motion"));
                }
            }
            else {
                class5717.method16975(this.method9886("Motion"));
            }
        }
    }
}
