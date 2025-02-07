// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.List;

public class Class5072 extends RealmsScreen
{
    private static final Class9057 field21764;
    private volatile int field21765;
    private static boolean field21766;
    private static boolean field21767;
    private static boolean field21768;
    private static boolean field21769;
    private static final List<Class2099> field21770;
    
    public Class5072(final RealmsScreen class5046) {
    }
    
    @Override
    public void init() {
        this.method15651();
        this.method15444(true);
    }
    
    @Override
    public void tick() {
        Label_0015: {
            if (Realms.method25372()) {
                if (Realms.method25373()) {
                    if (Class5072.field21768) {
                        break Label_0015;
                    }
                }
            }
            if (!Class5072.field21764.method32588()) {
                Class5072.field21764.method32600();
                return;
            }
        }
        if (Class5072.field21768) {
            if (Realms.method25372()) {
                Class5072.field21764.method32590(Class5072.field21770);
                if (Class5072.field21764.method32591(Class2099.field12164)) {
                    this.field21765 = Class5072.field21764.method32595();
                }
                if (Class5072.field21764.method32591(Class2099.field12165)) {
                    Class5072.field21767 = Class5072.field21764.method32596();
                }
                if (Class5072.field21764.method32591(Class2099.field12167)) {
                    Class5072.field21769 = Class5072.field21764.method32598();
                }
                Class5072.field21764.method32592();
            }
        }
    }
    
    private void method15651() {
        if (!Class5072.field21766) {
            Class5072.field21766 = true;
            new Class924(this, "Realms Notification Availability checker #1").start();
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (Class5072.field21768) {
            this.method15652(n, n2);
        }
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return super.mouseClicked(n, n2, n3);
    }
    
    private void method15652(final int n, final int n2) {
        final int field21765 = this.field21765;
        final int n3 = this.height() / 4 + 48;
        final int n4 = this.width() / 2 + 80;
        final int n5 = n3 + 48 + 2;
        int n6 = 0;
        if (Class5072.field21769) {
            RealmsScreen.method15419("realms:textures/gui/realms/news_notification_mainscreen.png");
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.pushMatrix();
            RenderSystem.method30063(0.4f, 0.4f, 0.4f);
            RealmsScreen.method15411((int)((n4 + 2 - n6) * 2.5), (int)(n5 * 2.5), 0.0f, 0.0f, 40, 40, 40, 40);
            RenderSystem.popMatrix();
            n6 += 14;
        }
        if (field21765 != 0) {
            RealmsScreen.method15419("realms:textures/gui/realms/invite_icon.png");
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.pushMatrix();
            RealmsScreen.method15411(n4 - n6, n5 - 6, 0.0f, 0.0f, 15, 25, 31, 25);
            RenderSystem.popMatrix();
            n6 += 16;
        }
        if (Class5072.field21767) {
            RealmsScreen.method15419("realms:textures/gui/realms/trial_icon.png");
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.pushMatrix();
            int n7 = 0;
            if ((System.currentTimeMillis() / 800L & 0x1L) == 0x1L) {
                n7 = 8;
            }
            RealmsScreen.method15411(n4 + 4 - n6, n5 + 4, 0.0f, (float)n7, 8, 8, 8, 16);
            RenderSystem.popMatrix();
        }
    }
    
    @Override
    public void method15442() {
        Class5072.field21764.method32600();
    }
    
    static {
        field21764 = new Class9057();
        field21770 = Arrays.asList(Class2099.field12164, Class2099.field12165, Class2099.field12167);
    }
}
