// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4912 extends Class4825
{
    private static String[] field20591;
    private List<Class9159> field21012;
    private Class8338 field21013;
    public Class2315 field21014;
    
    public Class4912(final Class4803 class4803, final String s) {
        super(class4803, s, 0, 0, Minecraft.method5277().field4632.method7694(), Minecraft.method5277().field4632.method7695(), false);
        this.field21012 = new ArrayList<Class9159>();
        this.field21013 = new Class8338();
        this.field21014 = new Class2315();
        this.method14307(false);
        this.method14305(false);
        this.method14301(false);
        this.method14303(true);
        this.method14311(false);
    }
    
    @Override
    public void method14307(final boolean b) {
        super.method14307(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        final int method7696 = Minecraft.method5277().field4632.method7696();
        final int method7697 = Minecraft.method5277().field4632.method7697();
        final int n2 = method7696 / 2;
        int n3 = 0;
        while (this.field21012.size() < n2) {
            this.field21012.add(new Class9159((float)this.field21014.nextInt(method7696), (float)this.field21014.nextInt(method7697)));
            n3 = 1;
        }
        while (this.field21012.size() > n2) {
            this.field21012.remove(0);
            n3 = 1;
        }
        if (n3 != 0) {
            for (int i = 0; i < this.field21012.size(); ++i) {
                this.field21012.get(i).field38808 = (float)this.field21014.nextInt(method7696);
                this.field21012.get(i).field38809 = (float)this.field21014.nextInt(method7697);
            }
        }
        this.field21013.method27790();
        for (final Class9159 class9159 : this.field21012) {
            class9159.method33440(this.field21013);
            if (class9159.field38808 >= 0.0f) {
                if (class9159.field38808 > method7696) {
                    class9159.field38808 = 0.0f;
                }
            }
            else {
                class9159.field38808 = (float)method7696;
            }
            if (class9159.field38809 >= 0.0f) {
                if (class9159.field38809 > method7697) {
                    class9159.field38809 = 0.0f;
                }
            }
            else {
                class9159.field38809 = (float)method7697;
            }
            class9159.method33439(n);
        }
        super.method14205(n);
    }
}
