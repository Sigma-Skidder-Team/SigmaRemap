package remapped;

public final class class_4331 {
   public static final class_9091 field_21062 = class_9091.method_41889(":");
   public static final class_9091 field_21064 = class_9091.method_41889(":status");
   public static final class_9091 field_21060 = class_9091.method_41889(":method");
   public static final class_9091 field_21061 = class_9091.method_41889(":path");
   public static final class_9091 field_21069 = class_9091.method_41889(":scheme");
   public static final class_9091 field_21068 = class_9091.method_41889(":authority");
   public final class_9091 field_21066;
   public final class_9091 field_21065;
   public final int field_21067;

   public class_4331(String var1, String var2) {
      this(class_9091.method_41889(var1), class_9091.method_41889(var2));
   }

   public class_4331(class_9091 var1, String var2) {
      this(var1, class_9091.method_41889(var2));
   }

   public class_4331(class_9091 var1, class_9091 var2) {
      this.field_21066 = var1;
      this.field_21065 = var2;
      this.field_21067 = 32 + var1.method_41902() + var2.method_41902();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_4331)) {
         return false;
      } else {
         class_4331 var4 = (class_4331)var1;
         return this.field_21066.equals(var4.field_21066) && this.field_21065.equals(var4.field_21065);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_21066.hashCode();
      return 31 * var3 + this.field_21065.hashCode();
   }

   @Override
   public String toString() {
      return class_8515.method_39218("%s: %s", this.field_21066.method_41869(), this.field_21065.method_41869());
   }
}
