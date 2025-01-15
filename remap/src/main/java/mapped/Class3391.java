// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;

public class Class3391 extends Class3167
{
    private HashMap<Integer, Integer> field16102;
    
    public Class3391() {
        super(Class8013.field32988, "StaffRepealer", "Repeals hypixel's staff ban laws with a simple rage quit!");
        this.field16102 = new HashMap<Integer, Integer>();
    }
    
    @Class6753
    private void method10812(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class6430.method19146()) {
            Class3391.field15514.field4648.method17124();
        }
    }
    
    @Class6753
    private void method10813(final Class5723 class5726) {
        if (this.method9906()) {
            if (class5726.method16998() instanceof Class4370) {
                final Class4370 class5724 = (Class4370)class5726.method16998();
            }
            if (class5726.method16998() instanceof Class4330) {
                new Thread(() -> {
                    final Object o = class5726.method16998();
                    try {
                        Thread.sleep(2000L);
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    class5725.method13001().iterator();
                    final Iterator iterator;
                    while (iterator.hasNext()) {
                        final Class4646 class5727 = iterator.next();
                        if (Class3391.field15514.field4683.method7143(class5727.method13869().getId()) == null && class5727.method13871() != null) {
                            Class6430.method19106("Detected an anomaly " + class5727 + class5727.method13869());
                        }
                        else {
                            System.out.println("all seems good " + class5727 + class5727.method13869());
                        }
                        int n = 0;
                        ++n;
                    }
                }).start();
            }
        }
    }
}
