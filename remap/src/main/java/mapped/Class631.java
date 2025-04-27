// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.DateFormat;
import java.util.Date;

public class Class631 extends Class624
{
    public final Backup field3616;
    public final /* synthetic */ Class5071 field3617;
    
    public Class631(final Class5071 field3617, final Backup field3618) {
        this.field3617 = field3617;
        this.field3616 = field3618;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3635(this.field3616, n3 - 40, n2, n6, n7);
    }
    
    private void method3635(final Backup class7426, final int n, final int n2, final int n3, final int n4) {
        this.field3617.method15407("Backup (" + Class8428.method28149(System.currentTimeMillis() - class7426.lastModifiedDate.getTime()) + ")", n + 40, n2 + 1, class7426.method22848() ? -8388737 : 16777215);
        this.field3617.method15407(this.method3636(class7426.lastModifiedDate), n + 40, n2 + 12, 8421504);
        final int n5 = this.field3617.width() - 175;
        final int n6 = n5 - 10;
        if (!Class5071.method15636(this.field3617).field28684) {
            this.method3637(n5, n2 - 3, n3, n4);
        }
        if (!class7426.changeList.isEmpty()) {
            this.method3638(n6, n2, n3, n4);
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
                            if (n4 < this.field3617.height() - 15) {
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
        RealmsScreen.method15419("realms:textures/gui/realms/restore_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.pushMatrix();
        RenderSystem.method30063(0.5f, 0.5f, 0.5f);
        RealmsScreen.method15411(n * 2, n2 * 2, 0.0f, b2 ? 28.0f : 0.0f, 23, 28, 23, 56);
        RenderSystem.popMatrix();
        if (b2) {
            Class5071.method15650(this.field3617, RealmsScreen.getLocalizedString("mco.backup.button.restore"));
        }
    }
    
    private void method3638(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        Label_0076: {
            if (n3 >= n) {
                if (n3 <= n + 8) {
                    if (n4 >= n2) {
                        if (n4 <= n2 + 8) {
                            if (n4 < this.field3617.height() - 15) {
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
        RealmsScreen.method15419("realms:textures/gui/realms/plus_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.pushMatrix();
        RenderSystem.method30063(0.5f, 0.5f, 0.5f);
        RealmsScreen.method15411(n * 2, n2 * 2, 0.0f, b2 ? 15.0f : 0.0f, 15, 15, 15, 30);
        RenderSystem.popMatrix();
        if (b2) {
            Class5071.method15650(this.field3617, RealmsScreen.getLocalizedString("mco.backup.changes.tooltip"));
        }
    }
}
