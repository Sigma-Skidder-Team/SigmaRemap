package remapped;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class class_1951 {
   private static String[] field_9952;
   private String field_9950 = null;
   private int field_9945 = 0;
   private Proxy field_9948 = Proxy.NO_PROXY;
   private String field_9944 = null;
   private String field_9953 = null;
   private String field_9947 = null;
   private Map<String, String> field_9951 = new LinkedHashMap<String, String>();
   private byte[] field_9955 = null;
   private int field_9958 = 0;
   public static final String field_9957 = "GET";
   public static final String field_9956 = "HEAD";
   public static final String field_9946 = "POST";
   public static final String field_9949 = "HTTP/1.0";
   public static final String field_9954 = "HTTP/1.1";

   public class_1951(String var1, int var2, Proxy var3, String var4, String var5, String var6, Map<String, String> var7, byte[] var8) {
      this.field_9950 = var1;
      this.field_9945 = var2;
      this.field_9948 = var3;
      this.field_9944 = var4;
      this.field_9953 = var5;
      this.field_9947 = var6;
      this.field_9951 = var7;
      this.field_9955 = var8;
   }

   public String method_9020() {
      return this.field_9950;
   }

   public int method_9019() {
      return this.field_9945;
   }

   public String method_9012() {
      return this.field_9944;
   }

   public String method_9011() {
      return this.field_9953;
   }

   public String method_9021() {
      return this.field_9947;
   }

   public Map<String, String> method_9017() {
      return this.field_9951;
   }

   public byte[] method_9013() {
      return this.field_9955;
   }

   public int method_9016() {
      return this.field_9958;
   }

   public void method_9015(int var1) {
      this.field_9958 = var1;
   }

   public Proxy method_9018() {
      return this.field_9948;
   }
}
