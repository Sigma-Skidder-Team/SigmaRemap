// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.PremiumModule;

import java.io.IOException;

public class Class4830 extends Class4825
{
    public Class4803 field20660;
    public Class9572 field20661;
    public Class9572 field20662;
    public Class9572 field20663;
    public Class8241 field20664;
    public Class4831 field20665;
    public int field20666;
    public final int field20667;
    public final int field20668;
    public boolean field20669;
    
    public Class4830(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int field20668, final Class8241 field20669, final int n4) {
        super(class4803, s, n, n2, n3, field20668, false);
        this.field20669 = false;
        this.field20667 = (int)(n3 * 0.8f);
        this.field20664 = field20669;
        this.field20668 = field20668;
        final Class6523 method19739 = Class6523.field25964.method19739();
        method19739.method19730(-11371052);
        method19739.method19728(-12096331);
        method19739.method19734(Class265.field1278.field1292);
        final Class6523 method19740 = Class6523.field25964.method19739();
        method19740.method19730(-3254955);
        method19740.method19728(-4700859);
        method19740.method19734(Class265.field1278.field1292);
        this.method14239(this.field20660 = new Class4922(this, "edit", n3 - this.field20667, 0, this.field20667, field20668));
        final Class4881 class4804;
        this.field20660.method14239(class4804 = new Class4881(this.field20660, "rename", 0, 0, this.field20667 / 2, field20668, method19739, "Rename"));
        final Class4881 class4805;
        this.field20660.method14239(class4805 = new Class4881(this.field20660, "remove", this.field20667 / 2, 0, this.field20667 / 2, field20668, method19740, "Delete"));
        this.field20660.method14305(false);
        this.method14239(this.field20665 = new Class4831(this, "profileName", 16, 8, this.method14276() - 60, 50, new Class6523(-892679478, -892679478, -892679478, Class265.field1273.field1292, Class2056.field11734, Class2056.field11738), field20669.field33839));
        this.field20665.method14478(false);
        this.field20665.method14317(Class9400.field40318);
        this.field20665.method14297(false);
        this.field20665.method14262((class8242, n) -> {
            if (this.field20665.method14306() && n == 257) {
                this.field20665.method14297(false);
                this.field20665.method14307(false);
                if (Client.method35173().method35189().method21556().method32705(this.field20665.method14314())) {
                    return;
                }
                field20669.field33839 = this.field20665.method14314();
                try {
                    Client.method35173().method35189().method21556().method32706();
                }
                catch (final IOException ex) {}
            }
        });
        class4804.method14317(Class9400.field40312);
        class4805.method14317(Class9400.field40312);
        class4804.method14270((class4803, class4804) -> class4803.method14277(Math.round(class4804.method14276() / 2.0f)));
        class4805.method14270((class4803, class4804) -> {
            class4803.method14273(Math.round(class4804.method14276() / 2.0f));
            class4803.method14277(Math.round(class4804.method14276() / 2.0f));
        });
        class4805.method14260((class4803, n) -> this.field20663.method35855(Class2186.field12964));
        class4804.method14260((class4803, n) -> {
            this.field20662.method35855(Class2186.field12965);
            this.field20665.method14297(true);
            this.field20665.method14471();
        });
        this.field20660.method14277(0);
        this.field20660.method14293(this.field20667);
        this.field20661 = new Class9572(100, 100, Class2186.field12965);
        this.field20662 = new Class9572(290, 290, Class2186.field12965);
        this.field20663 = new Class9572(200, 100, Class2186.field12965);
        this.method14260((class4803, n) -> {
            if (n != 1) {
                this.field20662.method35855(Class2186.field12965);
                if (this.field20662.method35858() == 0.0f) {
                    Client.method35173().method35189().method21556().method32708(this.field20664);
                    Client.method35173().method35196().method32830("switch");
                    this.method14267().method14267().method14267().method14225(() -> class4805.method14640());
                    for (final Module class4804 : Client.method35173().method35189().method21553().values()) {
                        if (!(class4804 instanceof PremiumModule)) {
                            continue;
                        }
                        if (Client.method35173().method35201().method19352()) {
                            continue;
                        }
                        class4804.method9908(false);
                    }
                }
            }
            else {
                this.field20662.method35855(Class2186.field12964);
            }
        });
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (!this.field20665.method14306() && this.field20665.method14296()) {
            this.field20665.method14297(false);
            this.field20665.method14307(false);
            this.field20664.field33839 = this.field20665.method14314();
            try {
                Client.method35173().method35189().method21556().method32706();
            }
            catch (final IOException ex) {}
        }
        this.field20661.method35855(this.method14236(n, n2) ? Class2186.field12964 : Class2186.field12965);
        if (!this.method14236(n, n2)) {
            this.field20662.method35855(Class2186.field12965);
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(float n) {
        if (this.field20663.method35858() == 1.0f) {
            if (!this.field20669) {
                this.field20669 = true;
                final Class4889 class4889 = (Class4889)this.method14267().method14267().method14267();
                Client.method35173().method35189().method21556().method32701(this.field20664);
                class4889.method14225(() -> class4890.method14640());
            }
        }
        this.method14279(Math.round((1.0f - Class8862.method31033(this.field20663.method35858(), 0.1, 0.81, 0.14, 1.0)) * this.field20668));
        n *= 1.0f - this.field20663.method35858();
        float n2 = Class8862.method31033(this.field20662.method35858(), 0.28, 1.26, 0.33, 1.04);
        if (this.field20662.method35857().equals(Class2186.field12965)) {
            n2 = Class8468.method28269(this.field20662.method35858(), 0.0f, 1.0f, 1.0f);
        }
        this.field20660.method14305(this.field20662.method35858() == 1.0f);
        this.field20660.method14277(Math.max(0, (int)(this.field20667 * n2)));
        this.field20660.method14293((int)(this.field20667 * (1.0f - n2)));
        Class8154.method26865(this);
        Class8154.method26874((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, Class6430.method19118(Class265.field1273.field1292, 0.04f * this.field20661.method35858() + ((this.method14309() && this.field20662.method35857().equals(Class2186.field12965)) ? 0.03f : 0.0f)));
        if (!this.field20665.method14306()) {
            Class8154.method26889(Class9400.field40318, this.field20478 + 20 - n2 * this.field20480, (float)(this.field20479 + 18), this.field20664.field33839, Class6430.method19118(Class265.field1273.field1292, 0.9f * n));
        }
        this.field20665.method14293(Math.round(-n2 * this.field20480));
        if (Client.method35173().method35189().method21556().method32707() == this.field20664) {
            Class8154.method26899(this.method14272() + this.method14276() - 35 - n2 * this.field20480, (float)(this.method14274() + 27), 17.0f, 13.0f, Class7853.field32198, Class6430.method19118(Class265.field1278.field1292, (1.0f - this.field20662.method35858()) * n));
        }
        super.method14205(n);
        Class8154.method26872();
    }
}
