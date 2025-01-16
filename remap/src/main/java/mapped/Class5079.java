// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;
import com.google.common.util.concurrent.RateLimiter;
import org.apache.logging.log4j.Logger;

public class Class5079 extends RealmsScreen
{
    private static final Logger field21824;
    private static boolean field21825;
    private final RateLimiter field21826;
    private boolean field21827;
    private static List<ResourceLocation> field21828;
    private static final Class9057 field21829;
    private static int field21830;
    private final RealmsScreen field21831;
    private volatile Class5061 field21832;
    private long field21833;
    private Class5611 field21834;
    private Class5611 field21835;
    private Class5611 field21836;
    private Class5611 field21837;
    private Class5611 field21838;
    private String field21839;
    private List<Class7437> field21840;
    private volatile int field21841;
    private int field21842;
    private static volatile boolean field21843;
    private static volatile boolean field21844;
    private static volatile boolean field21845;
    private boolean field21846;
    private boolean field21847;
    private boolean field21848;
    private volatile boolean field21849;
    private volatile boolean field21850;
    private volatile boolean field21851;
    private volatile boolean field21852;
    private volatile String field21853;
    private int field21854;
    private int field21855;
    private boolean field21856;
    private static RealmsScreen field21857;
    private static boolean field21858;
    private List<Class7836> field21859;
    private int field21860;
    private ReentrantLock field21861;
    private boolean field21862;
    private Class5680 field21863;
    private Class5665 field21864;
    private Class5678 field21865;
    private Class5611 field21866;
    private Class5611 field21867;
    private Class5611 field21868;
    
    public Class5079(final RealmsScreen field21831) {
        this.field21833 = -1L;
        this.field21840 = Lists.newArrayList();
        this.field21861 = new ReentrantLock();
        this.field21831 = field21831;
        this.field21826 = RateLimiter.create(0.01666666753590107);
    }
    
    public boolean method15744() {
        if (!this.method15746() || !this.field21846) {
            return false;
        }
        if (this.field21849 && !this.field21850) {
            return true;
        }
        final Iterator<Class7437> iterator = this.field21840.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().field28681.equals(Realms.method25357())) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public boolean method15745() {
        if (!this.method15746() || !this.field21846) {
            return false;
        }
        if (!this.field21847) {
            if (this.field21849) {
                if (!this.field21850) {
                    if (this.field21840.isEmpty()) {
                        return true;
                    }
                }
            }
            return this.field21840.isEmpty();
        }
        return true;
    }
    
    @Override
    public void init() {
        System.out.println("INIT");
        this.field21859 = Lists.newArrayList((Object[])new Class7836[] { new Class7836(new char[] { '3', '2', '1', '4', '5', '6' }, () -> Class5079.field21825 = !Class5079.field21825), new Class7836(new char[] { '9', '8', '7', '1', '2', '3' }, () -> {
                if (!RealmsClient.field40930.equals(Class2223.field13686)) {
                    this.method15764();
                }
                else {
                    this.method15766();
                }
                return;
            }), new Class7836(new char[] { '9', '8', '7', '4', '5', '6' }, () -> {
                if (!RealmsClient.field40930.equals(Class2223.field13687)) {
                    this.method15765();
                }
                else {
                    this.method15766();
                }
                return;
            }) });
        Class5079.field21857 = null;
        if (Class5079.field21857 == null) {
            this.field21861 = new ReentrantLock();
            if (Class5079.field21845) {
                if (this.method15746()) {}
            }
            System.out.println("INIT2");
            this.method15761();
            this.method15762();
            if (!this.field21827) {
                Realms.method25369(false);
            }
            this.method15444(true);
            if (this.method15746()) {
                Class5079.field21829.method32593();
            }
            this.field21851 = false;
            this.method15754();
        }
        else {
            Realms.setScreen(Class5079.field21857);
        }
    }
    
    private boolean method15746() {
        return Class5079.field21844 && Class5079.field21843;
    }
    
