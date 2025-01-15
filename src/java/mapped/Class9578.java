// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TreeMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

public final class Class9578
{
    public static final Comparator<String> field41624;
    private static final Map<String, Class9578> field41625;
    public static final Class9578 field41626;
    public static final Class9578 field41627;
    public static final Class9578 field41628;
    public static final Class9578 field41629;
    public static final Class9578 field41630;
    public static final Class9578 field41631;
    public static final Class9578 field41632;
    public static final Class9578 field41633;
    public static final Class9578 field41634;
    public static final Class9578 field41635;
    public static final Class9578 field41636;
    public static final Class9578 field41637;
    public static final Class9578 field41638;
    public static final Class9578 field41639;
    public static final Class9578 field41640;
    public static final Class9578 field41641;
    public static final Class9578 field41642;
    public static final Class9578 field41643;
    public static final Class9578 field41644;
    public static final Class9578 field41645;
    public static final Class9578 field41646;
    public static final Class9578 field41647;
    public static final Class9578 field41648;
    public static final Class9578 field41649;
    public static final Class9578 field41650;
    public static final Class9578 field41651;
    public static final Class9578 field41652;
    public static final Class9578 field41653;
    public static final Class9578 field41654;
    public static final Class9578 field41655;
    public static final Class9578 field41656;
    public static final Class9578 field41657;
    public static final Class9578 field41658;
    public static final Class9578 field41659;
    public static final Class9578 field41660;
    public static final Class9578 field41661;
    public static final Class9578 field41662;
    public static final Class9578 field41663;
    public static final Class9578 field41664;
    public static final Class9578 field41665;
    public static final Class9578 field41666;
    public static final Class9578 field41667;
    public static final Class9578 field41668;
    public static final Class9578 field41669;
    public static final Class9578 field41670;
    public static final Class9578 field41671;
    public static final Class9578 field41672;
    public static final Class9578 field41673;
    public static final Class9578 field41674;
    public static final Class9578 field41675;
    public static final Class9578 field41676;
    public static final Class9578 field41677;
    public static final Class9578 field41678;
    public static final Class9578 field41679;
    public static final Class9578 field41680;
    public static final Class9578 field41681;
    public static final Class9578 field41682;
    public static final Class9578 field41683;
    public static final Class9578 field41684;
    public static final Class9578 field41685;
    public static final Class9578 field41686;
    public static final Class9578 field41687;
    public static final Class9578 field41688;
    public static final Class9578 field41689;
    public static final Class9578 field41690;
    public static final Class9578 field41691;
    public static final Class9578 field41692;
    public static final Class9578 field41693;
    public static final Class9578 field41694;
    public static final Class9578 field41695;
    public static final Class9578 field41696;
    public static final Class9578 field41697;
    public static final Class9578 field41698;
    public static final Class9578 field41699;
    public static final Class9578 field41700;
    public static final Class9578 field41701;
    public static final Class9578 field41702;
    public static final Class9578 field41703;
    public static final Class9578 field41704;
    public static final Class9578 field41705;
    public static final Class9578 field41706;
    public static final Class9578 field41707;
    public static final Class9578 field41708;
    public static final Class9578 field41709;
    public static final Class9578 field41710;
    public static final Class9578 field41711;
    public static final Class9578 field41712;
    public static final Class9578 field41713;
    public static final Class9578 field41714;
    public static final Class9578 field41715;
    public static final Class9578 field41716;
    public static final Class9578 field41717;
    public static final Class9578 field41718;
    public static final Class9578 field41719;
    public static final Class9578 field41720;
    public static final Class9578 field41721;
    public static final Class9578 field41722;
    public static final Class9578 field41723;
    public static final Class9578 field41724;
    public static final Class9578 field41725;
    public static final Class9578 field41726;
    public static final Class9578 field41727;
    public static final Class9578 field41728;
    public static final Class9578 field41729;
    public static final Class9578 field41730;
    public static final Class9578 field41731;
    public static final Class9578 field41732;
    public static final Class9578 field41733;
    public static final Class9578 field41734;
    public static final Class9578 field41735;
    public static final Class9578 field41736;
    public static final Class9578 field41737;
    public final String field41738;
    
    public static synchronized Class9578 method35877(final String s) {
        Class9578 class9578 = Class9578.field41625.get(s);
        if (class9578 == null) {
            class9578 = new Class9578(s);
            Class9578.field41625.put(s, class9578);
        }
        return class9578;
    }
    
