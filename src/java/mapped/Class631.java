// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.DateFormat;
import java.util.Date;

public class Class631 extends Class624
{
    public final Class7426 field3616;
    public final /* synthetic */ Class5071 field3617;
    
    public Class631(final Class5071 field3617, final Class7426 field3618) {
        this.field3617 = field3617;
        this.field3616 = field3618;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3635(this.field3616, n3 - 40, n2, n6, n7);
    }
    
    private void method3635(final Class7426 class7426, final int n, final int n2, final int n3, final int n4) {
        this.field3617.method15407("Backup (" + Class8428.method28149(System.currentTimeMillis() - class7426.field28629.getTime()) + ")", n + 40, n2 + 1, class7426.method22848() ? -8388737 : 16777215);
        this.field3617.method15407(this.method3636(class7426.field28629), n + 40, n2 + 12, 8421504);
        final int n5 = this.field3617.method15421() - 175;
        final int n6 = n5 - 10;
        if (!Class5071.method15636(this.field3617).field28684) {
            this.method3637(n5, n2 - 3, n3, n4);
        }
        if (!class7426.field28633.isEmpty()) {
            this.method3638(n6, n2 + 0, n3, n4);
        }
    }
    
    private String method3636(final Date date) {
        return DateFormat.getDateTimeInstance(3, 3).format(date);
    }
    
    private void method3637(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 12) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 14) {
                            if (n4 < this.field3617.method15422() - 15) {
                                if (n4 > 32) {
                                    b = true;
                                    break Label_0076;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        Class5046.method15419("realms:textures/gui/realms/restore_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class8726.method30063(0.5f, 0.5f, 0.5f);
        Class5046.method15411(n * 2, n2 * 2, 0.0f, b2 ? 28.0f : 0.0f, 23, 28, 23, 56);
        Class8726.method30060();
        if (b2) {
            Class5071.method15650(this.field3617, Class5046.method15438("mco.backup.button.restore"));
        }
    }
    
    private void method3638(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 8) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 8) {
                            if (n4 < this.field3617.method15422() - 15) {
                                if (n4 > 32) {
                                    b = true;
                                    break Label_0076;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        Class5046.method15419("realms:textures/gui/realms/plus_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class8726.method30063(0.5f, 0.5f, 0.5f);
        Class5046.method15411(n * 2, n2 * 2, 0.0f, b2 ? 15.0f : 0.0f, 15, 15, 15, 30);
        Class8726.method30060();
        if (b2) {
            Class5071.method15650(this.field3617, Class5046.method15438("mco.backup.changes.tooltip"));
        }
    }
}
