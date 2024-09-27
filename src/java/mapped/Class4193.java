package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Random;

public class Class4193 extends Class4178 {
   private static final Logger field20488 = LogManager.getLogger();
   public final Class7487 field20489;
   public BlockPos field20490;
   private final int field20491;
   public final Rotation field20492;
   private final List<Class3637> field20493 = Lists.newArrayList();
   private final TemplateManager field20494;

   public Class4193(TemplateManager var1, Class7487 var2, BlockPos var3, int var4, Rotation var5, Class9764 var6) {
      super(Class7792.field33480, 0);
      this.field20494 = var1;
      this.field20489 = var2;
      this.field20490 = var3;
      this.field20491 = var4;
      this.field20492 = var5;
      this.field20444 = var6;
   }

   public Class4193(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33480, var2);
      this.field20494 = var1;
      this.field20490 = new BlockPos(var2.getInt("PosX"), var2.getInt("PosY"), var2.getInt("PosZ"));
      this.field20491 = var2.getInt("ground_level_delta");
      this.field20489 = Class7487.field32183
         .parse(NBTDynamicOps.INSTANCE, var2.getCompound("pool_element"))
         .resultOrPartial(field20488::error)
         .orElse(Class7486.field32182);
      this.field20492 = Rotation.valueOf(var2.getString("rotation"));
      this.field20444 = this.field20489.method24375(var1, this.field20490, this.field20492);
      ListNBT var5 = var2.method131("junctions", 10);
      this.field20493.clear();
      var5.forEach(var1x -> this.field20493.add(Class3637.method12349(new Dynamic(NBTDynamicOps.INSTANCE, var1x))));
   }

   @Override
   public void method12897(CompoundNBT var1) {
      var1.putInt("PosX", this.field20490.getX());
      var1.putInt("PosY", this.field20490.getY());
      var1.putInt("PosZ", this.field20490.getZ());
      var1.putInt("ground_level_delta", this.field20491);
      Class7487.field32183
         .encodeStart(NBTDynamicOps.INSTANCE, this.field20489)
         .resultOrPartial(field20488::error)
         .ifPresent(var1x -> var1.put("pool_element", var1x));
      var1.method109("rotation", this.field20492.name());
      ListNBT var4 = new ListNBT();

      for (Class3637 var6 : this.field20493) {
         var4.add((INBT)var6.method12348(NBTDynamicOps.INSTANCE).getValue());
      }

      var1.put("junctions", var4);
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      return this.method12976(var1, var2, var3, var4, var5, var7, false);
   }

   public boolean method12976(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, BlockPos var6, boolean var7) {
      return this.field20489.method24376(this.field20494, var1, var2, var3, this.field20490, var6, this.field20492, var5, var4, var7);
   }

   @Override
   public void method12937(int var1, int var2, int var3) {
      super.method12937(var1, var2, var3);
      this.field20490 = this.field20490.method8336(var1, var2, var3);
   }

   @Override
   public Rotation method12940() {
      return this.field20492;
   }

   @Override
   public String toString() {
      return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.field20490, this.field20492, this.field20489);
   }

   public Class7487 method12977() {
      return this.field20489;
   }

   public BlockPos method12978() {
      return this.field20490;
   }

   public int method12979() {
      return this.field20491;
   }

   public void method12980(Class3637 var1) {
      this.field20493.add(var1);
   }

   public List<Class3637> method12981() {
      return this.field20493;
   }
}
