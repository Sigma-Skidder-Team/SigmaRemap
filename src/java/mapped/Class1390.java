// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1390 implements Runnable
{
    private static String[] field7655;
    public final /* synthetic */ long field7656;
    public final /* synthetic */ int field7657;
    public final /* synthetic */ long field7658;
    public final /* synthetic */ int field7659;
    public final /* synthetic */ Class17 field7660;
    public final /* synthetic */ boolean field7661;
    public final /* synthetic */ Class8983 field7662;
    
    public Class1390(final Class8983 field7662, final long field7663, final int field7664, final long field7665, final int field7666, final Class17 field7667, final boolean field7668) {
        this.field7662 = field7662;
        this.field7656 = field7663;
        this.field7657 = field7664;
        this.field7658 = field7665;
        this.field7659 = field7666;
        this.field7660 = field7667;
        this.field7661 = field7668;
    }
    
    @Override
    public void run() {
        if (this.field7656 != 0L) {
            if (this.field7657 != 1) {
                for (long field7658 = this.field7658; field7658 < Class8983.method31978(this.field7662); field7658 += this.field7659) {
                    Class8983.method31975(this.field7662).method26097(this.field7660, field7658 * Class8983.method31980(this.field7662), this.field7661);
                }
            }
            else {
                for (long field7659 = this.field7658; field7659 < Class8983.method31978(this.field7662); field7659 += this.field7659) {
                    Class8983.method31975(this.field7662).method26083(this.field7660, field7659 * Class8983.method31980(this.field7662));
                }
            }
        }
        else if (this.field7657 != -1) {
            for (long field7660 = this.field7658; field7660 < Class8983.method31978(this.field7662); field7660 += this.field7659) {
                Class8983.method31975(this.field7662).method26079(this.field7660, field7660 * Class8983.method31980(this.field7662), this.field7661);
            }
        }
        else {
            for (long field7661 = this.field7658; field7661 < Class8983.method31978(this.field7662); field7661 += this.field7659) {
                Class8983.method31975(this.field7662).method26075(this.field7660, field7661 * Class8983.method31980(this.field7662));
            }
        }
    }
}
