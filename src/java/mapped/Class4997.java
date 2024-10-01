package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class4997 extends Class4975 {
   private int field22929;
   private int field22930;
   private long field22931;
   private byte[] field22932;
   private byte[] field22933;
   private Map<String, String> field22934;

   public Class4997() {
      super("OMA DRM Common Header Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22929 = var1.readInt();
      this.field22930 = var1.readInt();
      this.field22931 = var1.readBits(8);
      int var4 = (int)var1.readBits(2);
      int var5 = (int)var1.readBits(2);
      int var6 = (int)var1.readBits(2);
      this.field22932 = new byte[var4];
      var1.readBytes(this.field22932);
      this.field22933 = new byte[var5];
      var1.readBytes(this.field22933);
      this.field22934 = new HashMap<String, String>();

      while (var6 > 0) {
         String var7 = new String(var1.method31868((int)this.method15430(var1), 58));
         String var8 = new String(var1.method31868((int)this.method15430(var1), 0));
         this.field22934.put(var7, var8);
         var6 -= var7.length() + var8.length() + 2;
      }

      this.method15441(var1);
   }

   public int method15344() {
      return this.field22929;
   }

   public int method15345() {
      return this.field22930;
   }

   public long method15346() {
      return this.field22931;
   }

   public byte[] method15347() {
      return this.field22932;
   }

   public byte[] method15348() {
      return this.field22933;
   }

   public Map<String, String> method15349() {
      return this.field22934;
   }
}
