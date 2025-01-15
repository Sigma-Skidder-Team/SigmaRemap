// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class3263 extends Class3247
{
    public Class3263() {
        super(Class8013.field32992, "AutoGapple", "Automatically eat golden apples", new Class3167[] { new Class3198(), new Class3366() });
        this.method9881(new Class4996("Health", "Maximum health before eating gapple.", 7.0f, Float.class, 0.5f, 10.0f, 0.5f));
    }
    
    public int method10292(final boolean b) {
        for (int i = 36; i < 45; ++i) {
            if (Class3263.field15514.field4684.field3008.method10878(i).method20054()) {
                final Class8321 method20053 = Class3263.field15514.field4684.field3008.method10878(i).method20053();
                if (method20053 != null) {
                    if (!b) {
                        if (method20053.method27622() == Class7739.field31341 || method20053.method27622() == Class7739.field31342) {
                            return i - 36;
                        }
                    }
                    else {
                        final List<Class1948> method20054 = Class8639.method29355(method20053);
                        if (method20054 != null) {
                            final Iterator<Class1948> iterator = method20054.iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().method7906() != Class9439.field40485) {
                                    continue;
                                }
                                return i - 36;
                            }
                        }
                    }
                }
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (Class3263.field15514.field4684.field3008.method10878(j).method20054()) {
                final Class8321 method20055 = Class3263.field15514.field4684.field3008.method10878(j).method20053();
                if (!b) {
                    if (method20055.method27622() == Class7739.field31341 || method20055.method27622() == Class7739.field31342) {
                        Class8639.method29370(j, 4);
                        return -1;
                    }
                }
                else {
                    final List<Class1948> method20056 = Class8639.method29355(method20055);
                    if (method20056 != null) {
                        final Iterator<Class1948> iterator2 = method20056.iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().method7906() != Class9439.field40485) {
                                continue;
                            }
                            Class8639.method29370(j, 4);
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
