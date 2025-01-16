// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3179 extends Class3167
{
    public int field15563;
    
    public Class3179() {
        super(Class8013.field32985, "AutoRespawn", "Respawns for you");
        this.field15563 = 30;
    }
    
    @Class6753
    public void method9974(final Class5743 class5743) {
        if (this.method9906()) {
            if (!Class3179.field15514.player.method1768()) {
                Class3179.field15514.player.method2842();
            }
        }
    }
}
