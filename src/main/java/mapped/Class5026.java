package mapped;

import java.io.IOException;

public class Class5026 extends Class5023 {
   private int field22988;
   private double field22989;
   private double field22990;
   private double field22991;
   private String field22992;
   private String field22993;
   private String field22994;

   public Class5026() {
      super("3GPP Location Information Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.method15384(var1);
      this.field22992 = var1.method31867((int)this.method15430(var1));
      this.field22988 = var1.readInt();
      this.field22989 = var1.method31869(16, 16);
      this.field22990 = var1.method31869(16, 16);
      this.field22991 = var1.method31869(16, 16);
      this.field22993 = var1.method31867((int)this.method15430(var1));
      this.field22994 = var1.method31867((int)this.method15430(var1));
   }

   public String method15390() {
      return this.field22992;
   }

   public int method15391() {
      return this.field22988;
   }

   public double method15392() {
      return this.field22989;
   }

   public double method15393() {
      return this.field22990;
   }

   public double method15394() {
      return this.field22991;
   }

   public String method15395() {
      return this.field22993;
   }

   public String method15396() {
      return this.field22994;
   }
}