    public static List<Class9578> method35878(final String... array) {
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(method35877(array[i]));
        }
        return (List<Class9578>)Collections.unmodifiableList((List<?>)list);
    }
    
    private Class9578(final String field41738) {
        if (field41738 != null) {
            this.field41738 = field41738;
            return;
        }
        throw new NullPointerException();
    }
    
    private static Class9578 method35879(final String s, final int n) {
        return method35877(s);
    }
    
    public String method35880() {
        return this.field41738;
    }
    
    @Override
    public String toString() {
        return this.field41738;
    }
    
    static {
        field41624 = new Class4445();
        field41625 = new TreeMap<String, Class9578>(Class9578.field41624);
        field41626 = method35879("SSL_RSA_WITH_NULL_MD5", 1);
        field41627 = method35879("SSL_RSA_WITH_NULL_SHA", 2);
        field41628 = method35879("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        field41629 = method35879("SSL_RSA_WITH_RC4_128_MD5", 4);
        field41630 = method35879("SSL_RSA_WITH_RC4_128_SHA", 5);
        field41631 = method35879("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        field41632 = method35879("SSL_RSA_WITH_DES_CBC_SHA", 9);
        field41633 = method35879("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        field41634 = method35879("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        field41635 = method35879("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        field41636 = method35879("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        field41637 = method35879("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        field41638 = method35879("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        field41639 = method35879("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        field41640 = method35879("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        field41641 = method35879("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        field41642 = method35879("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        field41643 = method35879("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        field41644 = method35879("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        field41645 = method35879("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        field41646 = method35879("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        field41647 = method35879("TLS_KRB5_WITH_RC4_128_SHA", 32);
        field41648 = method35879("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        field41649 = method35879("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        field41650 = method35879("TLS_KRB5_WITH_RC4_128_MD5", 36);
        field41651 = method35879("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        field41652 = method35879("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        field41653 = method35879("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        field41654 = method35879("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        field41655 = method35879("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        field41656 = method35879("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        field41657 = method35879("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        field41658 = method35879("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        field41659 = method35879("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        field41660 = method35879("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        field41661 = method35879("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        field41662 = method35879("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        field41663 = method35879("TLS_RSA_WITH_NULL_SHA256", 59);
        field41664 = method35879("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        field41665 = method35879("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        field41666 = method35879("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        field41667 = method35879("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        field41668 = method35879("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        field41669 = method35879("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        field41670 = method35879("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        field41671 = method35879("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        field41672 = method35879("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        field41673 = method35879("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        field41674 = method35879("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        field41675 = method35879("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        field41676 = method35879("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        field41677 = method35879("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        field41678 = method35879("TLS_PSK_WITH_RC4_128_SHA", 138);
        field41679 = method35879("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        field41680 = method35879("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        field41681 = method35879("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        field41682 = method35879("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        field41683 = method35879("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        field41684 = method35879("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        field41685 = method35879("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        field41686 = method35879("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        field41687 = method35879("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        field41688 = method35879("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        field41689 = method35879("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        field41690 = method35879("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        field41691 = method35879("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        field41692 = method35879("TLS_FALLBACK_SCSV", 22016);
        field41693 = method35879("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        field41694 = method35879("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        field41695 = method35879("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        field41696 = method35879("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        field41697 = method35879("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        field41698 = method35879("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        field41699 = method35879("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        field41700 = method35879("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        field41701 = method35879("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        field41702 = method35879("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        field41703 = method35879("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        field41704 = method35879("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        field41705 = method35879("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        field41706 = method35879("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        field41707 = method35879("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        field41708 = method35879("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        field41709 = method35879("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        field41710 = method35879("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        field41711 = method35879("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        field41712 = method35879("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        field41713 = method35879("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        field41714 = method35879("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        field41715 = method35879("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        field41716 = method35879("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        field41717 = method35879("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        field41718 = method35879("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        field41719 = method35879("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        field41720 = method35879("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        field41721 = method35879("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        field41722 = method35879("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        field41723 = method35879("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        field41724 = method35879("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        field41725 = method35879("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        field41726 = method35879("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        field41727 = method35879("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        field41728 = method35879("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        field41729 = method35879("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        field41730 = method35879("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        field41731 = method35879("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        field41732 = method35879("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        field41733 = method35879("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        field41734 = method35879("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        field41735 = method35879("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        field41736 = method35879("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        field41737 = method35879("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    }
}
