package net.minecraft.client.renderer.vertex;

import com.google.common.collect.ImmutableList;
import mapped.*;
import net.optifine.Config;

public class DefaultVertexFormats {
   public static final VertexFormatElement POSITION_3F = new VertexFormatElement(0, Class2061.field13430, Class2142.field14018, 3);
   public static final VertexFormatElement COLOR_4UB = new VertexFormatElement(0, Class2061.field13431, Class2142.field14020, 4);
   public static final VertexFormatElement TEX_2F = new VertexFormatElement(0, Class2061.field13430, Class2142.field14021, 2);
   public static final VertexFormatElement TEX_2S = new VertexFormatElement(1, Class2061.field13434, Class2142.field14021, 2);
   public static final VertexFormatElement TEX_2SB = new VertexFormatElement(2, Class2061.field13434, Class2142.field14021, 2);
   public static final VertexFormatElement NORMAL_3B = new VertexFormatElement(0, Class2061.field13432, Class2142.field14019, 3);
   public static final VertexFormatElement field43333 = new VertexFormatElement(0, Class2061.field13432, Class2142.field14022, 1);
   public static VertexFormat BLOCK = new VertexFormat(
      ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).add(TEX_2F).add(TEX_2SB).add(NORMAL_3B).add(field43333).build()
   );
   public static VertexFormat ENTITY = new VertexFormat(
      ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).add(TEX_2F).add(TEX_2S).add(TEX_2SB).add(NORMAL_3B).add(field43333).build()
   );
   private static final VertexFormat BLOCK_VANILLA = BLOCK;
   private static final VertexFormat BLOCK_SHADERS = SVertexFormat.makeExtendedFormatBlock(BLOCK_VANILLA);
   public static final int BLOCK_VANILLA_SIZE = BLOCK_VANILLA.getSize();
   public static final int BLOCK_SHADERS_SIZE = BLOCK_SHADERS.getSize();
   /** @deprecated */
   public static final VertexFormat PARTICLE_POSITION_TEX_COLOR_LMAP = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(TEX_2F).add(COLOR_4UB).add(TEX_2SB).build());
   public static final VertexFormat POSITION = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).build());
   public static final VertexFormat POSITION_COLOR = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).build());
   public static final VertexFormat POSITION_COLOR_LIGHTMAP = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).add(TEX_2SB).build());
   public static final VertexFormat POSITION_TEX = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(TEX_2F).build());
   public static final VertexFormat POSITION_COLOR_TEX = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).add(TEX_2F).build());
   /** @deprecated */
   public static final VertexFormat POSITION_TEX_COLOR = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(TEX_2F).add(COLOR_4UB).build());
   public static final VertexFormat POSITION_COLOR_TEX_LIGHTMAP = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(COLOR_4UB).add(TEX_2F).add(TEX_2SB).build());
   /** @deprecated */
   public static final VertexFormat POSITION_TEX_LIGHTMAP_COLOR = new VertexFormat(ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(TEX_2F).add(TEX_2SB).add(COLOR_4UB).build());
   /** @deprecated */
   public static final VertexFormat POSITION_TEX_COLOR_NORMAL = new VertexFormat(
      ImmutableList.<VertexFormatElement>builder().add(POSITION_3F).add(TEX_2F).add(COLOR_4UB).add(NORMAL_3B).add(field43333).build()
   );

   public static void method35343() {
      if (!Config.isShaders()) {
         BLOCK = BLOCK_VANILLA;
      } else {
         BLOCK = BLOCK_SHADERS;
      }
   }
}
