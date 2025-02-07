// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class1114 implements Runnable
{
    public final /* synthetic */ Class4934 field6000;
    public final /* synthetic */ List field6001;
    public final /* synthetic */ boolean field6002;
    public final /* synthetic */ Class4934 field6003;
    
    public Class1114(final Class4934 field6003, final Class4934 field6004, final List field6005, final boolean field6006) {
        this.field6003 = field6003;
        this.field6000 = field6004;
        this.field6001 = field6005;
        this.field6002 = field6006;
    }
    
    @Override
    public void run() {
        int method14392 = 0;
        if (Class4934.method14833(this.field6003) != null) {
            method14392 = Class4934.method14833(this.field6003).method14392();
            this.field6000.method14245(Class4934.method14833(this.field6003));
        }
        final CustomGuiScreen method14393 = this.field6000.method14224("alts");
        if (method14393 != null) {
            this.field6000.method14245(method14393);
        }
        this.field6000.method14242(Class4934.method14834(this.field6003, new Class4817(this.field6000, "alts", 0, 114, (int)(Minecraft.method5277().window.method7694() * Class4934.method14835(this.field6003)) - 4, Minecraft.method5277().window.method7695() - 119 - Class4934.method14836(this.field6003))));
        final Iterator iterator = this.field6001.iterator();
        while (iterator.hasNext()) {
            Class4934.method14837(this.field6003, (Class7971)iterator.next(), this.field6002);
        }
        Class4934.method14833(this.field6003).method14391(method14392);
        Class4934.method14833(this.field6003).method14311(false);
        Class4934.method14833(this.field6003).method14394(false);
    }
}
