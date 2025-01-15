// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class5776 extends Class5775
{
    private static String[] field23641;
    private boolean field23642;
    private boolean field23643;
    private boolean field23644;
    private boolean field23645;
    private boolean field23646;
    private boolean field23647;
    private boolean field23648;
    private boolean field23649;
    private long field23650;
    private long field23651;
    private int field23652;
    private int field23653;
    private int field23654;
    private int field23655;
    private int field23656;
    private long field23657;
    private int field23658;
    private int field23659;
    private long field23660;
    private long field23661;
    private long field23662;
    private boolean field23663;
    private int field23664;
    
    @Override
    public void method17212(final Class9131 class9131) throws IOException {
        if (class9131.method33135() != 1) {
            final int method33135 = class9131.method33135();
            this.field23642 = ((method33135 >> 7 & 0x1) == 0x1);
            this.field23643 = ((method33135 >> 6 & 0x1) == 0x1);
            this.field23644 = ((method33135 >> 5 & 0x1) == 0x1);
            this.field23645 = ((method33135 >> 4 & 0x1) == 0x1);
            this.field23646 = ((method33135 >> 3 & 0x1) == 0x1);
            this.field23647 = ((method33135 >> 2 & 0x1) == 0x1);
            this.field23648 = ((method33135 >> 1 & 0x1) == 0x1);
            this.field23649 = ((method33135 & 0x1) == 0x1);
            this.field23650 = class9131.method33137(4);
            this.field23651 = class9131.method33137(4);
            this.field23652 = class9131.method33135();
            this.field23653 = class9131.method33135();
            this.field23654 = class9131.method33135();
            final int method33136 = class9131.method33135();
            this.field23655 = (method33136 >> 4 & 0xF);
            this.field23656 = (method33136 & 0xF);
            if (this.field23649) {
                this.field23657 = class9131.method33137(4);
                this.field23658 = (int)class9131.method33137(2);
                this.field23659 = (int)class9131.method33137(2);
            }
            if (!this.field23646) {
                if (this.field23647) {
                    this.field23660 = class9131.method33137(4);
                }
                final long method33137 = class9131.method33137((int)Math.ceil(2 * this.field23652 / 8.0));
                final long n = (1 << this.field23652) - 1;
                this.field23661 = (method33137 >> this.field23652 & n);
                this.field23662 = (method33137 & n);
            }
        }
        if (this.field23663 = ((class9131.method33135() >> 7 & 0x1) == 0x1)) {
            this.field23664 = (int)class9131.method33137(2);
        }
    }
}
