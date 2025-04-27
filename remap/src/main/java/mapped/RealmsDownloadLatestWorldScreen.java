// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.util.ArrayList;

import com.google.common.collect.Lists;

import java.util.concurrent.locks.ReentrantLock;

import com.google.common.util.concurrent.RateLimiter;
import org.apache.logging.log4j.Logger;

public class RealmsDownloadLatestWorldScreen extends RealmsScreen {
    private static final Logger field21638;
    private final RealmsScreen field21639;
    private final WorldDownload field21640;
    private final String field21641;
    private final RateLimiter field21642;
    private Class5611 field21643;
    private final String field21644;
    private final Class8091 field21645;
    private volatile String field21646;
    private volatile String field21647;
    private volatile String field21648;
    private volatile boolean field21649;
    private volatile boolean field21650;
    private volatile boolean field21651;
    private volatile boolean field21652;
    private Long field21653;
    private Long field21654;
    private long field21655;
    private int field21656;
    private static final String[] field21657;
    private int field21658;
    private final int field21659 = 100;
    private int field21660;
    private boolean field21661;
    private static final ReentrantLock field21662;

    public RealmsDownloadLatestWorldScreen(final RealmsScreen field21639, final WorldDownload field21640, final String field21641) {
        this.field21650 = true;
        this.field21660 = -1;
        this.field21639 = field21639;
        this.field21644 = field21641;
        this.field21640 = field21640;
        this.field21645 = new Class8091(this);
        this.field21641 = RealmsScreen.getLocalizedString("mco.download.title");
        this.field21642 = RateLimiter.create(0.10000000149011612);
    }

    public void method15449(final int field21660) {
        this.field21660 = field21660;
    }

    @Override
    public void init() {
        this.method15444(true);
        this.buttonsAdd(this.field21643 = new Class5615(this, 0, this.width() / 2 - 100, this.height() - 42, 200, 20, RealmsScreen.getLocalizedString("gui.cancel")));
        this.method15450();
    }

    private void method15450() {
        if (!this.field21651) {
            if (!this.field21661 && this.method15451(this.field21640.field28659) >= 5368709120L) {
                Realms.setScreen(new Class5084(this, Class2039.field11627, RealmsScreen.method15439("mco.download.confirmation.line1", method15458(5368709120L)), RealmsScreen.getLocalizedString("mco.download.confirmation.line2"), false, 100));
            } else {
                this.method15459();
            }
        }
    }

    @Override
    public void confirmResult(final boolean b, final int n) {
        this.field21661 = true;
        Realms.setScreen(this);
        this.method15459();
    }

    private long method15451(final String s) {
        return new Class8113().method26666(s);
    }

