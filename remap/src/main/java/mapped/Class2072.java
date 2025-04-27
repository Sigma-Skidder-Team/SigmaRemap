// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class2072
{
    field11855(-1), 
    field11856(1, Class2072.field11855), 
    field11857(2, Class2072.field11855), 
    field11858(8, Class2072.field11855), 
    field11859(9, Class2072.field11855), 
    field11860(10, Class2072.field11855), 
    field11861(11, Class2072.field11855), 
    field11862(12, Class2072.field11855), 
    field11863(13, Class2072.field11855), 
    field11864(14, Class2072.field11855), 
    field11865(15, Class2072.field11855), 
    field11866(17, Class2072.field11855), 
    field11867(18, Class2072.field11855), 
    field11868(19, Class2072.field11855), 
    field11869(20, Class2072.field11855), 
    field11870(21, Class2072.field11855), 
    field11871(22, Class2072.field11855), 
    field11872(24, Class2072.field11860), 
    field11873(25, Class2072.field11855), 
    field11874(26, Class2072.field11862), 
    field11875(33, Class2072.field11855), 
    field11876(-1, Class2072.field11855), 
    field11877(-1, Class2072.field11876), 
    field11878(-1, Class2072.field11877), 
    field11879(-1, Class2072.field11878), 
    field11880(-1, Class2072.field11876), 
    field11881(30, Class2072.field11876), 
    field11882(-1, Class2072.field11877), 
    field11883(34, Class2072.field11882), 
    field11884(35, Class2072.field11877), 
    field11885(36, Class2072.field11882), 
    field11886(37, Class2072.field11883), 
    field11887(-1, Class2072.field11855), 
    field11888(40, Class2072.field11887), 
    field11889(41, Class2072.field11855), 
    field11890(42, Class2072.field11887), 
    field11891(43, Class2072.field11887), 
    field11892(44, Class2072.field11887), 
    field11893(45, Class2072.field11887), 
    field11894(46, Class2072.field11887), 
    field11895(47, Class2072.field11887), 
    field11896(50, Class2072.field11877), 
    field11897(-1, Class2072.field11877), 
    field11898(51, Class2072.field11897), 
    field11899(5, Class2072.field11897), 
    field11900(6, Class2072.field11897), 
    field11901(52, Class2072.field11877), 
    field11902(53, Class2072.field11877), 
    field11903(54, Class2072.field11877), 
    field11904(23, Class2072.field11903), 
    field11905(27, Class2072.field11903), 
    field11906(55, Class2072.field11877), 
    field11907(56, Class2072.field11877), 
    field11908(57, Class2072.field11903), 
    field11909(58, Class2072.field11877), 
    field11910(59, Class2072.field11901), 
    field11911(60, Class2072.field11877), 
    field11912(61, Class2072.field11877), 
    field11913(62, Class2072.field11906), 
    field11914(63, Class2072.field11877), 
    field11915(64, Class2072.field11877), 
    field11916(65, Class2072.field11877), 
    field11917(66, Class2072.field11877), 
    field11918(67, Class2072.field11877), 
    field11919(68, Class2072.field11877), 
    field11920(4, Class2072.field11919), 
    field11921(99, Class2072.field11877), 
    field11922(69, Class2072.field11921), 
    field11923(90, Class2072.field11878), 
    field11924(91, Class2072.field11878), 
    field11925(92, Class2072.field11878), 
    field11926(93, Class2072.field11878), 
    field11927(94, Class2072.field11877), 
    field11928(95, Class2072.field11879), 
    field11929(96, Class2072.field11925), 
    field11930(97, Class2072.field11921), 
    field11931(98, Class2072.field11879), 
    field11932(105, Class2072.field11879), 
    field11933(-1, Class2072.field11878), 
    field11934(100, Class2072.field11933), 
    field11935(28, Class2072.field11933), 
    field11936(29, Class2072.field11933), 
    field11937(-1, Class2072.field11933), 
    field11938(31, Class2072.field11937), 
    field11939(32, Class2072.field11937), 
    field11940(103, Class2072.field11937), 
    field11941(101, Class2072.field11878), 
    field11942(102, Class2072.field11878), 
    field11943(120, Class2072.field11878), 
    field11944(200, Class2072.field11855), 
    field11945(-1, Class2072.field11855), 
    field11946(-1, Class2072.field11945), 
    field11947(-1, Class2072.field11855), 
    field11948(-1, Class2072.field11855), 
    field11949(-1, Class2072.field11855), 
    field11950(-1, Class2072.field11855), 
    field11951(-1, Class2072.field11855), 
    field11952(-1, Class2072.field11880), 
    field11953(-1, Class2072.field11855), 
    field11954(-1, Class2072.field11855);
    
    private static final Map<Integer, Class2072> field11955;
    private final int field11956;
    private final Class2072 field11957;
    
    Class2072(final int field11956) {
        this.field11956 = field11956;
        this.field11957 = null;
    }
    
    public static Optional<Class2072> method8162(final int i) {
        if (i != -1) {
            return (Optional<Class2072>)Optional.fromNullable((Object)Class2072.field11955.get(i));
        }
        return Optional.absent();
    }
    
    public boolean method8163(final Class2072... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (this.method8164(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method8164(final Class2072 class2072) {
        return this == class2072;
    }
    
    public boolean method8165(final Class2072 other) {
        Class2072 method8167 = this;
        while (!method8167.equals(other)) {
            method8167 = method8167.method8167();
            if (method8167 != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    Class2072(final int field11956, final Class2072 field11957) {
        this.field11956 = field11956;
        this.field11957 = field11957;
    }
    
    public int method8166() {
        return this.field11956;
    }
    
    public Class2072 method8167() {
        return this.field11957;
    }
    
    static {
        field11955 = new HashMap<Integer, Class2072>();
        for (final Class2072 class2072 : values()) {
            Class2072.field11955.put(class2072.field11956, class2072);
        }
    }
}