    public void method15747() {
        this.buttonsAdd(this.field21837 = new Class5623(this, 1, this.width() / 2 - 190, this.height() - 32, 90, 20, RealmsScreen.getLocalizedString("mco.selectServer.configure")));
        this.buttonsAdd(this.field21834 = new Class5681(this, 3, this.width() / 2 - 93, this.height() - 32, 90, 20, RealmsScreen.getLocalizedString("mco.selectServer.play")));
        this.buttonsAdd(this.field21835 = new Class5659(this, 2, this.width() / 2 + 4, this.height() - 32, 90, 20, RealmsScreen.getLocalizedString("gui.back")));
        this.buttonsAdd(this.field21836 = new Class5671(this, 0, this.width() / 2 + 100, this.height() - 32, 90, 20, RealmsScreen.getLocalizedString("mco.selectServer.expiredRenew")));
        this.buttonsAdd(this.field21838 = new Class5617(this, 7, this.width() / 2 - 202, this.height() - 32, 90, 20, RealmsScreen.getLocalizedString("mco.selectServer.leave")));
        this.buttonsAdd(this.field21864 = new Class5665(this));
        this.buttonsAdd(this.field21865 = new Class5678(this));
        this.buttonsAdd(this.field21863 = new Class5680(this));
        this.buttonsAdd(this.field21868 = new Class5690(this));
        this.buttonsAdd(this.field21866 = new Class5649(this, 6, this.width() / 2 + 52, this.method15778() + 137 - 20, 98, 20, RealmsScreen.getLocalizedString("mco.selectServer.trial")));
        this.buttonsAdd(this.field21867 = new Class5640(this, 5, this.width() / 2 + 52, this.method15778() + 160 - 20, 98, 20, RealmsScreen.getLocalizedString("mco.selectServer.buy")));
        this.method15748(this.method15771(this.field21833));
    }
    
