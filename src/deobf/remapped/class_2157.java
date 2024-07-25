package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_2157 extends class_7764 {
   private static String[] field_10770;
   private Packet field_10769;
   private List<Packet> field_10768 = new ArrayList<Packet>();

   public class_2157(Packet var1) {
      this.field_10769 = var1;
      this.field_10768.add(var1);
   }

   public Packet method_10047() {
      return this.field_10769;
   }

   public List<Packet> method_10048() {
      return this.field_10768;
   }

   public void method_10046(Packet var1) {
      this.field_10769 = var1;
   }
}
