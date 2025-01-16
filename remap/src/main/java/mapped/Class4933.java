// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class4933 extends Class4800
{
    public Class4832 field21128;
    public Class4832 field21129;
    public Class4909 field21130;
    public Class4909 field21131;
    public Class7861 field21132;
    private String field21133;
    
    public Class4933(final Class7971 class7971) {
        super("Alt Manager");
        this.field21132 = Client.method35173().method35198();
        this.field21133 = "§7Waiting...";
        this.method14311(false);
        final int n = 400;
        int n2 = 114;
        final int n3 = (this.method14276() - n) / 2;
        this.method14239(this.field21128 = new Class4832(this, "username", n3, n2, n, 45, Class4832.field20670, "", "New name", Class9400.field40327));
        n2 += 80;
        this.method14239(this.field21129 = new Class4832(this, "password", n3, n2, n, 45, Class4832.field20670, "", "New password", Class9400.field40327));
        n2 += 190;
        this.method14239(this.field21130 = new Class4909(this, "edit", n3, n2, n, 40, "Edit", Class265.field1281.field1292));
        n2 += 50;
        this.method14239(this.field21131 = new Class4909(this, "back", n3, n2, n, 40, "Cancel", Class265.field1281.field1292));
        this.field21129.method14477(true);
        this.field21129.method14470("*");
        this.field21130.method14260((class7972, n) -> {
            if (this.field21128.method14314().length() > 0) {
                if (!this.field21128.method14314().equals(class7971.method25888())) {
                    class7971.method25897(this.field21128.method14314());
                }
                class7971.method25894(this.field21128.method14314());
            }
            class7971.method25893(this.field21129.method14314());
            this.field21133 = "Edited!";
        });
        this.field21131.method14260((class4803, n) -> Client.method35173().method35193().method32156(new Class4936()));
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26905(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class9493.field40801);
        Class8154.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1290.field1292, 0.1f));
        Class8154.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1273.field1292, 0.95f));
        Class8154.method26890(Class9400.field40327, (float)(this.method14276() / 2), 20.0f, "Edit Alt", Class265.field1278.field1292, Class2056.field11738, Class2056.field11734);
        Class8154.method26891(Class9400.field40327, (float)(this.method14276() / 2), 40.0f, this.field21133, Class265.field1278.field1292, Class2056.field11738, Class2056.field11734, true);
        super.method14205(n);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Client.method35173().method35193().method32156(new Class4936());
        }
    }
}
