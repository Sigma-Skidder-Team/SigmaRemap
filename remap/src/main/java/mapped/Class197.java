// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Class197 implements Class198, Class196
{
    field656;
    
    private static final Logger field657;
    private static final int field658;
    private static final int field659;
    private static final int field660;
    private static final int field661;
    private static final int field662;
    private static final int field663;
    private static final int field664;
    private static final int field665;
    private static final int field666;
    private static final int field667;
    private static final int field668;
    private static final int field669;
    private static final int field670;
    private static final int field671;
    private static final int field672;
    private static final int field673;
    private static final int field674;
    private static final int field675;
    private static final int field676;
    private static final int field677;
    private static final int field678;
    private static final int field679;
    private static final int field680;
    private static final int field681;
    private static final int field682;
    private static final int field683;
    
    @Override
    public int method841(final Class6433 class6433, final Class6631 class6434, final Class6631 class6435, final int n, final int n2) {
        final int method20074 = class6434.method20074(this.method839(n + 1), this.method840(n2 + 1));
        final int method20075 = class6435.method20074(this.method839(n + 1), this.method840(n2 + 1));
        if (method20074 > 255) {
            Class197.field657.debug("old! {}", (Object)method20074);
        }
        final int n3 = (method20075 - 2) % 29;
        if (!Class7983.method26039(method20074)) {
            if (method20075 >= 2) {
                if (n3 == 1) {
                    final Class3090 class6436 = Registry.field217.method499(method20074);
                    if (class6436 == null || !class6436.method9836()) {
                        final Class3090 method20076 = Class3090.method9834(class6436);
                        return (method20076 != null) ? Registry.field217.getId(method20076) : method20074;
                    }
                }
            }
        }
        if (class6433.method19189(3) == 0 || n3 == 0) {
            int n4 = 0;
            Label_0252: {
                if ((n4 = method20074) != Class197.field660) {
                    if (method20074 != Class197.field664) {
                        if (method20074 != Class197.field658) {
                            if (method20074 != Class197.field677) {
                                if (method20074 != Class197.field680) {
                                    if (method20074 != Class197.field675) {
                                        if (method20074 != Class197.field681) {
                                            if (method20074 != Class197.field674) {
                                                if (method20074 != Class197.field666) {
                                                    if (method20074 != Class197.field668) {
                                                        if (method20074 != Class197.field670) {
                                                            if (method20074 != Class7983.field32848) {
                                                                if (method20074 != Class7983.field32847) {
                                                                    if (method20074 != Class7983.field32849) {
                                                                        if (method20074 != Class7983.field32850) {
                                                                            if (method20074 != Class197.field662) {
                                                                                if (method20074 != Class197.field678) {
                                                                                    if (!Class7983.method26037(method20074, Class197.field673)) {
                                                                                        if (method20074 != Class7983.field32853) {
                                                                                            if (method20074 != Class7983.field32852) {
                                                                                                if (method20074 != Class7983.field32854) {
                                                                                                    if (method20074 != Class7983.field32855) {
                                                                                                        break Label_0252;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (class6433.method19189(3) == 0) {
                                                                                            n4 = ((class6433.method19189(2) != 0) ? Class197.field664 : Class197.field674);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        n4 = Class197.field672;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n4 = Class197.field679;
                                                                                }
                                                                            }
                                                                            else {
                                                                                n4 = Class197.field663;
                                                                            }
                                                                        }
                                                                        else {
                                                                            n4 = Class7983.field32855;
                                                                        }
                                                                    }
                                                                    else {
                                                                        n4 = Class7983.field32854;
                                                                    }
                                                                }
                                                                else {
                                                                    n4 = Class7983.field32852;
                                                                }
                                                            }
                                                            else {
                                                                n4 = Class7983.field32853;
                                                            }
                                                        }
                                                        else {
                                                            n4 = Class197.field671;
                                                        }
                                                    }
                                                    else {
                                                        n4 = Class197.field669;
                                                    }
                                                }
                                                else {
                                                    n4 = Class197.field667;
                                                }
                                            }
                                            else {
                                                n4 = ((class6433.method19189(3) != 0) ? Class197.field664 : Class197.field665);
                                            }
                                        }
                                        else {
                                            n4 = Class197.field682;
                                        }
                                    }
                                    else {
                                        n4 = Class197.field676;
                                    }
                                }
                                else {
                                    n4 = Class197.field683;
                                }
                            }
                            else {
                                n4 = Class197.field674;
                            }
                        }
                        else {
                            n4 = Class197.field659;
                        }
                    }
                    else {
                        n4 = Class197.field665;
                    }
                }
                else {
                    n4 = Class197.field661;
                }
            }
            if (n3 == 0) {
                if (n4 != method20074) {
                    final Class3090 method20077 = Class3090.method9834(Registry.field217.method499(n4));
                    n4 = ((method20077 != null) ? Registry.field217.getId(method20077) : method20074);
                }
            }
            if (n4 != method20074) {
                int n5 = 0;
                if (Class7983.method26037(class6434.method20074(this.method839(n + 1), this.method840(n2 + 0)), method20074)) {
                    ++n5;
                }
                if (Class7983.method26037(class6434.method20074(this.method839(n + 2), this.method840(n2 + 1)), method20074)) {
                    ++n5;
                }
                if (Class7983.method26037(class6434.method20074(this.method839(n + 0), this.method840(n2 + 1)), method20074)) {
                    ++n5;
                }
                if (Class7983.method26037(class6434.method20074(this.method839(n + 1), this.method840(n2 + 2)), method20074)) {
                    ++n5;
                }
                if (n5 >= 3) {
                    return n4;
                }
            }
        }
        return method20074;
    }
    
    static {
        field657 = LogManager.getLogger();
        field658 = Registry.field217.getId(Class7102.field27659);
        field659 = Registry.field217.getId(Class7102.field27660);
        field660 = Registry.field217.getId(Class7102.field27634);
        field661 = Registry.field217.getId(Class7102.field27649);
        field662 = Registry.field217.getId(Class7102.field27635);
        field663 = Registry.field217.getId(Class7102.field27666);
        field664 = Registry.field217.getId(Class7102.field27636);
        field665 = Registry.field217.getId(Class7102.field27650);
        field666 = Registry.field217.getId(Class7102.field27644);
        field667 = Registry.field217.getId(Class7102.field27645);
        field668 = Registry.field217.getId(Class7102.field27653);
        field669 = Registry.field217.getId(Class7102.field27654);
        field670 = Registry.field217.getId(Class7102.field27705);
        field671 = Registry.field217.getId(Class7102.field27706);
        field672 = Registry.field217.getId(Class7102.field27669);
        field673 = Registry.field217.getId(Class7102.field27670);
        field674 = Registry.field217.getId(Class7102.field27633);
        field675 = Registry.field217.getId(Class7102.field27664);
        field676 = Registry.field217.getId(Class7102.field27665);
        field677 = Registry.field217.getId(Class7102.field27661);
        field678 = Registry.field217.getId(Class7102.field27667);
        field679 = Registry.field217.getId(Class7102.field27668);
        field680 = Registry.field217.getId(Class7102.field27637);
        field681 = Registry.field217.getId(Class7102.field27662);
        field682 = Registry.field217.getId(Class7102.field27663);
        field683 = Registry.field217.getId(Class7102.field27651);
    }
}
