package remapped;

public class WTapModule extends SecondModule {
   public WTapModule() {
      super(Category.COMBAT, "WTap", "Increase the knockback you give to players", new NormalWTap());
   }
}
