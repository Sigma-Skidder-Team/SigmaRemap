package mapped;

import java.io.IOException;

public class Class5053 extends SampleEntry {
   private static String[] field23045;
   private int field23046;
   private int field23047;
   private double field23048;
   private double field23049;
   private int field23050;
   private int field23051;
   private String field23052;

   public Class5053(String var1) {
      super(var1);
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      var1.skipBytes(2L);
      var1.skipBytes(2L);
      var1.skipBytes(4L);
      var1.skipBytes(4L);
      var1.skipBytes(4L);
      this.field23046 = (int)var1.readBits(2);
      this.field23047 = (int)var1.readBits(2);
      this.field23048 = var1.method31869(16, 16);
      this.field23049 = var1.method31869(16, 16);
      var1.skipBytes(4L);
      this.field23050 = (int)var1.readBits(2);
      int var4 = var1.readInt();
      this.field23052 = var1.readString(var4);
      var1.skipBytes((long)(31 - var4));
      this.field23051 = (int)var1.readBits(2);
      var1.skipBytes(2L);
      this.method15441(var1);
   }

   public int method15457() {
      return this.field23046;
   }

   public int method15458() {
      return this.field23047;
   }

   public double method15459() {
      return this.field23048;
   }

   public double method15460() {
      return this.field23049;
   }

   public int method15461() {
      return this.field23050;
   }

   public String method15462() {
      return this.field23052;
   }

   public int method15463() {
      return this.field23051;
   }
}
