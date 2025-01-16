// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class3364 extends Class3355
{
    public long field16021;
    private List<Class7386> field16022;
    
    public Class3364() {
        super("MusicParticles", "Shows nice particles when music is playing", Class8013.field32991);
        this.field16021 = 0L;
        this.field16022 = new ArrayList<Class7386>();
        this.method9915(false);
    }
    
    @Class6753
    private void method10683(final Class5740 class5740) {
        if (this.method9906() && Class3364.field15514.player != null) {
            if (Class9463.method35173().method35199().method24184()) {
                if (Class9463.method35173().method35199().field30352.size() != 0) {
                    final float min = Math.min(10.0f, Math.max(0.0f, (System.nanoTime() - this.field16021) / 1.810361E7f));
                    double max = 0.0;
                    final int n = 4750;
                    for (int i = 0; i < 3; ++i) {
                        max = Math.max(max, Math.sqrt(Class9463.method35173().method35199().field30354.get(i)) - 1000.0);
                    }
                    final float n2 = (0.7f + (float)(max / (n - 1000)) * 8.14f) * min;
                    int n3 = 0;
                    while (this.field16022.size() < 40) {
                        this.method10684();
                        if (n3++ <= n2) {
                            continue;
                        }
                        break;
                    }
                    this.method10685(n2);
                    final Iterator<Class7386> iterator = this.field16022.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().method22685();
                    }
                }
            }
            this.field16021 = System.nanoTime();
        }
    }
    
    @Override
    public void method9879() {
        this.field16021 = System.nanoTime();
    }
    
    private void method10684() {
        this.field16022.add(new Class7386());
    }
    
    private void method10685(final float n) {
        final Iterator<Class7386> iterator = this.field16022.iterator();
        while (iterator.hasNext()) {
            final Class7386 class7386 = iterator.next();
            class7386.method22684(n);
            if (!class7386.method22686()) {
                continue;
            }
            iterator.remove();
        }
    }
}
