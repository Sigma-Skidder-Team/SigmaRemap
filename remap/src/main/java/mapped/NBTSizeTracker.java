// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class NBTSizeTracker
{
    public static final NBTSizeTracker INFINITE = new NBTSizeTracker(0L)
    {
        public void read(long bits)
        {
        }
    };
    private final long max;
    private long read;
    
    public NBTSizeTracker(final long field29957) {
        this.max = field29957;
    }

    public void read(long bits)
    {
        this.read += bits / 8L;

        if (this.read > this.max)
        {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.read + "bytes where max allowed: " + this.max);
        }
    }
}
