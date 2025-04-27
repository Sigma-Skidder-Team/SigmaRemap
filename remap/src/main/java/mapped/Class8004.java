// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.util.text.ITextComponent;

import java.lang.reflect.InvocationTargetException;

public class Class8004
{
    private static String[] field32965;
    private static final Minecraft field32966;
    
    public static void method26199(final int n) {
        if (Client.getInstance().getClientMode() == ClientMode.NOADDONS) {
            return;
        }
        if (n == -1) {
            return;
        }
        for (final Class8879 class8879 : Client.getInstance().moduleManager().getJelloTouch().method21964(n)) {
            if (class8879 != null && class8879.method31228()) {
                switch (Class9204.field38998[class8879.method31231().ordinal()]) {
                    case 1: {
                        class8879.method31234().toggle();
                        continue;
                    }
                    case 2: {
                        try {
                            final Screen class8880 = (Screen)class8879.method31233().getDeclaredConstructor(ITextComponent.class).newInstance(new StringTextComponent(ScreenManager.field37983.get(class8879.method31233())));
                            if (!Client.getInstance().getScreenManager().method32158(class8880)) {
                                continue;
                            }
                            Class8004.field32966.displayGuiScreen(class8880);
                        }
                        catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                            ((Throwable)ex).printStackTrace();
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static void method26200(final int n) {
        Client.getInstance().getEventBus().post(new Class5715(n));
    }
    
    static {
        field32966 = Minecraft.getInstance();
    }
}
