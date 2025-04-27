// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

public class Class694 extends Screen
{
    private static final AtomicInteger field3817;
    private static final Logger field3146;
    private NetworkManager field3818;
    private boolean field3819;
    private final Screen field3820;
    private ITextComponent field3821;
    private long field3822;
    
    public Class694(final Screen field3820, final Minecraft field3821, final ServerData class9575) {
        super(NarratorChatListener.EMPTY);
        this.field3821 = new Class2259("connect.connecting");
        this.field3822 = -1L;
        this.minecraft = field3821;
        this.field3820 = field3820;
        final Class7872 method25494 = Class7872.method25494(class9575.field41613);
        field3821.method5264();
        field3821.method5281(class9575);
        this.method3872(method25494.method25492(), method25494.method25493());
    }
    
    public Class694(final Screen field3820, final Minecraft field3821, final String s, final int n) {
        super(NarratorChatListener.EMPTY);
        this.field3821 = new Class2259("connect.connecting");
        this.field3822 = -1L;
        this.minecraft = field3821;
        this.field3820 = field3820;
        field3821.method5264();
        this.method3872(s, n);
    }
    
    private void method3872(final String s, final int i) {
        Class694.field3146.info("Connecting to {}, {}", s, i);
        final Class913 class913 = new Class913(this, "Server Connector #" + Class694.field3817.incrementAndGet(), s, i);
        class913.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class694.field3146));
        class913.start();
    }
    
    private void method3873(final ITextComponent field3821) {
        this.field3821 = field3821;
    }
    
    @Override
    public void tick() {
        if (this.field3818 != null) {
            if (!this.field3818.method11187()) {
                this.field3818.method11193();
            }
            else {
                this.field3818.method11179();
            }
        }
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void init() {
        this.addButton(new Class654(this.width / 2 - 100, this.height / 4 + 120 + 12, 200, 20, Class8822.method30773("gui.cancel"), class654 -> {
            this.field3819 = true;
            if (this.field3818 != null) {
                this.field3818.method11181(new Class2259("connect.aborted"));
            }
            this.minecraft.displayGuiScreen(this.field3820);
        }));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        final long method27837 = Util.method27837();
        if (method27837 - this.field3822 > 2000L) {
            this.field3822 = method27837;
            NarratorChatListener.field32404.method25556(new Class2259("narrator.joining").getString());
        }
        this.drawCenteredString(this.font, this.field3821.getFormattedText(), this.width / 2, this.height / 2 - 50, 16777215);
        super.render(n, n2, n3);
    }
    
    static {
        field3817 = new AtomicInteger(0);
        field3146 = LogManager.getLogger();
    }
}
