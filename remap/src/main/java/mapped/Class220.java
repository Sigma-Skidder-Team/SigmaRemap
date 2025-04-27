// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class220 implements Class193
{
    field751;
    
    private static final int field752;
    private static final int field753;
    private static final int field754;
    private static final int field755;
    private static final int field756;
    private static final int field757;
    private static final int field758;
    private static final int field759;
    private static final int field760;
    private static final int field761;
    private static final int field762;
    private static final int field763;
    private static final int field764;
    private static final int field765;
    private static final int field766;
    private static final int field767;
    
    @Override
    public int method832(final Class6433 class6433, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array = { 0 };
        if (!this.method848(array, n, n2, n3, n4, n5, Class220.field753, Class220.field764)) {
            if (!this.method849(array, n, n2, n3, n4, n5, Class220.field761, Class220.field759)) {
                if (!this.method849(array, n, n2, n3, n4, n5, Class220.field760, Class220.field759)) {
                    if (!this.method849(array, n, n2, n3, n4, n5, Class220.field763, Class220.field766)) {
                        Label_0123: {
                            if (n5 == Class220.field752) {
                                if (n != Class220.field755) {
                                    if (n2 != Class220.field755) {
                                        if (n4 != Class220.field755) {
                                            if (n3 != Class220.field755) {
                                                break Label_0123;
                                            }
                                        }
                                    }
                                }
                                return Class220.field754;
                            }
                        }
                        if (n5 == Class220.field765) {
                            if (n != Class220.field752) {
                                if (n2 != Class220.field752) {
                                    if (n4 != Class220.field752) {
                                        if (n3 != Class220.field752) {
                                            if (n != Class220.field767) {
                                                if (n2 != Class220.field767) {
                                                    if (n4 != Class220.field767) {
                                                        if (n3 != Class220.field767) {
                                                            if (n != Class220.field755) {
                                                                if (n2 != Class220.field755) {
                                                                    if (n4 != Class220.field755) {
                                                                        if (n3 != Class220.field755) {
                                                                            if (n != Class220.field756) {
                                                                                if (n3 != Class220.field756) {
                                                                                    if (n2 != Class220.field756) {
                                                                                        if (n4 != Class220.field756) {
                                                                                            if (n != Class220.field757) {
                                                                                                if (n3 != Class220.field757) {
                                                                                                    if (n2 != Class220.field757) {
                                                                                                        if (n4 != Class220.field757) {
                                                                                                            return n5;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            return Class220.field758;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Class220.field762;
                        }
                        return n5;
                    }
                }
            }
        }
        return array[0];
    }
    
    private boolean method848(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (Class7983.method26037(n5, n6)) {
            if (this.method850(n, n6)) {
                if (this.method850(n2, n6)) {
                    if (this.method850(n4, n6)) {
                        if (this.method850(n3, n6)) {
                            array[0] = n5;
                            return true;
                        }
                    }
                }
            }
            array[0] = n7;
            return true;
        }
        return false;
    }
    
    private boolean method849(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (n5 == n6) {
            if (Class7983.method26037(n, n6)) {
                if (Class7983.method26037(n2, n6)) {
                    if (Class7983.method26037(n4, n6)) {
                        if (Class7983.method26037(n3, n6)) {
                            array[0] = n5;
                            return true;
                        }
                    }
                }
            }
            array[0] = n7;
            return true;
        }
        return false;
    }
    
    private boolean method850(final int n, final int n2) {
        if (Class7983.method26037(n, n2)) {
            return true;
        }
        final Biome biome = Registry.field217.method499(n);
        final Biome class3091 = Registry.field217.method499(n2);
        if (biome != null && class3091 != null) {
            final Class2081 method9861 = biome.method9861();
            final Class2081 method9862 = class3091.method9861();
            if (method9861 != method9862) {
                if (method9861 != Class2081.field12034) {
                    return method9862 == Class2081.field12034;
                }
            }
            return true;
        }
        return false;
    }
    
    static {
        field752 = Registry.field217.getId(Class7102.field27634);
        field753 = Registry.field217.getId(Class7102.field27635);
        field754 = Registry.field217.getId(Class7102.field27666);
        field755 = Registry.field217.getId(Class7102.field27644);
        field756 = Registry.field217.getId(Class7102.field27653);
        field757 = Registry.field217.getId(Class7102.field27705);
        field758 = Registry.field217.getId(Class7102.field27655);
        field759 = Registry.field217.getId(Class7102.field27669);
        field760 = Registry.field217.getId(Class7102.field27671);
        field761 = Registry.field217.getId(Class7102.field27670);
        field762 = Registry.field217.getId(Class7102.field27633);
        field763 = Registry.field217.getId(Class7102.field27664);
        field764 = Registry.field217.getId(Class7102.field27652);
        field765 = Registry.field217.getId(Class7102.field27638);
        field766 = Registry.field217.getId(Class7102.field27637);
        field767 = Registry.field217.getId(Class7102.field27662);
    }
}
