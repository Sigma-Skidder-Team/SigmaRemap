package mapped;

public enum ChunkHolderLocationType {
   field166,
   field167,
   TICKING,
   field169;

   private static final ChunkHolderLocationType[] field170 = new ChunkHolderLocationType[]{field166, field167, TICKING, field169};

   public boolean isAtLeast(ChunkHolderLocationType var1) {
      return this.ordinal() >= var1.ordinal();
   }
}
