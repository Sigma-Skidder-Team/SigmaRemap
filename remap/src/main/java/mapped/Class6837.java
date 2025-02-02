// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6837 extends Class6831
{
    private static String[] field26846;
    private final ClientPlayerEntity field26847;
    private int field26848;
    
    public Class6837(final ClientPlayerEntity field26847) {
        super(Class8520.field34967, Class286.field1586);
        this.field26847 = field26847;
        this.field26840 = true;
        this.field26841 = 0;
        this.field26835 = 1.0f;
        this.field26843 = true;
        this.field26844 = true;
    }
    
    @Override
    public void method20918() {
        if (!this.field26847.removed && this.field26848 >= 0) {
            if (!this.field26847.method1712()) {
                this.field26848 -= 2;
            }
            else {
                ++this.field26848;
            }
            this.field26848 = Math.min(this.field26848, 40);
            this.field26835 = Math.max(0.0f, Math.min(this.field26848 / 40.0f, 1.0f));
        }
        else {
            this.field26827 = true;
        }
    }
}
