// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2510 extends Class2466
{
    private static String[] field14504;
    public final /* synthetic */ Class2892 field14505;
    
    public Class2510(final Class2892 field14505) {
        this.field14505 = field14505;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class8322 class8700 = class8699.method29818(Class5260.field22318, 0);
        final short shortValue = class8699.method29818(Class5260.field22292, 0);
        final short shortValue2 = class8699.method29818(Class5260.field22292, 1);
        int intValue = class8699.method29818(Class5260.field22312, 0);
        if (intValue != 25) {
            if (intValue != 33) {
                if (intValue != 29) {
                    if (intValue != 54) {
                        if (intValue != 146) {
                            if (intValue != 130) {
                                if (intValue != 138) {
                                    if (intValue != 52) {
                                        if (intValue != 209) {
                                            if (intValue >= 219) {
                                                if (intValue <= 234) {
                                                    intValue = intValue - 219 + 483;
                                                }
                                            }
                                        }
                                        else {
                                            intValue = 472;
                                        }
                                    }
                                    else {
                                        intValue = 140;
                                    }
                                }
                                else {
                                    intValue = 257;
                                }
                            }
                            else {
                                intValue = 249;
                            }
                        }
                        else {
                            intValue = 305;
                        }
                    }
                    else {
                        intValue = 142;
                    }
                }
                else {
                    intValue = 92;
                }
            }
            else {
                intValue = 99;
            }
        }
        else {
            intValue = 73;
        }
        if (intValue == 73) {
            final Class8699 method29836 = class8699.method29836(11);
            method29836.method29823(Class5260.field22318, new Class8322(class8700.method27704(), class8700.method27705(), class8700.method27706()));
            method29836.method29823(Class5260.field22312, 249 + shortValue * 24 * 2 + shortValue2 * 2);
            method29836.method29831(Class5215.class, true, true);
        }
        class8699.method29821(Class5260.field22312, 0, intValue);
    }
}
