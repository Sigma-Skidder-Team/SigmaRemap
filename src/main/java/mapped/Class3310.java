// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3310 extends Class3167
{
    public int field15889;
    
    public Class3310() {
        super(Class8013.field32992, "AutoTotem", "Automatically equips a totem in your second hand");
        this.field15889 = -1;
    }
    
    @Class6753
    private void method10473(final Class5743 class5743) {
        this.method10475();
    }
    
    @Class6753
    private void method10474(final Class5744 class5744) {
        if (!class5744.method17046()) {
            this.method10475();
        }
    }
    
    @Override
    public String method9900() {
        return this.method9901() + "";
    }
    
    private void method10475() {
        if (this.method9906()) {
            if (Class3310.field15514.field4684 != null) {
                if (!Class3310.field15514.field4684.field3025.field27304) {
                    if (Class3310.field15514.field4684.method2718(Class2215.field13601).method27622() == Class7739.field31590) {
                        return;
                    }
                    final int method29319 = Class8639.method29319(Class7739.field31590);
                    if (method29319 != -1) {
                        Class3310.field15514.field4682.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, Class3310.field15514.field4684);
                        Class3310.field15514.field4682.method27324(0, 45, 0, Class2133.field12437, Class3310.field15514.field4684);
                        Class3310.field15514.field4682.method27324(0, (method29319 >= 9) ? method29319 : (method29319 + 36), 0, Class2133.field12437, Class3310.field15514.field4684);
                    }
                }
            }
        }
    }
}
