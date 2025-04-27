// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Manager;

import java.util.TimerTask;

public class Class1620 extends TimerTask
{
    private static String[] field9047;
    public final /* synthetic */ Manager field9048;
    public final /* synthetic */ Manager field9049;
    
    public Class1620(final Manager field9049, final Manager field9050) {
        this.field9049 = field9049;
        this.field9048 = field9050;
    }
    
    @Override
    public void run() {
        EventThread.exec(new Class1368(this));
    }
}
