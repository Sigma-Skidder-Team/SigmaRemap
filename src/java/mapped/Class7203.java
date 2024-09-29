package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.util.Direction;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class7203 implements IBakedModel {
   private static String[] field30917;
   private final ItemCameraTransforms field30918;
   private final Class6391 field30919;
   private final TextureAtlasSprite field30920;
   private final boolean field30921;

   public Class7203(ItemCameraTransforms var1, Class6391 var2, TextureAtlasSprite var3, boolean var4) {
      this.field30918 = var1;
      this.field30919 = var2;
      this.field30920 = var3;
      this.field30921 = var4;
   }

   @Override
   public List<Class8557> method22619(BlockState var1, Direction var2, Random var3) {
      return Collections.<Class8557>emptyList();
   }

   @Override
   public boolean method22620() {
      return false;
   }

   @Override
   public boolean method22621() {
      return true;
   }

   @Override
   public boolean method22622() {
      return this.field30921;
   }

   @Override
   public boolean method22623() {
      return true;
   }

   @Override
   public TextureAtlasSprite getParticleTexture() {
      return this.field30920;
   }

   @Override
   public ItemCameraTransforms method22625() {
      return this.field30918;
   }

   @Override
   public Class6391 method22626() {
      return this.field30919;
   }
}
