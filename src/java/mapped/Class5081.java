package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5081 extends Class4975 {
   private int field23133;
   private int field23134;
   private String field23135;
   private String field23136;
   private String field23137;
   private long field23138;
   private Class9301 field23139;

   public Class5081() {
      super("Item Information Entry");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      if (this.field22850 == 0 || this.field22850 == 1) {
         this.field23133 = (int)var1.readBits(2);
         this.field23134 = (int)var1.readBits(2);
         this.field23135 = var1.method31866((int)this.method15430(var1), "UTF-8");
         this.field23136 = var1.method31866((int)this.method15430(var1), "UTF-8");
         this.field23137 = var1.method31866((int)this.method15430(var1), "UTF-8");
      }

      if (this.field22850 == 1 && this.method15430(var1) > 0L) {
         this.field23138 = var1.readBits(4);
         if (this.method15430(var1) > 0L) {
            this.field23139 = Class9301.method35100((int)this.field23138);
            if (this.field23139 != null) {
               this.field23139.method35101(var1);
            }
         }
      }
   }

   public int method15531() {
      return this.field23133;
   }

   public int method15532() {
      return this.field23134;
   }

   public String method15533() {
      return this.field23135;
   }

   public String method15534() {
      return this.field23136;
   }

   public String method15535() {
      return this.field23137;
   }

   public long method15536() {
      return this.field23138;
   }

   public Class9301 method15537() {
      return this.field23139;
   }
}
