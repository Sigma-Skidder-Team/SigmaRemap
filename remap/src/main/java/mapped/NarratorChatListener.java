// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import com.mojang.text2speech.Narrator;
import org.apache.logging.log4j.Logger;

public class NarratorChatListener implements Class7894
{
    public static final ITextComponent EMPTY;
    private static final Logger field32403;
    public static final NarratorChatListener field32404;
    private final Narrator field32405;
    
    public NarratorChatListener() {
        this.field32405 = Narrator.getNarrator();
    }
    
    @Override
    public void method25555(final Class285 class285, final ITextComponent class286) {
        final Class2051 method25557 = method25557();
        if (method25557 != Class2051.field11699) {
            if (this.field32405.active()) {
                if (method25557 != Class2051.field11700) {
                    if (method25557 != Class2051.field11701 || class285 != Class285.field1572) {
                        if (method25557 != Class2051.field11702) {
                            return;
                        }
                        if (class285 != Class285.field1573) {
                            return;
                        }
                    }
                }
                ITextComponent class287;
                if (class286 instanceof Class2259 && "chat.type.text".equals(((Class2259)class286).method8496())) {
                    class287 = new Class2259("chat.type.text.narrate", ((Class2259)class286).method8497());
                }
                else {
                    class287 = class286;
                }
                this.method25558(class285.method934(), class287.getString());
            }
        }
    }
    
    public void method25556(final String s) {
        final Class2051 method25557 = method25557();
        if (this.field32405.active()) {
            if (method25557 != Class2051.field11699) {
                if (method25557 != Class2051.field11701) {
                    if (!s.isEmpty()) {
                        this.field32405.clear();
                        this.method25558(true, s);
                    }
                }
            }
        }
    }
    
    private static Class2051 method25557() {
        return Minecraft.getInstance().gameSettings.field23475;
    }
    
    private void method25558(final boolean b, final String s) {
        if (Class9528.field41021) {
            NarratorChatListener.field32403.debug("Narrating: {}", s);
        }
        this.field32405.say(s, b);
    }
    
    public void method25559(final Class2051 class2051) {
        this.method25561();
        this.field32405.say(new Class2259("options.narrator").getString() + " : " + new Class2259(class2051.method8138()).getString(), true);
        final Class690 method5318 = Minecraft.getInstance().method5318();
        if (!this.field32405.active()) {
            Class6865.method20981(method5318, Class2174.field12897, new Class2259("narrator.toast.disabled"), new Class2259("options.narrator.notavailable"));
        }
        else if (class2051 != Class2051.field11699) {
            Class6865.method20981(method5318, Class2174.field12897, new Class2259("narrator.toast.enabled"), new Class2259(class2051.method8138()));
        }
        else {
            Class6865.method20981(method5318, Class2174.field12897, new Class2259("narrator.toast.disabled"), null);
        }
    }
    
    public boolean method25560() {
        return this.field32405.active();
    }
    
    public void method25561() {
        if (method25557() != Class2051.field11699) {
            if (this.field32405.active()) {
                this.field32405.clear();
            }
        }
    }
    
    public void method25562() {
        this.field32405.destroy();
    }
    
    static {
        EMPTY = new StringTextComponent("");
        field32403 = LogManager.getLogger();
        field32404 = new NarratorChatListener();
    }
}
