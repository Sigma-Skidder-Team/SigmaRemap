// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2588 extends Class2466
{
    private static String[] field14647;
    public final /* synthetic */ Class2976 field14648;
    
    public Class2588(final Class2976 field14648) {
        this.field14648 = field14648;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final byte byteValue = class8699.method29818(Class5260.field22289, 0);
        if (byteValue == 255) {
            return;
        }
        final Class8322 class8700 = class8699.method29818(Class5260.field22318, 0);
        long longValue = class8700.method27704();
        long longValue2 = class8700.method27705();
        long longValue3 = class8700.method27706();
        switch (byteValue) {
            case 0: {
                --longValue2;
                break;
            }
            case 1: {
                ++longValue2;
                break;
            }
            case 2: {
                --longValue3;
                break;
            }
            case 3: {
                ++longValue3;
                break;
            }
            case 4: {
                --longValue;
                break;
            }
            case 5: {
                ++longValue;
                break;
            }
        }
        class8699.method29841().method18207(Class6634.class).method20092(new Class8322(longValue, longValue2, longValue3));
    }
}
