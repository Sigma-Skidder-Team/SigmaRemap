package mapped;

public class FolderName {
   public static final FolderName field23346 = new FolderName("advancements");
   public static final FolderName field23347 = new FolderName("stats");
   public static final FolderName field23348 = new FolderName("playerdata");
   public static final FolderName field23349 = new FolderName("players");
   public static final FolderName field23350 = new FolderName("level.dat");
   public static final FolderName field23351 = new FolderName("generated");
   public static final FolderName DATAPACKS = new FolderName("datapacks");
   public static final FolderName field23353 = new FolderName("resources.zip");
   public static final FolderName field23354 = new FolderName(".");
   private final String field23355;

   private FolderName(String var1) {
      this.field23355 = var1;
   }

   public String method15910() {
      return this.field23355;
   }

   @Override
   public String toString() {
      return "/" + this.field23355;
   }
}
