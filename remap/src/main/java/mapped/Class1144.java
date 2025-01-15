// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class1144 implements Runnable
{
    public final /* synthetic */ Class4960 field6187;
    
    public Class1144(final Class4960 field6187) {
        this.field6187 = field6187;
    }
    
    @Override
    public void run() {
        if (Class4960.method14964(this.field6187)) {
            if (Class4960.method14969().isLoggable(Level.FINE)) {
                Class4960.method14969().fine(String.format("performing disconnect (%s)", Class4960.method14974(this.field6187)));
            }
            Class4960.method14972(this.field6187, new Class9041(1));
        }
        Class4960.method14975(this.field6187);
        if (Class4960.method14964(this.field6187)) {
            Class4960.method14963(this.field6187, "io client disconnect");
        }
    }
}
