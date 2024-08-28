package mapped;

import java.io.IOException;

public class Class5035 extends Class4975 {
   private long field23007;
   private long field23008;
   private long field23009;
   private long field23010;
   private String field23011;

   public Class5035() {
      super("Media Header Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = this.field22850 != 1 ? 4 : 8;
      this.field23007 = var1.method31863(var4);
      this.field23008 = var1.method31863(var4);
      this.field23009 = var1.method31863(4);
      this.field23010 = Class6170.method19069(var1.method31863(var4));
      this.field23011 = Class6170.method19068(var1.method31863(2));
      var1.method31870(2L);
   }

   public long method15409() {
      return this.field23007;
   }

   public long method15410() {
      return this.field23008;
   }

   public long method15411() {
      return this.field23009;
   }

   public long method15412() {
      return this.field23010;
   }

   public String method15413() {
      return this.field23011;
   }
}
