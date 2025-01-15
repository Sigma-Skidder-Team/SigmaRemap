// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class6372 extends Class6369
{
    private static String[] field25478;
    
    public Class6372(final Class6368[] array, final Class122[] array2) {
        super(array, array2);
    }
    
    @Override
    public Class6373 method19020(final Class6373[] array) {
        switch (array.length) {
            case 0: {
                return Class6372.field25480;
            }
            case 1: {
                return array[0];
            }
            case 2: {
                return array[0].method19027(array[1]);
            }
            default: {
                return (class7529, consumer) -> {
                    for (int length = array.length, i = 0; i < length; ++i) {
                        if (!array[i].method19016(class7529, consumer)) {
                            return false;
                        }
                    }
                    return true;
                };
            }
        }
    }
}
