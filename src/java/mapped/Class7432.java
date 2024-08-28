package mapped;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class7432 {
   private static String[] field31978;
   private String field31979 = null;
   private int field31980 = 0;
   private Proxy field31981 = Proxy.NO_PROXY;
   private String field31982 = null;
   private String field31983 = null;
   private String field31984 = null;
   private Map<String, String> field31985 = new LinkedHashMap<String, String>();
   private byte[] field31986 = null;
   private int field31987 = 0;
   public static final String field31988 = "GET";
   public static final String field31989 = "HEAD";
   public static final String field31990 = "POST";
   public static final String field31991 = "HTTP/1.0";
   public static final String field31992 = "HTTP/1.1";

   public Class7432(String var1, int var2, Proxy var3, String var4, String var5, String var6, Map<String, String> var7, byte[] var8) {
      this.field31979 = var1;
      this.field31980 = var2;
      this.field31981 = var3;
      this.field31982 = var4;
      this.field31983 = var5;
      this.field31984 = var6;
      this.field31985 = var7;
      this.field31986 = var8;
   }

   public String method23995() {
      return this.field31979;
   }

   public int method23996() {
      return this.field31980;
   }

   public String method23997() {
      return this.field31982;
   }

   public String method23998() {
      return this.field31983;
   }

   public String method23999() {
      return this.field31984;
   }

   public Map<String, String> method24000() {
      return this.field31985;
   }

   public byte[] method24001() {
      return this.field31986;
   }

   public int method24002() {
      return this.field31987;
   }

   public void method24003(int var1) {
      this.field31987 = var1;
   }

   public Proxy method24004() {
      return this.field31981;
   }
}
