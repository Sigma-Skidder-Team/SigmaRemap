// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.Validate;
import java.util.List;
import java.net.UnknownHostException;
import com.google.common.hash.Hashing;

public class Class634 extends Class633
{
    private final Class720 field3622;
    private final Class869 field3623;
    private final Class9575 field3624;
    private final Class1932 field3625;
    private String field3626;
    private Class1773 field3627;
    private long field3628;
    public final /* synthetic */ Class612 field3629;
    
    public Class634(final Class612 field3629, final Class720 field3630, final Class9575 field3631) {
        this.field3629 = field3629;
        this.field3622 = field3630;
        this.field3624 = field3631;
        this.field3623 = Class869.method5277();
        this.field3625 = new Class1932("servers/" + Hashing.sha1().hashUnencodedChars((CharSequence)field3631.field41613) + "/icon");
        this.field3627 = (Class1773)this.field3623.method5290().method5853(this.field3625);
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        if (!this.field3624.field41619) {
            this.field3624.field41619 = true;
            this.field3624.field41616 = -2L;
            this.field3624.field41615 = "";
            this.field3624.field41614 = "";
            Class612.method3578().submit(() -> {
                try {
                    this.field3622.method3952().method26694(this.field3624);
                }
                catch (final UnknownHostException ex) {
                    this.field3624.field41616 = -1L;
                    this.field3624.field41615 = TextFormatting.DARK_RED + Class8822.method30773("multiplayer.status.cannot_resolve", new Object[0]);
                }
                catch (final Exception ex2) {
                    this.field3624.field41616 = -1L;
                    this.field3624.field41615 = TextFormatting.DARK_RED + Class8822.method30773("multiplayer.status.cannot_connect", new Object[0]);
                }
                return;
            });
        }
        final boolean b2 = this.field3624.field41617 > Class9528.method35579().getProtocolVersion();
        final boolean b3 = this.field3624.field41617 < Class9528.method35579().getProtocolVersion();
        final boolean b4 = b2 || b3;
        this.field3623.field4643.method6610(this.field3624.field41612, (float)(n3 + 32 + 3), (float)(n2 + 1), 16777215);
        final List<String> method6626 = this.field3623.field4643.method6626(this.field3624.field41615, n4 - 32 - 2);
        for (int i = 0; i < Math.min(method6626.size(), 2); ++i) {
            this.field3623.field4643.method6610((String)method6626.get(i), (float)(n3 + 32 + 3), (float)(n2 + 12 + 9 * i), 8421504);
        }
        final String s = b4 ? (TextFormatting.DARK_RED + this.field3624.field41618) : this.field3624.field41614;
        final int method6627 = this.field3623.field4643.method6617(s);
        this.field3623.field4643.method6610(s, (float)(n3 + n4 - method6627 - 15 - 2), (float)(n2 + 1), 8421504);
        int n9 = 0;
        String s2 = null;
        int n10;
        String s3;
        if (!b4) {
            if (this.field3624.field41619 && this.field3624.field41616 != -2L) {
                if (this.field3624.field41616 >= 0L) {
                    if (this.field3624.field41616 >= 150L) {
                        if (this.field3624.field41616 >= 300L) {
                            if (this.field3624.field41616 >= 600L) {
                                if (this.field3624.field41616 >= 1000L) {
                                    n10 = 4;
                                }
                                else {
                                    n10 = 3;
                                }
                            }
                            else {
                                n10 = 2;
                            }
                        }
                        else {
                            n10 = 1;
                        }
                    }
                    else {
                        n10 = 0;
                    }
                }
                else {
                    n10 = 5;
                }
                if (this.field3624.field41616 >= 0L) {
                    s3 = this.field3624.field41616 + "ms";
                    s2 = this.field3624.field41620;
                }
                else {
                    s3 = Class8822.method30773("multiplayer.status.no_connection", new Object[0]);
                }
            }
            else {
                n9 = 1;
                n10 = (int)(Class8349.method27837() / 100L + n * 2 & 0x7L);
                if (n10 > 4) {
                    n10 = 8 - n10;
                }
                s3 = Class8822.method30773("multiplayer.status.pinging", new Object[0]);
            }
        }
        else {
            n10 = 5;
            s3 = Class8822.method30773(b2 ? "multiplayer.status.client_out_of_date" : "multiplayer.status.server_out_of_date", new Object[0]);
            s2 = this.field3624.field41620;
        }
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3623.method5290().method5849(Class565.field3363);
        Class565.method3188(n3 + n4 - 15, n2, (float)(n9 * 10), (float)(176 + n10 * 8), 10, 8, 256, 256);
        if (this.field3624.method35869() != null) {
            if (!this.field3624.method35869().equals(this.field3626)) {
                this.field3626 = this.field3624.method35869();
                this.method3656();
                this.field3622.method3954().method34332();
            }
        }
        if (this.field3627 == null) {
            this.method3654(n3, n2, Class612.method3579());
        }
        else {
            this.method3654(n3, n2, this.field3625);
        }
        final int n11 = n6 - n3;
        final int n12 = n7 - n2;
        Label_0845: {
            if (n11 >= n4 - 15) {
                if (n11 <= n4 - 5) {
                    if (n12 >= 0) {
                        if (n12 <= 8) {
                            this.field3622.method3953(s3);
                            break Label_0845;
                        }
                    }
                }
            }
            if (n11 >= n4 - method6627 - 15 - 2) {
                if (n11 <= n4 - 15 - 2) {
                    if (n12 >= 0) {
                        if (n12 <= 8) {
                            this.field3622.method3953(s2);
                        }
                    }
                }
            }
        }
        if (this.field3623.field4648.field23429 || b) {
            this.field3623.method5290().method5849(Class612.method3580());
            Class565.method3293(n3, n2, n3 + 32, n2 + 32, -1601138544);
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            final int n13 = n6 - n3;
            final int n14 = n7 - n2;
            if (this.method3655()) {
                if (n13 < 32 && n13 > 16) {
                    Class565.method3188(n3, n2, 0.0f, 32.0f, 32, 32, 256, 256);
                }
                else {
                    Class565.method3188(n3, n2, 0.0f, 0.0f, 32, 32, 256, 256);
                }
            }
            if (n > 0) {
                if (n13 < 16 && n14 < 16) {
                    Class565.method3188(n3, n2, 96.0f, 32.0f, 32, 32, 256, 256);
                }
                else {
                    Class565.method3188(n3, n2, 96.0f, 0.0f, 32, 32, 256, 256);
                }
            }
            if (n < this.field3622.method3954().method34336() - 1) {
                if (n13 < 16 && n14 > 16) {
                    Class565.method3188(n3, n2, 64.0f, 32.0f, 32, 32, 256, 256);
                }
                else {
                    Class565.method3188(n3, n2, 64.0f, 0.0f, 32, 32, 256, 256);
                }
            }
        }
    }
    
