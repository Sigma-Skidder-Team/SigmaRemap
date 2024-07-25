package remapped;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7881 implements Packet<class_392> {
   private static String[] field_40333;
   private static final Logger field_40331 = LogManager.getLogger();
   private BlockPos field_40330;
   private class_2522 field_40332;
   public class_7500 field_40334;
   private boolean field_40335;

   public class_7881() {
   }

   public class_7881(BlockPos var1, class_2522 var2, class_7500 var3, boolean var4, String var5) {
      this.field_40330 = var1.method_6072();
      this.field_40332 = var2;
      this.field_40334 = var3;
      this.field_40335 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_40330 = var1.method_37748();
      this.field_40332 = class_6414.field_32758.method_14040(var1.method_37778());
      this.field_40334 = var1.<class_7500>method_37787(class_7500.class);
      this.field_40335 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_40330);
      var1.method_37743(class_6414.method_29285(this.field_40332));
      var1.method_37750(this.field_40334);
      var1.writeBoolean(this.field_40335);
   }

   public void method_35642(class_392 var1) {
      var1.method_1928(this);
   }

   public class_2522 method_35638() {
      return this.field_40332;
   }

   public BlockPos method_35641() {
      return this.field_40330;
   }

   public boolean method_35637() {
      return this.field_40335;
   }

   public class_7500 method_35639() {
      return this.field_40334;
   }
}
