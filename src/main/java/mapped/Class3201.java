// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.io.FileWriter;

public class Class3201 extends Class3167
{
    public FileWriter field15618;
    public int field15619;
    public Class5487 field15620;
    
    public Class3201() {
        super(Class8013.field32988, "DebugSpeed", "");
        this.field15619 = 1;
    }
    
    @Class6753
    public void method10042(final Class5743 class5743) {
        if (this.method9906()) {
            final Class5487 field15620 = new Class5487(Class3201.field15514.field4684.field2395, 0.0, Class3201.field15514.field4684.field2397);
            if (Class3201.field15514.field4684.field2404) {
                if (this.field15620 != null) {
                    final double d = field15620.method16745(this.field15620) / this.field15619 * Class3201.field15514.field4633.field26532;
                    final boolean b = Class9463.method35173().method35194().method29228() > 1 && Class3201.field15514.field4684.field2985 == 0;
                    float floatValue = new BigDecimal(d / (b ? 0.280616 : 0.312948)).setScale(4, RoundingMode.DOWN).floatValue();
                    if (floatValue <= 9.0E-4) {
                        floatValue = 0.0f;
                    }
                    if (floatValue == 0.0f) {
                        return;
                    }
                    String s;
                    for (s = Float.toString(floatValue); s.length() < 6; s += "0") {}
                    Class6430.method19106(Class9463.method35173().method35204().method32671() + "(" + s + "x faster " + (b ? "walking" : "jumping") + ")  Speed: " + d);
                }
            }
            int field15621;
            if (!Class3201.field15514.field4684.field2404) {
                this.field15619 = (field15621 = this.field15619) + 1;
            }
            else {
                field15621 = 1;
            }
            this.field15619 = field15621;
            this.field15620 = field15620;
        }
    }
}
