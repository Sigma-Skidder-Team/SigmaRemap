// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import net.sourceforge.jaad.aac.AACException;
import java.util.logging.Level;

public class Class4206 implements Class4178
{
    private final Class4179 field18964;
    private final Class4205 field18965;
    private final Class4185 field18966;
    private Class8157 field18967;
    private Class7279 field18968;
    
    public static boolean method12667(final Class2002 class2002) {
        return class2002.method8028();
    }
    
    public Class4206(final byte[] array) throws AACException {
        this.field18964 = Class4179.method12542(array);
        if (this.field18964 == null) {
            throw new IllegalArgumentException("illegal MP4 decoder specific info");
        }
        if (method12667(this.field18964.method12531())) {
            this.field18965 = new Class4205(this.field18964);
            this.field18966 = new Class4185(this.field18964.method12529(), this.field18964.method12520().method8023());
            this.field18967 = new Class8157();
            Class4206.field18616.log(Level.FINE, "profile: {0}", this.field18964.method12531());
            Class4206.field18616.log(Level.FINE, "sf: {0}", this.field18964.method12533().method8183());
            Class4206.field18616.log(Level.FINE, "channels: {0}", this.field18964.method12520().method8024());
            return;
        }
        throw new Class2348("unsupported profile: " + this.field18964.method12531().method8027());
    }
    
    public Class4179 method12668() {
        return this.field18964;
    }
    
    public void method12669(final byte[] array, final Class9157 class9157) throws AACException {
        if (array != null) {
            this.field18967.method26934(array);
        }
        try {
            this.method12670(class9157);
            return;
        }
        catch (final Class2348 class9158) {
            if (!class9158.method9491()) {
                throw class9158;
            }
        }
        Class4206.field18616.warning("unexpected end of frame");
    }
    
    private void method12670(final Class9157 class9157) throws AACException {
        if (Class7279.method22316(this.field18967)) {
            this.field18968 = Class7279.method22317(this.field18967);
            final Class4208 method22319 = this.field18968.method22319();
            this.field18964.method12532(method22319.method12674());
            this.field18964.method12534(method22319.method12675());
            this.field18964.method12521(Class2001.method8022(method22319.method12676()));
        }
        if (!method12667(this.field18964.method12531())) {
            throw new Class2348("unsupported profile: " + this.field18964.method12531().method8027());
        }
        this.field18965.method12653();
        try {
            this.field18965.method12654(this.field18967);
            this.field18965.method12661(this.field18966);
            this.field18965.method12666(class9157);
        }
        catch (final Class2348 class9158) {
            class9157.method33426(new byte[0], 0, 0, 0, 0);
            throw class9158;
        }
        catch (final Exception ex) {
            class9157.method33426(new byte[0], 0, 0, 0, 0);
            throw new Class2348(ex);
        }
    }
    
    static {
        final Handler[] handlers = Class4206.field18616.getHandlers();
        for (int length = handlers.length, i = 0; i < length; ++i) {
            Class4206.field18616.removeHandler(handlers[i]);
        }
        Class4206.field18616.setLevel(Level.WARNING);
        final ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        Class4206.field18616.addHandler(handler);
    }
}
