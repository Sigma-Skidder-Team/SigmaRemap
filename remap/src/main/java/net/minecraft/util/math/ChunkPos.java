// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import mapped.Class7584;

import java.util.Spliterator;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;

public class ChunkPos
{
    public static final long field32289;
    public int field32290;
    public int field32291;
    private int field32292;
    
    public ChunkPos(final int field32290, final int field32291) {
        this.field32292 = 0;
        this.field32290 = field32290;
        this.field32291 = field32291;
    }
    
    public ChunkPos(final BlockPos class354) {
        this.field32292 = 0;
        this.field32290 = class354.getX() >> 4;
        this.field32291 = class354.getZ() >> 4;
    }
    
    public ChunkPos(final long n) {
        this.field32292 = 0;
        this.field32290 = (int)n;
        this.field32291 = (int)(n >> 32);
    }
    
    public long method25422() {
        return method25423(this.field32290, this.field32291);
    }
    
    public static long method25423(final int n, final int n2) {
        return ((long)n & 0xFFFFFFFFL) | ((long)n2 & 0xFFFFFFFFL) << 32;
    }
    
    public static int method25424(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
    
    public static int method25425(final long n) {
        return (int)(n >>> 32 & 0xFFFFFFFFL);
    }
    
    @Override
    public int hashCode() {
        if (this.field32292 == 0) {
            return this.field32292 = (1664525 * this.field32290 + 1013904223 ^ 1664525 * (this.field32291 ^ 0xDEADBEEF) + 1013904223);
        }
        return this.field32292;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ChunkPos) {
            final ChunkPos class7859 = (ChunkPos)o;
            return this.field32290 == class7859.field32290 && this.field32291 == class7859.field32291;
        }
        return false;
    }
    
    public int method25426() {
        return this.field32290 << 4;
    }
    
    public int method25427() {
        return this.field32291 << 4;
    }
    
    public int method25428() {
        return (this.field32290 << 4) + 15;
    }
    
    public int method25429() {
        return (this.field32291 << 4) + 15;
    }
    
    public int method25430() {
        return this.field32290 >> 5;
    }
    
    public int method25431() {
        return this.field32291 >> 5;
    }
    
    public int method25432() {
        return this.field32290 & 0x1F;
    }
    
    public int method25433() {
        return this.field32291 & 0x1F;
    }
    
    public BlockPos method25434(final int n, final int n2, final int n3) {
        return new BlockPos((this.field32290 << 4) + n, n2, (this.field32291 << 4) + n3);
    }
    
    @Override
    public String toString() {
        return "[" + this.field32290 + ", " + this.field32291 + "]";
    }
    
    public BlockPos method25435() {
        return new BlockPos(this.field32290 << 4, 0, this.field32291 << 4);
    }
    
    public int method25436(final ChunkPos class7859) {
        return Math.max(Math.abs(this.field32290 - class7859.field32290), Math.abs(this.field32291 - class7859.field32291));
    }
    
    public static Stream<ChunkPos> method25437(final ChunkPos class7859, final int n) {
        return method25438(new ChunkPos(class7859.field32290 - n, class7859.field32291 - n), new ChunkPos(class7859.field32290 + n, class7859.field32291 + n));
    }
    
    public static Stream<ChunkPos> method25438(final ChunkPos class7859, final ChunkPos class7860) {
        return StreamSupport.stream((Spliterator<ChunkPos>)new Class7584((long) (Math.abs(class7859.field32290 - class7860.field32290) + 1) * (Math.abs(class7859.field32291 - class7860.field32291) + 1), 64, class7859, class7860, (class7859.field32291 >= class7860.field32291) ? -1 : 1, (class7859.field32290 >= class7860.field32290) ? -1 : 1), false);
    }
    
    static {
        field32289 = method25423(1875016, 1875016);
    }
}
