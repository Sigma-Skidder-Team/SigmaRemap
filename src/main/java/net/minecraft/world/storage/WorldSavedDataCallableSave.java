package net.minecraft.world.storage;

public class WorldSavedDataCallableSave implements Runnable {
    private final WorldSavedData data;

   public WorldSavedDataCallableSave(WorldSavedData data) {
      this.data = data;
   }

   @Override
   public void run() {
      this.data.markDirty();
   }
}
