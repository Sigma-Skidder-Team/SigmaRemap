// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3307 extends Class3167
{
    public Class3307() {
        super(Class8013.field32990, "Vanilla", "Spider for Vanilla");
        this.method9881(new Class4996("Motion", "Spider motion", 0.35f, Float.class, 0.2f, 1.0f, 0.05f));
    }
    
    @Class6753
    private void method10468(final Class5717 class5717) {
        if (this.method9906()) {
            if (Class3307.field15514.field4684.collidedHorizontally) {
                class5717.method16975(this.method9886("Motion"));
            }
        }
    }
}
