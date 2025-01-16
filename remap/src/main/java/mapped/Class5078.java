// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5078 extends Class5075<Class7430>
{
    private static final Logger field21802;
    private final RealmsScreen field21803;
    private final RealmsServer field21804;
    private final RealmsScreen field21805;
    private Class5066 field21806;
    private Class5066 field21807;
    private String field21808;
    private String field21809;
    private String field21810;
    private int field21811;
    private final int field21812 = 0;
    private final int field21813 = 100;
    private WorldTemplatePaginatedList field21814;
    private WorldTemplatePaginatedList field21815;
    private WorldTemplatePaginatedList field21816;
    private WorldTemplatePaginatedList field21817;
    public int field21818;
    private Class236 field21819;
    private Class8999 field21820;
    private Class7430 field21821;
    private String field21822;
    private int field21823;
    
    public Class5078(final RealmsScreen field21803, final RealmsServer field21804, final RealmsScreen field21805) {
        this.field21808 = RealmsScreen.getLocalizedString("mco.reset.world.title");
        this.field21809 = RealmsScreen.getLocalizedString("mco.reset.world.warning");
        this.field21810 = RealmsScreen.getLocalizedString("gui.cancel");
        this.field21811 = 16711680;
        this.field21818 = -1;
        this.field21819 = Class236.field903;
        this.field21823 = -1;
        this.field21803 = field21803;
        this.field21804 = field21804;
        this.field21805 = field21805;
    }
    
    public Class5078(final RealmsScreen class5046, final RealmsServer class5047, final RealmsScreen class5048, final String field21808, final String field21809, final int field21810, final String field21811) {
        this(class5046, class5047, class5048);
        this.field21808 = field21808;
        this.field21809 = field21809;
        this.field21811 = field21810;
        this.field21810 = field21811;
    }
    
    public void method15721(final int field21823) {
        this.field21823 = field21823;
    }
    
    public void method15722(final int field21818) {
        this.field21818 = field21818;
    }
    
    public void method15723(final String field21822) {
        this.field21822 = field21822;
    }
    
    @Override
    public void init() {
        this.buttonsAdd(new Class5696(this, 0, this.width() / 2 - 40, Class7869.method25488(14) - 10, 80, 20, this.field21810));
        new Class909(this, "Realms-reset-world-fetcher").start();
        this.method15428(this.field21806 = new Class5066(this.field21808, this.width() / 2, 7, 16777215));
        this.method15428(this.field21807 = new Class5066(this.field21809, this.width() / 2, 22, this.field21811));
        this.buttonsAdd(new Class5633(this, this.method15724(1), Class7869.method25488(0) + 10, RealmsScreen.getLocalizedString("mco.reset.world.generate"), -1L, "realms:textures/gui/realms/new_world.png", Class236.field904));
        this.buttonsAdd(new Class5634(this, this.method15724(2), Class7869.method25488(0) + 10, RealmsScreen.getLocalizedString("mco.reset.world.upload"), -1L, "realms:textures/gui/realms/upload.png", Class236.field905));
        this.buttonsAdd(new Class5635(this, this.method15724(3), Class7869.method25488(0) + 10, RealmsScreen.getLocalizedString("mco.reset.world.template"), -1L, "realms:textures/gui/realms/survival_spawn.png", Class236.field907));
        this.buttonsAdd(new Class5636(this, this.method15724(1), Class7869.method25488(6) + 20, RealmsScreen.getLocalizedString("mco.reset.world.adventure"), -1L, "realms:textures/gui/realms/adventure.png", Class236.field906));
        this.buttonsAdd(new Class5637(this, this.method15724(2), Class7869.method25488(6) + 20, RealmsScreen.getLocalizedString("mco.reset.world.experience"), -1L, "realms:textures/gui/realms/experience.png", Class236.field908));
        this.buttonsAdd(new Class5632(this, this.method15724(3), Class7869.method25488(6) + 20, RealmsScreen.getLocalizedString("mco.reset.world.inspiration"), -1L, "realms:textures/gui/realms/inspiration.png", Class236.field909));
        this.method15446();
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21803);
        return true;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return super.mouseClicked(n, n2, n3);
    }
    
    private int method15724(final int n) {
        return this.width() / 2 - 130 + (n - 1) * 100;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.field21806.method15593(this);
        this.field21807.method15593(this);
        super.render(n, n2, n3);
    }
    
    private void method15725(final int n, final int n2, final String s, final long l, final String s2, final Class236 class236, final boolean b, final boolean b2) {
        if (l != -1L) {
            Class8952.method31758(String.valueOf(l), s2);
        }
        else {
            RealmsScreen.method15419(s2);
        }
        if (!b) {
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            RenderSystem.method30068(0.56f, 0.56f, 0.56f, 1.0f);
        }
        RealmsScreen.method15411(n + 2, n2 + 14, 0.0f, 0.0f, 56, 56, 56, 56);
        RealmsScreen.method15419("realms:textures/gui/realms/slot_frame.png");
        if (!b) {
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            RenderSystem.method30068(0.56f, 0.56f, 0.56f, 1.0f);
        }
        RealmsScreen.method15411(n, n2 + 12, 0.0f, 0.0f, 60, 60, 60, 60);
        this.drawCenteredString(s, n + 30, n2, b ? 10526880 : 16777215);
    }
    
    public void method15708(final Class7430 field21821) {
        if (field21821 != null) {
            if (this.field21818 == -1) {
                this.method15728(field21821);
            }
            else {
                switch (Class9016.field38045[field21821.field28657.ordinal()]) {
                    case 1: {
                        this.field21819 = Class236.field907;
                        break;
                    }
                    case 2: {
                        this.field21819 = Class236.field906;
                        break;
                    }
                    case 3: {
                        this.field21819 = Class236.field908;
                        break;
                    }
                    case 4: {
                        this.field21819 = Class236.field909;
                        break;
                    }
                }
                this.field21821 = field21821;
                this.method15726();
            }
        }
    }
    
    private void method15726() {
        this.method15727(this);
    }
    
    public void method15727(final RealmsScreen class5046) {
        final Class5049 class5047 = new Class5049(this.field21803, new RealmsTasks.SwitchSlotTask(this.field21804.id, this.field21818, class5046, 100));
        class5047.method15466();
        Realms.setScreen(class5047);
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
        if (n == 100 && b) {
            switch (Class9016.field38046[this.field21819.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    if (this.field21821 != null) {
                        this.method15728(this.field21821);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.field21820 != null) {
                        this.method15730(this.field21820);
                        break;
                    }
                    break;
                }
                default: {}
            }
        }
        else if (b) {
            Realms.setScreen(this.field21805);
            if (this.field21823 != -1) {
                this.field21805.confirmResult(true, this.field21823);
            }
        }
    }
    
    public void method15728(final Class7430 class7430) {
        final RealmsTasks.ResettingWorldTask class7431 = new RealmsTasks.ResettingWorldTask(this.field21804.id, this.field21805, class7430);
        if (this.field21822 != null) {
            class7431.func_225012_c(this.field21822);
        }
        if (this.field21823 != -1) {
            class7431.func_225011_a(this.field21823);
        }
        final Class5049 class7432 = new Class5049(this.field21803, class7431);
        class7432.method15466();
        Realms.setScreen(class7432);
    }
    
    public void method15729(final Class8999 field21820) {
        if (this.field21818 != -1) {
            this.field21819 = Class236.field904;
            this.field21820 = field21820;
            this.method15726();
        }
        else {
            this.method15730(field21820);
        }
    }
    
    private void method15730(final Class8999 class8999) {
        final RealmsTasks.ResettingWorldTask class9000 = new RealmsTasks.ResettingWorldTask(this.field21804.id, this.field21805, class8999.field37979, class8999.field37980, class8999.field37981);
        if (this.field21822 != null) {
            class9000.func_225012_c(this.field21822);
        }
        if (this.field21823 != -1) {
            class9000.func_225011_a(this.field21823);
        }
        final Class5049 class9001 = new Class5049(this.field21803, class9000);
        class9001.method15466();
        Realms.setScreen(class9001);
    }
    
    static {
        field21802 = LogManager.getLogger();
    }
}
