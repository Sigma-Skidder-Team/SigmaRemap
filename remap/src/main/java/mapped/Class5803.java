// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.security.PrivateKey;
import java.util.Arrays;
import org.apache.commons.lang3.Validate;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;
import com.mojang.authlib.GameProfile;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

public class Class5803 implements Class5802
{
    private static final AtomicInteger field23821;
    private static final Logger field23822;
    private static final Random field23823;
    private final byte[] field23824;
    private final MinecraftServer field23825;
    public final NetworkManager field23826;
    private Class2055 field23827;
    private int field23828;
    private GameProfile field23829;
    private final String field23830 = "";
    private SecretKey field23831;
    private Class513 field23832;
    
    public Class5803(final MinecraftServer field23825, final NetworkManager field23826) {
        this.field23824 = new byte[4];
        this.field23827 = Class2055.field11726;
        this.field23825 = field23825;
        this.field23826 = field23826;
        Class5803.field23823.nextBytes(this.field23824);
    }
    
    public void method17391() {
        if (this.field23827 != Class2055.field11730) {
            if (this.field23827 == Class2055.field11731) {
                if (this.field23825.method1537().method20624(this.field23829.getId()) == null) {
                    this.field23827 = Class2055.field11730;
                    this.field23825.method1537().method20577(this.field23826, this.field23832);
                    this.field23832 = null;
                }
            }
        }
        else {
            this.method17393();
        }
        if (this.field23828++ == 600) {
            this.method17392(new Class2259("multiplayer.disconnect.slow_login", new Object[0]));
        }
    }
    
    @Override
    public NetworkManager getNetworkManager() {
        return this.field23826;
    }
    
    public void method17392(final ITextComponent class2250) {
        try {
            Class5803.field23822.info("Disconnecting {}: {}", (Object)this.method17394(), (Object)class2250.getString());
            this.field23826.method11174(new Class4277(class2250));
            this.field23826.method11181(class2250);
        }
        catch (final Exception ex) {
            Class5803.field23822.error("Error whilst disconnecting player", (Throwable)ex);
        }
    }
    
    public void method17393() {
        if (!this.field23829.isComplete()) {
            this.field23829 = this.method17395(this.field23829);
        }
        final ITextComponent method20573 = this.field23825.method1537().method20573(this.field23826.method11180(), this.field23829);
        if (method20573 == null) {
            this.field23827 = Class2055.field11732;
            if (this.field23825.method1562() >= 0) {
                if (!this.field23826.method11182()) {
                    this.field23826.method11175(new Class4322(this.field23825.method1562()), (GenericFutureListener<? extends Future<? super Void>>)(future -> this.field23826.method11192(this.field23825.method1562())));
                }
            }
            this.field23826.method11174(new Class4367(this.field23829));
            if (this.field23825.method1537().method20624(this.field23829.getId()) == null) {
                this.field23825.method1537().method20577(this.field23826, this.field23825.method1537().method20582(this.field23829));
            }
            else {
                this.field23827 = Class2055.field11731;
                this.field23832 = this.field23825.method1537().method20582(this.field23829);
            }
        }
        else {
            this.method17392(method20573);
        }
    }
    
    @Override
    public void onDisconnect(final ITextComponent class2250) {
        Class5803.field23822.info("{} lost connection: {}", (Object)this.method17394(), (Object)class2250.getString());
    }
    
    public String method17394() {
        return (this.field23829 == null) ? String.valueOf(this.field23826.method11180()) : (this.field23829 + " (" + this.field23826.method11180() + ")");
    }
    
    @Override
    public void method17388(final Class4327 class4327) {
        Validate.validState(this.field23827 == Class2055.field11726, "Unexpected hello packet", new Object[0]);
        this.field23829 = class4327.method12991();
        if (this.field23825.method1518() && !this.field23826.method11182()) {
            this.field23827 = Class2055.field11727;
            this.field23826.method11174(new Class4309("", this.field23825.method1495().getPublic(), this.field23824));
        }
        else {
            this.field23827 = Class2055.field11730;
        }
    }
    
    @Override
    public void method17389(final Class4341 class4341) {
        Validate.validState(this.field23827 == Class2055.field11727, "Unexpected key packet", new Object[0]);
        final PrivateKey private1 = this.field23825.method1495().getPrivate();
        if (Arrays.equals(this.field23824, class4341.method13037(private1))) {
            this.field23831 = class4341.method13036(private1);
            this.field23827 = Class2055.field11728;
            this.field23826.method11185(this.field23831);
            final Class907 class4342 = new Class907(this, "User Authenticator #" + Class5803.field23821.incrementAndGet());
            class4342.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class5803.field23822));
            class4342.start();
            return;
        }
        throw new IllegalStateException("Invalid nonce!");
    }
    
    @Override
    public void method17390(final Class4390 class4390) {
        this.method17392(new Class2259("multiplayer.disconnect.unexpected_query_response", new Object[0]));
    }
    
    public GameProfile method17395(final GameProfile gameProfile) {
        return new GameProfile(PlayerEntity.method2894(gameProfile.getName()), gameProfile.getName());
    }
    
    static {
        field23821 = new AtomicInteger(0);
        field23822 = LogManager.getLogger();
        field23823 = new Random();
    }
}