    public void method3654(final int n, final int n2, final Class1932 class1932) {
        this.field3623.method5290().method5849(class1932);
        Class8726.method30011();
        Class565.method3188(n, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        Class8726.method30012();
    }
    
    private boolean method3655() {
        return true;
    }
    
    private void method3656() {
        final String method35869 = this.field3624.method35869();
        if (method35869 == null) {
            this.field3623.method5290().method5858(this.field3625);
            if (this.field3627 != null && this.field3627.method6328() != null) {
                this.field3627.method6328().close();
            }
            this.field3627 = null;
        }
        else {
            try {
                final Class1846 method35870 = Class1846.method6668(method35869);
                Validate.validState(method35870.method6644() == 64, "Must be 64 pixels wide", new Object[0]);
                Validate.validState(method35870.method6645() == 64, "Must be 64 pixels high", new Object[0]);
                if (this.field3627 == null) {
                    this.field3627 = new Class1773(method35870);
                }
                else {
                    this.field3627.method6329(method35870);
                    this.field3627.method6327();
                }
                this.field3623.method5290().method5851(this.field3625, this.field3627);
            }
            catch (final Throwable t) {
                Class612.method3581().error("Invalid icon for server {} ({})", (Object)this.field3624.field41612, (Object)this.field3624.field41613, (Object)t);
                this.field3624.method35870(null);
            }
        }
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (Class527.method3047()) {
            final int index = this.field3622.field3932.method3040().indexOf(this);
            if (n != 264 || index >= this.field3622.method3954().method34336() - 1) {
                if (n != 265) {
                    return super.method2972(n, n2, n3);
                }
                if (index <= 0) {
                    return super.method2972(n, n2, n3);
                }
            }
            this.method3657(index, (n != 264) ? (index - 1) : (index + 1));
            return true;
        }
        return super.method2972(n, n2, n3);
    }
    
    private void method3657(final int n, final int n2) {
        this.field3622.method3954().method34337(n, n2);
        this.field3622.field3932.method3576(this.field3622.method3954());
        final Class633 class633 = this.field3622.field3932.method3040().get(n2);
        this.field3622.field3932.method3575(class633);
        Class612.method3582(this.field3629, class633);
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        final double n4 = n - Class612.method3583(this.field3629);
        final double n5 = n2 - Class612.method3584(this.field3629, this.field3629.method3040().indexOf(this));
        if (n4 <= 32.0) {
            if (n4 < 32.0) {
                if (n4 > 16.0) {
                    if (this.method3655()) {
                        this.field3622.method3950(this);
                        this.field3622.method3948();
                        return true;
                    }
                }
            }
            final int index = this.field3622.field3932.method3040().indexOf(this);
            if (n4 < 16.0) {
                if (n5 < 16.0) {
                    if (index > 0) {
                        this.method3657(index, index - 1);
                        return true;
                    }
                }
            }
            if (n4 < 16.0) {
                if (n5 > 16.0) {
                    if (index < this.field3622.method3954().method34336() - 1) {
                        this.method3657(index, index + 1);
                        return true;
                    }
                }
            }
        }
        this.field3622.method3950(this);
        if (Class8349.method27837() - this.field3628 < 250L) {
            this.field3622.method3948();
        }
        this.field3628 = Class8349.method27837();
        return false;
    }
    
    public Class9575 method3658() {
        return this.field3624;
    }
}
