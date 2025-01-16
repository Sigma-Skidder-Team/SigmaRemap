// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3278 extends Class3167
{
    public Class3278() {
        super(Class8013.field32985, "Sneak", "Always sneaks");
    }
    
    @Override
    public void method9897() {
        Class3278.field15514.method5269().method17292(new Class4336(Class3278.field15514.player, Class287.field1592));
    }
    
    @Class6753
    public void method10328(final Class5744 class5744) {
        if (this.method9906()) {
            if (!class5744.method17046()) {
                Class3278.field15514.method5269().method17292(new Class4336(Class3278.field15514.player, Class287.field1592));
                Class3278.field15514.method5269().method17292(new Class4336(Class3278.field15514.player, Class287.field1591));
            }
            else {
                Class3278.field15514.method5269().method17292(new Class4336(Class3278.field15514.player, Class287.field1591));
                Class3278.field15514.method5269().method17292(new Class4336(Class3278.field15514.player, Class287.field1592));
            }
        }
    }
}
