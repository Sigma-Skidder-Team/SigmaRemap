// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.collect.Queues;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Deque;
import java.util.Random;
import java.util.List;

public final class Class7125
{
    private final int field27766;
    private final Class7669 field27767;
    private final Class6346<?> field27768;
    private final Class1795 field27769;
    private final List<Class4473> field27770;
    private final Random field27771;
    private final Deque<Class8433> field27772;
    
    public Class7125(final ResourceLocation class1932, final int field27766, final Class7669 field27767, final Class6346<?> field27768, final Class1795 field27769, final BlockPos class1933, final List<Class4473> field27770, final Random field27771) {
        this.field27772 = Queues.newArrayDeque();
        this.field27766 = field27766;
        this.field27767 = field27767;
        this.field27768 = field27768;
        this.field27769 = field27769;
        this.field27770 = field27770;
        this.field27771 = field27771;
        final Class2052 method8144 = Class2052.method8144(field27771);
        final Class8228 method8145 = Class7323.field28316.method25554(class1932).method30673(field27771);
        final Class4521 method8146 = field27767.method24349(field27769, method8145, class1933, method8145.method27265(), method8144, method8145.method27254(field27769, class1933, method8144));
        final MutableBoundingBox method8147 = method8146.method13432();
        final int n = (method8147.maxX + method8147.minX) / 2;
        final int n2 = (method8147.maxZ + method8147.minZ) / 2;
        final int method8148 = field27768.method18883(n, n2, HeightmapType.field11521);
        method8146.method13454(0, method8148 - (method8147.minY + method8146.method13520()), 0);
        field27770.add(method8146);
        if (field27766 > 0) {
            this.field27772.addLast(new Class8433(method8146, new AtomicReference(VoxelShapes.method24494(VoxelShapes.method24489(new AxisAlignedBB(n - 80, method8148 - 80, n2 - 80, n + 80 + 1, method8148 + 80 + 1, n2 + 80 + 1)), VoxelShapes.method24489(AxisAlignedBB.toImmutable(method8147)), IBooleanFunction.ONLY_FIRST)), method8148 + 80, 0, null));
            while (!this.field27772.isEmpty()) {
                final Class8433 class1934 = this.field27772.removeFirst();
                this.method21866(Class8433.method28156(class1934), Class8433.method28157(class1934), Class8433.method28158(class1934), Class8433.method28159(class1934));
            }
        }
    }
    
