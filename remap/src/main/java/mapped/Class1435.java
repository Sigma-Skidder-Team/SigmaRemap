// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1435 implements Runnable
{
    public final /* synthetic */ Class4940 field7944;
    public final /* synthetic */ Class4940 field7945;
    
    public Class1435(final Class4940 field7945, final Class4940 field7946) {
        this.field7945 = field7945;
        this.field7944 = field7946;
    }
    
    @Override
    public void run() {
        this.field7944.addToList(this.field7945.field21216 = new Class4849(this.field7944, "mods", 0, 0, Class4940.method14883(this.field7945), Class4940.method14884(this.field7945)));
        this.field7945.field21216.method14543((class4849, class4850) -> {
            if (class4850 != null) {
                class4850.method30704(this.field7945.field21213.field20877);
            }
            Class4940.method14885(this.field7945);
        });
        this.field7945.field21216.method14301(true);
    }
}
