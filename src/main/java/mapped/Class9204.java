package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class Class9204 {
   public static final Comparator<String> field42270 = new Class3577();
   private static final Map<String, Class9204> field42271 = new TreeMap<String, Class9204>(field42270);
   public static final Class9204 field42272 = method34493("SSL_RSA_WITH_NULL_MD5", 1);
   public static final Class9204 field42273 = method34493("SSL_RSA_WITH_NULL_SHA", 2);
   public static final Class9204 field42274 = method34493("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
   public static final Class9204 field42275 = method34493("SSL_RSA_WITH_RC4_128_MD5", 4);
   public static final Class9204 field42276 = method34493("SSL_RSA_WITH_RC4_128_SHA", 5);
   public static final Class9204 field42277 = method34493("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
   public static final Class9204 field42278 = method34493("SSL_RSA_WITH_DES_CBC_SHA", 9);
   public static final Class9204 field42279 = method34493("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
   public static final Class9204 field42280 = method34493("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
   public static final Class9204 field42281 = method34493("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
   public static final Class9204 field42282 = method34493("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
   public static final Class9204 field42283 = method34493("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
   public static final Class9204 field42284 = method34493("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
   public static final Class9204 field42285 = method34493("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
   public static final Class9204 field42286 = method34493("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
   public static final Class9204 field42287 = method34493("SSL_DH_anon_WITH_RC4_128_MD5", 24);
   public static final Class9204 field42288 = method34493("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
   public static final Class9204 field42289 = method34493("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
   public static final Class9204 field42290 = method34493("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
   public static final Class9204 field42291 = method34493("TLS_KRB5_WITH_DES_CBC_SHA", 30);
   public static final Class9204 field42292 = method34493("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
   public static final Class9204 field42293 = method34493("TLS_KRB5_WITH_RC4_128_SHA", 32);
   public static final Class9204 field42294 = method34493("TLS_KRB5_WITH_DES_CBC_MD5", 34);
   public static final Class9204 field42295 = method34493("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
   public static final Class9204 field42296 = method34493("TLS_KRB5_WITH_RC4_128_MD5", 36);
   public static final Class9204 field42297 = method34493("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
   public static final Class9204 field42298 = method34493("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
   public static final Class9204 field42299 = method34493("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
   public static final Class9204 field42300 = method34493("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
   public static final Class9204 field42301 = method34493("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
   public static final Class9204 field42302 = method34493("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
   public static final Class9204 field42303 = method34493("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
   public static final Class9204 field42304 = method34493("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
   public static final Class9204 field42305 = method34493("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
   public static final Class9204 field42306 = method34493("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
   public static final Class9204 field42307 = method34493("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
   public static final Class9204 field42308 = method34493("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
   public static final Class9204 field42309 = method34493("TLS_RSA_WITH_NULL_SHA256", 59);
   public static final Class9204 field42310 = method34493("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
   public static final Class9204 field42311 = method34493("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
   public static final Class9204 field42312 = method34493("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
   public static final Class9204 field42313 = method34493("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
   public static final Class9204 field42314 = method34493("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
   public static final Class9204 field42315 = method34493("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
   public static final Class9204 field42316 = method34493("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
   public static final Class9204 field42317 = method34493("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
   public static final Class9204 field42318 = method34493("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
   public static final Class9204 field42319 = method34493("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
   public static final Class9204 field42320 = method34493("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
   public static final Class9204 field42321 = method34493("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
   public static final Class9204 field42322 = method34493("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
   public static final Class9204 field42323 = method34493("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
   public static final Class9204 field42324 = method34493("TLS_PSK_WITH_RC4_128_SHA", 138);
   public static final Class9204 field42325 = method34493("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
   public static final Class9204 field42326 = method34493("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
   public static final Class9204 field42327 = method34493("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
   public static final Class9204 field42328 = method34493("TLS_RSA_WITH_SEED_CBC_SHA", 150);
   public static final Class9204 field42329 = method34493("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
   public static final Class9204 field42330 = method34493("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
   public static final Class9204 field42331 = method34493("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
   public static final Class9204 field42332 = method34493("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
   public static final Class9204 field42333 = method34493("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
   public static final Class9204 field42334 = method34493("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
   public static final Class9204 field42335 = method34493("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
   public static final Class9204 field42336 = method34493("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
   public static final Class9204 field42337 = method34493("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
   public static final Class9204 field42338 = method34493("TLS_FALLBACK_SCSV", 22016);
   public static final Class9204 field42339 = method34493("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
   public static final Class9204 field42340 = method34493("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
   public static final Class9204 field42341 = method34493("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
   public static final Class9204 field42342 = method34493("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
   public static final Class9204 field42343 = method34493("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
   public static final Class9204 field42344 = method34493("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
   public static final Class9204 field42345 = method34493("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
   public static final Class9204 field42346 = method34493("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
   public static final Class9204 field42347 = method34493("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
   public static final Class9204 field42348 = method34493("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
   public static final Class9204 field42349 = method34493("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
   public static final Class9204 field42350 = method34493("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
   public static final Class9204 field42351 = method34493("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
   public static final Class9204 field42352 = method34493("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
   public static final Class9204 field42353 = method34493("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
   public static final Class9204 field42354 = method34493("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
   public static final Class9204 field42355 = method34493("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
   public static final Class9204 field42356 = method34493("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
   public static final Class9204 field42357 = method34493("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
   public static final Class9204 field42358 = method34493("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
   public static final Class9204 field42359 = method34493("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
   public static final Class9204 field42360 = method34493("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
   public static final Class9204 field42361 = method34493("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
   public static final Class9204 field42362 = method34493("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
   public static final Class9204 field42363 = method34493("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
   public static final Class9204 field42364 = method34493("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
   public static final Class9204 field42365 = method34493("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
   public static final Class9204 field42366 = method34493("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
   public static final Class9204 field42367 = method34493("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
   public static final Class9204 field42368 = method34493("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
   public static final Class9204 field42369 = method34493("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
   public static final Class9204 field42370 = method34493("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
   public static final Class9204 field42371 = method34493("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
   public static final Class9204 field42372 = method34493("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
   public static final Class9204 field42373 = method34493("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
   public static final Class9204 field42374 = method34493("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
   public static final Class9204 field42375 = method34493("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
   public static final Class9204 field42376 = method34493("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
   public static final Class9204 field42377 = method34493("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
   public static final Class9204 field42378 = method34493("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
   public static final Class9204 field42379 = method34493("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
   public static final Class9204 field42380 = method34493("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
   public static final Class9204 field42381 = method34493("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
   public static final Class9204 field42382 = method34493("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
   public static final Class9204 field42383 = method34493("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
   public final String field42384;

   public static synchronized Class9204 method34491(String var0) {
      Class9204 var3 = field42271.get(var0);
      if (var3 == null) {
         var3 = new Class9204(var0);
         field42271.put(var0, var3);
      }

      return var3;
   }

   public static List<Class9204> method34492(String... var0) {
      ArrayList var3 = new ArrayList(var0.length);

      for (String var7 : var0) {
         var3.add(method34491(var7));
      }

      return Collections.<Class9204>unmodifiableList(var3);
   }

   private Class9204(String var1) {
      if (var1 != null) {
         this.field42384 = var1;
      } else {
         throw new NullPointerException();
      }
   }

   private static Class9204 method34493(String var0, int var1) {
      return method34491(var0);
   }

   public String method34494() {
      return this.field42384;
   }

   @Override
   public String toString() {
      return this.field42384;
   }
}