    @Override
    public void tick() {
        super.tick();
        ++this.field21656;
        if (this.field21647 != null) {
            if (this.field21642.tryAcquire(1)) {
                final ArrayList arrayList = Lists.newArrayList();
                arrayList.add(this.field21641);
                arrayList.add(this.field21647);
                if (this.field21648 != null) {
                    arrayList.add(this.field21648 + "%");
                    arrayList.add(method15457(this.field21655));
                }
                if (this.field21646 != null) {
                    arrayList.add(this.field21646);
                }
                Realms.narrateNow(String.join(System.lineSeparator(), arrayList));
            }
        }
    }

    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        this.field21649 = true;
        this.method15452();
        return true;
    }

    private void method15452() {
        if (this.field21651) {
            if (this.field21660 != -1) {
                if (this.field21646 == null) {
                    this.field21639.confirmResult(true, this.field21660);
                }
            }
        }
        Realms.setScreen(this.field21639);
    }

    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        if (this.field21652) {
            if (!this.field21651) {
                this.field21647 = RealmsScreen.getLocalizedString("mco.download.extracting");
            }
        }
        this.drawCenteredString(this.field21641, this.width() / 2, 20, 16777215);
        this.drawCenteredString(this.field21647, this.width() / 2, 50, 16777215);
        if (this.field21650) {
            this.method15453();
        }
        if (this.field21645.field33322 != 0L) {
            if (!this.field21649) {
                this.method15454();
                this.method15455();
            }
        }
        if (this.field21646 != null) {
            this.drawCenteredString(this.field21646, this.width() / 2, 110, 16711680);
        }
        super.render(n, n2, n3);
    }

    private void method15453() {
        final int method15424 = this.method15424(this.field21647);
        if (this.field21656 % 10 == 0) {
            ++this.field21658;
        }
        this.method15407(RealmsDownloadLatestWorldScreen.field21657[this.field21658 % RealmsDownloadLatestWorldScreen.field21657.length], this.width() / 2 + method15424 / 2 + 5, 50, 16777215);
    }

    private void method15454() {
        final double d = this.field21645.field33322 / (double) this.field21645.field33323 * 100.0;
        this.field21648 = String.format(Locale.ROOT, "%.1f", d);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.disableTexture();
        final Class7710 field30674 = Class7710.field30674;
        field30674.method24611(7, Class7785.field31865);
        final double n = this.width() / 2 - 100;
        field30674.method24610(n - 0.5, 95.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0 + 0.5, 95.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0 + 0.5, 79.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n - 0.5, 79.5, 0.0).method24613(217, 210, 210, 255).method24612();
        field30674.method24610(n, 95.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0, 95.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n + 200.0 * d / 100.0, 80.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24610(n, 80.0, 0.0).method24613(128, 128, 128, 255).method24612();
        field30674.method24609();
        RenderSystem.enableTexture();
        this.drawCenteredString(this.field21648 + " %", this.width() / 2, 84, 16777215);
    }

    private void method15455() {
        if (this.field21656 % 20 != 0) {
            this.method15456(this.field21655);
        } else {
            if (this.field21653 != null) {
                long n = System.currentTimeMillis() - this.field21654;
                if (n == 0L) {
                    n = 1L;
                }
                this.method15456(this.field21655 = 1000L * (this.field21645.field33322 - this.field21653) / n);
            }
            this.field21653 = this.field21645.field33322;
            this.field21654 = System.currentTimeMillis();
        }
    }

    private void method15456(final long n) {
        if (n > 0L) {
            this.method15407("(" + method15457(n) + ")", this.width() / 2 + this.method15424(this.field21648) / 2 + 15, 84, 16777215);
        }
    }

    public static String method15457(final long lng) {
        if (lng >= 1024L) {
            final int n = (int) (Math.log((double) lng) / Math.log(1024.0));
            return String.format(Locale.ROOT, "%.1f %sB/s", lng / Math.pow(1024.0, n), "KMGTPE".charAt(n - 1) + "");
        }
        return lng + " B/s";
    }

    public static String method15458(final long lng) {
        if (lng >= 1024L) {
            final int n = (int) (Math.log((double) lng) / Math.log(1024.0));
            return String.format(Locale.ROOT, "%.0f %sB", lng / Math.pow(1024.0, n), "KMGTPE".charAt(n - 1) + "");
        }
        return lng + " B";
    }

    private void method15459() {
        new Thread(() -> {
            try {
                try {
                    if (RealmsDownloadLatestWorldScreen.field21662.tryLock(1L, TimeUnit.SECONDS)) {
                        this.field21647 = RealmsScreen.getLocalizedString("mco.download.preparing");
                        if (this.field21649) {
                            this.method15460();
                            if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                                return;
                            } else {
                                RealmsDownloadLatestWorldScreen.field21662.unlock();
                                this.field21650 = false;
                                this.field21651 = true;
                                return;
                            }
                        } else {
                            this.field21647 = RealmsScreen.method15439("mco.download.downloading", this.field21644);
                            final Class8113 class8113 = new Class8113();
                            class8113.method26666(this.field21640.field28659);
                            class8113.method26667(this.field21640, this.field21644, this.field21645, this.method15441());
                            while (!class8113.method26669()) {
                                if (class8113.method26670()) {
                                    class8113.method26668();
                                    this.field21646 = RealmsScreen.getLocalizedString("mco.download.failed");
                                    this.field21643.method16925(RealmsScreen.getLocalizedString("gui.done"));
                                    if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                                        return;
                                    } else {
                                        RealmsDownloadLatestWorldScreen.field21662.unlock();
                                        this.field21650 = false;
                                        this.field21651 = true;
                                        return;
                                    }
                                } else {
                                    if (class8113.method26671()) {
                                        this.field21652 = true;
                                    }
                                    if (this.field21649) {
                                        class8113.method26668();
                                        this.method15460();
                                        if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                                            return;
                                        } else {
                                            RealmsDownloadLatestWorldScreen.field21662.unlock();
                                            this.field21650 = false;
                                            this.field21651 = true;
                                            return;
                                        }
                                    } else {
                                        try {
                                            Thread.sleep(500L);
                                        } catch (final InterruptedException ex) {
                                            RealmsDownloadLatestWorldScreen.field21638.error("Failed to check Realms backup download status");
                                        }
                                    }
                                }
                            }
                            this.field21651 = true;
                            this.field21647 = RealmsScreen.getLocalizedString("mco.download.done");
                            this.field21643.method16925(RealmsScreen.getLocalizedString("gui.done"));
                            if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                                return;
                            } else {
                                RealmsDownloadLatestWorldScreen.field21662.unlock();
                                this.field21650 = false;
                                this.field21651 = true;
                                return;
                            }
                        }
                    } else if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                        return;
                    } else {
                        RealmsDownloadLatestWorldScreen.field21662.unlock();
                        this.field21650 = false;
                        this.field21651 = true;
                        return;
                    }
                } catch (final InterruptedException ex2) {
                    RealmsDownloadLatestWorldScreen.field21638.error("Could not acquire upload lock");
                } catch (final Exception ex3) {
                    this.field21646 = RealmsScreen.getLocalizedString("mco.download.failed");
                    ex3.printStackTrace();
                }
                RealmsDownloadLatestWorldScreen.field21662.unlock();
                this.field21650 = false;
                this.field21651 = true;
                return;
            } finally {
                if (!RealmsDownloadLatestWorldScreen.field21662.isHeldByCurrentThread()) {
                    return;
                }
            }
        }).start();
    }

    private void method15460() {
        this.field21647 = RealmsScreen.getLocalizedString("mco.download.cancelled");
    }

    static {
        field21638 = LogManager.getLogger();
        field21657 = new String[]{".", ". .", ". . ."};
        field21662 = new ReentrantLock();
    }
}
