package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.gen.feature.jigsaw.JigsawOrientation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class178 implements IStringSerializable {
   field565("identity", Class2239.field14647, false, false, false),
   field566("rot_180_face_xy", Class2239.field14647, true, true, false),
   field567("rot_180_face_xz", Class2239.field14647, true, false, true),
   field568("rot_180_face_yz", Class2239.field14647, false, true, true),
   field569("rot_120_nnn", Class2239.field14650, false, false, false),
   field570("rot_120_nnp", Class2239.field14651, true, false, true),
   field571("rot_120_npn", Class2239.field14651, false, true, true),
   field572("rot_120_npp", Class2239.field14650, true, false, true),
   field573("rot_120_pnn", Class2239.field14651, true, true, false),
   field574("rot_120_pnp", Class2239.field14650, true, true, false),
   field575("rot_120_ppn", Class2239.field14650, false, true, true),
   field576("rot_120_ppp", Class2239.field14651, false, false, false),
   field577("rot_180_edge_xy_neg", Class2239.field14648, true, true, true),
   field578("rot_180_edge_xy_pos", Class2239.field14648, false, false, true),
   field579("rot_180_edge_xz_neg", Class2239.field14652, true, true, true),
   field580("rot_180_edge_xz_pos", Class2239.field14652, false, true, false),
   field581("rot_180_edge_yz_neg", Class2239.field14649, true, true, true),
   field582("rot_180_edge_yz_pos", Class2239.field14649, true, false, false),
   field583("rot_90_x_neg", Class2239.field14649, false, false, true),
   field584("rot_90_x_pos", Class2239.field14649, false, true, false),
   field585("rot_90_y_neg", Class2239.field14652, true, false, false),
   field586("rot_90_y_pos", Class2239.field14652, false, false, true),
   field587("rot_90_z_neg", Class2239.field14648, false, true, false),
   field588("rot_90_z_pos", Class2239.field14648, true, false, false),
   field589("inversion", Class2239.field14647, true, true, true),
   field590("invert_x", Class2239.field14647, true, false, false),
   field591("invert_y", Class2239.field14647, false, true, false),
   field592("invert_z", Class2239.field14647, false, false, true),
   field593("rot_60_ref_nnn", Class2239.field14651, true, true, true),
   field594("rot_60_ref_nnp", Class2239.field14650, true, false, false),
   field595("rot_60_ref_npn", Class2239.field14650, false, false, true),
   field596("rot_60_ref_npp", Class2239.field14651, false, false, true),
   field597("rot_60_ref_pnn", Class2239.field14650, false, true, false),
   field598("rot_60_ref_pnp", Class2239.field14651, true, false, false),
   field599("rot_60_ref_ppn", Class2239.field14651, false, true, false),
   field600("rot_60_ref_ppp", Class2239.field14650, true, true, true),
   field601("swap_xy", Class2239.field14648, false, false, false),
   field602("swap_yz", Class2239.field14649, false, false, false),
   field603("swap_xz", Class2239.field14652, false, false, false),
   field604("swap_neg_xy", Class2239.field14648, true, true, false),
   field605("swap_neg_yz", Class2239.field14649, false, true, true),
   field606("swap_neg_xz", Class2239.field14652, true, false, true),
   field607("rot_90_ref_x_neg", Class2239.field14649, true, false, true),
   field608("rot_90_ref_x_pos", Class2239.field14649, true, true, false),
   field609("rot_90_ref_y_neg", Class2239.field14652, true, true, false),
   field610("rot_90_ref_y_pos", Class2239.field14652, false, true, true),
   field611("rot_90_ref_z_neg", Class2239.field14648, false, true, true),
   field612("rot_90_ref_z_pos", Class2239.field14648, true, false, true);

   private final Class8967 field613;
   private final String field614;
   private Map<Direction, Direction> field615;
   private final boolean field616;
   private final boolean field617;
   private final boolean field618;
   private final Class2239 field619;
   private static final Class178[][] field620 = Util.make(new Class178[values().length][values().length], var0 -> {
      Map<Pair<Class2239, BooleanList>, Class178> var3 = Arrays.stream(values()).collect(Collectors.toMap(var0x -> Pair.of(var0x.field619, var0x.method506()), var0x -> (Class178)var0x));

      for (Class178 var7 : values()) {
         for (Class178 var11 : values()) {
            BooleanList var12 = var7.method506();
            BooleanList var13 = var11.method506();
            Class2239 var14 = var11.field619.method8985(var7.field619);
            BooleanArrayList var15 = new BooleanArrayList(3);

            for (int var16 = 0; var16 < 3; var16++) {
               var15.add(var12.getBoolean(var16) ^ var13.getBoolean(var7.field619.method8986(var16)));
            }

            var0[var7.ordinal()][var11.ordinal()] = (Class178)var3.get(Pair.of(var14, var15));
         }
      }
   });

   Class178(String var3, Class2239 var4, boolean var5, boolean var6, boolean var7) {
      this.field614 = var3;
      this.field616 = var5;
      this.field617 = var6;
      this.field618 = var7;
      this.field619 = var4;
      this.field613 = new Class8967();
      this.field613.field40499 = !var5 ? 1.0F : -1.0F;
      this.field613.field40503 = !var6 ? 1.0F : -1.0F;
      this.field613.field40507 = !var7 ? 1.0F : -1.0F;
      this.field613.method32828(var4.method8987());
   }

   private BooleanList method506() {
      return new BooleanArrayList(new boolean[]{this.field616, this.field617, this.field618});
   }

   public Class178 method507(Class178 var1) {
      return field620[this.ordinal()][var1.ordinal()];
   }

   @Override
   public String toString() {
      return this.field614;
   }

   @Override
   public String getString() {
      return this.field614;
   }

   public Direction method508(Direction var1) {
      if (this.field615 == null) {
         this.field615 = Maps.newEnumMap(Direction.class);

         for (Direction var7 : Direction.values()) {
            Direction.Axis var8 = var7.getAxis();
            Direction.AxisDirection var9 = var7.getAxisDirection();
            Direction.Axis var10 = Direction.Axis.values()[this.field619.method8986(var8.ordinal())];
            Direction.AxisDirection var11 = !this.method509(var10) ? var9 : var9.inverted();
            Direction var12 = Direction.getFacingFromAxisDirection(var10, var11);
            this.field615.put(var7, var12);
         }
      }

      return this.field615.get(var1);
   }

   public boolean method509(Direction.Axis var1) {
      switch (Class9825.field45904[var1.ordinal()]) {
         case 1:
            return this.field616;
         case 2:
            return this.field617;
         case 3:
         default:
            return this.field618;
      }
   }

   public JigsawOrientation method510(JigsawOrientation var1) {
      return JigsawOrientation.method526(this.method508(var1.method527()), this.method508(var1.method528()));
   }
}
