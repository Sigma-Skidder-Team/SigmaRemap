package mapped;

public final class Class7996<S> implements Class7995<S> {
   private static String[] field34379;
   private final S field34380;
   private final S field34381;

   public Class7996(S var1, S var2) {
      this.field34380 = (S)var1;
      this.field34381 = (S)var2;
   }

   @Override
   public <T> T method27292(Class6139<? super S, T> var1) {
      return (T)var1.method19043(this.field34380, this.field34381);
   }
}
