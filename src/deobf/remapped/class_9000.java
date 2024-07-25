package remapped;

public enum class_9000 {
   field_46082(0, 1, 2, 3),
   field_46077(2, 3, 0, 1),
   field_46071(3, 0, 1, 2),
   field_46080(0, 1, 2, 3),
   field_46073(3, 0, 1, 2),
   field_46079(1, 2, 3, 0);

   private final int field_46074;
   private final int field_46070;
   private final int field_46075;
   private final int field_46072;
   private static final class_9000[] field_46078 = Util.<class_9000[]>method_44659(new class_9000[6], var0 -> {
      var0[class_240.field_802.method_1050()] = field_46082;
      var0[class_240.field_817.method_1050()] = field_46077;
      var0[class_240.field_818.method_1050()] = field_46071;
      var0[class_240.field_800.method_1050()] = field_46080;
      var0[class_240.field_809.method_1050()] = field_46073;
      var0[class_240.field_804.method_1050()] = field_46079;
   });

   private class_9000(int var3, int var4, int var5, int var6) {
      this.field_46074 = var3;
      this.field_46070 = var4;
      this.field_46075 = var5;
      this.field_46072 = var6;
   }

   public static class_9000 method_41282(class_240 var0) {
      return field_46078[var0.method_1050()];
   }
}
