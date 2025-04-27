// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.datafixers.types.JsonOps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.dimension.DimensionType;

public class Class6736 extends Dimension
{
    public Class6736(final World class1847, final DimensionType class1848) {
        super(class1847, class1848, 0.0f);
    }
    
    @Override
    public DimensionType getType() {
        return DimensionType.field2223;
    }
    
    @Override
    public Class6346<? extends Class7065> method20488() {
        final Class9505 method29570 = this.field26492.method6764().method29570();
        final Class8705<Class7067, Class6347> field36578 = Class8705.field36578;
        final Class8705<Class7066, Class6348> field36579 = Class8705.field36577;
        final Class8705<Class7064, Class6344> field36580 = Class8705.field36575;
        final Class8705<Class7069, Class6342> field36581 = Class8705.field36576;
        final Class8705<Class7068, Class6345> field36582 = Class8705.field36574;
        final Class7768<Class5471, Class1869> field36583 = Class7768.field31769;
        final Class7768<Class5469, Class1871> field36584 = Class7768.field31770;
        final Class7768<Class5472, Class1872> field36585 = Class7768.field31768;
        if (method29570 == Class9505.field40893) {
            final Class7067 method29571 = Class7067.method21595((Dynamic<?>)new Dynamic(Class8453.field34721, this.field26492.method6764().method29572()));
            return field36578.method29872(this.field26492, field36583.method24875(field36583.method24876(this.field26492.method6764()).method16709(method29571.method21587())), method29571);
        }
        if (method29570 == Class9505.field40898) {
            return field36579.method29872(this.field26492, field36583.method24875(field36583.method24876(this.field26492.method6764()).method16709(Class7102.field27633)), field36579.method29874());
        }
        if (method29570 == Class9505.field40897) {
            Class1868 class1868 = null;
            final JsonObject asJsonObject = ((JsonElement)Dynamic.convert((DynamicOps)Class8453.field34721, (DynamicOps)JsonOps.INSTANCE, (Object)this.field26492.method6764().method29572())).getAsJsonObject();
            final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("biome_source");
            if (asJsonObject2 != null) {
                if (asJsonObject2.has("type")) {
                    if (asJsonObject2.has("options")) {
                        final Class7768 class1869 = Registry.field223.getOrDefault(new ResourceLocation(asJsonObject2.getAsJsonPrimitive("type").getAsString()));
                        final JsonObject asJsonObject3 = asJsonObject2.getAsJsonObject("options");
                        Class3090[] array = { Class7102.field27631 };
                        if (asJsonObject3.has("biomes")) {
                            final JsonArray asJsonArray = asJsonObject3.getAsJsonArray("biomes");
                            array = ((asJsonArray.size() <= 0) ? new Class3090[] { Class7102.field27631 } : new Class3090[asJsonArray.size()]);
                            for (int i = 0; i < asJsonArray.size(); ++i) {
                                array[i] = Registry.field217.method506(new ResourceLocation(asJsonArray.get(i).getAsString())).orElse(Class7102.field27631);
                            }
                        }
                        if (Class7768.field31769 == class1869) {
                            class1868 = field36583.method24875(field36583.method24876(this.field26492.method6764()).method16709(array[0]));
                        }
                        if (Class7768.field31768 == class1869) {
                            class1868 = field36585.method24875(field36585.method24876(this.field26492.method6764()).method16711(array).method16712(asJsonObject3.has("size") ? asJsonObject3.getAsJsonPrimitive("size").getAsInt() : 2));
                        }
                        if (Class7768.field31770 == class1869) {
                            class1868 = field36584.method24875(field36584.method24876(this.field26492.method6764()));
                        }
                    }
                }
            }
            if (class1868 == null) {
                class1868 = field36583.method24875(field36583.method24876(this.field26492.method6764()).method16709(Class7102.field27631));
            }
            BlockState class1870 = Blocks.STONE.getDefaultState();
            BlockState class1871 = Blocks.field29173.getDefaultState();
            final JsonObject asJsonObject4 = asJsonObject.getAsJsonObject("chunk_generator");
            if (asJsonObject4 != null) {
                if (asJsonObject4.has("options")) {
                    final JsonObject asJsonObject5 = asJsonObject4.getAsJsonObject("options");
                    if (asJsonObject5.has("default_block")) {
                        class1870 = Registry.BLOCK.getOrDefault(new ResourceLocation(asJsonObject5.getAsJsonPrimitive("default_block").getAsString())).getDefaultState();
                    }
                    if (asJsonObject5.has("default_fluid")) {
                        class1871 = Registry.BLOCK.getOrDefault(new ResourceLocation(asJsonObject5.getAsJsonPrimitive("default_fluid").getAsString())).getDefaultState();
                    }
                }
            }
            if (asJsonObject4 != null) {
                if (asJsonObject4.has("type")) {
                    final Class8705 class1872 = Registry.field225.getOrDefault(new ResourceLocation(asJsonObject4.getAsJsonPrimitive("type").getAsString()));
                    if (Class8705.field36575 == class1872) {
                        final Class7064 class1873 = field36580.method29874();
                        class1873.method21584(class1870);
                        class1873.method21585(class1871);
                        return field36580.method29872(this.field26492, class1868, class1873);
                    }
                    if (Class8705.field36576 == class1872) {
                        final Class7069 class1874 = field36581.method29874();
                        class1874.method21619(new BlockPos(0, 64, 0));
                        class1874.method21584(class1870);
                        class1874.method21585(class1871);
                        return field36581.method29872(this.field26492, class1868, class1874);
                    }
                }
            }
            final Class7068 class1875 = field36582.method29874();
            class1875.method21584(class1870);
            class1875.method21585(class1871);
            return field36582.method29872(this.field26492, class1868, class1875);
        }
        final Class7068 class1876 = field36582.method29874();
        return field36582.method29872(this.field26492, field36584.method24875(field36584.method24876(this.field26492.method6764()).method16705(class1876)), class1876);
    }
    
