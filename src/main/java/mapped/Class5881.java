package mapped;

public class Class5881 extends Class5876<Class5881> {
   private static String[] field25676;
   private Structure<?> field25677 = ExplorationMap.field_237425_a_;
   private MapDecorationType field25678 = ExplorationMap.field_215910_a;
   private byte field25679 = 2;
   private int field25680 = 50;
   private boolean field25681 = true;

   public Class5881 method18305() {
      return this;
   }

   public Class5881 method18313(Structure<?> var1) {
      this.field25677 = var1;
      return this;
   }

   public Class5881 method18314(MapDecorationType var1) {
      this.field25678 = var1;
      return this;
   }

   public Class5881 method18315(byte var1) {
      this.field25679 = var1;
      return this;
   }

   public Class5881 method18316(boolean var1) {
      this.field25681 = var1;
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return new ExplorationMap(this.method18306(), this.field25677, this.field25678, this.field25679, this.field25680, this.field25681);
   }
}
