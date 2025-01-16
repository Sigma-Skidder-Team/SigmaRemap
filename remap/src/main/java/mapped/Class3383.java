// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3383 extends Class3167
{
    private int field16100;
    
    public Class3383() {
        super(Class8013.field32990, "ViperMC", "ViperMC speed");
    }
    
    @Override
    public void method9879() {
        this.field16100 = 1;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.2800000011920929);
        Class3383.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    public void method10796(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field16100;
            float n = 0.28f + Class7482.method23139() * 0.05f;
            if (this.field16100 >= 4) {
                this.field16100 = 0;
                n = 1.15f + Class7482.method23139() * 0.04f;
            }
            if (Class3383.field15514.gameSettings.field23437.field2162) {
                n /= 1.3f;
            }
            Class7482.method23149(class5717, n);
        }
    }
}