    @Nullable
    @Override
    public BlockPos method20489(final ChunkPos class7859, final boolean b) {
        for (int i = class7859.method25426(); i <= class7859.method25428(); ++i) {
            for (int j = class7859.method25427(); j <= class7859.method25429(); ++j) {
                final BlockPos method20490 = this.method20490(i, j, b);
                if (method20490 != null) {
                    return method20490;
                }
            }
        }
        return null;
    }
    
    @Nullable
    @Override
    public BlockPos method20490(final int n, final int n2, final boolean b) {
        final Mutable class385 = new Mutable(n, 0, n2);
        final BlockState method13338 = this.field26492.method6959(class385).method9872().method13338();
        if (b && !method13338.getBlock().method11785(Class7188.field27918)) {
            return null;
        }
        final Chunk method13339 = this.field26492.method6686(n >> 4, n2 >> 4);
        final int method13340 = method13339.method7018(HeightmapType.field11525, n & 0xF, n2 & 0xF);
        if (method13340 < 0) {
            return null;
        }
        if (method13339.method7018(HeightmapType.field11522, n & 0xF, n2 & 0xF) <= method13339.method7018(HeightmapType.field11524, n & 0xF, n2 & 0xF)) {
            for (int i = method13340 + 1; i >= 0; --i) {
                class385.setPos(n, i, n2);
                final BlockState method13341 = this.field26492.getBlockState(class385);
                if (!method13341.getFluidState().isEmpty()) {
                    break;
                }
                if (method13341.equals(method13338)) {
                    return class385.method1137().toImmutable();
                }
            }
            return null;
        }
        return null;
    }
    
    @Override
    public float method20491(final long n, final float n2) {
        final double method35687 = MathHelper.method35687(n / 24000.0 - 0.25);
        return (float)(method35687 * 2.0 + (0.5 - Math.cos(method35687 * 3.141592653589793) / 2.0)) / 3.0f;
    }
    
    @Override
    public boolean method20492() {
        return true;
    }
    
    @Override
    public Vec3d method20493(final float n, final float n2) {
        final float method35653 = MathHelper.clamp(MathHelper.cos(n * 6.2831855f) * 2.0f + 0.5f, 0.0f, 1.0f);
        return new Vec3d(0.7529412f * (method35653 * 0.94f + 0.06f), 0.84705883f * (method35653 * 0.94f + 0.06f), (method35653 * 0.91f + 0.09f));
    }
    
    @Override
    public boolean method20494() {
        return true;
    }
    
    @Override
    public boolean method20495(final int n, final int n2) {
        return false;
    }
}
