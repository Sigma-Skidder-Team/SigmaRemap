package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class Class9071 {
   private final List<Class8557> field41508 = Lists.newArrayList();
   private final Map<Direction, List<Class8557>> field41509 = Maps.newEnumMap(Direction.class);
   private final Class6391 field41510;
   private final boolean field41511;
   private TextureAtlasSprite field41512;
   private final boolean field41513;
   private final boolean field41514;
   private final Class9264 field41515;

   public Class9071(Class7496 var1, Class6391 var2, boolean var3) {
      this(var1.method24429(), var1.method24430().method8812(), var3, var1.method24440(), var2);
   }

   private Class9071(boolean var1, boolean var2, boolean var3, Class9264 var4, Class6391 var5) {
      for (Direction var11 : Direction.values()) {
         this.field41509.put(var11, Lists.newArrayList());
      }

      this.field41510 = var5;
      this.field41511 = var1;
      this.field41513 = var2;
      this.field41514 = var3;
      this.field41515 = var4;
   }

   public Class9071 method33810(Direction var1, Class8557 var2) {
      this.field41509.get(var1).add(var2);
      return this;
   }

   public Class9071 method33811(Class8557 var1) {
      this.field41508.add(var1);
      return this;
   }

   public Class9071 method33812(TextureAtlasSprite var1) {
      this.field41512 = var1;
      return this;
   }

   public IBakedModel method33813() {
      if (this.field41512 != null) {
         return new Class7206(
            this.field41508, this.field41509, this.field41511, this.field41513, this.field41514, this.field41512, this.field41515, this.field41510
         );
      } else {
         throw new RuntimeException("Missing particle!");
      }
   }
}
