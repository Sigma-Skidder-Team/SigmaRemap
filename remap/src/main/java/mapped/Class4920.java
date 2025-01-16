// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4920 extends Class4825
{
    private static String[] field20591;
    private List<Class9096> field21052;
    private Class8338 field21053;
    public Class2315 field21054;
    
    public Class4920(final Class4803 class4803, final String s) {
        super(class4803, s, 0, 0, Minecraft.method5277().field4632.method7694(), Minecraft.method5277().field4632.method7695(), false);
        this.field21052 = new ArrayList<Class9096>();
        this.field21053 = new Class8338();
        this.field21054 = new Class2315();
        this.method14307(false);
        this.method14305(false);
        this.method14301(false);
        this.method14303(true);
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
        this.method14228();
        final int method7696 = Minecraft.method5277().field4632.method7696();
        final int method7697 = Minecraft.method5277().field4632.method7697();
        final int n2 = (int)(method7696 / 4.0f);
        final boolean b = false;
        if (this.field21052.size() < n2) {
            this.field21052.add(new Class9096((float)this.field21054.nextInt(method7696), (float)this.field21054.nextInt(method7697)));
        }
        while (this.field21052.size() > n2) {
            this.field21052.remove(0);
        }
        if (b) {
            for (int i = 0; i < this.field21052.size(); ++i) {
                this.field21052.get(i).field38518 = (float)this.field21054.nextInt(method7696);
                this.field21052.get(i).field38519 = (float)this.field21054.nextInt(method7697);
            }
        }
        this.field21053.method27790();
        final Iterator<Class9096> iterator = this.field21052.iterator();
        while (iterator.hasNext()) {
            final Class9096 class9096 = iterator.next();
            class9096.method32869();
            if (class9096.field38518 >= -50.0f) {
                if (class9096.field38518 <= method7696 + 50) {
                    if (class9096.field38519 >= -50.0f) {
                        if (class9096.field38519 <= method7697 + 50) {
                            if (Class9096.method32870(class9096) != 0.0f) {
                                class9096.method32867(n);
                                continue;
                            }
                        }
                    }
                }
            }
            iterator.remove();
        }
        super.method14205(n);
    }
}
