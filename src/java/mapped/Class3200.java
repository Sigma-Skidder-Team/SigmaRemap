// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3200 extends Class3167
{
    private int field15617;
    
    public Class3200() {
        super(Class8013.field32990, "Invaded", "Speed for Invadedlands");
        this.method9881(new Class4996("Speed", "Speed value", 3.0f, Float.class, 0.5f, 9.5f, 0.1f));
    }
    
    @Override
    public void method9879() {
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.2800000011920929);
        Class3200.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    public void method10041(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field15617;
            if (this.field15617 != 1) {
                if (this.field15617 != 2) {
                    if (this.field15617 >= 3) {
                        this.field15617 = 0;
                        Class3200.field15514.field4633.field26532 = 0.25f;
                        Class7482.method23149(class5717, this.method9886("Speed"));
                    }
                }
                else {
                    Class3200.field15514.field4633.field26532 = 2.0f;
                    Class7482.method23149(class5717, Class7482.method23136() + 0.05);
                }
            }
            else {
                Class3200.field15514.field4633.field26532 = 2.0f;
                Class7482.method23149(class5717, Class7482.method23136() + 0.05);
            }
        }
    }
}
