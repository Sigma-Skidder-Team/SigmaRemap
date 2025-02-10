package mapped;

import java.io.IOException;

public class Class5007 extends FullBox {
   public static final int field22944 = 1986618469;
   public static final int field22945 = 1936684398;
   public static final int field22946 = 1751740020;
   public static final int field22947 = 1835365473;
   public static final int field22948 = 1853189228;
   public static final int field22949 = 1868854125;
   public static final int field22950 = 1668445037;
   public static final int field22951 = 1935962989;
   public static final int field22952 = 1832350573;
   public static final int field22953 = 1868788589;
   public static final int field22954 = 1768977261;
   public static final int field22955 = 1835692909;
   private long field22956;
   private String field22957;

   public Class5007() {
      super("Handler Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      var1.skipBytes(4L);
      this.field22956 = var1.readBits(4);
      var1.readBits(4);
      var1.readBits(4);
      var1.readBits(4);
      this.field22957 = var1.method31866((int)this.method15430(var1), "UTF-8");
   }

   public long method15359() {
      return this.field22956;
   }

   public String method15360() {
      return this.field22957;
   }
}
