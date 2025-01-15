// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class6371 extends Class6369
{
    private static String[] field25477;
    
    public Class6371(final Class6368[] array, final Class122[] array2) {
        super(array, array2);
    }
    
    @Override
    public Class6373 method19020(final Class6373[] array) {
        switch (array.length) {
            case 0: {
                return Class6371.field25480;
            }
            case 1: {
                return array[0];
            }
            case 2: {
                return (class6375, consumer) -> {
                    class6373.method19016(class6375, consumer);
                    class6374.method19016(class6375, consumer);
                    return true;
                };
            }
            default: {
                return (class7529, consumer) -> {
                    for (int length = array.length, i = 0; i < length; ++i) {
                        array[i].method19016(class7529, consumer);
                    }
                    return true;
                };
            }
        }
    }
}
