package remapped;

import java.io.IOException;
import java.util.List;

public class class_9860 implements Packet<class_392> {
   private static String[] field_49902;
   private int field_49901;
   private List<class_6098> field_49903;

   public class_9860() {
   }

   public class_9860(int var1, class_2831<class_6098> var2) {
      this.field_49901 = var1;
      this.field_49903 = class_2831.<class_6098>method_12872(var2.size(), class_6098.field_31203);

      for (int var5 = 0; var5 < this.field_49903.size(); var5++) {
         this.field_49903.set(var5, ((class_6098)var2.get(var5)).method_27973());
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_49901 = var1.readUnsignedByte();
      short var4 = var1.readShort();
      this.field_49903 = class_2831.<class_6098>method_12872(var4, class_6098.field_31203);

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_49903.set(var5, var1.method_37755());
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_49901);
      var1.writeShort(this.field_49903.size());

      for (class_6098 var5 : this.field_49903) {
         var1.method_37764(var5);
      }
   }

   public void method_45477(class_392 var1) {
      var1.method_1921(this);
   }

   public int method_45476() {
      return this.field_49901;
   }

   public List<class_6098> method_45478() {
      return this.field_49903;
   }
}