    private void method21866(final Class4521 class4521, final AtomicReference<VoxelShape> atomicReference, final int n, final int n2) {
        final Class8228 method13518 = class4521.method13518();
        final BlockPos method13519 = class4521.method13519();
        final Class2052 method13520 = class4521.method13457();
        final Class261 method13521 = method13518.method27263();
        final boolean b = method13521 == Class261.field1247;
        final AtomicReference atomicReference2 = new AtomicReference();
        final MutableBoundingBox method13522 = class4521.method13432();
        final int field27294 = method13522.minY;
    Label_0087:
        while (true) {
            for (final Class9038 class4522 : method13518.method27253(this.field27769, method13519, method13520, this.field27771)) {
                final Direction class4523 = class4522.field38249.get(Class3839.field17415);
                final BlockPos field27295 = class4522.field38248;
                final BlockPos method13523 = field27295.method1149(class4523);
                final int n3 = field27295.getY() - field27294;
                int n4 = -1;
                final Class8795 method13524 = Class7323.field28316.method25554(new ResourceLocation(class4522.field38250.getString("target_pool")));
                final Class8795 method13525 = Class7323.field28316.method25554(method13524.method30672());
                if (method13524 != Class8795.field36978 && (method13524.method30676() != 0 || method13524 == Class8795.field36977)) {
                    AtomicReference<VoxelShape> atomicReference3;
                    int n5;
                    if (!method13522.isVecInside(method13523)) {
                        atomicReference3 = atomicReference;
                        n5 = n;
                    }
                    else {
                        atomicReference3 = atomicReference2;
                        n5 = field27294;
                        if (atomicReference2.get() == null) {
                            atomicReference2.set(VoxelShapes.method24489(AxisAlignedBB.toImmutable(method13522)));
                        }
                    }
                    final ArrayList arrayList = Lists.newArrayList();
                    if (n2 != this.field27766) {
                        arrayList.addAll(method13524.method30674(this.field27771));
                    }
                    arrayList.addAll(method13525.method30674(this.field27771));
                    for (final Class8228 class4524 : arrayList) {
                        if (class4524 == Class8230.field33794) {
                            break;
                        }
                        for (final Class2052 class4525 : Class2052.method8145(this.field27771)) {
                            final List<Class9038> method13526 = class4524.method27253(this.field27769, BlockPos.ZERO, class4525, this.field27771);
                            int orElse;
                            if (class4524.method27254(this.field27769, BlockPos.ZERO, class4525).getYSize() <= 16) {
                                orElse = method13526.stream().mapToInt(class4529 -> {
                                    if (class4528.method21415(class4529.field38248.method1149(class4529.field38249.get(Class3839.field17415)))) {
                                        Class7323.field28316.method25554(new ResourceLocation(class4529.field38250.getString("target_pool")));
                                        final Class8795 class4530;
                                        return Math.max(class4530.method30671(this.field27769), Class7323.field28316.method25554(class4530.method30672()).method30671(this.field27769));
                                    }
                                    else {
                                        return 0;
                                    }
                                }).max().orElse(0);
                            }
                            else {
                                orElse = 0;
                            }
                            for (final Class9038 class4526 : method13526) {
                                if (!Class3839.method11899(class4522, class4526)) {
                                    continue;
                                }
                                final BlockPos field27296 = class4526.field38248;
                                final BlockPos class4527 = new BlockPos(method13523.getX() - field27296.getX(), method13523.getY() - field27296.getY(), method13523.getZ() - field27296.getZ());
                                final MutableBoundingBox method13527 = class4524.method27254(this.field27769, class4527, class4525);
                                final int field27297 = method13527.minY;
                                final Class261 method13528 = class4524.method27263();
                                final boolean b2 = method13528 == Class261.field1247;
                                final int method13529 = field27296.getY();
                                final int n6 = n3 - method13529 + class4522.field38249.get(Class3839.field17415).getYOffset();
                                int n7;
                                if (b && b2) {
                                    n7 = field27294 + n6;
                                }
                                else {
                                    if (n4 == -1) {
                                        n4 = this.field27768.method18883(field27295.getX(), field27295.getZ(), HeightmapType.field11521);
                                    }
                                    n7 = n4 - method13529;
                                }
                                final int n8 = n7 - field27297;
                                final MutableBoundingBox method13530 = method13527.func_215127_b(0, n8, 0);
                                final BlockPos method13531 = class4527.add(0, n8, 0);
                                if (orElse > 0) {
                                    method13530.maxY = method13530.minY + Math.max(orElse + 1, method13530.maxY - method13530.minY);
                                }
                                if (VoxelShapes.method24496(atomicReference3.get(), VoxelShapes.method24489(AxisAlignedBB.toImmutable(method13530).shrink(0.25)), IBooleanFunction.ONLY_SECOND)) {
                                    continue;
                                }
                                atomicReference3.set(VoxelShapes.method24495(atomicReference3.get(), VoxelShapes.method24489(AxisAlignedBB.toImmutable(method13530)), IBooleanFunction.ONLY_FIRST));
                                final int method13532 = class4521.method13520();
                                int method13533;
                                if (!b2) {
                                    method13533 = class4524.method27265();
                                }
                                else {
                                    method13533 = method13532 - n6;
                                }
                                final Class4521 method13534 = this.field27767.method24349(this.field27769, class4524, method13531, method13533, class4525, method13530);
                                int n9;
                                if (!b) {
                                    if (!b2) {
                                        if (n4 == -1) {
                                            n4 = this.field27768.method18883(field27295.getX(), field27295.getZ(), HeightmapType.field11521);
                                        }
                                        n9 = n4 + n6 / 2;
                                    }
                                    else {
                                        n9 = n7 + method13529;
                                    }
                                }
                                else {
                                    n9 = field27294 + n3;
                                }
                                class4521.method13521(new Class9330(method13523.getX(), n9 - n3 + method13532, method13523.getZ(), n6, method13528));
                                method13534.method13521(new Class9330(field27295.getX(), n9 - method13529 + method13533, field27295.getZ(), -n6, method13521));
                                this.field27770.add(method13534);
                                if (n2 + 1 > this.field27766) {
                                    continue Label_0087;
                                }
                                this.field27772.addLast(new Class8433(method13534, atomicReference3, n5, n2 + 1, null));
                                continue Label_0087;
                            }
                        }
                    }
                }
                else {
                    Class7323.method22476().warn("Empty or none existent pool: {}", (Object)class4522.field38250.getString("target_pool"));
                }
            }
            break;
        }
    }
}
