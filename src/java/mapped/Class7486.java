package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class7486 extends Class7487 {
   public static final Codec<Class7486> field32181 = Codec.unit(() -> Class7486.field32182);
   public static final Class7486 field32182 = new Class7486();

   private Class7486() {
      super(Class109.field366);
   }

   @Override
   public List<Class8266> method24374(TemplateManager var1, BlockPos var2, Rotation var3, Random var4) {
      return Collections.<Class8266>emptyList();
   }

   @Override
   public MutableBoundingBox method24375(TemplateManager var1, BlockPos var2, Rotation var3) {
      return MutableBoundingBox.method38386();
   }

   @Override
   public boolean method24376(
           TemplateManager var1, ISeedReader var2, StructureManager var3, ChunkGenerator var4, BlockPos var5, BlockPos var6, Rotation var7, MutableBoundingBox var8, Random var9, boolean var10
   ) {
      return true;
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35773;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
