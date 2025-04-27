// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

import java.util.Spliterator;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;

public class Class353 extends Vec3i
{
    private static String[] field2170;
    
    private Class353(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public static Class353 method1088(final int n, final int n2, final int n3) {
        return new Class353(n, n2, n3);
    }
    
    public static Class353 method1089(final BlockPos class354) {
        return new Class353(method1095(class354.getX()), method1095(class354.getY()), method1095(class354.getZ()));
    }
    
    public static Class353 method1090(final ChunkPos class7859, final int n) {
        return new Class353(class7859.field32290, n, class7859.field32291);
    }
    
    public static Class353 method1091(final Entity class399) {
        return new Class353(method1095(MathHelper.floor(class399.getPosX())), method1095(MathHelper.floor(class399.getPosY())), method1095(MathHelper.floor(class399.getPosZ())));
    }
    
    public static Class353 method1092(final long n) {
        return new Class353(method1099(n), method1100(n), method1101(n));
    }
    
    public static long method1093(final long n, final Direction class179) {
        return method1094(n, class179.getXOffset(), class179.getYOffset(), class179.getZOffset());
    }
    
    public static long method1094(final long n, final int n2, final int n3, final int n4) {
        return method1116(method1099(n) + n2, method1100(n) + n3, method1101(n) + n4);
    }
    
    public static int method1095(final int n) {
        return n >> 4;
    }
    
    public static int method1096(final int n) {
        return n & 0xF;
    }
    
    public static short method1097(final BlockPos class354) {
        return (short)(method1096(class354.getX()) << 8 | method1096(class354.getZ()) << 4 | method1096(class354.getY()));
    }
    
    public static int method1098(final int n) {
        return n << 4;
    }
    
    public static int method1099(final long n) {
        return (int)(n << 0 >> 42);
    }
    
    public static int method1100(final long n) {
        return (int)(n << 44 >> 44);
    }
    
    public static int method1101(final long n) {
        return (int)(n << 22 >> 42);
    }
    
    public int method1102() {
        return this.getX();
    }
    
    public int method1103() {
        return this.getY();
    }
    
    public int method1104() {
        return this.getZ();
    }
    
    public int method1105() {
        return this.method1102() << 4;
    }
    
    public int method1106() {
        return this.method1103() << 4;
    }
    
    public int method1107() {
        return this.method1104() << 4;
    }
    
    public int method1108() {
        return (this.method1102() << 4) + 15;
    }
    
    public int method1109() {
        return (this.method1103() << 4) + 15;
    }
    
    public int method1110() {
        return (this.method1104() << 4) + 15;
    }
    
    public static long method1111(final long n) {
        return method1116(method1095(BlockPos.unpackX(n)), method1095(BlockPos.unpackY(n)), method1095(BlockPos.unpackZ(n)));
    }
    
    public static long method1112(final long n) {
        return n & 0xFFFFFFFFFFF00000L;
    }
    
    public BlockPos method1113() {
        return new BlockPos(method1098(this.method1102()), method1098(this.method1103()), method1098(this.method1104()));
    }
    
    public BlockPos method1114() {
        return this.method1113().add(8, 8, 8);
    }
    
    public ChunkPos method1115() {
        return new ChunkPos(this.method1102(), this.method1104());
    }
    
    public static long method1116(final int n, final int n2, final int n3) {
        return 0x0L | ((long)n & 0x3FFFFFL) << 42 | ((long)n2 & 0xFFFFFL) << 0 | ((long)n3 & 0x3FFFFFL) << 20;
    }
    
    public long method1117() {
        return method1116(this.method1102(), this.method1103(), this.method1104());
    }
    
    public Stream<BlockPos> method1118() {
        return BlockPos.getAllInBox(this.method1105(), this.method1106(), this.method1107(), this.method1108(), this.method1109(), this.method1110());
    }
    
    public static Stream<Class353> method1119(final Class353 class353, final int n) {
        final int method1102 = class353.method1102();
        final int method1103 = class353.method1103();
        final int method1104 = class353.method1104();
        return method1121(method1102 - n, method1103 - n, method1104 - n, method1102 + n, method1103 + n, method1104 + n);
    }
    
    public static Stream<Class353> method1120(final ChunkPos class7859, final int n) {
        final int field32290 = class7859.field32290;
        final int field32291 = class7859.field32291;
        return method1121(field32290 - n, 0, field32291 - n, field32290 + n, 15, field32291 + n);
    }
    
    public static Stream<Class353> method1121(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return StreamSupport.stream((Spliterator<Class353>)new Class7581((long) (n4 - n + 1) * (n5 - n2 + 1) * (n6 - n3 + 1), 64, n, n2, n3, n4, n5, n6), false);
    }
}
