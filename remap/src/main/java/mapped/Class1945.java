// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.BitSet;
import java.util.Random;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class Class1945 extends Class1944
{
    public Class1858 field10600;
    public final /* synthetic */ Class8974 field10599;
    
    public Class1945(final Class8974 class8974, final double n, final Class1858 class8975) {
        this(class8974, null, n, class8975);
    }
    
    public Class1945(final Class8974 field10599, final ChunkPos class7859, final double n, final Class1858 field10600) {
        this.field10599 = field10599;
        super(field10599, class7859, n);
        this.field10600 = field10600;
    }
    
    @Override
    public CompletableFuture<Class2033> method7894(final Class9226 class9226) {
        if (this.field10597.get()) {
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        if (!this.field10599.method31864()) {
            this.field10600 = null;
            this.field10599.method31874(false);
            this.field10597.set(true);
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        if (this.field10597.get()) {
            return CompletableFuture.completedFuture(Class2033.field11590);
        }
        final Vec3d method23456 = this.field10599.field37833.method23456();
        final float n = (float)method23456.x;
        final float n2 = (float)method23456.y;
        final float n3 = (float)method23456.z;
        final Class9006 class9227 = new Class9006();
        Class8974.method31908(this.field10599, this.method7897(n, n2, n3, class9227, class9226));
        if (!this.field10597.get()) {
            final ArrayList arrayList = Lists.newArrayList();
            Class9006.method32219(class9227).forEach(class9229 -> list.add(this.field10599.field37833.method23461(class9228.method34024(class9229), this.field10599.method31866(class9229))));
            return Util.method27853((List<? extends CompletableFuture<?>>)arrayList).handle((p1, t3) -> {
                if (t3 != null) {
                    if (!(t3 instanceof CancellationException)) {
                        if (!(t3 instanceof InterruptedException)) {
                            Minecraft.getInstance().method5238(CrashReport.makeCrashReport(t3, "Rendering chunk"));
                        }
                    }
                }
                if (!this.field10597.get()) {
                    this.field10599.field37809.set(newValue);
                    return Class2033.field11589;
                }
                else {
                    return Class2033.field11590;
                }
            });
        }
        return CompletableFuture.completedFuture(Class2033.field11590);
    }
    
    private Set<TileEntity> method7897(final float n, final float n2, final float n3, final Class9006 class9006, final Class9226 class9007) {
        final BlockPos method1153 = Class8974.method31909(this.field10599).method1153();
        final BlockPos method1154 = method1153.add(15, 15, 15);
        final Class8388 class9008 = new Class8388();
        final HashSet hashSet = Sets.newHashSet();
        this.field10600 = null;
        final MatrixStack class9009 = new MatrixStack();
        if (!Class8974.method31910(this.field10599, method1153)) {
            final Class1857 method1155 = Class8974.method31911(this.field10599, method1153);
            method1155.method6997();
            final Class6332[] array = { null };
            Class9144.method33366();
            final Random random = new Random();
            final Class1658 method1156 = Minecraft.getInstance().method5305();
            for (final BlockPos class9010 : Class384.method1154(method1153, method1154)) {
                final BlockState method1157 = method1155.getBlockState(class9010);
                method1157.getBlock();
                if (method1157.isOpaqueCube(method1155, class9010)) {
                    class9008.method27958(class9010);
                }
                if (Class7667.method24304(method1157)) {
                    final TileEntity method1158 = method1155.method7000(class9010, Class2079.field12022);
                    if (method1158 != null) {
                        this.method7898(class9006, hashSet, method1158);
                    }
                }
                final IFluidState method1159 = method1157.getFluidState();
                final Class6349 method1160 = this.method7896(class9010);
                if (!method1159.isEmpty()) {
                    final Class6332[] method1161 = Class8974.method31912(this.field10599, method1159, array);
                    for (int i = 0; i < method1161.length; ++i) {
                        final Class6332 class9011 = method1161[i];
                        if (Class7520.method23482() || Class9570.method35812(Class9570.field41356, method1159, class9011)) {
                            if (Class7520.method23484()) {
                                Class9570.method35811(Class9570.field41311, class9011);
                            }
                            final BufferBuilder method1162 = class9007.method34024(class9011);
                            method1162.method12412(class9011);
                            final Class9145 method1163 = method1162.method12414(method1157, class9010);
                            method1163.method33397(class9007);
                            method1155.method7002(method1163);
                            if (Class9006.method32219(class9006).add(class9011)) {
                                Class8974.method31913(this.field10599, method1162);
                            }
                            if (method1156.method5792(class9010, method1155, method1162, method1159)) {
                                Class9006.method32220(class9006, false);
                                Class9006.method32221(class9006).add(class9011);
                            }
                        }
                    }
                }
                if (method1157.method21710() != Class2115.field12305) {
                    final Class6332[] method1164 = Class8974.method31914(this.field10599, method1157, array);
                    for (int j = 0; j < method1164.length; ++j) {
                        final Class6332 class9012 = method1164[j];
                        if (Class7520.method23483() || Class9570.method35812(Class9570.field41355, method1157, class9012)) {
                            if (Class7520.method23484()) {
                                Class9570.method35811(Class9570.field41311, class9012);
                            }
                            final Class6332 method1165 = Class8974.method31915(this.field10599, method1155, method1157, class9010, class9012);
                            final BufferBuilder method1166 = class9007.method34024(method1165);
                            method1166.method12412(method1165);
                            final Class9145 method1167 = method1166.method12414(method1157, class9010);
                            method1167.method33397(class9007);
                            method1155.method7002(method1167);
                            if (Class9006.method32219(class9006).add(method1165)) {
                                Class8974.method31913(this.field10599, method1166);
                            }
                            class9009.method22567();
                            class9009.method22564(class9010.getX() & 0xF, class9010.getY() & 0xF, class9010.getZ() & 0xF);
                            if (method1156.method5791(method1157, class9010, method1155, class9009, method1166, true, random, method1160)) {
                                Class9006.method32220(class9006, false);
                                Class9006.method32221(class9006).add(method1165);
                                if (method1167.method33399()) {
                                    Class8974.method31916(this.field10599, class9007, class9006);
                                    method1167.method33400(false);
                                }
                            }
                            class9009.method22568();
                        }
                    }
                }
                if (!Class7520.method23484()) {
                    continue;
                }
                Class9570.method35811(Class9570.field41311, (Object[])null);
            }
            if (Class9006.method32221(class9006).contains(Class6332.method18765())) {
                final BufferBuilder method1168 = class9007.method34024(Class6332.method18765());
                method1168.method12385(n - method1153.getX(), n2 - method1153.getY(), n3 - method1153.getZ());
                Class9006.method32222(class9006, method1168.method12387());
            }
            Class9006.method32219(class9006).stream().map(class9007::method34024).forEach(BufferBuilder::finishDrawing);
            final Class6332[] field29141 = Class7520.field29141;
            for (int length = field29141.length, k = 0; k < length; ++k) {
                class9006.method32211(field29141[k], null);
            }
            for (final Class6332 class9013 : Class9006.method32219(class9006)) {
                if (Config.method28955()) {
                    Class8900.method31347(class9007.method34024(class9013));
                }
                final BufferBuilder method1169 = class9007.method34024(class9013);
                if (method1169.field18497 == null) {
                    continue;
                }
                if (method1169.field18497.isEmpty()) {
                    continue;
                }
                class9006.method32211(class9013, (BitSet)method1169.field18497.clone());
            }
            method1155.method6998();
            Class9144.method33367();
        }
        Class9006.method32223(class9006, class9008.method27961());
        return hashSet;
    }
    
    private <E extends TileEntity> void method7898(final Class9006 class9006, final Set<TileEntity> set, final E e) {
        final Class4158<E> method35724 = Class9550.field41126.method35724(e);
        if (method35724 != null) {
            if (!method35724.method12455(e)) {
                Class9006.method32224(class9006).add(e);
            }
            else {
                set.add(e);
            }
        }
    }
    
    @Override
    public void method7895() {
        this.field10600 = null;
        if (this.field10597.compareAndSet(false, true)) {
            this.field10599.method31874(false);
        }
    }
}
