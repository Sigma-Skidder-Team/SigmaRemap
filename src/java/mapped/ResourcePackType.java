package mapped;

public enum ResourcePackType {
   CLIENT_RESOURCES("assets"),
   SERVER_DATA("data");

   private final String directoryName;

    private ResourcePackType(String var3) {
      this.directoryName = var3;
   }

   public String getDirectoryName() {
      return this.directoryName;
   }
}
