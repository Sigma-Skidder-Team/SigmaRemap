// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4889 extends Class4841
{
    private List<Class4868> field20898;
    public final Class9572 field20899;
    public Class4817 field20900;
    public Class4898 field20901;
    private List<Class4830> field20902;
    
    public Class4889(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n - 250, n2 - 500, 250, 500, Class6523.field25964, false);
        this.field20898 = new ArrayList<Class4868>();
        this.field20902 = new ArrayList<Class4830>();
        this.field20899 = new Class9572(300, 100);
        this.method14301(true);
        this.method14311(false);
        final Class4861 class4804;
        this.method14239(class4804 = new Class4861(this, "addButton", this.field20480 - 55, 0, ClientFonts.JelloLight25.getWidth("Add"), 69, Class6523.field25964, "+", ClientFonts.JelloLight25));
        class4804.method14260((class4803, n) -> this.field20901.method14706(true));
        this.method14239(this.field20901 = new Class4898(this, "profile", 0, 69, this.field20480, 200));
        this.field20901.method14301(true);
        this.method14640();
    }
    
    public void method14635() {
        Client.method35173();
        Class9076 method21556;
        Class8241 method21557;
        int n;
        for (method21556 = Client.method35173().method35189().method21556(), method21557 = method21556.method32707(), n = 1; method21556.method32705(method21557.field33839 + " Copy " + n); ++n) {}
        method21556.method32700(method21557.method27291(method21557.field33839 + " Copy " + n));
        this.method14225(() -> this.method14640());
        this.field20901.method14706(false);
    }
    
    public void method14636(final Class8241 class8241) {
        Client.method35173();
        final Class9076 method21556 = Client.method35173().method35189().method21556();
        method21556.method32707();
        int n;
        for (n = 1; method21556.method32705(class8241.field33839 + " " + n); ++n) {}
        method21556.method32700(class8241.method27291(class8241.field33839 + " " + n));
        this.method14225(() -> this.method14640());
        this.field20901.method14706(false);
    }
    
    public void method14637() {
        Client.method35173();
        Class9076 method21556;
        int n;
        for (method21556 = Client.method35173().method35189().method21556(), n = 1; method21556.method32705("New Profile " + n); ++n) {}
        method21556.method32700(new Class8241("New Profile " + n, new Class4405()));
        this.method14225(() -> this.method14640());
        this.field20901.method14706(false);
    }
    
    public void method14638() {
        this.field20901.field20949.method35855(Class2186.field12965);
        if (this.field20899.method35857() != Class2186.field12965) {
            this.field20899.method35855(Class2186.field12965);
        }
    }
    
    public boolean method14639() {
        return this.field20899.method35857() == Class2186.field12965 && this.field20899.method35858() == 0.0f;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (n2 > this.field20901.method14281() + this.field20901.method14278()) {
            this.field20901.method14706(false);
        }
        super.method14200(n, n2);
    }
    
    public void method14640() {
        int method14392 = 0;
        if (this.field20900 != null) {
            method14392 = this.field20900.method14392();
            this.method14245(this.field20900);
        }
        this.method14239(this.field20900 = new Class4817(this, "profileScrollView", 10, 80, this.field20480 - 20, this.field20481 - 80 - 10));
        this.field20900.method14391(method14392);
        this.field20902.clear();
        int i = 0;
        final int n = 70;
        final Iterator<Class8241> iterator = Client.method35173().method35189().method21556().method32709().iterator();
        while (iterator.hasNext()) {
            final Class4830 class4830 = new Class4830(this, "profile" + i, 0, n * i, this.field20900.method14276(), n, iterator.next(), i);
            this.field20900.method14239(class4830);
            this.field20902.add(class4830);
            ++i;
        }
        ((Class4801)this.method14267()).method14209();
    }
    
    public void method14641() {
        int n = 0;
        for (final Class4830 class4830 : this.field20902) {
            class4830.method14275(n);
            n += class4830.method14278();
        }
    }
    
    @Override
    public void method14205(float method35858) {
        method35858 = this.field20899.method35858();
        this.method14641();
        float n = Class8862.method31033(method35858, 0.37, 1.48, 0.17, 0.99);
        if (this.field20899.method35857() == Class2186.field12965) {
            n = Class8862.method31033(method35858, 0.38, 0.73, 0.0, 1.0);
        }
        this.method14288(0.8f + n * 0.2f, 0.8f + n * 0.2f);
        this.method14294((int)(this.field20480 * 0.25f * (1.0f - n)));
        this.method14293((int)(this.field20480 * 0.14f * (1.0f - n)));
        super.method14227();
        super.method14228();
        final int n2 = 10;
        final int method35859 = Class6430.method19118(-723724, Class7791.method25030(method35858, 0.0f, 1.0f, 1.0f));
        Class8154.method26913((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 35.0f, method35858);
        Class8154.method26876((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20478 - n2 / 2 + this.field20480), (float)(this.field20479 - n2 / 2 + this.field20481), Class6430.method19118(Class265.field1273.field1292, method35858 * 0.25f));
        Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, (float)n2, method35859);
        float n3 = 0.9f + (1.0f - Class8862.method31033(this.field20901.field20949.method35858(), 0.0, 0.96, 0.69, 0.99)) * 0.1f;
        if (this.field20901.field20949.method35857() == Class2186.field12965) {
            n3 = 0.9f + (1.0f - Class8862.method31033(this.field20901.field20949.method35858(), 0.61, 0.01, 0.87, 0.16)) * 0.1f;
        }
        this.field20900.method14288(n3, n3);
        Class8154.method26889(ClientFonts.JelloLight25, (float)(this.field20478 + 25), (float)(this.field20479 + 20), "Profiles", Class6430.method19118(Class265.field1273.field1292, 0.8f * method35858));
        Class8154.method26876((float)(this.field20478 + 25), (float)(this.field20479 + 69), (float)(this.field20478 + this.field20480 - 25), (float)(this.field20479 + 70), Class6430.method19118(Class265.field1273.field1292, 0.05f * method35858));
        super.method14205(method35858);
    }
}
