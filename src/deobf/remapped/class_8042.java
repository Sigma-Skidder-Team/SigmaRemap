package remapped;

public class class_8042 {
   private static String[] field_41196;
   private final class_9633 field_41197;
   private static final class_8042 field_41195 = new class_8042();

   public static class_8042 method_36499() {
      RenderSystem.assertThread(RenderSystem::method_16363);
      return field_41195;
   }

   public class_8042(int var1) {
      this.field_41197 = new class_9633(var1);
   }

   public class_8042() {
      this(2097152);
   }

   public void method_36500() {
      if (this.field_41197.field_49059 != null) {
         class_153.method_614(this.field_41197.field_49059);
      }

      this.field_41197.method_44487();
      class_138.method_554(this.field_41197);
   }

   public class_9633 method_36501() {
      return this.field_41197;
   }
}
