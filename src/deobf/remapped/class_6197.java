package remapped;

import java.io.IOException;

public class class_6197 implements Packet<class_392> {
   public static final Identifier field_31656 = new Identifier("brand");
   public static final Identifier field_31651 = new Identifier("debug/path");
   public static final Identifier field_31652 = new Identifier("debug/neighbors_update");
   public static final Identifier field_31654 = new Identifier("debug/caves");
   public static final Identifier field_31655 = new Identifier("debug/structures");
   public static final Identifier field_31639 = new Identifier("debug/worldgen_attempt");
   public static final Identifier field_31649 = new Identifier("debug/poi_ticket_count");
   public static final Identifier field_31646 = new Identifier("debug/poi_added");
   public static final Identifier field_31642 = new Identifier("debug/poi_removed");
   public static final Identifier field_31645 = new Identifier("debug/village_sections");
   public static final Identifier field_31647 = new Identifier("debug/goal_selector");
   public static final Identifier field_31657 = new Identifier("debug/brain");
   public static final Identifier field_31650 = new Identifier("debug/bee");
   public static final Identifier field_31641 = new Identifier("debug/hive");
   public static final Identifier field_31648 = new Identifier("debug/game_test_add_marker");
   public static final Identifier field_31640 = new Identifier("debug/game_test_clear");
   public static final Identifier field_31638 = new Identifier("debug/raids");
   private Identifier field_31644;
   private class_8248 field_31643;

   public class_6197() {
   }

   public class_6197(Identifier var1, class_8248 var2) {
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

   public Identifier method_28332() {
      return this.field_31644;
   }

   public class_8248 method_28334() {
      return new class_8248(this.field_31643.copy());
   }
}
