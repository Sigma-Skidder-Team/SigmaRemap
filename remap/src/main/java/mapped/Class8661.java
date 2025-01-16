// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;

public class Class8661 extends WorldInfo
{
    private final WorldInfo field36390;
    
    public Class8661(final WorldInfo field36390) {
        this.field36390 = field36390;
    }
    
    @Override
    public CompoundNBT method29532(final CompoundNBT class51) {
        return this.field36390.method29532(class51);
    }
    
    @Override
    public long getSeed() {
        return this.field36390.getSeed();
    }
    
    @Override
    public int method29536() {
        return this.field36390.method29536();
    }
    
    @Override
    public int method29537() {
        return this.field36390.method29537();
    }
    
    @Override
    public int method29538() {
        return this.field36390.method29538();
    }
    
    @Override
    public long method29539() {
        return this.field36390.method29539();
    }
    
    @Override
    public long method29540() {
        return this.field36390.method29540();
    }
    
    @Override
    public CompoundNBT method29542() {
        return this.field36390.method29542();
    }
    
    @Override
    public String method29549() {
        return this.field36390.method29549();
    }
    
    @Override
    public int method29551() {
        return this.field36390.method29551();
    }
    
    @Override
    public long method29553() {
        return this.field36390.method29553();
    }
    
    @Override
    public boolean method29556() {
        return this.field36390.method29556();
    }
    
    @Override
    public int method29558() {
        return this.field36390.method29558();
    }
    
    @Override
    public boolean method29560() {
        return this.field36390.method29560();
    }
    
    @Override
    public int method29562() {
        return this.field36390.method29562();
    }
    
    @Override
    public Class101 method29564() {
        return this.field36390.method29564();
    }
    
    @Override
    public void method29543(final int n) {
    }
    
    @Override
    public void method29544(final int n) {
    }
    
    @Override
    public void method29545(final int n) {
    }
    
    @Override
    public void method29546(final long n) {
    }
    
    @Override
    public void method29547(final long n) {
    }
    
    @Override
    public void method29548(final BlockPos class354) {
    }
    
    @Override
    public void method29550(final String s) {
    }
    
    @Override
    public void method29552(final int n) {
    }
    
    @Override
    public void method29557(final boolean b) {
    }
    
    @Override
    public void method29559(final int n) {
    }
    
    @Override
    public void method29561(final boolean b) {
    }
    
    @Override
    public void method29563(final int n) {
    }
    
    @Override
    public boolean method29565() {
        return this.field36390.method29565();
    }
    
    @Override
    public boolean method29568() {
        return this.field36390.method29568();
    }
    
    @Override
    public Class9505 method29570() {
        return this.field36390.method29570();
    }
    
    @Override
    public void method29571(final Class9505 class9505) {
    }
    
    @Override
    public boolean method29574() {
        return this.field36390.method29574();
    }
    
    @Override
    public void method29575(final boolean b) {
    }
    
    @Override
    public boolean method29576() {
        return this.field36390.method29576();
    }
    
    @Override
    public void method29577(final boolean b) {
    }
    
    @Override
    public Class8878 method29578() {
        return this.field36390.method29578();
    }
    
    @Override
    public Class2113 method29597() {
        return this.field36390.method29597();
    }
    
    @Override
    public void method29598(final Class2113 class2113) {
    }
    
    @Override
    public boolean method29599() {
        return this.field36390.method29599();
    }
    
    @Override
    public void method29600(final boolean b) {
    }
    
    @Override
    public Class7858<MinecraftServer> method29601() {
        return this.field36390.method29601();
    }
    
    @Override
    public void method29604(final DimensionType class383, final CompoundNBT class384) {
        this.field36390.method29604(class383, class384);
    }
    
    @Override
    public CompoundNBT method29603(final DimensionType class383) {
        return this.field36390.method29603(class383);
    }
    
    @Override
    public void method29602(final CrashReportCategory class5204) {
        class5204.addDetail("Derived", true);
        this.field36390.method29602(class5204);
    }
}
