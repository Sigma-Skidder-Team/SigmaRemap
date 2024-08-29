package mapped;

public enum ResourcePackType {
   CLIENT_RESOURCES("assets"),
   field12611("data");

   private final String field12612;
   private static final ResourcePackType[] field12613 = new ResourcePackType[]{CLIENT_RESOURCES, field12611};

   private ResourcePackType(String var3) {
      this.field12612 = var3;
   }

   public String method8205() {
      return this.field12612;
   }
}
