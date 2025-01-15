// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;

public abstract class Class6053 extends Class6052
{
    @Override
    public void method17985(final Class2776 class2776) throws InvalidDataException {
        if (class2776 instanceof Class2770 && (class2776.method9806() || class2776.method9807())) {
            throw new Class2322("bad rsv RSV1: " + class2776.method9805() + " RSV2: " + class2776.method9806() + " RSV3: " + class2776.method9807());
        }
        if (class2776 instanceof Class2772) {
            if (!class2776.method9805()) {
                if (!class2776.method9806()) {
                    if (!class2776.method9807()) {
                        return;
                    }
                }
            }
            throw new Class2322("bad rsv RSV1: " + class2776.method9805() + " RSV2: " + class2776.method9806() + " RSV3: " + class2776.method9807());
        }
    }
}
