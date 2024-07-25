package remapped;

public enum class_8086 {
   field_41393(false),
   field_41416(true),
   field_41401(false),
   field_41391(false),
   field_41389(true),
   field_41414(true),
   field_41412(false),
   field_41397(false),
   field_41400(true, 5393476),
   field_41410(true, 3830373),
   field_41399(true),
   field_41411(true),
   field_41395(true),
   field_41417(true),
   field_41404(true),
   field_41396(true),
   field_41413(true),
   field_41402(true),
   field_41407(true),
   field_41406(true),
   field_41418(true),
   field_41408(true),
   field_41419(true),
   field_41398(true),
   field_41403(true),
   field_41409(true),
   field_41420(true);

   private final byte field_41394 = (byte)this.ordinal();
   private final boolean field_41390;
   private final int field_41415;

   private class_8086(boolean var3) {
      this(var3, -1);
   }

   private class_8086(boolean var3, int var4) {
      this.field_41390 = var3;
      this.field_41415 = var4;
   }

   public byte method_36723() {
      return this.field_41394;
   }

   public boolean method_36719() {
      return this.field_41390;
   }

   public boolean method_36722() {
      return this.field_41415 >= 0;
   }

   public int method_36720() {
      return this.field_41415;
   }

   public static class_8086 method_36718(byte var0) {
      return values()[MathHelper.clamp(var0, 0, values().length - 1)];
   }
}