    private void method15748(final Class7437 class7437) {
        this.field21834.method16917(this.method15750(class7437) && !this.method15745());
        this.field21836.method16919(this.method15751(class7437));
        this.field21837.method16919(this.method15752(class7437));
        this.field21838.method16919(this.method15753(class7437));
        boolean b = false;
        Label_0103: {
            if (this.method15745()) {
                if (this.field21849) {
                    if (!this.field21850) {
                        b = true;
                        break Label_0103;
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        this.field21866.method16919(b2);
        this.field21866.method16917(b2);
        this.field21867.method16919(this.method15745());
        this.field21868.method16919(this.method15745() && this.field21847);
        this.field21836.method16917(!this.method15745());
        this.field21837.method16917(!this.method15745());
        this.field21838.method16917(!this.method15745());
        this.field21865.method16917(true);
        this.field21864.method16917(true);
        this.field21835.method16917(true);
        this.field21863.method16917(!this.method15745());
    }
    
    private boolean method15749() {
        if (!this.method15745() || this.field21847) {
            if (this.method15746()) {
                if (this.field21846) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method15750(final Class7437 class7437) {
        if (class7437 != null) {
            if (!class7437.field28684) {
                if (class7437.field28679 == Class2153.field12792) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method15751(final Class7437 class7437) {
        if (class7437 != null) {
            if (class7437.field28684) {
                if (this.method15783(class7437)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method15752(final Class7437 class7437) {
        return class7437 != null && this.method15783(class7437);
    }
    
    private boolean method15753(final Class7437 class7437) {
        return class7437 != null && !this.method15783(class7437);
    }
    
    public void method15754() {
        if (this.method15746()) {
            if (this.field21846) {
                this.method15747();
            }
        }
        this.field21832 = new Class5061(this);
        if (Class5079.field21830 != -1) {
            this.field21832.method15529(Class5079.field21830);
        }
        this.method15428(this.field21832);
        this.method15434(this.field21832);
    }
    
    @Override
    public void tick() {
        this.method15420();
        this.field21848 = false;
        ++this.field21842;
        --this.field21860;
        if (this.field21860 < 0) {
            this.field21860 = 0;
        }
        if (this.method15746()) {
            Class5079.field21829.method32589();
            if (Class5079.field21829.method32591(Class2099.field12163)) {
                final List<Class7437> method32594 = Class5079.field21829.method32594();
                this.field21832.method15513();
                final boolean b = !this.field21846;
                if (b) {
                    this.field21846 = true;
                }
                if (method32594 != null) {
                    boolean b2 = false;
                    final Iterator<Class7437> iterator = method32594.iterator();
                    while (iterator.hasNext()) {
                        if (!this.method15784(iterator.next())) {
                            continue;
                        }
                        b2 = true;
                    }
                    this.field21840 = method32594;
                    if (this.method15744()) {
                        ((Class5056<Class629>)this.field21832).method15511(new Class629(this));
                    }
                    final Iterator<Class7437> iterator2 = this.field21840.iterator();
                    while (iterator2.hasNext()) {
                        ((Class5056<Class626>)this.field21832).method15511(new Class626(this, iterator2.next()));
                    }
                    if (!Class5079.field21858) {
                        if (b2) {
                            Class5079.field21858 = true;
                            this.method15756();
                        }
                    }
                }
                if (b) {
                    this.method15747();
                }
            }
            if (Class5079.field21829.method32591(Class2099.field12164)) {
                this.field21841 = Class5079.field21829.method32595();
                if (this.field21841 > 0) {
                    if (this.field21826.tryAcquire(1)) {
                        Realms.narrateNow(RealmsScreen.method15439("mco.configure.world.invite.narration", this.field21841));
                    }
                }
            }
            if (Class5079.field21829.method32591(Class2099.field12165)) {
                if (!this.field21850) {
                    final boolean method32595 = Class5079.field21829.method32596();
                    if (method32595 != this.field21849 && this.method15745()) {
                        this.field21849 = method32595;
                        this.field21851 = false;
                    }
                    else {
                        this.field21849 = method32595;
                    }
                }
            }
            if (Class5079.field21829.method32591(Class2099.field12166)) {
                for (final Class7429 class7429 : Class5079.field21829.method32597().field28722) {
                    for (final Class7437 class7430 : this.field21840) {
                        if (class7430.field28675 != class7429.field28646) {
                            continue;
                        }
                        class7430.method22876(class7429);
                        break;
                    }
                }
            }
            if (Class5079.field21829.method32591(Class2099.field12167)) {
                this.field21852 = Class5079.field21829.method32598();
                this.field21853 = Class5079.field21829.method32599();
            }
            Class5079.field21829.method32592();
            if (this.method15745()) {
                ++this.field21855;
            }
            if (this.field21863 != null) {
                this.field21863.method16919(this.method15749());
            }
        }
    }
    
    private void method15755(final String s) {
        Realms.method25376(s);
        Class8428.method28148(s);
    }
    
    private void method15756() {
        new Thread(() -> {
            Class9240.method34070();
            RealmsClient.func_224911_a();
            final Class7443 class7443 = new Class7443();
            final List field28709;
            class7443.field28709 = field28709;
            class7443.field28710 = this.method15757();
            try {
                final RealmsClient class7444;
                class7444.method35481(class7443);
            }
            catch (final Throwable t) {
                Class5079.field21824.warn("Could not send ping result to Realms: ", t);
            }
        }).start();
    }
    
    private List<Long> method15757() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class7437 class7437 : this.field21840) {
            if (!this.method15784(class7437)) {
                continue;
            }
            arrayList.add(class7437.field28675);
        }
        return arrayList;
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
        this.method15767();
    }
    
    private void method15758() {
        final Class7437 method15771 = this.method15771(this.field21833);
        if (method15771 != null) {
            this.method15781(method15771, this);
        }
    }
    
    private void method15759() {
        final Class7437 method15771 = this.method15771(this.field21833);
        if (method15771 != null) {
            this.method15755("https://aka.ms/ExtendJavaRealms?subscriptionId=" + method15771.field28676 + "&profileId=" + Realms.method25357() + "&ref=" + (method15771.field28685 ? "expiredTrial" : "expiredRealm"));
        }
    }
    
    private void method15760() {
        if (this.field21849) {
            if (!this.field21850) {
                Class8428.method28148("https://aka.ms/startjavarealmstrial");
                Realms.setScreen(this.field21831);
            }
        }
    }
    
    private void method15761() {
        if (!Class5079.field21845) {
            Class5079.field21845 = true;
            new Class908(this, "MCO Compatability Checker #1").start();
        }
    }
    
    private void method15762() {
    }
    
    private void method15763() {
        new Class932(this, "MCO Compatability Checker #1").start();
    }
    
    private void method15764() {
        if (!RealmsClient.field40930.equals(Class2223.field13686)) {
            new Class903(this, "MCO Stage Availability Checker #1").start();
        }
    }
    
    private void method15765() {
        if (!RealmsClient.field40930.equals(Class2223.field13687)) {
            new Class902(this, "MCO Local Availability Checker #1").start();
        }
    }
    
    private void method15766() {
        RealmsClient.method35446();
        Class5079.field21829.method32593();
    }
    
    private void method15767() {
        Class5079.field21829.method32600();
    }
    
    private void method15768(final Class7437 class7437) {
        if (Realms.method25357().equals(class7437.field28681) || Class5079.field21825) {
            this.method15770();
            Minecraft.method5277().execute(() -> class7438.method5244(new RealmsConfigureWorldScreen(this, class7439.field28675).getProxy()));
        }
    }
    
    private void method15769(final Class7437 class7437) {
        if (class7437 != null) {
            if (!Realms.method25357().equals(class7437.field28681)) {
                this.method15770();
                Realms.setScreen(new Class5084(this, Class2039.field11628, RealmsScreen.getLocalizedString("mco.configure.world.leave.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.leave.question.line2"), true, 4));
            }
        }
    }
    
    private void method15770() {
        Class5079.field21830 = this.field21832.method15530();
    }
    
    private Class7437 method15771(final long n) {
        for (final Class7437 class7437 : this.field21840) {
            if (class7437.field28675 != n) {
                continue;
            }
            return class7437;
        }
        return null;
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
        if (n == 4) {
            if (b) {
                new Class927(this, "Realms-leave-server").start();
            }
            Realms.setScreen(this);
        }
    }
    
    public void method15772() {
        this.field21833 = -1L;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        switch (n) {
            case 256: {
                this.field21859.forEach(Class7836::method25315);
                this.method15773();
                return true;
            }
            default: {
                return super.keyPressed(n, n2, n3);
            }
        }
    }
    
    private void method15773() {
        if (this.method15745() && this.field21847) {
            this.field21847 = false;
        }
        else {
            Realms.setScreen(this.field21831);
        }
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        this.field21859.forEach(class7836 -> class7836.method25314(c2));
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.field21862 = false;
        this.field21839 = null;
        this.method15413();
        this.field21832.method15510(n, n2, n3);
        this.method15774(this.width() / 2 - 50, 7);
        if (RealmsClient.field40930.equals(Class2223.field13686)) {
            this.method15795();
        }
        if (RealmsClient.field40930.equals(Class2223.field13687)) {
            this.method15794();
        }
        if (!this.method15745()) {
            if (this.field21851) {
                this.method15748(null);
                if (!this.method15430(this.field21832)) {
                    this.method15428(this.field21832);
                }
                this.field21834.method16917(this.method15750(this.method15771(this.field21833)));
            }
            this.field21851 = false;
        }
        else {
            this.method15776(n, n2);
        }
        super.render(n, n2, n3);
        if (this.field21839 != null) {
            this.method15791(this.field21839, n, n2);
        }
        if (this.field21849) {
            if (!this.field21850) {
                if (this.method15745()) {
                    RealmsScreen.method15419("realms:textures/gui/realms/trial_icon.png");
                    Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                    Class8726.method30059();
                    int n4 = 0;
                    if ((System.currentTimeMillis() / 800L & 0x1L) == 0x1L) {
                        n4 = 8;
                    }
                    RealmsScreen.method15411(this.field21866.method16929() + this.field21866.method16926() - 8 - 4, this.field21866.method16928() + this.field21866.method16927() / 2 - 4, 0.0f, (float)n4, 8, 8, 8, 16);
                    Class8726.method30060();
                }
            }
        }
    }
    
    private void method15774(final int n, final int n2) {
        RealmsScreen.method15419("realms:textures/gui/title/realms.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class8726.method30063(0.5f, 0.5f, 0.5f);
        RealmsScreen.method15411(n * 2, n2 * 2 - 5, 0.0f, 0.0f, 200, 50, 200, 50);
        Class8726.method30060();
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (this.method15775(n, n2) && this.field21847) {
            this.field21847 = false;
            return this.field21848 = true;
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    private boolean method15775(final double n, final double n2) {
        final int method15777 = this.method15777();
        final int method15778 = this.method15778();
        if (n >= method15777 - 5) {
            if (n <= method15777 + 315) {
                if (n2 >= method15778 - 5) {
                    if (n2 <= method15778 + 171) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void method15776(final int n, final int n2) {
        final int method15777 = this.method15777();
        final int method15778 = this.method15778();
        final String method15779 = RealmsScreen.getLocalizedString("mco.selectServer.popup");
        final List<String> method15780 = this.method15426(method15779, 100);
        if (!this.field21851) {
            this.field21854 = 0;
            this.field21855 = 0;
            this.field21856 = true;
            this.method15748(null);
            if (this.method15430(this.field21832)) {
                this.method15429(this.field21832);
            }
            Realms.narrateNow(method15779);
        }
        if (this.field21846) {
            this.field21851 = true;
        }
        Class8726.method30068(1.0f, 1.0f, 1.0f, 0.7f);
        Class8726.method30011();
        RealmsScreen.method15419("realms:textures/gui/realms/darken.png");
        Class8726.method30059();
        RealmsScreen.method15411(0, 32, 0.0f, 0.0f, this.width(), this.height() - 40 - 32, 310, 166);
        Class8726.method30060();
        Class8726.method30012();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RealmsScreen.method15419("realms:textures/gui/realms/popup.png");
        Class8726.method30059();
        RealmsScreen.method15411(method15777, method15778, 0.0f, 0.0f, 310, 166, 310, 166);
        Class8726.method30060();
        if (!Class5079.field21828.isEmpty()) {
            RealmsScreen.method15419(Class5079.field21828.get(this.field21854).toString());
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method30059();
            RealmsScreen.method15411(method15777 + 7, method15778 + 7, 0.0f, 0.0f, 195, 152, 195, 152);
            Class8726.method30060();
            if (this.field21855 % 95 >= 5) {
                this.field21856 = false;
            }
            else if (!this.field21856) {
                this.field21854 = (this.field21854 + 1) % Class5079.field21828.size();
                this.field21856 = true;
            }
        }
        int n3 = 0;
        for (final String s : method15780) {
            final int n4 = this.width() / 2 + 52;
            ++n3;
            this.method15408(s, n4, method15778 + 10 * n3 - 3, 8421504, false);
        }
    }
    
    private int method15777() {
        return (this.width() - 310) / 2;
    }
    
    private int method15778() {
        return this.height() / 2 - 80;
    }
    
    private void method15779(final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        final int field21841 = this.field21841;
        final boolean method15780 = this.method15780(n, n2);
        if (b2 && b) {
            final float n5 = 0.25f + (1.0f + Class8269.method27459(this.field21842 * 0.5f)) * 0.25f;
            final int n6 = 0xFF000000 | (int)(n5 * 64.0f) << 16 | (int)(n5 * 64.0f) << 8 | (int)(n5 * 64.0f) << 0;
            this.method15412(n3 - 2, n4 - 2, n3 + 18, n4 + 18, n6, n6);
            final int n7 = 0xFF000000 | (int)(n5 * 255.0f) << 16 | (int)(n5 * 255.0f) << 8 | (int)(n5 * 255.0f) << 0;
            this.method15412(n3 - 2, n4 - 2, n3 + 18, n4 - 1, n7, n7);
            this.method15412(n3 - 2, n4 - 2, n3 - 1, n4 + 18, n7, n7);
            this.method15412(n3 + 17, n4 - 2, n3 + 18, n4 + 18, n7, n7);
            this.method15412(n3 - 2, n4 + 17, n3 + 18, n4 + 18, n7, n7);
        }
        RealmsScreen.method15419("realms:textures/gui/realms/invite_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n3, n4 - 6, (b2 && b) ? 16.0f : 0.0f, 0.0f, 15, 25, 31, 25);
        Class8726.method30060();
        if (b2 && field21841 != 0) {
            final int n8 = (Math.min(field21841, 6) - 1) * 8;
            final int n9 = (int)(Math.max(0.0f, Math.max(Class8269.method27459((10 + this.field21842) * 0.57f), Class8269.method27478(this.field21842 * 0.35f))) * -6.0f);
            RealmsScreen.method15419("realms:textures/gui/realms/invitation_icons.png");
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method30059();
            RealmsScreen.method15411(n3 + 4, n4 + 4 + n9, (float)n8, method15780 ? 8.0f : 0.0f, 8, 8, 48, 16);
            Class8726.method30060();
        }
        final int n10 = n + 12;
        if (b2 && method15780) {
            final String method15781 = RealmsScreen.getLocalizedString((field21841 != 0) ? "mco.invites.pending" : "mco.invites.nopending");
            this.method15412(n10 - 3, n2 - 3, n10 + this.method15424(method15781) + 3, n2 + 8 + 3, -1073741824, -1073741824);
            this.method15425(method15781, n10, n2, -1);
        }
    }
    
    private boolean method15780(final double n, final double n2) {
        int n3 = this.width() / 2 + 50;
        int n4 = this.width() / 2 + 66;
        int n5 = 11;
        int n6 = 23;
        if (this.field21841 != 0) {
            n3 -= 3;
            n4 += 3;
            n5 -= 5;
            n6 += 5;
        }
        if (n3 <= n) {
            if (n <= n4) {
                if (n5 <= n2) {
                    if (n2 <= n6) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method15781(final Class7437 class7437, final RealmsScreen class7438) {
        if (class7437 != null) {
            try {
                if (!this.field21861.tryLock(1L, TimeUnit.SECONDS)) {
                    return;
                }
                if (this.field21861.getHoldCount() > 1) {
                    return;
                }
            }
            catch (final InterruptedException ex) {
                return;
            }
            this.field21827 = true;
            this.method15782(class7437, class7438);
        }
    }
    
    private void method15782(final Class7437 class7437, final RealmsScreen class7438) {
        final Class5049 class7439 = new Class5049(class7438, new Class1341(this, class7438, class7437, this.field21861));
        class7439.method15466();
        Realms.setScreen(class7439);
    }
    
    private boolean method15783(final Class7437 class7437) {
        return class7437.field28681 != null && class7437.field28681.equals(Realms.method25357());
    }
    
    private boolean method15784(final Class7437 class7437) {
        if (class7437.field28681 != null) {
            if (class7437.field28681.equals(Realms.method25357())) {
                if (!class7437.field28684) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void method15785(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/expired_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        Class8726.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.expired");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method15786(final int n, final int n2, final int n3, final int n4, final int i) {
        RealmsScreen.method15419("realms:textures/gui/realms/expires_soon_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        if (this.field21842 % 20 >= 10) {
            RealmsScreen.method15411(n, n2, 10.0f, 0.0f, 10, 28, 20, 28);
        }
        else {
            RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 20, 28);
        }
        Class8726.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    if (i > 0) {
                                        if (i != 1) {
                                            this.field21839 = RealmsScreen.method15439("mco.selectServer.expires.days", i);
                                        }
                                        else {
                                            this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.expires.day");
                                        }
                                    }
                                    else {
                                        this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.expires.soon");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method15787(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/on_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        Class8726.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.open");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method15788(final int n, final int n2, final int n3, final int n4) {
        RealmsScreen.method15419("realms:textures/gui/realms/off_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 10, 28, 10, 28);
        Class8726.method30060();
        if (n3 >= n) {
            if (n3 <= n + 9) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 27) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.closed");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method15789(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        if (n3 >= n) {
            if (n3 <= n + 28) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 28) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    b = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        RealmsScreen.method15419("realms:textures/gui/realms/leave_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, (!b) ? 0.0f : 28.0f, 0.0f, 28, 28, 56, 28);
        Class8726.method30060();
        if (b) {
            this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.leave");
        }
    }
    
    private void method15790(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        if (n3 >= n) {
            if (n3 <= n + 28) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 28) {
                        if (n4 < this.height() - 40) {
                            if (n4 > 32) {
                                if (!this.method15745()) {
                                    b = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        RealmsScreen.method15419("realms:textures/gui/realms/configure_icon.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n, n2, (!b) ? 0.0f : 28.0f, 0.0f, 28, 28, 56, 28);
        Class8726.method30060();
        if (b) {
            this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.configure");
        }
    }
    
    public void method15791(final String s, final int n, final int n2) {
        if (s != null) {
            int n3 = 0;
            int n4 = 0;
            final String[] split = s.split("\n");
            for (int length = split.length, i = 0; i < length; ++i) {
                final int method15424 = this.method15424(split[i]);
                if (method15424 > n4) {
                    n4 = method15424;
                }
            }
            int n5 = n - n4 - 5;
            if (n5 < 0) {
                n5 = n + 12;
            }
            for (final String s2 : s.split("\n")) {
                this.method15412(n5 - 3, n2 - ((n3 != 0) ? 0 : 3) + n3, n5 + n4 + 3, n2 + 8 + 3 + n3, -1073741824, -1073741824);
                this.method15425(s2, n5, n2 + n3, 16777215);
                n3 += 10;
            }
        }
    }
    
    private void method15792(final int n, final int n2, final int n3, final int n4, final boolean b) {
        boolean b2 = false;
        if (n >= n3) {
            if (n <= n3 + 20) {
                if (n2 >= n4) {
                    if (n2 <= n4 + 20) {
                        b2 = true;
                    }
                }
            }
        }
        RealmsScreen.method15419("realms:textures/gui/realms/questionmark.png");
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        RealmsScreen.method15411(n3, n4, b ? 20.0f : 0.0f, 0.0f, 20, 20, 40, 20);
        Class8726.method30060();
        if (b2) {
            this.field21839 = RealmsScreen.getLocalizedString("mco.selectServer.info");
        }
    }
    
    private void method15793(final int n, final int n2, final boolean b, final int n3, final int n4, final boolean b2, final boolean b3) {
        boolean b4 = false;
        if (n >= n3) {
            if (n <= n3 + 20) {
                if (n2 >= n4) {
                    if (n2 <= n4 + 20) {
                        b4 = true;
                    }
                }
            }
        }
        RealmsScreen.method15419("realms:textures/gui/realms/news_icon.png");
        if (!b3) {
            Class8726.method30068(0.5f, 0.5f, 0.5f, 1.0f);
        }
        else {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        Class8726.method30059();
        RealmsScreen.method15411(n3, n4, (b3 && b2) ? 20.0f : 0.0f, 0.0f, 20, 20, 40, 20);
        Class8726.method30060();
        if (b4) {
            if (b3) {
                this.field21839 = RealmsScreen.getLocalizedString("mco.news");
            }
        }
        if (b) {
            if (b3) {
                final int n5 = b4 ? 0 : ((int)(Math.max(0.0f, Math.max(Class8269.method27459((10 + this.field21842) * 0.57f), Class8269.method27478(this.field21842 * 0.35f))) * -6.0f));
                RealmsScreen.method15419("realms:textures/gui/realms/invitation_icons.png");
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class8726.method30059();
                RealmsScreen.method15411(n3 + 10, n4 + 2 + n5, 40.0f, 0.0f, 8, 8, 48, 16);
                Class8726.method30060();
            }
        }
    }
    
    private void method15794() {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class8726.method30065((float)(this.width() / 2 - 25), 20.0f, 0.0f);
        Class8726.method30062(-20.0f, 0.0f, 0.0f, 1.0f);
        Class8726.method30063(1.5f, 1.5f, 1.5f);
        this.method15407("LOCAL!", 0, 0, 8388479);
        Class8726.method30060();
    }
    
    private void method15795() {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8726.method30059();
        Class8726.method30065((float)(this.width() / 2 - 25), 20.0f, 0.0f);
        Class8726.method30062(-20.0f, 0.0f, 0.0f, 1.0f);
        Class8726.method30063(1.5f, 1.5f, 1.5f);
        this.method15407("STAGE!", 0, 0, -256);
        Class8726.method30060();
    }
    
    public Class5079 method15796() {
        return new Class5079(this.field21831);
    }
    
    public static void method15797(final Class6582 class6582) {
        Class5079.field21828 = class6582.method19936("textures/gui/images", s -> s.endsWith(".png")).stream().filter(class6583 -> class6583.method7798().equals("realms")).collect((Collector<? super ResourceLocation, Object, List<ResourceLocation>>)ImmutableList.toImmutableList());
    }
    
    static {
        field21824 = LogManager.getLogger();
        Class5079.field21828 = (List<ResourceLocation>)ImmutableList.of();
        field21829 = new Class9057();
        Class5079.field21830 = -1;
    }
}
