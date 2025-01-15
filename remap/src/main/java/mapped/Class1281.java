// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1281 implements Runnable
{
    private static String[] field7001;
    public final /* synthetic */ int field7002;
    public final /* synthetic */ float[] field7003;
    public final /* synthetic */ Class3281 field7004;
    
    public Class1281(final Class3281 field7004, final int field7005, final float[] field7006) {
        this.field7004 = field7004;
        this.field7002 = field7005;
        this.field7003 = field7006;
    }
    
    @Override
    public void run() {
        Class3281.method10351().method5269().method17292(new Class4321(this.field7002));
        Class3281.method10352().method5269().method17292(new Class4329(Class316.field1877, Class4609.method13697(this.field7003[0], this.field7003[1], 4.5f)));
        Class3281.method10353().method5269().method17292(new Class4380(Class316.field1877));
        Class3281.method10355().method5269().method17292(new Class4321(Class3281.method10354().field4684.field3006.field2743));
    }
}
