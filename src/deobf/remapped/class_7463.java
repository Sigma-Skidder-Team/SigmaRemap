package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class class_7463 {
   public static final Comparator<String> field_38076 = new class_2476();
   private static final Map<String, class_7463> field_38040 = new TreeMap<String, class_7463>(field_38076);
   public static final class_7463 field_38044 = method_33968("SSL_RSA_WITH_NULL_MD5", 1);
   public static final class_7463 field_38054 = method_33968("SSL_RSA_WITH_NULL_SHA", 2);
   public static final class_7463 field_38086 = method_33968("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
   public static final class_7463 field_38059 = method_33968("SSL_RSA_WITH_RC4_128_MD5", 4);
   public static final class_7463 field_38097 = method_33968("SSL_RSA_WITH_RC4_128_SHA", 5);
   public static final class_7463 field_38084 = method_33968("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
   public static final class_7463 field_38108 = method_33968("SSL_RSA_WITH_DES_CBC_SHA", 9);
   public static final class_7463 field_38127 = method_33968("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
   public static final class_7463 field_38067 = method_33968("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
   public static final class_7463 field_38038 = method_33968("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
   public static final class_7463 field_38035 = method_33968("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
   public static final class_7463 field_38019 = method_33968("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
   public static final class_7463 field_38130 = method_33968("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
   public static final class_7463 field_38033 = method_33968("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
   public static final class_7463 field_38051 = method_33968("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
   public static final class_7463 field_38030 = method_33968("SSL_DH_anon_WITH_RC4_128_MD5", 24);
   public static final class_7463 field_38022 = method_33968("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
   public static final class_7463 field_38111 = method_33968("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
   public static final class_7463 field_38116 = method_33968("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
   public static final class_7463 field_38083 = method_33968("TLS_KRB5_WITH_DES_CBC_SHA", 30);
   public static final class_7463 field_38115 = method_33968("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
   public static final class_7463 field_38096 = method_33968("TLS_KRB5_WITH_RC4_128_SHA", 32);
   public static final class_7463 field_38049 = method_33968("TLS_KRB5_WITH_DES_CBC_MD5", 34);
   public static final class_7463 field_38045 = method_33968("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
   public static final class_7463 field_38021 = method_33968("TLS_KRB5_WITH_RC4_128_MD5", 36);
   public static final class_7463 field_38027 = method_33968("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
   public static final class_7463 field_38070 = method_33968("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
   public static final class_7463 field_38061 = method_33968("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
   public static final class_7463 field_38041 = method_33968("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
   public static final class_7463 field_38071 = method_33968("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
   public static final class_7463 field_38117 = method_33968("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
   public static final class_7463 field_38126 = method_33968("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
   public static final class_7463 field_38112 = method_33968("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
   public static final class_7463 field_38072 = method_33968("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
   public static final class_7463 field_38066 = method_33968("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
   public static final class_7463 field_38028 = method_33968("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
   public static final class_7463 field_38100 = method_33968("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
   public static final class_7463 field_38056 = method_33968("TLS_RSA_WITH_NULL_SHA256", 59);
   public static final class_7463 field_38110 = method_33968("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
   public static final class_7463 field_38048 = method_33968("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
   public static final class_7463 field_38052 = method_33968("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
   public static final class_7463 field_38124 = method_33968("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
   public static final class_7463 field_38095 = method_33968("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
   public static final class_7463 field_38101 = method_33968("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
   public static final class_7463 field_38024 = method_33968("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
   public static final class_7463 field_38079 = method_33968("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
   public static final class_7463 field_38043 = method_33968("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
   public static final class_7463 field_38018 = method_33968("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
   public static final class_7463 field_38132 = method_33968("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
   public static final class_7463 field_38046 = method_33968("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
   public static final class_7463 field_38058 = method_33968("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
   public static final class_7463 field_38080 = method_33968("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
   public static final class_7463 field_38055 = method_33968("TLS_PSK_WITH_RC4_128_SHA", 138);
   public static final class_7463 field_38103 = method_33968("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
   public static final class_7463 field_38020 = method_33968("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
   public static final class_7463 field_38064 = method_33968("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
   public static final class_7463 field_38039 = method_33968("TLS_RSA_WITH_SEED_CBC_SHA", 150);
   public static final class_7463 field_38089 = method_33968("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
   public static final class_7463 field_38063 = method_33968("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
   public static final class_7463 field_38053 = method_33968("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
   public static final class_7463 field_38077 = method_33968("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
   public static final class_7463 field_38128 = method_33968("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
   public static final class_7463 field_38037 = method_33968("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
   public static final class_7463 field_38123 = method_33968("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
   public static final class_7463 field_38113 = method_33968("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
   public static final class_7463 field_38031 = method_33968("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
   public static final class_7463 field_38120 = method_33968("TLS_FALLBACK_SCSV", 22016);
   public static final class_7463 field_38106 = method_33968("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
   public static final class_7463 field_38050 = method_33968("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
   public static final class_7463 field_38085 = method_33968("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
   public static final class_7463 field_38034 = method_33968("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
   public static final class_7463 field_38102 = method_33968("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
   public static final class_7463 field_38073 = method_33968("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
   public static final class_7463 field_38069 = method_33968("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
   public static final class_7463 field_38062 = method_33968("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
   public static final class_7463 field_38090 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
   public static final class_7463 field_38074 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
   public static final class_7463 field_38042 = method_33968("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
   public static final class_7463 field_38131 = method_33968("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
   public static final class_7463 field_38094 = method_33968("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
   public static final class_7463 field_38078 = method_33968("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
   public static final class_7463 field_38118 = method_33968("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
   public static final class_7463 field_38068 = method_33968("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
   public static final class_7463 field_38081 = method_33968("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
   public static final class_7463 field_38091 = method_33968("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
   public static final class_7463 field_38093 = method_33968("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
   public static final class_7463 field_38099 = method_33968("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
   public static final class_7463 field_38017 = method_33968("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
   public static final class_7463 field_38023 = method_33968("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
   public static final class_7463 field_38129 = method_33968("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
   public static final class_7463 field_38122 = method_33968("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
   public static final class_7463 field_38036 = method_33968("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
   public static final class_7463 field_38121 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
   public static final class_7463 field_38092 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
   public static final class_7463 field_38060 = method_33968("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
   public static final class_7463 field_38082 = method_33968("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
   public static final class_7463 field_38088 = method_33968("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
   public static final class_7463 field_38125 = method_33968("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
   public static final class_7463 field_38119 = method_33968("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
   public static final class_7463 field_38057 = method_33968("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
   public static final class_7463 field_38107 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
   public static final class_7463 field_38098 = method_33968("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
   public static final class_7463 field_38025 = method_33968("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
   public static final class_7463 field_38105 = method_33968("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
   public static final class_7463 field_38087 = method_33968("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
   public static final class_7463 field_38075 = method_33968("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
   public static final class_7463 field_38109 = method_33968("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
   public static final class_7463 field_38047 = method_33968("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
   public static final class_7463 field_38065 = method_33968("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
   public static final class_7463 field_38032 = method_33968("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
   public static final class_7463 field_38104 = method_33968("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
   public static final class_7463 field_38026 = method_33968("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
   public final String field_38029;

   public static synchronized class_7463 method_33966(String var0) {
      class_7463 var3 = field_38040.get(var0);
      if (var3 == null) {
         var3 = new class_7463(var0);
         field_38040.put(var0, var3);
      }

      return var3;
   }

   public static List<class_7463> method_33969(String... var0) {
      ArrayList var3 = new ArrayList(var0.length);

      for (String var7 : var0) {
         var3.add(method_33966(var7));
      }

      return Collections.<class_7463>unmodifiableList(var3);
   }

   private class_7463(String var1) {
      if (var1 != null) {
         this.field_38029 = var1;
      } else {
         throw new NullPointerException();
      }
   }

   private static class_7463 method_33968(String var0, int var1) {
      return method_33966(var0);
   }

   public String method_33967() {
      return this.field_38029;
   }

   @Override
   public String toString() {
      return this.field_38029;
   }
}
