// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.bridge.game.PerformanceMetrics;
import javax.annotation.Nullable;
import com.mojang.bridge.game.GameSession;
import com.mojang.bridge.game.Language;
import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.Bridge;
import com.mojang.bridge.launcher.SessionEventListener;
import com.mojang.bridge.launcher.Launcher;
import com.mojang.bridge.game.RunningGame;

public class Class7899 implements RunningGame
{
    private static String[] field32412;
    private final Minecraft field32413;
    private final Launcher field32414;
    private SessionEventListener field32415;
    
    public Class7899(final Minecraft field32413) {
        this.field32415 = SessionEventListener.NONE;
        this.field32413 = field32413;
        this.field32414 = Bridge.getLauncher();
        if (this.field32414 != null) {
            this.field32414.registerGame((RunningGame)this);
        }
    }
    
    public GameVersion getVersion() {
        return Class9528.method35579();
    }
    
    public Language getSelectedLanguage() {
        return (Language)this.field32413.method5295().method5845();
    }
    
    @Nullable
    public GameSession getCurrentSession() {
        final Class1848 field4683 = this.field32413.world;
        return (GameSession)((field4683 != null) ? new Class6714(field4683, this.field32413.field4684, this.field32413.field4684.field4069) : null);
    }
    
    public PerformanceMetrics getPerformanceMetrics() {
        final Class9462 method5310 = this.field32413.method5310();
        long min = 2147483647L;
        long max = -2147483648L;
        long n = 0L;
        for (final long n2 : method5310.method35172()) {
            min = Math.min(min, n2);
            max = Math.max(max, n2);
            n += n2;
        }
        return (PerformanceMetrics)new Class9197((int)min, (int)max, (int)(n / method5310.method35172().length), method5310.method35172().length);
    }
    
    public void setSessionEventListener(final SessionEventListener field32415) {
        this.field32415 = field32415;
    }
    
    public void method25567() {
        this.field32415.onStartGameSession(this.getCurrentSession());
    }
    
    public void method25568() {
        this.field32415.onLeaveGameSession(this.getCurrentSession());
    }
}
