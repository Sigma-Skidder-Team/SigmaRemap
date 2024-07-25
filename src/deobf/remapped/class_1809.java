package remapped;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1809 extends class_8143 {
   private static String[] field_9202;
   private static final Logger field_9203 = LogManager.getLogger();
   public final class_4639 field_9206;
   private class_7832 field_9207;
   public class_4639 field_9205;
   public boolean field_9204;

   public class_1809(class_4639 var1) {
      this.field_9206 = var1;
   }

   @Override
   public void method_37053(class_7832 var1) throws IOException {
      this.field_9207 = var1;
      class_4150 var4 = this.method_8032(var1);
      var4.method_19266();
      class_9051 var5 = var4.method_19267();
      boolean var6;
      boolean var7;
      if (var5 == null) {
         var6 = false;
         var7 = false;
      } else {
         var6 = var5.method_41588();
         var7 = var5.method_41589();
      }

      class_5797 var8 = var4.method_19269();
      if (class_3542.method_16440()) {
         this.method_8031(var8, var6, var7);
      } else {
         class_3542.method_16474(() -> this.method_8031(var8, var6, var7));
      }
   }

   private void method_8031(class_5797 var1, boolean var2, boolean var3) {
      class_4970.method_22841(this.method_37055(), 0, var1.method_26228(), var1.method_26253());
      var1.method_26259(0, 0, 0, 0, 0, var1.method_26228(), var1.method_26253(), var2, var3, false, true);
      if (class_3111.method_14424()) {
         class_7977.method_36146(this.method_37055(), var1, var2, var3, this.field_9207, this.field_9206, this.method_37050());
      }

      if (class_5052.method_23281()) {
         class_5052.method_23283(this.field_9206, this);
      }
   }

   public class_4150 method_8032(class_7832 var1) {
      return class_4150.method_19265(var1, this.field_9206);
   }
}
