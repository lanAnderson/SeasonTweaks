package club.iananderson.seasontweaks.mixin;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sereneseasons.config.BiomeConfig;

@Mixin(BiomeConfig.class)
public class tropicalBiomes {

    @Inject(
            at = @At("HEAD"),
            method = "usesTropicalSeasons(Lnet/minecraft/core/Holder;)Z",
            cancellable = true,
            remap = false
    )

    private static void usesTropicalSeasons(Holder<Biome> biome, CallbackInfoReturnable<Boolean> callback){
        callback.setReturnValue(false);
    }


}
