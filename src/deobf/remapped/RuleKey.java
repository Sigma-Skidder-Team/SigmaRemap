package remapped;

public final class RuleKey<T extends RuleValue<T>> {
   public final String gameRuleName;
   public final GameRulesCategory category;

   public RuleKey(String gameRuleName, GameRulesCategory category) {
      this.gameRuleName = gameRuleName;
      this.category = category;
   }

   @Override
   public String toString() {
      return this.gameRuleName;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof RuleKey && ((RuleKey)var1).gameRuleName.equals(this.gameRuleName);
   }

   @Override
   public int hashCode() {
      return this.gameRuleName.hashCode();
   }

   public String getName() {
      return this.gameRuleName;
   }

   public String getLocaleString() {
      return "gamerule." + this.gameRuleName;
   }

   public GameRulesCategory getCategory() {
      return this.category;
   }
}
