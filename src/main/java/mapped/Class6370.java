// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;

public class Class6370 extends Class6369
{
    public Class6370(final Class6368[] array, final Class122[] array2) {
        super(array, array2);
    }
    
    @Override
    public Class6373 method19020(final Class6373[] array) {
        switch (array.length) {
            case 0: {
                return Class6370.field25479;
            }
            case 1: {
                return array[0];
            }
            case 2: {
                return array[0].method19028(array[1]);
            }
            default: {
                return (class7529, consumer) -> {
                    for (int length = array.length, i = 0; i < length; ++i) {
                        if (array[i].method19016(class7529, consumer)) {
                            return true;
                        }
                    }
                    return false;
                };
            }
        }
    }
    
    @Override
    public void method19015(final Class7790 class7790) {
        super.method19015(class7790);
        for (int i = 0; i < this.field25475.length - 1; ++i) {
            if (ArrayUtils.isEmpty((Object[])this.field25475[i].field25473)) {
                class7790.method25014("Unreachable entry!");
            }
        }
    }
    
    public static Class4951 method19022(final Class4950<?>... array) {
        return new Class4951(array);
    }
}
