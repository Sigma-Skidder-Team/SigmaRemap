package remapped;

public enum class_4899 {
   field_25323(Direction.field_802, false),
   field_25324(Direction.field_817, false),
   field_25317(Direction.field_818, false),
   field_25322(Direction.field_800, false),
   field_25320(Direction.field_809, false),
   field_25319(Direction.field_804, false),
   field_25321(Direction.field_802, true),
   field_25326(Direction.field_817, true),
   field_25325(Direction.field_818, true),
   field_25327(Direction.field_800, true),
   field_25328(Direction.field_809, true),
   field_25329(Direction.field_804, true);

   private final int field_25318;

   private class_4899(Direction var3, boolean var4) {
      this.field_25318 = var3.method_1050() + (!var4 ? 0 : Direction.values().length);
   }
}
