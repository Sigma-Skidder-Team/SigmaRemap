package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_8336 implements class_4530 {
   field_42691("identity", class_8929.field_45769, false, false, false),
   field_42706("rot_180_face_xy", class_8929.field_45769, true, true, false),
   field_42703("rot_180_face_xz", class_8929.field_45769, true, false, true),
   field_42712("rot_180_face_yz", class_8929.field_45769, false, true, true),
   field_42719("rot_120_nnn", class_8929.field_45767, false, false, false),
   field_42683("rot_120_nnp", class_8929.field_45768, true, false, true),
   field_42718("rot_120_npn", class_8929.field_45768, false, true, true),
   field_42675("rot_120_npp", class_8929.field_45767, true, false, true),
   field_42709("rot_120_pnn", class_8929.field_45768, true, true, false),
   field_42676("rot_120_pnp", class_8929.field_45767, true, true, false),
   field_42667("rot_120_ppn", class_8929.field_45767, false, true, true),
   field_42670("rot_120_ppp", class_8929.field_45768, false, false, false),
   field_42688("rot_180_edge_xy_neg", class_8929.field_45764, true, true, true),
   field_42717("rot_180_edge_xy_pos", class_8929.field_45764, false, false, true),
   field_42695("rot_180_edge_xz_neg", class_8929.field_45770, true, true, true),
   field_42715("rot_180_edge_xz_pos", class_8929.field_45770, false, true, false),
   field_42684("rot_180_edge_yz_neg", class_8929.field_45766, true, true, true),
   field_42692("rot_180_edge_yz_pos", class_8929.field_45766, true, false, false),
   field_42693("rot_90_x_neg", class_8929.field_45766, false, false, true),
   field_42682("rot_90_x_pos", class_8929.field_45766, false, true, false),
   field_42710("rot_90_y_neg", class_8929.field_45770, true, false, false),
   field_42700("rot_90_y_pos", class_8929.field_45770, false, false, true),
   field_42678("rot_90_z_neg", class_8929.field_45764, false, true, false),
   field_42672("rot_90_z_pos", class_8929.field_45764, true, false, false),
   field_42677("inversion", class_8929.field_45769, true, true, true),
   field_42708("invert_x", class_8929.field_45769, true, false, false),
   field_42721("invert_y", class_8929.field_45769, false, true, false),
   field_42701("invert_z", class_8929.field_45769, false, false, true),
   field_42720("rot_60_ref_nnn", class_8929.field_45768, true, true, true),
   field_42674("rot_60_ref_nnp", class_8929.field_45767, true, false, false),
   field_42669("rot_60_ref_npn", class_8929.field_45767, false, false, true),
   field_42681("rot_60_ref_npp", class_8929.field_45768, false, false, true),
   field_42668("rot_60_ref_pnn", class_8929.field_45767, false, true, false),
   field_42666("rot_60_ref_pnp", class_8929.field_45768, true, false, false),
   field_42699("rot_60_ref_ppn", class_8929.field_45768, false, true, false),
   field_42705("rot_60_ref_ppp", class_8929.field_45767, true, true, true),
   field_42687("swap_xy", class_8929.field_45764, false, false, false),
   field_42690("swap_yz", class_8929.field_45766, false, false, false),
   field_42711("swap_xz", class_8929.field_45770, false, false, false),
   field_42704("swap_neg_xy", class_8929.field_45764, true, true, false),
   field_42673("swap_neg_yz", class_8929.field_45766, false, true, true),
   field_42671("swap_neg_xz", class_8929.field_45770, true, false, true),
   field_42694("rot_90_ref_x_neg", class_8929.field_45766, true, false, true),
   field_42702("rot_90_ref_x_pos", class_8929.field_45766, true, true, false),
   field_42722("rot_90_ref_y_neg", class_8929.field_45770, true, true, false),
   field_42696("rot_90_ref_y_pos", class_8929.field_45770, false, true, true),
   field_42685("rot_90_ref_z_neg", class_8929.field_45764, false, true, true),
   field_42714("rot_90_ref_z_pos", class_8929.field_45764, true, false, true);

   private final class_6555 field_42689;
   private final String field_42686;
   private Map<class_240, class_240> field_42707;
   private final boolean field_42679;
   private final boolean field_42698;
   private final boolean field_42697;
   private final class_8929 field_42713;
   private static final class_8336[][] field_42716 = Util.<class_8336[][]>method_44659(
      new class_8336[values().length][values().length],
      var0 -> {
         Map var3 = Arrays.<class_8336>stream(values())
            .collect(Collectors.toMap(var0x -> Pair.of(var0x.field_42713, var0x.method_38391()), var0x -> (class_8336)var0x));

         for (class_8336 var7 : values()) {
            for (class_8336 var11 : values()) {
               BooleanList var12 = var7.method_38391();
               BooleanList var13 = var11.method_38391();
               class_8929 var14 = var11.field_42713.method_41039(var7.field_42713);
               BooleanArrayList var15 = new BooleanArrayList(3);

               for (int var16 = 0; var16 < 3; var16++) {
                  var15.add(var12.getBoolean(var16) ^ var13.getBoolean(var7.field_42713.method_41038(var16)));
               }

               var0[var7.ordinal()][var11.ordinal()] = (class_8336)var3.get(Pair.of(var14, var15));
            }
         }
      }
   );
   private static final class_8336[] field_42724 = Arrays.<class_8336>stream(values())
      .<class_8336>map(var0 -> Arrays.<class_8336>stream(values()).filter(var1 -> var0.method_38395(var1) == field_42691).findAny().get())
      .<class_8336>toArray(class_8336[]::new);

   private class_8336(String var3, class_8929 var4, boolean var5, boolean var6, boolean var7) {
      this.field_42686 = var3;
      this.field_42679 = var5;
      this.field_42698 = var6;
      this.field_42697 = var7;
      this.field_42713 = var4;
      this.field_42689 = new class_6555();
      this.field_42689.field_33414 = !var5 ? 1.0F : -1.0F;
      this.field_42689.field_33409 = !var6 ? 1.0F : -1.0F;
      this.field_42689.field_33410 = !var7 ? 1.0F : -1.0F;
      this.field_42689.method_29891(var4.method_41037());
   }

   private BooleanList method_38391() {
      return new BooleanArrayList(new boolean[]{this.field_42679, this.field_42698, this.field_42697});
   }

   public class_8336 method_38395(class_8336 var1) {
      return field_42716[this.ordinal()][var1.ordinal()];
   }

   @Override
   public String toString() {
      return this.field_42686;
   }

   @Override
   public String method_21049() {
      return this.field_42686;
   }

   public class_240 method_38393(class_240 var1) {
      if (this.field_42707 == null) {
         this.field_42707 = Maps.newEnumMap(class_240.class);

         for (class_240 var7 : class_240.values()) {
            class_9249 var8 = var7.method_1029();
            class_137 var9 = var7.method_1049();
            class_9249 var10 = class_9249.values()[this.field_42713.method_41038(var8.ordinal())];
            class_137 var11 = !this.method_38392(var10) ? var9 : var9.method_550();
            class_240 var12 = class_240.method_1055(var10, var11);
            this.field_42707.put(var7, var12);
         }
      }

      return this.field_42707.get(var1);
   }

   public boolean method_38392(class_9249 var1) {
      switch (var1) {
         case field_47215:
            return this.field_42679;
         case field_47216:
            return this.field_42698;
         case field_47219:
         default:
            return this.field_42697;
      }
   }

   public class_7660 method_38394(class_7660 var1) {
      return class_7660.method_34669(this.method_38393(var1.method_34671()), this.method_38393(var1.method_34670()));
   }
}
