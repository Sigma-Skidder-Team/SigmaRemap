package mapped;

import java.util.Optional;

public enum Class2299 {
   field15690("master", 0),
   field15691("music", 1),
   field15692("record", 2),
   field15693("weather", 3),
   field15694("block", 4),
   field15695("hostile", 5),
   field15696("neutral", 6),
   field15697("player", 7),
   field15698("ambient", 8),
   field15699("voice", 9);

   private final String field15700;
   private final int field15701;
   private static final Class2299[] field15702 = new Class2299[]{
      field15690, field15691, field15692, field15693, field15694, field15695, field15696, field15697, field15698, field15699
   };

   private Class2299(String var3, int var4) {
      this.field15700 = var3;
      this.field15701 = var4;
   }

   public static Optional<Class2299> method9064(String var0) {
      for (Class2299 var6 : values()) {
         if (var6.field15700.equalsIgnoreCase(var0)) {
            return Optional.<Class2299>of(var6);
         }
      }

      return Optional.<Class2299>empty();
   }

   public String method9065() {
      return this.field15700;
   }

   public int method9066() {
      return this.field15701;
   }
}
