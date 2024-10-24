package net.minecraft.client.audio;

import mapped.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;

import javax.annotation.Nullable;

public interface ISound {
   ResourceLocation method19279();

   @Nullable
   Class6648 method19280(SoundHandler var1);

   Sound method19281();

   SoundCategory method19282();

   boolean method19283();

   boolean method19291();

   int method19284();

   float method19285();

   float method19286();

   double method19287();

   double method19288();

   double method19289();

   AttenuationType method19290();

   default boolean method19274() {
      return false;
   }

   default boolean method19268() {
      return true;
   }

   enum AttenuationType {
      field14845,
      LINEAR;

      private static final AttenuationType[] field14847 = new AttenuationType[]{field14845, LINEAR};
   }
}
