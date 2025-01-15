// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1314 implements Runnable
{
    public final /* synthetic */ Class4671 field7208;
    
    public Class1314(final Class4671 field7208) {
        this.field7208 = field7208;
    }
    
    @Override
    public void run() {
        if (this.field7208.field20199.field20183[0]) {
            return;
        }
        if (Class224.field789 != Class4968.method15146(this.field7208.field20199.field20186)) {
            Class4968.method15143().fine("changing transport and sending upgrade packet");
            this.field7208.field20199.field20187[0].run();
            Class4968.method15138(this.field7208.field20199.field20186, this.field7208.field20199.field20185[0]);
            this.field7208.field20199.field20185[0].method14999(new Class8437[] { new Class8437("upgrade") });
            this.field7208.field20199.field20186.method14942("upgrade", this.field7208.field20199.field20185[0]);
            this.field7208.field20199.field20185[0] = null;
            Class4968.method15144(this.field7208.field20199.field20186, false);
            Class4968.method15147(this.field7208.field20199.field20186);
        }
    }
}
