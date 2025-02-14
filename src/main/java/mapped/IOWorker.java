package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Unit;
import net.minecraft.util.Util;
import net.minecraft.util.math.ChunkPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

public class IOWorker implements AutoCloseable {
    private static final Logger LOGGER = LogManager.getLogger();
    private final AtomicBoolean field_227082_c_ = new AtomicBoolean();
    private final DelegatedTaskExecutor<RunnableWithPriority> field_235969_c_;
    private final RegionFileCache field_227084_e_;
    private final Map<ChunkPos, Entry> field_227085_f_ = Maps.newLinkedHashMap();

    public IOWorker(File var1, boolean var2, String var3) {
        this.field_227084_e_ = new RegionFileCache(var1, var2);
        this.field_235969_c_ = new DelegatedTaskExecutor<>(new mapped.Priority(Priority.values().length), Util.getRenderingService(), "IOWorker-" + var3);
    }

    public CompletableFuture<Void> func_227093_a_(ChunkPos p_227093_1_, CompoundNBT p_227093_2_) {
        return this.func_235975_a_(() ->
        {
            IOWorker.Entry ioworker$entry = this.field_227085_f_.computeIfAbsent(p_227093_1_, (p_235977_1_) -> {
                return new IOWorker.Entry(p_227093_2_);
            });
            ioworker$entry.field_227113_a_ = p_227093_2_;
            return Either.left(ioworker$entry.field_227114_b_);
        }).thenCompose(Function.identity());
    }

    @Nullable
    public CompoundNBT func_227090_a_(ChunkPos p_227090_1_) throws IOException {
        CompletableFuture<CompoundNBT> completablefuture = this.func_235975_a_(() ->
        {
            IOWorker.Entry ioworker$entry = this.field_227085_f_.get(p_227090_1_);

            if (ioworker$entry != null) {
                return Either.left(ioworker$entry.field_227113_a_);
            } else {
                try {
                    CompoundNBT compoundnbt = this.field_227084_e_.readChunk(p_227090_1_);
                    return Either.left(compoundnbt);
                } catch (Exception exception) {
                    LOGGER.warn("Failed to read chunk {}", p_227090_1_, exception);
                    return Either.right(exception);
                }
            }
        });

        try {
            return completablefuture.join();
        } catch (CompletionException completionexception) {
            if (completionexception.getCause() instanceof IOException) {
                throw (IOException) completionexception.getCause();
            } else {
                throw completionexception;
            }
        }
    }

    public CompletableFuture<Void> func_227088_a_() {
        CompletableFuture<Void> completablefuture = this.func_235975_a_(() ->
        {
            return Either.left(CompletableFuture.allOf(this.field_227085_f_.values().stream().map((p_235973_0_) -> {
                return p_235973_0_.field_227114_b_;
            }).toArray((p_235970_0_) -> {
                return new CompletableFuture[p_235970_0_];
            })));
        }).thenCompose(Function.identity());
        return completablefuture.thenCompose((p_235974_1_) ->
        {
            return this.func_235975_a_(() -> {
                try {
                    this.field_227084_e_.func_235987_a_();
                    return Either.left((Void) null);
                } catch (Exception exception) {
                    LOGGER.warn("Failed to synchronized chunks", (Throwable) exception);
                    return Either.right(exception);
                }
            });
        });
    }

    private <T> CompletableFuture<T> func_235975_a_(Supplier<Either<T, Exception>> p_235975_1_) {
        return this.field_235969_c_.func_233528_c_((p_235976_2_) ->
        {
            return new RunnableWithPriority(IOWorker.Priority.HIGH.ordinal(), () -> {
                if (!this.field_227082_c_.get()) {
                    p_235976_2_.enqueue(p_235975_1_.get());
                }

                this.func_235982_c_();
            });
        });
    }

    private void func_235978_b_() {
        Iterator<Map.Entry<ChunkPos, IOWorker.Entry>> iterator = this.field_227085_f_.entrySet().iterator();

        if (iterator.hasNext()) {
            Map.Entry<ChunkPos, IOWorker.Entry> entry = iterator.next();
            iterator.remove();
            this.func_227091_a_(entry.getKey(), entry.getValue());
            this.func_235982_c_();
        }
    }

    private void func_235982_c_() {
        this.field_235969_c_.enqueue(new RunnableWithPriority(Priority.LOW.ordinal(), this::func_235978_b_));
    }

    private void func_227091_a_(ChunkPos p_227091_1_, IOWorker.Entry p_227091_2_) {
        try {
            this.field_227084_e_.writeChunk(p_227091_1_, p_227091_2_.field_227113_a_);
            p_227091_2_.field_227114_b_.complete((Void) null);
        } catch (Exception exception) {
            LOGGER.error("Failed to store chunk {}", p_227091_1_, exception);
            p_227091_2_.field_227114_b_.completeExceptionally(exception);
        }
    }

    public void close() throws IOException {
        if (this.field_227082_c_.compareAndSet(false, true)) {
            CompletableFuture<Unit> completablefuture = this.field_235969_c_.func_213141_a((p_235971_0_) ->
            {
                return new RunnableWithPriority(IOWorker.Priority.HIGH.ordinal(), () -> {
                    p_235971_0_.enqueue(Unit.INSTANCE);
                });
            });

            try {
                completablefuture.join();
            } catch (CompletionException completionexception) {
                if (completionexception.getCause() instanceof IOException) {
                    throw (IOException) completionexception.getCause();
                }

                throw completionexception;
            }

            this.field_235969_c_.close();
            this.field_227085_f_.forEach(this::func_227091_a_);
            this.field_227085_f_.clear();

            try {
                this.field_227084_e_.close();
            } catch (Exception exception) {
                LOGGER.error("Failed to close storage", (Throwable) exception);
            }
        }
    }

    public static class Entry {
        public CompoundNBT field_227113_a_;
        private final CompletableFuture<Void> field_227114_b_ = new CompletableFuture<Void>();

        public Entry(CompoundNBT var1) {
            this.field_227113_a_ = var1;
        }
    }

    public enum Priority {
        HIGH,
        LOW;
    }
}
