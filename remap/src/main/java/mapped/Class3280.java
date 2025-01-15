// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3280 extends Class3167
{
    public Class3280() {
        super(Class8013.field32987, "Timer", "Speeds up the world's timer");
        this.method9881(new Class4996("Timer", "Timer value", 0.1f, Float.class, 0.1f, 10.0f, 0.1f));
    }
    
    @Class6753
    private void method10344(final Class5743 class5743) {
        if (this.method9906()) {
            Class3280.field15514.field4633.field26532 = this.method9886("Timer");
        }
    }
    
    @Override
    public void method9897() {
        Class3280.field15514.field4633.field26532 = 1.0f;
    }
}
