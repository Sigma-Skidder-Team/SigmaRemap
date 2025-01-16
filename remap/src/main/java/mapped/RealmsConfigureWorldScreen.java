// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class RealmsConfigureWorldScreen extends Class5075<Class7430> implements Class5077
{
    private static final Logger field21783;
    private String field21784;
    private final RealmsMainScreen field21785;
    private RealmsServer field21786;
    private final long field21787;
    private int field21788;
    private int field21789;
    private final int field21790 = 80;
    private final int field21791 = 5;
    private Class5611 field21792;
    private Class5611 field21793;
    private Class5611 field21794;
    private Class5611 field21795;
    private Class5611 field21796;
    private Class5611 field21797;
    private Class5611 field21798;
    private boolean field21799;
    private int field21800;
    private int field21801;
    
    public RealmsConfigureWorldScreen(final RealmsMainScreen field21785, final long field21786) {
        this.field21785 = field21785;
        this.field21787 = field21786;
    }
    
    @Override
    public void init() {
        if (this.field21786 == null) {
            this.method15683(this.field21787);
        }
        this.field21788 = this.width() / 2 - 187;
        this.field21789 = this.width() / 2 + 190;
        this.method15444(true);
        this.buttonsAdd(this.field21792 = new Class5689(this, 2, this.method15680(0, 3), Class7869.method25488(0), 100, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.players")));
        this.buttonsAdd(this.field21793 = new Class5669(this, 3, this.method15680(1, 3), Class7869.method25488(0), 100, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.settings")));
        this.buttonsAdd(this.field21794 = new Class5702(this, 4, this.method15680(2, 3), Class7869.method25488(0), 100, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.subscription")));
        for (int i = 1; i < 5; ++i) {
            this.method15678(i);
        }
        this.buttonsAdd(this.field21798 = new Class5621(this, 8, this.method15679(0), Class7869.method25488(13) - 5, 100, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.switchminigame")));
        this.buttonsAdd(this.field21795 = new Class5682(this, 5, this.method15679(0), Class7869.method25488(13) - 5, 90, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.options")));
        this.buttonsAdd(this.field21796 = new Class5694(this, 6, this.method15679(1), Class7869.method25488(13) - 5, 90, 20, RealmsScreen.getLocalizedString("mco.configure.world.backup")));
        this.buttonsAdd(this.field21797 = new Class5661(this, 7, this.method15679(2), Class7869.method25488(13) - 5, 90, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.resetworld")));
        this.buttonsAdd(new Class5663(this, 0, this.field21789 - 80 + 8, Class7869.method25488(13) - 5, 70, 20, RealmsScreen.getLocalizedString("gui.back")));
        this.field21796.method16917(true);
        if (this.field21786 != null) {
            this.method15684();
            if (!this.method15696()) {
                this.method15701();
            }
            else {
                this.method15697();
            }
        }
        else {
            this.method15701();
            this.method15697();
            this.field21792.method16917(false);
            this.field21793.method16917(false);
            this.field21794.method16917(false);
        }
    }
    
    private void method15678(final int n) {
        this.getProxy().method3201(new Class5700(this.method15681(n), Class7869.method25488(5) + 5, 80, 80, () -> this.field21786, field21784 -> this.field21784 = field21784, 100 + n, n, this));
    }
    
    private int method15679(final int n) {
        return this.field21788 + n * 95;
    }
    
    private int method15680(final int n, final int n2) {
        return this.width() / 2 - (n2 * 105 - 5) / 2 + n * 105;
    }
    
    @Override
    public void tick() {
        this.method15420();
        ++this.field21800;
        --this.field21801;
        if (this.field21801 < 0) {
            this.field21801 = 0;
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.field21784 = null;
        this.method15413();
        this.drawCenteredString(RealmsScreen.getLocalizedString("mco.configure.worlds.title"), this.width() / 2, Class7869.method25488(4), 16777215);
        super.render(n, n2, n3);
        if (this.field21786 != null) {
            final String method22872 = this.field21786.method22872();
            final int method22873 = this.method15424(method22872);
            final int n4 = (this.field21786.state != RealmsServer.Status.CLOSED) ? 8388479 : 10526880;
            final int method22874 = this.method15424(RealmsScreen.getLocalizedString("mco.configure.world.title"));
            this.drawCenteredString(RealmsScreen.getLocalizedString("mco.configure.world.title"), this.width() / 2, 12, 16777215);
            this.drawCenteredString(method22872, this.width() / 2, 24, n4);
            this.method15691(Math.min(this.method15680(2, 3) + 80 - 11, this.width() / 2 + method22873 / 2 + method22874 / 2 + 10), 7, n, n2);
            if (this.method15696()) {
                this.method15407(RealmsScreen.getLocalizedString("mco.configure.current.minigame") + ": " + this.field21786.method22873(), this.field21788 + 80 + 20 + 10, Class7869.method25488(13), 16777215);
            }
            if (this.field21784 != null) {
                this.method15690(this.field21784, n, n2);
            }
        }
        else {
            this.drawCenteredString(RealmsScreen.getLocalizedString("mco.configure.world.title"), this.width() / 2, 17, 16777215);
        }
    }
    
    private int method15681(final int n) {
        return this.field21788 + (n - 1) * 98;
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
        this.method15682();
        return true;
    }
    
    private void method15682() {
        if (this.field21799) {
            this.field21785.method15772();
        }
        Realms.setScreen(this.field21785);
    }
    
    private void method15683(final long n) {
        new Thread(() -> {
            RealmsClient.func_224911_a();
            try {
                final RealmsClient class9513;
                this.field21786 = class9513.method35449(n2);
                this.method15684();
                if (this.method15696()) {
                    this.method15702();
                }
                else {
                    this.method15699();
                }
            }
            catch (final RealmsServiceException class9514) {
                RealmsConfigureWorldScreen.field21783.error("Couldn't get own world");
                Realms.setScreen(new RealmsGenericErrorScreen(class9514.getMessage(), this.field21785));
            }
            catch (final IOException ex) {
                RealmsConfigureWorldScreen.field21783.error("Couldn't parse response getting own world");
            }
        }).start();
    }
    
    private void method15684() {
        this.field21792.method16917(!this.field21786.field28684);
        this.field21793.method16917(!this.field21786.field28684);
        this.field21794.method16917(true);
        this.field21798.method16917(!this.field21786.field28684);
        this.field21795.method16917(!this.field21786.field28684);
        this.field21797.method16917(!this.field21786.field28684);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return super.mouseClicked(n, n2, n3);
    }
    
    private void method15685(final RealmsServer class7437) {
        if (this.field21786.state != RealmsServer.Status.OPEN) {
            this.method15705(true, new RealmsConfigureWorldScreen(this.field21785.method15796(), this.field21787));
        }
        else {
            this.field21785.func_223911_a(class7437, new RealmsConfigureWorldScreen(this.field21785.method15796(), this.field21787));
        }
    }
    
    @Override
    public void method15686(final int n, final Class2210 obj, final boolean b, final boolean b2) {
        switch (Class6500.field25871[obj.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                this.method15685(this.field21786);
                break;
            }
            case 3: {
                if (b) {
                    this.method15687();
                    break;
                }
                if (b2) {
                    this.method15689(n, this.field21786);
                    break;
                }
                this.method15688(n, this.field21786);
                break;
            }
            default: {
                throw new IllegalStateException("Unknown action " + obj);
            }
        }
    }
    
    private void method15687() {
        final Class5045 class5045 = new Class5045(this, Class271.field1472);
        class5045.method15366(RealmsScreen.getLocalizedString("mco.template.title.minigame"));
        class5045.method15367(RealmsScreen.getLocalizedString("mco.minigame.world.info.line1") + "\\n" + RealmsScreen.getLocalizedString("mco.minigame.world.info.line2"));
        Realms.setScreen(class5045);
    }
    
    private void method15688(final int n, final RealmsServer class7437) {
        Realms.setScreen(new Class5084((b, n2) -> {
            if (!b) {
                Realms.setScreen(this);
            }
            else {
                this.method15709(class7437.id, n);
            }
        }, Class2039.field11628, RealmsScreen.getLocalizedString("mco.configure.world.slot.switch.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.slot.switch.question.line2"), true, 9));
    }
    
    private void method15689(final int n, final RealmsServer class7437) {
        Realms.setScreen(new Class5084((b, n2) -> {
            if (!b) {
                Realms.setScreen(this);
            }
            else {
                final Class5078 class7438 = new Class5078(this, class7437, this.func_224407_b(), RealmsScreen.getLocalizedString("mco.configure.world.switch.slot"), RealmsScreen.getLocalizedString("mco.configure.world.switch.slot.subtitle"), 10526880, RealmsScreen.getLocalizedString("gui.cancel"));
                class7438.method15722(n);
                class7438.method15723(RealmsScreen.getLocalizedString("mco.create.world.reset.title"));
                Realms.setScreen(class7438);
            }
        }, Class2039.field11628, RealmsScreen.getLocalizedString("mco.configure.world.slot.switch.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.slot.switch.question.line2"), true, 10));
    }
    
    public void method15690(final String s, final int n, final int n2) {
        if (s != null) {
            int n3 = n + 12;
            final int n4 = n2 - 12;
            final int method15424 = this.method15424(s);
            if (n3 + method15424 + 3 > this.field21789) {
                n3 = n3 - method15424 - 20;
            }
            this.method15412(n3 - 3, n4 - 3, n3 + method15424 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.method15425(s, n3, n4, 16777215);
        }
    }
    
    private void method15691(final int n, final int n2, final int n3, final int n4) {
        if (!this.field21786.field28684) {
            if (this.field21786.state != RealmsServer.Status.CLOSED) {
                if (this.field21786.state == RealmsServer.Status.OPEN) {
                    if (this.field21786.field28686 >= 7) {
                        this.method15694(n, n2, n3, n4);
                    }
                    else {
                        this.method15693(n, n2, n3, n4, this.field21786.field28686);
                    }
                }
            }
            else {
                this.method15695(n, n2, n3, n4);
            }
        }
        else {
            this.method15692(n, n2, n3, n4);
        }
    }
    
    private void method15692(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/expired_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        RenderSystem.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        this.field21784 = RealmsScreen.getLocalizedString("mco.selectServer.expired");
                    }
                }
            }
        }
    }
    
    private void method15693(final int n, final int n2, final int n3, final int n4, final int i) {
        RealmsScreen.method15419("realms:textures/gui/realms/expires_soon_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30059();
        if (this.field21800 % 20 >= 10) {
            RealmsScreen.method15411(n, n2, 10.0f, 0.0f, 10, 28, 20, 28);
        }
        else {
            RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 20, 28);
        }
        RenderSystem.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        if (i > 0) {
                            if (i != 1) {
                                this.field21784 = RealmsScreen.method15439("mco.selectServer.expires.days", i);
                            }
                            else {
                                this.field21784 = RealmsScreen.getLocalizedString("mco.selectServer.expires.day");
                            }
                        }
                        else {
                            this.field21784 = RealmsScreen.getLocalizedString("mco.selectServer.expires.soon");
                        }
                    }
                }
            }
        }
    }
    
    private void method15694(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/on_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        RenderSystem.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        this.field21784 = RealmsScreen.getLocalizedString("mco.selectServer.open");
                    }
                }
            }
        }
    }
    
    private void method15695(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/off_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        RenderSystem.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        this.field21784 = RealmsScreen.getLocalizedString("mco.selectServer.closed");
                    }
                }
            }
        }
    }
    
    private boolean method15696() {
        return this.field21786 != null && this.field21786.field28687.equals(Class271.field1472);
    }
    
    private void method15697() {
        this.method15698(this.field21795);
        this.method15698(this.field21796);
        this.method15698(this.field21797);
    }
    
    private void method15698(final Class5611 class5611) {
        class5611.method16919(false);
        this.method15443(class5611);
    }
    
    private void method15699() {
        this.method15700(this.field21795);
        this.method15700(this.field21796);
        this.method15700(this.field21797);
    }
    
    private void method15700(final Class5611 class5611) {
        class5611.method16919(true);
        this.buttonsAdd(class5611);
    }
    
    private void method15701() {
        this.method15698(this.field21798);
    }
    
    private void method15702() {
        this.method15700(this.field21798);
    }
    
    public void method15703(final Class7424 class7424) {
        final Class7424 class7425 = this.field21786.field28683.get(this.field21786.field28688);
        class7424.field28608 = class7425.field28608;
        class7424.field28609 = class7425.field28609;
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            method35444.method35461(this.field21786.id, this.field21786.field28688, class7424);
            this.field21786.field28683.put(this.field21786.field28688, class7424);
        }
        catch (final RealmsServiceException class7426) {
            RealmsConfigureWorldScreen.field21783.error("Couldn't save slot settings");
            Realms.setScreen(new RealmsGenericErrorScreen(class7426, this));
            return;
        }
        catch (final UnsupportedEncodingException ex) {
            RealmsConfigureWorldScreen.field21783.error("Couldn't save slot settings");
        }
        Realms.setScreen(this);
    }
    
    public void method15704(final String s, final String s2) {
        final String s3 = (s2 != null && !s2.trim().isEmpty()) ? s2 : null;
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            method35444.method35460(this.field21786.id, s, s3);
            this.field21786.method22874(s);
            this.field21786.method22875(s3);
        }
        catch (final RealmsServiceException class2330) {
            RealmsConfigureWorldScreen.field21783.error("Couldn't save settings");
            Realms.setScreen(new RealmsGenericErrorScreen(class2330, this));
            return;
        }
        catch (final UnsupportedEncodingException ex) {
            RealmsConfigureWorldScreen.field21783.error("Couldn't save settings");
        }
        Realms.setScreen(this);
    }
    
    public void method15705(final boolean b, final RealmsScreen class5046) {
        final Class5049 class5047 = new Class5049(class5046, new RealmsTasks.Class1342(this.field21786, this, this.field21785, b));
        class5047.method15466();
        Realms.setScreen(class5047);
    }
    
    public void method15706(final RealmsScreen class5046) {
        final Class5049 class5047 = new Class5049(class5046, new RealmsTasks.CloseServerTask(this.field21786, this));
        class5047.method15466();
        Realms.setScreen(class5047);
    }
    
    public void func_224398_a() {
        this.field21799 = true;
    }
    
    public void method15708(final Class7430 class7430) {
        if (class7430 != null) {
            if (Class2197.field13370.equals(class7430.field28657)) {
                this.method15710(class7430);
            }
        }
    }
    
    private void method15709(final long n, final int n2) {
        final Class5049 class5049 = new Class5049(this.field21785, new RealmsTasks.SwitchSlotTask(n, n2, (b, n) -> Realms.setScreen(class5076), 11));
        class5049.method15466();
        Realms.setScreen(class5049);
    }
    
    private void method15710(final Class7430 class7430) {
        final Class5049 class7431 = new Class5049(this.field21785, new RealmsTasks.SwitchMinigameTask(this.field21786.id, class7430, this.func_224407_b()));
        class7431.method15466();
        Realms.setScreen(class7431);
    }
    
    public RealmsConfigureWorldScreen func_224407_b() {
        return new RealmsConfigureWorldScreen(this.field21785, this.field21787);
    }
    
    static {
        field21783 = LogManager.getLogger();
    }
}
