package mapped;

import java.io.IOException;

public class Class4977 extends FullBox {
   private int field22852;
   private int field22853;
   private int field22854;
   private int field22855;
   private int field22856;
   private int field22857;
   private int field22858;
   private String field22859;
   private int[] field22860;
   private long[] field22861;

   public Class4977() {
      super("File Partition Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22852 = (int)var1.readBits(2);
      this.field22853 = (int)var1.readBits(2);
      var1.skipBytes(1L);
      this.field22854 = var1.readInt();
      this.field22855 = (int)var1.readBits(2);
      this.field22856 = (int)var1.readBits(2);
      this.field22857 = (int)var1.readBits(2);
      this.field22858 = (int)var1.readBits(2);
      this.field22859 = new String(Class8757.method31592(var1.method31868((int)this.method15430(var1), 0)));
      int var4 = (int)var1.readBits(2);
      this.field22860 = new int[var4];
      this.field22861 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22860[var5] = (int)var1.readBits(2);
         this.field22861[var5] = (long)((int)var1.readBits(4));
      }
   }

   public int method15263() {
      return this.field22852;
   }

   public int method15264() {
      return this.field22853;
   }

   public int method15265() {
      return this.field22854;
   }

   public int method15266() {
      return this.field22855;
   }

   public int method15267() {
      return this.field22856;
   }

   public int method15268() {
      return this.field22857;
   }

   public int method15269() {
      return this.field22858;
   }

   public String method15270() {
      return this.field22859;
   }

   public int[] method15271() {
      return this.field22860;
   }

   public long[] method15272() {
      return this.field22861;
   }
}
