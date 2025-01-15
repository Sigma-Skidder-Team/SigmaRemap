// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8819
{
    public static final Class8819[] field37031;
    public static final Class8819 field37032;
    public static final Class8819 field37033;
    public static final Class8819 field37034;
    public static final Class8819 field37035;
    public static final Class8819 field37036;
    public static final Class8819 field37037;
    public static final Class8819 field37038;
    public static final Class8819 field37039;
    public static final Class8819 field37040;
    public static final Class8819 field37041;
    public static final Class8819 field37042;
    public static final Class8819 field37043;
    public static final Class8819 field37044;
    public static final Class8819 field37045;
    public static final Class8819 field37046;
    public static final Class8819 field37047;
    public static final Class8819 field37048;
    public static final Class8819 field37049;
    public static final Class8819 field37050;
    public static final Class8819 field37051;
    public static final Class8819 field37052;
    public static final Class8819 field37053;
    public static final Class8819 field37054;
    public static final Class8819 field37055;
    public static final Class8819 field37056;
    public static final Class8819 field37057;
    public static final Class8819 field37058;
    public static final Class8819 field37059;
    public static final Class8819 field37060;
    public static final Class8819 field37061;
    public static final Class8819 field37062;
    public static final Class8819 field37063;
    public static final Class8819 field37064;
    public static final Class8819 field37065;
    public static final Class8819 field37066;
    public static final Class8819 field37067;
    public static final Class8819 field37068;
    public static final Class8819 field37069;
    public static final Class8819 field37070;
    public static final Class8819 field37071;
    public static final Class8819 field37072;
    public static final Class8819 field37073;
    public static final Class8819 field37074;
    public static final Class8819 field37075;
    public static final Class8819 field37076;
    public static final Class8819 field37077;
    public static final Class8819 field37078;
    public static final Class8819 field37079;
    public static final Class8819 field37080;
    public static final Class8819 field37081;
    public static final Class8819 field37082;
    public static final Class8819 field37083;
    public int field37084;
    public final int field37085;
    
    private Class8819(final int field37085, final int field37086) {
        if (field37085 >= 0 && field37085 <= 63) {
            this.field37085 = field37085;
            this.field37084 = field37086;
            Class8819.field37031[field37085] = this;
            return;
        }
        throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
    }
    
    public int method30762(final int n) {
        int n2 = 220;
        if (n == 3) {
            n2 = 135;
        }
        if (n == 2) {
            n2 = 255;
        }
        if (n == 1) {
            n2 = 220;
        }
        if (n == 0) {
            n2 = 180;
        }
        return 0xFF000000 | (this.field37084 & 0xFF) * n2 / 255 << 16 | (this.field37084 >> 8 & 0xFF) * n2 / 255 << 8 | (this.field37084 >> 16 & 0xFF) * n2 / 255;
    }
    
    static {
        field37031 = new Class8819[64];
        field37032 = new Class8819(0, 0);
        field37033 = new Class8819(1, 8368696);
        field37034 = new Class8819(2, 16247203);
        field37035 = new Class8819(3, 13092807);
        field37036 = new Class8819(4, 16711680);
        field37037 = new Class8819(5, 10526975);
        field37038 = new Class8819(6, 10987431);
        field37039 = new Class8819(7, 31744);
        field37040 = new Class8819(8, 16777215);
        field37041 = new Class8819(9, 10791096);
        field37042 = new Class8819(10, 9923917);
        field37043 = new Class8819(11, 7368816);
        field37044 = new Class8819(12, 4210943);
        field37045 = new Class8819(13, 9402184);
        field37046 = new Class8819(14, 16776437);
        field37047 = new Class8819(15, 14188339);
        field37048 = new Class8819(16, 11685080);
        field37049 = new Class8819(17, 6724056);
        field37050 = new Class8819(18, 15066419);
        field37051 = new Class8819(19, 8375321);
        field37052 = new Class8819(20, 15892389);
        field37053 = new Class8819(21, 5000268);
        field37054 = new Class8819(22, 10066329);
        field37055 = new Class8819(23, 5013401);
        field37056 = new Class8819(24, 8339378);
        field37057 = new Class8819(25, 3361970);
        field37058 = new Class8819(26, 6704179);
        field37059 = new Class8819(27, 6717235);
        field37060 = new Class8819(28, 10040115);
        field37061 = new Class8819(29, 1644825);
        field37062 = new Class8819(30, 16445005);
        field37063 = new Class8819(31, 6085589);
        field37064 = new Class8819(32, 4882687);
        field37065 = new Class8819(33, 55610);
        field37066 = new Class8819(34, 8476209);
        field37067 = new Class8819(35, 7340544);
        field37068 = new Class8819(36, 13742497);
        field37069 = new Class8819(37, 10441252);
        field37070 = new Class8819(38, 9787244);
        field37071 = new Class8819(39, 7367818);
        field37072 = new Class8819(40, 12223780);
        field37073 = new Class8819(41, 6780213);
        field37074 = new Class8819(42, 10505550);
        field37075 = new Class8819(43, 3746083);
        field37076 = new Class8819(44, 8874850);
        field37077 = new Class8819(45, 5725276);
        field37078 = new Class8819(46, 8014168);
        field37079 = new Class8819(47, 4996700);
        field37080 = new Class8819(48, 4993571);
        field37081 = new Class8819(49, 5001770);
        field37082 = new Class8819(50, 9321518);
        field37083 = new Class8819(51, 2430480);
    }
}
