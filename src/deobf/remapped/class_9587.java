package remapped;

import java.io.IOException;

public class class_9587 extends class_6926 {
   private long field_48762;
   private long field_48760;
   private long field_48764;
   private long field_48763;
   private String field_48761;

   public class_9587() {
      super("Media Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = this.field_35590 != 1 ? 4 : 8;
      this.field_48762 = var1.method_27524(var4);
      this.field_48760 = var1.method_27524(var4);
      this.field_48764 = var1.method_27524(4);
      this.field_48763 = class_504.method_2503(var1.method_27524(var4));
      this.field_48761 = class_504.method_2502(var1.method_27524(2));
      var1.method_27527(2L);
   }

   public long method_44276() {
      return this.field_48762;
   }

   public long method_44277() {
      return this.field_48760;
   }

   public long method_44275() {
      return this.field_48764;
   }

   public long method_44279() {
      return this.field_48763;
   }

   public String method_44278() {
      return this.field_48761;
   }
}
