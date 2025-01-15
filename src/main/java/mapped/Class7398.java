// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class7398
{
    public static Class7398 method22733(final Class3737 class3737) {
        final long method11492 = class3737.method11492();
        Class7398 class3738;
        if (method11492 != 1681012275L) {
            if (method11492 != 1684106610L) {
                if (method11492 != 1684371043L) {
                    if (method11492 != 1685152624L) {
                        if (method11492 != 1685286262L) {
                            if (method11492 != 1635148611L) {
                                if (method11492 != 1684103987L) {
                                    if (method11492 != 1684366131L) {
                                        class3738 = new Class7401(null);
                                    }
                                    else {
                                        class3738 = new Class7402(class3737);
                                    }
                                }
                                else {
                                    class3738 = new Class7405(class3737);
                                }
                            }
                            else {
                                class3738 = new Class7397(class3737);
                            }
                        }
                        else {
                            class3738 = new Class7400(class3737);
                        }
                    }
                    else {
                        class3738 = new Class7399(class3737);
                    }
                }
                else {
                    class3738 = new Class7404(class3737);
                }
            }
            else {
                class3738 = new Class7406(class3737);
            }
        }
        else {
            class3738 = new Class7403(class3737);
        }
        return class3738;
    }
}
