package remapped;

import java.io.IOException;

public class class_6197 implements class_6310<class_392> {
   public static final class_4639 field_31656 = new class_4639("brand");
   public static final class_4639 field_31651 = new class_4639("debug/path");
   public static final class_4639 field_31652 = new class_4639("debug/neighbors_update");
   public static final class_4639 field_31654 = new class_4639("debug/caves");
   public static final class_4639 field_31655 = new class_4639("debug/structures");
   public static final class_4639 field_31639 = new class_4639("debug/worldgen_attempt");
   public static final class_4639 field_31649 = new class_4639("debug/poi_ticket_count");
   public static final class_4639 field_31646 = new class_4639("debug/poi_added");
   public static final class_4639 field_31642 = new class_4639("debug/poi_removed");
   public static final class_4639 field_31645 = new class_4639("debug/village_sections");
   public static final class_4639 field_31647 = new class_4639("debug/goal_selector");
   public static final class_4639 field_31657 = new class_4639("debug/brain");
   public static final class_4639 field_31650 = new class_4639("debug/bee");
   public static final class_4639 field_31641 = new class_4639("debug/hive");
   public static final class_4639 field_31648 = new class_4639("debug/game_test_add_marker");
   public static final class_4639 field_31640 = new class_4639("debug/game_test_clear");
   public static final class_4639 field_31638 = new class_4639("debug/raids");
   private class_4639 field_31644;
   private class_8248 field_31643;

   public class_6197() {
   }

   public class_6197(class_4639 var1, class_8248 var2) {
      this.field_31644 = var1;
      this.field_31643 = var2;
      if (var2.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31644 = var1.method_37768();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 1048576) {
         this.field_31643 = new class_8248(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37780(this.field_31644);
      var1.writeBytes(this.field_31643.copy());
   }

   public void method_28335(class_392 var1) {
      var1.method_1915(this);
   }

   public class_4639 method_28332() {
      return this.field_31644;
   }

   public class_8248 method_28334() {
      return new class_8248(this.field_31643.copy());
   }
}
