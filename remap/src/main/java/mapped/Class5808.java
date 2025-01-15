// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import javax.annotation.Nullable;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import com.mojang.authlib.GameProfile;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;

public class Class5808 implements Class5807
{
    private static final Logger field23838;
    private final Class869 field23839;
    private final Class527 field23840;
    private final Consumer<ITextComponent> field23841;
    private final NetworkManager field23842;
    private GameProfile field23843;
    
    public Class5808(final NetworkManager field23842, final Class869 field23843, final Class527 field23844, final Consumer<ITextComponent> field23845) {
        this.field23842 = field23842;
        this.field23839 = field23843;
        this.field23840 = field23844;
        this.field23841 = field23845;
    }
    
    @Override
    public void method17404(final Class4309 class4309) {
        final SecretKey method34697 = Class9359.method34697();
        final PublicKey method34698 = class4309.method12955();
        new BigInteger(Class9359.method34699(class4309.method12954(), method34698, method34697)).toString(16);
        final Class4341 class4310 = new Class4341(method34697, method34698, class4309.method12956());
        this.field23841.accept(new Class2259("connect.authorizing", new Object[0]));
        Class7676.field30475.submit(() -> {
            this.method17409(s);
            final ITextComponent class4312;
            if (class4312 != null) {
                if (this.field23839.method5282() != null && this.field23839.method5282().method35871()) {
                    Class5808.field23838.warn(class4312.getString());
                }
                else {
                    this.field23842.method11181(class4312);
                    return;
                }
            }
            this.field23841.accept(new Class2259("connect.encrypting", new Object[0]));
            this.field23842.method11175(class4311, (GenericFutureListener<? extends Future<? super Void>>)(future -> this.field23842.method11185(secretKey)));
        });
    }
    
    @Nullable
    private ITextComponent method17409(final String s) {
        try {
            this.method17410().joinServer(this.field23839.method5287().method33694(), this.field23839.method5287().method33693(), s);
            return null;
        }
        catch (final AuthenticationUnavailableException ex) {
            return new Class2259("disconnect.loginFailedInfo", new Object[] { new Class2259("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) });
        }
        catch (final InvalidCredentialsException ex2) {
            return new Class2259("disconnect.loginFailedInfo", new Object[] { new Class2259("disconnect.loginFailedInfo.invalidSession", new Object[0]) });
        }
        catch (final AuthenticationException ex3) {
            return new Class2259("disconnect.loginFailedInfo", new Object[] { ex3.getMessage() });
        }
    }
    
    private MinecraftSessionService method17410() {
        return this.field23839.method5301();
    }
    
    @Override
    public void method17405(final Class4367 class4367) {
        this.field23841.accept(new Class2259("connect.joining", new Object[0]));
        this.field23843 = class4367.method13133();
        this.field23842.method11171(Class2208.field13455);
        this.field23842.method11173(new Class5799(this.field23839, this.field23840, this.field23842, this.field23843));
    }
    
    @Override
    public void onDisconnect(final ITextComponent class2250) {
        if (this.field23840 != null && this.field23840 instanceof Class545) {
            this.field23839.method5244(new Class5070(((Class545)this.field23840).method3183(), "connect.failed", class2250).method15403());
        }
        else {
            this.field23839.method5244(new Class735(this.field23840, "connect.failed", class2250));
        }
    }
    
    @Override
    public NetworkManager getNetworkManager() {
        return this.field23842;
    }
    
    @Override
    public void method17406(final Class4277 class4277) {
        this.field23842.method11181(class4277.method12842());
    }
    
    @Override
    public void method17407(final Class4322 class4322) {
        if (!this.field23842.method11182()) {
            this.field23842.method11192(class4322.method12986());
        }
    }
    
    @Override
    public void method17408(final Class4299 class4299) {
        this.field23841.accept(new Class2259("connect.negotiating", new Object[0]));
        this.field23842.method11174(new Class4390(class4299.method12916(), null));
    }
    
    static {
        field23838 = LogManager.getLogger();
    }
}
