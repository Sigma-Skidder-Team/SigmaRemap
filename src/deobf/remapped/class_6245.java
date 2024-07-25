package remapped;

import java.util.concurrent.TimeUnit;

public class class_6245 implements class_8119 {
   private static String[] field_31957;
   private final Object field_31955;
   private final Runnable field_31960;
   private long field_31959;
   private long field_31956;

   private class_6245(class_8692 var1, Object var2, Runnable var3) {
      this.field_31958 = var1;
      this.field_31955 = var2;
      this.field_31960 = var3;
   }

   public class_8119 鷏躚杭䄟㞈ၝ(long var1, TimeUnit var3) {
      this.field_31959 = var3.toMillis(var1);
      return this;
   }

   public class_8119 湗ࢹ殢竬햠蛊(long var1, TimeUnit var3) {
      this.field_31956 = var3.toMillis(var1);
      return this;
   }

   public class_8119 퉧髾韤뚔뚔ᢻ() {
      this.field_31959 = 0L;
      return this;
   }

   public class_8119 鏟댠亟佉浦Ⱋ() {
      this.field_31956 = 0L;
      return this;
   }

   public class_9786 츚璧괠㼜粤掬() {
      class_1471 var3 = new class_1471(this.field_31958, this.field_31955, this.field_31960, this.field_31959, this.field_31956, null);
      class_8692.method_39919(this.field_31958).put(this.field_31955, var3);
      var3.method_6801();
      return var3;
   }
}
