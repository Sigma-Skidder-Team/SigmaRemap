package remapped;

public class class_2686 {
   private static String[] field_13161;

   public static Box method_12066(Box var0, Direction var1, double var2) {
      double var6 = var2 * (double)var1.method_1049().method_549();
      double var8 = Math.min(var6, 0.0);
      double var10 = Math.max(var6, 0.0);
      switch (var1) {
         case field_809:
            return new Box(var0.field_19941 + var8, var0.field_19937, var0.field_19938, var0.field_19941 + var10, var0.field_19939, var0.field_19942);
         case field_804:
            return new Box(var0.field_19940 + var8, var0.field_19937, var0.field_19938, var0.field_19940 + var10, var0.field_19939, var0.field_19942);
         case field_802:
            return new Box(var0.field_19941, var0.field_19937 + var8, var0.field_19938, var0.field_19940, var0.field_19937 + var10, var0.field_19942);
         case field_817:
         default:
            return new Box(var0.field_19941, var0.field_19939 + var8, var0.field_19938, var0.field_19940, var0.field_19939 + var10, var0.field_19942);
         case field_818:
            return new Box(var0.field_19941, var0.field_19937, var0.field_19938 + var8, var0.field_19940, var0.field_19939, var0.field_19938 + var10);
         case field_800:
            return new Box(var0.field_19941, var0.field_19937, var0.field_19942 + var8, var0.field_19940, var0.field_19939, var0.field_19942 + var10);
      }
   }
}
