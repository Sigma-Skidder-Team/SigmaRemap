// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class626 extends Class624
{
    public final Class7437 field3607;
    public final /* synthetic */ Class5079 field3608;
    
    public Class626(final Class5079 field3608, final Class7437 field3609) {
        this.field3608 = field3608;
        this.field3607 = field3609;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3625(this.field3607, n3, n2, n6, n7);
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (this.field3607.field28679 != Class2153.field12793) {
            Class5079.method15826(this.field3608, this.field3607.field28675);
        }
        else {
            Class5079.method15826(this.field3608, -1L);
            Class7847.method25362(new Class5082(this.field3607, this.field3608));
        }
        return true;
    }
    
    private void method3625(final Class7437 class7437, final int n, final int n2, final int n3, final int n4) {
        this.method3626(class7437, n + 36, n2, n3, n4);
    }
    
    private void method3626(final Class7437 class7437, final int n, final int n2, final int n3, final int n4) {
        if (class7437.field28679 != Class2153.field12793) {
            if (!class7437.field28684) {
                if (class7437.field28679 != Class2153.field12791) {
                    if (Class5079.method15844(this.field3608, class7437) && class7437.field28686 < 7) {
                        Class5079.method15845(this.field3608, n + 225 - 14, n2 + 2, n3, n4, class7437.field28686);
                    }
                    else if (class7437.field28679 == Class2153.field12792) {
                        Class5079.method15846(this.field3608, n + 225 - 14, n2 + 2, n3, n4);
                    }
                }
                else {
                    Class5079.method15843(this.field3608, n + 225 - 14, n2 + 2, n3, n4);
                }
            }
            else {
                Class5079.method15842(this.field3608, n + 225 - 14, n2 + 2, n3, n4);
            }
            if (!Class5079.method15844(this.field3608, class7437) && !Class5079.method15847()) {
                Class5079.method15848(this.field3608, n + 225, n2 + 2, n3, n4);
            }
            else {
                Class5079.method15849(this.field3608, n + 225, n2 + 2, n3, n4);
            }
            if (!"0".equals(class7437.field28692.field28697)) {
                final String string = Class314.field1853 + "" + class7437.field28692.field28697;
                this.field3608.method15407(string, n + 207 - this.field3608.method15424(string), n2 + 3, 8421504);
                if (n3 >= n + 207 - this.field3608.method15424(string)) {
                    if (n3 <= n + 207) {
                        if (n4 >= n2 + 1) {
                            if (n4 <= n2 + 10) {
                                if (n4 < this.field3608.method15422() - 40) {
                                    if (n4 > 32) {
                                        if (!this.field3608.method15745()) {
                                            Class5079.method15830(this.field3608, class7437.field28692.field28698);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (Class5079.method15844(this.field3608, class7437) && class7437.field28684) {
                boolean b = false;
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class8726.method30011();
                Class5046.method15419("minecraft:textures/gui/widgets.png");
                Class8726.method30059();
                Class8726.method30013(Class2050.field11693, Class2135.field12460);
                String s = Class5046.method15438("mco.selectServer.expiredList");
                String s2 = Class5046.method15438("mco.selectServer.expiredRenew");
                if (class7437.field28685) {
                    s = Class5046.method15438("mco.selectServer.expiredTrial");
                    s2 = Class5046.method15438("mco.selectServer.expiredSubscribe");
                }
                final int n5 = this.field3608.method15424(s2) + 17;
                final int n6 = n + this.field3608.method15424(s) + 8;
                final int n7 = n2 + 13;
                if (n3 >= n6) {
                    if (n3 < n6 + n5) {
                        if (n4 > n7) {
                            if (n4 <= n7 + 16 & n4 < this.field3608.method15422() - 40) {
                                if (n4 > 32) {
                                    if (!this.field3608.method15745()) {
                                        b = true;
                                        Class5079.method15850(this.field3608, true);
                                    }
                                }
                            }
                        }
                    }
                }
                final int n8 = (!b) ? 1 : 2;
                Class5046.method15411(n6, n7, 0.0f, (float)(46 + n8 * 20), n5 / 2, 8, 256, 256);
                Class5046.method15411(n6 + n5 / 2, n7, (float)(200 - n5 / 2), (float)(46 + n8 * 20), n5 / 2, 8, 256, 256);
                Class5046.method15411(n6, n7 + 8, 0.0f, (float)(46 + n8 * 20 + 12), n5 / 2, 8, 256, 256);
                Class5046.method15411(n6 + n5 / 2, n7 + 8, (float)(200 - n5 / 2), (float)(46 + n8 * 20 + 12), n5 / 2, 8, 256, 256);
                Class8726.method30060();
                Class8726.method30012();
                final int n9 = n2 + 11 + 5;
                final int n10 = (!b) ? 16777215 : 16777120;
                this.field3608.method15407(s, n + 2, n9 + 1, 15553363);
                this.field3608.method15405(s2, n6 + n5 / 2, n9 + 1, n10);
            }
            else {
                if (!class7437.field28687.equals(Class271.field1472)) {
                    this.field3608.method15407(class7437.method22871(), n + 2, n2 + 12, 8421504);
                }
                else {
                    final String string2 = Class5046.method15438("mco.selectServer.minigame") + " ";
                    final int method15424 = this.field3608.method15424(string2);
                    this.field3608.method15407(string2, n + 2, n2 + 12, 13413468);
                    this.field3608.method15407(class7437.method22873(), n + 2 + method15424, n2 + 12, 8421504);
                }
                if (!Class5079.method15844(this.field3608, class7437)) {
                    this.field3608.method15407(class7437.field28680, n + 2, n2 + 12 + 11, 8421504);
                }
            }
            this.field3608.method15407(class7437.method22872(), n + 2, n2 + 1, 16777215);
            Class8952.method31759(class7437.field28681, () -> {
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class5046.method15410(n12 - 36, n13, 8.0f, 8.0f, 8, 8, 32, 32, 64, 64);
                Class5046.method15410(n12 - 36, n13, 40.0f, 8.0f, 8, 8, 32, 32, 64, 64);
            });
        }
        else {
            Class5046.method15419("realms:textures/gui/realms/world_icon.png");
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method29999();
            Class8726.method30059();
            Class5046.method15411(n + 10, n2 + 6, 0.0f, 0.0f, 40, 20, 40, 20);
            Class8726.method30060();
            final float n11 = 0.5f + (1.0f + Class8269.method27459(Class5079.method15841(this.field3608) * 0.25f)) * 0.25f;
            this.field3608.method15405(Class5046.method15438("mco.selectServer.uninitialized"), n + 10 + 40 + 75, n2 + 12, 0xFF000000 | (int)(127.0f * n11) << 16 | (int)(255.0f * n11) << 8 | (int)(127.0f * n11));
        }
    }
}