package remapped;

public class class_2049 implements class_6798<class_2049> {
   private final class_4639 field_10363;
   private final float field_10362;
   private final float field_10365;
   private final int field_10366;
   private final class_2031 field_10370;
   private final boolean field_10368;
   private final boolean field_10367;
   private final int field_10369;

   public class_2049(String var1, float var2, float var3, int var4, class_2031 var5, boolean var6, boolean var7, int var8) {
      this.field_10363 = new class_4639(var1);
      this.field_10362 = var2;
      this.field_10365 = var3;
      this.field_10366 = var4;
      this.field_10370 = var5;
      this.field_10368 = var6;
      this.field_10367 = var7;
      this.field_10369 = var8;
   }

   public class_4639 method_9578() {
      return this.field_10363;
   }

   public class_4639 method_9577() {
      return new class_4639(this.field_10363.method_21461(), "sounds/" + this.field_10363.method_21456() + ".ogg");
   }

   public float method_9584() {
      return this.field_10362;
   }

   public float method_9583() {
      return this.field_10365;
   }

   @Override
   public int method_31144() {
      return this.field_10366;
   }

   public class_2049 method_9585() {
      return this;
   }

   @Override
   public void method_31145(class_132 var1) {
      if (this.field_10367) {
         var1.method_442(this);
      }
   }

   public class_2031 method_9579() {
      return this.field_10370;
   }

   public boolean method_9581() {
      return this.field_10368;
   }

   public boolean method_9576() {
      return this.field_10367;
   }

   public int method_9582() {
      return this.field_10369;
   }

   @Override
   public String toString() {
      return "Sound[" + this.field_10363 + "]";
   }
}
